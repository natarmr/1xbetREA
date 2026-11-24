.class public final La/v0f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/q4f;

.field public final c:Ljava/lang/String;

.field public final d:D

.field public final e:D

.field public final f:La/ozc;

.field public final g:D

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/List;

.field public final j:D

.field public final k:Z

.field public final l:D

.field public final m:La/oln;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/q4f;Ljava/lang/String;DDLa/ozc;DLjava/lang/String;Ljava/util/List;DZDLa/oln;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/v0f;->a:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, La/v0f;->b:La/q4f;

    .line 16
    .line 17
    iput-object p3, p0, La/v0f;->c:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p4, p0, La/v0f;->d:D

    .line 20
    .line 21
    iput-wide p6, p0, La/v0f;->e:D

    .line 22
    .line 23
    iput-object p8, p0, La/v0f;->f:La/ozc;

    .line 24
    .line 25
    iput-wide p9, p0, La/v0f;->g:D

    .line 26
    .line 27
    iput-object p11, p0, La/v0f;->h:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p12, p0, La/v0f;->i:Ljava/util/List;

    .line 30
    .line 31
    iput-wide p13, p0, La/v0f;->j:D

    .line 32
    .line 33
    iput-boolean p15, p0, La/v0f;->k:Z

    .line 34
    .line 35
    move-wide/from16 p1, p16

    .line 36
    .line 37
    iput-wide p1, p0, La/v0f;->l:D

    .line 38
    .line 39
    move-object/from16 p1, p18

    .line 40
    .line 41
    iput-object p1, p0, La/v0f;->m:La/oln;

    .line 42
    .line 43
    return-void
.end method

.method public static a(La/v0f;La/q4f;DLa/ozc;DLjava/lang/String;Ljava/util/ArrayList;DZDLa/oln;I)La/v0f;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p15

    .line 4
    .line 5
    iget-object v2, v0, La/v0f;->a:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, La/v0f;->b:La/q4f;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    iget-object v4, v0, La/v0f;->c:Ljava/lang/String;

    .line 17
    .line 18
    move-object v6, v2

    .line 19
    move-object v2, v3

    .line 20
    move-object v3, v4

    .line 21
    iget-wide v4, v0, La/v0f;->d:D

    .line 22
    .line 23
    and-int/lit8 v7, v1, 0x10

    .line 24
    .line 25
    if-eqz v7, :cond_1

    .line 26
    .line 27
    iget-wide v7, v0, La/v0f;->e:D

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-wide/from16 v7, p2

    .line 31
    .line 32
    :goto_1
    and-int/lit8 v9, v1, 0x20

    .line 33
    .line 34
    if-eqz v9, :cond_2

    .line 35
    .line 36
    iget-object v9, v0, La/v0f;->f:La/ozc;

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move-object/from16 v9, p4

    .line 40
    .line 41
    :goto_2
    and-int/lit8 v10, v1, 0x40

    .line 42
    .line 43
    if-eqz v10, :cond_3

    .line 44
    .line 45
    iget-wide v10, v0, La/v0f;->g:D

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move-wide/from16 v10, p5

    .line 49
    .line 50
    :goto_3
    and-int/lit16 v12, v1, 0x80

    .line 51
    .line 52
    if-eqz v12, :cond_4

    .line 53
    .line 54
    iget-object v12, v0, La/v0f;->h:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_4
    move-object/from16 v12, p7

    .line 58
    .line 59
    :goto_4
    and-int/lit16 v13, v1, 0x100

    .line 60
    .line 61
    if-eqz v13, :cond_5

    .line 62
    .line 63
    iget-object v13, v0, La/v0f;->i:Ljava/util/List;

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_5
    move-object/from16 v13, p8

    .line 67
    .line 68
    :goto_5
    and-int/lit16 v14, v1, 0x200

    .line 69
    .line 70
    if-eqz v14, :cond_6

    .line 71
    .line 72
    iget-wide v14, v0, La/v0f;->j:D

    .line 73
    .line 74
    goto :goto_6

    .line 75
    :cond_6
    move-wide/from16 v14, p9

    .line 76
    .line 77
    :goto_6
    move-object/from16 p1, v2

    .line 78
    .line 79
    and-int/lit16 v2, v1, 0x400

    .line 80
    .line 81
    if-eqz v2, :cond_7

    .line 82
    .line 83
    iget-boolean v2, v0, La/v0f;->k:Z

    .line 84
    .line 85
    goto :goto_7

    .line 86
    :cond_7
    move/from16 v2, p11

    .line 87
    .line 88
    :goto_7
    move/from16 p2, v2

    .line 89
    .line 90
    and-int/lit16 v2, v1, 0x800

    .line 91
    .line 92
    move-object/from16 v16, v3

    .line 93
    .line 94
    if-eqz v2, :cond_8

    .line 95
    .line 96
    iget-wide v2, v0, La/v0f;->l:D

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_8
    move-wide/from16 v2, p12

    .line 100
    .line 101
    :goto_8
    and-int/lit16 v1, v1, 0x1000

    .line 102
    .line 103
    if-eqz v1, :cond_9

    .line 104
    .line 105
    iget-object v1, v0, La/v0f;->m:La/oln;

    .line 106
    .line 107
    move-object/from16 v18, v1

    .line 108
    .line 109
    goto :goto_9

    .line 110
    :cond_9
    move-object/from16 v18, p14

    .line 111
    .line 112
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v0, La/v0f;

    .line 128
    .line 129
    move-wide/from16 v19, v2

    .line 130
    .line 131
    move-object/from16 v3, v16

    .line 132
    .line 133
    move-wide/from16 v16, v19

    .line 134
    .line 135
    move-object/from16 v2, p1

    .line 136
    .line 137
    move-object v1, v6

    .line 138
    move-wide v6, v7

    .line 139
    move-object v8, v9

    .line 140
    move-wide v9, v10

    .line 141
    move-object v11, v12

    .line 142
    move-object v12, v13

    .line 143
    move-wide v13, v14

    .line 144
    move/from16 v15, p2

    .line 145
    .line 146
    invoke-direct/range {v0 .. v18}, La/v0f;-><init>(Ljava/lang/String;La/q4f;Ljava/lang/String;DDLa/ozc;DLjava/lang/String;Ljava/util/List;DZDLa/oln;)V

    .line 147
    .line 148
    .line 149
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
    instance-of v0, p1, La/v0f;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/v0f;

    .line 12
    .line 13
    iget-object v0, p0, La/v0f;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/v0f;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/v0f;->b:La/q4f;

    .line 26
    .line 27
    iget-object v1, p1, La/v0f;->b:La/q4f;

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/v0f;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/v0f;->c:Ljava/lang/String;

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
    iget-wide v0, p0, La/v0f;->d:D

    .line 46
    .line 47
    iget-wide v2, p1, La/v0f;->d:D

    .line 48
    .line 49
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    iget-wide v0, p0, La/v0f;->e:D

    .line 57
    .line 58
    iget-wide v2, p1, La/v0f;->e:D

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_6
    iget-object v0, p0, La/v0f;->f:La/ozc;

    .line 68
    .line 69
    iget-object v1, p1, La/v0f;->f:La/ozc;

    .line 70
    .line 71
    if-eq v0, v1, :cond_7

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_7
    iget-wide v0, p0, La/v0f;->g:D

    .line 75
    .line 76
    iget-wide v2, p1, La/v0f;->g:D

    .line 77
    .line 78
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_8

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_8
    iget-object v0, p0, La/v0f;->h:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v1, p1, La/v0f;->h:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_9

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_9
    iget-object v0, p0, La/v0f;->i:Ljava/util/List;

    .line 97
    .line 98
    iget-object v1, p1, La/v0f;->i:Ljava/util/List;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_a

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_a
    iget-wide v0, p0, La/v0f;->j:D

    .line 108
    .line 109
    iget-wide v2, p1, La/v0f;->j:D

    .line 110
    .line 111
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_b

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_b
    iget-boolean v0, p0, La/v0f;->k:Z

    .line 119
    .line 120
    iget-boolean v1, p1, La/v0f;->k:Z

    .line 121
    .line 122
    if-eq v0, v1, :cond_c

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_c
    iget-wide v0, p0, La/v0f;->l:D

    .line 126
    .line 127
    iget-wide v2, p1, La/v0f;->l:D

    .line 128
    .line 129
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_d

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_d
    iget-object p0, p0, La/v0f;->m:La/oln;

    .line 137
    .line 138
    iget-object p1, p1, La/v0f;->m:La/oln;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_e

    .line 145
    .line 146
    :goto_0
    const/4 p0, 0x0

    .line 147
    return p0

    .line 148
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 149
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/v0f;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/v0f;->b:La/q4f;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/vqd;->b(La/q4f;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/v0f;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/v0f;->d:D

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, La/v0f;->e:D

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/v0f;->f:La/ozc;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-wide v3, p0, La/v0f;->g:D

    .line 43
    .line 44
    invoke-static {v3, v4, v2, v1}, La/brm0;->d(DII)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/v0f;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, La/v0f;->i:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-wide v2, p0, La/v0f;->j:D

    .line 61
    .line 62
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, La/v0f;->k:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-wide v2, p0, La/v0f;->l:D

    .line 73
    .line 74
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object p0, p0, La/v0f;->m:La/oln;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v0

    .line 85
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CouponParamsModel(betId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/v0f;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", couponType="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/v0f;->b:La/q4f;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", currencySymbol="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", initialBetSum="

    .line 29
    .line 30
    iget-object v2, p0, La/v0f;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-wide v3, p0, La/v0f;->d:D

    .line 33
    .line 34
    invoke-static {v0, v2, v1, v3, v4}, La/hne;->A(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;D)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", actualBetSum="

    .line 38
    .line 39
    const-string v2, ", coefType="

    .line 40
    .line 41
    iget-wide v3, p0, La/v0f;->e:D

    .line 42
    .line 43
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/v0f;->f:La/ozc;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", antiExpressCoef="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-wide v1, p0, La/v0f;->g:D

    .line 57
    .line 58
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", updateCouponExceptionText="

    .line 62
    .line 63
    const-string v2, ", availableCouponTypesList="

    .line 64
    .line 65
    iget-object v3, p0, La/v0f;->h:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v4, p0, La/v0f;->i:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v1, v3, v2, v0, v4}, La/ua80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    const-string v1, ", possibleWinCoef="

    .line 73
    .line 74
    const-string v2, ", isEachWayBet="

    .line 75
    .line 76
    iget-wide v3, p0, La/v0f;->j:D

    .line 77
    .line 78
    invoke-static {v0, v3, v4, v1, v2}, La/ohs0;->A(Ljava/lang/StringBuilder;DLjava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-boolean v1, p0, La/v0f;->k:Z

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", winSum="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-wide v1, p0, La/v0f;->l:D

    .line 92
    .line 93
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", coefficientState="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, La/v0f;->m:La/oln;

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p0, ")"

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method
