.class public final La/kl8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:La/w3t;

.field public final d:La/je8;

.field public final e:La/csr;

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:Z

.field public final k:Ljava/util/List;

.field public final l:La/ql5;

.field public final m:Z

.field public final n:La/kg;

.field public final o:Z

.field public final p:Z


# direct methods
.method public constructor <init>(ZZLa/w3t;La/je8;La/csr;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;La/ql5;ZLa/kg;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-boolean p1, p0, La/kl8;->a:Z

    .line 17
    .line 18
    iput-boolean p2, p0, La/kl8;->b:Z

    .line 19
    .line 20
    iput-object p3, p0, La/kl8;->c:La/w3t;

    .line 21
    .line 22
    iput-object p4, p0, La/kl8;->d:La/je8;

    .line 23
    .line 24
    iput-object p5, p0, La/kl8;->e:La/csr;

    .line 25
    .line 26
    iput-boolean p6, p0, La/kl8;->f:Z

    .line 27
    .line 28
    iput-boolean p7, p0, La/kl8;->g:Z

    .line 29
    .line 30
    iput-object p8, p0, La/kl8;->h:Ljava/util/List;

    .line 31
    .line 32
    iput-object p9, p0, La/kl8;->i:Ljava/util/List;

    .line 33
    .line 34
    iput-boolean p10, p0, La/kl8;->j:Z

    .line 35
    .line 36
    iput-object p11, p0, La/kl8;->k:Ljava/util/List;

    .line 37
    .line 38
    iput-object p12, p0, La/kl8;->l:La/ql5;

    .line 39
    .line 40
    iput-boolean p13, p0, La/kl8;->m:Z

    .line 41
    .line 42
    iput-object p14, p0, La/kl8;->n:La/kg;

    .line 43
    .line 44
    iput-boolean p15, p0, La/kl8;->o:Z

    .line 45
    .line 46
    move/from16 p1, p16

    .line 47
    .line 48
    iput-boolean p1, p0, La/kl8;->p:Z

    .line 49
    .line 50
    return-void
.end method

.method public static a(La/kl8;ZLa/w3t;La/je8;La/csr;ZZLjava/util/List;Ljava/util/ArrayList;ZLjava/util/List;La/ql5;ZZI)La/kl8;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p14

    .line 4
    .line 5
    iget-boolean v2, v0, La/kl8;->a:Z

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-boolean v3, v0, La/kl8;->b:Z

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    and-int/lit8 v4, v1, 0x4

    .line 17
    .line 18
    if-eqz v4, :cond_1

    .line 19
    .line 20
    iget-object v4, v0, La/kl8;->c:La/w3t;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v4, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v5, v1, 0x8

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    iget-object v5, v0, La/kl8;->d:La/je8;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object/from16 v5, p3

    .line 33
    .line 34
    :goto_2
    and-int/lit8 v6, v1, 0x10

    .line 35
    .line 36
    if-eqz v6, :cond_3

    .line 37
    .line 38
    iget-object v6, v0, La/kl8;->e:La/csr;

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object/from16 v6, p4

    .line 42
    .line 43
    :goto_3
    and-int/lit8 v7, v1, 0x20

    .line 44
    .line 45
    if-eqz v7, :cond_4

    .line 46
    .line 47
    iget-boolean v7, v0, La/kl8;->f:Z

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move/from16 v7, p5

    .line 51
    .line 52
    :goto_4
    and-int/lit8 v8, v1, 0x40

    .line 53
    .line 54
    if-eqz v8, :cond_5

    .line 55
    .line 56
    iget-boolean v8, v0, La/kl8;->g:Z

    .line 57
    .line 58
    goto :goto_5

    .line 59
    :cond_5
    move/from16 v8, p6

    .line 60
    .line 61
    :goto_5
    and-int/lit16 v9, v1, 0x80

    .line 62
    .line 63
    if-eqz v9, :cond_6

    .line 64
    .line 65
    iget-object v9, v0, La/kl8;->h:Ljava/util/List;

    .line 66
    .line 67
    goto :goto_6

    .line 68
    :cond_6
    move-object/from16 v9, p7

    .line 69
    .line 70
    :goto_6
    and-int/lit16 v10, v1, 0x100

    .line 71
    .line 72
    if-eqz v10, :cond_7

    .line 73
    .line 74
    iget-object v10, v0, La/kl8;->i:Ljava/util/List;

    .line 75
    .line 76
    goto :goto_7

    .line 77
    :cond_7
    move-object/from16 v10, p8

    .line 78
    .line 79
    :goto_7
    and-int/lit16 v11, v1, 0x200

    .line 80
    .line 81
    if-eqz v11, :cond_8

    .line 82
    .line 83
    iget-boolean v11, v0, La/kl8;->j:Z

    .line 84
    .line 85
    goto :goto_8

    .line 86
    :cond_8
    move/from16 v11, p9

    .line 87
    .line 88
    :goto_8
    and-int/lit16 v12, v1, 0x400

    .line 89
    .line 90
    if-eqz v12, :cond_9

    .line 91
    .line 92
    iget-object v12, v0, La/kl8;->k:Ljava/util/List;

    .line 93
    .line 94
    goto :goto_9

    .line 95
    :cond_9
    move-object/from16 v12, p10

    .line 96
    .line 97
    :goto_9
    and-int/lit16 v13, v1, 0x800

    .line 98
    .line 99
    if-eqz v13, :cond_a

    .line 100
    .line 101
    iget-object v13, v0, La/kl8;->l:La/ql5;

    .line 102
    .line 103
    goto :goto_a

    .line 104
    :cond_a
    move-object/from16 v13, p11

    .line 105
    .line 106
    :goto_a
    and-int/lit16 v14, v1, 0x1000

    .line 107
    .line 108
    if-eqz v14, :cond_b

    .line 109
    .line 110
    iget-boolean v14, v0, La/kl8;->m:Z

    .line 111
    .line 112
    goto :goto_b

    .line 113
    :cond_b
    move/from16 v14, p12

    .line 114
    .line 115
    :goto_b
    iget-object v15, v0, La/kl8;->n:La/kg;

    .line 116
    .line 117
    and-int/lit16 v1, v1, 0x4000

    .line 118
    .line 119
    if-eqz v1, :cond_c

    .line 120
    .line 121
    iget-boolean v1, v0, La/kl8;->o:Z

    .line 122
    .line 123
    move/from16 p1, v1

    .line 124
    .line 125
    goto :goto_c

    .line 126
    :cond_c
    move/from16 p1, p13

    .line 127
    .line 128
    :goto_c
    iget-boolean v1, v0, La/kl8;->p:Z

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance v0, La/kl8;

    .line 149
    .line 150
    move/from16 v16, v1

    .line 151
    .line 152
    move v1, v2

    .line 153
    move v2, v3

    .line 154
    move-object v3, v4

    .line 155
    move-object v4, v5

    .line 156
    move-object v5, v6

    .line 157
    move v6, v7

    .line 158
    move v7, v8

    .line 159
    move-object v8, v9

    .line 160
    move-object v9, v10

    .line 161
    move v10, v11

    .line 162
    move-object v11, v12

    .line 163
    move-object v12, v13

    .line 164
    move v13, v14

    .line 165
    move-object v14, v15

    .line 166
    move/from16 v15, p1

    .line 167
    .line 168
    invoke-direct/range {v0 .. v16}, La/kl8;-><init>(ZZLa/w3t;La/je8;La/csr;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;La/ql5;ZLa/kg;ZZ)V

    .line 169
    .line 170
    .line 171
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
    instance-of v0, p1, La/kl8;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/kl8;

    .line 12
    .line 13
    iget-boolean v0, p0, La/kl8;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/kl8;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/kl8;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/kl8;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_3
    iget-object v0, p0, La/kl8;->c:La/w3t;

    .line 30
    .line 31
    iget-object v1, p1, La/kl8;->c:La/w3t;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/kl8;->d:La/je8;

    .line 42
    .line 43
    iget-object v1, p1, La/kl8;->d:La/je8;

    .line 44
    .line 45
    if-eq v0, v1, :cond_5

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_5
    iget-object v0, p0, La/kl8;->e:La/csr;

    .line 50
    .line 51
    iget-object v1, p1, La/kl8;->e:La/csr;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_6
    iget-boolean v0, p0, La/kl8;->f:Z

    .line 61
    .line 62
    iget-boolean v1, p1, La/kl8;->f:Z

    .line 63
    .line 64
    if-eq v0, v1, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-boolean v0, p0, La/kl8;->g:Z

    .line 68
    .line 69
    iget-boolean v1, p1, La/kl8;->g:Z

    .line 70
    .line 71
    if-eq v0, v1, :cond_8

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_8
    iget-object v0, p0, La/kl8;->h:Ljava/util/List;

    .line 75
    .line 76
    iget-object v1, p1, La/kl8;->h:Ljava/util/List;

    .line 77
    .line 78
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-nez v0, :cond_9

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_9
    iget-object v0, p0, La/kl8;->i:Ljava/util/List;

    .line 86
    .line 87
    iget-object v1, p1, La/kl8;->i:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-boolean v0, p0, La/kl8;->j:Z

    .line 97
    .line 98
    iget-boolean v1, p1, La/kl8;->j:Z

    .line 99
    .line 100
    if-eq v0, v1, :cond_b

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_b
    iget-object v0, p0, La/kl8;->k:Ljava/util/List;

    .line 104
    .line 105
    iget-object v1, p1, La/kl8;->k:Ljava/util/List;

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
    iget-object v0, p0, La/kl8;->l:La/ql5;

    .line 115
    .line 116
    iget-object v1, p1, La/kl8;->l:La/ql5;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, La/ql5;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/kl8;->m:Z

    .line 126
    .line 127
    iget-boolean v1, p1, La/kl8;->m:Z

    .line 128
    .line 129
    if-eq v0, v1, :cond_e

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_e
    iget-object v0, p0, La/kl8;->n:La/kg;

    .line 133
    .line 134
    iget-object v1, p1, La/kl8;->n:La/kg;

    .line 135
    .line 136
    if-eq v0, v1, :cond_f

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_f
    iget-boolean v0, p0, La/kl8;->o:Z

    .line 140
    .line 141
    iget-boolean v1, p1, La/kl8;->o:Z

    .line 142
    .line 143
    if-eq v0, v1, :cond_10

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_10
    iget-boolean p0, p0, La/kl8;->p:Z

    .line 147
    .line 148
    iget-boolean p1, p1, La/kl8;->p:Z

    .line 149
    .line 150
    if-eq p0, p1, :cond_11

    .line 151
    .line 152
    :goto_0
    const/4 p0, 0x0

    .line 153
    return p0

    .line 154
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 155
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/kl8;->a:Z

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
    iget-boolean v2, p0, La/kl8;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/kl8;->c:La/w3t;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, La/kl8;->d:La/je8;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    mul-int/2addr v0, v1

    .line 32
    iget-object v2, p0, La/kl8;->e:La/csr;

    .line 33
    .line 34
    invoke-virtual {v2}, La/csr;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    add-int/2addr v2, v0

    .line 39
    mul-int/2addr v2, v1

    .line 40
    iget-boolean v0, p0, La/kl8;->f:Z

    .line 41
    .line 42
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/kl8;->g:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/kl8;->h:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/kl8;->i:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/kl8;->j:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/kl8;->k:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/kl8;->l:La/ql5;

    .line 77
    .line 78
    invoke-virtual {v2}, La/ql5;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    add-int/2addr v2, v0

    .line 83
    mul-int/2addr v2, v1

    .line 84
    iget-boolean v0, p0, La/kl8;->m:Z

    .line 85
    .line 86
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-object v2, p0, La/kl8;->n:La/kg;

    .line 91
    .line 92
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    add-int/2addr v2, v0

    .line 97
    mul-int/2addr v2, v1

    .line 98
    iget-boolean v0, p0, La/kl8;->o:Z

    .line 99
    .line 100
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-boolean p0, p0, La/kl8;->p:Z

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
    const-string v0, ", connected="

    .line 2
    .line 3
    const-string v1, ", sourceScreen="

    .line 4
    .line 5
    const-string v2, "BonusesState(authorized="

    .line 6
    .line 7
    iget-boolean v3, p0, La/kl8;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/kl8;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/kl8;->c:La/w3t;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", activeFilter="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/kl8;->d:La/je8;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", clickedItem="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/kl8;->e:La/csr;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", loading="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, La/kl8;->f:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", refreshing="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, ", filters="

    .line 56
    .line 57
    const-string v2, ", bonuses="

    .line 58
    .line 59
    iget-object v3, p0, La/kl8;->h:Ljava/util/List;

    .line 60
    .line 61
    iget-boolean v4, p0, La/kl8;->g:Z

    .line 62
    .line 63
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", bonusGameAllowed="

    .line 67
    .line 68
    const-string v2, ", craftingBonuses="

    .line 69
    .line 70
    iget-object v3, p0, La/kl8;->i:Ljava/util/List;

    .line 71
    .line 72
    iget-boolean v4, p0, La/kl8;->j:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, La/kl8;->k:Ljava/util/List;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ", balance="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, La/kl8;->l:La/ql5;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v1, ", balanceLoading="

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-boolean v1, p0, La/kl8;->m:Z

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", accountSelectionStyle="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v1, p0, La/kl8;->n:La/kg;

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, ", error="

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, ", hasGamesWildFreebet="

    .line 118
    .line 119
    const-string v2, ")"

    .line 120
    .line 121
    iget-boolean v3, p0, La/kl8;->o:Z

    .line 122
    .line 123
    iget-boolean p0, p0, La/kl8;->p:Z

    .line 124
    .line 125
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0
.end method
