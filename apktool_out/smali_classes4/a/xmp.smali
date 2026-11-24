.class public final La/xmp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jnb;

.field public final b:La/rlp;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/Set;

.field public final e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Ljava/util/List;

.field public final j:Ljava/lang/String;

.field public final k:Z

.field public final l:La/j700;

.field public final m:La/zmb;

.field public final n:Z


# direct methods
.method public constructor <init>(La/jnb;La/rlp;Ljava/lang/String;Ljava/util/Set;Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZZZLjava/util/List;Ljava/lang/String;ZLa/j700;La/zmb;Z)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/xmp;->a:La/jnb;

    .line 17
    .line 18
    iput-object p2, p0, La/xmp;->b:La/rlp;

    .line 19
    .line 20
    iput-object p3, p0, La/xmp;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, La/xmp;->d:Ljava/util/Set;

    .line 23
    .line 24
    iput-object p5, p0, La/xmp;->e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 25
    .line 26
    iput-boolean p6, p0, La/xmp;->f:Z

    .line 27
    .line 28
    iput-boolean p7, p0, La/xmp;->g:Z

    .line 29
    .line 30
    iput-boolean p8, p0, La/xmp;->h:Z

    .line 31
    .line 32
    iput-object p9, p0, La/xmp;->i:Ljava/util/List;

    .line 33
    .line 34
    iput-object p10, p0, La/xmp;->j:Ljava/lang/String;

    .line 35
    .line 36
    iput-boolean p11, p0, La/xmp;->k:Z

    .line 37
    .line 38
    iput-object p12, p0, La/xmp;->l:La/j700;

    .line 39
    .line 40
    iput-object p13, p0, La/xmp;->m:La/zmb;

    .line 41
    .line 42
    iput-boolean p14, p0, La/xmp;->n:Z

    .line 43
    .line 44
    return-void
.end method

.method public static a(La/xmp;La/jnb;La/rlp;Ljava/lang/String;Ljava/util/LinkedHashSet;Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZZLjava/util/List;ZLa/zmb;ZI)La/xmp;
    .locals 18

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
    iget-object v2, v0, La/xmp;->a:La/jnb;

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
    iget-object v2, v0, La/xmp;->b:La/rlp;

    .line 20
    .line 21
    move-object v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/xmp;->c:Ljava/lang/String;

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
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    iget-object v2, v0, La/xmp;->d:Ljava/util/Set;

    .line 40
    .line 41
    move-object v7, v2

    .line 42
    goto :goto_3

    .line 43
    :cond_3
    move-object/from16 v7, p4

    .line 44
    .line 45
    :goto_3
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-object v2, v0, La/xmp;->e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 50
    .line 51
    move-object v8, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move-object/from16 v8, p5

    .line 54
    .line 55
    :goto_4
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget-boolean v2, v0, La/xmp;->f:Z

    .line 60
    .line 61
    move v9, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move/from16 v9, p6

    .line 64
    .line 65
    :goto_5
    and-int/lit8 v2, v1, 0x40

    .line 66
    .line 67
    if-eqz v2, :cond_6

    .line 68
    .line 69
    iget-boolean v2, v0, La/xmp;->g:Z

    .line 70
    .line 71
    :goto_6
    move v10, v2

    .line 72
    goto :goto_7

    .line 73
    :cond_6
    const/4 v2, 0x0

    .line 74
    goto :goto_6

    .line 75
    :goto_7
    and-int/lit16 v2, v1, 0x80

    .line 76
    .line 77
    if-eqz v2, :cond_7

    .line 78
    .line 79
    iget-boolean v2, v0, La/xmp;->h:Z

    .line 80
    .line 81
    move v11, v2

    .line 82
    goto :goto_8

    .line 83
    :cond_7
    move/from16 v11, p7

    .line 84
    .line 85
    :goto_8
    and-int/lit16 v2, v1, 0x100

    .line 86
    .line 87
    if-eqz v2, :cond_8

    .line 88
    .line 89
    iget-object v2, v0, La/xmp;->i:Ljava/util/List;

    .line 90
    .line 91
    move-object v12, v2

    .line 92
    goto :goto_9

    .line 93
    :cond_8
    move-object/from16 v12, p8

    .line 94
    .line 95
    :goto_9
    iget-object v13, v0, La/xmp;->j:Ljava/lang/String;

    .line 96
    .line 97
    and-int/lit16 v2, v1, 0x400

    .line 98
    .line 99
    if-eqz v2, :cond_9

    .line 100
    .line 101
    iget-boolean v2, v0, La/xmp;->k:Z

    .line 102
    .line 103
    move v14, v2

    .line 104
    goto :goto_a

    .line 105
    :cond_9
    move/from16 v14, p9

    .line 106
    .line 107
    :goto_a
    iget-object v15, v0, La/xmp;->l:La/j700;

    .line 108
    .line 109
    and-int/lit16 v2, v1, 0x1000

    .line 110
    .line 111
    if-eqz v2, :cond_a

    .line 112
    .line 113
    iget-object v2, v0, La/xmp;->m:La/zmb;

    .line 114
    .line 115
    move-object/from16 v16, v2

    .line 116
    .line 117
    goto :goto_b

    .line 118
    :cond_a
    move-object/from16 v16, p10

    .line 119
    .line 120
    :goto_b
    and-int/lit16 v1, v1, 0x2000

    .line 121
    .line 122
    if-eqz v1, :cond_b

    .line 123
    .line 124
    iget-boolean v1, v0, La/xmp;->n:Z

    .line 125
    .line 126
    move/from16 v17, v1

    .line 127
    .line 128
    goto :goto_c

    .line 129
    :cond_b
    move/from16 v17, p11

    .line 130
    .line 131
    :goto_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v3, La/xmp;

    .line 153
    .line 154
    invoke-direct/range {v3 .. v17}, La/xmp;-><init>(La/jnb;La/rlp;Ljava/lang/String;Ljava/util/Set;Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZZZLjava/util/List;Ljava/lang/String;ZLa/j700;La/zmb;Z)V

    .line 155
    .line 156
    .line 157
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
    instance-of v0, p1, La/xmp;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/xmp;

    .line 12
    .line 13
    iget-object v0, p0, La/xmp;->a:La/jnb;

    .line 14
    .line 15
    iget-object v1, p1, La/xmp;->a:La/jnb;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/jnb;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xmp;->b:La/rlp;

    .line 26
    .line 27
    iget-object v1, p1, La/xmp;->b:La/rlp;

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
    iget-object v0, p0, La/xmp;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/xmp;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xmp;->d:Ljava/util/Set;

    .line 49
    .line 50
    iget-object v1, p1, La/xmp;->d:Ljava/util/Set;

    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-object v0, p0, La/xmp;->e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 60
    .line 61
    iget-object v1, p1, La/xmp;->e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_6

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_6
    iget-boolean v0, p0, La/xmp;->f:Z

    .line 71
    .line 72
    iget-boolean v1, p1, La/xmp;->f:Z

    .line 73
    .line 74
    if-eq v0, v1, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-boolean v0, p0, La/xmp;->g:Z

    .line 78
    .line 79
    iget-boolean v1, p1, La/xmp;->g:Z

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-boolean v0, p0, La/xmp;->h:Z

    .line 85
    .line 86
    iget-boolean v1, p1, La/xmp;->h:Z

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget-object v0, p0, La/xmp;->i:Ljava/util/List;

    .line 92
    .line 93
    iget-object v1, p1, La/xmp;->i:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_a

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_a
    iget-object v0, p0, La/xmp;->j:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v1, p1, La/xmp;->j:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_b

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_b
    iget-boolean v0, p0, La/xmp;->k:Z

    .line 114
    .line 115
    iget-boolean v1, p1, La/xmp;->k:Z

    .line 116
    .line 117
    if-eq v0, v1, :cond_c

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_c
    iget-object v0, p0, La/xmp;->l:La/j700;

    .line 121
    .line 122
    iget-object v1, p1, La/xmp;->l:La/j700;

    .line 123
    .line 124
    if-eq v0, v1, :cond_d

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_d
    iget-object v0, p0, La/xmp;->m:La/zmb;

    .line 128
    .line 129
    iget-object v1, p1, La/xmp;->m:La/zmb;

    .line 130
    .line 131
    if-eq v0, v1, :cond_e

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_e
    iget-boolean p0, p0, La/xmp;->n:Z

    .line 135
    .line 136
    iget-boolean p1, p1, La/xmp;->n:Z

    .line 137
    .line 138
    if-eq p0, p1, :cond_f

    .line 139
    .line 140
    :goto_0
    const/4 p0, 0x0

    .line 141
    return p0

    .line 142
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 143
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/xmp;->a:La/jnb;

    .line 2
    .line 3
    invoke-virtual {v0}, La/jnb;->hashCode()I

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
    iget-object v2, p0, La/xmp;->b:La/rlp;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v2}, La/rlp;->hashCode()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    :goto_0
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object v2, p0, La/xmp;->c:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/xmp;->d:Ljava/util/Set;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/ohs0;->g(Ljava/util/Set;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/xmp;->e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 35
    .line 36
    invoke-virtual {v2}, Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-boolean v0, p0, La/xmp;->f:Z

    .line 43
    .line 44
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/xmp;->g:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/xmp;->h:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/xmp;->i:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/xmp;->j:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/xmp;->k:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, La/xmp;->l:La/j700;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    add-int/2addr v2, v0

    .line 85
    mul-int/2addr v2, v1

    .line 86
    iget-object v0, p0, La/xmp;->m:La/zmb;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    add-int/2addr v0, v2

    .line 93
    mul-int/2addr v0, v1

    .line 94
    iget-boolean p0, p0, La/xmp;->n:Z

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FeedsChampsItemsState(champsWithLiveTabs="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/xmp;->a:La/jnb;

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
    iget-object v1, p0, La/xmp;->b:La/rlp;

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
    iget-object v1, p0, La/xmp;->c:Ljava/lang/String;

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
    iget-object v1, p0, La/xmp;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", selection="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/xmp;->e:Lorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", showRefreshing="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-boolean v1, p0, La/xmp;->f:Z

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", showShimmers="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", showConnectionError="

    .line 69
    .line 70
    const-string v2, ", expandedGamesIds="

    .line 71
    .line 72
    iget-boolean v3, p0, La/xmp;->g:Z

    .line 73
    .line 74
    iget-boolean v4, p0, La/xmp;->h:Z

    .line 75
    .line 76
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 77
    .line 78
    .line 79
    const-string v1, ", subtitleText="

    .line 80
    .line 81
    const-string v2, ", showSelectionButton="

    .line 82
    .line 83
    iget-object v3, p0, La/xmp;->j:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p0, La/xmp;->i:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v1, v3, v2, v0, v4}, La/h97;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v1, p0, La/xmp;->k:Z

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", screenType="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, La/xmp;->l:La/j700;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", champSortType="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, La/xmp;->m:La/zmb;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", scrollToTop="

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-boolean p0, p0, La/xmp;->n:Z

    .line 121
    .line 122
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string p0, ")"

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0
.end method
