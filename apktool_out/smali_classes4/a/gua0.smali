.class public final La/gua0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fua0;

.field public final b:La/rlp;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/List;

.field public final f:La/zmb;

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:La/h8l0;

.field public final k:Z

.field public final l:Z

.field public final m:La/a4x;

.field public final n:La/ghq0;

.field public final o:Z

.field public final p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

.field public final q:Z


# direct methods
.method public constructor <init>(La/fua0;La/rlp;Ljava/lang/String;Ljava/util/Set;Ljava/util/List;La/zmb;ZLjava/lang/String;ZLa/h8l0;ZZLa/a4x;La/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;Z)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/gua0;->a:La/fua0;

    .line 26
    .line 27
    iput-object p2, p0, La/gua0;->b:La/rlp;

    .line 28
    .line 29
    iput-object p3, p0, La/gua0;->c:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p4, p0, La/gua0;->d:Ljava/util/Set;

    .line 32
    .line 33
    iput-object p5, p0, La/gua0;->e:Ljava/util/List;

    .line 34
    .line 35
    iput-object p6, p0, La/gua0;->f:La/zmb;

    .line 36
    .line 37
    iput-boolean p7, p0, La/gua0;->g:Z

    .line 38
    .line 39
    iput-object p8, p0, La/gua0;->h:Ljava/lang/String;

    .line 40
    .line 41
    iput-boolean p9, p0, La/gua0;->i:Z

    .line 42
    .line 43
    iput-object p10, p0, La/gua0;->j:La/h8l0;

    .line 44
    .line 45
    iput-boolean p11, p0, La/gua0;->k:Z

    .line 46
    .line 47
    iput-boolean p12, p0, La/gua0;->l:Z

    .line 48
    .line 49
    iput-object p13, p0, La/gua0;->m:La/a4x;

    .line 50
    .line 51
    iput-object p14, p0, La/gua0;->n:La/ghq0;

    .line 52
    .line 53
    iput-boolean p15, p0, La/gua0;->o:Z

    .line 54
    .line 55
    move-object/from16 p1, p16

    .line 56
    .line 57
    iput-object p1, p0, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 58
    .line 59
    move/from16 p1, p17

    .line 60
    .line 61
    iput-boolean p1, p0, La/gua0;->q:Z

    .line 62
    .line 63
    return-void
.end method

.method public static a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;
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
    iget-object v2, v0, La/gua0;->a:La/fua0;

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
    iget-object v5, v0, La/gua0;->b:La/rlp;

    .line 16
    .line 17
    and-int/lit8 v2, v1, 0x4

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget-object v2, v0, La/gua0;->c:Ljava/lang/String;

    .line 22
    .line 23
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object/from16 v6, p2

    .line 26
    .line 27
    :goto_1
    and-int/lit8 v2, v1, 0x8

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    iget-object v2, v0, La/gua0;->d:Ljava/util/Set;

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
    and-int/lit8 v2, v1, 0x10

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget-object v2, v0, La/gua0;->e:Ljava/util/List;

    .line 42
    .line 43
    move-object v8, v2

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move-object/from16 v8, p4

    .line 46
    .line 47
    :goto_3
    and-int/lit8 v2, v1, 0x20

    .line 48
    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    iget-object v2, v0, La/gua0;->f:La/zmb;

    .line 52
    .line 53
    move-object v9, v2

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    move-object/from16 v9, p5

    .line 56
    .line 57
    :goto_4
    and-int/lit8 v2, v1, 0x40

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    iget-boolean v2, v0, La/gua0;->g:Z

    .line 62
    .line 63
    move v10, v2

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move/from16 v10, p6

    .line 66
    .line 67
    :goto_5
    iget-object v11, v0, La/gua0;->h:Ljava/lang/String;

    .line 68
    .line 69
    and-int/lit16 v2, v1, 0x100

    .line 70
    .line 71
    if-eqz v2, :cond_6

    .line 72
    .line 73
    iget-boolean v2, v0, La/gua0;->i:Z

    .line 74
    .line 75
    :goto_6
    move v12, v2

    .line 76
    goto :goto_7

    .line 77
    :cond_6
    const/4 v2, 0x0

    .line 78
    goto :goto_6

    .line 79
    :goto_7
    iget-object v13, v0, La/gua0;->j:La/h8l0;

    .line 80
    .line 81
    and-int/lit16 v2, v1, 0x400

    .line 82
    .line 83
    if-eqz v2, :cond_7

    .line 84
    .line 85
    iget-boolean v2, v0, La/gua0;->k:Z

    .line 86
    .line 87
    move v14, v2

    .line 88
    goto :goto_8

    .line 89
    :cond_7
    move/from16 v14, p7

    .line 90
    .line 91
    :goto_8
    iget-boolean v15, v0, La/gua0;->l:Z

    .line 92
    .line 93
    iget-object v2, v0, La/gua0;->m:La/a4x;

    .line 94
    .line 95
    and-int/lit16 v3, v1, 0x2000

    .line 96
    .line 97
    if-eqz v3, :cond_8

    .line 98
    .line 99
    iget-object v3, v0, La/gua0;->n:La/ghq0;

    .line 100
    .line 101
    move-object/from16 v17, v3

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :cond_8
    move-object/from16 v17, p8

    .line 105
    .line 106
    :goto_9
    and-int/lit16 v3, v1, 0x4000

    .line 107
    .line 108
    if-eqz v3, :cond_9

    .line 109
    .line 110
    iget-boolean v3, v0, La/gua0;->o:Z

    .line 111
    .line 112
    move/from16 v18, v3

    .line 113
    .line 114
    goto :goto_a

    .line 115
    :cond_9
    move/from16 v18, p9

    .line 116
    .line 117
    :goto_a
    const v3, 0x8000

    .line 118
    .line 119
    .line 120
    and-int/2addr v3, v1

    .line 121
    if-eqz v3, :cond_a

    .line 122
    .line 123
    iget-object v3, v0, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 124
    .line 125
    move-object/from16 v19, v3

    .line 126
    .line 127
    goto :goto_b

    .line 128
    :cond_a
    move-object/from16 v19, p10

    .line 129
    .line 130
    :goto_b
    const/high16 v3, 0x10000

    .line 131
    .line 132
    and-int/2addr v1, v3

    .line 133
    if-eqz v1, :cond_b

    .line 134
    .line 135
    iget-boolean v1, v0, La/gua0;->q:Z

    .line 136
    .line 137
    move/from16 v20, v1

    .line 138
    .line 139
    goto :goto_c

    .line 140
    :cond_b
    move/from16 v20, p11

    .line 141
    .line 142
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v3, La/gua0;

    .line 170
    .line 171
    move-object/from16 v16, v2

    .line 172
    .line 173
    invoke-direct/range {v3 .. v20}, La/gua0;-><init>(La/fua0;La/rlp;Ljava/lang/String;Ljava/util/Set;Ljava/util/List;La/zmb;ZLjava/lang/String;ZLa/h8l0;ZZLa/a4x;La/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;Z)V

    .line 174
    .line 175
    .line 176
    return-object v3
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
    instance-of v0, p1, La/gua0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/gua0;

    .line 12
    .line 13
    iget-object v0, p0, La/gua0;->a:La/fua0;

    .line 14
    .line 15
    iget-object v1, p1, La/gua0;->a:La/fua0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/gua0;->b:La/rlp;

    .line 26
    .line 27
    iget-object v1, p1, La/gua0;->b:La/rlp;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/rlp;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/gua0;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/gua0;->c:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget-object v0, p0, La/gua0;->d:Ljava/util/Set;

    .line 50
    .line 51
    iget-object v1, p1, La/gua0;->d:Ljava/util/Set;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_5
    iget-object v0, p0, La/gua0;->e:Ljava/util/List;

    .line 62
    .line 63
    iget-object v1, p1, La/gua0;->e:Ljava/util/List;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_6
    iget-object v0, p0, La/gua0;->f:La/zmb;

    .line 74
    .line 75
    iget-object v1, p1, La/gua0;->f:La/zmb;

    .line 76
    .line 77
    if-eq v0, v1, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-boolean v0, p0, La/gua0;->g:Z

    .line 81
    .line 82
    iget-boolean v1, p1, La/gua0;->g:Z

    .line 83
    .line 84
    if-eq v0, v1, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object v0, p0, La/gua0;->h:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v1, p1, La/gua0;->h:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    iget-boolean v0, p0, La/gua0;->i:Z

    .line 99
    .line 100
    iget-boolean v1, p1, La/gua0;->i:Z

    .line 101
    .line 102
    if-eq v0, v1, :cond_a

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_a
    iget-object v0, p0, La/gua0;->j:La/h8l0;

    .line 106
    .line 107
    iget-object v1, p1, La/gua0;->j:La/h8l0;

    .line 108
    .line 109
    if-eq v0, v1, :cond_b

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_b
    iget-boolean v0, p0, La/gua0;->k:Z

    .line 113
    .line 114
    iget-boolean v1, p1, La/gua0;->k:Z

    .line 115
    .line 116
    if-eq v0, v1, :cond_c

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_c
    iget-boolean v0, p0, La/gua0;->l:Z

    .line 120
    .line 121
    iget-boolean v1, p1, La/gua0;->l:Z

    .line 122
    .line 123
    if-eq v0, v1, :cond_d

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_d
    iget-object v0, p0, La/gua0;->m:La/a4x;

    .line 127
    .line 128
    iget-object v1, p1, La/gua0;->m:La/a4x;

    .line 129
    .line 130
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-nez v0, :cond_e

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_e
    iget-object v0, p0, La/gua0;->n:La/ghq0;

    .line 138
    .line 139
    iget-object v1, p1, La/gua0;->n:La/ghq0;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, La/ghq0;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_f

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_f
    iget-boolean v0, p0, La/gua0;->o:Z

    .line 149
    .line 150
    iget-boolean v1, p1, La/gua0;->o:Z

    .line 151
    .line 152
    if-eq v0, v1, :cond_10

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_10
    iget-object v0, p0, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 156
    .line 157
    iget-object v1, p1, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 158
    .line 159
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_11

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_11
    iget-boolean p0, p0, La/gua0;->q:Z

    .line 167
    .line 168
    iget-boolean p1, p1, La/gua0;->q:Z

    .line 169
    .line 170
    if-eq p0, p1, :cond_12

    .line 171
    .line 172
    :goto_0
    const/4 p0, 0x0

    .line 173
    return p0

    .line 174
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 175
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/gua0;->a:La/fua0;

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
    iget-object v2, p0, La/gua0;->b:La/rlp;

    .line 11
    .line 12
    invoke-virtual {v2}, La/rlp;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/gua0;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/gua0;->d:Ljava/util/Set;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/gua0;->e:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/gua0;->f:La/zmb;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    iget-boolean v0, p0, La/gua0;->g:Z

    .line 45
    .line 46
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/gua0;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-boolean v2, p0, La/gua0;->i:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, La/gua0;->j:La/h8l0;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/2addr v2, v0

    .line 69
    mul-int/2addr v2, v1

    .line 70
    iget-boolean v0, p0, La/gua0;->k:Z

    .line 71
    .line 72
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, La/gua0;->l:Z

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/gua0;->m:La/a4x;

    .line 83
    .line 84
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, La/gua0;->n:La/ghq0;

    .line 89
    .line 90
    invoke-virtual {v2}, La/ghq0;->hashCode()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    add-int/2addr v2, v0

    .line 95
    mul-int/2addr v2, v1

    .line 96
    iget-boolean v0, p0, La/gua0;->o:Z

    .line 97
    .line 98
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v2, p0, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 103
    .line 104
    invoke-virtual {v2}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->hashCode()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    add-int/2addr v2, v0

    .line 109
    mul-int/2addr v2, v1

    .line 110
    iget-boolean p0, p0, La/gua0;->q:Z

    .line 111
    .line 112
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    add-int/2addr p0, v2

    .line 117
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PolybetState(champsState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/gua0;->a:La/fua0;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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
    iget-object v1, p0, La/gua0;->b:La/rlp;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", query="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/gua0;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", expandedIds="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/gua0;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", expandedGamesIds="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/gua0;->e:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", champSortType="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/gua0;->f:La/zmb;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", showRefreshing="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", subtitleText="

    .line 69
    .line 70
    const-string v2, ", scrollToTop="

    .line 71
    .line 72
    iget-object v3, p0, La/gua0;->h:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v4, p0, La/gua0;->g:Z

    .line 75
    .line 76
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 77
    .line 78
    .line 79
    iget-boolean v1, p0, La/gua0;->i:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", headerStyle="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/gua0;->j:La/h8l0;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", navigationBarSearchViewExpanded="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ", timeFilterChipsVisible="

    .line 100
    .line 101
    const-string v2, ", timeFilters="

    .line 102
    .line 103
    iget-boolean v3, p0, La/gua0;->k:Z

    .line 104
    .line 105
    iget-boolean v4, p0, La/gua0;->l:Z

    .line 106
    .line 107
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, La/gua0;->m:La/a4x;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", timeFilterHolder="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-object v1, p0, La/gua0;->n:La/ghq0;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string v1, ", filtersSelected="

    .line 126
    .line 127
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    iget-boolean v1, p0, La/gua0;->o:Z

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, ", selection="

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget-object v1, p0, La/gua0;->p:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v1, ", showSelectionButton="

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v1, ")"

    .line 151
    .line 152
    iget-boolean p0, p0, La/gua0;->q:Z

    .line 153
    .line 154
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0
.end method
