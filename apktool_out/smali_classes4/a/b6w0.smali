.class public final La/b6w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/v5w0;

.field public final b:La/v5w0;

.field public final c:La/v5w0;


# direct methods
.method public constructor <init>(La/kii0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/v5w0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, v1}, La/v5w0;-><init>(La/kii0;B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/b6w0;->a:La/v5w0;

    .line 11
    .line 12
    new-instance v0, La/v5w0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p1, v1}, La/v5w0;-><init>(La/kii0;B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/b6w0;->b:La/v5w0;

    .line 19
    .line 20
    new-instance v0, La/v5w0;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, p1, v1}, La/v5w0;-><init>(La/kii0;B)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/b6w0;->c:La/v5w0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(La/zg40;La/zje;)Ljava/io/Serializable;
    .locals 8

    .line 1
    const-string v0, "https://"

    .line 2
    .line 3
    instance-of v1, p2, La/w5w0;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, La/w5w0;

    .line 9
    .line 10
    iget v2, v1, La/w5w0;->m:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/w5w0;->m:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/w5w0;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, La/w5w0;-><init>(La/b6w0;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, La/w5w0;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/w5w0;->m:I

    .line 32
    .line 33
    const-string v4, ""

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const-string v6, "domain="

    .line 37
    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v5, :cond_1

    .line 41
    .line 42
    iget-object p0, v1, La/w5w0;->j:La/b6w0;

    .line 43
    .line 44
    iget-object p1, v1, La/w5w0;->i:La/zg40;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_2

    .line 52
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 63
    .line 64
    iget-object p2, p0, La/b6w0;->b:La/v5w0;

    .line 65
    .line 66
    invoke-virtual {p2}, La/v5w0;->invoke()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    check-cast p2, La/w4w0;

    .line 71
    .line 72
    invoke-virtual {p1}, La/zg40;->getHostName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    new-instance v7, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, "/status.json"

    .line 85
    .line 86
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object p1, v1, La/w5w0;->i:La/zg40;

    .line 94
    .line 95
    iput-object p0, v1, La/w5w0;->j:La/b6w0;

    .line 96
    .line 97
    iput v5, v1, La/w5w0;->m:I

    .line 98
    .line 99
    invoke-interface {p2, v0, v1}, La/w4w0;->a(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    if-ne p2, v2, :cond_3

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_3
    :goto_1
    check-cast p2, La/jtf0;

    .line 107
    .line 108
    invoke-virtual {p1}, La/zg40;->getHostName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    move-object v0, v4

    .line 115
    :cond_4
    iget-object p2, p2, La/jtf0;->a:Lokhttp3/Response;

    .line 116
    .line 117
    iget-boolean p2, p2, Lokhttp3/Response;->q:Z

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance p0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v0, "&status="

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    sget-object p2, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :goto_2
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 146
    .line 147
    new-instance p2, La/g0g0;

    .line 148
    .line 149
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    move-object p0, p2

    .line 153
    :goto_3
    invoke-virtual {p1}, La/zg40;->getHostName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    if-nez p1, :cond_5

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_5
    move-object v4, p1

    .line 161
    :goto_4
    const-string p1, "&status=0"

    .line 162
    .line 163
    invoke-static {v6, v4, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    instance-of p2, p0, La/g0g0;

    .line 168
    .line 169
    if-eqz p2, :cond_6

    .line 170
    .line 171
    move-object p0, p1

    .line 172
    :cond_6
    return-object p0
.end method

.method public final b(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, La/x5w0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/x5w0;

    .line 7
    .line 8
    iget v1, v0, La/x5w0;->o:I

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
    iput v1, v0, La/x5w0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/x5w0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/x5w0;-><init>(La/b6w0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/x5w0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/x5w0;->o:I

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    iget-object v4, p0, La/b6w0;->a:La/v5w0;

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v7, :cond_3

    .line 42
    .line 43
    if-eq v2, v6, :cond_2

    .line 44
    .line 45
    if-ne v2, v5, :cond_1

    .line 46
    .line 47
    iget-object p0, v0, La/x5w0;->l:Ljava/util/Collection;

    .line 48
    .line 49
    check-cast p0, Ljava/util/Collection;

    .line 50
    .line 51
    iget-object p1, v0, La/x5w0;->k:Ljava/util/Iterator;

    .line 52
    .line 53
    iget-object v2, v0, La/x5w0;->j:Ljava/util/Collection;

    .line 54
    .line 55
    check-cast v2, Ljava/util/Collection;

    .line 56
    .line 57
    iget-object v3, v0, La/x5w0;->i:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v8

    .line 70
    :cond_2
    iget-object p1, v0, La/x5w0;->l:Ljava/util/Collection;

    .line 71
    .line 72
    check-cast p1, Ljava/util/Collection;

    .line 73
    .line 74
    iget-object v2, v0, La/x5w0;->k:Ljava/util/Iterator;

    .line 75
    .line 76
    iget-object v7, v0, La/x5w0;->j:Ljava/util/Collection;

    .line 77
    .line 78
    check-cast v7, Ljava/util/Collection;

    .line 79
    .line 80
    iget-object v9, v0, La/x5w0;->i:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    iget-object p1, v0, La/x5w0;->i:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v4}, La/v5w0;->invoke()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, La/w4w0;

    .line 100
    .line 101
    iput-object p1, v0, La/x5w0;->i:Ljava/lang/String;

    .line 102
    .line 103
    iput v7, v0, La/x5w0;->o:I

    .line 104
    .line 105
    invoke-interface {p2, v0}, La/w4w0;->b(La/yje;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    if-ne p2, v1, :cond_5

    .line 110
    .line 111
    goto/16 :goto_5

    .line 112
    .line 113
    :cond_5
    :goto_1
    check-cast p2, La/k85;

    .line 114
    .line 115
    invoke-virtual {p2}, La/k85;->getResult()Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-nez p2, :cond_6

    .line 120
    .line 121
    sget-object p2, La/iun;->a:La/iun;

    .line 122
    .line 123
    :cond_6
    new-instance v2, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-static {p2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    move-object v9, p1

    .line 137
    move-object p1, v2

    .line 138
    move-object v2, p2

    .line 139
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    if-eqz p2, :cond_8

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, La/zg40;

    .line 150
    .line 151
    iput-object v9, v0, La/x5w0;->i:Ljava/lang/String;

    .line 152
    .line 153
    move-object v7, p1

    .line 154
    check-cast v7, Ljava/util/Collection;

    .line 155
    .line 156
    iput-object v7, v0, La/x5w0;->j:Ljava/util/Collection;

    .line 157
    .line 158
    iput-object v2, v0, La/x5w0;->k:Ljava/util/Iterator;

    .line 159
    .line 160
    iput-object v7, v0, La/x5w0;->l:Ljava/util/Collection;

    .line 161
    .line 162
    iput v6, v0, La/x5w0;->o:I

    .line 163
    .line 164
    invoke-virtual {p0, p2, v0}, La/b6w0;->a(La/zg40;La/zje;)Ljava/io/Serializable;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    if-ne p2, v1, :cond_7

    .line 169
    .line 170
    goto :goto_5

    .line 171
    :cond_7
    move-object v7, p1

    .line 172
    :goto_3
    check-cast p2, Ljava/lang/String;

    .line 173
    .line 174
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-object p1, v7

    .line 178
    goto :goto_2

    .line 179
    :cond_8
    check-cast p1, Ljava/util/List;

    .line 180
    .line 181
    new-instance p0, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-static {p1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    move-object v3, v9

    .line 195
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_a

    .line 200
    .line 201
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    check-cast p2, Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v4}, La/v5w0;->invoke()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, La/w4w0;

    .line 212
    .line 213
    const-string v6, "che_g="

    .line 214
    .line 215
    invoke-static {v6, v3}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    sget v7, Lokhttp3/RequestBody;->a:I

    .line 220
    .line 221
    invoke-static {p2, v8}, Lokhttp3/RequestBody$Companion;->a(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody$Companion$toRequestBody$3;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    iput-object v3, v0, La/x5w0;->i:Ljava/lang/String;

    .line 226
    .line 227
    move-object v7, p0

    .line 228
    check-cast v7, Ljava/util/Collection;

    .line 229
    .line 230
    iput-object v7, v0, La/x5w0;->j:Ljava/util/Collection;

    .line 231
    .line 232
    iput-object p1, v0, La/x5w0;->k:Ljava/util/Iterator;

    .line 233
    .line 234
    iput-object v7, v0, La/x5w0;->l:Ljava/util/Collection;

    .line 235
    .line 236
    iput v5, v0, La/x5w0;->o:I

    .line 237
    .line 238
    const-string v7, "text/plain"

    .line 239
    .line 240
    invoke-interface {v2, v6, p2, v7, v0}, La/w4w0;->c(Ljava/lang/String;Lokhttp3/RequestBody;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    if-ne p2, v1, :cond_9

    .line 245
    .line 246
    :goto_5
    return-object v1

    .line 247
    :cond_9
    move-object v2, p0

    .line 248
    :goto_6
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-object p0, v2

    .line 254
    goto :goto_4

    .line 255
    :cond_a
    check-cast p0, Ljava/util/List;

    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0
.end method
