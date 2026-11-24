.class public final La/p650;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mi0;

.field public final b:La/h650;

.field public final c:La/zf1;

.field public final d:La/ot0;

.field public final e:La/kg;

.field public final f:I

.field public final g:La/ql5;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/Set;

.field public final j:Z

.field public final k:Z

.field public final l:Z

.field public final m:Z

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:La/q250;


# direct methods
.method public constructor <init>(La/mi0;La/h650;La/zf1;La/ot0;La/kg;ILa/ql5;Ljava/util/List;Ljava/util/Set;ZZZZZZZLa/q250;)V
    .locals 0

    .line 1
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/p650;->a:La/mi0;

    .line 8
    .line 9
    iput-object p2, p0, La/p650;->b:La/h650;

    .line 10
    .line 11
    iput-object p3, p0, La/p650;->c:La/zf1;

    .line 12
    .line 13
    iput-object p4, p0, La/p650;->d:La/ot0;

    .line 14
    .line 15
    iput-object p5, p0, La/p650;->e:La/kg;

    .line 16
    .line 17
    iput p6, p0, La/p650;->f:I

    .line 18
    .line 19
    iput-object p7, p0, La/p650;->g:La/ql5;

    .line 20
    .line 21
    iput-object p8, p0, La/p650;->h:Ljava/util/List;

    .line 22
    .line 23
    iput-object p9, p0, La/p650;->i:Ljava/util/Set;

    .line 24
    .line 25
    iput-boolean p10, p0, La/p650;->j:Z

    .line 26
    .line 27
    iput-boolean p11, p0, La/p650;->k:Z

    .line 28
    .line 29
    iput-boolean p12, p0, La/p650;->l:Z

    .line 30
    .line 31
    iput-boolean p13, p0, La/p650;->m:Z

    .line 32
    .line 33
    iput-boolean p14, p0, La/p650;->n:Z

    .line 34
    .line 35
    iput-boolean p15, p0, La/p650;->o:Z

    .line 36
    .line 37
    move/from16 p1, p16

    .line 38
    .line 39
    iput-boolean p1, p0, La/p650;->p:Z

    .line 40
    .line 41
    move-object/from16 p1, p17

    .line 42
    .line 43
    iput-object p1, p0, La/p650;->q:La/q250;

    .line 44
    .line 45
    return-void
.end method

.method public static a(La/p650;La/ql5;Ljava/util/ArrayList;Ljava/util/Set;ZI)La/p650;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p5

    .line 4
    .line 5
    iget-object v2, v0, La/p650;->a:La/mi0;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    iget-object v2, v0, La/p650;->b:La/h650;

    .line 9
    .line 10
    move-object v4, v3

    .line 11
    iget-object v3, v0, La/p650;->c:La/zf1;

    .line 12
    .line 13
    move-object v5, v4

    .line 14
    iget-object v4, v0, La/p650;->d:La/ot0;

    .line 15
    .line 16
    move-object v6, v5

    .line 17
    iget-object v5, v0, La/p650;->e:La/kg;

    .line 18
    .line 19
    move-object v7, v6

    .line 20
    iget v6, v0, La/p650;->f:I

    .line 21
    .line 22
    and-int/lit8 v8, v1, 0x40

    .line 23
    .line 24
    if-eqz v8, :cond_0

    .line 25
    .line 26
    iget-object v8, v0, La/p650;->g:La/ql5;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move-object/from16 v8, p1

    .line 30
    .line 31
    :goto_0
    and-int/lit16 v9, v1, 0x80

    .line 32
    .line 33
    if-eqz v9, :cond_1

    .line 34
    .line 35
    iget-object v9, v0, La/p650;->h:Ljava/util/List;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object/from16 v9, p2

    .line 39
    .line 40
    :goto_1
    and-int/lit16 v10, v1, 0x100

    .line 41
    .line 42
    if-eqz v10, :cond_2

    .line 43
    .line 44
    iget-object v10, v0, La/p650;->i:Ljava/util/Set;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move-object/from16 v10, p3

    .line 48
    .line 49
    :goto_2
    iget-boolean v11, v0, La/p650;->j:Z

    .line 50
    .line 51
    move-object v12, v7

    .line 52
    move-object v7, v8

    .line 53
    move-object v8, v9

    .line 54
    move-object v9, v10

    .line 55
    move v10, v11

    .line 56
    iget-boolean v11, v0, La/p650;->k:Z

    .line 57
    .line 58
    move-object v13, v12

    .line 59
    iget-boolean v12, v0, La/p650;->l:Z

    .line 60
    .line 61
    move-object v14, v13

    .line 62
    iget-boolean v13, v0, La/p650;->m:Z

    .line 63
    .line 64
    and-int/lit16 v15, v1, 0x2000

    .line 65
    .line 66
    if-eqz v15, :cond_3

    .line 67
    .line 68
    iget-boolean v15, v0, La/p650;->n:Z

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    move/from16 v15, p4

    .line 72
    .line 73
    :goto_3
    iget-boolean v1, v0, La/p650;->o:Z

    .line 74
    .line 75
    move/from16 v16, v1

    .line 76
    .line 77
    iget-boolean v1, v0, La/p650;->p:Z

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    const/high16 v17, 0x20000

    .line 83
    .line 84
    and-int v17, p5, v17

    .line 85
    .line 86
    if-eqz v17, :cond_4

    .line 87
    .line 88
    move/from16 v17, v1

    .line 89
    .line 90
    iget-object v1, v0, La/p650;->q:La/q250;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    move/from16 v17, v1

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v0, La/p650;

    .line 103
    .line 104
    move/from16 v18, v17

    .line 105
    .line 106
    move-object/from16 v17, v1

    .line 107
    .line 108
    move-object v1, v14

    .line 109
    move v14, v15

    .line 110
    move/from16 v15, v16

    .line 111
    .line 112
    move/from16 v16, v18

    .line 113
    .line 114
    invoke-direct/range {v0 .. v17}, La/p650;-><init>(La/mi0;La/h650;La/zf1;La/ot0;La/kg;ILa/ql5;Ljava/util/List;Ljava/util/Set;ZZZZZZZLa/q250;)V

    .line 115
    .line 116
    .line 117
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/p650;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/p650;

    .line 12
    .line 13
    iget-object v0, p0, La/p650;->a:La/mi0;

    .line 14
    .line 15
    iget-object v1, p1, La/p650;->a:La/mi0;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/p650;->b:La/h650;

    .line 22
    .line 23
    iget-object v1, p1, La/p650;->b:La/h650;

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-object v0, p0, La/p650;->c:La/zf1;

    .line 30
    .line 31
    iget-object v1, p1, La/p650;->c:La/zf1;

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_4
    iget-object v0, p0, La/p650;->d:La/ot0;

    .line 38
    .line 39
    iget-object v1, p1, La/p650;->d:La/ot0;

    .line 40
    .line 41
    if-eq v0, v1, :cond_5

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_5
    iget-object v0, p0, La/p650;->e:La/kg;

    .line 46
    .line 47
    iget-object v1, p1, La/p650;->e:La/kg;

    .line 48
    .line 49
    if-eq v0, v1, :cond_6

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_6
    iget v0, p0, La/p650;->f:I

    .line 54
    .line 55
    iget v1, p1, La/p650;->f:I

    .line 56
    .line 57
    if-eq v0, v1, :cond_7

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_7
    iget-object v0, p0, La/p650;->g:La/ql5;

    .line 61
    .line 62
    iget-object v1, p1, La/p650;->g:La/ql5;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_8

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_8
    iget-object v0, p0, La/p650;->h:Ljava/util/List;

    .line 72
    .line 73
    iget-object v1, p1, La/p650;->h:Ljava/util/List;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_9

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_9
    iget-object v0, p0, La/p650;->i:Ljava/util/Set;

    .line 83
    .line 84
    iget-object v1, p1, La/p650;->i:Ljava/util/Set;

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-boolean v0, p0, La/p650;->j:Z

    .line 94
    .line 95
    iget-boolean v1, p1, La/p650;->j:Z

    .line 96
    .line 97
    if-eq v0, v1, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget-boolean v0, p0, La/p650;->k:Z

    .line 101
    .line 102
    iget-boolean v1, p1, La/p650;->k:Z

    .line 103
    .line 104
    if-eq v0, v1, :cond_c

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_c
    iget-boolean v0, p0, La/p650;->l:Z

    .line 108
    .line 109
    iget-boolean v1, p1, La/p650;->l:Z

    .line 110
    .line 111
    if-eq v0, v1, :cond_d

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_d
    iget-boolean v0, p0, La/p650;->m:Z

    .line 115
    .line 116
    iget-boolean v1, p1, La/p650;->m:Z

    .line 117
    .line 118
    if-eq v0, v1, :cond_e

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_e
    iget-boolean v0, p0, La/p650;->n:Z

    .line 122
    .line 123
    iget-boolean v1, p1, La/p650;->n:Z

    .line 124
    .line 125
    if-eq v0, v1, :cond_f

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_f
    iget-boolean v0, p0, La/p650;->o:Z

    .line 129
    .line 130
    iget-boolean v1, p1, La/p650;->o:Z

    .line 131
    .line 132
    if-eq v0, v1, :cond_10

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_10
    iget-boolean v0, p0, La/p650;->p:Z

    .line 136
    .line 137
    iget-boolean v1, p1, La/p650;->p:Z

    .line 138
    .line 139
    if-eq v0, v1, :cond_11

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_11
    iget-object p0, p0, La/p650;->q:La/q250;

    .line 143
    .line 144
    iget-object p1, p1, La/p650;->q:La/q250;

    .line 145
    .line 146
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_12

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x0

    .line 153
    return p0

    .line 154
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 155
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/p650;->a:La/mi0;

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
    iget-object v2, p0, La/p650;->b:La/h650;

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
    iget-object v0, p0, La/p650;->c:La/zf1;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La/p650;->d:La/ot0;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, La/p650;->e:La/kg;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget v2, p0, La/p650;->f:I

    .line 43
    .line 44
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v2, 0x0

    .line 49
    iget-object v3, p0, La/p650;->g:La/ql5;

    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v3}, La/ql5;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    :goto_0
    add-int/2addr v0, v3

    .line 60
    mul-int/2addr v0, v1

    .line 61
    iget-object v3, p0, La/p650;->h:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v0, v1, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-object v3, p0, La/p650;->i:Ljava/util/Set;

    .line 68
    .line 69
    invoke-static {v3, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-boolean v3, p0, La/p650;->j:Z

    .line 74
    .line 75
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-boolean v3, p0, La/p650;->k:Z

    .line 80
    .line 81
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-boolean v3, p0, La/p650;->l:Z

    .line 86
    .line 87
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-boolean v3, p0, La/p650;->m:Z

    .line 92
    .line 93
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-boolean v3, p0, La/p650;->n:Z

    .line 98
    .line 99
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-boolean v3, p0, La/p650;->o:Z

    .line 104
    .line 105
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-boolean v1, p0, La/p650;->p:Z

    .line 110
    .line 111
    const/16 v3, 0x3c1

    .line 112
    .line 113
    invoke-static {v0, v3, v1}, La/brm0;->e(IIZ)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object p0, p0, La/p650;->q:La/q250;

    .line 118
    .line 119
    if-nez p0, :cond_1

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_1
    invoke-virtual {p0}, La/q250;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    :goto_1
    add-int/2addr v0, v2

    .line 127
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MyAggregatorStateModel(configScreenType="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/p650;->a:La/mi0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", promotionsCarouselStyle="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/p650;->b:La/h650;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", tournamentsCarouselStyle="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/p650;->c:La/zf1;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", gamesCarouselStyle="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/p650;->d:La/ot0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", accountSelectionStyle="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/p650;->e:La/kg;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", lottieAnimationType="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, La/p650;->f:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", balanceModel="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/p650;->g:La/ql5;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", contentModelItems="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/p650;->h:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", favoriteGamesIds="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/p650;->i:Ljava/util/Set;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", isNewBannersService="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-boolean v1, p0, La/p650;->j:Z

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", hasLoyaltyProgram="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, ", aggregatorPromoEnabled="

    .line 109
    .line 110
    const-string v2, ", loyaltyProgramBasicWidgetEnabled="

    .line 111
    .line 112
    iget-boolean v3, p0, La/p650;->k:Z

    .line 113
    .line 114
    iget-boolean v4, p0, La/p650;->l:Z

    .line 115
    .line 116
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 117
    .line 118
    .line 119
    const-string v1, ", isAuth="

    .line 120
    .line 121
    const-string v2, ", hasAggregatorPlayerTasks="

    .line 122
    .line 123
    iget-boolean v3, p0, La/p650;->m:Z

    .line 124
    .line 125
    iget-boolean v4, p0, La/p650;->n:Z

    .line 126
    .line 127
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 128
    .line 129
    .line 130
    const-string v1, ", hasAggregatorPlayerTasksHistory="

    .line 131
    .line 132
    const-string v2, ", cashbackUpdateKey=null, deeplinkModel="

    .line 133
    .line 134
    iget-boolean v3, p0, La/p650;->o:Z

    .line 135
    .line 136
    iget-boolean v4, p0, La/p650;->p:Z

    .line 137
    .line 138
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 139
    .line 140
    .line 141
    iget-object p0, p0, La/p650;->q:La/q250;

    .line 142
    .line 143
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string p0, ")"

    .line 147
    .line 148
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    return-object p0
.end method
