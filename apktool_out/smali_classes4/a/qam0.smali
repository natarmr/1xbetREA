.class public final La/qam0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public final c:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(La/vby;La/q7d0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/qam0;->a:La/q7d0;

    .line 11
    .line 12
    iput-object p1, p0, La/qam0;->b:La/vby;

    .line 13
    .line 14
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/qam0;->c:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/Set;
    .locals 7

    .line 1
    iget-object p0, p0, La/qam0;->b:La/vby;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/zw3;

    .line 7
    .line 8
    sget-object v1, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->Companion:La/z9m0;

    .line 9
    .line 10
    invoke-virtual {v1}, La/z9m0;->serializer()La/jiy;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/util/Set;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :catch_0
    invoke-virtual {p0, p1}, La/vby;->e(Ljava/lang/String;)La/mcy;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, La/ncy;->h(La/mcy;)La/yby;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/yby;->a:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_c

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/mcy;

    .line 55
    .line 56
    invoke-static {v0}, La/ncy;->i(La/mcy;)La/edy;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "statId"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/edy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, La/mcy;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    if-eqz v1, :cond_6

    .line 70
    .line 71
    invoke-static {v1}, La/ncy;->j(La/mcy;)La/jdy;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :try_start_1
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 76
    .line 77
    invoke-static {v1}, La/ncy;->g(La/jdy;)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    sget-object v4, La/t9m0;->b:La/s9m0;

    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v4, La/u9m0;->a:Ljava/util/Map;

    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    sget-object v4, La/t9m0;->h2:La/c0o;

    .line 111
    .line 112
    invoke-virtual {v4}, La/b3;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-eqz v5, :cond_2

    .line 121
    .line 122
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    move-object v6, v5

    .line 127
    check-cast v6, La/t9m0;

    .line 128
    .line 129
    iget-short v6, v6, La/t9m0;->a:S

    .line 130
    .line 131
    if-ne v6, v3, :cond_1

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_2
    move-object v5, v2

    .line 135
    :goto_1
    check-cast v5, La/t9m0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    move-object v5, v2

    .line 139
    goto :goto_2

    .line 140
    :catchall_0
    move-exception v3

    .line 141
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 142
    .line 143
    new-instance v5, La/g0g0;

    .line 144
    .line 145
    invoke-direct {v5, v3}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :goto_2
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 149
    .line 150
    instance-of v3, v5, La/g0g0;

    .line 151
    .line 152
    if-eqz v3, :cond_4

    .line 153
    .line 154
    move-object v5, v2

    .line 155
    :cond_4
    check-cast v5, La/t9m0;

    .line 156
    .line 157
    if-nez v5, :cond_7

    .line 158
    .line 159
    :try_start_2
    invoke-virtual {v1}, La/jdy;->b()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v1}, La/t9m0;->valueOf(Ljava/lang/String;)La/t9m0;

    .line 164
    .line 165
    .line 166
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 167
    goto :goto_3

    .line 168
    :catchall_1
    move-exception v1

    .line 169
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 170
    .line 171
    new-instance v3, La/g0g0;

    .line 172
    .line 173
    invoke-direct {v3, v1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    move-object v1, v3

    .line 177
    :goto_3
    nop

    .line 178
    instance-of v3, v1, La/g0g0;

    .line 179
    .line 180
    if-eqz v3, :cond_5

    .line 181
    .line 182
    move-object v1, v2

    .line 183
    :cond_5
    move-object v5, v1

    .line 184
    check-cast v5, La/t9m0;

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_6
    move-object v5, v2

    .line 188
    :cond_7
    :goto_4
    const-string v1, "statPosition"

    .line 189
    .line 190
    invoke-virtual {v0, v1}, La/edy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, La/mcy;

    .line 195
    .line 196
    if-eqz v1, :cond_8

    .line 197
    .line 198
    invoke-static {v1}, La/ncy;->j(La/mcy;)La/jdy;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v1}, La/ncy;->g(La/jdy;)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    goto :goto_5

    .line 207
    :cond_8
    move-object v1, v2

    .line 208
    :goto_5
    const-string v3, "selected"

    .line 209
    .line 210
    invoke-virtual {v0, v3}, La/edy;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, La/mcy;

    .line 215
    .line 216
    if-eqz v0, :cond_9

    .line 217
    .line 218
    invoke-static {v0}, La/ncy;->j(La/mcy;)La/jdy;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0}, La/jdy;->b()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, La/wsm0;->b(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    goto :goto_6

    .line 231
    :cond_9
    move-object v0, v2

    .line 232
    :goto_6
    if-eqz v5, :cond_b

    .line 233
    .line 234
    if-eqz v1, :cond_b

    .line 235
    .line 236
    if-nez v0, :cond_a

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_a
    new-instance v2, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    invoke-direct {v2, v5, v1, v0}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;-><init>(La/t9m0;IZ)V

    .line 250
    .line 251
    .line 252
    :cond_b
    :goto_7
    if-eqz v2, :cond_0

    .line 253
    .line 254
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_c
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0
.end method

.method public final b(La/dam0;)Ljava/util/Set;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const-string p1, "POST_GAME_"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    const-string p1, "GAME_"

    .line 22
    .line 23
    :goto_0
    const-string v0, "STATISTIC_BLOCKS_PREF_KEY"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, La/qam0;->a:La/q7d0;

    .line 30
    .line 31
    invoke-static {v0, p1}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    const-string v1, ""

    .line 38
    .line 39
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    sget-object p0, La/xun;->a:La/xun;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_3
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 49
    .line 50
    invoke-virtual {p0, v1}, La/qam0;->a(Ljava/lang/String;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v2

    .line 56
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 57
    .line 58
    new-instance v3, La/g0g0;

    .line 59
    .line 60
    invoke-direct {v3, v2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v2, v3

    .line 64
    :goto_1
    invoke-static {v2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-nez v3, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    sget-object v2, La/xun;->a:La/xun;

    .line 72
    .line 73
    :goto_2
    check-cast v2, Ljava/util/Set;

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    :try_start_1
    iget-object p0, p0, La/qam0;->b:La/vby;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v3, La/zw3;

    .line 88
    .line 89
    sget-object v4, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlockModel;->Companion:La/z9m0;

    .line 90
    .line 91
    invoke-virtual {v4}, La/z9m0;->serializer()La/jiy;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const/4 v5, 0x2

    .line 96
    invoke-direct {v3, v4, v5}, La/zw3;-><init>(La/jiy;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v3, v2}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_6

    .line 108
    .line 109
    invoke-virtual {v0, p1, p0}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :catchall_1
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 114
    .line 115
    :cond_6
    :goto_3
    return-object v2
.end method
