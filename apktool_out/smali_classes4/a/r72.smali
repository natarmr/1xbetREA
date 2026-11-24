.class public final La/r72;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/r72;->i:B

    iput-object p1, p0, La/r72;->j:Ljava/lang/Object;

    iput-object p2, p0, La/r72;->k:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method private final G(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/r72;->k:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/dat0;

    .line 6
    .line 7
    iget-object v2, v1, La/dat0;->p:La/hzg;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, La/r72;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/s9t0;

    .line 17
    .line 18
    sget-object v3, La/p9t0;->a:La/p9t0;

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    sget v0, La/dat0;->y:I

    .line 27
    .line 28
    check-cast v2, La/uzg;

    .line 29
    .line 30
    invoke-virtual {v2}, La/uzg;->a()V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    sget-object v3, La/q9t0;->a:La/q9t0;

    .line 36
    .line 37
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    sget v0, La/dat0;->y:I

    .line 44
    .line 45
    invoke-virtual {v1}, La/dat0;->M()V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    sget-object v3, La/r9t0;->a:La/r9t0;

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v3, 0x0

    .line 57
    if-eqz v0, :cond_9

    .line 58
    .line 59
    sget v0, La/dat0;->y:I

    .line 60
    .line 61
    iget-object v0, v1, La/dat0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

    .line 62
    .line 63
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, La/aat0;

    .line 68
    .line 69
    iget-object v4, v4, La/aat0;->b:La/j0g0;

    .line 70
    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    iget-object v4, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    instance-of v5, v4, La/g0g0;

    .line 76
    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move-object v3, v4

    .line 81
    :goto_0
    check-cast v3, La/fn9;

    .line 82
    .line 83
    :cond_3
    const-wide/16 v4, 0x0

    .line 84
    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    iget-wide v6, v3, La/fn9;->c:J

    .line 88
    .line 89
    move-wide v9, v6

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-wide v9, v4

    .line 92
    :goto_1
    if-eqz v3, :cond_5

    .line 93
    .line 94
    iget-wide v6, v3, La/fn9;->p:J

    .line 95
    .line 96
    move-wide v15, v6

    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move-wide v15, v4

    .line 99
    :goto_2
    iget-object v6, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;->d:Ljava/lang/String;

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    if-eqz v3, :cond_6

    .line 103
    .line 104
    iget-object v8, v3, La/fn9;->r:Ljava/util/List;

    .line 105
    .line 106
    if-eqz v8, :cond_6

    .line 107
    .line 108
    invoke-static {v8}, La/jiq0;->p0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    xor-int/lit8 v8, v8, 0x1

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    move v8, v7

    .line 120
    :goto_3
    if-eqz v3, :cond_7

    .line 121
    .line 122
    iget-object v3, v3, La/fn9;->r:Ljava/util/List;

    .line 123
    .line 124
    if-eqz v3, :cond_7

    .line 125
    .line 126
    invoke-static {v3}, La/vsm0;->k(Ljava/util/List;)Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    :cond_7
    cmp-long v3, v9, v4

    .line 131
    .line 132
    if-lez v3, :cond_8

    .line 133
    .line 134
    iget-wide v3, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;->c:J

    .line 135
    .line 136
    const-wide/16 v11, 0x2e

    .line 137
    .line 138
    cmp-long v3, v3, v11

    .line 139
    .line 140
    if-nez v3, :cond_8

    .line 141
    .line 142
    if-eqz v8, :cond_8

    .line 143
    .line 144
    if-eqz v7, :cond_8

    .line 145
    .line 146
    iget-object v3, v1, La/dat0;->t:La/ih5;

    .line 147
    .line 148
    sget-object v4, La/r1g;->b:La/r1g;

    .line 149
    .line 150
    const-string v4, "descrip_cyber_tournament"

    .line 151
    .line 152
    invoke-virtual {v3, v4}, La/ih5;->o(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v1, La/dat0;->s:La/zr1;

    .line 156
    .line 157
    invoke-virtual {v1, v4}, La/zr1;->x(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-wide v11, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;->c:J

    .line 161
    .line 162
    const/16 v18, 0x1

    .line 163
    .line 164
    move-object v8, v2

    .line 165
    check-cast v8, La/uzg;

    .line 166
    .line 167
    const-wide/16 v13, 0x0

    .line 168
    .line 169
    move-object/from16 v17, v6

    .line 170
    .line 171
    invoke-virtual/range {v8 .. v18}, La/uzg;->p(JJJJLjava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    :cond_8
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 178
    .line 179
    .line 180
    return-object v3
.end method

.method private final H(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/yat0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/nat0;

    .line 13
    .line 14
    sget-object p1, La/lat0;->a:La/lat0;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget p0, La/yat0;->w:I

    .line 23
    .line 24
    iget-object p0, v0, La/yat0;->p:La/hzg;

    .line 25
    .line 26
    check-cast p0, La/uzg;

    .line 27
    .line 28
    invoke-virtual {p0}, La/uzg;->a()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object p1, La/mat0;->a:La/mat0;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    sget p0, La/yat0;->w:I

    .line 41
    .line 42
    invoke-virtual {v0}, La/yat0;->M()V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0
.end method

.method private final I(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, La/wbt0;

    .line 5
    .line 6
    sget-object v0, La/wne;->a:La/wne;

    .line 7
    .line 8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/ibt0;

    .line 14
    .line 15
    sget-object p1, La/ebt0;->a:La/ebt0;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    sget p0, La/wbt0;->E:I

    .line 24
    .line 25
    iget-object p0, v2, La/wbt0;->q:La/hzg;

    .line 26
    .line 27
    check-cast p0, La/uzg;

    .line 28
    .line 29
    invoke-virtual {p0}, La/uzg;->a()V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :cond_0
    sget-object p1, La/gbt0;->a:La/gbt0;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    sget p0, La/wbt0;->E:I

    .line 43
    .line 44
    invoke-virtual {v2}, La/wbt0;->M()V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_1
    instance-of p1, p0, La/fbt0;

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    check-cast p0, La/fbt0;

    .line 55
    .line 56
    sget p1, La/wbt0;->E:I

    .line 57
    .line 58
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, La/ubt0;

    .line 63
    .line 64
    iget-object p1, p1, La/ubt0;->c:La/j0g0;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 69
    .line 70
    instance-of v1, p1, La/g0g0;

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    move-object p1, v0

    .line 75
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    iget p0, p0, La/fbt0;->a:I

    .line 80
    .line 81
    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, Ljava/util/Date;

    .line 86
    .line 87
    if-nez p0, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    :goto_0
    move-object v5, p0

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    :goto_1
    new-instance p0, Ljava/util/Date;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_2
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 99
    .line 100
    iget-object p1, p0, La/ocj;->a:La/p7m0;

    .line 101
    .line 102
    :cond_5
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 110
    .line 111
    move-object v3, p0

    .line 112
    check-cast v3, La/ubt0;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/16 v8, 0x7d

    .line 119
    .line 120
    const/4 v4, 0x0

    .line 121
    const/4 v6, 0x0

    .line 122
    invoke-static/range {v3 .. v8}, La/ubt0;->a(La/ubt0;ZLjava/util/Date;La/j0g0;La/qbt0;I)La/ubt0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p1, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_5

    .line 131
    .line 132
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    new-instance p1, La/n7t0;

    .line 137
    .line 138
    const/4 v1, 0x1

    .line 139
    invoke-direct {p1, v2, v5, v0, v1}, La/n7t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 140
    .line 141
    .line 142
    const/4 v1, 0x3

    .line 143
    invoke-static {p0, v0, v0, p1, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 144
    .line 145
    .line 146
    goto/16 :goto_5

    .line 147
    .line 148
    :cond_6
    instance-of p1, p0, La/hbt0;

    .line 149
    .line 150
    if-eqz p1, :cond_11

    .line 151
    .line 152
    move-object v5, p0

    .line 153
    check-cast v5, La/hbt0;

    .line 154
    .line 155
    iget-wide p0, v5, La/hbt0;->a:J

    .line 156
    .line 157
    sget v1, La/wbt0;->E:I

    .line 158
    .line 159
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, La/ubt0;

    .line 164
    .line 165
    iget-object v1, v1, La/ubt0;->e:La/qbt0;

    .line 166
    .line 167
    if-eqz v1, :cond_a

    .line 168
    .line 169
    iget-object v1, v1, La/qbt0;->b:Ljava/lang/Object;

    .line 170
    .line 171
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 172
    .line 173
    instance-of v3, v1, La/g0g0;

    .line 174
    .line 175
    if-eqz v3, :cond_7

    .line 176
    .line 177
    move-object v1, v0

    .line 178
    :cond_7
    check-cast v1, Ljava/util/List;

    .line 179
    .line 180
    if-eqz v1, :cond_a

    .line 181
    .line 182
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_9

    .line 191
    .line 192
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    move-object v4, v3

    .line 197
    check-cast v4, La/icg;

    .line 198
    .line 199
    iget-wide v6, v4, La/icg;->a:J

    .line 200
    .line 201
    cmp-long v4, v6, p0

    .line 202
    .line 203
    if-nez v4, :cond_8

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_9
    move-object v3, v0

    .line 207
    :goto_3
    check-cast v3, La/icg;

    .line 208
    .line 209
    if-eqz v3, :cond_a

    .line 210
    .line 211
    iget-object v1, v3, La/icg;->n:Ljava/lang/String;

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_a
    move-object v1, v0

    .line 215
    :goto_4
    if-nez v1, :cond_b

    .line 216
    .line 217
    const-string v1, ""

    .line 218
    .line 219
    :cond_b
    move-object v3, v1

    .line 220
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-nez v1, :cond_c

    .line 225
    .line 226
    new-instance p0, La/tbt0;

    .line 227
    .line 228
    iget-object p1, v2, La/wbt0;->p:La/ctf0;

    .line 229
    .line 230
    const/4 v0, 0x0

    .line 231
    new-array v1, v0, [Ljava/lang/Object;

    .line 232
    .line 233
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 234
    .line 235
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    const v1, 0x7f1313ec    # 1.9549996E38f

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-direct {p0, p1}, La/tbt0;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_c
    new-instance v4, La/kie0;

    .line 254
    .line 255
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, La/ubt0;

    .line 263
    .line 264
    iget-object v1, v1, La/ubt0;->e:La/qbt0;

    .line 265
    .line 266
    if-eqz v1, :cond_10

    .line 267
    .line 268
    iget-object v1, v1, La/qbt0;->b:Ljava/lang/Object;

    .line 269
    .line 270
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 271
    .line 272
    instance-of v6, v1, La/g0g0;

    .line 273
    .line 274
    if-eqz v6, :cond_d

    .line 275
    .line 276
    move-object v1, v0

    .line 277
    :cond_d
    check-cast v1, Ljava/util/List;

    .line 278
    .line 279
    if-eqz v1, :cond_10

    .line 280
    .line 281
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_f

    .line 290
    .line 291
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    move-object v7, v6

    .line 296
    check-cast v7, La/icg;

    .line 297
    .line 298
    iget-wide v7, v7, La/icg;->a:J

    .line 299
    .line 300
    cmp-long v7, v7, p0

    .line 301
    .line 302
    if-nez v7, :cond_e

    .line 303
    .line 304
    move-object v0, v6

    .line 305
    :cond_f
    check-cast v0, La/icg;

    .line 306
    .line 307
    if-eqz v0, :cond_10

    .line 308
    .line 309
    iget p0, v0, La/icg;->p:I

    .line 310
    .line 311
    iput p0, v4, La/kie0;->a:I

    .line 312
    .line 313
    iget-object p0, v2, La/wbt0;->r:La/pv00;

    .line 314
    .line 315
    iget-object p1, v2, La/wbt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 316
    .line 317
    iget-object p1, p1, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;->b:Ljava/lang/String;

    .line 318
    .line 319
    invoke-static {v0, p1}, La/vfc;->Q(La/icg;Ljava/lang/String;)La/vcm0;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-virtual {p0, p1}, La/pv00;->n(La/vcm0;)V

    .line 324
    .line 325
    .line 326
    :cond_10
    iget-object p0, v2, La/wbt0;->s:La/i1w0;

    .line 327
    .line 328
    new-instance v1, La/l0i0;

    .line 329
    .line 330
    const/16 v6, 0xd

    .line 331
    .line 332
    invoke-direct/range {v1 .. v6}, La/l0i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 336
    .line 337
    .line 338
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object p0

    .line 341
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 342
    .line 343
    .line 344
    return-object v0
.end method

.method private final J(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/r72;->k:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/jdt0;

    .line 7
    .line 8
    iget-object v1, v3, La/i3t0;->f:La/oyg0;

    .line 9
    .line 10
    iget-object v2, v3, La/i3t0;->i:La/ocj;

    .line 11
    .line 12
    iget-object v8, v3, La/jdt0;->u:La/i1w0;

    .line 13
    .line 14
    iget-object v4, v3, La/jdt0;->t:La/hjd;

    .line 15
    .line 16
    iget-object v5, v3, La/jdt0;->q:La/ctf0;

    .line 17
    .line 18
    iget-object v6, v3, La/jdt0;->G:La/zr1;

    .line 19
    .line 20
    iget-object v7, v3, La/jdt0;->F:La/ih5;

    .line 21
    .line 22
    iget-object v9, v3, La/jdt0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 23
    .line 24
    iget-object v10, v3, La/jdt0;->s:La/hzg;

    .line 25
    .line 26
    sget-object v11, La/wne;->a:La/wne;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v0, La/r72;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, La/u8t0;

    .line 34
    .line 35
    sget-object v11, La/h8t0;->a:La/h8t0;

    .line 36
    .line 37
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    if-eqz v11, :cond_0

    .line 42
    .line 43
    sget v0, La/jdt0;->N:I

    .line 44
    .line 45
    check-cast v10, La/uzg;

    .line 46
    .line 47
    invoke-virtual {v10}, La/uzg;->a()V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_12

    .line 51
    .line 52
    :cond_0
    sget-object v11, La/p8t0;->a:La/p8t0;

    .line 53
    .line 54
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_1

    .line 59
    .line 60
    sget v0, La/jdt0;->N:I

    .line 61
    .line 62
    invoke-virtual {v3}, La/jdt0;->M()V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_12

    .line 66
    .line 67
    :cond_1
    instance-of v11, v0, La/m8t0;

    .line 68
    .line 69
    const/4 v12, 0x2

    .line 70
    const/4 v13, 0x1

    .line 71
    const/4 v14, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    if-eqz v11, :cond_4

    .line 74
    .line 75
    check-cast v0, La/m8t0;

    .line 76
    .line 77
    sget v1, La/jdt0;->N:I

    .line 78
    .line 79
    instance-of v1, v0, La/k8t0;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    new-instance v1, La/did;

    .line 84
    .line 85
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, La/cdt0;

    .line 90
    .line 91
    iget-object v2, v2, La/cdt0;->c:La/xbt0;

    .line 92
    .line 93
    invoke-static {v2}, La/hfm0;->s(La/xbt0;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-direct {v1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 98
    .line 99
    .line 100
    check-cast v0, La/k8t0;

    .line 101
    .line 102
    iget-object v0, v0, La/k8t0;->a:La/uid;

    .line 103
    .line 104
    new-array v2, v12, [La/vid;

    .line 105
    .line 106
    aput-object v1, v2, v15

    .line 107
    .line 108
    aput-object v0, v2, v13

    .line 109
    .line 110
    invoke-static {v3, v4, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 111
    .line 112
    .line 113
    goto/16 :goto_12

    .line 114
    .line 115
    :cond_2
    instance-of v1, v0, La/l8t0;

    .line 116
    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    new-instance v1, La/did;

    .line 120
    .line 121
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, La/cdt0;

    .line 126
    .line 127
    iget-object v2, v2, La/cdt0;->c:La/xbt0;

    .line 128
    .line 129
    invoke-static {v2}, La/hfm0;->s(La/xbt0;)Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-direct {v1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    check-cast v0, La/l8t0;

    .line 137
    .line 138
    iget-object v0, v0, La/l8t0;->a:La/bem;

    .line 139
    .line 140
    invoke-static {v0}, La/ebc;->n0(La/bem;)La/uid;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-array v2, v12, [La/vid;

    .line 145
    .line 146
    aput-object v1, v2, v15

    .line 147
    .line 148
    aput-object v0, v2, v13

    .line 149
    .line 150
    invoke-static {v3, v4, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 151
    .line 152
    .line 153
    goto/16 :goto_12

    .line 154
    .line 155
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 156
    .line 157
    .line 158
    return-object v14

    .line 159
    :cond_4
    instance-of v4, v0, La/o8t0;

    .line 160
    .line 161
    if-eqz v4, :cond_a

    .line 162
    .line 163
    check-cast v0, La/o8t0;

    .line 164
    .line 165
    sget v1, La/jdt0;->N:I

    .line 166
    .line 167
    iget-object v0, v0, La/o8t0;->a:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    sparse-switch v1, :sswitch_data_0

    .line 174
    .line 175
    .line 176
    goto/16 :goto_12

    .line 177
    .line 178
    :sswitch_0
    const-string v1, "HEADER_LIVE_GAMES"

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_5

    .line 185
    .line 186
    goto/16 :goto_12

    .line 187
    .line 188
    :cond_5
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 189
    .line 190
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 191
    .line 192
    iget-wide v1, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 193
    .line 194
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    check-cast v10, La/uzg;

    .line 203
    .line 204
    invoke-virtual {v10, v0, v1, v13}, La/uzg;->d(ILjava/util/List;Z)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_12

    .line 208
    .line 209
    :sswitch_1
    const-string v1, "HEADER_PRIZE_POOL"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_6

    .line 216
    .line 217
    goto/16 :goto_12

    .line 218
    .line 219
    :cond_6
    new-instance v0, La/hdt0;

    .line 220
    .line 221
    invoke-direct {v0, v3, v12}, La/hdt0;-><init>(La/jdt0;B)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_12

    .line 228
    .line 229
    :sswitch_2
    const-string v1, "HEADER_TOURNAMENT_INFO"

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-nez v0, :cond_7

    .line 236
    .line 237
    goto/16 :goto_12

    .line 238
    .line 239
    :cond_7
    new-instance v0, La/hdt0;

    .line 240
    .line 241
    invoke-direct {v0, v3, v13}, La/hdt0;-><init>(La/jdt0;B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_12

    .line 248
    .line 249
    :sswitch_3
    const-string v1, "HEADER_LINE_GAMES"

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_8

    .line 256
    .line 257
    goto/16 :goto_12

    .line 258
    .line 259
    :cond_8
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 260
    .line 261
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 262
    .line 263
    iget-wide v1, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 264
    .line 265
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    check-cast v10, La/uzg;

    .line 274
    .line 275
    invoke-virtual {v10, v0, v1, v15}, La/uzg;->d(ILjava/util/List;Z)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_12

    .line 279
    .line 280
    :sswitch_4
    const-string v1, "HEADER_RESULTS"

    .line 281
    .line 282
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_9

    .line 287
    .line 288
    goto/16 :goto_12

    .line 289
    .line 290
    :cond_9
    new-instance v0, La/hdt0;

    .line 291
    .line 292
    invoke-direct {v0, v3, v15}, La/hdt0;-><init>(La/jdt0;B)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_12

    .line 299
    .line 300
    :cond_a
    instance-of v4, v0, La/j8t0;

    .line 301
    .line 302
    const/4 v11, 0x3

    .line 303
    if-eqz v4, :cond_f

    .line 304
    .line 305
    check-cast v0, La/j8t0;

    .line 306
    .line 307
    sget v4, La/jdt0;->N:I

    .line 308
    .line 309
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    check-cast v4, La/cdt0;

    .line 314
    .line 315
    iget-object v4, v4, La/cdt0;->k:La/j0g0;

    .line 316
    .line 317
    if-eqz v4, :cond_c

    .line 318
    .line 319
    iget-object v4, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 320
    .line 321
    instance-of v5, v4, La/g0g0;

    .line 322
    .line 323
    if-eqz v5, :cond_b

    .line 324
    .line 325
    move-object v4, v14

    .line 326
    :cond_b
    check-cast v4, Ljava/util/List;

    .line 327
    .line 328
    if-eqz v4, :cond_c

    .line 329
    .line 330
    iget v0, v0, La/j8t0;->a:I

    .line 331
    .line 332
    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    check-cast v0, Ljava/util/Date;

    .line 337
    .line 338
    if-nez v0, :cond_d

    .line 339
    .line 340
    :cond_c
    new-instance v0, Ljava/util/Date;

    .line 341
    .line 342
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 343
    .line 344
    .line 345
    :cond_d
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    new-instance v5, La/n7t0;

    .line 350
    .line 351
    invoke-direct {v5, v3, v0, v14, v12}, La/n7t0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 352
    .line 353
    .line 354
    invoke-static {v4, v14, v14, v5, v11}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 355
    .line 356
    .line 357
    iget-object v4, v2, La/ocj;->a:La/p7m0;

    .line 358
    .line 359
    :goto_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-object v15, v2

    .line 367
    check-cast v15, La/cdt0;

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const/16 v20, 0x0

    .line 373
    .line 374
    const/16 v21, 0xdff

    .line 375
    .line 376
    const/16 v16, 0x0

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const/16 v18, 0x0

    .line 381
    .line 382
    move-object/from16 v19, v0

    .line 383
    .line 384
    invoke-static/range {v15 .. v21}, La/cdt0;->a(La/cdt0;ZLa/xbt0;ILjava/util/Date;La/j0g0;I)La/cdt0;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    move-object/from16 v3, v19

    .line 389
    .line 390
    invoke-virtual {v4, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-eqz v0, :cond_e

    .line 395
    .line 396
    sget-object v0, La/rdj;->a:La/rdj;

    .line 397
    .line 398
    sget-object v1, La/sdj;->b:La/sdj;

    .line 399
    .line 400
    const/16 v2, 0x3c

    .line 401
    .line 402
    invoke-static {v0, v1, v3, v14, v2}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-virtual {v7, v0}, La/ih5;->n(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v0}, La/zr1;->o(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    goto/16 :goto_12

    .line 413
    .line 414
    :cond_e
    move-object v0, v3

    .line 415
    goto :goto_0

    .line 416
    :cond_f
    instance-of v4, v0, La/q8t0;

    .line 417
    .line 418
    const-string v16, ""

    .line 419
    .line 420
    if-eqz v4, :cond_1c

    .line 421
    .line 422
    check-cast v0, La/q8t0;

    .line 423
    .line 424
    iget-wide v1, v0, La/q8t0;->a:J

    .line 425
    .line 426
    sget v4, La/jdt0;->N:I

    .line 427
    .line 428
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    check-cast v4, La/cdt0;

    .line 433
    .line 434
    iget-object v4, v4, La/cdt0;->c:La/xbt0;

    .line 435
    .line 436
    if-eqz v4, :cond_14

    .line 437
    .line 438
    iget-object v4, v4, La/xbt0;->j:Ljava/lang/Object;

    .line 439
    .line 440
    sget-object v10, La/j0g0;->b:La/e0g0;

    .line 441
    .line 442
    instance-of v10, v4, La/g0g0;

    .line 443
    .line 444
    if-eqz v10, :cond_10

    .line 445
    .line 446
    move-object v4, v14

    .line 447
    :cond_10
    check-cast v4, La/qbt0;

    .line 448
    .line 449
    if-eqz v4, :cond_14

    .line 450
    .line 451
    iget-object v4, v4, La/qbt0;->b:Ljava/lang/Object;

    .line 452
    .line 453
    instance-of v10, v4, La/g0g0;

    .line 454
    .line 455
    if-eqz v10, :cond_11

    .line 456
    .line 457
    move-object v4, v14

    .line 458
    :cond_11
    check-cast v4, Ljava/util/List;

    .line 459
    .line 460
    if-eqz v4, :cond_14

    .line 461
    .line 462
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    :cond_12
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    if-eqz v10, :cond_13

    .line 471
    .line 472
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v10

    .line 476
    move-object v11, v10

    .line 477
    check-cast v11, La/icg;

    .line 478
    .line 479
    iget-wide v11, v11, La/icg;->a:J

    .line 480
    .line 481
    cmp-long v11, v11, v1

    .line 482
    .line 483
    if-nez v11, :cond_12

    .line 484
    .line 485
    goto :goto_1

    .line 486
    :cond_13
    move-object v10, v14

    .line 487
    :goto_1
    check-cast v10, La/icg;

    .line 488
    .line 489
    if-eqz v10, :cond_14

    .line 490
    .line 491
    iget-object v4, v10, La/icg;->n:Ljava/lang/String;

    .line 492
    .line 493
    goto :goto_2

    .line 494
    :cond_14
    move-object v4, v14

    .line 495
    :goto_2
    if-nez v4, :cond_15

    .line 496
    .line 497
    move-object/from16 v4, v16

    .line 498
    .line 499
    :cond_15
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 500
    .line 501
    .line 502
    move-result v10

    .line 503
    if-nez v10, :cond_16

    .line 504
    .line 505
    new-instance v0, La/dct0;

    .line 506
    .line 507
    new-array v1, v15, [Ljava/lang/Object;

    .line 508
    .line 509
    iget-object v2, v5, La/ctf0;->b:La/lsm0;

    .line 510
    .line 511
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    const v4, 0x7f1313ec    # 1.9549996E38f

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-direct {v0, v1}, La/dct0;-><init>(Ljava/lang/String;)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_12

    .line 529
    .line 530
    :cond_16
    new-instance v5, La/kie0;

    .line 531
    .line 532
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    check-cast v10, La/cdt0;

    .line 540
    .line 541
    iget-object v10, v10, La/cdt0;->c:La/xbt0;

    .line 542
    .line 543
    if-eqz v10, :cond_1b

    .line 544
    .line 545
    iget-object v10, v10, La/xbt0;->j:Ljava/lang/Object;

    .line 546
    .line 547
    sget-object v11, La/j0g0;->b:La/e0g0;

    .line 548
    .line 549
    instance-of v11, v10, La/g0g0;

    .line 550
    .line 551
    if-eqz v11, :cond_17

    .line 552
    .line 553
    move-object v10, v14

    .line 554
    :cond_17
    check-cast v10, La/qbt0;

    .line 555
    .line 556
    if-eqz v10, :cond_1b

    .line 557
    .line 558
    iget-object v10, v10, La/qbt0;->b:Ljava/lang/Object;

    .line 559
    .line 560
    instance-of v11, v10, La/g0g0;

    .line 561
    .line 562
    if-eqz v11, :cond_18

    .line 563
    .line 564
    move-object v10, v14

    .line 565
    :cond_18
    check-cast v10, Ljava/util/List;

    .line 566
    .line 567
    if-eqz v10, :cond_1b

    .line 568
    .line 569
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 570
    .line 571
    .line 572
    move-result-object v10

    .line 573
    :cond_19
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 574
    .line 575
    .line 576
    move-result v11

    .line 577
    if-eqz v11, :cond_1a

    .line 578
    .line 579
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v11

    .line 583
    move-object v12, v11

    .line 584
    check-cast v12, La/icg;

    .line 585
    .line 586
    iget-wide v12, v12, La/icg;->a:J

    .line 587
    .line 588
    cmp-long v12, v12, v1

    .line 589
    .line 590
    if-nez v12, :cond_19

    .line 591
    .line 592
    move-object v14, v11

    .line 593
    :cond_1a
    check-cast v14, La/icg;

    .line 594
    .line 595
    if-eqz v14, :cond_1b

    .line 596
    .line 597
    iget v1, v14, La/icg;->p:I

    .line 598
    .line 599
    iput v1, v5, La/kie0;->a:I

    .line 600
    .line 601
    iget-object v1, v3, La/jdt0;->v:La/pv00;

    .line 602
    .line 603
    iget-object v2, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->b:Ljava/lang/String;

    .line 604
    .line 605
    invoke-static {v14, v2}, La/vfc;->Q(La/icg;Ljava/lang/String;)La/vcm0;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-virtual {v1, v2}, La/pv00;->n(La/vcm0;)V

    .line 610
    .line 611
    .line 612
    :cond_1b
    iget-object v1, v7, La/ih5;->a:La/kt2;

    .line 613
    .line 614
    sget-object v2, La/r1g;->b:La/r1g;

    .line 615
    .line 616
    const-string v2, "cyber_result_match_stat"

    .line 617
    .line 618
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    iget-object v1, v6, La/zr1;->a:La/s1p;

    .line 622
    .line 623
    const-wide/16 v6, 0x2ef0

    .line 624
    .line 625
    sget-object v2, La/xun;->a:La/xun;

    .line 626
    .line 627
    invoke-virtual {v1, v2, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 628
    .line 629
    .line 630
    new-instance v2, La/l0i0;

    .line 631
    .line 632
    const/16 v7, 0xe

    .line 633
    .line 634
    move-object v6, v0

    .line 635
    invoke-direct/range {v2 .. v7}, La/l0i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v8, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 639
    .line 640
    .line 641
    goto/16 :goto_12

    .line 642
    .line 643
    :cond_1c
    instance-of v4, v0, La/i8t0;

    .line 644
    .line 645
    if-eqz v4, :cond_28

    .line 646
    .line 647
    check-cast v0, La/i8t0;

    .line 648
    .line 649
    iget v0, v0, La/i8t0;->a:I

    .line 650
    .line 651
    sget v1, La/jdt0;->N:I

    .line 652
    .line 653
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    check-cast v1, La/cdt0;

    .line 658
    .line 659
    iget-object v1, v1, La/cdt0;->c:La/xbt0;

    .line 660
    .line 661
    if-eqz v1, :cond_3c

    .line 662
    .line 663
    iget-object v1, v1, La/xbt0;->d:Ljava/util/List;

    .line 664
    .line 665
    if-eqz v1, :cond_3c

    .line 666
    .line 667
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    :cond_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 672
    .line 673
    .line 674
    move-result v2

    .line 675
    if-eqz v2, :cond_1e

    .line 676
    .line 677
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    move-object v4, v2

    .line 682
    check-cast v4, La/uog;

    .line 683
    .line 684
    iget v4, v4, La/uog;->a:I

    .line 685
    .line 686
    if-ne v4, v0, :cond_1d

    .line 687
    .line 688
    goto :goto_3

    .line 689
    :cond_1e
    move-object v2, v14

    .line 690
    :goto_3
    check-cast v2, La/uog;

    .line 691
    .line 692
    if-eqz v2, :cond_3c

    .line 693
    .line 694
    iget-boolean v1, v2, La/uog;->f:Z

    .line 695
    .line 696
    iget-object v4, v2, La/uog;->g:Ljava/lang/String;

    .line 697
    .line 698
    iget v5, v2, La/uog;->a:I

    .line 699
    .line 700
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v8

    .line 704
    check-cast v8, La/cdt0;

    .line 705
    .line 706
    iget-object v8, v8, La/cdt0;->c:La/xbt0;

    .line 707
    .line 708
    if-eqz v8, :cond_1f

    .line 709
    .line 710
    iget-object v8, v8, La/xbt0;->d:Ljava/util/List;

    .line 711
    .line 712
    if-eqz v8, :cond_1f

    .line 713
    .line 714
    invoke-interface {v8, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 715
    .line 716
    .line 717
    move-result v8

    .line 718
    :goto_4
    move/from16 p0, v13

    .line 719
    .line 720
    goto :goto_5

    .line 721
    :cond_1f
    move v8, v15

    .line 722
    goto :goto_4

    .line 723
    :goto_5
    iget-wide v13, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 724
    .line 725
    int-to-long v11, v0

    .line 726
    iget-object v0, v7, La/ih5;->a:La/kt2;

    .line 727
    .line 728
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 729
    .line 730
    .line 731
    move-result-object v7

    .line 732
    new-instance v13, Lkotlin/Pair;

    .line 733
    .line 734
    const-string v14, "championship_id"

    .line 735
    .line 736
    invoke-direct {v13, v14, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 740
    .line 741
    .line 742
    move-result-object v7

    .line 743
    new-instance v11, Lkotlin/Pair;

    .line 744
    .line 745
    const-string v12, "promo_id"

    .line 746
    .line 747
    invoke-direct {v11, v12, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 748
    .line 749
    .line 750
    filled-new-array {v13, v11}, [Lkotlin/Pair;

    .line 751
    .line 752
    .line 753
    move-result-object v7

    .line 754
    invoke-static {v7}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 755
    .line 756
    .line 757
    move-result-object v7

    .line 758
    const-string v11, "cyber_champ_actions_call"

    .line 759
    .line 760
    invoke-interface {v0, v11, v7}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 761
    .line 762
    .line 763
    iget-wide v11, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->a:J

    .line 764
    .line 765
    long-to-int v0, v11

    .line 766
    iget-object v6, v6, La/zr1;->a:La/s1p;

    .line 767
    .line 768
    new-instance v7, La/i1p;

    .line 769
    .line 770
    const/4 v9, 0x2

    .line 771
    invoke-direct {v7, v0, v9}, La/i1p;-><init>(IB)V

    .line 772
    .line 773
    .line 774
    new-instance v0, La/i1p;

    .line 775
    .line 776
    invoke-direct {v0, v5, v15}, La/i1p;-><init>(IB)V

    .line 777
    .line 778
    .line 779
    new-array v9, v9, [La/k1p;

    .line 780
    .line 781
    aput-object v7, v9, v15

    .line 782
    .line 783
    aput-object v0, v9, p0

    .line 784
    .line 785
    invoke-static {v9}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    const-wide/16 v11, 0x2f30

    .line 790
    .line 791
    invoke-virtual {v6, v0, v11, v12}, La/s1p;->a(Ljava/util/Set;J)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    check-cast v0, La/cdt0;

    .line 799
    .line 800
    iget-object v0, v0, La/cdt0;->f:La/sff0;

    .line 801
    .line 802
    iget-boolean v0, v0, La/sff0;->O0:Z

    .line 803
    .line 804
    if-eqz v0, :cond_23

    .line 805
    .line 806
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 807
    .line 808
    .line 809
    move-result v0

    .line 810
    if-lez v0, :cond_20

    .line 811
    .line 812
    iget-object v0, v3, La/jdt0;->A:La/grj;

    .line 813
    .line 814
    invoke-virtual {v0, v4}, La/grj;->a(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    goto :goto_8

    .line 818
    :cond_20
    sget-object v0, La/mvc;->l:La/mvc;

    .line 819
    .line 820
    check-cast v10, La/uzg;

    .line 821
    .line 822
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    iget-object v1, v10, La/uzg;->a:La/oeg0;

    .line 826
    .line 827
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    new-instance v6, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;

    .line 836
    .line 837
    move/from16 v7, p0

    .line 838
    .line 839
    invoke-direct {v6, v5, v8, v0, v7}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;-><init>(IILa/mvc;Z)V

    .line 840
    .line 841
    .line 842
    instance-of v0, v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 843
    .line 844
    if-eqz v0, :cond_21

    .line 845
    .line 846
    new-instance v0, La/e1w0;

    .line 847
    .line 848
    check-cast v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 849
    .line 850
    invoke-direct {v0, v6}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 851
    .line 852
    .line 853
    new-instance v5, La/c8d;

    .line 854
    .line 855
    sget-object v6, La/y7d;->a:La/v7d;

    .line 856
    .line 857
    invoke-direct {v5, v6, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    goto :goto_6

    .line 864
    :cond_21
    new-instance v0, La/w0w0;

    .line 865
    .line 866
    invoke-direct {v0, v6}, La/w0w0;-><init>(La/m7h0;)V

    .line 867
    .line 868
    .line 869
    new-instance v5, La/c8d;

    .line 870
    .line 871
    sget-object v6, La/y7d;->a:La/v7d;

    .line 872
    .line 873
    invoke-direct {v5, v6, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v4, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    :goto_6
    invoke-static {v1, v4, v15}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    :goto_7
    move-object v4, v0

    .line 884
    check-cast v4, La/paw;

    .line 885
    .line 886
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 887
    .line 888
    .line 889
    move-result v5

    .line 890
    if-eqz v5, :cond_22

    .line 891
    .line 892
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    check-cast v4, La/oe50;

    .line 897
    .line 898
    invoke-virtual {v1, v4}, La/i1w0;->a(La/oe50;)V

    .line 899
    .line 900
    .line 901
    goto :goto_7

    .line 902
    :cond_22
    :goto_8
    new-instance v0, La/idt0;

    .line 903
    .line 904
    const/4 v1, 0x0

    .line 905
    invoke-direct {v0, v3, v2, v1, v15}, La/idt0;-><init>(La/jdt0;La/uog;La/yje;B)V

    .line 906
    .line 907
    .line 908
    const/4 v2, 0x3

    .line 909
    invoke-static {v3, v1, v1, v0, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 910
    .line 911
    .line 912
    goto/16 :goto_12

    .line 913
    .line 914
    :cond_23
    iget-object v0, v2, La/uog;->h:Ljava/lang/String;

    .line 915
    .line 916
    if-eqz v1, :cond_24

    .line 917
    .line 918
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 919
    .line 920
    .line 921
    move-result v6

    .line 922
    if-lez v6, :cond_24

    .line 923
    .line 924
    check-cast v10, La/uzg;

    .line 925
    .line 926
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 927
    .line 928
    .line 929
    iget-object v0, v10, La/uzg;->i:La/grj;

    .line 930
    .line 931
    invoke-virtual {v0, v4}, La/grj;->a(Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    goto :goto_b

    .line 935
    :cond_24
    if-eqz v1, :cond_25

    .line 936
    .line 937
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 938
    .line 939
    .line 940
    move-result v1

    .line 941
    if-lez v1, :cond_25

    .line 942
    .line 943
    check-cast v10, La/uzg;

    .line 944
    .line 945
    invoke-virtual {v10, v0}, La/uzg;->m(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    goto :goto_b

    .line 949
    :cond_25
    check-cast v10, La/uzg;

    .line 950
    .line 951
    iget-object v0, v10, La/uzg;->a:La/oeg0;

    .line 952
    .line 953
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    new-instance v16, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;

    .line 962
    .line 963
    const/16 v19, 0x2e

    .line 964
    .line 965
    const/16 v20, 0x0

    .line 966
    .line 967
    const/16 v21, 0x1

    .line 968
    .line 969
    move/from16 v17, v5

    .line 970
    .line 971
    move/from16 v18, v8

    .line 972
    .line 973
    invoke-direct/range {v16 .. v21}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;-><init>(IIIZZ)V

    .line 974
    .line 975
    .line 976
    move-object/from16 v4, v16

    .line 977
    .line 978
    instance-of v5, v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 979
    .line 980
    if-eqz v5, :cond_26

    .line 981
    .line 982
    new-instance v5, La/e1w0;

    .line 983
    .line 984
    check-cast v4, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 985
    .line 986
    invoke-direct {v5, v4}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 987
    .line 988
    .line 989
    new-instance v4, La/c8d;

    .line 990
    .line 991
    sget-object v6, La/y7d;->a:La/v7d;

    .line 992
    .line 993
    invoke-direct {v4, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v1, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    goto :goto_9

    .line 1000
    :cond_26
    new-instance v5, La/w0w0;

    .line 1001
    .line 1002
    invoke-direct {v5, v4}, La/w0w0;-><init>(La/m7h0;)V

    .line 1003
    .line 1004
    .line 1005
    new-instance v4, La/c8d;

    .line 1006
    .line 1007
    sget-object v6, La/y7d;->a:La/v7d;

    .line 1008
    .line 1009
    invoke-direct {v4, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v1, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    :goto_9
    invoke-static {v0, v1, v15}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    :goto_a
    move-object v4, v1

    .line 1020
    check-cast v4, La/paw;

    .line 1021
    .line 1022
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 1023
    .line 1024
    .line 1025
    move-result v5

    .line 1026
    if-eqz v5, :cond_27

    .line 1027
    .line 1028
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v4

    .line 1032
    check-cast v4, La/oe50;

    .line 1033
    .line 1034
    invoke-virtual {v0, v4}, La/i1w0;->a(La/oe50;)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_a

    .line 1038
    :cond_27
    :goto_b
    new-instance v0, La/idt0;

    .line 1039
    .line 1040
    const/4 v1, 0x0

    .line 1041
    const/4 v7, 0x1

    .line 1042
    invoke-direct {v0, v3, v2, v1, v7}, La/idt0;-><init>(La/jdt0;La/uog;La/yje;B)V

    .line 1043
    .line 1044
    .line 1045
    const/4 v2, 0x3

    .line 1046
    invoke-static {v3, v1, v1, v0, v2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 1047
    .line 1048
    .line 1049
    goto/16 :goto_12

    .line 1050
    .line 1051
    :cond_28
    sget-object v4, La/s8t0;->a:La/s8t0;

    .line 1052
    .line 1053
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v4

    .line 1057
    if-eqz v4, :cond_31

    .line 1058
    .line 1059
    sget v0, La/jdt0;->N:I

    .line 1060
    .line 1061
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v0

    .line 1065
    check-cast v0, La/cdt0;

    .line 1066
    .line 1067
    iget-object v0, v0, La/cdt0;->c:La/xbt0;

    .line 1068
    .line 1069
    const-wide/16 v1, 0x0

    .line 1070
    .line 1071
    if-eqz v0, :cond_2a

    .line 1072
    .line 1073
    iget-object v0, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 1074
    .line 1075
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 1076
    .line 1077
    instance-of v4, v0, La/g0g0;

    .line 1078
    .line 1079
    if-eqz v4, :cond_29

    .line 1080
    .line 1081
    const/4 v0, 0x0

    .line 1082
    :cond_29
    check-cast v0, La/fn9;

    .line 1083
    .line 1084
    if-eqz v0, :cond_2a

    .line 1085
    .line 1086
    iget-wide v4, v0, La/fn9;->c:J

    .line 1087
    .line 1088
    move-wide/from16 v17, v4

    .line 1089
    .line 1090
    goto :goto_c

    .line 1091
    :cond_2a
    move-wide/from16 v17, v1

    .line 1092
    .line 1093
    :goto_c
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    check-cast v0, La/cdt0;

    .line 1098
    .line 1099
    iget-object v0, v0, La/cdt0;->c:La/xbt0;

    .line 1100
    .line 1101
    invoke-static {v0}, La/hfm0;->r(La/xbt0;)J

    .line 1102
    .line 1103
    .line 1104
    move-result-wide v4

    .line 1105
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v25

    .line 1109
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v0

    .line 1113
    check-cast v0, La/cdt0;

    .line 1114
    .line 1115
    iget-object v0, v0, La/cdt0;->c:La/xbt0;

    .line 1116
    .line 1117
    if-eqz v0, :cond_2c

    .line 1118
    .line 1119
    iget-object v0, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 1120
    .line 1121
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 1122
    .line 1123
    instance-of v4, v0, La/g0g0;

    .line 1124
    .line 1125
    if-eqz v4, :cond_2b

    .line 1126
    .line 1127
    const/4 v0, 0x0

    .line 1128
    :cond_2b
    check-cast v0, La/fn9;

    .line 1129
    .line 1130
    if-eqz v0, :cond_2c

    .line 1131
    .line 1132
    iget-object v0, v0, La/fn9;->r:Ljava/util/List;

    .line 1133
    .line 1134
    if-eqz v0, :cond_2c

    .line 1135
    .line 1136
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v0

    .line 1140
    const/4 v4, 0x1

    .line 1141
    xor-int/2addr v0, v4

    .line 1142
    goto :goto_d

    .line 1143
    :cond_2c
    move v0, v15

    .line 1144
    :goto_d
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v4

    .line 1148
    check-cast v4, La/cdt0;

    .line 1149
    .line 1150
    iget-object v4, v4, La/cdt0;->c:La/xbt0;

    .line 1151
    .line 1152
    if-eqz v4, :cond_2e

    .line 1153
    .line 1154
    iget-object v4, v4, La/xbt0;->a:Ljava/lang/Object;

    .line 1155
    .line 1156
    sget-object v5, La/j0g0;->b:La/e0g0;

    .line 1157
    .line 1158
    instance-of v5, v4, La/g0g0;

    .line 1159
    .line 1160
    if-eqz v5, :cond_2d

    .line 1161
    .line 1162
    const/4 v4, 0x0

    .line 1163
    :cond_2d
    check-cast v4, La/fn9;

    .line 1164
    .line 1165
    if-eqz v4, :cond_2e

    .line 1166
    .line 1167
    iget-object v4, v4, La/fn9;->r:Ljava/util/List;

    .line 1168
    .line 1169
    if-eqz v4, :cond_2e

    .line 1170
    .line 1171
    invoke-static {v4}, La/vsm0;->k(Ljava/util/List;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v15

    .line 1175
    :cond_2e
    cmp-long v4, v17, v1

    .line 1176
    .line 1177
    if-lez v4, :cond_3c

    .line 1178
    .line 1179
    iget-wide v4, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 1180
    .line 1181
    const-wide/16 v11, 0x2e

    .line 1182
    .line 1183
    cmp-long v4, v4, v11

    .line 1184
    .line 1185
    if-nez v4, :cond_3c

    .line 1186
    .line 1187
    if-eqz v0, :cond_3c

    .line 1188
    .line 1189
    if-eqz v15, :cond_3c

    .line 1190
    .line 1191
    sget-object v0, La/r1g;->b:La/r1g;

    .line 1192
    .line 1193
    const-string v0, "cybersport_champ"

    .line 1194
    .line 1195
    invoke-virtual {v7, v0}, La/ih5;->o(Ljava/lang/String;)V

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v6, v0}, La/zr1;->x(Ljava/lang/String;)V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    check-cast v0, La/cdt0;

    .line 1206
    .line 1207
    iget-object v0, v0, La/cdt0;->c:La/xbt0;

    .line 1208
    .line 1209
    if-eqz v0, :cond_30

    .line 1210
    .line 1211
    iget-object v0, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 1212
    .line 1213
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 1214
    .line 1215
    instance-of v3, v0, La/g0g0;

    .line 1216
    .line 1217
    if-eqz v3, :cond_2f

    .line 1218
    .line 1219
    const/4 v14, 0x0

    .line 1220
    goto :goto_e

    .line 1221
    :cond_2f
    move-object v14, v0

    .line 1222
    :goto_e
    check-cast v14, La/fn9;

    .line 1223
    .line 1224
    if-eqz v14, :cond_30

    .line 1225
    .line 1226
    iget-wide v1, v14, La/fn9;->p:J

    .line 1227
    .line 1228
    :cond_30
    move-wide/from16 v23, v1

    .line 1229
    .line 1230
    iget-wide v0, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 1231
    .line 1232
    const/16 v26, 0x1

    .line 1233
    .line 1234
    move-object/from16 v16, v10

    .line 1235
    .line 1236
    check-cast v16, La/uzg;

    .line 1237
    .line 1238
    const-wide/16 v21, 0x0

    .line 1239
    .line 1240
    move-wide/from16 v19, v0

    .line 1241
    .line 1242
    invoke-virtual/range {v16 .. v26}, La/uzg;->p(JJJJLjava/lang/String;Z)V

    .line 1243
    .line 1244
    .line 1245
    goto/16 :goto_12

    .line 1246
    .line 1247
    :cond_31
    instance-of v4, v0, La/t8t0;

    .line 1248
    .line 1249
    if-eqz v4, :cond_34

    .line 1250
    .line 1251
    check-cast v0, La/t8t0;

    .line 1252
    .line 1253
    sget v1, La/jdt0;->N:I

    .line 1254
    .line 1255
    const/4 v1, 0x5

    .line 1256
    new-array v1, v1, [La/yxg;

    .line 1257
    .line 1258
    sget-object v2, La/ttg;->d:La/ttg;

    .line 1259
    .line 1260
    aput-object v2, v1, v15

    .line 1261
    .line 1262
    sget-object v2, La/trg;->d:La/trg;

    .line 1263
    .line 1264
    const/4 v4, 0x1

    .line 1265
    aput-object v2, v1, v4

    .line 1266
    .line 1267
    sget-object v2, La/oxg;->d:La/oxg;

    .line 1268
    .line 1269
    const/16 v17, 0x2

    .line 1270
    .line 1271
    aput-object v2, v1, v17

    .line 1272
    .line 1273
    sget-object v2, La/pug;->d:La/pug;

    .line 1274
    .line 1275
    const/16 v22, 0x3

    .line 1276
    .line 1277
    aput-object v2, v1, v22

    .line 1278
    .line 1279
    sget-object v2, La/yvg;->d:La/yvg;

    .line 1280
    .line 1281
    const/4 v4, 0x4

    .line 1282
    aput-object v2, v1, v4

    .line 1283
    .line 1284
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v1

    .line 1288
    new-instance v2, Ljava/util/ArrayList;

    .line 1289
    .line 1290
    const/16 v4, 0xa

    .line 1291
    .line 1292
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1293
    .line 1294
    .line 1295
    move-result v4

    .line 1296
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1297
    .line 1298
    .line 1299
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v1

    .line 1303
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1304
    .line 1305
    .line 1306
    move-result v4

    .line 1307
    if-eqz v4, :cond_32

    .line 1308
    .line 1309
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v4

    .line 1313
    check-cast v4, La/yxg;

    .line 1314
    .line 1315
    iget-wide v11, v4, La/yxg;->a:J

    .line 1316
    .line 1317
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1322
    .line 1323
    .line 1324
    goto :goto_f

    .line 1325
    :cond_32
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v1

    .line 1329
    check-cast v1, La/cdt0;

    .line 1330
    .line 1331
    iget-object v1, v1, La/cdt0;->b:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 1332
    .line 1333
    iget-wide v11, v1, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 1334
    .line 1335
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1340
    .line 1341
    .line 1342
    move-result v1

    .line 1343
    if-eqz v1, :cond_33

    .line 1344
    .line 1345
    sget-object v1, La/r1g;->x:La/r1g;

    .line 1346
    .line 1347
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v2

    .line 1351
    check-cast v2, La/cdt0;

    .line 1352
    .line 1353
    iget-object v2, v2, La/cdt0;->b:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 1354
    .line 1355
    iget-wide v4, v2, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 1356
    .line 1357
    invoke-virtual {v7, v1, v4, v5}, La/ih5;->p(La/r1g;J)V

    .line 1358
    .line 1359
    .line 1360
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    check-cast v1, La/cdt0;

    .line 1365
    .line 1366
    iget-object v1, v1, La/cdt0;->b:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 1367
    .line 1368
    iget-wide v1, v1, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 1369
    .line 1370
    const-string v3, "cyber_team_call"

    .line 1371
    .line 1372
    invoke-virtual {v6, v1, v2, v3}, La/zr1;->z(JLjava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    iget-wide v14, v0, La/t8t0;->a:J

    .line 1376
    .line 1377
    iget-wide v12, v9, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;->c:J

    .line 1378
    .line 1379
    iget-object v0, v0, La/t8t0;->b:Ljava/lang/String;

    .line 1380
    .line 1381
    sget-object v17, La/k1g;->b:La/k1g;

    .line 1382
    .line 1383
    move-object v11, v10

    .line 1384
    check-cast v11, La/uzg;

    .line 1385
    .line 1386
    move-object/from16 v16, v0

    .line 1387
    .line 1388
    invoke-virtual/range {v11 .. v17}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 1389
    .line 1390
    .line 1391
    goto/16 :goto_12

    .line 1392
    .line 1393
    :cond_33
    new-instance v0, La/dct0;

    .line 1394
    .line 1395
    new-array v1, v15, [Ljava/lang/Object;

    .line 1396
    .line 1397
    iget-object v2, v5, La/ctf0;->b:La/lsm0;

    .line 1398
    .line 1399
    invoke-static {v1, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    const v4, 0x7f131302

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v2, v4, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    invoke-direct {v0, v1}, La/dct0;-><init>(Ljava/lang/String;)V

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1414
    .line 1415
    .line 1416
    goto/16 :goto_12

    .line 1417
    .line 1418
    :cond_34
    instance-of v4, v0, La/n8t0;

    .line 1419
    .line 1420
    if-eqz v4, :cond_36

    .line 1421
    .line 1422
    move-object v4, v0

    .line 1423
    check-cast v4, La/n8t0;

    .line 1424
    .line 1425
    sget v0, La/jdt0;->N:I

    .line 1426
    .line 1427
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 1428
    .line 1429
    :cond_35
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1434
    .line 1435
    .line 1436
    move-object v5, v0

    .line 1437
    check-cast v5, La/cdt0;

    .line 1438
    .line 1439
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1440
    .line 1441
    .line 1442
    iget v8, v4, La/n8t0;->a:I

    .line 1443
    .line 1444
    const/4 v10, 0x0

    .line 1445
    const/16 v11, 0xeff

    .line 1446
    .line 1447
    const/4 v6, 0x0

    .line 1448
    const/4 v7, 0x0

    .line 1449
    const/4 v9, 0x0

    .line 1450
    invoke-static/range {v5 .. v11}, La/cdt0;->a(La/cdt0;ZLa/xbt0;ILjava/util/Date;La/j0g0;I)La/cdt0;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v3

    .line 1454
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1455
    .line 1456
    .line 1457
    move-result v0

    .line 1458
    if-eqz v0, :cond_35

    .line 1459
    .line 1460
    goto/16 :goto_12

    .line 1461
    .line 1462
    :cond_36
    instance-of v1, v0, La/r8t0;

    .line 1463
    .line 1464
    if-eqz v1, :cond_3d

    .line 1465
    .line 1466
    check-cast v0, La/r8t0;

    .line 1467
    .line 1468
    sget v1, La/jdt0;->N:I

    .line 1469
    .line 1470
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v1

    .line 1474
    check-cast v1, La/cdt0;

    .line 1475
    .line 1476
    iget-object v1, v1, La/cdt0;->c:La/xbt0;

    .line 1477
    .line 1478
    if-eqz v1, :cond_3c

    .line 1479
    .line 1480
    iget-object v1, v1, La/xbt0;->h:Ljava/util/List;

    .line 1481
    .line 1482
    if-eqz v1, :cond_3c

    .line 1483
    .line 1484
    iget v0, v0, La/r8t0;->a:I

    .line 1485
    .line 1486
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    check-cast v0, La/phk0;

    .line 1491
    .line 1492
    if-nez v0, :cond_37

    .line 1493
    .line 1494
    goto :goto_12

    .line 1495
    :cond_37
    iget-object v1, v0, La/phk0;->a:Ljava/lang/String;

    .line 1496
    .line 1497
    new-instance v2, La/cct0;

    .line 1498
    .line 1499
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1500
    .line 1501
    .line 1502
    new-array v4, v15, [Ljava/lang/Object;

    .line 1503
    .line 1504
    iget-object v5, v5, La/ctf0;->b:La/lsm0;

    .line 1505
    .line 1506
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v4

    .line 1510
    const v6, 0x7f131316

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v4

    .line 1517
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1518
    .line 1519
    .line 1520
    move-result v4

    .line 1521
    if-eqz v4, :cond_39

    .line 1522
    .line 1523
    const-string v16, "org.telegram.messenger"

    .line 1524
    .line 1525
    :cond_38
    :goto_10
    move-object/from16 v4, v16

    .line 1526
    .line 1527
    goto :goto_11

    .line 1528
    :cond_39
    new-array v4, v15, [Ljava/lang/Object;

    .line 1529
    .line 1530
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v4

    .line 1534
    const v6, 0x7f13130d

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v4

    .line 1541
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1542
    .line 1543
    .line 1544
    move-result v4

    .line 1545
    if-eqz v4, :cond_3a

    .line 1546
    .line 1547
    const-string v16, "com.instagram.android"

    .line 1548
    .line 1549
    goto :goto_10

    .line 1550
    :cond_3a
    new-array v4, v15, [Ljava/lang/Object;

    .line 1551
    .line 1552
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v4

    .line 1556
    const v6, 0x7f13131c

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v4

    .line 1563
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1564
    .line 1565
    .line 1566
    move-result v4

    .line 1567
    if-eqz v4, :cond_3b

    .line 1568
    .line 1569
    const-string v16, "com.twitter.android"

    .line 1570
    .line 1571
    goto :goto_10

    .line 1572
    :cond_3b
    new-array v4, v15, [Ljava/lang/Object;

    .line 1573
    .line 1574
    invoke-static {v4, v15}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v4

    .line 1578
    const v6, 0x7f13130a

    .line 1579
    .line 1580
    .line 1581
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v4

    .line 1585
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1586
    .line 1587
    .line 1588
    move-result v4

    .line 1589
    if-eqz v4, :cond_38

    .line 1590
    .line 1591
    const-string v16, "com.discord"

    .line 1592
    .line 1593
    goto :goto_10

    .line 1594
    :goto_11
    iget-object v0, v0, La/phk0;->c:Ljava/lang/String;

    .line 1595
    .line 1596
    invoke-direct {v2, v1, v4, v0}, La/cct0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v3, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1600
    .line 1601
    .line 1602
    :cond_3c
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1603
    .line 1604
    return-object v0

    .line 1605
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 1606
    .line 1607
    .line 1608
    const/4 v1, 0x0

    .line 1609
    return-object v1

    .line 1610
    nop

    .line 1611
    :sswitch_data_0
    .sparse-switch
        -0x60f697dc -> :sswitch_4
        -0x5714ac78 -> :sswitch_3
        -0x45a6746e -> :sswitch_2
        -0x2b0ef6c5 -> :sswitch_1
        -0x180b4580 -> :sswitch_0
    .end sparse-switch
.end method

.method private final K(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ztu0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/osu0;

    .line 13
    .line 14
    sget-object p1, La/lsu0;->a:La/lsu0;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget p0, La/ztu0;->w:I

    .line 23
    .line 24
    iget-object p0, v0, La/ztu0;->o:La/i1w0;

    .line 25
    .line 26
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, La/c8d;

    .line 31
    .line 32
    sget-object v1, La/y7d;->a:La/v7d;

    .line 33
    .line 34
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :goto_0
    move-object v0, p1

    .line 45
    check-cast v0, La/paw;

    .line 46
    .line 47
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/oe50;

    .line 58
    .line 59
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p1, La/msu0;->a:La/msu0;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    sget p0, La/ztu0;->w:I

    .line 72
    .line 73
    invoke-virtual {v0}, La/ztu0;->M()V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    instance-of p1, p0, La/nsu0;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    check-cast p0, La/nsu0;

    .line 82
    .line 83
    iget-wide v3, p0, La/nsu0;->a:J

    .line 84
    .line 85
    sget p0, La/ztu0;->w:I

    .line 86
    .line 87
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 88
    .line 89
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 90
    .line 91
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 99
    .line 100
    move-object v2, v1

    .line 101
    move-object v1, p1

    .line 102
    check-cast v1, La/wtu0;

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    const/16 v6, 0xb

    .line 109
    .line 110
    const/4 v2, 0x0

    .line 111
    invoke-static/range {v1 .. v6}, La/wtu0;->a(La/wtu0;ZJLa/j0g0;I)La/wtu0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_2

    .line 120
    .line 121
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 125
    .line 126
    .line 127
    const/4 p0, 0x0

    .line 128
    return-object p0
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/tkw;

    .line 4
    .line 5
    iget-object v1, v0, La/tkw;->q:La/hjd;

    .line 6
    .line 7
    iget-object v2, v0, La/tkw;->o:La/i1w0;

    .line 8
    .line 9
    sget-object v3, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/vhw;

    .line 17
    .line 18
    sget-object p1, La/phw;->a:La/phw;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    sget p0, La/tkw;->C:I

    .line 27
    .line 28
    invoke-virtual {v0}, La/tkw;->M()V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_0
    sget-object p1, La/ngw;->a:La/ngw;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    sget p0, La/tkw;->C:I

    .line 43
    .line 44
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, La/c8d;

    .line 49
    .line 50
    sget-object v0, La/y7d;->a:La/v7d;

    .line 51
    .line 52
    sget-object v1, La/p0w0;->a:La/p0w0;

    .line 53
    .line 54
    invoke-direct {p1, v0, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, p1, v2, p0, v3}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :goto_0
    move-object p1, p0

    .line 62
    check-cast p1, La/paw;

    .line 63
    .line 64
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_14

    .line 69
    .line 70
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, La/oe50;

    .line 75
    .line 76
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    sget-object p1, La/ihw;->a:La/ihw;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/4 v4, 0x1

    .line 87
    const/4 v5, 0x0

    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    sget p0, La/tkw;->C:I

    .line 91
    .line 92
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/yjw;

    .line 97
    .line 98
    iget-object p0, p0, La/yjw;->h:La/viw;

    .line 99
    .line 100
    if-eqz p0, :cond_3

    .line 101
    .line 102
    iget-object p0, p0, La/viw;->a:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 105
    .line 106
    instance-of p1, p0, La/g0g0;

    .line 107
    .line 108
    if-eqz p1, :cond_2

    .line 109
    .line 110
    move-object p0, v5

    .line 111
    :cond_2
    check-cast p0, Ljava/util/List;

    .line 112
    .line 113
    if-eqz p0, :cond_3

    .line 114
    .line 115
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    xor-int/2addr p0, v4

    .line 120
    if-ne p0, v4, :cond_3

    .line 121
    .line 122
    sget-object p0, La/j700;->b:La/j700;

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_3
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/yjw;

    .line 130
    .line 131
    iget-object p0, p0, La/yjw;->h:La/viw;

    .line 132
    .line 133
    if-eqz p0, :cond_5

    .line 134
    .line 135
    iget-object p0, p0, La/viw;->b:Ljava/lang/Object;

    .line 136
    .line 137
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 138
    .line 139
    instance-of p1, p0, La/g0g0;

    .line 140
    .line 141
    if-eqz p1, :cond_4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    move-object v5, p0

    .line 145
    :goto_1
    check-cast v5, Ljava/util/List;

    .line 146
    .line 147
    if-eqz v5, :cond_5

    .line 148
    .line 149
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    xor-int/2addr p0, v4

    .line 154
    if-ne p0, v4, :cond_5

    .line 155
    .line 156
    sget-object p0, La/j700;->a:La/j700;

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_5
    sget-object p0, La/j700;->b:La/j700;

    .line 160
    .line 161
    :goto_2
    new-instance p1, La/okw;

    .line 162
    .line 163
    invoke-direct {p1, v0, p0, v4}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 167
    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_6
    instance-of p1, p0, La/jhw;

    .line 172
    .line 173
    const/4 v6, 0x2

    .line 174
    if-eqz p1, :cond_d

    .line 175
    .line 176
    check-cast p0, La/jhw;

    .line 177
    .line 178
    sget p1, La/tkw;->C:I

    .line 179
    .line 180
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, La/yjw;

    .line 185
    .line 186
    iget-object p1, p1, La/yjw;->h:La/viw;

    .line 187
    .line 188
    if-eqz p1, :cond_14

    .line 189
    .line 190
    iget-object v1, p1, La/viw;->a:Ljava/lang/Object;

    .line 191
    .line 192
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 193
    .line 194
    instance-of v3, v1, La/g0g0;

    .line 195
    .line 196
    if-eqz v3, :cond_7

    .line 197
    .line 198
    move-object v1, v5

    .line 199
    :cond_7
    check-cast v1, Ljava/util/List;

    .line 200
    .line 201
    if-nez v1, :cond_8

    .line 202
    .line 203
    sget-object v1, La/iun;->a:La/iun;

    .line 204
    .line 205
    :cond_8
    iget-object p1, p1, La/viw;->b:Ljava/lang/Object;

    .line 206
    .line 207
    instance-of v3, p1, La/g0g0;

    .line 208
    .line 209
    if-eqz v3, :cond_9

    .line 210
    .line 211
    move-object p1, v5

    .line 212
    :cond_9
    check-cast p1, Ljava/util/List;

    .line 213
    .line 214
    if-nez p1, :cond_a

    .line 215
    .line 216
    sget-object p1, La/iun;->a:La/iun;

    .line 217
    .line 218
    :cond_a
    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_c

    .line 231
    .line 232
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    move-object v3, v1

    .line 237
    check-cast v3, La/tiw;

    .line 238
    .line 239
    iget-wide v3, v3, La/tiw;->d:J

    .line 240
    .line 241
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iget-object v4, p0, La/jhw;->a:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    if-eqz v3, :cond_b

    .line 252
    .line 253
    move-object v5, v1

    .line 254
    :cond_c
    check-cast v5, La/tiw;

    .line 255
    .line 256
    if-eqz v5, :cond_14

    .line 257
    .line 258
    new-instance p0, La/okw;

    .line 259
    .line 260
    invoke-direct {p0, v0, v5, v6}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_6

    .line 267
    .line 268
    :cond_d
    instance-of p1, p0, La/pgw;

    .line 269
    .line 270
    if-eqz p1, :cond_12

    .line 271
    .line 272
    check-cast p0, La/pgw;

    .line 273
    .line 274
    sget p1, La/tkw;->C:I

    .line 275
    .line 276
    iget-wide p0, p0, La/pgw;->a:J

    .line 277
    .line 278
    const-wide/16 v7, 0x3

    .line 279
    .line 280
    cmp-long v1, p0, v7

    .line 281
    .line 282
    if-nez v1, :cond_e

    .line 283
    .line 284
    iget-object p0, v0, La/tkw;->x:La/gle0;

    .line 285
    .line 286
    const-wide/16 v0, 0xbd

    .line 287
    .line 288
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    new-instance v5, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;

    .line 303
    .line 304
    invoke-direct {v5, p1}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsScreen$1;-><init>(Ljava/util/List;)V

    .line 305
    .line 306
    .line 307
    goto :goto_3

    .line 308
    :cond_e
    const-wide/16 v7, 0x2

    .line 309
    .line 310
    cmp-long v1, p0, v7

    .line 311
    .line 312
    if-nez v1, :cond_f

    .line 313
    .line 314
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-static {p0, p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {p0, v4}, Ljava/util/Calendar;->get(I)I

    .line 327
    .line 328
    .line 329
    move-result p1

    .line 330
    invoke-virtual {p0, v6}, Ljava/util/Calendar;->get(I)I

    .line 331
    .line 332
    .line 333
    move-result p0

    .line 334
    add-int/2addr p0, v4

    .line 335
    iget-object v0, v0, La/tkw;->w:La/y9g;

    .line 336
    .line 337
    new-instance v1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 338
    .line 339
    sget-object v5, La/iun;->a:La/iun;

    .line 340
    .line 341
    invoke-direct {v1, p1, p0, v5, v4}, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;-><init>(IILjava/util/List;Z)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    new-instance v5, Lorg/xplatform/cyber/calendar/impl/navigation/CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1;

    .line 348
    .line 349
    invoke-direct {v5, v1}, Lorg/xplatform/cyber/calendar/impl/navigation/CyberCalendarScreensFactoryImpl$getCyberCalendarScreen$1;-><init>(Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;)V

    .line 350
    .line 351
    .line 352
    goto :goto_3

    .line 353
    :cond_f
    const-wide/16 v6, 0x1

    .line 354
    .line 355
    cmp-long p0, p0, v6

    .line 356
    .line 357
    if-nez p0, :cond_10

    .line 358
    .line 359
    iget-object p0, v0, La/tkw;->u:La/uxs0;

    .line 360
    .line 361
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    new-instance v5, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcRatingScreen$1;

    .line 365
    .line 366
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 367
    .line 368
    .line 369
    :cond_10
    :goto_3
    if-eqz v5, :cond_14

    .line 370
    .line 371
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    instance-of p1, v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 376
    .line 377
    if-eqz p1, :cond_11

    .line 378
    .line 379
    new-instance p1, La/e1w0;

    .line 380
    .line 381
    check-cast v5, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 382
    .line 383
    invoke-direct {p1, v5}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 384
    .line 385
    .line 386
    new-instance v0, La/c8d;

    .line 387
    .line 388
    sget-object v1, La/y7d;->a:La/v7d;

    .line 389
    .line 390
    invoke-direct {v0, v1, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_4

    .line 397
    :cond_11
    new-instance p1, La/w0w0;

    .line 398
    .line 399
    invoke-direct {p1, v5}, La/w0w0;-><init>(La/m7h0;)V

    .line 400
    .line 401
    .line 402
    new-instance v0, La/c8d;

    .line 403
    .line 404
    sget-object v1, La/y7d;->a:La/v7d;

    .line 405
    .line 406
    invoke-direct {v0, v1, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    :goto_4
    invoke-static {v2, p0, v3}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    :goto_5
    move-object p1, p0

    .line 417
    check-cast p1, La/paw;

    .line 418
    .line 419
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 420
    .line 421
    .line 422
    move-result v0

    .line 423
    if-eqz v0, :cond_14

    .line 424
    .line 425
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, La/oe50;

    .line 430
    .line 431
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 432
    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_12
    instance-of p1, p0, La/fhw;

    .line 436
    .line 437
    if-eqz p1, :cond_16

    .line 438
    .line 439
    check-cast p0, La/fhw;

    .line 440
    .line 441
    sget p1, La/tkw;->C:I

    .line 442
    .line 443
    instance-of p1, p0, La/bhw;

    .line 444
    .line 445
    if-eqz p1, :cond_13

    .line 446
    .line 447
    new-instance p1, La/did;

    .line 448
    .line 449
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    check-cast v2, La/yjw;

    .line 454
    .line 455
    iget-object v2, v2, La/yjw;->h:La/viw;

    .line 456
    .line 457
    invoke-static {v2}, La/wzb;->K(La/viw;)Ljava/util/ArrayList;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    invoke-direct {p1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 462
    .line 463
    .line 464
    check-cast p0, La/bhw;

    .line 465
    .line 466
    iget-object p0, p0, La/bhw;->a:La/uid;

    .line 467
    .line 468
    new-array v2, v6, [La/vid;

    .line 469
    .line 470
    aput-object p1, v2, v3

    .line 471
    .line 472
    aput-object p0, v2, v4

    .line 473
    .line 474
    invoke-static {v0, v1, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 475
    .line 476
    .line 477
    goto :goto_6

    .line 478
    :cond_13
    instance-of p1, p0, La/dhw;

    .line 479
    .line 480
    if-eqz p1, :cond_15

    .line 481
    .line 482
    new-instance p1, La/did;

    .line 483
    .line 484
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    check-cast v2, La/yjw;

    .line 489
    .line 490
    iget-object v2, v2, La/yjw;->h:La/viw;

    .line 491
    .line 492
    invoke-static {v2}, La/wzb;->K(La/viw;)Ljava/util/ArrayList;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    invoke-direct {p1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 497
    .line 498
    .line 499
    check-cast p0, La/dhw;

    .line 500
    .line 501
    iget-object p0, p0, La/dhw;->a:La/bem;

    .line 502
    .line 503
    invoke-static {p0}, La/ebc;->n0(La/bem;)La/uid;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    new-array v2, v6, [La/vid;

    .line 508
    .line 509
    aput-object p1, v2, v3

    .line 510
    .line 511
    aput-object p0, v2, v4

    .line 512
    .line 513
    invoke-static {v0, v1, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 514
    .line 515
    .line 516
    :cond_14
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 517
    .line 518
    return-object p0

    .line 519
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 520
    .line 521
    .line 522
    return-object v5

    .line 523
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 524
    .line 525
    .line 526
    return-object v5
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ryy;

    .line 4
    .line 5
    iget-object v1, v0, La/ryy;->o:La/i1w0;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/dyy;

    .line 15
    .line 16
    sget-object p1, La/ayy;->a:La/ayy;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    sget p0, La/ryy;->z:I

    .line 26
    .line 27
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, La/c8d;

    .line 32
    .line 33
    sget-object v0, La/y7d;->a:La/v7d;

    .line 34
    .line 35
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 36
    .line 37
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p1, v1, p0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    move-object p1, p0

    .line 45
    check-cast p1, La/paw;

    .line 46
    .line 47
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_a

    .line 52
    .line 53
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/oe50;

    .line 58
    .line 59
    invoke-virtual {v1, p1}, La/i1w0;->a(La/oe50;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p1, La/byy;->a:La/byy;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    sget p0, La/ryy;->z:I

    .line 72
    .line 73
    invoke-virtual {v0}, La/ryy;->M()V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :cond_1
    instance-of p1, p0, La/cyy;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    if-eqz p1, :cond_c

    .line 82
    .line 83
    check-cast p0, La/cyy;

    .line 84
    .line 85
    iget-object p0, p0, La/cyy;->a:La/ill0;

    .line 86
    .line 87
    sget p1, La/ryy;->z:I

    .line 88
    .line 89
    instance-of p1, p0, La/hll0;

    .line 90
    .line 91
    if-eqz p1, :cond_7

    .line 92
    .line 93
    check-cast p0, La/hll0;

    .line 94
    .line 95
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, La/pyy;

    .line 100
    .line 101
    iget-object p1, p1, La/pyy;->c:La/j0g0;

    .line 102
    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    iget-object p1, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 106
    .line 107
    instance-of v4, p1, La/g0g0;

    .line 108
    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    move-object p1, v3

    .line 112
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 113
    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_4

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    move-object v5, v4

    .line 131
    check-cast v5, La/d2w;

    .line 132
    .line 133
    invoke-virtual {v5}, La/d2w;->b()J

    .line 134
    .line 135
    .line 136
    move-result-wide v5

    .line 137
    iget-wide v7, p0, La/hll0;->a:J

    .line 138
    .line 139
    cmp-long v5, v5, v7

    .line 140
    .line 141
    if-nez v5, :cond_3

    .line 142
    .line 143
    move-object v3, v4

    .line 144
    :cond_4
    check-cast v3, La/d2w;

    .line 145
    .line 146
    :cond_5
    if-eqz v3, :cond_6

    .line 147
    .line 148
    invoke-virtual {v3}, La/d2w;->f()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-lez p0, :cond_6

    .line 157
    .line 158
    new-instance p0, La/okw;

    .line 159
    .line 160
    const/16 p1, 0x10

    .line 161
    .line 162
    invoke-direct {p0, v0, v3, p1}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, p0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    new-instance p0, La/oyy;

    .line 170
    .line 171
    iget-object p1, v0, La/ryy;->q:La/ctf0;

    .line 172
    .line 173
    new-array v1, v2, [Ljava/lang/Object;

    .line 174
    .line 175
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 176
    .line 177
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const v2, 0x7f1313ed    # 1.9549998E38f

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-direct {p0, p1}, La/oyy;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    instance-of p1, p0, La/gll0;

    .line 196
    .line 197
    if-eqz p1, :cond_b

    .line 198
    .line 199
    check-cast p0, La/gll0;

    .line 200
    .line 201
    iget-wide p0, p0, La/gll0;->a:J

    .line 202
    .line 203
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, La/pyy;

    .line 208
    .line 209
    iget-object v1, v1, La/pyy;->d:Ljava/util/Set;

    .line 210
    .line 211
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_8

    .line 220
    .line 221
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {v1, p0}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    :goto_1
    move-object v5, p0

    .line 230
    goto :goto_2

    .line 231
    :cond_8
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-static {v1, p0}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    goto :goto_1

    .line 240
    :goto_2
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 241
    .line 242
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 243
    .line 244
    :cond_9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v1, v0, La/i3t0;->f:La/oyg0;

    .line 252
    .line 253
    move-object v2, v1

    .line 254
    move-object v1, p1

    .line 255
    check-cast v1, La/pyy;

    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    const/4 v4, 0x0

    .line 261
    const/16 v6, 0x77

    .line 262
    .line 263
    const/4 v2, 0x0

    .line 264
    const/4 v3, 0x0

    .line 265
    invoke-static/range {v1 .. v6}, La/pyy;->a(La/pyy;ZLa/ypl0;La/j0g0;Ljava/util/LinkedHashSet;I)La/pyy;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-virtual {p0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_9

    .line 274
    .line 275
    :cond_a
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object p0

    .line 278
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 279
    .line 280
    .line 281
    return-object v3

    .line 282
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 283
    .line 284
    .line 285
    return-object v3
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/r72;->j:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/Date;

    .line 6
    .line 7
    iget-object v0, v0, La/r72;->k:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/iwk0;

    .line 10
    .line 11
    sget-object v2, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    iget-object v2, v0, La/iwk0;->l0:La/drm0;

    .line 19
    .line 20
    iget-object v2, v2, La/drm0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/dpi0;

    .line 23
    .line 24
    iget-object v2, v2, La/dpi0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, La/jtk0;

    .line 27
    .line 28
    iget-object v2, v2, La/jtk0;->a:La/p7m0;

    .line 29
    .line 30
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, La/ktk0;

    .line 36
    .line 37
    iget-wide v5, v4, La/ktk0;->b:J

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance v4, La/ktk0;

    .line 43
    .line 44
    invoke-direct {v4, v5, v6, v1}, La/ktk0;-><init>(JLjava/util/Date;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, La/dvk0;

    .line 58
    .line 59
    iget-object v2, v2, La/dvk0;->b:La/xl9;

    .line 60
    .line 61
    iget-object v2, v2, La/xl9;->b:Ljava/util/Date;

    .line 62
    .line 63
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_4

    .line 68
    .line 69
    iget-object v2, v0, La/iwk0;->K:La/ywu;

    .line 70
    .line 71
    iget-object v3, v0, La/iwk0;->p:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 72
    .line 73
    iget v3, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v4, La/rdj;->a:La/rdj;

    .line 82
    .line 83
    sget-object v5, La/sdj;->b:La/sdj;

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/16 v7, 0x38

    .line 87
    .line 88
    invoke-static {v4, v5, v1, v6, v7}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v4, v2, La/ywu;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v4, La/yo4;

    .line 95
    .line 96
    iget-object v4, v4, La/yo4;->a:La/kt2;

    .line 97
    .line 98
    new-instance v5, La/jo20;

    .line 99
    .line 100
    invoke-direct {v5}, La/jo20;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v6, "championship_id"

    .line 104
    .line 105
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v5, v6, v7}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-lez v6, :cond_1

    .line 117
    .line 118
    const-string v6, "option"

    .line 119
    .line 120
    invoke-virtual {v5, v6, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    :cond_1
    invoke-virtual {v5}, La/jo20;->b()La/jo20;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    const-string v6, "sport_champ_s\u0441hedule"

    .line 128
    .line 129
    invoke-interface {v4, v6, v5}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v2, La/ywu;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, La/zr1;

    .line 135
    .line 136
    iget-object v2, v2, La/zr1;->a:La/s1p;

    .line 137
    .line 138
    new-instance v4, La/yni0;

    .line 139
    .line 140
    invoke-direct {v4}, La/yni0;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v5, La/i1p;

    .line 144
    .line 145
    const/4 v6, 0x2

    .line 146
    invoke-direct {v5, v3, v6}, La/i1p;-><init>(IB)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v5}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    if-lez v3, :cond_2

    .line 157
    .line 158
    new-instance v3, La/j1p;

    .line 159
    .line 160
    const/4 v5, 0x0

    .line 161
    invoke-direct {v3, v1, v5}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v4, v3}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    :cond_2
    invoke-static {v4}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-wide/16 v3, 0xc1c

    .line 172
    .line 173
    invoke-virtual {v2, v1, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 174
    .line 175
    .line 176
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 177
    .line 178
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 179
    .line 180
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    move-object v2, v1

    .line 188
    check-cast v2, La/dvk0;

    .line 189
    .line 190
    const/16 v29, 0x0

    .line 191
    .line 192
    const v30, 0x3ffffffe    # 1.9999998f

    .line 193
    .line 194
    .line 195
    const/4 v3, 0x1

    .line 196
    const/4 v4, 0x0

    .line 197
    const/4 v5, 0x0

    .line 198
    const/4 v6, 0x0

    .line 199
    const/4 v7, 0x0

    .line 200
    const/4 v8, 0x0

    .line 201
    const/4 v9, 0x0

    .line 202
    const/4 v10, 0x0

    .line 203
    const/4 v11, 0x0

    .line 204
    const/4 v12, 0x0

    .line 205
    const/4 v13, 0x0

    .line 206
    const/4 v14, 0x0

    .line 207
    const/4 v15, 0x0

    .line 208
    const/16 v16, 0x0

    .line 209
    .line 210
    const/16 v17, 0x0

    .line 211
    .line 212
    const/16 v18, 0x0

    .line 213
    .line 214
    const/16 v19, 0x0

    .line 215
    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    const/16 v21, 0x0

    .line 219
    .line 220
    const/16 v22, 0x0

    .line 221
    .line 222
    const/16 v23, 0x0

    .line 223
    .line 224
    const/16 v24, 0x0

    .line 225
    .line 226
    const/16 v25, 0x0

    .line 227
    .line 228
    const/16 v26, 0x0

    .line 229
    .line 230
    const/16 v27, 0x0

    .line 231
    .line 232
    const/16 v28, 0x0

    .line 233
    .line 234
    invoke-static/range {v2 .. v30}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    if-eqz v1, :cond_3

    .line 243
    .line 244
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0
.end method

.method private final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/m7o0;

    .line 4
    .line 5
    sget-object v1, La/wne;->a:La/wne;

    .line 6
    .line 7
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/w6o0;

    .line 13
    .line 14
    sget-object p1, La/u6o0;->a:La/u6o0;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    sget p0, La/m7o0;->A:I

    .line 23
    .line 24
    invoke-virtual {v0}, La/m7o0;->M()V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_0
    instance-of p1, p0, La/t6o0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz p1, :cond_4

    .line 33
    .line 34
    check-cast p0, La/t6o0;

    .line 35
    .line 36
    iget p1, p0, La/t6o0;->a:I

    .line 37
    .line 38
    sget p0, La/m7o0;->A:I

    .line 39
    .line 40
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 41
    .line 42
    iget-object v2, p0, La/ocj;->a:La/p7m0;

    .line 43
    .line 44
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 52
    .line 53
    move-object v4, p0

    .line 54
    check-cast v4, La/i7o0;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const/4 v9, 0x0

    .line 64
    const/16 v10, 0xfd

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    invoke-static/range {v4 .. v10}, La/i7o0;->a(La/i7o0;ZLjava/lang/Integer;Ljava/util/List;Ljava/util/List;ZI)La/i7o0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v2, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    iget-object p0, v0, La/m7o0;->z:La/bby;

    .line 80
    .line 81
    if-eqz p0, :cond_2

    .line 82
    .line 83
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    new-instance p0, La/ttn0;

    .line 87
    .line 88
    const/4 v2, 0x5

    .line 89
    invoke-direct {p0, v0, v2}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    new-instance v2, La/l7o0;

    .line 93
    .line 94
    invoke-direct {v2, v0, p1, v1}, La/l7o0;-><init>(La/m7o0;ILa/yje;)V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    invoke-static {v0, v1, p0, v2, v3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    iput-object p0, v0, La/m7o0;->z:La/bby;

    .line 103
    .line 104
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/i7o0;

    .line 109
    .line 110
    iget-object p0, p0, La/i7o0;->e:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Ljava/util/Date;

    .line 117
    .line 118
    if-nez p0, :cond_3

    .line 119
    .line 120
    new-instance p0, Ljava/util/Date;

    .line 121
    .line 122
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 123
    .line 124
    .line 125
    :cond_3
    sget-object p1, La/rdj;->a:La/rdj;

    .line 126
    .line 127
    sget-object v2, La/sdj;->b:La/sdj;

    .line 128
    .line 129
    const/16 v3, 0x3c

    .line 130
    .line 131
    invoke-static {p1, v2, p0, v1, v3}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    iget-object p1, v0, La/m7o0;->u:La/ih5;

    .line 136
    .line 137
    invoke-virtual {p1, p0}, La/ih5;->n(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object p1, v0, La/m7o0;->v:La/zr1;

    .line 141
    .line 142
    invoke-virtual {p1, p0}, La/zr1;->o(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_4
    instance-of p0, p0, La/v6o0;

    .line 147
    .line 148
    if-eqz p0, :cond_5

    .line 149
    .line 150
    sget p0, La/m7o0;->A:I

    .line 151
    .line 152
    new-instance p0, La/h7o0;

    .line 153
    .line 154
    iget-object p1, v0, La/m7o0;->t:La/ctf0;

    .line 155
    .line 156
    const/4 v1, 0x0

    .line 157
    new-array v2, v1, [Ljava/lang/Object;

    .line 158
    .line 159
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 160
    .line 161
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const v2, 0x7f1313ec    # 1.9549996E38f

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-direct {p0, p1}, La/h7o0;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 182
    .line 183
    .line 184
    return-object v1
.end method

.method private final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/r72;->k:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, La/zap0;

    .line 5
    .line 6
    iget-object v0, v2, La/zap0;->q:La/i1w0;

    .line 7
    .line 8
    sget-object v1, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/map0;

    .line 16
    .line 17
    sget-object p1, La/iap0;->a:La/iap0;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    sget p0, La/zap0;->A:I

    .line 27
    .line 28
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p1, La/c8d;

    .line 33
    .line 34
    sget-object v2, La/y7d;->a:La/v7d;

    .line 35
    .line 36
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 37
    .line 38
    invoke-direct {p1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, p1, v0, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    move-object p1, p0

    .line 46
    check-cast p1, La/paw;

    .line 47
    .line 48
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_e

    .line 53
    .line 54
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/oe50;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    sget-object p1, La/kap0;->a:La/kap0;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    sget p0, La/zap0;->A:I

    .line 73
    .line 74
    invoke-virtual {v2}, La/zap0;->M()V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_3

    .line 78
    .line 79
    :cond_1
    instance-of p1, p0, La/jap0;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    move-object p1, p0

    .line 85
    check-cast p1, La/jap0;

    .line 86
    .line 87
    sget p0, La/zap0;->A:I

    .line 88
    .line 89
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 90
    .line 91
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 92
    .line 93
    :cond_2
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v0, v2, La/i3t0;->f:La/oyg0;

    .line 101
    .line 102
    move-object v5, p0

    .line 103
    check-cast v5, La/wap0;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    iget v0, p1, La/jap0;->a:I

    .line 109
    .line 110
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    const/16 v6, 0x1d

    .line 115
    .line 116
    invoke-static {v5, v1, v0, v3, v6}, La/wap0;->a(La/wap0;ZLjava/lang/Integer;La/j0g0;I)La/wap0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v4, p0, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_2

    .line 125
    .line 126
    goto/16 :goto_3

    .line 127
    .line 128
    :cond_3
    instance-of p1, p0, La/lap0;

    .line 129
    .line 130
    if-eqz p1, :cond_f

    .line 131
    .line 132
    move-object v5, p0

    .line 133
    check-cast v5, La/lap0;

    .line 134
    .line 135
    iget-wide p0, v5, La/lap0;->a:J

    .line 136
    .line 137
    sget v4, La/zap0;->A:I

    .line 138
    .line 139
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    check-cast v4, La/wap0;

    .line 144
    .line 145
    iget-object v4, v4, La/wap0;->c:La/j0g0;

    .line 146
    .line 147
    if-eqz v4, :cond_7

    .line 148
    .line 149
    iget-object v4, v4, La/j0g0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    instance-of v6, v4, La/g0g0;

    .line 152
    .line 153
    if-eqz v6, :cond_4

    .line 154
    .line 155
    move-object v4, v3

    .line 156
    :cond_4
    check-cast v4, Ljava/util/List;

    .line 157
    .line 158
    if-eqz v4, :cond_7

    .line 159
    .line 160
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-eqz v6, :cond_6

    .line 169
    .line 170
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    move-object v7, v6

    .line 175
    check-cast v7, La/k9p0;

    .line 176
    .line 177
    iget-wide v7, v7, La/k9p0;->a:J

    .line 178
    .line 179
    cmp-long v7, v7, p0

    .line 180
    .line 181
    if-nez v7, :cond_5

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_6
    move-object v6, v3

    .line 185
    :goto_1
    check-cast v6, La/k9p0;

    .line 186
    .line 187
    if-eqz v6, :cond_7

    .line 188
    .line 189
    iget-object v4, v6, La/k9p0;->n:Ljava/lang/String;

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_7
    move-object v4, v3

    .line 193
    :goto_2
    if-nez v4, :cond_8

    .line 194
    .line 195
    const-string v4, ""

    .line 196
    .line 197
    :cond_8
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-nez v6, :cond_9

    .line 202
    .line 203
    new-instance p0, La/vap0;

    .line 204
    .line 205
    iget-object p1, v2, La/zap0;->p:La/ctf0;

    .line 206
    .line 207
    new-array v0, v1, [Ljava/lang/Object;

    .line 208
    .line 209
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 210
    .line 211
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const v1, 0x7f1313ec    # 1.9549996E38f

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-direct {p0, p1}, La/vap0;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_9
    move-object v1, v3

    .line 230
    move-object v3, v4

    .line 231
    new-instance v4, La/kie0;

    .line 232
    .line 233
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    check-cast v6, La/wap0;

    .line 241
    .line 242
    iget-object v6, v6, La/wap0;->c:La/j0g0;

    .line 243
    .line 244
    if-eqz v6, :cond_d

    .line 245
    .line 246
    iget-object v6, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 247
    .line 248
    instance-of v7, v6, La/g0g0;

    .line 249
    .line 250
    if-eqz v7, :cond_a

    .line 251
    .line 252
    move-object v6, v1

    .line 253
    :cond_a
    check-cast v6, Ljava/util/List;

    .line 254
    .line 255
    if-eqz v6, :cond_d

    .line 256
    .line 257
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    if-eqz v7, :cond_c

    .line 266
    .line 267
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    move-object v8, v7

    .line 272
    check-cast v8, La/k9p0;

    .line 273
    .line 274
    iget-wide v8, v8, La/k9p0;->a:J

    .line 275
    .line 276
    cmp-long v8, v8, p0

    .line 277
    .line 278
    if-nez v8, :cond_b

    .line 279
    .line 280
    move-object v1, v7

    .line 281
    :cond_c
    check-cast v1, La/k9p0;

    .line 282
    .line 283
    if-eqz v1, :cond_d

    .line 284
    .line 285
    iget p0, v1, La/k9p0;->o:I

    .line 286
    .line 287
    iput p0, v4, La/kie0;->a:I

    .line 288
    .line 289
    iget-object p0, v2, La/zap0;->t:La/pv00;

    .line 290
    .line 291
    iget-object p1, v1, La/k9p0;->e:Ljava/lang/String;

    .line 292
    .line 293
    invoke-static {v1, p1}, La/hhm0;->A(La/k9p0;Ljava/lang/String;)La/vcm0;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {p0, p1}, La/pv00;->n(La/vcm0;)V

    .line 298
    .line 299
    .line 300
    :cond_d
    new-instance v1, La/l0i0;

    .line 301
    .line 302
    const/4 v6, 0x6

    .line 303
    invoke-direct/range {v1 .. v6}, La/l0i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 307
    .line 308
    .line 309
    :cond_e
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object p0

    .line 312
    :cond_f
    move-object v1, v3

    .line 313
    invoke-static {}, La/t9f;->b()V

    .line 314
    .line 315
    .line 316
    return-object v1
.end method

.method private final t(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/r72;->k:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/wbp0;

    .line 7
    .line 8
    iget-object v1, v3, La/wbp0;->q:La/ctf0;

    .line 9
    .line 10
    iget-object v2, v3, La/wbp0;->v:La/hjd;

    .line 11
    .line 12
    iget-object v4, v3, La/i3t0;->f:La/oyg0;

    .line 13
    .line 14
    iget-object v5, v3, La/i3t0;->i:La/ocj;

    .line 15
    .line 16
    iget-object v6, v3, La/wbp0;->p:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 17
    .line 18
    iget-object v8, v3, La/wbp0;->x:La/i1w0;

    .line 19
    .line 20
    sget-object v7, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, La/r72;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/m8p0;

    .line 28
    .line 29
    sget-object v7, La/y7p0;->a:La/y7p0;

    .line 30
    .line 31
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 v9, 0x0

    .line 36
    if-eqz v7, :cond_0

    .line 37
    .line 38
    sget v0, La/wbp0;->L:I

    .line 39
    .line 40
    invoke-static {v8}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, La/c8d;

    .line 45
    .line 46
    sget-object v2, La/y7d;->a:La/v7d;

    .line 47
    .line 48
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 49
    .line 50
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, v8, v0, v9}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_0
    move-object v1, v0

    .line 58
    check-cast v1, La/paw;

    .line 59
    .line 60
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_25

    .line 65
    .line 66
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, La/oe50;

    .line 71
    .line 72
    invoke-virtual {v8, v1}, La/i1w0;->a(La/oe50;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    sget-object v7, La/g8p0;->a:La/g8p0;

    .line 77
    .line 78
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-eqz v7, :cond_1

    .line 83
    .line 84
    sget v0, La/wbp0;->L:I

    .line 85
    .line 86
    invoke-virtual {v3}, La/wbp0;->M()V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_9

    .line 90
    .line 91
    :cond_1
    instance-of v7, v0, La/i8p0;

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    if-eqz v7, :cond_4

    .line 95
    .line 96
    check-cast v0, La/i8p0;

    .line 97
    .line 98
    sget v1, La/wbp0;->L:I

    .line 99
    .line 100
    iget v0, v0, La/i8p0;->a:I

    .line 101
    .line 102
    if-ne v0, v10, :cond_2

    .line 103
    .line 104
    sget-object v0, La/ebp0;->c:La/ebp0;

    .line 105
    .line 106
    :goto_1
    move-object v10, v0

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    sget-object v0, La/dbp0;->c:La/dbp0;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :goto_2
    iget-object v0, v5, La/ocj;->a:La/p7m0;

    .line 112
    .line 113
    :goto_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-object v6, v1

    .line 121
    check-cast v6, La/mbp0;

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const/4 v14, 0x0

    .line 127
    const/16 v15, 0x7f7f

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v9, 0x0

    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    invoke-static/range {v6 .. v15}, La/mbp0;->a(La/mbp0;ZLa/o9p0;Ljava/util/Map;La/fbp0;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/ArrayList;I)La/mbp0;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    move-object v7, v10

    .line 140
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_3

    .line 145
    .line 146
    invoke-virtual {v3}, La/wbp0;->M()V

    .line 147
    .line 148
    .line 149
    goto/16 :goto_9

    .line 150
    .line 151
    :cond_3
    move-object v10, v7

    .line 152
    goto :goto_3

    .line 153
    :cond_4
    instance-of v7, v0, La/e8p0;

    .line 154
    .line 155
    const/4 v11, 0x2

    .line 156
    if-eqz v7, :cond_a

    .line 157
    .line 158
    check-cast v0, La/e8p0;

    .line 159
    .line 160
    sget v1, La/wbp0;->L:I

    .line 161
    .line 162
    iget-object v0, v0, La/e8p0;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    const v2, -0x60f697dc

    .line 169
    .line 170
    .line 171
    if-eq v1, v2, :cond_9

    .line 172
    .line 173
    const v2, 0x2b737d61

    .line 174
    .line 175
    .line 176
    if-eq v1, v2, :cond_7

    .line 177
    .line 178
    const v2, 0x74319f96

    .line 179
    .line 180
    .line 181
    if-eq v1, v2, :cond_5

    .line 182
    .line 183
    goto/16 :goto_9

    .line 184
    .line 185
    :cond_5
    const-string v1, "HEADER_ACHIEVEMENTS"

    .line 186
    .line 187
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-nez v0, :cond_6

    .line 192
    .line 193
    goto/16 :goto_9

    .line 194
    .line 195
    :cond_6
    new-instance v0, La/tbp0;

    .line 196
    .line 197
    invoke-direct {v0, v3, v9}, La/tbp0;-><init>(La/wbp0;B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_9

    .line 204
    .line 205
    :cond_7
    const-string v1, "TRANSFER_HEADER"

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_8

    .line 212
    .line 213
    goto/16 :goto_9

    .line 214
    .line 215
    :cond_8
    new-instance v0, La/tbp0;

    .line 216
    .line 217
    invoke-direct {v0, v3, v10}, La/tbp0;-><init>(La/wbp0;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 221
    .line 222
    .line 223
    goto/16 :goto_9

    .line 224
    .line 225
    :cond_9
    const-string v1, "HEADER_RESULTS"

    .line 226
    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_25

    .line 232
    .line 233
    new-instance v0, La/tbp0;

    .line 234
    .line 235
    invoke-direct {v0, v3, v11}, La/tbp0;-><init>(La/wbp0;B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_9

    .line 242
    .line 243
    :cond_a
    instance-of v7, v0, La/d8p0;

    .line 244
    .line 245
    const/4 v12, 0x0

    .line 246
    if-eqz v7, :cond_d

    .line 247
    .line 248
    check-cast v0, La/d8p0;

    .line 249
    .line 250
    sget v1, La/wbp0;->L:I

    .line 251
    .line 252
    instance-of v1, v0, La/b8p0;

    .line 253
    .line 254
    if-eqz v1, :cond_b

    .line 255
    .line 256
    new-instance v1, La/did;

    .line 257
    .line 258
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    check-cast v4, La/mbp0;

    .line 263
    .line 264
    iget-object v4, v4, La/mbp0;->k:La/e9p0;

    .line 265
    .line 266
    invoke-static {v4}, La/dnm0;->h(La/e9p0;)Ljava/util/ArrayList;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-direct {v1, v4}, La/did;-><init>(Ljava/util/List;)V

    .line 271
    .line 272
    .line 273
    check-cast v0, La/b8p0;

    .line 274
    .line 275
    iget-object v0, v0, La/b8p0;->a:La/uid;

    .line 276
    .line 277
    new-array v4, v11, [La/vid;

    .line 278
    .line 279
    aput-object v1, v4, v9

    .line 280
    .line 281
    aput-object v0, v4, v10

    .line 282
    .line 283
    invoke-static {v3, v2, v4}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 284
    .line 285
    .line 286
    goto/16 :goto_9

    .line 287
    .line 288
    :cond_b
    instance-of v1, v0, La/c8p0;

    .line 289
    .line 290
    if-eqz v1, :cond_c

    .line 291
    .line 292
    new-instance v1, La/did;

    .line 293
    .line 294
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    check-cast v4, La/mbp0;

    .line 299
    .line 300
    iget-object v4, v4, La/mbp0;->k:La/e9p0;

    .line 301
    .line 302
    invoke-static {v4}, La/dnm0;->h(La/e9p0;)Ljava/util/ArrayList;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    invoke-direct {v1, v4}, La/did;-><init>(Ljava/util/List;)V

    .line 307
    .line 308
    .line 309
    check-cast v0, La/c8p0;

    .line 310
    .line 311
    iget-object v0, v0, La/c8p0;->a:La/bem;

    .line 312
    .line 313
    invoke-static {v0}, La/ebc;->n0(La/bem;)La/uid;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-array v4, v11, [La/vid;

    .line 318
    .line 319
    aput-object v1, v4, v9

    .line 320
    .line 321
    aput-object v0, v4, v10

    .line 322
    .line 323
    invoke-static {v3, v2, v4}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 324
    .line 325
    .line 326
    goto/16 :goto_9

    .line 327
    .line 328
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 329
    .line 330
    .line 331
    return-object v12

    .line 332
    :cond_d
    instance-of v2, v0, La/z7p0;

    .line 333
    .line 334
    if-eqz v2, :cond_f

    .line 335
    .line 336
    move-object v2, v0

    .line 337
    check-cast v2, La/z7p0;

    .line 338
    .line 339
    sget v0, La/wbp0;->L:I

    .line 340
    .line 341
    iget-object v5, v5, La/ocj;->a:La/p7m0;

    .line 342
    .line 343
    :cond_e
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-object v6, v0

    .line 351
    check-cast v6, La/mbp0;

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget v1, v2, La/z7p0;->a:I

    .line 357
    .line 358
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v13

    .line 362
    const/4 v14, 0x0

    .line 363
    const/16 v15, 0x6fff

    .line 364
    .line 365
    const/4 v7, 0x0

    .line 366
    const/4 v8, 0x0

    .line 367
    const/4 v9, 0x0

    .line 368
    const/4 v10, 0x0

    .line 369
    const/4 v11, 0x0

    .line 370
    const/4 v12, 0x0

    .line 371
    invoke-static/range {v6 .. v15}, La/mbp0;->a(La/mbp0;ZLa/o9p0;Ljava/util/Map;La/fbp0;La/e9p0;La/obp0;Ljava/lang/Integer;Ljava/util/ArrayList;I)La/mbp0;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    invoke-virtual {v5, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-eqz v0, :cond_e

    .line 380
    .line 381
    goto/16 :goto_9

    .line 382
    .line 383
    :cond_f
    instance-of v2, v0, La/h8p0;

    .line 384
    .line 385
    if-eqz v2, :cond_1a

    .line 386
    .line 387
    move-object v6, v0

    .line 388
    check-cast v6, La/h8p0;

    .line 389
    .line 390
    iget-wide v4, v6, La/h8p0;->a:J

    .line 391
    .line 392
    sget v0, La/wbp0;->L:I

    .line 393
    .line 394
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    check-cast v0, La/mbp0;

    .line 399
    .line 400
    iget-object v0, v0, La/mbp0;->k:La/e9p0;

    .line 401
    .line 402
    if-eqz v0, :cond_13

    .line 403
    .line 404
    iget-object v0, v0, La/e9p0;->d:Ljava/lang/Object;

    .line 405
    .line 406
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 407
    .line 408
    instance-of v2, v0, La/g0g0;

    .line 409
    .line 410
    if-eqz v2, :cond_10

    .line 411
    .line 412
    move-object v0, v12

    .line 413
    :cond_10
    check-cast v0, Ljava/util/List;

    .line 414
    .line 415
    if-eqz v0, :cond_13

    .line 416
    .line 417
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v2

    .line 425
    if-eqz v2, :cond_12

    .line 426
    .line 427
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    move-object v7, v2

    .line 432
    check-cast v7, La/k9p0;

    .line 433
    .line 434
    iget-wide v10, v7, La/k9p0;->a:J

    .line 435
    .line 436
    cmp-long v7, v10, v4

    .line 437
    .line 438
    if-nez v7, :cond_11

    .line 439
    .line 440
    goto :goto_4

    .line 441
    :cond_12
    move-object v2, v12

    .line 442
    :goto_4
    check-cast v2, La/k9p0;

    .line 443
    .line 444
    if-eqz v2, :cond_13

    .line 445
    .line 446
    iget-object v0, v2, La/k9p0;->n:Ljava/lang/String;

    .line 447
    .line 448
    goto :goto_5

    .line 449
    :cond_13
    move-object v0, v12

    .line 450
    :goto_5
    if-nez v0, :cond_14

    .line 451
    .line 452
    const-string v0, ""

    .line 453
    .line 454
    :cond_14
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-nez v2, :cond_15

    .line 459
    .line 460
    new-instance v0, La/jbp0;

    .line 461
    .line 462
    new-array v2, v9, [Ljava/lang/Object;

    .line 463
    .line 464
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 465
    .line 466
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    const v4, 0x7f1313ec    # 1.9549996E38f

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    invoke-direct {v0, v1}, La/jbp0;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_9

    .line 484
    .line 485
    :cond_15
    move-wide v1, v4

    .line 486
    new-instance v5, La/kie0;

    .line 487
    .line 488
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v4

    .line 495
    check-cast v4, La/mbp0;

    .line 496
    .line 497
    iget-object v4, v4, La/mbp0;->k:La/e9p0;

    .line 498
    .line 499
    if-eqz v4, :cond_19

    .line 500
    .line 501
    iget-object v4, v4, La/e9p0;->d:Ljava/lang/Object;

    .line 502
    .line 503
    sget-object v7, La/j0g0;->b:La/e0g0;

    .line 504
    .line 505
    instance-of v7, v4, La/g0g0;

    .line 506
    .line 507
    if-eqz v7, :cond_16

    .line 508
    .line 509
    move-object v4, v12

    .line 510
    :cond_16
    check-cast v4, Ljava/util/List;

    .line 511
    .line 512
    if-eqz v4, :cond_19

    .line 513
    .line 514
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    :cond_17
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v7

    .line 522
    if-eqz v7, :cond_18

    .line 523
    .line 524
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    move-object v9, v7

    .line 529
    check-cast v9, La/k9p0;

    .line 530
    .line 531
    iget-wide v9, v9, La/k9p0;->a:J

    .line 532
    .line 533
    cmp-long v9, v9, v1

    .line 534
    .line 535
    if-nez v9, :cond_17

    .line 536
    .line 537
    move-object v12, v7

    .line 538
    :cond_18
    check-cast v12, La/k9p0;

    .line 539
    .line 540
    if-eqz v12, :cond_19

    .line 541
    .line 542
    iget v1, v12, La/k9p0;->o:I

    .line 543
    .line 544
    iput v1, v5, La/kie0;->a:I

    .line 545
    .line 546
    iget-object v1, v3, La/wbp0;->w:La/pv00;

    .line 547
    .line 548
    iget-object v2, v12, La/k9p0;->e:Ljava/lang/String;

    .line 549
    .line 550
    invoke-static {v12, v2}, La/hhm0;->A(La/k9p0;Ljava/lang/String;)La/vcm0;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    invoke-virtual {v1, v2}, La/pv00;->n(La/vcm0;)V

    .line 555
    .line 556
    .line 557
    :cond_19
    new-instance v2, La/l0i0;

    .line 558
    .line 559
    const/4 v7, 0x7

    .line 560
    move-object v4, v0

    .line 561
    invoke-direct/range {v2 .. v7}, La/l0i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v8, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 565
    .line 566
    .line 567
    goto/16 :goto_9

    .line 568
    .line 569
    :cond_1a
    instance-of v2, v0, La/a8p0;

    .line 570
    .line 571
    if-eqz v2, :cond_1b

    .line 572
    .line 573
    check-cast v0, La/a8p0;

    .line 574
    .line 575
    sget v1, La/wbp0;->L:I

    .line 576
    .line 577
    iget-wide v1, v6, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 578
    .line 579
    iget-wide v4, v0, La/a8p0;->a:J

    .line 580
    .line 581
    cmp-long v1, v1, v4

    .line 582
    .line 583
    if-eqz v1, :cond_25

    .line 584
    .line 585
    new-instance v1, La/itn0;

    .line 586
    .line 587
    const/16 v2, 0x16

    .line 588
    .line 589
    invoke-direct {v1, v3, v0, v2}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v8, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 593
    .line 594
    .line 595
    goto/16 :goto_9

    .line 596
    .line 597
    :cond_1b
    instance-of v2, v0, La/k8p0;

    .line 598
    .line 599
    if-eqz v2, :cond_1c

    .line 600
    .line 601
    check-cast v0, La/k8p0;

    .line 602
    .line 603
    sget v1, La/wbp0;->L:I

    .line 604
    .line 605
    iget-wide v0, v0, La/k8p0;->a:J

    .line 606
    .line 607
    const-wide/16 v4, 0x1

    .line 608
    .line 609
    cmp-long v0, v0, v4

    .line 610
    .line 611
    if-nez v0, :cond_25

    .line 612
    .line 613
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, La/mbp0;

    .line 618
    .line 619
    iget-object v0, v0, La/mbp0;->n:Ljava/util/List;

    .line 620
    .line 621
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 622
    .line 623
    .line 624
    move-result v0

    .line 625
    if-le v0, v10, :cond_25

    .line 626
    .line 627
    new-instance v0, La/ibp0;

    .line 628
    .line 629
    new-instance v1, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;

    .line 630
    .line 631
    iget-wide v4, v6, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 632
    .line 633
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    check-cast v2, La/mbp0;

    .line 638
    .line 639
    iget-object v2, v2, La/mbp0;->n:Ljava/util/List;

    .line 640
    .line 641
    invoke-direct {v1, v4, v5, v2}, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;-><init>(JLjava/util/List;)V

    .line 642
    .line 643
    .line 644
    invoke-direct {v0, v1}, La/ibp0;-><init>(Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    goto/16 :goto_9

    .line 651
    .line 652
    :cond_1c
    instance-of v2, v0, La/l8p0;

    .line 653
    .line 654
    if-eqz v2, :cond_1d

    .line 655
    .line 656
    check-cast v0, La/l8p0;

    .line 657
    .line 658
    sget v1, La/wbp0;->L:I

    .line 659
    .line 660
    new-instance v1, La/itn0;

    .line 661
    .line 662
    const/16 v2, 0x17

    .line 663
    .line 664
    invoke-direct {v1, v3, v0, v2}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v8, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_9

    .line 671
    .line 672
    :cond_1d
    instance-of v2, v0, La/f8p0;

    .line 673
    .line 674
    if-eqz v2, :cond_22

    .line 675
    .line 676
    check-cast v0, La/f8p0;

    .line 677
    .line 678
    sget v1, La/wbp0;->L:I

    .line 679
    .line 680
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    check-cast v1, La/mbp0;

    .line 685
    .line 686
    iget-object v1, v1, La/mbp0;->n:Ljava/util/List;

    .line 687
    .line 688
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v2

    .line 696
    if-eqz v2, :cond_1f

    .line 697
    .line 698
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v2

    .line 702
    move-object v4, v2

    .line 703
    check-cast v4, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;

    .line 704
    .line 705
    iget-wide v4, v4, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->a:J

    .line 706
    .line 707
    iget-wide v10, v0, La/f8p0;->a:J

    .line 708
    .line 709
    cmp-long v4, v4, v10

    .line 710
    .line 711
    if-nez v4, :cond_1e

    .line 712
    .line 713
    move-object v12, v2

    .line 714
    :cond_1f
    check-cast v12, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;

    .line 715
    .line 716
    if-nez v12, :cond_20

    .line 717
    .line 718
    goto/16 :goto_9

    .line 719
    .line 720
    :cond_20
    new-instance v13, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 721
    .line 722
    iget-wide v14, v12, Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineLineupModel;->a:J

    .line 723
    .line 724
    iget-wide v0, v6, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->b:J

    .line 725
    .line 726
    iget-object v2, v6, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->c:Ljava/lang/String;

    .line 727
    .line 728
    move-wide/from16 v16, v0

    .line 729
    .line 730
    move-object/from16 v18, v2

    .line 731
    .line 732
    invoke-direct/range {v13 .. v18}, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;-><init>(JJLjava/lang/String;)V

    .line 733
    .line 734
    .line 735
    invoke-static {v8}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget-object v1, v3, La/wbp0;->u:La/vqc;

    .line 740
    .line 741
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 742
    .line 743
    .line 744
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;

    .line 745
    .line 746
    invoke-direct {v2, v1, v13}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$teamDetailsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;)V

    .line 747
    .line 748
    .line 749
    instance-of v1, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 750
    .line 751
    if-eqz v1, :cond_21

    .line 752
    .line 753
    new-instance v1, La/e1w0;

    .line 754
    .line 755
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 756
    .line 757
    invoke-direct {v1, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 758
    .line 759
    .line 760
    new-instance v2, La/c8d;

    .line 761
    .line 762
    sget-object v3, La/y7d;->a:La/v7d;

    .line 763
    .line 764
    invoke-direct {v2, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 768
    .line 769
    .line 770
    goto :goto_6

    .line 771
    :cond_21
    new-instance v1, La/w0w0;

    .line 772
    .line 773
    invoke-direct {v1, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 774
    .line 775
    .line 776
    new-instance v2, La/c8d;

    .line 777
    .line 778
    sget-object v3, La/y7d;->a:La/v7d;

    .line 779
    .line 780
    invoke-direct {v2, v3, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 784
    .line 785
    .line 786
    :goto_6
    invoke-static {v8, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    :goto_7
    move-object v1, v0

    .line 791
    check-cast v1, La/paw;

    .line 792
    .line 793
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 794
    .line 795
    .line 796
    move-result v2

    .line 797
    if-eqz v2, :cond_25

    .line 798
    .line 799
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    check-cast v1, La/oe50;

    .line 804
    .line 805
    invoke-virtual {v8, v1}, La/i1w0;->a(La/oe50;)V

    .line 806
    .line 807
    .line 808
    goto :goto_7

    .line 809
    :cond_22
    instance-of v2, v0, La/j8p0;

    .line 810
    .line 811
    if-eqz v2, :cond_26

    .line 812
    .line 813
    check-cast v0, La/j8p0;

    .line 814
    .line 815
    sget v2, La/wbp0;->L:I

    .line 816
    .line 817
    const/4 v2, 0x5

    .line 818
    new-array v2, v2, [La/yxg;

    .line 819
    .line 820
    sget-object v4, La/ttg;->d:La/ttg;

    .line 821
    .line 822
    aput-object v4, v2, v9

    .line 823
    .line 824
    sget-object v4, La/trg;->d:La/trg;

    .line 825
    .line 826
    aput-object v4, v2, v10

    .line 827
    .line 828
    sget-object v4, La/oxg;->d:La/oxg;

    .line 829
    .line 830
    aput-object v4, v2, v11

    .line 831
    .line 832
    sget-object v4, La/pug;->d:La/pug;

    .line 833
    .line 834
    const/4 v5, 0x3

    .line 835
    aput-object v4, v2, v5

    .line 836
    .line 837
    sget-object v4, La/yvg;->d:La/yvg;

    .line 838
    .line 839
    const/4 v5, 0x4

    .line 840
    aput-object v4, v2, v5

    .line 841
    .line 842
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 843
    .line 844
    .line 845
    move-result-object v2

    .line 846
    new-instance v4, Ljava/util/ArrayList;

    .line 847
    .line 848
    const/16 v5, 0xa

    .line 849
    .line 850
    invoke-static {v2, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 851
    .line 852
    .line 853
    move-result v5

    .line 854
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 855
    .line 856
    .line 857
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 862
    .line 863
    .line 864
    move-result v5

    .line 865
    if-eqz v5, :cond_23

    .line 866
    .line 867
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v5

    .line 871
    check-cast v5, La/yxg;

    .line 872
    .line 873
    iget-wide v5, v5, La/yxg;->a:J

    .line 874
    .line 875
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 876
    .line 877
    .line 878
    move-result-object v5

    .line 879
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    goto :goto_8

    .line 883
    :cond_23
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    check-cast v2, La/mbp0;

    .line 888
    .line 889
    iget-object v2, v2, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 890
    .line 891
    iget-wide v5, v2, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 892
    .line 893
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 894
    .line 895
    .line 896
    move-result-object v2

    .line 897
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    if-eqz v2, :cond_24

    .line 902
    .line 903
    iget-boolean v2, v0, La/j8p0;->c:Z

    .line 904
    .line 905
    if-eqz v2, :cond_24

    .line 906
    .line 907
    iget-object v1, v3, La/wbp0;->B:La/hzg;

    .line 908
    .line 909
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v2

    .line 913
    check-cast v2, La/mbp0;

    .line 914
    .line 915
    iget-object v2, v2, La/mbp0;->b:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;

    .line 916
    .line 917
    iget-wide v4, v2, Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsParams;->a:J

    .line 918
    .line 919
    iget-wide v6, v0, La/j8p0;->a:J

    .line 920
    .line 921
    iget-object v8, v0, La/j8p0;->b:Ljava/lang/String;

    .line 922
    .line 923
    sget-object v9, La/k1g;->h:La/k1g;

    .line 924
    .line 925
    move-object v3, v1

    .line 926
    check-cast v3, La/uzg;

    .line 927
    .line 928
    invoke-virtual/range {v3 .. v9}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 929
    .line 930
    .line 931
    goto :goto_9

    .line 932
    :cond_24
    new-instance v0, La/jbp0;

    .line 933
    .line 934
    new-array v2, v9, [Ljava/lang/Object;

    .line 935
    .line 936
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 937
    .line 938
    invoke-static {v2, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    const v4, 0x7f131302

    .line 943
    .line 944
    .line 945
    invoke-virtual {v1, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    invoke-direct {v0, v1}, La/jbp0;-><init>(Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 953
    .line 954
    .line 955
    :cond_25
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 956
    .line 957
    return-object v0

    .line 958
    :cond_26
    invoke-static {}, La/t9f;->b()V

    .line 959
    .line 960
    .line 961
    return-object v12
.end method

.method private final x(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, La/r72;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, La/r72;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/ofr0;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, La/y0r0;

    .line 21
    .line 22
    sget-object v1, La/f1r0;->a:La/f1r0;

    .line 23
    .line 24
    invoke-direct {v0, v1, p1}, La/y0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    sget p1, La/ofr0;->U0:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, La/ofr0;->V(La/a1r0;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, La/y0r0;

    .line 34
    .line 35
    sget-object v0, La/g1r0;->a:La/g1r0;

    .line 36
    .line 37
    sget-object v1, La/iun;->a:La/iun;

    .line 38
    .line 39
    invoke-direct {p1, v0, v1}, La/y0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    sget v0, La/ofr0;->U0:I

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/ofr0;->V(La/a1r0;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0
.end method

.method private final y(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/r72;->k:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/a6t0;

    .line 7
    .line 8
    iget-object v1, v3, La/a6t0;->A:La/kys0;

    .line 9
    .line 10
    iget-object v2, v3, La/a6t0;->p:La/mne;

    .line 11
    .line 12
    iget-object v4, v3, La/a6t0;->u:La/oeg0;

    .line 13
    .line 14
    iget-object v5, v3, La/i3t0;->f:La/oyg0;

    .line 15
    .line 16
    iget-object v6, v3, La/i3t0;->i:La/ocj;

    .line 17
    .line 18
    sget-object v7, La/wne;->a:La/wne;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, La/r72;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/d5t0;

    .line 26
    .line 27
    instance-of v7, v0, La/v4t0;

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, La/c8d;

    .line 41
    .line 42
    sget-object v3, La/y7d;->a:La/v7d;

    .line 43
    .line 44
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 45
    .line 46
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2, v0, v1, v8}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_0
    move-object v2, v1

    .line 54
    check-cast v2, La/paw;

    .line 55
    .line 56
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_16

    .line 61
    .line 62
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, La/oe50;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    instance-of v7, v0, La/z4t0;

    .line 73
    .line 74
    if-eqz v7, :cond_1

    .line 75
    .line 76
    sget v0, La/a6t0;->K:I

    .line 77
    .line 78
    invoke-virtual {v3}, La/a6t0;->M()V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :cond_1
    instance-of v7, v0, La/y4t0;

    .line 84
    .line 85
    move-object v9, v6

    .line 86
    const/4 v6, 0x0

    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    check-cast v0, La/y4t0;

    .line 90
    .line 91
    iget-object v0, v0, La/y4t0;->a:La/ims;

    .line 92
    .line 93
    sget v5, La/a6t0;->K:I

    .line 94
    .line 95
    instance-of v5, v0, La/gms;

    .line 96
    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    check-cast v0, La/gms;

    .line 100
    .line 101
    iget-wide v4, v0, La/gms;->a:J

    .line 102
    .line 103
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v10, v2, La/mne;->a:La/rwj;

    .line 108
    .line 109
    new-instance v2, La/wn10;

    .line 110
    .line 111
    const/16 v7, 0x15

    .line 112
    .line 113
    invoke-direct/range {v2 .. v7}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 114
    .line 115
    .line 116
    const/16 v12, 0xb

    .line 117
    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    move-object v7, v0

    .line 121
    move-object v11, v2

    .line 122
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 123
    .line 124
    .line 125
    goto/16 :goto_7

    .line 126
    .line 127
    :cond_2
    instance-of v2, v0, La/hms;

    .line 128
    .line 129
    if-eqz v2, :cond_16

    .line 130
    .line 131
    check-cast v0, La/hms;

    .line 132
    .line 133
    iget-wide v2, v0, La/hms;->a:J

    .line 134
    .line 135
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    new-instance v4, La/k0w0;

    .line 143
    .line 144
    invoke-direct {v4, v0}, La/k0w0;-><init>(La/i1w0;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v1, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;

    .line 151
    .line 152
    invoke-direct {v1, v2, v3}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getFighterFragmentScreen$1;-><init>(J)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 156
    .line 157
    .line 158
    iget-object v1, v4, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 159
    .line 160
    invoke-static {v0, v1, v8}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :goto_1
    move-object v2, v1

    .line 165
    check-cast v2, La/paw;

    .line 166
    .line 167
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_16

    .line 172
    .line 173
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, La/oe50;

    .line 178
    .line 179
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_3
    instance-of v7, v0, La/w4t0;

    .line 184
    .line 185
    if-eqz v7, :cond_9

    .line 186
    .line 187
    check-cast v0, La/w4t0;

    .line 188
    .line 189
    iget-object v0, v0, La/w4t0;->a:La/hdb;

    .line 190
    .line 191
    sget v2, La/a6t0;->K:I

    .line 192
    .line 193
    instance-of v2, v0, La/fdb;

    .line 194
    .line 195
    if-eqz v2, :cond_4

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    new-instance v6, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getHomeFragmentScreen$1;

    .line 201
    .line 202
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_4
    instance-of v0, v0, La/edb;

    .line 207
    .line 208
    if-eqz v0, :cond_7

    .line 209
    .line 210
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, La/s5t0;

    .line 215
    .line 216
    iget-object v0, v0, La/s5t0;->c:La/i6t0;

    .line 217
    .line 218
    const-wide/16 v9, 0x0

    .line 219
    .line 220
    if-eqz v0, :cond_5

    .line 221
    .line 222
    iget-wide v11, v0, La/i6t0;->g:J

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_5
    move-wide v11, v9

    .line 226
    :goto_2
    cmp-long v0, v11, v9

    .line 227
    .line 228
    if-eqz v0, :cond_7

    .line 229
    .line 230
    invoke-virtual {v3}, La/i3t0;->D()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, La/s5t0;

    .line 235
    .line 236
    iget-object v0, v0, La/s5t0;->c:La/i6t0;

    .line 237
    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    iget-object v0, v0, La/i6t0;->f:Ljava/lang/String;

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_6
    const-string v0, ""

    .line 244
    .line 245
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v6, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

    .line 249
    .line 250
    invoke-direct {v6, v11, v12, v0}, Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;-><init>(JLjava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :cond_7
    :goto_4
    if-eqz v6, :cond_16

    .line 254
    .line 255
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    instance-of v2, v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 264
    .line 265
    if-eqz v2, :cond_8

    .line 266
    .line 267
    new-instance v2, La/e1w0;

    .line 268
    .line 269
    check-cast v6, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 270
    .line 271
    invoke-direct {v2, v6}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 272
    .line 273
    .line 274
    new-instance v3, La/c8d;

    .line 275
    .line 276
    sget-object v4, La/y7d;->a:La/v7d;

    .line 277
    .line 278
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_8
    new-instance v2, La/w0w0;

    .line 286
    .line 287
    invoke-direct {v2, v6}, La/w0w0;-><init>(La/m7h0;)V

    .line 288
    .line 289
    .line 290
    new-instance v3, La/c8d;

    .line 291
    .line 292
    sget-object v4, La/y7d;->a:La/v7d;

    .line 293
    .line 294
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :goto_5
    invoke-static {v0, v1, v8}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    :goto_6
    move-object v2, v1

    .line 305
    check-cast v2, La/paw;

    .line 306
    .line 307
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-eqz v3, :cond_16

    .line 312
    .line 313
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    check-cast v2, La/oe50;

    .line 318
    .line 319
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_9
    instance-of v1, v0, La/b5t0;

    .line 324
    .line 325
    if-eqz v1, :cond_a

    .line 326
    .line 327
    sget v0, La/a6t0;->K:I

    .line 328
    .line 329
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    iget-object v10, v2, La/mne;->c:La/vs10;

    .line 334
    .line 335
    new-instance v11, La/wup0;

    .line 336
    .line 337
    const/16 v0, 0x8

    .line 338
    .line 339
    invoke-direct {v11, v3, v6, v0}, La/wup0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 340
    .line 341
    .line 342
    const/16 v12, 0xb

    .line 343
    .line 344
    const/4 v8, 0x0

    .line 345
    const/4 v9, 0x0

    .line 346
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 347
    .line 348
    .line 349
    goto/16 :goto_7

    .line 350
    .line 351
    :cond_a
    instance-of v1, v0, La/a5t0;

    .line 352
    .line 353
    if-eqz v1, :cond_c

    .line 354
    .line 355
    sget v0, La/a6t0;->K:I

    .line 356
    .line 357
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 358
    .line 359
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    move-object v6, v0

    .line 367
    check-cast v6, La/s5t0;

    .line 368
    .line 369
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    const-wide/16 v23, 0x0

    .line 373
    .line 374
    const v25, 0x1f7ff

    .line 375
    .line 376
    .line 377
    const/4 v7, 0x0

    .line 378
    const/4 v8, 0x0

    .line 379
    const/4 v9, 0x0

    .line 380
    const/4 v10, 0x0

    .line 381
    const/4 v11, 0x0

    .line 382
    const/4 v12, 0x0

    .line 383
    const/4 v13, 0x0

    .line 384
    const/4 v14, 0x0

    .line 385
    const/4 v15, 0x0

    .line 386
    const/16 v16, 0x0

    .line 387
    .line 388
    const-wide/16 v17, 0x0

    .line 389
    .line 390
    const-wide/16 v19, 0x0

    .line 391
    .line 392
    const-wide/16 v21, 0x0

    .line 393
    .line 394
    invoke-static/range {v6 .. v25}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_b

    .line 403
    .line 404
    goto/16 :goto_7

    .line 405
    .line 406
    :cond_c
    instance-of v1, v0, La/c5t0;

    .line 407
    .line 408
    if-eqz v1, :cond_14

    .line 409
    .line 410
    check-cast v0, La/c5t0;

    .line 411
    .line 412
    sget v1, La/a6t0;->K:I

    .line 413
    .line 414
    iget-object v1, v0, La/c5t0;->a:Ljava/lang/String;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    sparse-switch v2, :sswitch_data_0

    .line 421
    .line 422
    .line 423
    goto/16 :goto_7

    .line 424
    .line 425
    :sswitch_0
    const-string v2, "HEAD_TO_HEAD_STATISTIC"

    .line 426
    .line 427
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-nez v1, :cond_d

    .line 432
    .line 433
    goto/16 :goto_7

    .line 434
    .line 435
    :cond_d
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 436
    .line 437
    :cond_e
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    move-object v6, v1

    .line 445
    check-cast v6, La/s5t0;

    .line 446
    .line 447
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    iget-wide v3, v0, La/c5t0;->b:J

    .line 451
    .line 452
    const-wide/16 v23, 0x0

    .line 453
    .line 454
    const v25, 0x17fff

    .line 455
    .line 456
    .line 457
    const/4 v7, 0x0

    .line 458
    const/4 v8, 0x0

    .line 459
    const/4 v9, 0x0

    .line 460
    const/4 v10, 0x0

    .line 461
    const/4 v11, 0x0

    .line 462
    const/4 v12, 0x0

    .line 463
    const/4 v13, 0x0

    .line 464
    const/4 v14, 0x0

    .line 465
    const/4 v15, 0x0

    .line 466
    const/16 v16, 0x0

    .line 467
    .line 468
    const-wide/16 v17, 0x0

    .line 469
    .line 470
    const-wide/16 v19, 0x0

    .line 471
    .line 472
    move-wide/from16 v21, v3

    .line 473
    .line 474
    invoke-static/range {v6 .. v25}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-eqz v1, :cond_e

    .line 483
    .line 484
    goto/16 :goto_7

    .line 485
    .line 486
    :sswitch_1
    const-string v2, "SHOT_MAP"

    .line 487
    .line 488
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    if-nez v1, :cond_f

    .line 493
    .line 494
    goto/16 :goto_7

    .line 495
    .line 496
    :cond_f
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 497
    .line 498
    :cond_10
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    move-object v6, v1

    .line 506
    check-cast v6, La/s5t0;

    .line 507
    .line 508
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    iget-wide v3, v0, La/c5t0;->b:J

    .line 512
    .line 513
    const v25, 0xffff

    .line 514
    .line 515
    .line 516
    const/4 v7, 0x0

    .line 517
    const/4 v8, 0x0

    .line 518
    const/4 v9, 0x0

    .line 519
    const/4 v10, 0x0

    .line 520
    const/4 v11, 0x0

    .line 521
    const/4 v12, 0x0

    .line 522
    const/4 v13, 0x0

    .line 523
    const/4 v14, 0x0

    .line 524
    const/4 v15, 0x0

    .line 525
    const/16 v16, 0x0

    .line 526
    .line 527
    const-wide/16 v17, 0x0

    .line 528
    .line 529
    const-wide/16 v19, 0x0

    .line 530
    .line 531
    const-wide/16 v21, 0x0

    .line 532
    .line 533
    move-wide/from16 v23, v3

    .line 534
    .line 535
    invoke-static/range {v6 .. v25}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-eqz v1, :cond_10

    .line 544
    .line 545
    goto/16 :goto_7

    .line 546
    .line 547
    :sswitch_2
    const-string v2, "FIGHT_STATISTIC"

    .line 548
    .line 549
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    if-nez v1, :cond_11

    .line 554
    .line 555
    goto/16 :goto_7

    .line 556
    .line 557
    :cond_11
    iget-object v2, v9, La/ocj;->a:La/p7m0;

    .line 558
    .line 559
    :cond_12
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    move-object v6, v1

    .line 567
    check-cast v6, La/s5t0;

    .line 568
    .line 569
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    iget-wide v3, v0, La/c5t0;->b:J

    .line 573
    .line 574
    const-wide/16 v23, 0x0

    .line 575
    .line 576
    const v25, 0x1bfff

    .line 577
    .line 578
    .line 579
    const/4 v7, 0x0

    .line 580
    const/4 v8, 0x0

    .line 581
    const/4 v9, 0x0

    .line 582
    const/4 v10, 0x0

    .line 583
    const/4 v11, 0x0

    .line 584
    const/4 v12, 0x0

    .line 585
    const/4 v13, 0x0

    .line 586
    const/4 v14, 0x0

    .line 587
    const/4 v15, 0x0

    .line 588
    const/16 v16, 0x0

    .line 589
    .line 590
    const-wide/16 v17, 0x0

    .line 591
    .line 592
    const-wide/16 v21, 0x0

    .line 593
    .line 594
    move-wide/from16 v19, v3

    .line 595
    .line 596
    invoke-static/range {v6 .. v25}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    invoke-virtual {v2, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-eqz v1, :cond_12

    .line 605
    .line 606
    goto :goto_7

    .line 607
    :sswitch_3
    const-string v2, "GENERAL_STATISTIC"

    .line 608
    .line 609
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    if-eqz v1, :cond_16

    .line 614
    .line 615
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 616
    .line 617
    :cond_13
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    move-object v6, v2

    .line 625
    check-cast v6, La/s5t0;

    .line 626
    .line 627
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    iget-wide v3, v0, La/c5t0;->b:J

    .line 631
    .line 632
    const-wide/16 v23, 0x0

    .line 633
    .line 634
    const v25, 0x1efff

    .line 635
    .line 636
    .line 637
    const/4 v7, 0x0

    .line 638
    const/4 v8, 0x0

    .line 639
    const/4 v9, 0x0

    .line 640
    const/4 v10, 0x0

    .line 641
    const/4 v11, 0x0

    .line 642
    const/4 v12, 0x0

    .line 643
    const/4 v13, 0x0

    .line 644
    const/4 v14, 0x0

    .line 645
    const/4 v15, 0x0

    .line 646
    const/16 v16, 0x0

    .line 647
    .line 648
    const-wide/16 v19, 0x0

    .line 649
    .line 650
    const-wide/16 v21, 0x0

    .line 651
    .line 652
    move-wide/from16 v17, v3

    .line 653
    .line 654
    invoke-static/range {v6 .. v25}, La/s5t0;->a(La/s5t0;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;La/ypl0;La/bqr;ZJJJJI)La/s5t0;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    if-eqz v2, :cond_13

    .line 663
    .line 664
    goto :goto_7

    .line 665
    :cond_14
    instance-of v1, v0, La/x4t0;

    .line 666
    .line 667
    if-eqz v1, :cond_17

    .line 668
    .line 669
    check-cast v0, La/x4t0;

    .line 670
    .line 671
    sget v1, La/a6t0;->K:I

    .line 672
    .line 673
    iget-object v1, v0, La/x4t0;->a:Ljava/lang/String;

    .line 674
    .line 675
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    if-nez v1, :cond_15

    .line 680
    .line 681
    new-instance v0, La/r5t0;

    .line 682
    .line 683
    iget-object v1, v3, La/a6t0;->v:La/ctf0;

    .line 684
    .line 685
    new-array v2, v8, [Ljava/lang/Object;

    .line 686
    .line 687
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 688
    .line 689
    invoke-static {v2, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v2

    .line 693
    const v4, 0x7f1313ec    # 1.9549996E38f

    .line 694
    .line 695
    .line 696
    invoke-virtual {v1, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-direct {v0, v1}, La/r5t0;-><init>(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {v3, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    goto :goto_7

    .line 707
    :cond_15
    invoke-virtual {v4}, La/oeg0;->c()La/i1w0;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    new-instance v2, La/xis0;

    .line 712
    .line 713
    const/16 v4, 0xa

    .line 714
    .line 715
    invoke-direct {v2, v3, v0, v4}, La/xis0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 719
    .line 720
    .line 721
    :cond_16
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    return-object v0

    .line 724
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 725
    .line 726
    .line 727
    const/4 v0, 0x0

    .line 728
    return-object v0

    .line 729
    :sswitch_data_0
    .sparse-switch
        -0x33ad4187 -> :sswitch_3
        -0x91ef85f -> :sswitch_2
        0x1a5d1e77 -> :sswitch_1
        0x2c572736 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/r72;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/r72;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, La/r72;->j:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/r72;

    .line 11
    .line 12
    check-cast p0, La/u0v0;

    .line 13
    .line 14
    check-cast v1, La/yzu0;

    .line 15
    .line 16
    const/16 v2, 0x1a

    .line 17
    .line 18
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, La/r72;

    .line 23
    .line 24
    check-cast p0, La/osu0;

    .line 25
    .line 26
    check-cast v1, La/ztu0;

    .line 27
    .line 28
    const/16 v2, 0x19

    .line 29
    .line 30
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_1
    new-instance v0, La/r72;

    .line 35
    .line 36
    check-cast p0, La/u8t0;

    .line 37
    .line 38
    check-cast v1, La/jdt0;

    .line 39
    .line 40
    const/16 v2, 0x18

    .line 41
    .line 42
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_2
    new-instance v0, La/r72;

    .line 47
    .line 48
    check-cast p0, La/ibt0;

    .line 49
    .line 50
    check-cast v1, La/wbt0;

    .line 51
    .line 52
    const/16 v2, 0x17

    .line 53
    .line 54
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_3
    new-instance v0, La/r72;

    .line 59
    .line 60
    check-cast p0, La/nat0;

    .line 61
    .line 62
    check-cast v1, La/yat0;

    .line 63
    .line 64
    const/16 v2, 0x16

    .line 65
    .line 66
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_4
    new-instance v0, La/r72;

    .line 71
    .line 72
    check-cast p0, La/s9t0;

    .line 73
    .line 74
    check-cast v1, La/dat0;

    .line 75
    .line 76
    const/16 v2, 0x15

    .line 77
    .line 78
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 79
    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_5
    new-instance v0, La/r72;

    .line 83
    .line 84
    check-cast p0, La/d5t0;

    .line 85
    .line 86
    check-cast v1, La/a6t0;

    .line 87
    .line 88
    const/16 v2, 0x14

    .line 89
    .line 90
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_6
    new-instance v0, La/r72;

    .line 95
    .line 96
    check-cast p0, Ljava/util/ArrayList;

    .line 97
    .line 98
    check-cast v1, La/ofr0;

    .line 99
    .line 100
    const/16 v2, 0x13

    .line 101
    .line 102
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_7
    new-instance v0, La/r72;

    .line 107
    .line 108
    check-cast p0, La/m8p0;

    .line 109
    .line 110
    check-cast v1, La/wbp0;

    .line 111
    .line 112
    const/16 v2, 0x12

    .line 113
    .line 114
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_8
    new-instance v0, La/r72;

    .line 119
    .line 120
    check-cast p0, La/map0;

    .line 121
    .line 122
    check-cast v1, La/zap0;

    .line 123
    .line 124
    const/16 v2, 0x11

    .line 125
    .line 126
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    return-object v0

    .line 130
    :pswitch_9
    new-instance v0, La/r72;

    .line 131
    .line 132
    check-cast p0, La/w6o0;

    .line 133
    .line 134
    check-cast v1, La/m7o0;

    .line 135
    .line 136
    const/16 v2, 0x10

    .line 137
    .line 138
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 139
    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_a
    new-instance v0, La/r72;

    .line 143
    .line 144
    check-cast p0, Ljava/util/Date;

    .line 145
    .line 146
    check-cast v1, La/iwk0;

    .line 147
    .line 148
    const/16 v2, 0xf

    .line 149
    .line 150
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_b
    new-instance v0, La/r72;

    .line 155
    .line 156
    check-cast p0, La/pa20;

    .line 157
    .line 158
    check-cast v1, La/lpb0;

    .line 159
    .line 160
    const/16 v2, 0xe

    .line 161
    .line 162
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 163
    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_c
    new-instance v0, La/r72;

    .line 167
    .line 168
    check-cast p0, La/qbs0;

    .line 169
    .line 170
    check-cast v1, La/v360;

    .line 171
    .line 172
    const/16 v2, 0xd

    .line 173
    .line 174
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_d
    new-instance v0, La/r72;

    .line 179
    .line 180
    check-cast p0, La/dyy;

    .line 181
    .line 182
    check-cast v1, La/ryy;

    .line 183
    .line 184
    const/16 v2, 0xc

    .line 185
    .line 186
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_e
    new-instance v0, La/r72;

    .line 191
    .line 192
    check-cast p0, La/vhw;

    .line 193
    .line 194
    check-cast v1, La/tkw;

    .line 195
    .line 196
    const/16 v2, 0xb

    .line 197
    .line 198
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 199
    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_f
    new-instance v0, La/r72;

    .line 203
    .line 204
    check-cast p0, La/kvp;

    .line 205
    .line 206
    check-cast v1, La/typ;

    .line 207
    .line 208
    const/16 v2, 0xa

    .line 209
    .line 210
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_10
    new-instance v0, La/r72;

    .line 215
    .line 216
    check-cast p0, La/r7o;

    .line 217
    .line 218
    check-cast v1, La/k9o;

    .line 219
    .line 220
    const/16 v2, 0x9

    .line 221
    .line 222
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 223
    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_11
    new-instance v0, La/r72;

    .line 227
    .line 228
    check-cast p0, La/rfg;

    .line 229
    .line 230
    check-cast v1, La/igg;

    .line 231
    .line 232
    const/16 v2, 0x8

    .line 233
    .line 234
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :pswitch_12
    new-instance v0, La/r72;

    .line 239
    .line 240
    check-cast p0, La/njb;

    .line 241
    .line 242
    check-cast v1, La/plb;

    .line 243
    .line 244
    const/4 v2, 0x7

    .line 245
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 246
    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_13
    new-instance v0, La/r72;

    .line 250
    .line 251
    check-cast p0, La/r9a;

    .line 252
    .line 253
    check-cast v1, La/ucs0;

    .line 254
    .line 255
    const/4 v2, 0x6

    .line 256
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 257
    .line 258
    .line 259
    return-object v0

    .line 260
    :pswitch_14
    new-instance v0, La/r72;

    .line 261
    .line 262
    check-cast p0, La/r9a;

    .line 263
    .line 264
    check-cast v1, La/n9a;

    .line 265
    .line 266
    const/4 v2, 0x5

    .line 267
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 268
    .line 269
    .line 270
    return-object v0

    .line 271
    :pswitch_15
    new-instance v0, La/r72;

    .line 272
    .line 273
    check-cast p0, Landroid/hardware/camera2/CameraDevice;

    .line 274
    .line 275
    check-cast v1, La/hie0;

    .line 276
    .line 277
    const/4 v2, 0x4

    .line 278
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 279
    .line 280
    .line 281
    return-object v0

    .line 282
    :pswitch_16
    new-instance v0, La/r72;

    .line 283
    .line 284
    check-cast p0, La/t33;

    .line 285
    .line 286
    const/4 v2, 0x3

    .line 287
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 288
    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_17
    new-instance v0, La/r72;

    .line 292
    .line 293
    check-cast p0, La/qbs0;

    .line 294
    .line 295
    check-cast v1, La/ul2;

    .line 296
    .line 297
    const/4 v2, 0x2

    .line 298
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 299
    .line 300
    .line 301
    return-object v0

    .line 302
    :pswitch_18
    new-instance v0, La/r72;

    .line 303
    .line 304
    check-cast p0, La/n92;

    .line 305
    .line 306
    check-cast v1, La/uf50;

    .line 307
    .line 308
    const/4 v2, 0x1

    .line 309
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 310
    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_19
    new-instance v0, La/r72;

    .line 314
    .line 315
    check-cast p0, La/s72;

    .line 316
    .line 317
    check-cast v1, La/s62;

    .line 318
    .line 319
    const/4 v2, 0x0

    .line 320
    invoke-direct {v0, p0, v1, p1, v2}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    nop

    .line 325
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/r72;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/r72;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/r72;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/r72;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/r72;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/r72;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_4
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, La/r72;

    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/r72;

    .line 91
    .line 92
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_6
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, La/r72;

    .line 104
    .line 105
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    :pswitch_7
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/r72;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_8
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    check-cast p0, La/r72;

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_9
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, La/r72;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :pswitch_a
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, La/r72;

    .line 156
    .line 157
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0

    .line 164
    :pswitch_b
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/r72;

    .line 169
    .line 170
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0

    .line 177
    :pswitch_c
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    check-cast p0, La/r72;

    .line 182
    .line 183
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_d
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    check-cast p0, La/r72;

    .line 195
    .line 196
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :pswitch_e
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    check-cast p0, La/r72;

    .line 208
    .line 209
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :pswitch_f
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, La/r72;

    .line 221
    .line 222
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    return-object p0

    .line 229
    :pswitch_10
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    check-cast p0, La/r72;

    .line 234
    .line 235
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_11
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, La/r72;

    .line 247
    .line 248
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    return-object p0

    .line 255
    :pswitch_12
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    check-cast p0, La/r72;

    .line 260
    .line 261
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    return-object p0

    .line 268
    :pswitch_13
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, La/r72;

    .line 273
    .line 274
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    return-object p0

    .line 281
    :pswitch_14
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, La/r72;

    .line 286
    .line 287
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_15
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    check-cast p0, La/r72;

    .line 299
    .line 300
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    :pswitch_16
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, La/r72;

    .line 312
    .line 313
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 314
    .line 315
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    :pswitch_17
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    check-cast p0, La/r72;

    .line 325
    .line 326
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 327
    .line 328
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    return-object p0

    .line 333
    :pswitch_18
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/r72;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_19
    invoke-virtual {p0, p1}, La/r72;->create(La/yje;)La/yje;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    check-cast p0, La/r72;

    .line 351
    .line 352
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    invoke-virtual {p0, p1}, La/r72;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    return-object p0

    .line 359
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/r72;->i:B

    .line 4
    .line 5
    const-string v2, "CXCP"

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const/16 v4, 0x19

    .line 10
    .line 11
    const/16 v5, 0xb

    .line 12
    .line 13
    sget-object v6, La/p0w0;->a:La/p0w0;

    .line 14
    .line 15
    const-string v7, "REMOVING_TRACK_COEF_KEY"

    .line 16
    .line 17
    const/4 v8, 0x3

    .line 18
    const/4 v9, 0x2

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x1

    .line 21
    iget-object v12, v0, La/r72;->k:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v13, v0, La/r72;->j:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v14, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    check-cast v13, La/u0v0;

    .line 35
    .line 36
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/j0v0;

    .line 41
    .line 42
    iget-object v0, v0, La/j0v0;->e:Ljava/util/List;

    .line 43
    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    instance-of v3, v2, La/yzu0;

    .line 64
    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-ge v0, v9, :cond_2

    .line 76
    .line 77
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_2
    invoke-virtual {v13}, La/i3t0;->D()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/j0v0;

    .line 86
    .line 87
    iget-object v0, v0, La/j0v0;->f:Ljava/util/Map;

    .line 88
    .line 89
    check-cast v12, La/yzu0;

    .line 90
    .line 91
    iget-wide v1, v12, La/yzu0;->a:J

    .line 92
    .line 93
    new-instance v3, Ljava/lang/Long;

    .line 94
    .line 95
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, La/ql5;

    .line 103
    .line 104
    if-eqz v0, :cond_8

    .line 105
    .line 106
    iget-object v1, v0, La/ql5;->i:La/txs0;

    .line 107
    .line 108
    iget-object v2, v13, La/u0v0;->G:La/pru;

    .line 109
    .line 110
    iget-object v3, v13, La/i3t0;->i:La/ocj;

    .line 111
    .line 112
    iget-object v3, v3, La/ocj;->a:La/p7m0;

    .line 113
    .line 114
    :goto_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object v5, v13, La/i3t0;->f:La/oyg0;

    .line 122
    .line 123
    move-object v14, v4

    .line 124
    check-cast v14, La/j0v0;

    .line 125
    .line 126
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    const/16 v26, 0x0

    .line 130
    .line 131
    const/16 v27, 0x6fe

    .line 132
    .line 133
    const/4 v15, 0x0

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const/16 v21, 0x0

    .line 145
    .line 146
    const/16 v22, 0x0

    .line 147
    .line 148
    const-wide/16 v24, 0x0

    .line 149
    .line 150
    move-object/from16 v23, v0

    .line 151
    .line 152
    invoke-static/range {v14 .. v27}, La/j0v0;->a(La/j0v0;ZZZZLjava/util/List;Ljava/util/Map;La/ql5;La/ql5;La/ql5;JZI)La/j0v0;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    move-object/from16 v5, v23

    .line 157
    .line 158
    invoke-virtual {v3, v4, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    invoke-virtual {v1}, La/txs0;->e()Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-nez v0, :cond_6

    .line 169
    .line 170
    sget-object v0, La/txs0;->e:La/txs0;

    .line 171
    .line 172
    if-ne v1, v0, :cond_3

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_3
    sget-object v0, La/txs0;->f:La/txs0;

    .line 176
    .line 177
    if-ne v1, v0, :cond_5

    .line 178
    .line 179
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v0, v0, La/sff0;->d:La/q1w0;

    .line 184
    .line 185
    iget-object v0, v0, La/q1w0;->a:La/dyv0;

    .line 186
    .line 187
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    sget-object v2, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Slots;->a:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Slots;

    .line 192
    .line 193
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    iget-boolean v2, v0, La/dyv0;->a:Z

    .line 197
    .line 198
    if-eqz v2, :cond_4

    .line 199
    .line 200
    new-instance v2, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;

    .line 201
    .line 202
    iget-object v0, v0, La/dyv0;->b:Ljava/lang/String;

    .line 203
    .line 204
    invoke-direct {v2, v0}, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    :cond_4
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    new-instance v1, La/d0v0;

    .line 215
    .line 216
    invoke-direct {v1, v0}, La/d0v0;-><init>(Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v13, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_5
    sget-object v0, La/txs0;->h:La/txs0;

    .line 224
    .line 225
    if-ne v1, v0, :cond_8

    .line 226
    .line 227
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    iget-object v0, v0, La/sff0;->d:La/q1w0;

    .line 232
    .line 233
    iget-object v0, v0, La/q1w0;->a:La/dyv0;

    .line 234
    .line 235
    iget-object v0, v0, La/dyv0;->b:Ljava/lang/String;

    .line 236
    .line 237
    new-instance v1, La/d0v0;

    .line 238
    .line 239
    new-instance v2, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;

    .line 240
    .line 241
    invoke-direct {v2, v0}, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-direct {v1, v0}, La/d0v0;-><init>(Ljava/util/List;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v13, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_6
    :goto_2
    iget-object v0, v13, La/u0v0;->t:La/je;

    .line 256
    .line 257
    iget-object v0, v0, La/je;->a:La/s1p;

    .line 258
    .line 259
    const-wide/16 v1, 0xcca

    .line 260
    .line 261
    sget-object v3, La/xun;->a:La/xun;

    .line 262
    .line 263
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 264
    .line 265
    .line 266
    iget-object v0, v13, La/u0v0;->s:La/zg;

    .line 267
    .line 268
    iget-object v0, v0, La/zg;->a:La/kt2;

    .line 269
    .line 270
    const-string v1, "change_bill_choose"

    .line 271
    .line 272
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    new-instance v0, La/c0v0;

    .line 276
    .line 277
    invoke-direct {v0, v5}, La/c0v0;-><init>(La/ql5;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v13, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_7
    move-object v0, v5

    .line 285
    goto/16 :goto_1

    .line 286
    .line 287
    :cond_8
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    :goto_4
    return-object v0

    .line 290
    :pswitch_0
    invoke-direct/range {p0 .. p1}, La/r72;->K(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    return-object v0

    .line 295
    :pswitch_1
    invoke-direct/range {p0 .. p1}, La/r72;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    return-object v0

    .line 300
    :pswitch_2
    invoke-direct/range {p0 .. p1}, La/r72;->I(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    return-object v0

    .line 305
    :pswitch_3
    invoke-direct/range {p0 .. p1}, La/r72;->H(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    return-object v0

    .line 310
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/r72;->G(Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    return-object v0

    .line 315
    :pswitch_5
    invoke-direct/range {p0 .. p1}, La/r72;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    return-object v0

    .line 320
    :pswitch_6
    invoke-direct/range {p0 .. p1}, La/r72;->x(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    return-object v0

    .line 325
    :pswitch_7
    invoke-direct/range {p0 .. p1}, La/r72;->t(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    return-object v0

    .line 330
    :pswitch_8
    invoke-direct/range {p0 .. p1}, La/r72;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :pswitch_9
    invoke-direct/range {p0 .. p1}, La/r72;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    return-object v0

    .line 340
    :pswitch_a
    invoke-direct/range {p0 .. p1}, La/r72;->o(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    return-object v0

    .line 345
    :pswitch_b
    check-cast v12, La/lpb0;

    .line 346
    .line 347
    sget-object v0, La/wne;->a:La/wne;

    .line 348
    .line 349
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    check-cast v13, La/pa20;

    .line 353
    .line 354
    if-eqz v13, :cond_a

    .line 355
    .line 356
    instance-of v0, v13, La/na20;

    .line 357
    .line 358
    if-eqz v0, :cond_9

    .line 359
    .line 360
    check-cast v13, La/na20;

    .line 361
    .line 362
    iget-object v0, v13, La/na20;->c:Ljava/lang/String;

    .line 363
    .line 364
    new-instance v1, La/vob0;

    .line 365
    .line 366
    invoke-direct {v1, v0}, La/vob0;-><init>(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    sget v0, La/lpb0;->G:I

    .line 370
    .line 371
    invoke-virtual {v12, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_9
    instance-of v0, v13, La/oa20;

    .line 376
    .line 377
    if-eqz v0, :cond_a

    .line 378
    .line 379
    iget-object v0, v12, La/lpb0;->r:La/ctf0;

    .line 380
    .line 381
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, La/zob0;

    .line 386
    .line 387
    iget-object v1, v1, La/zob0;->f:Ljava/lang/String;

    .line 388
    .line 389
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 394
    .line 395
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    const v2, 0x7f1309d9

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    new-instance v1, La/xob0;

    .line 407
    .line 408
    invoke-direct {v1, v0}, La/xob0;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v12, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    iget-object v0, v12, La/lpb0;->y:La/pmi0;

    .line 415
    .line 416
    invoke-static {v0}, La/pmi0;->i(La/pmi0;)V

    .line 417
    .line 418
    .line 419
    iget-object v0, v12, La/lpb0;->D:La/i1w0;

    .line 420
    .line 421
    new-instance v1, La/hpb0;

    .line 422
    .line 423
    invoke-direct {v1, v12, v8}, La/hpb0;-><init>(La/lpb0;B)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 427
    .line 428
    .line 429
    :goto_5
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 430
    .line 431
    goto :goto_6

    .line 432
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 433
    .line 434
    .line 435
    :goto_6
    return-object v14

    .line 436
    :pswitch_c
    sget-object v0, La/wne;->a:La/wne;

    .line 437
    .line 438
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    new-instance v0, La/pbs0;

    .line 442
    .line 443
    check-cast v13, La/qbs0;

    .line 444
    .line 445
    iget-object v1, v13, La/qbs0;->a:La/bcs0;

    .line 446
    .line 447
    invoke-static {v1}, La/ycm0;->A(La/bcs0;)La/acs0;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    iget-object v2, v13, La/qbs0;->b:La/mbs0;

    .line 452
    .line 453
    invoke-static {v2}, La/dj8;->c0(La/mbs0;)La/m97;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-direct {v0, v1, v2}, La/pbs0;-><init>(La/acs0;La/m97;)V

    .line 458
    .line 459
    .line 460
    check-cast v12, La/v360;

    .line 461
    .line 462
    iget-object v1, v12, La/v360;->z:La/prc;

    .line 463
    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget-object v1, v1, La/prc;->b:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v1, La/qj9;

    .line 470
    .line 471
    invoke-virtual {v1, v0}, La/qj9;->a(La/pbs0;)V

    .line 472
    .line 473
    .line 474
    iget-object v0, v12, La/i3t0;->i:La/ocj;

    .line 475
    .line 476
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 477
    .line 478
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-object v15, v0

    .line 486
    check-cast v15, La/c260;

    .line 487
    .line 488
    const/16 v25, 0x0

    .line 489
    .line 490
    const v26, 0x1ffff

    .line 491
    .line 492
    .line 493
    const/16 v16, 0x0

    .line 494
    .line 495
    const/16 v17, 0x0

    .line 496
    .line 497
    const/16 v18, 0x0

    .line 498
    .line 499
    const/16 v19, 0x0

    .line 500
    .line 501
    const/16 v20, 0x0

    .line 502
    .line 503
    const/16 v21, 0x0

    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const/16 v23, 0x0

    .line 508
    .line 509
    const/16 v24, 0x0

    .line 510
    .line 511
    invoke-static/range {v15 .. v26}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    if-eqz v0, :cond_b

    .line 520
    .line 521
    iget-object v0, v12, La/v360;->o:La/vzg0;

    .line 522
    .line 523
    invoke-virtual {v0, v7, v14}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 527
    .line 528
    return-object v0

    .line 529
    :pswitch_d
    invoke-direct/range {p0 .. p1}, La/r72;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    return-object v0

    .line 534
    :pswitch_e
    invoke-direct/range {p0 .. p1}, La/r72;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    return-object v0

    .line 539
    :pswitch_f
    check-cast v12, La/typ;

    .line 540
    .line 541
    iget-object v0, v12, La/typ;->u:La/hjd;

    .line 542
    .line 543
    iget-object v1, v12, La/typ;->t:La/i1w0;

    .line 544
    .line 545
    sget-object v2, La/wne;->a:La/wne;

    .line 546
    .line 547
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 548
    .line 549
    .line 550
    check-cast v13, La/kvp;

    .line 551
    .line 552
    sget-object v2, La/cvp;->a:La/cvp;

    .line 553
    .line 554
    invoke-virtual {v13, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    if-eqz v2, :cond_c

    .line 559
    .line 560
    sget v0, La/typ;->E:I

    .line 561
    .line 562
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    new-instance v2, La/c8d;

    .line 567
    .line 568
    sget-object v3, La/y7d;->a:La/v7d;

    .line 569
    .line 570
    invoke-direct {v2, v3, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 571
    .line 572
    .line 573
    invoke-static {v0, v2, v1, v0, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    :goto_7
    move-object v2, v0

    .line 578
    check-cast v2, La/paw;

    .line 579
    .line 580
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    if-eqz v3, :cond_17

    .line 585
    .line 586
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v2

    .line 590
    check-cast v2, La/oe50;

    .line 591
    .line 592
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 593
    .line 594
    .line 595
    goto :goto_7

    .line 596
    :cond_c
    sget-object v2, La/hvp;->a:La/hvp;

    .line 597
    .line 598
    invoke-virtual {v13, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v2

    .line 602
    if-eqz v2, :cond_d

    .line 603
    .line 604
    sget v0, La/typ;->E:I

    .line 605
    .line 606
    invoke-virtual {v12}, La/typ;->M()V

    .line 607
    .line 608
    .line 609
    goto/16 :goto_8

    .line 610
    .line 611
    :cond_d
    sget-object v2, La/gvp;->a:La/gvp;

    .line 612
    .line 613
    invoke-virtual {v13, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    if-eqz v2, :cond_e

    .line 618
    .line 619
    sget v0, La/typ;->E:I

    .line 620
    .line 621
    new-instance v0, La/g7p;

    .line 622
    .line 623
    const/4 v2, 0x5

    .line 624
    invoke-direct {v0, v12, v2}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 625
    .line 626
    .line 627
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_8

    .line 631
    .line 632
    :cond_e
    instance-of v2, v13, La/jvp;

    .line 633
    .line 634
    if-eqz v2, :cond_10

    .line 635
    .line 636
    check-cast v13, La/jvp;

    .line 637
    .line 638
    iget-wide v3, v13, La/jvp;->a:J

    .line 639
    .line 640
    sget v0, La/typ;->E:I

    .line 641
    .line 642
    iget-object v0, v12, La/i3t0;->i:La/ocj;

    .line 643
    .line 644
    iget-object v7, v0, La/ocj;->a:La/p7m0;

    .line 645
    .line 646
    :cond_f
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v8

    .line 650
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    iget-object v0, v12, La/i3t0;->f:La/oyg0;

    .line 654
    .line 655
    move-object v1, v0

    .line 656
    move-object v0, v8

    .line 657
    check-cast v0, La/kxp;

    .line 658
    .line 659
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    const/4 v5, 0x0

    .line 663
    const/16 v6, 0xfb

    .line 664
    .line 665
    const/4 v1, 0x0

    .line 666
    const/4 v2, 0x0

    .line 667
    invoke-static/range {v0 .. v6}, La/kxp;->a(La/kxp;ZLa/xwp;JLa/ypl0;I)La/kxp;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v7, v8, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    if-eqz v0, :cond_f

    .line 676
    .line 677
    goto/16 :goto_8

    .line 678
    .line 679
    :cond_10
    instance-of v2, v13, La/ivp;

    .line 680
    .line 681
    if-eqz v2, :cond_15

    .line 682
    .line 683
    check-cast v13, La/ivp;

    .line 684
    .line 685
    iget-object v0, v13, La/ivp;->a:Ljava/lang/String;

    .line 686
    .line 687
    sget v2, La/typ;->E:I

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 690
    .line 691
    .line 692
    move-result v2

    .line 693
    if-nez v2, :cond_11

    .line 694
    .line 695
    new-instance v0, La/ixp;

    .line 696
    .line 697
    iget-object v1, v12, La/typ;->p:La/ctf0;

    .line 698
    .line 699
    new-array v2, v10, [Ljava/lang/Object;

    .line 700
    .line 701
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 702
    .line 703
    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    const v3, 0x7f1313ed    # 1.9549998E38f

    .line 708
    .line 709
    .line 710
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    invoke-direct {v0, v1}, La/ixp;-><init>(Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v12, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 718
    .line 719
    .line 720
    goto/16 :goto_8

    .line 721
    .line 722
    :cond_11
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    check-cast v2, La/kxp;

    .line 727
    .line 728
    iget-object v2, v2, La/kxp;->b:La/xwp;

    .line 729
    .line 730
    if-eqz v2, :cond_17

    .line 731
    .line 732
    iget-object v2, v2, La/xwp;->d:Ljava/lang/Object;

    .line 733
    .line 734
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 735
    .line 736
    instance-of v3, v2, La/g0g0;

    .line 737
    .line 738
    if-eqz v3, :cond_12

    .line 739
    .line 740
    move-object v2, v14

    .line 741
    :cond_12
    check-cast v2, Ljava/util/List;

    .line 742
    .line 743
    if-eqz v2, :cond_17

    .line 744
    .line 745
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    :cond_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 750
    .line 751
    .line 752
    move-result v3

    .line 753
    if-eqz v3, :cond_14

    .line 754
    .line 755
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v3

    .line 759
    move-object v4, v3

    .line 760
    check-cast v4, La/swp;

    .line 761
    .line 762
    iget-object v4, v4, La/swp;->t:Ljava/lang/String;

    .line 763
    .line 764
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v4

    .line 768
    if-eqz v4, :cond_13

    .line 769
    .line 770
    move-object v14, v3

    .line 771
    :cond_14
    check-cast v14, La/swp;

    .line 772
    .line 773
    if-eqz v14, :cond_17

    .line 774
    .line 775
    new-instance v0, La/f5p;

    .line 776
    .line 777
    invoke-direct {v0, v12, v14, v5}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 781
    .line 782
    .line 783
    goto :goto_8

    .line 784
    :cond_15
    instance-of v1, v13, La/fvp;

    .line 785
    .line 786
    if-eqz v1, :cond_19

    .line 787
    .line 788
    check-cast v13, La/fvp;

    .line 789
    .line 790
    sget v1, La/typ;->E:I

    .line 791
    .line 792
    instance-of v1, v13, La/dvp;

    .line 793
    .line 794
    if-eqz v1, :cond_16

    .line 795
    .line 796
    new-instance v1, La/did;

    .line 797
    .line 798
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v2

    .line 802
    check-cast v2, La/kxp;

    .line 803
    .line 804
    iget-object v2, v2, La/kxp;->b:La/xwp;

    .line 805
    .line 806
    invoke-static {v2}, La/qzb;->M(La/xwp;)Ljava/util/ArrayList;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-direct {v1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 811
    .line 812
    .line 813
    check-cast v13, La/dvp;

    .line 814
    .line 815
    iget-object v2, v13, La/dvp;->a:La/uid;

    .line 816
    .line 817
    new-array v3, v9, [La/vid;

    .line 818
    .line 819
    aput-object v1, v3, v10

    .line 820
    .line 821
    aput-object v2, v3, v11

    .line 822
    .line 823
    invoke-static {v12, v0, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 824
    .line 825
    .line 826
    goto :goto_8

    .line 827
    :cond_16
    instance-of v1, v13, La/evp;

    .line 828
    .line 829
    if-eqz v1, :cond_18

    .line 830
    .line 831
    new-instance v1, La/did;

    .line 832
    .line 833
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v2

    .line 837
    check-cast v2, La/kxp;

    .line 838
    .line 839
    iget-object v2, v2, La/kxp;->b:La/xwp;

    .line 840
    .line 841
    invoke-static {v2}, La/qzb;->M(La/xwp;)Ljava/util/ArrayList;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    invoke-direct {v1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 846
    .line 847
    .line 848
    check-cast v13, La/evp;

    .line 849
    .line 850
    iget-object v2, v13, La/evp;->a:La/bem;

    .line 851
    .line 852
    invoke-static {v2}, La/ebc;->n0(La/bem;)La/uid;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    new-array v3, v9, [La/vid;

    .line 857
    .line 858
    aput-object v1, v3, v10

    .line 859
    .line 860
    aput-object v2, v3, v11

    .line 861
    .line 862
    invoke-static {v12, v0, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 863
    .line 864
    .line 865
    :cond_17
    :goto_8
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 866
    .line 867
    goto :goto_9

    .line 868
    :cond_18
    invoke-static {}, La/t9f;->b()V

    .line 869
    .line 870
    .line 871
    goto :goto_9

    .line 872
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 873
    .line 874
    .line 875
    :goto_9
    return-object v14

    .line 876
    :pswitch_10
    check-cast v12, La/k9o;

    .line 877
    .line 878
    iget-object v0, v12, La/k9o;->v:La/ih5;

    .line 879
    .line 880
    iget-object v1, v12, La/k9o;->o:La/hjd;

    .line 881
    .line 882
    iget-object v2, v12, La/k9o;->p:La/hzg;

    .line 883
    .line 884
    sget-object v3, La/wne;->a:La/wne;

    .line 885
    .line 886
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 887
    .line 888
    .line 889
    check-cast v13, La/r7o;

    .line 890
    .line 891
    instance-of v3, v13, La/n7o;

    .line 892
    .line 893
    if-eqz v3, :cond_23

    .line 894
    .line 895
    check-cast v13, La/n7o;

    .line 896
    .line 897
    sget v0, La/k9o;->G:I

    .line 898
    .line 899
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    check-cast v0, La/z8o;

    .line 904
    .line 905
    iget-object v0, v0, La/z8o;->b:La/w7o;

    .line 906
    .line 907
    if-eqz v0, :cond_20

    .line 908
    .line 909
    iget-object v2, v0, La/w7o;->a:Ljava/lang/Object;

    .line 910
    .line 911
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 912
    .line 913
    instance-of v3, v2, La/g0g0;

    .line 914
    .line 915
    if-eqz v3, :cond_1a

    .line 916
    .line 917
    move-object v2, v14

    .line 918
    :cond_1a
    check-cast v2, La/h8o;

    .line 919
    .line 920
    if-eqz v2, :cond_1b

    .line 921
    .line 922
    iget-object v2, v2, La/h8o;->a:Ljava/util/List;

    .line 923
    .line 924
    goto :goto_a

    .line 925
    :cond_1b
    move-object v2, v14

    .line 926
    :goto_a
    if-nez v2, :cond_1c

    .line 927
    .line 928
    sget-object v2, La/iun;->a:La/iun;

    .line 929
    .line 930
    :cond_1c
    iget-object v0, v0, La/w7o;->b:Ljava/lang/Object;

    .line 931
    .line 932
    instance-of v3, v0, La/g0g0;

    .line 933
    .line 934
    if-eqz v3, :cond_1d

    .line 935
    .line 936
    move-object v0, v14

    .line 937
    :cond_1d
    check-cast v0, La/h8o;

    .line 938
    .line 939
    if-eqz v0, :cond_1e

    .line 940
    .line 941
    iget-object v0, v0, La/h8o;->a:Ljava/util/List;

    .line 942
    .line 943
    goto :goto_b

    .line 944
    :cond_1e
    move-object v0, v14

    .line 945
    :goto_b
    if-nez v0, :cond_1f

    .line 946
    .line 947
    sget-object v0, La/iun;->a:La/iun;

    .line 948
    .line 949
    :cond_1f
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    goto :goto_c

    .line 954
    :cond_20
    sget-object v0, La/iun;->a:La/iun;

    .line 955
    .line 956
    :goto_c
    instance-of v2, v13, La/l7o;

    .line 957
    .line 958
    if-eqz v2, :cond_21

    .line 959
    .line 960
    new-instance v2, La/did;

    .line 961
    .line 962
    invoke-direct {v2, v0}, La/did;-><init>(Ljava/util/List;)V

    .line 963
    .line 964
    .line 965
    check-cast v13, La/l7o;

    .line 966
    .line 967
    iget-object v0, v13, La/l7o;->a:La/uid;

    .line 968
    .line 969
    new-array v3, v9, [La/vid;

    .line 970
    .line 971
    aput-object v2, v3, v10

    .line 972
    .line 973
    aput-object v0, v3, v11

    .line 974
    .line 975
    invoke-static {v12, v1, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 976
    .line 977
    .line 978
    goto/16 :goto_f

    .line 979
    .line 980
    :cond_21
    instance-of v2, v13, La/m7o;

    .line 981
    .line 982
    if-eqz v2, :cond_22

    .line 983
    .line 984
    new-instance v2, La/did;

    .line 985
    .line 986
    invoke-direct {v2, v0}, La/did;-><init>(Ljava/util/List;)V

    .line 987
    .line 988
    .line 989
    check-cast v13, La/m7o;

    .line 990
    .line 991
    iget-object v0, v13, La/m7o;->a:La/bem;

    .line 992
    .line 993
    invoke-static {v0}, La/ebc;->n0(La/bem;)La/uid;

    .line 994
    .line 995
    .line 996
    move-result-object v0

    .line 997
    new-array v3, v9, [La/vid;

    .line 998
    .line 999
    aput-object v2, v3, v10

    .line 1000
    .line 1001
    aput-object v0, v3, v11

    .line 1002
    .line 1003
    invoke-static {v12, v1, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 1004
    .line 1005
    .line 1006
    goto/16 :goto_f

    .line 1007
    .line 1008
    :cond_22
    invoke-static {}, La/t9f;->b()V

    .line 1009
    .line 1010
    .line 1011
    goto/16 :goto_10

    .line 1012
    .line 1013
    :cond_23
    instance-of v1, v13, La/i7o;

    .line 1014
    .line 1015
    if-eqz v1, :cond_24

    .line 1016
    .line 1017
    sget v0, La/k9o;->G:I

    .line 1018
    .line 1019
    check-cast v2, La/uzg;

    .line 1020
    .line 1021
    invoke-virtual {v2}, La/uzg;->a()V

    .line 1022
    .line 1023
    .line 1024
    goto/16 :goto_f

    .line 1025
    .line 1026
    :cond_24
    instance-of v1, v13, La/o7o;

    .line 1027
    .line 1028
    if-eqz v1, :cond_25

    .line 1029
    .line 1030
    sget v0, La/k9o;->G:I

    .line 1031
    .line 1032
    invoke-virtual {v12}, La/k9o;->M()V

    .line 1033
    .line 1034
    .line 1035
    goto/16 :goto_f

    .line 1036
    .line 1037
    :cond_25
    instance-of v1, v13, La/p7o;

    .line 1038
    .line 1039
    if-eqz v1, :cond_26

    .line 1040
    .line 1041
    check-cast v13, La/p7o;

    .line 1042
    .line 1043
    iget-object v1, v13, La/p7o;->a:La/o5s0;

    .line 1044
    .line 1045
    sget v2, La/k9o;->G:I

    .line 1046
    .line 1047
    iget-object v2, v12, La/k9o;->w:La/zr1;

    .line 1048
    .line 1049
    iget-object v3, v1, La/o5s0;->a:Ljava/lang/String;

    .line 1050
    .line 1051
    sget-object v4, La/r1g;->b:La/r1g;

    .line 1052
    .line 1053
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    iget-object v2, v2, La/zr1;->a:La/s1p;

    .line 1057
    .line 1058
    new-instance v4, La/j1p;

    .line 1059
    .line 1060
    const-string v5, "cyber_general_champ"

    .line 1061
    .line 1062
    invoke-direct {v4, v5, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v6, La/j1p;

    .line 1066
    .line 1067
    invoke-direct {v6, v3, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1068
    .line 1069
    .line 1070
    new-array v3, v9, [La/k1p;

    .line 1071
    .line 1072
    aput-object v4, v3, v10

    .line 1073
    .line 1074
    aput-object v6, v3, v11

    .line 1075
    .line 1076
    invoke-static {v3}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    const-wide/16 v6, 0xd3f

    .line 1081
    .line 1082
    invoke-virtual {v2, v3, v6, v7}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1083
    .line 1084
    .line 1085
    iget-object v2, v1, La/o5s0;->a:Ljava/lang/String;

    .line 1086
    .line 1087
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    iget-object v0, v0, La/ih5;->a:La/kt2;

    .line 1091
    .line 1092
    new-instance v3, Lkotlin/Pair;

    .line 1093
    .line 1094
    const-string v4, "screen"

    .line 1095
    .line 1096
    invoke-direct {v3, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1097
    .line 1098
    .line 1099
    new-instance v4, Lkotlin/Pair;

    .line 1100
    .line 1101
    const-string v5, "social_media"

    .line 1102
    .line 1103
    invoke-direct {v4, v5, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1104
    .line 1105
    .line 1106
    filled-new-array {v3, v4}, [Lkotlin/Pair;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v3

    .line 1110
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v3

    .line 1114
    const-string v4, "cyber_champ_smm"

    .line 1115
    .line 1116
    invoke-interface {v0, v4, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1117
    .line 1118
    .line 1119
    new-instance v0, La/x8o;

    .line 1120
    .line 1121
    iget-object v3, v1, La/o5s0;->c:Ljava/lang/String;

    .line 1122
    .line 1123
    iget-object v1, v1, La/o5s0;->d:Ljava/lang/String;

    .line 1124
    .line 1125
    invoke-direct {v0, v2, v3, v1}, La/x8o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual {v12, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1129
    .line 1130
    .line 1131
    goto/16 :goto_f

    .line 1132
    .line 1133
    :cond_26
    instance-of v1, v13, La/k7o;

    .line 1134
    .line 1135
    if-eqz v1, :cond_27

    .line 1136
    .line 1137
    check-cast v13, La/k7o;

    .line 1138
    .line 1139
    iget-object v0, v13, La/k7o;->a:La/wnk;

    .line 1140
    .line 1141
    sget v1, La/k9o;->G:I

    .line 1142
    .line 1143
    iget-object v3, v12, La/k9o;->w:La/zr1;

    .line 1144
    .line 1145
    iget v1, v0, La/wnk;->a:I

    .line 1146
    .line 1147
    int-to-long v6, v1

    .line 1148
    sget-object v18, La/r1g;->m:La/r1g;

    .line 1149
    .line 1150
    const/4 v9, 0x0

    .line 1151
    const/4 v10, 0x0

    .line 1152
    const-wide/16 v4, 0x28

    .line 1153
    .line 1154
    const-string v8, "cyber_general_champ"

    .line 1155
    .line 1156
    invoke-virtual/range {v3 .. v10}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 1157
    .line 1158
    .line 1159
    iget-object v13, v12, La/k9o;->v:La/ih5;

    .line 1160
    .line 1161
    iget v1, v0, La/wnk;->a:I

    .line 1162
    .line 1163
    int-to-long v3, v1

    .line 1164
    const/16 v19, 0x0

    .line 1165
    .line 1166
    const/16 v20, 0x0

    .line 1167
    .line 1168
    const-wide/16 v14, 0x28

    .line 1169
    .line 1170
    move-wide/from16 v16, v3

    .line 1171
    .line 1172
    invoke-virtual/range {v13 .. v20}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 1173
    .line 1174
    .line 1175
    int-to-long v7, v1

    .line 1176
    iget-wide v9, v0, La/wnk;->b:J

    .line 1177
    .line 1178
    iget-object v6, v0, La/wnk;->c:Ljava/lang/String;

    .line 1179
    .line 1180
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1181
    .line 1182
    iget-byte v11, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1183
    .line 1184
    sget-object v0, La/k1g;->b:La/k1g;

    .line 1185
    .line 1186
    move-object v5, v2

    .line 1187
    check-cast v5, La/uzg;

    .line 1188
    .line 1189
    invoke-virtual/range {v5 .. v11}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 1190
    .line 1191
    .line 1192
    goto/16 :goto_f

    .line 1193
    .line 1194
    :cond_27
    instance-of v1, v13, La/j7o;

    .line 1195
    .line 1196
    if-eqz v1, :cond_2a

    .line 1197
    .line 1198
    check-cast v13, La/j7o;

    .line 1199
    .line 1200
    iget-object v1, v13, La/j7o;->a:La/owr0;

    .line 1201
    .line 1202
    sget v3, La/k9o;->G:I

    .line 1203
    .line 1204
    iget-object v5, v12, La/k9o;->w:La/zr1;

    .line 1205
    .line 1206
    iget v6, v1, La/owr0;->a:I

    .line 1207
    .line 1208
    sget-object v3, La/r1g;->m:La/r1g;

    .line 1209
    .line 1210
    const/4 v10, 0x0

    .line 1211
    const/4 v11, 0x0

    .line 1212
    const/4 v7, 0x0

    .line 1213
    const-string v8, ""

    .line 1214
    .line 1215
    const-string v9, "cyber_general_champ"

    .line 1216
    .line 1217
    invoke-virtual/range {v5 .. v11}, La/zr1;->b(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/Float;)V

    .line 1218
    .line 1219
    .line 1220
    iget v5, v1, La/owr0;->a:I

    .line 1221
    .line 1222
    iget-object v6, v1, La/owr0;->j:Ljava/lang/String;

    .line 1223
    .line 1224
    iget-object v7, v1, La/owr0;->i:Ljava/lang/String;

    .line 1225
    .line 1226
    iget-boolean v1, v1, La/owr0;->e:Z

    .line 1227
    .line 1228
    invoke-virtual {v0, v5, v3}, La/ih5;->j(ILa/r1g;)V

    .line 1229
    .line 1230
    .line 1231
    if-eqz v1, :cond_28

    .line 1232
    .line 1233
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    if-lez v0, :cond_28

    .line 1238
    .line 1239
    check-cast v2, La/uzg;

    .line 1240
    .line 1241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    iget-object v0, v2, La/uzg;->i:La/grj;

    .line 1245
    .line 1246
    invoke-virtual {v0, v7}, La/grj;->a(Ljava/lang/String;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_d

    .line 1250
    :cond_28
    if-eqz v1, :cond_29

    .line 1251
    .line 1252
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1253
    .line 1254
    .line 1255
    move-result v0

    .line 1256
    if-lez v0, :cond_29

    .line 1257
    .line 1258
    check-cast v2, La/uzg;

    .line 1259
    .line 1260
    invoke-virtual {v2, v6}, La/uzg;->m(Ljava/lang/String;)V

    .line 1261
    .line 1262
    .line 1263
    :cond_29
    :goto_d
    invoke-static {v12}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v15

    .line 1267
    new-instance v0, La/fr9;

    .line 1268
    .line 1269
    invoke-direct {v0, v12, v13, v14, v4}, La/fr9;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1270
    .line 1271
    .line 1272
    const/16 v20, 0xf

    .line 1273
    .line 1274
    const/16 v16, 0x0

    .line 1275
    .line 1276
    const/16 v17, 0x0

    .line 1277
    .line 1278
    const/16 v18, 0x0

    .line 1279
    .line 1280
    move-object/from16 v19, v0

    .line 1281
    .line 1282
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1283
    .line 1284
    .line 1285
    goto :goto_f

    .line 1286
    :cond_2a
    instance-of v0, v13, La/q7o;

    .line 1287
    .line 1288
    if-eqz v0, :cond_2f

    .line 1289
    .line 1290
    check-cast v13, La/q7o;

    .line 1291
    .line 1292
    iget-wide v0, v13, La/q7o;->a:J

    .line 1293
    .line 1294
    sget v2, La/k9o;->G:I

    .line 1295
    .line 1296
    sget-object v2, La/b9o;->a:Ljava/util/List;

    .line 1297
    .line 1298
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v2

    .line 1302
    :cond_2b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1303
    .line 1304
    .line 1305
    move-result v3

    .line 1306
    if-eqz v3, :cond_2c

    .line 1307
    .line 1308
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v3

    .line 1312
    move-object v4, v3

    .line 1313
    check-cast v4, La/aco0;

    .line 1314
    .line 1315
    iget-byte v4, v4, La/aco0;->a:B

    .line 1316
    .line 1317
    int-to-long v4, v4

    .line 1318
    cmp-long v4, v4, v0

    .line 1319
    .line 1320
    if-nez v4, :cond_2b

    .line 1321
    .line 1322
    goto :goto_e

    .line 1323
    :cond_2c
    move-object v3, v14

    .line 1324
    :goto_e
    if-eqz v3, :cond_2e

    .line 1325
    .line 1326
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    check-cast v2, La/z8o;

    .line 1331
    .line 1332
    iget-object v2, v2, La/z8o;->f:La/d8o;

    .line 1333
    .line 1334
    invoke-static {v2, v0, v1, v14, v9}, La/d8o;->a(La/d8o;JLjava/util/Map;I)La/d8o;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v7

    .line 1338
    iget-object v0, v12, La/i3t0;->i:La/ocj;

    .line 1339
    .line 1340
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 1341
    .line 1342
    :cond_2d
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v1

    .line 1346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    iget-object v2, v12, La/i3t0;->f:La/oyg0;

    .line 1350
    .line 1351
    move-object v3, v1

    .line 1352
    check-cast v3, La/z8o;

    .line 1353
    .line 1354
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1355
    .line 1356
    .line 1357
    const/4 v6, 0x0

    .line 1358
    const/16 v8, 0xdf

    .line 1359
    .line 1360
    const/4 v4, 0x0

    .line 1361
    const/4 v5, 0x0

    .line 1362
    invoke-static/range {v3 .. v8}, La/z8o;->a(La/z8o;ZLa/w7o;Ljava/util/List;La/d8o;I)La/z8o;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1367
    .line 1368
    .line 1369
    move-result v1

    .line 1370
    if-eqz v1, :cond_2d

    .line 1371
    .line 1372
    :cond_2e
    :goto_f
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1373
    .line 1374
    goto :goto_10

    .line 1375
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 1376
    .line 1377
    .line 1378
    :goto_10
    return-object v14

    .line 1379
    :pswitch_11
    move-object v1, v12

    .line 1380
    check-cast v1, La/igg;

    .line 1381
    .line 1382
    iget-object v0, v1, La/igg;->D:La/zr1;

    .line 1383
    .line 1384
    iget-object v2, v1, La/igg;->C:La/ih5;

    .line 1385
    .line 1386
    sget-object v4, La/wne;->a:La/wne;

    .line 1387
    .line 1388
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1389
    .line 1390
    .line 1391
    check-cast v13, La/rfg;

    .line 1392
    .line 1393
    sget-object v4, La/pfg;->a:La/pfg;

    .line 1394
    .line 1395
    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1396
    .line 1397
    .line 1398
    move-result v4

    .line 1399
    if-eqz v4, :cond_30

    .line 1400
    .line 1401
    sget v0, La/igg;->I:I

    .line 1402
    .line 1403
    invoke-virtual {v1}, La/igg;->M()V

    .line 1404
    .line 1405
    .line 1406
    goto/16 :goto_14

    .line 1407
    .line 1408
    :cond_30
    instance-of v4, v13, La/ofg;

    .line 1409
    .line 1410
    if-eqz v4, :cond_34

    .line 1411
    .line 1412
    check-cast v13, La/ofg;

    .line 1413
    .line 1414
    iget v4, v13, La/ofg;->a:I

    .line 1415
    .line 1416
    sget v3, La/igg;->I:I

    .line 1417
    .line 1418
    iget-object v3, v1, La/i3t0;->i:La/ocj;

    .line 1419
    .line 1420
    iget-object v5, v3, La/ocj;->a:La/p7m0;

    .line 1421
    .line 1422
    :cond_31
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v3

    .line 1426
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    iget-object v6, v1, La/i3t0;->f:La/oyg0;

    .line 1430
    .line 1431
    move-object v15, v3

    .line 1432
    check-cast v15, La/egg;

    .line 1433
    .line 1434
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1435
    .line 1436
    .line 1437
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v17

    .line 1441
    const/16 v20, 0x0

    .line 1442
    .line 1443
    const/16 v21, 0xfd

    .line 1444
    .line 1445
    const/16 v16, 0x0

    .line 1446
    .line 1447
    const/16 v18, 0x0

    .line 1448
    .line 1449
    const/16 v19, 0x0

    .line 1450
    .line 1451
    invoke-static/range {v15 .. v21}, La/egg;->a(La/egg;ZLjava/lang/Integer;La/vdg;Ljava/util/List;ZI)La/egg;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v6

    .line 1455
    invoke-virtual {v5, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1456
    .line 1457
    .line 1458
    move-result v3

    .line 1459
    if-eqz v3, :cond_31

    .line 1460
    .line 1461
    iget-object v3, v1, La/igg;->G:La/bby;

    .line 1462
    .line 1463
    if-eqz v3, :cond_32

    .line 1464
    .line 1465
    invoke-static {v3}, La/e3c;->n(La/bby;)V

    .line 1466
    .line 1467
    .line 1468
    :cond_32
    new-instance v3, La/hfg;

    .line 1469
    .line 1470
    invoke-direct {v3, v1, v8}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 1471
    .line 1472
    .line 1473
    new-instance v5, La/hgg;

    .line 1474
    .line 1475
    invoke-direct {v5, v1, v4, v14}, La/hgg;-><init>(La/igg;ILa/yje;)V

    .line 1476
    .line 1477
    .line 1478
    invoke-static {v1, v14, v3, v5, v11}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 1479
    .line 1480
    .line 1481
    move-result-object v3

    .line 1482
    iput-object v3, v1, La/igg;->G:La/bby;

    .line 1483
    .line 1484
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v1

    .line 1488
    check-cast v1, La/egg;

    .line 1489
    .line 1490
    iget-object v1, v1, La/egg;->e:Ljava/util/List;

    .line 1491
    .line 1492
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v1

    .line 1496
    check-cast v1, Ljava/util/Date;

    .line 1497
    .line 1498
    if-nez v1, :cond_33

    .line 1499
    .line 1500
    new-instance v1, Ljava/util/Date;

    .line 1501
    .line 1502
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 1503
    .line 1504
    .line 1505
    :cond_33
    sget-object v3, La/rdj;->a:La/rdj;

    .line 1506
    .line 1507
    sget-object v4, La/sdj;->b:La/sdj;

    .line 1508
    .line 1509
    const/16 v5, 0x3c

    .line 1510
    .line 1511
    invoke-static {v3, v4, v1, v14, v5}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v1

    .line 1515
    invoke-virtual {v2, v1}, La/ih5;->n(Ljava/lang/String;)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v0, v1}, La/zr1;->o(Ljava/lang/String;)V

    .line 1519
    .line 1520
    .line 1521
    goto/16 :goto_14

    .line 1522
    .line 1523
    :cond_34
    instance-of v4, v13, La/qfg;

    .line 1524
    .line 1525
    if-eqz v4, :cond_3d

    .line 1526
    .line 1527
    move-object v4, v13

    .line 1528
    check-cast v4, La/qfg;

    .line 1529
    .line 1530
    iget-wide v5, v4, La/qfg;->a:J

    .line 1531
    .line 1532
    sget v7, La/igg;->I:I

    .line 1533
    .line 1534
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v7

    .line 1538
    check-cast v7, La/egg;

    .line 1539
    .line 1540
    iget-object v7, v7, La/egg;->d:La/vdg;

    .line 1541
    .line 1542
    if-eqz v7, :cond_37

    .line 1543
    .line 1544
    iget-object v7, v7, La/vdg;->b:Ljava/util/ArrayList;

    .line 1545
    .line 1546
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v7

    .line 1550
    :cond_35
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1551
    .line 1552
    .line 1553
    move-result v8

    .line 1554
    if-eqz v8, :cond_36

    .line 1555
    .line 1556
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v8

    .line 1560
    move-object v9, v8

    .line 1561
    check-cast v9, La/icg;

    .line 1562
    .line 1563
    iget-wide v11, v9, La/icg;->a:J

    .line 1564
    .line 1565
    cmp-long v9, v11, v5

    .line 1566
    .line 1567
    if-nez v9, :cond_35

    .line 1568
    .line 1569
    goto :goto_11

    .line 1570
    :cond_36
    move-object v8, v14

    .line 1571
    :goto_11
    check-cast v8, La/icg;

    .line 1572
    .line 1573
    if-eqz v8, :cond_37

    .line 1574
    .line 1575
    iget-object v7, v8, La/icg;->n:Ljava/lang/String;

    .line 1576
    .line 1577
    goto :goto_12

    .line 1578
    :cond_37
    move-object v7, v14

    .line 1579
    :goto_12
    if-nez v7, :cond_38

    .line 1580
    .line 1581
    goto :goto_13

    .line 1582
    :cond_38
    move-object v3, v7

    .line 1583
    :goto_13
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1584
    .line 1585
    .line 1586
    move-result v7

    .line 1587
    if-nez v7, :cond_39

    .line 1588
    .line 1589
    new-instance v0, La/dgg;

    .line 1590
    .line 1591
    iget-object v2, v1, La/igg;->u:La/ctf0;

    .line 1592
    .line 1593
    new-array v3, v10, [Ljava/lang/Object;

    .line 1594
    .line 1595
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 1596
    .line 1597
    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v3

    .line 1601
    const v4, 0x7f1313ec    # 1.9549996E38f

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1605
    .line 1606
    .line 1607
    move-result-object v2

    .line 1608
    invoke-direct {v0, v2}, La/dgg;-><init>(Ljava/lang/String;)V

    .line 1609
    .line 1610
    .line 1611
    invoke-virtual {v1, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1612
    .line 1613
    .line 1614
    goto :goto_14

    .line 1615
    :cond_39
    move-object v7, v3

    .line 1616
    new-instance v3, La/kie0;

    .line 1617
    .line 1618
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v8

    .line 1625
    check-cast v8, La/egg;

    .line 1626
    .line 1627
    iget-object v8, v8, La/egg;->d:La/vdg;

    .line 1628
    .line 1629
    if-eqz v8, :cond_3c

    .line 1630
    .line 1631
    iget-object v8, v8, La/vdg;->b:Ljava/util/ArrayList;

    .line 1632
    .line 1633
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v8

    .line 1637
    :cond_3a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1638
    .line 1639
    .line 1640
    move-result v9

    .line 1641
    if-eqz v9, :cond_3b

    .line 1642
    .line 1643
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v9

    .line 1647
    move-object v10, v9

    .line 1648
    check-cast v10, La/icg;

    .line 1649
    .line 1650
    iget-wide v10, v10, La/icg;->a:J

    .line 1651
    .line 1652
    cmp-long v10, v10, v5

    .line 1653
    .line 1654
    if-nez v10, :cond_3a

    .line 1655
    .line 1656
    move-object v14, v9

    .line 1657
    :cond_3b
    check-cast v14, La/icg;

    .line 1658
    .line 1659
    if-eqz v14, :cond_3c

    .line 1660
    .line 1661
    iget v5, v14, La/icg;->p:I

    .line 1662
    .line 1663
    iput v5, v3, La/kie0;->a:I

    .line 1664
    .line 1665
    iget-object v5, v1, La/igg;->t:La/pv00;

    .line 1666
    .line 1667
    iget-object v6, v1, La/igg;->o:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 1668
    .line 1669
    iget-object v6, v6, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->b:Ljava/lang/String;

    .line 1670
    .line 1671
    invoke-static {v14, v6}, La/vfc;->Q(La/icg;Ljava/lang/String;)La/vcm0;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v6

    .line 1675
    invoke-virtual {v5, v6}, La/pv00;->n(La/vcm0;)V

    .line 1676
    .line 1677
    .line 1678
    :cond_3c
    iget-object v2, v2, La/ih5;->a:La/kt2;

    .line 1679
    .line 1680
    sget-object v5, La/r1g;->b:La/r1g;

    .line 1681
    .line 1682
    const-string v5, "cyber_result_match_stat"

    .line 1683
    .line 1684
    invoke-interface {v2, v5}, La/kt2;->c(Ljava/lang/String;)V

    .line 1685
    .line 1686
    .line 1687
    iget-object v0, v0, La/zr1;->a:La/s1p;

    .line 1688
    .line 1689
    const-wide/16 v5, 0x2ef0

    .line 1690
    .line 1691
    sget-object v2, La/xun;->a:La/xun;

    .line 1692
    .line 1693
    invoke-virtual {v0, v2, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1694
    .line 1695
    .line 1696
    iget-object v0, v1, La/igg;->z:La/oeg0;

    .line 1697
    .line 1698
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v6

    .line 1702
    new-instance v0, La/dc0;

    .line 1703
    .line 1704
    const/16 v5, 0x16

    .line 1705
    .line 1706
    move-object v2, v7

    .line 1707
    invoke-direct/range {v0 .. v5}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual {v6, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1711
    .line 1712
    .line 1713
    :goto_14
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1714
    .line 1715
    goto :goto_15

    .line 1716
    :cond_3d
    invoke-static {}, La/t9f;->b()V

    .line 1717
    .line 1718
    .line 1719
    :goto_15
    return-object v14

    .line 1720
    :pswitch_12
    check-cast v12, La/plb;

    .line 1721
    .line 1722
    iget-object v0, v12, La/plb;->u:La/hjd;

    .line 1723
    .line 1724
    iget-object v1, v12, La/plb;->o:La/i1w0;

    .line 1725
    .line 1726
    sget-object v2, La/wne;->a:La/wne;

    .line 1727
    .line 1728
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1729
    .line 1730
    .line 1731
    check-cast v13, La/njb;

    .line 1732
    .line 1733
    sget-object v2, La/ljb;->a:La/ljb;

    .line 1734
    .line 1735
    invoke-virtual {v13, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1736
    .line 1737
    .line 1738
    move-result v2

    .line 1739
    if-eqz v2, :cond_3e

    .line 1740
    .line 1741
    sget v0, La/plb;->I:I

    .line 1742
    .line 1743
    invoke-virtual {v12, v11}, La/plb;->M(Z)V

    .line 1744
    .line 1745
    .line 1746
    goto/16 :goto_28

    .line 1747
    .line 1748
    :cond_3e
    sget-object v2, La/fjb;->a:La/fjb;

    .line 1749
    .line 1750
    invoke-virtual {v13, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1751
    .line 1752
    .line 1753
    move-result v2

    .line 1754
    if-eqz v2, :cond_3f

    .line 1755
    .line 1756
    sget v0, La/plb;->I:I

    .line 1757
    .line 1758
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v0

    .line 1762
    new-instance v2, La/c8d;

    .line 1763
    .line 1764
    sget-object v3, La/y7d;->a:La/v7d;

    .line 1765
    .line 1766
    invoke-direct {v2, v3, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1767
    .line 1768
    .line 1769
    invoke-static {v0, v2, v1, v0, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v0

    .line 1773
    :goto_16
    move-object v2, v0

    .line 1774
    check-cast v2, La/paw;

    .line 1775
    .line 1776
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1777
    .line 1778
    .line 1779
    move-result v3

    .line 1780
    if-eqz v3, :cond_69

    .line 1781
    .line 1782
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v2

    .line 1786
    check-cast v2, La/oe50;

    .line 1787
    .line 1788
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 1789
    .line 1790
    .line 1791
    goto :goto_16

    .line 1792
    :cond_3f
    instance-of v2, v13, La/jjb;

    .line 1793
    .line 1794
    if-eqz v2, :cond_5a

    .line 1795
    .line 1796
    check-cast v13, La/jjb;

    .line 1797
    .line 1798
    sget v0, La/plb;->I:I

    .line 1799
    .line 1800
    iget-object v15, v12, La/plb;->x:La/vjp;

    .line 1801
    .line 1802
    iget-object v0, v13, La/jjb;->a:Ljava/lang/String;

    .line 1803
    .line 1804
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 1805
    .line 1806
    .line 1807
    move-result v2

    .line 1808
    sparse-switch v2, :sswitch_data_0

    .line 1809
    .line 1810
    .line 1811
    goto/16 :goto_20

    .line 1812
    .line 1813
    :sswitch_0
    const-string v2, "RESULTS"

    .line 1814
    .line 1815
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1816
    .line 1817
    .line 1818
    move-result v0

    .line 1819
    if-nez v0, :cond_40

    .line 1820
    .line 1821
    goto/16 :goto_20

    .line 1822
    .line 1823
    :cond_40
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 1824
    .line 1825
    .line 1826
    move-result-object v0

    .line 1827
    check-cast v0, La/alb;

    .line 1828
    .line 1829
    iget-object v0, v0, La/alb;->k:La/jkb;

    .line 1830
    .line 1831
    invoke-static {v0}, La/kkb;->G(La/jkb;)Ljava/util/ArrayList;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v0

    .line 1835
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v0

    .line 1839
    check-cast v0, La/d0t;

    .line 1840
    .line 1841
    if-eqz v0, :cond_43

    .line 1842
    .line 1843
    iget-object v0, v0, La/d0t;->o:Ljava/lang/String;

    .line 1844
    .line 1845
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1846
    .line 1847
    .line 1848
    move-result v2

    .line 1849
    if-nez v2, :cond_41

    .line 1850
    .line 1851
    move-object v0, v14

    .line 1852
    :cond_41
    if-nez v0, :cond_42

    .line 1853
    .line 1854
    goto :goto_17

    .line 1855
    :cond_42
    move-object v3, v0

    .line 1856
    goto :goto_19

    .line 1857
    :cond_43
    :goto_17
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v0

    .line 1861
    check-cast v0, La/alb;

    .line 1862
    .line 1863
    iget-object v0, v0, La/alb;->l:La/j0g0;

    .line 1864
    .line 1865
    if-eqz v0, :cond_46

    .line 1866
    .line 1867
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1868
    .line 1869
    instance-of v2, v0, La/g0g0;

    .line 1870
    .line 1871
    if-eqz v2, :cond_44

    .line 1872
    .line 1873
    move-object v0, v14

    .line 1874
    :cond_44
    check-cast v0, Ljava/util/List;

    .line 1875
    .line 1876
    if-eqz v0, :cond_46

    .line 1877
    .line 1878
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v0

    .line 1882
    check-cast v0, La/d2w;

    .line 1883
    .line 1884
    if-eqz v0, :cond_46

    .line 1885
    .line 1886
    invoke-virtual {v0}, La/d2w;->h()Ljava/lang/String;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v0

    .line 1890
    if-eqz v0, :cond_46

    .line 1891
    .line 1892
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1893
    .line 1894
    .line 1895
    move-result v2

    .line 1896
    if-nez v2, :cond_45

    .line 1897
    .line 1898
    goto :goto_18

    .line 1899
    :cond_45
    move-object v14, v0

    .line 1900
    :cond_46
    :goto_18
    if-nez v14, :cond_47

    .line 1901
    .line 1902
    goto :goto_19

    .line 1903
    :cond_47
    move-object v3, v14

    .line 1904
    :goto_19
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v0

    .line 1908
    check-cast v0, La/alb;

    .line 1909
    .line 1910
    iget-object v0, v0, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 1911
    .line 1912
    iget-wide v4, v0, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->a:J

    .line 1913
    .line 1914
    iget-object v0, v12, La/plb;->A:La/gle0;

    .line 1915
    .line 1916
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v2

    .line 1920
    invoke-static {v2}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1921
    .line 1922
    .line 1923
    move-result-object v2

    .line 1924
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1925
    .line 1926
    .line 1927
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1928
    .line 1929
    .line 1930
    new-instance v14, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1;

    .line 1931
    .line 1932
    const/4 v0, -0x1

    .line 1933
    invoke-direct {v14, v0, v3, v2, v10}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getGamesScreen$1;-><init>(ILjava/lang/String;Ljava/util/List;Z)V

    .line 1934
    .line 1935
    .line 1936
    goto/16 :goto_20

    .line 1937
    .line 1938
    :sswitch_1
    const-string v2, "LINE_GAMES"

    .line 1939
    .line 1940
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1941
    .line 1942
    .line 1943
    move-result v0

    .line 1944
    if-nez v0, :cond_48

    .line 1945
    .line 1946
    goto/16 :goto_20

    .line 1947
    .line 1948
    :cond_48
    sget-object v16, La/j700;->a:La/j700;

    .line 1949
    .line 1950
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 1951
    .line 1952
    .line 1953
    move-result-object v0

    .line 1954
    check-cast v0, La/alb;

    .line 1955
    .line 1956
    iget-object v0, v0, La/alb;->k:La/jkb;

    .line 1957
    .line 1958
    invoke-static {v0}, La/kkb;->G(La/jkb;)Ljava/util/ArrayList;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v0

    .line 1966
    check-cast v0, La/d0t;

    .line 1967
    .line 1968
    if-eqz v0, :cond_4b

    .line 1969
    .line 1970
    iget-object v0, v0, La/d0t;->o:Ljava/lang/String;

    .line 1971
    .line 1972
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1973
    .line 1974
    .line 1975
    move-result v2

    .line 1976
    if-nez v2, :cond_49

    .line 1977
    .line 1978
    move-object v0, v14

    .line 1979
    :cond_49
    if-nez v0, :cond_4a

    .line 1980
    .line 1981
    goto :goto_1a

    .line 1982
    :cond_4a
    move-object v3, v0

    .line 1983
    goto :goto_1c

    .line 1984
    :cond_4b
    :goto_1a
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v0

    .line 1988
    check-cast v0, La/alb;

    .line 1989
    .line 1990
    iget-object v0, v0, La/alb;->l:La/j0g0;

    .line 1991
    .line 1992
    if-eqz v0, :cond_4e

    .line 1993
    .line 1994
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 1995
    .line 1996
    instance-of v2, v0, La/g0g0;

    .line 1997
    .line 1998
    if-eqz v2, :cond_4c

    .line 1999
    .line 2000
    move-object v0, v14

    .line 2001
    :cond_4c
    check-cast v0, Ljava/util/List;

    .line 2002
    .line 2003
    if-eqz v0, :cond_4e

    .line 2004
    .line 2005
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v0

    .line 2009
    check-cast v0, La/d2w;

    .line 2010
    .line 2011
    if-eqz v0, :cond_4e

    .line 2012
    .line 2013
    invoke-virtual {v0}, La/d2w;->h()Ljava/lang/String;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v0

    .line 2017
    if-eqz v0, :cond_4e

    .line 2018
    .line 2019
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2020
    .line 2021
    .line 2022
    move-result v2

    .line 2023
    if-nez v2, :cond_4d

    .line 2024
    .line 2025
    goto :goto_1b

    .line 2026
    :cond_4d
    move-object v14, v0

    .line 2027
    :cond_4e
    :goto_1b
    if-nez v14, :cond_4f

    .line 2028
    .line 2029
    goto :goto_1c

    .line 2030
    :cond_4f
    move-object v3, v14

    .line 2031
    :goto_1c
    new-instance v0, La/m8h0;

    .line 2032
    .line 2033
    sget-object v2, La/xun;->a:La/xun;

    .line 2034
    .line 2035
    invoke-direct {v0, v3, v2, v10}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v2

    .line 2042
    check-cast v2, La/alb;

    .line 2043
    .line 2044
    iget-object v2, v2, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 2045
    .line 2046
    iget-wide v2, v2, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->a:J

    .line 2047
    .line 2048
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v2

    .line 2052
    invoke-static {v2}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v18

    .line 2056
    const-string v21, ""

    .line 2057
    .line 2058
    const-wide/16 v19, -0x1

    .line 2059
    .line 2060
    move-object/from16 v17, v0

    .line 2061
    .line 2062
    invoke-virtual/range {v15 .. v21}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v14

    .line 2066
    goto/16 :goto_20

    .line 2067
    .line 2068
    :sswitch_2
    const-string v2, "LEADERBOARD"

    .line 2069
    .line 2070
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2071
    .line 2072
    .line 2073
    move-result v0

    .line 2074
    if-nez v0, :cond_50

    .line 2075
    .line 2076
    goto/16 :goto_20

    .line 2077
    .line 2078
    :cond_50
    iget-object v0, v12, La/plb;->z:La/uxs0;

    .line 2079
    .line 2080
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2081
    .line 2082
    .line 2083
    new-instance v14, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcRatingScreen$1;

    .line 2084
    .line 2085
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 2086
    .line 2087
    .line 2088
    goto/16 :goto_20

    .line 2089
    .line 2090
    :sswitch_3
    const-string v2, "LIVE_GAMES"

    .line 2091
    .line 2092
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2093
    .line 2094
    .line 2095
    move-result v0

    .line 2096
    if-nez v0, :cond_51

    .line 2097
    .line 2098
    goto/16 :goto_20

    .line 2099
    .line 2100
    :cond_51
    sget-object v16, La/j700;->b:La/j700;

    .line 2101
    .line 2102
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2103
    .line 2104
    .line 2105
    move-result-object v0

    .line 2106
    check-cast v0, La/alb;

    .line 2107
    .line 2108
    iget-object v0, v0, La/alb;->k:La/jkb;

    .line 2109
    .line 2110
    invoke-static {v0}, La/kkb;->G(La/jkb;)Ljava/util/ArrayList;

    .line 2111
    .line 2112
    .line 2113
    move-result-object v0

    .line 2114
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v0

    .line 2118
    check-cast v0, La/d0t;

    .line 2119
    .line 2120
    if-eqz v0, :cond_54

    .line 2121
    .line 2122
    iget-object v0, v0, La/d0t;->o:Ljava/lang/String;

    .line 2123
    .line 2124
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2125
    .line 2126
    .line 2127
    move-result v2

    .line 2128
    if-nez v2, :cond_52

    .line 2129
    .line 2130
    move-object v0, v14

    .line 2131
    :cond_52
    if-nez v0, :cond_53

    .line 2132
    .line 2133
    goto :goto_1d

    .line 2134
    :cond_53
    move-object v3, v0

    .line 2135
    goto :goto_1f

    .line 2136
    :cond_54
    :goto_1d
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v0

    .line 2140
    check-cast v0, La/alb;

    .line 2141
    .line 2142
    iget-object v0, v0, La/alb;->l:La/j0g0;

    .line 2143
    .line 2144
    if-eqz v0, :cond_57

    .line 2145
    .line 2146
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 2147
    .line 2148
    instance-of v2, v0, La/g0g0;

    .line 2149
    .line 2150
    if-eqz v2, :cond_55

    .line 2151
    .line 2152
    move-object v0, v14

    .line 2153
    :cond_55
    check-cast v0, Ljava/util/List;

    .line 2154
    .line 2155
    if-eqz v0, :cond_57

    .line 2156
    .line 2157
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v0

    .line 2161
    check-cast v0, La/d2w;

    .line 2162
    .line 2163
    if-eqz v0, :cond_57

    .line 2164
    .line 2165
    invoke-virtual {v0}, La/d2w;->h()Ljava/lang/String;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v0

    .line 2169
    if-eqz v0, :cond_57

    .line 2170
    .line 2171
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2172
    .line 2173
    .line 2174
    move-result v2

    .line 2175
    if-nez v2, :cond_56

    .line 2176
    .line 2177
    goto :goto_1e

    .line 2178
    :cond_56
    move-object v14, v0

    .line 2179
    :cond_57
    :goto_1e
    if-nez v14, :cond_58

    .line 2180
    .line 2181
    goto :goto_1f

    .line 2182
    :cond_58
    move-object v3, v14

    .line 2183
    :goto_1f
    new-instance v0, La/m8h0;

    .line 2184
    .line 2185
    sget-object v2, La/xun;->a:La/xun;

    .line 2186
    .line 2187
    invoke-direct {v0, v3, v2, v10}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 2188
    .line 2189
    .line 2190
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v2

    .line 2194
    check-cast v2, La/alb;

    .line 2195
    .line 2196
    iget-object v2, v2, La/alb;->a:Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;

    .line 2197
    .line 2198
    iget-wide v2, v2, Lorg/xplatform/ufc/api/championship/UfcChampionshipParams;->a:J

    .line 2199
    .line 2200
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v2

    .line 2204
    invoke-static {v2}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 2205
    .line 2206
    .line 2207
    move-result-object v18

    .line 2208
    const-string v21, ""

    .line 2209
    .line 2210
    const-wide/16 v19, -0x1

    .line 2211
    .line 2212
    move-object/from16 v17, v0

    .line 2213
    .line 2214
    invoke-virtual/range {v15 .. v21}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 2215
    .line 2216
    .line 2217
    move-result-object v14

    .line 2218
    :goto_20
    if-eqz v14, :cond_69

    .line 2219
    .line 2220
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v0

    .line 2224
    instance-of v2, v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2225
    .line 2226
    if-eqz v2, :cond_59

    .line 2227
    .line 2228
    new-instance v2, La/e1w0;

    .line 2229
    .line 2230
    check-cast v14, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2231
    .line 2232
    invoke-direct {v2, v14}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 2233
    .line 2234
    .line 2235
    new-instance v3, La/c8d;

    .line 2236
    .line 2237
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2238
    .line 2239
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2240
    .line 2241
    .line 2242
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2243
    .line 2244
    .line 2245
    goto :goto_21

    .line 2246
    :cond_59
    new-instance v2, La/w0w0;

    .line 2247
    .line 2248
    invoke-direct {v2, v14}, La/w0w0;-><init>(La/m7h0;)V

    .line 2249
    .line 2250
    .line 2251
    new-instance v3, La/c8d;

    .line 2252
    .line 2253
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2254
    .line 2255
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2256
    .line 2257
    .line 2258
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2259
    .line 2260
    .line 2261
    :goto_21
    invoke-static {v1, v0, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v0

    .line 2265
    :goto_22
    move-object v2, v0

    .line 2266
    check-cast v2, La/paw;

    .line 2267
    .line 2268
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2269
    .line 2270
    .line 2271
    move-result v3

    .line 2272
    if-eqz v3, :cond_69

    .line 2273
    .line 2274
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v2

    .line 2278
    check-cast v2, La/oe50;

    .line 2279
    .line 2280
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 2281
    .line 2282
    .line 2283
    goto :goto_22

    .line 2284
    :cond_5a
    instance-of v2, v13, La/kjb;

    .line 2285
    .line 2286
    if-eqz v2, :cond_5b

    .line 2287
    .line 2288
    check-cast v13, La/kjb;

    .line 2289
    .line 2290
    sget v0, La/plb;->I:I

    .line 2291
    .line 2292
    new-instance v0, La/op7;

    .line 2293
    .line 2294
    const/16 v2, 0x18

    .line 2295
    .line 2296
    invoke-direct {v0, v12, v13, v2}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2297
    .line 2298
    .line 2299
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 2300
    .line 2301
    .line 2302
    goto/16 :goto_28

    .line 2303
    .line 2304
    :cond_5b
    instance-of v2, v13, La/ijb;

    .line 2305
    .line 2306
    if-eqz v2, :cond_6c

    .line 2307
    .line 2308
    check-cast v13, La/ijb;

    .line 2309
    .line 2310
    sget v2, La/plb;->I:I

    .line 2311
    .line 2312
    instance-of v2, v13, La/gjb;

    .line 2313
    .line 2314
    if-eqz v2, :cond_5c

    .line 2315
    .line 2316
    new-instance v1, La/did;

    .line 2317
    .line 2318
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v2

    .line 2322
    check-cast v2, La/alb;

    .line 2323
    .line 2324
    iget-object v2, v2, La/alb;->k:La/jkb;

    .line 2325
    .line 2326
    invoke-static {v2}, La/kkb;->G(La/jkb;)Ljava/util/ArrayList;

    .line 2327
    .line 2328
    .line 2329
    move-result-object v2

    .line 2330
    invoke-direct {v1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 2331
    .line 2332
    .line 2333
    check-cast v13, La/gjb;

    .line 2334
    .line 2335
    iget-object v2, v13, La/gjb;->a:La/uid;

    .line 2336
    .line 2337
    new-array v3, v9, [La/vid;

    .line 2338
    .line 2339
    aput-object v1, v3, v10

    .line 2340
    .line 2341
    aput-object v2, v3, v11

    .line 2342
    .line 2343
    invoke-static {v12, v0, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 2344
    .line 2345
    .line 2346
    goto/16 :goto_28

    .line 2347
    .line 2348
    :cond_5c
    instance-of v2, v13, La/hjb;

    .line 2349
    .line 2350
    if-eqz v2, :cond_5d

    .line 2351
    .line 2352
    new-instance v1, La/did;

    .line 2353
    .line 2354
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v2

    .line 2358
    check-cast v2, La/alb;

    .line 2359
    .line 2360
    iget-object v2, v2, La/alb;->k:La/jkb;

    .line 2361
    .line 2362
    invoke-static {v2}, La/kkb;->G(La/jkb;)Ljava/util/ArrayList;

    .line 2363
    .line 2364
    .line 2365
    move-result-object v2

    .line 2366
    invoke-direct {v1, v2}, La/did;-><init>(Ljava/util/List;)V

    .line 2367
    .line 2368
    .line 2369
    check-cast v13, La/hjb;

    .line 2370
    .line 2371
    iget-object v2, v13, La/hjb;->a:La/bem;

    .line 2372
    .line 2373
    invoke-static {v2}, La/ebc;->n0(La/bem;)La/uid;

    .line 2374
    .line 2375
    .line 2376
    move-result-object v2

    .line 2377
    new-array v3, v9, [La/vid;

    .line 2378
    .line 2379
    aput-object v1, v3, v10

    .line 2380
    .line 2381
    aput-object v2, v3, v11

    .line 2382
    .line 2383
    invoke-static {v12, v0, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 2384
    .line 2385
    .line 2386
    goto/16 :goto_28

    .line 2387
    .line 2388
    :cond_5d
    instance-of v0, v13, La/mjb;

    .line 2389
    .line 2390
    if-eqz v0, :cond_6b

    .line 2391
    .line 2392
    check-cast v13, La/mjb;

    .line 2393
    .line 2394
    iget-object v0, v13, La/mjb;->a:La/ill0;

    .line 2395
    .line 2396
    instance-of v2, v0, La/gll0;

    .line 2397
    .line 2398
    if-eqz v2, :cond_60

    .line 2399
    .line 2400
    check-cast v0, La/gll0;

    .line 2401
    .line 2402
    iget-wide v0, v0, La/gll0;->a:J

    .line 2403
    .line 2404
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2405
    .line 2406
    .line 2407
    move-result-object v2

    .line 2408
    check-cast v2, La/alb;

    .line 2409
    .line 2410
    iget-object v2, v2, La/alb;->n:Ljava/util/Set;

    .line 2411
    .line 2412
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v3

    .line 2416
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2417
    .line 2418
    .line 2419
    move-result v3

    .line 2420
    if-eqz v3, :cond_5e

    .line 2421
    .line 2422
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v0

    .line 2426
    invoke-static {v2, v0}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v0

    .line 2430
    :goto_23
    move-object v6, v0

    .line 2431
    goto :goto_24

    .line 2432
    :cond_5e
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v0

    .line 2436
    invoke-static {v2, v0}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v0

    .line 2440
    goto :goto_23

    .line 2441
    :goto_24
    iget-object v0, v12, La/i3t0;->i:La/ocj;

    .line 2442
    .line 2443
    iget-object v8, v0, La/ocj;->a:La/p7m0;

    .line 2444
    .line 2445
    :cond_5f
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v0

    .line 2449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2450
    .line 2451
    .line 2452
    iget-object v1, v12, La/i3t0;->f:La/oyg0;

    .line 2453
    .line 2454
    move-object v2, v1

    .line 2455
    move-object v1, v0

    .line 2456
    check-cast v1, La/alb;

    .line 2457
    .line 2458
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2459
    .line 2460
    .line 2461
    const/4 v5, 0x0

    .line 2462
    const/16 v7, 0x1fff

    .line 2463
    .line 2464
    const/4 v2, 0x0

    .line 2465
    const/4 v3, 0x0

    .line 2466
    const/4 v4, 0x0

    .line 2467
    invoke-static/range {v1 .. v7}, La/alb;->a(La/alb;ZLa/jkb;La/j0g0;La/j0g0;Ljava/util/LinkedHashSet;I)La/alb;

    .line 2468
    .line 2469
    .line 2470
    move-result-object v1

    .line 2471
    invoke-virtual {v8, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2472
    .line 2473
    .line 2474
    move-result v0

    .line 2475
    if-eqz v0, :cond_5f

    .line 2476
    .line 2477
    goto/16 :goto_28

    .line 2478
    .line 2479
    :cond_60
    instance-of v2, v0, La/hll0;

    .line 2480
    .line 2481
    if-eqz v2, :cond_6a

    .line 2482
    .line 2483
    check-cast v0, La/hll0;

    .line 2484
    .line 2485
    iget-wide v2, v0, La/hll0;->a:J

    .line 2486
    .line 2487
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v5

    .line 2491
    check-cast v5, La/alb;

    .line 2492
    .line 2493
    iget-object v5, v5, La/alb;->l:La/j0g0;

    .line 2494
    .line 2495
    if-eqz v5, :cond_64

    .line 2496
    .line 2497
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 2498
    .line 2499
    instance-of v6, v5, La/g0g0;

    .line 2500
    .line 2501
    if-eqz v6, :cond_61

    .line 2502
    .line 2503
    move-object v5, v14

    .line 2504
    :cond_61
    check-cast v5, Ljava/util/List;

    .line 2505
    .line 2506
    if-eqz v5, :cond_64

    .line 2507
    .line 2508
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2509
    .line 2510
    .line 2511
    move-result-object v5

    .line 2512
    :cond_62
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 2513
    .line 2514
    .line 2515
    move-result v6

    .line 2516
    if-eqz v6, :cond_63

    .line 2517
    .line 2518
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2519
    .line 2520
    .line 2521
    move-result-object v6

    .line 2522
    move-object v7, v6

    .line 2523
    check-cast v7, La/d2w;

    .line 2524
    .line 2525
    invoke-virtual {v7}, La/d2w;->b()J

    .line 2526
    .line 2527
    .line 2528
    move-result-wide v7

    .line 2529
    cmp-long v7, v7, v2

    .line 2530
    .line 2531
    if-nez v7, :cond_62

    .line 2532
    .line 2533
    goto :goto_25

    .line 2534
    :cond_63
    move-object v6, v14

    .line 2535
    :goto_25
    check-cast v6, La/d2w;

    .line 2536
    .line 2537
    goto :goto_26

    .line 2538
    :cond_64
    move-object v6, v14

    .line 2539
    :goto_26
    if-eqz v6, :cond_65

    .line 2540
    .line 2541
    invoke-virtual {v6}, La/d2w;->f()Ljava/lang/String;

    .line 2542
    .line 2543
    .line 2544
    move-result-object v2

    .line 2545
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 2546
    .line 2547
    .line 2548
    move-result v2

    .line 2549
    if-lez v2, :cond_65

    .line 2550
    .line 2551
    new-instance v0, La/op7;

    .line 2552
    .line 2553
    invoke-direct {v0, v12, v6, v4}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2554
    .line 2555
    .line 2556
    invoke-virtual {v1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 2557
    .line 2558
    .line 2559
    goto :goto_28

    .line 2560
    :cond_65
    iget-object v1, v12, La/plb;->v:La/rus;

    .line 2561
    .line 2562
    new-instance v2, La/fll0;

    .line 2563
    .line 2564
    invoke-virtual {v12}, La/i3t0;->D()Ljava/lang/Object;

    .line 2565
    .line 2566
    .line 2567
    move-result-object v3

    .line 2568
    check-cast v3, La/alb;

    .line 2569
    .line 2570
    iget-object v3, v3, La/alb;->l:La/j0g0;

    .line 2571
    .line 2572
    if-eqz v3, :cond_67

    .line 2573
    .line 2574
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 2575
    .line 2576
    instance-of v4, v3, La/g0g0;

    .line 2577
    .line 2578
    if-eqz v4, :cond_66

    .line 2579
    .line 2580
    goto :goto_27

    .line 2581
    :cond_66
    move-object v14, v3

    .line 2582
    :goto_27
    check-cast v14, Ljava/util/List;

    .line 2583
    .line 2584
    if-nez v14, :cond_68

    .line 2585
    .line 2586
    :cond_67
    sget-object v14, La/iun;->a:La/iun;

    .line 2587
    .line 2588
    :cond_68
    invoke-direct {v2, v14}, La/fll0;-><init>(Ljava/util/List;)V

    .line 2589
    .line 2590
    .line 2591
    new-array v3, v9, [La/jll0;

    .line 2592
    .line 2593
    aput-object v2, v3, v10

    .line 2594
    .line 2595
    aput-object v0, v3, v11

    .line 2596
    .line 2597
    invoke-static {v12, v1, v3}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 2598
    .line 2599
    .line 2600
    :cond_69
    :goto_28
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2601
    .line 2602
    goto :goto_29

    .line 2603
    :cond_6a
    invoke-static {}, La/t9f;->b()V

    .line 2604
    .line 2605
    .line 2606
    goto :goto_29

    .line 2607
    :cond_6b
    invoke-static {}, La/t9f;->b()V

    .line 2608
    .line 2609
    .line 2610
    goto :goto_29

    .line 2611
    :cond_6c
    invoke-static {}, La/t9f;->b()V

    .line 2612
    .line 2613
    .line 2614
    :goto_29
    return-object v14

    .line 2615
    :pswitch_13
    sget-object v0, La/wne;->a:La/wne;

    .line 2616
    .line 2617
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2618
    .line 2619
    .line 2620
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2621
    .line 2622
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2623
    .line 2624
    .line 2625
    check-cast v13, La/r9a;

    .line 2626
    .line 2627
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2628
    .line 2629
    .line 2630
    const-string v1, " stopRepeating"

    .line 2631
    .line 2632
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2633
    .line 2634
    .line 2635
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v0

    .line 2639
    check-cast v12, La/ucs0;

    .line 2640
    .line 2641
    :try_start_0
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2642
    .line 2643
    .line 2644
    invoke-virtual {v12}, La/ucs0;->C()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 2645
    .line 2646
    .line 2647
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2648
    .line 2649
    .line 2650
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2651
    .line 2652
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2653
    .line 2654
    .line 2655
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2656
    .line 2657
    .line 2658
    const-string v1, " abortCaptures"

    .line 2659
    .line 2660
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2661
    .line 2662
    .line 2663
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v0

    .line 2667
    :try_start_1
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2668
    .line 2669
    .line 2670
    invoke-virtual {v12}, La/ucs0;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2671
    .line 2672
    .line 2673
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2674
    .line 2675
    .line 2676
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2677
    .line 2678
    return-object v0

    .line 2679
    :catchall_0
    move-exception v0

    .line 2680
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2681
    .line 2682
    .line 2683
    throw v0

    .line 2684
    :catchall_1
    move-exception v0

    .line 2685
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2686
    .line 2687
    .line 2688
    throw v0

    .line 2689
    :pswitch_14
    const-string v0, "Closing capture session for "

    .line 2690
    .line 2691
    sget-object v1, La/wne;->a:La/wne;

    .line 2692
    .line 2693
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2694
    .line 2695
    .line 2696
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2697
    .line 2698
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 2699
    .line 2700
    .line 2701
    check-cast v13, La/r9a;

    .line 2702
    .line 2703
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2704
    .line 2705
    .line 2706
    const-string v3, " CameraCaptureSessionWrapper#close"

    .line 2707
    .line 2708
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2709
    .line 2710
    .line 2711
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2712
    .line 2713
    .line 2714
    move-result-object v1

    .line 2715
    check-cast v12, La/n9a;

    .line 2716
    .line 2717
    :try_start_2
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 2718
    .line 2719
    .line 2720
    new-instance v1, Ljava/lang/StringBuilder;

    .line 2721
    .line 2722
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2723
    .line 2724
    .line 2725
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2726
    .line 2727
    .line 2728
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2729
    .line 2730
    .line 2731
    move-result-object v0

    .line 2732
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2733
    .line 2734
    .line 2735
    iget-object v0, v12, La/n9a;->a:La/fy9;

    .line 2736
    .line 2737
    invoke-static {v0}, La/dw9;->y(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 2738
    .line 2739
    .line 2740
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2741
    .line 2742
    .line 2743
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2744
    .line 2745
    return-object v0

    .line 2746
    :catchall_2
    move-exception v0

    .line 2747
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 2748
    .line 2749
    .line 2750
    throw v0

    .line 2751
    :pswitch_15
    sget-object v0, La/wne;->a:La/wne;

    .line 2752
    .line 2753
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2754
    .line 2755
    .line 2756
    check-cast v13, Landroid/hardware/camera2/CameraDevice;

    .line 2757
    .line 2758
    const-string v1, "%.3f ms"

    .line 2759
    .line 2760
    const-string v3, " - "

    .line 2761
    .line 2762
    if-eqz v13, :cond_6d

    .line 2763
    .line 2764
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2765
    .line 2766
    const-string v4, "Closing Camera "

    .line 2767
    .line 2768
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2769
    .line 2770
    .line 2771
    invoke-virtual {v13}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 2772
    .line 2773
    .line 2774
    move-result-object v4

    .line 2775
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2776
    .line 2777
    .line 2778
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v0

    .line 2782
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2783
    .line 2784
    .line 2785
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2786
    .line 2787
    const-string v4, "CXCP#CameraDevice-"

    .line 2788
    .line 2789
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2790
    .line 2791
    .line 2792
    invoke-virtual {v13}, Landroid/hardware/camera2/CameraDevice;->getId()Ljava/lang/String;

    .line 2793
    .line 2794
    .line 2795
    move-result-object v4

    .line 2796
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2797
    .line 2798
    .line 2799
    const-string v4, "#close"

    .line 2800
    .line 2801
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2802
    .line 2803
    .line 2804
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2805
    .line 2806
    .line 2807
    move-result-object v4

    .line 2808
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 2809
    .line 2810
    .line 2811
    move-result-wide v5

    .line 2812
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    :try_start_3
    invoke-static {v4}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 2818
    .line 2819
    .line 2820
    :try_start_4
    invoke-virtual {v13}, Landroid/hardware/camera2/CameraDevice;->close()V
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 2821
    .line 2822
    .line 2823
    goto :goto_2a

    .line 2824
    :catchall_3
    move-exception v0

    .line 2825
    goto :goto_2b

    .line 2826
    :catch_0
    move-exception v0

    .line 2827
    :try_start_5
    const-string v9, "NPE encountered during CameraDevice.close()"

    .line 2828
    .line 2829
    invoke-static {v2, v9, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 2830
    .line 2831
    .line 2832
    :goto_2a
    invoke-static {v5, v6}, La/cs0;->d(J)J

    .line 2833
    .line 2834
    .line 2835
    move-result-wide v5

    .line 2836
    invoke-static {v4, v3}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v0

    .line 2840
    long-to-double v3, v5

    .line 2841
    div-double/2addr v3, v7

    .line 2842
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2843
    .line 2844
    .line 2845
    move-result-object v3

    .line 2846
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 2847
    .line 2848
    .line 2849
    move-result-object v3

    .line 2850
    invoke-static {v3, v11, v14, v1, v0}, La/cs0;->o([Ljava/lang/Object;ILjava/util/Locale;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v0

    .line 2854
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2855
    .line 2856
    .line 2857
    goto :goto_2c

    .line 2858
    :goto_2b
    invoke-static {v5, v6}, La/cs0;->d(J)J

    .line 2859
    .line 2860
    .line 2861
    move-result-wide v5

    .line 2862
    invoke-static {v4, v3}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2863
    .line 2864
    .line 2865
    move-result-object v3

    .line 2866
    long-to-double v4, v5

    .line 2867
    div-double/2addr v4, v7

    .line 2868
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 2869
    .line 2870
    .line 2871
    move-result-object v4

    .line 2872
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 2873
    .line 2874
    .line 2875
    move-result-object v4

    .line 2876
    invoke-static {v4, v11, v14, v1, v3}, La/cs0;->o([Ljava/lang/Object;ILjava/util/Locale;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 2877
    .line 2878
    .line 2879
    move-result-object v1

    .line 2880
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2881
    .line 2882
    .line 2883
    throw v0

    .line 2884
    :cond_6d
    :goto_2c
    check-cast v12, La/hie0;

    .line 2885
    .line 2886
    iput-boolean v11, v12, La/hie0;->a:Z

    .line 2887
    .line 2888
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2889
    .line 2890
    return-object v0

    .line 2891
    :pswitch_16
    sget-object v0, La/wne;->a:La/wne;

    .line 2892
    .line 2893
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2894
    .line 2895
    .line 2896
    check-cast v13, La/t33;

    .line 2897
    .line 2898
    invoke-virtual {v13}, La/t33;->c()V

    .line 2899
    .line 2900
    .line 2901
    invoke-virtual {v13, v12}, La/t33;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2902
    .line 2903
    .line 2904
    move-result-object v0

    .line 2905
    iget-object v1, v13, La/t33;->c:La/l73;

    .line 2906
    .line 2907
    iget-object v1, v1, La/l73;->b:La/pz40;

    .line 2908
    .line 2909
    check-cast v1, La/hgk0;

    .line 2910
    .line 2911
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 2912
    .line 2913
    .line 2914
    iget-object v1, v13, La/t33;->e:La/pz40;

    .line 2915
    .line 2916
    check-cast v1, La/hgk0;

    .line 2917
    .line 2918
    invoke-virtual {v1, v0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 2919
    .line 2920
    .line 2921
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2922
    .line 2923
    return-object v0

    .line 2924
    :pswitch_17
    sget-object v0, La/wne;->a:La/wne;

    .line 2925
    .line 2926
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2927
    .line 2928
    .line 2929
    new-instance v0, La/pbs0;

    .line 2930
    .line 2931
    check-cast v13, La/qbs0;

    .line 2932
    .line 2933
    iget-object v1, v13, La/qbs0;->a:La/bcs0;

    .line 2934
    .line 2935
    invoke-static {v1}, La/ycm0;->A(La/bcs0;)La/acs0;

    .line 2936
    .line 2937
    .line 2938
    move-result-object v1

    .line 2939
    iget-object v2, v13, La/qbs0;->b:La/mbs0;

    .line 2940
    .line 2941
    invoke-static {v2}, La/dj8;->c0(La/mbs0;)La/m97;

    .line 2942
    .line 2943
    .line 2944
    move-result-object v2

    .line 2945
    invoke-direct {v0, v1, v2}, La/pbs0;-><init>(La/acs0;La/m97;)V

    .line 2946
    .line 2947
    .line 2948
    move-object v1, v12

    .line 2949
    check-cast v1, La/ul2;

    .line 2950
    .line 2951
    iget-object v2, v1, La/ul2;->r:La/prc;

    .line 2952
    .line 2953
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2954
    .line 2955
    .line 2956
    iget-object v2, v2, La/prc;->b:Ljava/lang/Object;

    .line 2957
    .line 2958
    check-cast v2, La/qj9;

    .line 2959
    .line 2960
    invoke-virtual {v2, v0}, La/qj9;->a(La/pbs0;)V

    .line 2961
    .line 2962
    .line 2963
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 2964
    .line 2965
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 2966
    .line 2967
    :cond_6e
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2968
    .line 2969
    .line 2970
    move-result-object v2

    .line 2971
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2972
    .line 2973
    .line 2974
    move-object v15, v2

    .line 2975
    check-cast v15, La/nl2;

    .line 2976
    .line 2977
    const/16 v24, 0x0

    .line 2978
    .line 2979
    const/16 v25, 0xff

    .line 2980
    .line 2981
    const/16 v16, 0x0

    .line 2982
    .line 2983
    const/16 v17, 0x0

    .line 2984
    .line 2985
    const/16 v18, 0x0

    .line 2986
    .line 2987
    const/16 v19, 0x0

    .line 2988
    .line 2989
    const/16 v20, 0x0

    .line 2990
    .line 2991
    const/16 v21, 0x0

    .line 2992
    .line 2993
    const/16 v22, 0x0

    .line 2994
    .line 2995
    const/16 v23, 0x0

    .line 2996
    .line 2997
    invoke-static/range {v15 .. v25}, La/nl2;->a(La/nl2;La/yk2;ZZLa/gds0;ZZZLa/s4i0;La/s4i0;I)La/nl2;

    .line 2998
    .line 2999
    .line 3000
    move-result-object v3

    .line 3001
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 3002
    .line 3003
    .line 3004
    move-result v2

    .line 3005
    if-eqz v2, :cond_6e

    .line 3006
    .line 3007
    iget-object v0, v1, La/ul2;->o:La/vzg0;

    .line 3008
    .line 3009
    invoke-virtual {v0, v7, v14}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3010
    .line 3011
    .line 3012
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3013
    .line 3014
    return-object v0

    .line 3015
    :pswitch_18
    sget-object v0, La/wne;->a:La/wne;

    .line 3016
    .line 3017
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3018
    .line 3019
    .line 3020
    check-cast v13, La/n92;

    .line 3021
    .line 3022
    iget-object v0, v13, La/n92;->p:La/i1w0;

    .line 3023
    .line 3024
    check-cast v12, La/uf50;

    .line 3025
    .line 3026
    new-instance v1, La/df1;

    .line 3027
    .line 3028
    const/16 v2, 0xf

    .line 3029
    .line 3030
    invoke-direct {v1, v13, v12, v2}, La/df1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 3031
    .line 3032
    .line 3033
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 3034
    .line 3035
    .line 3036
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3037
    .line 3038
    return-object v0

    .line 3039
    :pswitch_19
    sget-object v0, La/wne;->a:La/wne;

    .line 3040
    .line 3041
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 3042
    .line 3043
    .line 3044
    check-cast v13, La/s72;

    .line 3045
    .line 3046
    check-cast v12, La/s62;

    .line 3047
    .line 3048
    check-cast v12, La/p62;

    .line 3049
    .line 3050
    iget-object v0, v12, La/p62;->a:La/fql0;

    .line 3051
    .line 3052
    sget v1, La/s72;->I:I

    .line 3053
    .line 3054
    iget-object v1, v13, La/s72;->G:La/bby;

    .line 3055
    .line 3056
    if-eqz v1, :cond_6f

    .line 3057
    .line 3058
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 3059
    .line 3060
    .line 3061
    move-result v1

    .line 3062
    if-ne v1, v11, :cond_6f

    .line 3063
    .line 3064
    goto :goto_2d

    .line 3065
    :cond_6f
    invoke-static {v13}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 3066
    .line 3067
    .line 3068
    move-result-object v15

    .line 3069
    new-instance v1, La/o72;

    .line 3070
    .line 3071
    invoke-direct {v1, v13, v10}, La/o72;-><init>(La/s72;B)V

    .line 3072
    .line 3073
    .line 3074
    new-instance v2, La/oa;

    .line 3075
    .line 3076
    invoke-direct {v2, v13, v0, v14, v5}, La/oa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 3077
    .line 3078
    .line 3079
    const/16 v20, 0xe

    .line 3080
    .line 3081
    const/16 v17, 0x0

    .line 3082
    .line 3083
    const/16 v18, 0x0

    .line 3084
    .line 3085
    move-object/from16 v16, v1

    .line 3086
    .line 3087
    move-object/from16 v19, v2

    .line 3088
    .line 3089
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 3090
    .line 3091
    .line 3092
    move-result-object v0

    .line 3093
    iput-object v0, v13, La/s72;->G:La/bby;

    .line 3094
    .line 3095
    :goto_2d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3096
    .line 3097
    return-object v0

    .line 3098
    nop

    .line 3099
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    :sswitch_data_0
    .sparse-switch
        -0x64d81a72 -> :sswitch_3
        0x1aa2fb5d -> :sswitch_2
        0x5c1e7e96 -> :sswitch_1
        0x6c36c7d6 -> :sswitch_0
    .end sparse-switch
.end method
