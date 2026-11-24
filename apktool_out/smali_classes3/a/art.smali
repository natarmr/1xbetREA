.class public final La/art;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-static {v1, v2}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v3, 0xa

    .line 28
    .line 29
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :goto_0
    move-object v3, v1

    .line 41
    check-cast v3, La/kkx;

    .line 42
    .line 43
    iget-boolean v3, v3, La/kkx;->c:Z

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    move-object v3, v1

    .line 48
    check-cast v3, La/bkx;

    .line 49
    .line 50
    invoke-virtual {v3}, La/bkx;->nextInt()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {v0, v3}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    return-object v2
.end method

.method public static b(Ljava/lang/String;)La/orz;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/orz;->b:La/orz;

    .line 5
    .line 6
    const-string v1, "ACTIVE"

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, La/orz;->c:La/orz;

    .line 16
    .line 17
    const-string v1, "PENDING"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    sget-object v0, La/orz;->d:La/orz;

    .line 27
    .line 28
    const-string v1, "INACTIVE"

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public static c(I)Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;
    .locals 3

    .line 1
    sget-object v0, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->c:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne p0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->d:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne p0, v2, :cond_1

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_1
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->e:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-ne p0, v2, :cond_2

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_2
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->f:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    if-ne p0, v2, :cond_3

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_3
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->g:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 26
    .line 27
    const/16 v2, 0xa

    .line 28
    .line 29
    if-ne p0, v2, :cond_4

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_4
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->h:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 33
    .line 34
    const/16 v2, 0xb

    .line 35
    .line 36
    if-ne p0, v2, :cond_5

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_5
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->i:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 40
    .line 41
    const/16 v2, 0xc

    .line 42
    .line 43
    if-ne p0, v2, :cond_6

    .line 44
    .line 45
    return-object v1

    .line 46
    :cond_6
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->j:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 47
    .line 48
    const/16 v2, 0x14

    .line 49
    .line 50
    if-ne p0, v2, :cond_7

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_7
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->k:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 54
    .line 55
    const/16 v2, 0x15

    .line 56
    .line 57
    if-ne p0, v2, :cond_8

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_8
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->l:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 61
    .line 62
    const/16 v2, 0x16

    .line 63
    .line 64
    if-ne p0, v2, :cond_9

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_9
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->m:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 68
    .line 69
    const/16 v2, 0x1e

    .line 70
    .line 71
    if-ne p0, v2, :cond_a

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_a
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->n:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 75
    .line 76
    const/16 v2, 0x1f

    .line 77
    .line 78
    if-ne p0, v2, :cond_b

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_b
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->o:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 82
    .line 83
    const/16 v2, 0x20

    .line 84
    .line 85
    if-ne p0, v2, :cond_c

    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_c
    sget-object v1, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->p:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 89
    .line 90
    const/16 v2, 0x21

    .line 91
    .line 92
    if-ne p0, v2, :cond_d

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_d
    :goto_0
    return-object v0
.end method

.method public static d(La/t730;)La/aw20;
    .locals 8

    .line 1
    sget-object v0, La/t730;->a:La/t730;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    new-instance v1, La/aw20;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sget-object v2, La/urv;->d:La/urv;

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    sget-object v2, La/urv;->b:La/trv;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v2, La/urv;->c:La/urv;

    .line 21
    .line 22
    :goto_1
    sget-object v3, La/sw20;->b:La/rw20;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v3, La/sw20;->c:La/sw20;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object v0, La/i0d;->d:La/i0d;

    .line 32
    .line 33
    :goto_2
    move-object v4, v0

    .line 34
    goto :goto_3

    .line 35
    :cond_2
    sget-object v0, La/i0d;->b:La/h0d;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v0, La/i0d;->c:La/i0d;

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :goto_3
    sget-object v0, La/s4d;->b:La/r4d;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v5, La/s4d;->c:La/s4d;

    .line 49
    .line 50
    sget-object v0, La/qy20;->b:La/htz;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v6, La/qy20;->c:La/qy20;

    .line 56
    .line 57
    move-object v7, p0

    .line 58
    invoke-direct/range {v1 .. v7}, La/aw20;-><init>(La/urv;La/sw20;La/i0d;La/s4d;La/qy20;La/t730;)V

    .line 59
    .line 60
    .line 61
    return-object v1
.end method

.method public static e(La/a5w;La/f8w;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZLa/gx7;)Ljava/util/List;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    iget-object v2, v1, La/gx7;->c:La/b3f;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->c:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 17
    .line 18
    instance-of v4, v0, La/vw4;

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    sget-object v6, La/iy4;->b:La/iy4;

    .line 23
    .line 24
    sget-object v7, La/iy4;->c:La/iy4;

    .line 25
    .line 26
    filled-new-array {v6, v7}, [La/iy4;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {v6}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    move-object v7, v0

    .line 35
    check-cast v7, La/vw4;

    .line 36
    .line 37
    iget-object v7, v7, La/vw4;->g:La/iy4;

    .line 38
    .line 39
    invoke-interface {v6, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v7, 0x0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    move-object v7, v3

    .line 49
    :goto_1
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->d:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 50
    .line 51
    iget-object v6, v1, La/gx7;->a:La/gm7;

    .line 52
    .line 53
    iget-boolean v8, v2, La/b3f;->c:Z

    .line 54
    .line 55
    instance-of v9, v0, La/for0;

    .line 56
    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    move-object v9, v0

    .line 60
    check-cast v9, La/for0;

    .line 61
    .line 62
    iget-object v10, v9, La/for0;->g:La/i0w;

    .line 63
    .line 64
    sget-object v11, La/i0w;->i:La/i0w;

    .line 65
    .line 66
    if-eq v10, v11, :cond_4

    .line 67
    .line 68
    sget-object v11, La/i0w;->f:La/i0w;

    .line 69
    .line 70
    if-eq v10, v11, :cond_4

    .line 71
    .line 72
    iget-object v9, v9, La/for0;->b:La/q4f;

    .line 73
    .line 74
    sget-object v10, La/q4f;->u:La/q4f;

    .line 75
    .line 76
    if-eq v9, v10, :cond_4

    .line 77
    .line 78
    if-eqz v8, :cond_4

    .line 79
    .line 80
    sget-object v8, La/q4f;->y:La/q4f;

    .line 81
    .line 82
    if-eq v9, v8, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    instance-of v9, v0, La/kzv;

    .line 86
    .line 87
    if-eqz v9, :cond_3

    .line 88
    .line 89
    move-object v9, v0

    .line 90
    check-cast v9, La/kzv;

    .line 91
    .line 92
    iget-boolean v9, v9, La/kzv;->I:Z

    .line 93
    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    if-eqz v8, :cond_4

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_3
    if-eqz v4, :cond_4

    .line 100
    .line 101
    move-object v9, v0

    .line 102
    check-cast v9, La/vw4;

    .line 103
    .line 104
    iget-boolean v9, v9, La/vw4;->G:Z

    .line 105
    .line 106
    if-eqz v9, :cond_4

    .line 107
    .line 108
    if-eqz v8, :cond_4

    .line 109
    .line 110
    :goto_2
    move-object v8, v3

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    const/4 v8, 0x0

    .line 113
    :goto_3
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->e:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 114
    .line 115
    iget-boolean v9, v6, La/gm7;->l:Z

    .line 116
    .line 117
    sget-object v10, La/f8w;->b:La/f8w;

    .line 118
    .line 119
    move-object/from16 v13, p1

    .line 120
    .line 121
    if-ne v13, v10, :cond_6

    .line 122
    .line 123
    :cond_5
    const-wide/16 v15, 0x0

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    instance-of v10, v0, La/kzv;

    .line 127
    .line 128
    if-eqz v10, :cond_5

    .line 129
    .line 130
    move-object v13, v0

    .line 131
    check-cast v13, La/kzv;

    .line 132
    .line 133
    iget-object v13, v13, La/kzv;->g:La/i0w;

    .line 134
    .line 135
    sget-object v14, La/i0w;->b:La/i0w;

    .line 136
    .line 137
    if-ne v13, v14, :cond_5

    .line 138
    .line 139
    if-eqz v10, :cond_5

    .line 140
    .line 141
    sget-object v13, La/q4f;->c:La/q4f;

    .line 142
    .line 143
    sget-object v14, La/q4f;->d:La/q4f;

    .line 144
    .line 145
    filled-new-array {v13, v14}, [La/q4f;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    invoke-static {v13}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    move-object v14, v0

    .line 154
    check-cast v14, La/kzv;

    .line 155
    .line 156
    iget-object v15, v14, La/kzv;->b:La/q4f;

    .line 157
    .line 158
    invoke-interface {v13, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_5

    .line 163
    .line 164
    iget-boolean v13, v14, La/kzv;->H:Z

    .line 165
    .line 166
    if-eqz v13, :cond_5

    .line 167
    .line 168
    const-wide/16 v15, 0x0

    .line 169
    .line 170
    iget-wide v11, v14, La/kzv;->o:D

    .line 171
    .line 172
    cmpg-double v11, v11, v15

    .line 173
    .line 174
    if-nez v11, :cond_7

    .line 175
    .line 176
    if-eqz v9, :cond_7

    .line 177
    .line 178
    if-eqz v10, :cond_7

    .line 179
    .line 180
    iget-boolean v9, v14, La/kzv;->x:Z

    .line 181
    .line 182
    if-nez v9, :cond_7

    .line 183
    .line 184
    if-eqz v10, :cond_7

    .line 185
    .line 186
    move-object v9, v0

    .line 187
    check-cast v9, La/kzv;

    .line 188
    .line 189
    iget-wide v9, v9, La/kzv;->m:D

    .line 190
    .line 191
    cmpl-double v9, v9, v15

    .line 192
    .line 193
    if-lez v9, :cond_7

    .line 194
    .line 195
    move-object v9, v3

    .line 196
    goto :goto_5

    .line 197
    :cond_7
    :goto_4
    const/4 v9, 0x0

    .line 198
    :goto_5
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->f:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 199
    .line 200
    iget-boolean v10, v6, La/gm7;->q:Z

    .line 201
    .line 202
    if-eqz v4, :cond_8

    .line 203
    .line 204
    move-object v11, v0

    .line 205
    check-cast v11, La/vw4;

    .line 206
    .line 207
    iget-boolean v11, v11, La/vw4;->S:Z

    .line 208
    .line 209
    if-eqz v11, :cond_a

    .line 210
    .line 211
    if-eqz v10, :cond_a

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_8
    instance-of v11, v0, La/kzv;

    .line 215
    .line 216
    if-eqz v11, :cond_a

    .line 217
    .line 218
    move-object v11, v0

    .line 219
    check-cast v11, La/kzv;

    .line 220
    .line 221
    iget-boolean v12, v11, La/kzv;->X:Z

    .line 222
    .line 223
    if-nez v12, :cond_9

    .line 224
    .line 225
    iget-boolean v11, v11, La/kzv;->K:Z

    .line 226
    .line 227
    if-eqz v11, :cond_a

    .line 228
    .line 229
    :cond_9
    if-eqz v10, :cond_a

    .line 230
    .line 231
    :goto_6
    move-object v10, v3

    .line 232
    goto :goto_7

    .line 233
    :cond_a
    const/4 v10, 0x0

    .line 234
    :goto_7
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->g:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 235
    .line 236
    iget-boolean v11, v6, La/gm7;->m:Z

    .line 237
    .line 238
    if-eqz v4, :cond_b

    .line 239
    .line 240
    move-object v12, v0

    .line 241
    check-cast v12, La/vw4;

    .line 242
    .line 243
    iget-boolean v13, v12, La/vw4;->F:Z

    .line 244
    .line 245
    if-eqz v13, :cond_c

    .line 246
    .line 247
    iget-wide v12, v12, La/vw4;->Q:D

    .line 248
    .line 249
    cmpl-double v12, v12, v15

    .line 250
    .line 251
    if-gtz v12, :cond_c

    .line 252
    .line 253
    goto :goto_8

    .line 254
    :cond_b
    instance-of v12, v0, La/kzv;

    .line 255
    .line 256
    if-eqz v12, :cond_c

    .line 257
    .line 258
    move-object v12, v0

    .line 259
    check-cast v12, La/kzv;

    .line 260
    .line 261
    iget-boolean v13, v12, La/kzv;->H:Z

    .line 262
    .line 263
    if-eqz v13, :cond_c

    .line 264
    .line 265
    iget-wide v12, v12, La/kzv;->V:D

    .line 266
    .line 267
    cmpl-double v12, v12, v15

    .line 268
    .line 269
    if-gtz v12, :cond_c

    .line 270
    .line 271
    :goto_8
    if-nez p3, :cond_c

    .line 272
    .line 273
    if-eqz v11, :cond_c

    .line 274
    .line 275
    move-object v11, v3

    .line 276
    goto :goto_9

    .line 277
    :cond_c
    const/4 v11, 0x0

    .line 278
    :goto_9
    sget-object v3, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->h:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 279
    .line 280
    iget-boolean v6, v6, La/gm7;->k:Z

    .line 281
    .line 282
    instance-of v12, v0, La/kzv;

    .line 283
    .line 284
    if-eqz v12, :cond_d

    .line 285
    .line 286
    if-eqz v12, :cond_d

    .line 287
    .line 288
    move-object v13, v0

    .line 289
    check-cast v13, La/kzv;

    .line 290
    .line 291
    iget-object v13, v13, La/kzv;->g:La/i0w;

    .line 292
    .line 293
    sget-object v14, La/i0w;->b:La/i0w;

    .line 294
    .line 295
    if-ne v13, v14, :cond_d

    .line 296
    .line 297
    if-eqz v12, :cond_d

    .line 298
    .line 299
    move-object v13, v0

    .line 300
    check-cast v13, La/kzv;

    .line 301
    .line 302
    iget-wide v13, v13, La/kzv;->m:D

    .line 303
    .line 304
    cmpl-double v13, v13, v15

    .line 305
    .line 306
    if-lez v13, :cond_d

    .line 307
    .line 308
    move-object v13, v0

    .line 309
    check-cast v13, La/kzv;

    .line 310
    .line 311
    iget-object v13, v13, La/kzv;->P:La/nob0;

    .line 312
    .line 313
    iget v13, v13, La/nob0;->a:I

    .line 314
    .line 315
    sget-object v14, La/mob0;->f:La/mob0;

    .line 316
    .line 317
    iget v14, v14, La/mob0;->a:I

    .line 318
    .line 319
    if-eq v13, v14, :cond_d

    .line 320
    .line 321
    if-eqz v6, :cond_d

    .line 322
    .line 323
    goto :goto_a

    .line 324
    :cond_d
    const/4 v3, 0x0

    .line 325
    :goto_a
    sget-object v6, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 326
    .line 327
    iget-boolean v2, v2, La/b3f;->e:Z

    .line 328
    .line 329
    instance-of v13, v0, La/for0;

    .line 330
    .line 331
    if-eqz v13, :cond_e

    .line 332
    .line 333
    sget-object v13, La/i0w;->i:La/i0w;

    .line 334
    .line 335
    sget-object v14, La/i0w;->f:La/i0w;

    .line 336
    .line 337
    filled-new-array {v13, v14}, [La/i0w;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    invoke-static {v13}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    move-object v14, v0

    .line 346
    check-cast v14, La/for0;

    .line 347
    .line 348
    iget-object v5, v14, La/for0;->g:La/i0w;

    .line 349
    .line 350
    invoke-interface {v13, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    if-nez v5, :cond_10

    .line 355
    .line 356
    sget-object v5, La/q4f;->u:La/q4f;

    .line 357
    .line 358
    sget-object v13, La/q4f;->y:La/q4f;

    .line 359
    .line 360
    filled-new-array {v5, v13}, [La/q4f;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-static {v5}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    iget-object v13, v14, La/for0;->b:La/q4f;

    .line 369
    .line 370
    invoke-interface {v5, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    if-nez v5, :cond_10

    .line 375
    .line 376
    if-eqz v2, :cond_10

    .line 377
    .line 378
    goto :goto_b

    .line 379
    :cond_e
    if-eqz v4, :cond_f

    .line 380
    .line 381
    move-object v5, v0

    .line 382
    check-cast v5, La/vw4;

    .line 383
    .line 384
    iget-boolean v5, v5, La/vw4;->G:Z

    .line 385
    .line 386
    if-eqz v5, :cond_10

    .line 387
    .line 388
    if-eqz v2, :cond_10

    .line 389
    .line 390
    goto :goto_b

    .line 391
    :cond_f
    if-eqz v12, :cond_10

    .line 392
    .line 393
    move-object v5, v0

    .line 394
    check-cast v5, La/kzv;

    .line 395
    .line 396
    iget-boolean v5, v5, La/kzv;->I:Z

    .line 397
    .line 398
    if-eqz v5, :cond_10

    .line 399
    .line 400
    if-eqz v2, :cond_10

    .line 401
    .line 402
    :goto_b
    move-object v13, v6

    .line 403
    goto :goto_c

    .line 404
    :cond_10
    const/4 v13, 0x0

    .line 405
    :goto_c
    sget-object v2, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->b:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 406
    .line 407
    iget-object v1, v1, La/gx7;->b:La/q57;

    .line 408
    .line 409
    iget-boolean v1, v1, La/q57;->g:Z

    .line 410
    .line 411
    if-eqz v12, :cond_11

    .line 412
    .line 413
    move-object v5, v0

    .line 414
    check-cast v5, La/kzv;

    .line 415
    .line 416
    iget-object v5, v5, La/kzv;->g:La/i0w;

    .line 417
    .line 418
    sget-object v6, La/i0w;->b:La/i0w;

    .line 419
    .line 420
    if-eq v5, v6, :cond_11

    .line 421
    .line 422
    if-eqz v1, :cond_11

    .line 423
    .line 424
    move-object v14, v2

    .line 425
    goto :goto_d

    .line 426
    :cond_11
    const/4 v14, 0x0

    .line 427
    :goto_d
    sget-object v1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->j:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 428
    .line 429
    if-eqz v12, :cond_12

    .line 430
    .line 431
    move-object v2, v0

    .line 432
    check-cast v2, La/kzv;

    .line 433
    .line 434
    iget-wide v5, v2, La/kzv;->M:D

    .line 435
    .line 436
    cmpl-double v2, v5, v15

    .line 437
    .line 438
    if-lez v2, :cond_13

    .line 439
    .line 440
    goto :goto_e

    .line 441
    :cond_12
    if-eqz v4, :cond_13

    .line 442
    .line 443
    move-object v2, v0

    .line 444
    check-cast v2, La/vw4;

    .line 445
    .line 446
    iget-wide v5, v2, La/vw4;->l:D

    .line 447
    .line 448
    cmpl-double v2, v5, v15

    .line 449
    .line 450
    if-lez v2, :cond_13

    .line 451
    .line 452
    :goto_e
    move-object v15, v1

    .line 453
    goto :goto_f

    .line 454
    :cond_13
    const/4 v15, 0x0

    .line 455
    :goto_f
    sget-object v1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->l:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 456
    .line 457
    if-eqz v4, :cond_14

    .line 458
    .line 459
    move-object v2, v0

    .line 460
    check-cast v2, La/vw4;

    .line 461
    .line 462
    iget-object v2, v2, La/vw4;->g:La/iy4;

    .line 463
    .line 464
    sget-object v4, La/iy4;->b:La/iy4;

    .line 465
    .line 466
    if-ne v2, v4, :cond_14

    .line 467
    .line 468
    sget-object v2, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;->d:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 469
    .line 470
    move-object/from16 v4, p2

    .line 471
    .line 472
    if-ne v4, v2, :cond_14

    .line 473
    .line 474
    move-object/from16 v16, v1

    .line 475
    .line 476
    goto :goto_10

    .line 477
    :cond_14
    const/16 v16, 0x0

    .line 478
    .line 479
    :goto_10
    sget-object v1, Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;->k:Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 480
    .line 481
    if-eqz v12, :cond_15

    .line 482
    .line 483
    check-cast v0, La/kzv;

    .line 484
    .line 485
    iget v2, v0, La/kzv;->t:I

    .line 486
    .line 487
    iget v4, v0, La/kzv;->v:I

    .line 488
    .line 489
    if-le v2, v4, :cond_15

    .line 490
    .line 491
    iget-object v0, v0, La/kzv;->b:La/q4f;

    .line 492
    .line 493
    sget-object v2, La/q4f;->c:La/q4f;

    .line 494
    .line 495
    if-eq v0, v2, :cond_15

    .line 496
    .line 497
    sget-object v2, La/q4f;->j:La/q4f;

    .line 498
    .line 499
    if-eq v0, v2, :cond_15

    .line 500
    .line 501
    sget-object v2, La/q4f;->k:La/q4f;

    .line 502
    .line 503
    if-eq v0, v2, :cond_15

    .line 504
    .line 505
    sget-object v2, La/q4f;->m:La/q4f;

    .line 506
    .line 507
    if-eq v0, v2, :cond_15

    .line 508
    .line 509
    sget-object v2, La/q4f;->x:La/q4f;

    .line 510
    .line 511
    if-eq v0, v2, :cond_15

    .line 512
    .line 513
    move-object/from16 v17, v1

    .line 514
    .line 515
    :goto_11
    move-object v12, v3

    .line 516
    goto :goto_12

    .line 517
    :cond_15
    const/16 v17, 0x0

    .line 518
    .line 519
    goto :goto_11

    .line 520
    :goto_12
    filled-new-array/range {v7 .. v17}, [Lorg/xplatform/bet_history/history/domain/model/HistoryMenuItem;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-static {v0}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    return-object v0
.end method

.method public static f(J)Ljava/util/Date;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/Date;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    invoke-direct {v0, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 21
    .line 22
    .line 23
    const/16 p1, 0xb

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 27
    .line 28
    .line 29
    const/16 p1, 0xc

    .line 30
    .line 31
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0xd

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 37
    .line 38
    .line 39
    const/16 p1, 0xe

    .line 40
    .line 41
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return-object p0
.end method
