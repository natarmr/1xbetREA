.class public final La/x4p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:La/f4p;

.field public final e:La/wcb;

.field public final f:La/mdm;

.field public final g:Ljava/util/List;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:La/v5l0;

.field public final m:Z

.field public final n:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;La/mdm;Ljava/util/List;ZZZZLa/v5l0;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/x4p;->a:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, La/x4p;->b:Ljava/util/List;

    .line 19
    .line 20
    iput-object p3, p0, La/x4p;->c:Ljava/util/List;

    .line 21
    .line 22
    iput-object p4, p0, La/x4p;->d:La/f4p;

    .line 23
    .line 24
    iput-object p5, p0, La/x4p;->e:La/wcb;

    .line 25
    .line 26
    iput-object p6, p0, La/x4p;->f:La/mdm;

    .line 27
    .line 28
    iput-object p7, p0, La/x4p;->g:Ljava/util/List;

    .line 29
    .line 30
    iput-boolean p8, p0, La/x4p;->h:Z

    .line 31
    .line 32
    iput-boolean p9, p0, La/x4p;->i:Z

    .line 33
    .line 34
    iput-boolean p10, p0, La/x4p;->j:Z

    .line 35
    .line 36
    iput-boolean p11, p0, La/x4p;->k:Z

    .line 37
    .line 38
    iput-object p12, p0, La/x4p;->l:La/v5l0;

    .line 39
    .line 40
    iput-boolean p13, p0, La/x4p;->m:Z

    .line 41
    .line 42
    iput-boolean p14, p0, La/x4p;->n:Z

    .line 43
    .line 44
    return-void
.end method

.method public static a(La/x4p;Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;Ljava/util/List;ZZZZLa/v5l0;ZZI)La/x4p;
    .locals 14

    .line 1
    move/from16 v0, p14

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La/x4p;->a:Ljava/lang/String;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v1, p1

    .line 11
    :goto_0
    and-int/lit8 v2, v0, 0x2

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    iget-object v2, p0, La/x4p;->b:Ljava/util/List;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move-object/from16 v2, p2

    .line 19
    .line 20
    :goto_1
    and-int/lit8 v3, v0, 0x4

    .line 21
    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    iget-object v3, p0, La/x4p;->c:Ljava/util/List;

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move-object/from16 v3, p3

    .line 28
    .line 29
    :goto_2
    and-int/lit8 v4, v0, 0x8

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    iget-object v4, p0, La/x4p;->d:La/f4p;

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_3
    move-object/from16 v4, p4

    .line 37
    .line 38
    :goto_3
    and-int/lit8 v5, v0, 0x10

    .line 39
    .line 40
    if-eqz v5, :cond_4

    .line 41
    .line 42
    iget-object v5, p0, La/x4p;->e:La/wcb;

    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_4
    move-object/from16 v5, p5

    .line 46
    .line 47
    :goto_4
    iget-object v6, p0, La/x4p;->f:La/mdm;

    .line 48
    .line 49
    and-int/lit8 v7, v0, 0x40

    .line 50
    .line 51
    if-eqz v7, :cond_5

    .line 52
    .line 53
    iget-object v7, p0, La/x4p;->g:Ljava/util/List;

    .line 54
    .line 55
    goto :goto_5

    .line 56
    :cond_5
    move-object/from16 v7, p6

    .line 57
    .line 58
    :goto_5
    and-int/lit16 v8, v0, 0x80

    .line 59
    .line 60
    if-eqz v8, :cond_6

    .line 61
    .line 62
    iget-boolean v8, p0, La/x4p;->h:Z

    .line 63
    .line 64
    goto :goto_6

    .line 65
    :cond_6
    move/from16 v8, p7

    .line 66
    .line 67
    :goto_6
    and-int/lit16 v9, v0, 0x100

    .line 68
    .line 69
    if-eqz v9, :cond_7

    .line 70
    .line 71
    iget-boolean v9, p0, La/x4p;->i:Z

    .line 72
    .line 73
    goto :goto_7

    .line 74
    :cond_7
    move/from16 v9, p8

    .line 75
    .line 76
    :goto_7
    and-int/lit16 v10, v0, 0x200

    .line 77
    .line 78
    if-eqz v10, :cond_8

    .line 79
    .line 80
    iget-boolean v10, p0, La/x4p;->j:Z

    .line 81
    .line 82
    goto :goto_8

    .line 83
    :cond_8
    move/from16 v10, p9

    .line 84
    .line 85
    :goto_8
    and-int/lit16 v11, v0, 0x400

    .line 86
    .line 87
    if-eqz v11, :cond_9

    .line 88
    .line 89
    iget-boolean v11, p0, La/x4p;->k:Z

    .line 90
    .line 91
    goto :goto_9

    .line 92
    :cond_9
    move/from16 v11, p10

    .line 93
    .line 94
    :goto_9
    and-int/lit16 v12, v0, 0x800

    .line 95
    .line 96
    if-eqz v12, :cond_a

    .line 97
    .line 98
    iget-object v12, p0, La/x4p;->l:La/v5l0;

    .line 99
    .line 100
    goto :goto_a

    .line 101
    :cond_a
    move-object/from16 v12, p11

    .line 102
    .line 103
    :goto_a
    and-int/lit16 v13, v0, 0x1000

    .line 104
    .line 105
    if-eqz v13, :cond_b

    .line 106
    .line 107
    iget-boolean v13, p0, La/x4p;->m:Z

    .line 108
    .line 109
    goto :goto_b

    .line 110
    :cond_b
    move/from16 v13, p12

    .line 111
    .line 112
    :goto_b
    and-int/lit16 v0, v0, 0x2000

    .line 113
    .line 114
    if-eqz v0, :cond_c

    .line 115
    .line 116
    iget-boolean v0, p0, La/x4p;->n:Z

    .line 117
    .line 118
    goto :goto_c

    .line 119
    :cond_c
    move/from16 v0, p13

    .line 120
    .line 121
    :goto_c
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance p0, La/x4p;

    .line 137
    .line 138
    move/from16 p14, v0

    .line 139
    .line 140
    move-object p1, v1

    .line 141
    move-object/from16 p2, v2

    .line 142
    .line 143
    move-object/from16 p3, v3

    .line 144
    .line 145
    move-object/from16 p4, v4

    .line 146
    .line 147
    move-object/from16 p5, v5

    .line 148
    .line 149
    move-object/from16 p6, v6

    .line 150
    .line 151
    move-object/from16 p7, v7

    .line 152
    .line 153
    move/from16 p8, v8

    .line 154
    .line 155
    move/from16 p9, v9

    .line 156
    .line 157
    move/from16 p10, v10

    .line 158
    .line 159
    move/from16 p11, v11

    .line 160
    .line 161
    move-object/from16 p12, v12

    .line 162
    .line 163
    move/from16 p13, v13

    .line 164
    .line 165
    invoke-direct/range {p0 .. p14}, La/x4p;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;La/f4p;La/wcb;La/mdm;Ljava/util/List;ZZZZLa/v5l0;ZZ)V

    .line 166
    .line 167
    .line 168
    return-object p0
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
    instance-of v0, p1, La/x4p;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/x4p;

    .line 12
    .line 13
    iget-object v0, p0, La/x4p;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/x4p;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/x4p;->b:Ljava/util/List;

    .line 26
    .line 27
    iget-object v1, p1, La/x4p;->b:Ljava/util/List;

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
    iget-object v0, p0, La/x4p;->c:Ljava/util/List;

    .line 38
    .line 39
    iget-object v1, p1, La/x4p;->c:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-object v0, p0, La/x4p;->d:La/f4p;

    .line 49
    .line 50
    iget-object v1, p1, La/x4p;->d:La/f4p;

    .line 51
    .line 52
    if-eq v0, v1, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/x4p;->e:La/wcb;

    .line 56
    .line 57
    iget-object v1, p1, La/x4p;->e:La/wcb;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/x4p;->f:La/mdm;

    .line 67
    .line 68
    iget-object v1, p1, La/x4p;->f:La/mdm;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, La/x4p;->g:Ljava/util/List;

    .line 78
    .line 79
    iget-object v1, p1, La/x4p;->g:Ljava/util/List;

    .line 80
    .line 81
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_8
    iget-boolean v0, p0, La/x4p;->h:Z

    .line 89
    .line 90
    iget-boolean v1, p1, La/x4p;->h:Z

    .line 91
    .line 92
    if-eq v0, v1, :cond_9

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_9
    iget-boolean v0, p0, La/x4p;->i:Z

    .line 96
    .line 97
    iget-boolean v1, p1, La/x4p;->i:Z

    .line 98
    .line 99
    if-eq v0, v1, :cond_a

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_a
    iget-boolean v0, p0, La/x4p;->j:Z

    .line 103
    .line 104
    iget-boolean v1, p1, La/x4p;->j:Z

    .line 105
    .line 106
    if-eq v0, v1, :cond_b

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_b
    iget-boolean v0, p0, La/x4p;->k:Z

    .line 110
    .line 111
    iget-boolean v1, p1, La/x4p;->k:Z

    .line 112
    .line 113
    if-eq v0, v1, :cond_c

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_c
    iget-object v0, p0, La/x4p;->l:La/v5l0;

    .line 117
    .line 118
    iget-object v1, p1, La/x4p;->l:La/v5l0;

    .line 119
    .line 120
    if-eq v0, v1, :cond_d

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_d
    iget-boolean v0, p0, La/x4p;->m:Z

    .line 124
    .line 125
    iget-boolean v1, p1, La/x4p;->m:Z

    .line 126
    .line 127
    if-eq v0, v1, :cond_e

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_e
    iget-boolean p0, p0, La/x4p;->n:Z

    .line 131
    .line 132
    iget-boolean p1, p1, La/x4p;->n:Z

    .line 133
    .line 134
    if-eq p0, p1, :cond_f

    .line 135
    .line 136
    :goto_0
    const/4 p0, 0x0

    .line 137
    return p0

    .line 138
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 139
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/x4p;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/x4p;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/x4p;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/x4p;->d:La/f4p;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, La/x4p;->e:La/wcb;

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {v0}, La/wcb;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, La/x4p;->f:La/mdm;

    .line 43
    .line 44
    invoke-static {v0, v2, v1}, La/f140;->d(La/mdm;II)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/x4p;->g:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/x4p;->h:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean v2, p0, La/x4p;->i:Z

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-boolean v2, p0, La/x4p;->j:Z

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/x4p;->k:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, La/x4p;->l:La/v5l0;

    .line 79
    .line 80
    invoke-static {v2, v0, v1}, La/axq;->c(La/v5l0;II)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, La/x4p;->m:Z

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean p0, p0, La/x4p;->n:Z

    .line 91
    .line 92
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    add-int/2addr p0, v0

    .line 97
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", eventCardList="

    .line 2
    .line 3
    const-string v1, ", recommendedEventCardList="

    .line 4
    .line 5
    const-string v2, "FavoriteCategoryScreenState(headerTitle="

    .line 6
    .line 7
    iget-object v3, p0, La/x4p;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/x4p;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Lc;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/x4p;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", errorType="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/x4p;->d:La/f4p;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", champImagesHolder="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/x4p;->e:La/wcb;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", lottieHeader="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/x4p;->f:La/mdm;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", specialEventList="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", isBettingDisabled="

    .line 56
    .line 57
    const-string v2, ", isRefreshing="

    .line 58
    .line 59
    iget-object v3, p0, La/x4p;->g:Ljava/util/List;

    .line 60
    .line 61
    iget-boolean v4, p0, La/x4p;->h:Z

    .line 62
    .line 63
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", hasStream="

    .line 67
    .line 68
    const-string v2, ", searchFieldVisible="

    .line 69
    .line 70
    iget-boolean v3, p0, La/x4p;->i:Z

    .line 71
    .line 72
    iget-boolean v4, p0, La/x4p;->j:Z

    .line 73
    .line 74
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 75
    .line 76
    .line 77
    iget-boolean v1, p0, La/x4p;->k:Z

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", sportEventCardStyle="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La/x4p;->l:La/v5l0;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", isTablet="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v1, ", supportRtl="

    .line 98
    .line 99
    const-string v2, ")"

    .line 100
    .line 101
    iget-boolean v3, p0, La/x4p;->m:Z

    .line 102
    .line 103
    iget-boolean p0, p0, La/x4p;->n:Z

    .line 104
    .line 105
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method
