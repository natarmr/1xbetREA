.class public abstract La/ij40;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, La/nj40;->a:La/nj40;

    .line 2
    .line 3
    const-string v1, "explane"

    .line 4
    .line 5
    const-string v2, "explaner"

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lkotlin/Pair;

    .line 16
    .line 17
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, La/nj40;->b:La/nj40;

    .line 21
    .line 22
    const-string v1, "jungler"

    .line 23
    .line 24
    const-string v3, "jungle"

    .line 25
    .line 26
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v3, Lkotlin/Pair;

    .line 35
    .line 36
    invoke-direct {v3, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, La/nj40;->c:La/nj40;

    .line 40
    .line 41
    const-string v1, "midlane"

    .line 42
    .line 43
    const-string v4, "midlaner"

    .line 44
    .line 45
    filled-new-array {v1, v4}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v4, Lkotlin/Pair;

    .line 54
    .line 55
    invoke-direct {v4, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, La/nj40;->d:La/nj40;

    .line 59
    .line 60
    const-string v1, "goldlane"

    .line 61
    .line 62
    const-string v5, "goldlaner"

    .line 63
    .line 64
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v5, Lkotlin/Pair;

    .line 73
    .line 74
    invoke-direct {v5, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object v0, La/nj40;->e:La/nj40;

    .line 78
    .line 79
    const-string v1, "roam"

    .line 80
    .line 81
    const-string v6, "roamer"

    .line 82
    .line 83
    filled-new-array {v1, v6}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v6, Lkotlin/Pair;

    .line 92
    .line 93
    invoke-direct {v6, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    filled-new-array {v2, v3, v4, v5, v6}, [Lkotlin/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sput-object v0, La/ij40;->a:Ljava/util/Map;

    .line 105
    .line 106
    return-void
.end method

.method public static final a(Ljava/util/List;)La/hj40;
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/uj40;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v2, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/uj40;

    .line 17
    .line 18
    new-instance v3, La/hj40;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v5, v1, La/uj40;->a:Ljava/lang/String;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v5, v4

    .line 27
    :goto_0
    const-string v6, ""

    .line 28
    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    move-object v5, v6

    .line 32
    :cond_1
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object v7, v1, La/uj40;->b:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object v7, v4

    .line 38
    :goto_1
    invoke-static {v7}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-object v1, v1, La/uj40;->c:Ljava/util/List;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move-object v1, v4

    .line 48
    :goto_2
    invoke-static {v0, v1}, La/ij40;->b(ILjava/util/List;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz p0, :cond_4

    .line 53
    .line 54
    iget-object v1, p0, La/uj40;->a:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move-object v1, v4

    .line 58
    :goto_3
    if-nez v1, :cond_5

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_5
    move-object v6, v1

    .line 62
    :goto_4
    if-eqz p0, :cond_6

    .line 63
    .line 64
    iget-object v1, p0, La/uj40;->b:Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_6
    move-object v1, v4

    .line 68
    :goto_5
    invoke-static {v1}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    if-eqz p0, :cond_7

    .line 73
    .line 74
    iget-object v4, p0, La/uj40;->c:Ljava/util/List;

    .line 75
    .line 76
    :cond_7
    invoke-static {v2, v4}, La/ij40;->b(ILjava/util/List;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    move-object v4, v5

    .line 81
    move-object v5, v7

    .line 82
    move-object v7, v6

    .line 83
    move-object v6, v0

    .line 84
    invoke-direct/range {v3 .. v9}, La/hj40;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    return-object v3
.end method

.method public static final b(ILjava/util/List;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_c

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v3, 0xa

    .line 9
    .line 10
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_b

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    add-int/lit8 v6, v4, 0x1

    .line 33
    .line 34
    if-ltz v4, :cond_a

    .line 35
    .line 36
    check-cast v5, La/mj40;

    .line 37
    .line 38
    new-instance v7, La/jj40;

    .line 39
    .line 40
    iget-object v8, v5, La/mj40;->a:Ljava/lang/String;

    .line 41
    .line 42
    const-string v9, ""

    .line 43
    .line 44
    if-nez v8, :cond_0

    .line 45
    .line 46
    move-object v8, v9

    .line 47
    :cond_0
    new-instance v10, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move/from16 v4, p0

    .line 56
    .line 57
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    iget-object v10, v5, La/mj40;->a:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v10, :cond_1

    .line 67
    .line 68
    move-object v10, v9

    .line 69
    :cond_1
    iget-object v11, v5, La/mj40;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v11}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v11

    .line 75
    iget-object v12, v5, La/mj40;->d:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v12}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    iget-object v13, v5, La/mj40;->c:Ljava/lang/String;

    .line 82
    .line 83
    if-nez v13, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    move-object v9, v13

    .line 87
    :goto_1
    new-instance v13, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    const/4 v15, 0x0

    .line 97
    :goto_2
    if-ge v15, v14, :cond_4

    .line 98
    .line 99
    invoke-virtual {v9, v15}, Ljava/lang/String;->charAt(I)C

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 104
    .line 105
    .line 106
    move-result v16

    .line 107
    if-eqz v16, :cond_3

    .line 108
    .line 109
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 110
    .line 111
    .line 112
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_4
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 120
    .line 121
    invoke-virtual {v3, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget-object v9, La/ij40;->a:Ljava/util/Map;

    .line 129
    .line 130
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    check-cast v9, Ljava/lang/Iterable;

    .line 135
    .line 136
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_6

    .line 145
    .line 146
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    move-object v14, v13

    .line 151
    check-cast v14, Ljava/util/Map$Entry;

    .line 152
    .line 153
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v14

    .line 157
    check-cast v14, Ljava/util/Set;

    .line 158
    .line 159
    invoke-interface {v14, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    if-eqz v14, :cond_5

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_6
    move-object v13, v1

    .line 167
    :goto_3
    check-cast v13, Ljava/util/Map$Entry;

    .line 168
    .line 169
    if-eqz v13, :cond_7

    .line 170
    .line 171
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, La/nj40;

    .line 176
    .line 177
    if-nez v3, :cond_8

    .line 178
    .line 179
    :cond_7
    sget-object v3, La/nj40;->f:La/nj40;

    .line 180
    .line 181
    :cond_8
    iget-object v5, v5, La/mj40;->e:La/rj40;

    .line 182
    .line 183
    if-eqz v5, :cond_9

    .line 184
    .line 185
    new-instance v9, La/oj40;

    .line 186
    .line 187
    iget-object v13, v5, La/rj40;->a:Ljava/lang/Integer;

    .line 188
    .line 189
    iget-object v14, v5, La/rj40;->b:Ljava/lang/Integer;

    .line 190
    .line 191
    iget-object v5, v5, La/rj40;->c:Ljava/lang/Integer;

    .line 192
    .line 193
    invoke-direct {v9, v13, v14, v5}, La/oj40;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 194
    .line 195
    .line 196
    :goto_4
    move-object v13, v9

    .line 197
    move-object v9, v10

    .line 198
    move-object v10, v11

    .line 199
    move-object v11, v12

    .line 200
    move-object v12, v3

    .line 201
    goto :goto_5

    .line 202
    :cond_9
    new-instance v9, La/oj40;

    .line 203
    .line 204
    invoke-direct {v9, v1, v1, v1}, La/oj40;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_5
    invoke-direct/range {v7 .. v13}, La/jj40;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/nj40;La/oj40;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move v4, v6

    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 218
    .line 219
    .line 220
    throw v1

    .line 221
    :cond_b
    move-object v1, v2

    .line 222
    :cond_c
    if-nez v1, :cond_d

    .line 223
    .line 224
    sget-object v0, La/iun;->a:La/iun;

    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_d
    return-object v1
.end method
