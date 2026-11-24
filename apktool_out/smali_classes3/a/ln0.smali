.class public final La/ln0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/yk0;

.field public final b:Z

.field public final c:La/ql5;

.field public final d:La/kg;

.field public final e:La/zvh0;

.field public final f:Z

.field public final g:La/ot0;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Set;

.field public final l:Ljava/util/List;

.field public final m:La/un0;

.field public final n:La/un0;

.field public final o:J

.field public final p:Z


# direct methods
.method public constructor <init>(La/yk0;ZLa/ql5;La/kg;La/zvh0;ZLa/ot0;Ljava/lang/String;ILjava/util/Map;Ljava/util/Set;Ljava/util/List;La/un0;La/un0;JZ)V
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
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ln0;->a:La/yk0;

    .line 14
    .line 15
    iput-boolean p2, p0, La/ln0;->b:Z

    .line 16
    .line 17
    iput-object p3, p0, La/ln0;->c:La/ql5;

    .line 18
    .line 19
    iput-object p4, p0, La/ln0;->d:La/kg;

    .line 20
    .line 21
    iput-object p5, p0, La/ln0;->e:La/zvh0;

    .line 22
    .line 23
    iput-boolean p6, p0, La/ln0;->f:Z

    .line 24
    .line 25
    iput-object p7, p0, La/ln0;->g:La/ot0;

    .line 26
    .line 27
    iput-object p8, p0, La/ln0;->h:Ljava/lang/String;

    .line 28
    .line 29
    iput p9, p0, La/ln0;->i:I

    .line 30
    .line 31
    iput-object p10, p0, La/ln0;->j:Ljava/util/Map;

    .line 32
    .line 33
    iput-object p11, p0, La/ln0;->k:Ljava/util/Set;

    .line 34
    .line 35
    iput-object p12, p0, La/ln0;->l:Ljava/util/List;

    .line 36
    .line 37
    iput-object p13, p0, La/ln0;->m:La/un0;

    .line 38
    .line 39
    iput-object p14, p0, La/ln0;->n:La/un0;

    .line 40
    .line 41
    move-wide p1, p15

    .line 42
    iput-wide p1, p0, La/ln0;->o:J

    .line 43
    .line 44
    move/from16 p1, p17

    .line 45
    .line 46
    iput-boolean p1, p0, La/ln0;->p:Z

    .line 47
    .line 48
    return-void
.end method

.method public static a(La/ln0;La/yk0;ZLa/ql5;Ljava/util/LinkedHashMap;Ljava/util/Set;Ljava/util/List;La/un0;La/un0;JZI)La/ln0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p12

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/ln0;->a:La/yk0;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-boolean v2, v0, La/ln0;->b:Z

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
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/ln0;->c:La/ql5;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    iget-object v7, v0, La/ln0;->d:La/kg;

    .line 36
    .line 37
    iget-object v8, v0, La/ln0;->e:La/zvh0;

    .line 38
    .line 39
    iget-boolean v9, v0, La/ln0;->f:Z

    .line 40
    .line 41
    iget-object v10, v0, La/ln0;->g:La/ot0;

    .line 42
    .line 43
    iget-object v11, v0, La/ln0;->h:Ljava/lang/String;

    .line 44
    .line 45
    iget v12, v0, La/ln0;->i:I

    .line 46
    .line 47
    and-int/lit16 v2, v1, 0x200

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    iget-object v2, v0, La/ln0;->j:Ljava/util/Map;

    .line 52
    .line 53
    move-object v13, v2

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    move-object/from16 v13, p4

    .line 56
    .line 57
    :goto_3
    and-int/lit16 v2, v1, 0x400

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    iget-object v2, v0, La/ln0;->k:Ljava/util/Set;

    .line 62
    .line 63
    move-object v14, v2

    .line 64
    goto :goto_4

    .line 65
    :cond_4
    move-object/from16 v14, p5

    .line 66
    .line 67
    :goto_4
    and-int/lit16 v2, v1, 0x800

    .line 68
    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    iget-object v2, v0, La/ln0;->l:Ljava/util/List;

    .line 72
    .line 73
    move-object v15, v2

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move-object/from16 v15, p6

    .line 76
    .line 77
    :goto_5
    and-int/lit16 v2, v1, 0x1000

    .line 78
    .line 79
    if-eqz v2, :cond_6

    .line 80
    .line 81
    iget-object v2, v0, La/ln0;->m:La/un0;

    .line 82
    .line 83
    move-object/from16 v16, v2

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_6
    move-object/from16 v16, p7

    .line 87
    .line 88
    :goto_6
    and-int/lit16 v2, v1, 0x2000

    .line 89
    .line 90
    if-eqz v2, :cond_7

    .line 91
    .line 92
    iget-object v2, v0, La/ln0;->n:La/un0;

    .line 93
    .line 94
    move-object/from16 v17, v2

    .line 95
    .line 96
    goto :goto_7

    .line 97
    :cond_7
    move-object/from16 v17, p8

    .line 98
    .line 99
    :goto_7
    and-int/lit16 v2, v1, 0x4000

    .line 100
    .line 101
    if-eqz v2, :cond_8

    .line 102
    .line 103
    iget-wide v2, v0, La/ln0;->o:J

    .line 104
    .line 105
    move-wide/from16 v18, v2

    .line 106
    .line 107
    goto :goto_8

    .line 108
    :cond_8
    move-wide/from16 v18, p9

    .line 109
    .line 110
    :goto_8
    const v2, 0x8000

    .line 111
    .line 112
    .line 113
    and-int/2addr v1, v2

    .line 114
    if-eqz v1, :cond_9

    .line 115
    .line 116
    iget-boolean v1, v0, La/ln0;->p:Z

    .line 117
    .line 118
    move/from16 v20, v1

    .line 119
    .line 120
    goto :goto_9

    .line 121
    :cond_9
    move/from16 v20, p11

    .line 122
    .line 123
    :goto_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    new-instance v3, La/ln0;

    .line 145
    .line 146
    invoke-direct/range {v3 .. v20}, La/ln0;-><init>(La/yk0;ZLa/ql5;La/kg;La/zvh0;ZLa/ot0;Ljava/lang/String;ILjava/util/Map;Ljava/util/Set;Ljava/util/List;La/un0;La/un0;JZ)V

    .line 147
    .line 148
    .line 149
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
    instance-of v0, p1, La/ln0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ln0;

    .line 12
    .line 13
    iget-object v0, p0, La/ln0;->a:La/yk0;

    .line 14
    .line 15
    iget-object v1, p1, La/ln0;->a:La/yk0;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/ln0;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/ln0;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-object v0, p0, La/ln0;->c:La/ql5;

    .line 30
    .line 31
    iget-object v1, p1, La/ln0;->c:La/ql5;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ln0;->d:La/kg;

    .line 42
    .line 43
    iget-object v1, p1, La/ln0;->d:La/kg;

    .line 44
    .line 45
    if-eq v0, v1, :cond_5

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_5
    iget-object v0, p0, La/ln0;->e:La/zvh0;

    .line 50
    .line 51
    iget-object v1, p1, La/ln0;->e:La/zvh0;

    .line 52
    .line 53
    if-eq v0, v1, :cond_6

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_6
    iget-boolean v0, p0, La/ln0;->f:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/ln0;->f:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget-object v0, p0, La/ln0;->g:La/ot0;

    .line 65
    .line 66
    iget-object v1, p1, La/ln0;->g:La/ot0;

    .line 67
    .line 68
    if-eq v0, v1, :cond_8

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_8
    iget-object v0, p0, La/ln0;->h:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v1, p1, La/ln0;->h:Ljava/lang/String;

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
    iget v0, p0, La/ln0;->i:I

    .line 83
    .line 84
    iget v1, p1, La/ln0;->i:I

    .line 85
    .line 86
    if-eq v0, v1, :cond_a

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_a
    iget-object v0, p0, La/ln0;->j:Ljava/util/Map;

    .line 90
    .line 91
    iget-object v1, p1, La/ln0;->j:Ljava/util/Map;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget-object v0, p0, La/ln0;->k:Ljava/util/Set;

    .line 101
    .line 102
    iget-object v1, p1, La/ln0;->k:Ljava/util/Set;

    .line 103
    .line 104
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_c

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_c
    iget-object v0, p0, La/ln0;->l:Ljava/util/List;

    .line 112
    .line 113
    iget-object v1, p1, La/ln0;->l:Ljava/util/List;

    .line 114
    .line 115
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-nez v0, :cond_d

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_d
    iget-object v0, p0, La/ln0;->m:La/un0;

    .line 123
    .line 124
    iget-object v1, p1, La/ln0;->m:La/un0;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_e

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_e
    iget-object v0, p0, La/ln0;->n:La/un0;

    .line 134
    .line 135
    iget-object v1, p1, La/ln0;->n:La/un0;

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-nez v0, :cond_f

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_f
    iget-wide v0, p0, La/ln0;->o:J

    .line 145
    .line 146
    iget-wide v2, p1, La/ln0;->o:J

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
    iget-boolean p0, p0, La/ln0;->p:Z

    .line 154
    .line 155
    iget-boolean p1, p1, La/ln0;->p:Z

    .line 156
    .line 157
    if-eq p0, p1, :cond_11

    .line 158
    .line 159
    :goto_0
    const/4 p0, 0x0

    .line 160
    return p0

    .line 161
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 162
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ln0;->a:La/yk0;

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
    iget-boolean v2, p0, La/ln0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/ln0;->c:La/ql5;

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v2}, La/ql5;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    :goto_0
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, La/ln0;->d:La/kg;

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
    iget-object v0, p0, La/ln0;->e:La/zvh0;

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
    iget-boolean v2, p0, La/ln0;->f:Z

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/ln0;->g:La/ot0;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object v0, p0, La/ln0;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/ln0;->i:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/ln0;->j:Ljava/util/Map;

    .line 71
    .line 72
    invoke-static {v2, v0, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/ln0;->k:Ljava/util/Set;

    .line 77
    .line 78
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/ln0;->l:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, La/ln0;->m:La/un0;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    add-int/2addr v2, v0

    .line 95
    mul-int/2addr v2, v1

    .line 96
    iget-object v0, p0, La/ln0;->n:La/un0;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    add-int/2addr v0, v2

    .line 103
    mul-int/2addr v0, v1

    .line 104
    iget-wide v2, p0, La/ln0;->o:J

    .line 105
    .line 106
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget-boolean p0, p0, La/ln0;->p:Z

    .line 111
    .line 112
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    add-int/2addr p0, v0

    .line 117
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AggregatorFavoritesState(selectedTab="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ln0;->a:La/yk0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", isLoggedIn="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/ln0;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", balance="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/ln0;->c:La/ql5;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", accountSelectionStyleConfigType="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/ln0;->d:La/kg;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", segmentControlStyleModel="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/ln0;->e:La/zvh0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", isVirtual="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, La/ln0;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", aggregatorGameCardCollectionStyleType="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/ln0;->g:La/ot0;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", screenName="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/ln0;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", lottieTypeId="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p0, La/ln0;->i:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", gamesMap="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, La/ln0;->j:Ljava/util/Map;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", favoriteGameIds="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object v1, p0, La/ln0;->k:Ljava/util/Set;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v1, ", recommendedCategories="

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, La/ln0;->l:Ljava/util/List;

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v1, ", favoritesTabContent="

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, La/ln0;->m:La/un0;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string v1, ", viewedTabContent="

    .line 134
    .line 135
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, La/ln0;->n:La/un0;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v1, ", gameCategoryIdToOpen="

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v1, ", recommendedCategoriesLoaded="

    .line 149
    .line 150
    iget-wide v2, p0, La/ln0;->o:J

    .line 151
    .line 152
    iget-boolean p0, p0, La/ln0;->p:Z

    .line 153
    .line 154
    invoke-static {v2, v3, v1, v0, p0}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 155
    .line 156
    .line 157
    const-string p0, ")"

    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    return-object p0
.end method
