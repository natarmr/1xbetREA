.class public final La/j3c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/sjl0;


# direct methods
.method public constructor <init>(La/sjl0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/j3c;->a:La/sjl0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/j3c;->a:La/sjl0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/j3c;->a:La/sjl0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(JJLa/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, La/fvu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/fvu;

    .line 7
    .line 8
    iget v1, v0, La/fvu;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fvu;->k:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/fvu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/fvu;-><init>(La/j3c;La/yje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, La/fvu;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p5, La/fvu;->k:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    iget-object p0, p0, La/j3c;->a:La/sjl0;

    .line 53
    .line 54
    iput v3, p5, La/fvu;->k:I

    .line 55
    .line 56
    invoke-virtual/range {p0 .. p5}, La/sjl0;->f(JJLa/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-ne v0, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_2
    check-cast v0, La/ypl0;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 64
    .line 65
    return-object v0

    .line 66
    :catch_0
    move-exception v0

    .line 67
    move-object p0, v0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    new-instance p0, La/ypl0;

    .line 72
    .line 73
    sget-object p1, La/lel0;->Companion:La/kel0;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {}, La/kel0;->a()La/lel0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    const-wide/16 p2, 0x0

    .line 83
    .line 84
    const-string p4, ""

    .line 85
    .line 86
    invoke-direct {p0, p2, p3, p4, p1}, La/ypl0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :catch_1
    move-exception v0

    .line 91
    move-object p0, v0

    .line 92
    throw p0
.end method

.method public b(JLa/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, La/i3c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/i3c;

    .line 7
    .line 8
    iget v1, v0, La/i3c;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/i3c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/i3c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/i3c;-><init>(La/j3c;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/i3c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/i3c;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :try_start_1
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 53
    .line 54
    iget-object p0, p0, La/j3c;->a:La/sjl0;

    .line 55
    .line 56
    iput v4, v0, La/i3c;->k:I

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2, v0}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    if-ne p3, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p3, La/ril0;

    .line 66
    .line 67
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :goto_2
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 71
    .line 72
    new-instance p3, La/g0g0;

    .line 73
    .line 74
    invoke-direct {p3, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :goto_3
    instance-of p0, p3, La/g0g0;

    .line 78
    .line 79
    if-eqz p0, :cond_4

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_4
    move-object v3, p3

    .line 83
    :goto_4
    check-cast v3, La/ril0;

    .line 84
    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    iget-boolean p0, v3, La/ril0;->e:Z

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    const/4 p0, 0x0

    .line 91
    :goto_5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public c(La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/xwt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/xwt;

    .line 7
    .line 8
    iget v1, v0, La/xwt;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/xwt;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/xwt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/xwt;-><init>(La/j3c;La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/xwt;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/xwt;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/xwt;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/j3c;->a:La/sjl0;

    .line 53
    .line 54
    invoke-virtual {p0, v0}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v1, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 62
    .line 63
    new-instance p0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 66
    .line 67
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 71
    .line 72
    const-string v1, "%s"

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static {v1, v0, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_6

    .line 80
    .line 81
    const-string v0, "https://"

    .line 82
    .line 83
    invoke-static {v1, v0, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/16 v5, 0x2f

    .line 95
    .line 96
    if-lez v0, :cond_5

    .line 97
    .line 98
    const-string v0, "/"

    .line 99
    .line 100
    invoke-static {p0, v0}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_5
    new-array v0, v4, [C

    .line 110
    .line 111
    aput-char v5, v0, v2

    .line 112
    .line 113
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    :goto_2
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :goto_3
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_8

    .line 145
    .line 146
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    move-object v5, v2

    .line 151
    check-cast v5, La/ril0;

    .line 152
    .line 153
    iget-wide v5, v5, La/ril0;->a:J

    .line 154
    .line 155
    const-wide/16 v7, 0x28

    .line 156
    .line 157
    cmp-long v5, v5, v7

    .line 158
    .line 159
    if-nez v5, :cond_7

    .line 160
    .line 161
    move-object v3, v2

    .line 162
    :cond_8
    check-cast v3, La/ril0;

    .line 163
    .line 164
    if-nez v3, :cond_9

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_9
    iget-object v1, v3, La/ril0;->f:Ljava/util/List;

    .line 168
    .line 169
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :cond_a
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_b

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, La/f3n0;

    .line 184
    .line 185
    iget-object v5, v2, La/f3n0;->c:La/lel0;

    .line 186
    .line 187
    iget-object v5, v5, La/lel0;->j:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-lez v5, :cond_a

    .line 194
    .line 195
    iget-wide v5, v2, La/f3n0;->a:J

    .line 196
    .line 197
    new-instance v7, La/vcb;

    .line 198
    .line 199
    invoke-direct {v7, v5, v6}, La/vcb;-><init>(J)V

    .line 200
    .line 201
    .line 202
    iget-object v2, v2, La/f3n0;->c:La/lel0;

    .line 203
    .line 204
    iget-object v2, v2, La/lel0;->j:Ljava/lang/String;

    .line 205
    .line 206
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-interface {v0, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_b
    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    :goto_5
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 227
    .line 228
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    :cond_c
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_d

    .line 240
    .line 241
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    check-cast v2, La/ril0;

    .line 246
    .line 247
    iget-object v3, v2, La/ril0;->g:La/lel0;

    .line 248
    .line 249
    iget-object v3, v3, La/lel0;->j:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-lez v3, :cond_c

    .line 256
    .line 257
    iget-wide v5, v2, La/ril0;->a:J

    .line 258
    .line 259
    new-instance v3, La/tcb;

    .line 260
    .line 261
    invoke-direct {v3, v5, v6}, La/tcb;-><init>(J)V

    .line 262
    .line 263
    .line 264
    new-instance v5, La/ucb;

    .line 265
    .line 266
    iget-object v6, v2, La/ril0;->g:La/lel0;

    .line 267
    .line 268
    iget-object v6, v6, La/lel0;->j:Ljava/lang/String;

    .line 269
    .line 270
    iget-boolean v2, v2, La/ril0;->e:Z

    .line 271
    .line 272
    invoke-direct {v5, v6, v2}, La/ucb;-><init>(Ljava/lang/String;Z)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_d
    new-instance p1, La/wcb;

    .line 280
    .line 281
    const-string v2, "/static/svg/sports_v2/%s.svg"

    .line 282
    .line 283
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-static {p0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-direct {p1, p0, v0, v1}, La/wcb;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    .line 296
    .line 297
    .line 298
    return-object p1
.end method
