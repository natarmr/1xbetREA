.class public final La/c260;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/oz50;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:La/om5;

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/util/List;

.field public final j:La/tz50;

.field public final k:La/mdm;

.field public final l:La/mdm;

.field public final m:Z

.field public final n:La/mdm;

.field public final o:La/s4i0;

.field public final p:La/s4i0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/oz50;ZZZLa/om5;ZZLjava/util/List;La/tz50;La/mdm;La/mdm;ZLa/mdm;La/s4i0;La/s4i0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/c260;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/c260;->b:La/oz50;

    .line 13
    .line 14
    iput-boolean p3, p0, La/c260;->c:Z

    .line 15
    .line 16
    iput-boolean p4, p0, La/c260;->d:Z

    .line 17
    .line 18
    iput-boolean p5, p0, La/c260;->e:Z

    .line 19
    .line 20
    iput-object p6, p0, La/c260;->f:La/om5;

    .line 21
    .line 22
    iput-boolean p7, p0, La/c260;->g:Z

    .line 23
    .line 24
    iput-boolean p8, p0, La/c260;->h:Z

    .line 25
    .line 26
    iput-object p9, p0, La/c260;->i:Ljava/util/List;

    .line 27
    .line 28
    iput-object p10, p0, La/c260;->j:La/tz50;

    .line 29
    .line 30
    iput-object p11, p0, La/c260;->k:La/mdm;

    .line 31
    .line 32
    iput-object p12, p0, La/c260;->l:La/mdm;

    .line 33
    .line 34
    iput-boolean p13, p0, La/c260;->m:Z

    .line 35
    .line 36
    iput-object p14, p0, La/c260;->n:La/mdm;

    .line 37
    .line 38
    iput-object p15, p0, La/c260;->o:La/s4i0;

    .line 39
    .line 40
    move-object/from16 p1, p16

    .line 41
    .line 42
    iput-object p1, p0, La/c260;->p:La/s4i0;

    .line 43
    .line 44
    return-void
.end method

.method public static a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    iget-object v2, v0, La/c260;->a:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v1, 0x2

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, La/c260;->b:La/oz50;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object/from16 v3, p1

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v4, v1, 0x8

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    iget-boolean v4, v0, La/c260;->c:Z

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move/from16 v4, p2

    .line 27
    .line 28
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 v5, v1, 0x20

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    iget-boolean v5, v0, La/c260;->d:Z

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move/from16 v5, p3

    .line 39
    .line 40
    :goto_2
    and-int/lit8 v6, v1, 0x40

    .line 41
    .line 42
    if-eqz v6, :cond_3

    .line 43
    .line 44
    iget-boolean v6, v0, La/c260;->e:Z

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move/from16 v6, p4

    .line 48
    .line 49
    :goto_3
    and-int/lit16 v7, v1, 0x80

    .line 50
    .line 51
    if-eqz v7, :cond_4

    .line 52
    .line 53
    iget-object v7, v0, La/c260;->f:La/om5;

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_4
    move-object/from16 v7, p5

    .line 57
    .line 58
    :goto_4
    and-int/lit16 v8, v1, 0x100

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    if-eqz v8, :cond_5

    .line 62
    .line 63
    iget-boolean v8, v0, La/c260;->g:Z

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_5
    move v8, v9

    .line 67
    :goto_5
    and-int/lit16 v10, v1, 0x200

    .line 68
    .line 69
    if-eqz v10, :cond_6

    .line 70
    .line 71
    iget-boolean v10, v0, La/c260;->h:Z

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :cond_6
    move/from16 v10, p6

    .line 75
    .line 76
    :goto_6
    and-int/lit16 v11, v1, 0x400

    .line 77
    .line 78
    if-eqz v11, :cond_7

    .line 79
    .line 80
    iget-object v11, v0, La/c260;->i:Ljava/util/List;

    .line 81
    .line 82
    goto :goto_7

    .line 83
    :cond_7
    move-object/from16 v11, p7

    .line 84
    .line 85
    :goto_7
    and-int/lit16 v12, v1, 0x800

    .line 86
    .line 87
    if-eqz v12, :cond_8

    .line 88
    .line 89
    iget-object v12, v0, La/c260;->j:La/tz50;

    .line 90
    .line 91
    :goto_8
    move v13, v9

    .line 92
    move-object v9, v11

    .line 93
    goto :goto_9

    .line 94
    :cond_8
    move-object/from16 v12, p8

    .line 95
    .line 96
    goto :goto_8

    .line 97
    :goto_9
    iget-object v11, v0, La/c260;->k:La/mdm;

    .line 98
    .line 99
    move-object v14, v2

    .line 100
    move-object v2, v3

    .line 101
    move v3, v4

    .line 102
    move v4, v5

    .line 103
    move v5, v6

    .line 104
    move-object v6, v7

    .line 105
    move v7, v8

    .line 106
    move v8, v10

    .line 107
    move-object v10, v12

    .line 108
    iget-object v12, v0, La/c260;->l:La/mdm;

    .line 109
    .line 110
    and-int/lit16 v15, v1, 0x4000

    .line 111
    .line 112
    if-eqz v15, :cond_9

    .line 113
    .line 114
    iget-boolean v13, v0, La/c260;->m:Z

    .line 115
    .line 116
    :cond_9
    move-object v1, v14

    .line 117
    iget-object v14, v0, La/c260;->n:La/mdm;

    .line 118
    .line 119
    const/high16 v15, 0x10000

    .line 120
    .line 121
    and-int v15, p11, v15

    .line 122
    .line 123
    if-eqz v15, :cond_a

    .line 124
    .line 125
    iget-object v15, v0, La/c260;->o:La/s4i0;

    .line 126
    .line 127
    goto :goto_a

    .line 128
    :cond_a
    move-object/from16 v15, p9

    .line 129
    .line 130
    :goto_a
    const/high16 v16, 0x20000

    .line 131
    .line 132
    and-int v16, p11, v16

    .line 133
    .line 134
    move-object/from16 p1, v1

    .line 135
    .line 136
    if-eqz v16, :cond_b

    .line 137
    .line 138
    iget-object v1, v0, La/c260;->p:La/s4i0;

    .line 139
    .line 140
    move-object/from16 v16, v1

    .line 141
    .line 142
    goto :goto_b

    .line 143
    :cond_b
    move-object/from16 v16, p10

    .line 144
    .line 145
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    new-instance v0, La/c260;

    .line 161
    .line 162
    move-object/from16 v1, p1

    .line 163
    .line 164
    invoke-direct/range {v0 .. v16}, La/c260;-><init>(Ljava/lang/String;La/oz50;ZZZLa/om5;ZZLjava/util/List;La/tz50;La/mdm;La/mdm;ZLa/mdm;La/s4i0;La/s4i0;)V

    .line 165
    .line 166
    .line 167
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
    instance-of v0, p1, La/c260;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/c260;

    .line 12
    .line 13
    iget-object v0, p0, La/c260;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/c260;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/c260;->b:La/oz50;

    .line 26
    .line 27
    iget-object v1, p1, La/c260;->b:La/oz50;

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
    iget-boolean v0, p0, La/c260;->c:Z

    .line 38
    .line 39
    iget-boolean v1, p1, La/c260;->c:Z

    .line 40
    .line 41
    if-eq v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-boolean v0, p0, La/c260;->d:Z

    .line 46
    .line 47
    iget-boolean v1, p1, La/c260;->d:Z

    .line 48
    .line 49
    if-eq v0, v1, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-boolean v0, p0, La/c260;->e:Z

    .line 54
    .line 55
    iget-boolean v1, p1, La/c260;->e:Z

    .line 56
    .line 57
    if-eq v0, v1, :cond_6

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_6
    iget-object v0, p0, La/c260;->f:La/om5;

    .line 62
    .line 63
    iget-object v1, p1, La/c260;->f:La/om5;

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
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_7
    iget-boolean v0, p0, La/c260;->g:Z

    .line 74
    .line 75
    iget-boolean v1, p1, La/c260;->g:Z

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-boolean v0, p0, La/c260;->h:Z

    .line 81
    .line 82
    iget-boolean v1, p1, La/c260;->h:Z

    .line 83
    .line 84
    if-eq v0, v1, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-object v0, p0, La/c260;->i:Ljava/util/List;

    .line 88
    .line 89
    iget-object v1, p1, La/c260;->i:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_a

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_a
    iget-object v0, p0, La/c260;->j:La/tz50;

    .line 99
    .line 100
    iget-object v1, p1, La/c260;->j:La/tz50;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_b

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_b
    iget-object v0, p0, La/c260;->k:La/mdm;

    .line 110
    .line 111
    iget-object v1, p1, La/c260;->k:La/mdm;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_c

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_c
    iget-object v0, p0, La/c260;->l:La/mdm;

    .line 121
    .line 122
    iget-object v1, p1, La/c260;->l:La/mdm;

    .line 123
    .line 124
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-nez v0, :cond_d

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_d
    iget-boolean v0, p0, La/c260;->m:Z

    .line 132
    .line 133
    iget-boolean v1, p1, La/c260;->m:Z

    .line 134
    .line 135
    if-eq v0, v1, :cond_e

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_e
    iget-object v0, p0, La/c260;->n:La/mdm;

    .line 139
    .line 140
    iget-object v1, p1, La/c260;->n:La/mdm;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-nez v0, :cond_f

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_f
    iget-object v0, p0, La/c260;->o:La/s4i0;

    .line 150
    .line 151
    iget-object v1, p1, La/c260;->o:La/s4i0;

    .line 152
    .line 153
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-nez v0, :cond_10

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_10
    iget-object p0, p0, La/c260;->p:La/s4i0;

    .line 161
    .line 162
    iget-object p1, p1, La/c260;->p:La/s4i0;

    .line 163
    .line 164
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-nez p0, :cond_11

    .line 169
    .line 170
    :goto_0
    const/4 p0, 0x0

    .line 171
    return p0

    .line 172
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 173
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/c260;->a:Ljava/lang/String;

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/c260;->b:La/oz50;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, La/oz50;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-boolean v3, p0, La/c260;->c:Z

    .line 28
    .line 29
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-boolean v3, p0, La/c260;->d:Z

    .line 38
    .line 39
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-boolean v3, p0, La/c260;->e:Z

    .line 44
    .line 45
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v3, p0, La/c260;->f:La/om5;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    add-int/2addr v3, v0

    .line 56
    mul-int/2addr v3, v1

    .line 57
    iget-boolean v0, p0, La/c260;->g:Z

    .line 58
    .line 59
    invoke-static {v3, v1, v0}, La/brm0;->e(IIZ)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-boolean v3, p0, La/c260;->h:Z

    .line 64
    .line 65
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object v3, p0, La/c260;->i:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {v0, v1, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-object v3, p0, La/c260;->j:La/tz50;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    add-int/2addr v3, v0

    .line 82
    mul-int/2addr v3, v1

    .line 83
    iget-object v0, p0, La/c260;->k:La/mdm;

    .line 84
    .line 85
    invoke-static {v0, v3, v1}, La/f140;->d(La/mdm;II)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v3, p0, La/c260;->l:La/mdm;

    .line 90
    .line 91
    invoke-static {v3, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget-boolean v3, p0, La/c260;->m:Z

    .line 96
    .line 97
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-object v3, p0, La/c260;->n:La/mdm;

    .line 102
    .line 103
    invoke-static {v3, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget-object v3, p0, La/c260;->o:La/s4i0;

    .line 108
    .line 109
    if-nez v3, :cond_1

    .line 110
    .line 111
    move v3, v2

    .line 112
    goto :goto_1

    .line 113
    :cond_1
    invoke-virtual {v3}, La/s4i0;->hashCode()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    :goto_1
    add-int/2addr v0, v3

    .line 118
    mul-int/2addr v0, v1

    .line 119
    iget-object p0, p0, La/c260;->p:La/s4i0;

    .line 120
    .line 121
    if-nez p0, :cond_2

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    invoke-virtual {p0}, La/s4i0;->hashCode()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    :goto_2
    add-int/2addr v0, v2

    .line 129
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "NoTabsDashboardState(title="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/c260;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", config="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/c260;->b:La/oz50;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", showGamesUM=false, showRefreshing="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", scrollToTop=false, authorized="

    .line 29
    .line 30
    const-string v2, ", connected="

    .line 31
    .line 32
    iget-boolean v3, p0, La/c260;->c:Z

    .line 33
    .line 34
    iget-boolean v4, p0, La/c260;->d:Z

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 37
    .line 38
    .line 39
    iget-boolean v1, p0, La/c260;->e:Z

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", balanceState="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/c260;->f:La/om5;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", recommendedGamesFirstRequest="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ", showConnectionError="

    .line 60
    .line 61
    const-string v2, ", itemsOrder="

    .line 62
    .line 63
    iget-boolean v3, p0, La/c260;->g:Z

    .line 64
    .line 65
    iget-boolean v4, p0, La/c260;->h:Z

    .line 66
    .line 67
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, La/c260;->i:Ljava/util/List;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", gameModel="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/c260;->j:La/tz50;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", lottieConfigConnectionError="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, La/c260;->k:La/mdm;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", lottieConfigEmptyWithGames="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, La/c260;->l:La/mdm;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", favoriteGamesFirstRequest="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-boolean v1, p0, La/c260;->m:Z

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", lottieConfigDataError="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-object v1, p0, La/c260;->n:La/mdm;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v1, ", selectedTrackCoefItem="

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, La/c260;->o:La/s4i0;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, ", removingTrackCoefItem="

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget-object p0, p0, La/c260;->p:La/s4i0;

    .line 141
    .line 142
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p0, ")"

    .line 146
    .line 147
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0
.end method
