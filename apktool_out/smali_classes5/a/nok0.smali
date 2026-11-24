.class public final La/nok0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/eyg0;

.field public final b:La/iok0;

.field public final c:La/mne;


# direct methods
.method public constructor <init>(La/eyg0;La/iok0;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/nok0;->a:La/eyg0;

    .line 8
    .line 9
    iput-object p2, p0, La/nok0;->b:La/iok0;

    .line 10
    .line 11
    iput-object p3, p0, La/nok0;->c:La/mne;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "SPECIAL_EVENT_INFO_PREF_KEY_V4"

    .line 4
    .line 5
    iget-object p0, p0, La/nok0;->b:La/iok0;

    .line 6
    .line 7
    iget-object v2, p0, La/iok0;->a:La/q7d0;

    .line 8
    .line 9
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 10
    .line 11
    invoke-virtual {v2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v3

    .line 23
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lez v3, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, La/iok0;->b:La/vby;

    .line 30
    .line 31
    new-instance v3, La/zw3;

    .line 32
    .line 33
    sget-object v4, La/lok0;->Companion:La/kok0;

    .line 34
    .line 35
    invoke-virtual {v4}, La/kok0;->serializer()La/jiy;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v3, v4, v5}, La/zw3;-><init>(La/jiy;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3, v0}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/util/List;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    sget-object p0, La/iun;->a:La/iun;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :goto_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 56
    .line 57
    new-instance v0, La/g0g0;

    .line 58
    .line 59
    invoke-direct {v0, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    move-object p0, v0

    .line 63
    :goto_2
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_2
    invoke-virtual {v2, v1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object p0, La/iun;->a:La/iun;

    .line 74
    .line 75
    :goto_3
    check-cast p0, Ljava/util/List;

    .line 76
    .line 77
    return-object p0
.end method

.method public final b(ZLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/mok0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/mok0;

    .line 7
    .line 8
    iget v1, v0, La/mok0;->n:I

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
    iput v1, v0, La/mok0;->n:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/mok0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/mok0;-><init>(La/nok0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v4, La/mok0;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v8, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v0, v4, La/mok0;->n:I

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x3

    .line 36
    const/4 v5, 0x0

    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    if-eq v0, v2, :cond_3

    .line 40
    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    if-ne v0, v3, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    check-cast p2, La/j0g0;

    .line 49
    .line 50
    iget-object p0, p2, La/j0g0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    goto/16 :goto_b

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    :cond_2
    iget-boolean p1, v4, La/mok0;->j:Z

    .line 61
    .line 62
    iget-boolean v0, v4, La/mok0;->i:Z

    .line 63
    .line 64
    iget-object v1, v4, La/mok0;->k:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    iget-boolean p1, v4, La/mok0;->i:Z

    .line 72
    .line 73
    iget-object v0, v4, La/mok0;->k:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/nok0;

    .line 76
    .line 77
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object p2, v0

    .line 83
    goto :goto_5

    .line 84
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 88
    .line 89
    iput-object v5, v4, La/mok0;->k:Ljava/lang/Object;

    .line 90
    .line 91
    iput-boolean p1, v4, La/mok0;->i:Z

    .line 92
    .line 93
    iput v2, v4, La/mok0;->n:I

    .line 94
    .line 95
    new-instance p2, La/ejk0;

    .line 96
    .line 97
    const/4 v0, 0x5

    .line 98
    invoke-direct {p2, v0}, La/ejk0;-><init>(B)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, La/nok0;->c:La/mne;

    .line 102
    .line 103
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 104
    .line 105
    new-instance v6, La/eyc0;

    .line 106
    .line 107
    invoke-direct {v6, p0, p1, p2, v5}, La/eyc0;-><init>(La/nok0;ZLkotlin/jvm/functions/Function1;La/yje;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0, v6, v4}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-ne p2, v8, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    :goto_2
    if-ne p2, v8, :cond_6

    .line 120
    .line 121
    goto/16 :goto_a

    .line 122
    .line 123
    :cond_6
    :goto_3
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    .line 127
    :goto_4
    move v0, p1

    .line 128
    goto :goto_6

    .line 129
    :goto_5
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 130
    .line 131
    new-instance v0, La/g0g0;

    .line 132
    .line 133
    invoke-direct {v0, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object p2, v0

    .line 137
    goto :goto_4

    .line 138
    :goto_6
    invoke-static {p2}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_c

    .line 143
    .line 144
    invoke-static {p1}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-nez v6, :cond_b

    .line 149
    .line 150
    iget-object p1, p0, La/nok0;->b:La/iok0;

    .line 151
    .line 152
    iget-object p1, p1, La/iok0;->a:La/q7d0;

    .line 153
    .line 154
    const-string v6, "SPECIAL_EVENT_INFO_PREF_KEY_V4"

    .line 155
    .line 156
    invoke-virtual {p1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const-string v7, ""

    .line 161
    .line 162
    invoke-interface {p1, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-nez p1, :cond_7

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_7
    move-object v7, p1

    .line 170
    :goto_7
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-nez p1, :cond_8

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_8
    const/4 v2, 0x0

    .line 178
    :goto_8
    if-eqz v2, :cond_c

    .line 179
    .line 180
    sget-object p1, La/wen;->b:La/uen;

    .line 181
    .line 182
    sget-object p1, La/bfn;->e:La/bfn;

    .line 183
    .line 184
    invoke-static {v3, p1}, La/ibc;->v0(ILa/bfn;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v6

    .line 188
    iput-object p2, v4, La/mok0;->k:Ljava/lang/Object;

    .line 189
    .line 190
    iput-boolean v0, v4, La/mok0;->i:Z

    .line 191
    .line 192
    iput-boolean v2, v4, La/mok0;->j:Z

    .line 193
    .line 194
    iput v1, v4, La/mok0;->n:I

    .line 195
    .line 196
    invoke-static {v6, v7, v4}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-ne p1, v8, :cond_9

    .line 201
    .line 202
    goto :goto_a

    .line 203
    :cond_9
    move-object v1, p2

    .line 204
    move p1, v2

    .line 205
    :goto_9
    const-class p2, La/nok0;

    .line 206
    .line 207
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    sget-object v2, La/wen;->b:La/uen;

    .line 212
    .line 213
    sget-object v2, La/bfn;->e:La/bfn;

    .line 214
    .line 215
    invoke-static {v3, v2}, La/ibc;->v0(ILa/bfn;)J

    .line 216
    .line 217
    .line 218
    move-result-wide v6

    .line 219
    move-wide v9, v6

    .line 220
    move v6, v3

    .line 221
    move-wide v2, v9

    .line 222
    new-instance v7, La/a48;

    .line 223
    .line 224
    invoke-direct {v7, p0, v0, v5}, La/a48;-><init>(La/nok0;ZLa/yje;)V

    .line 225
    .line 226
    .line 227
    iput-object v1, v4, La/mok0;->k:Ljava/lang/Object;

    .line 228
    .line 229
    iput-boolean v0, v4, La/mok0;->i:Z

    .line 230
    .line 231
    iput-boolean p1, v4, La/mok0;->j:Z

    .line 232
    .line 233
    iput v6, v4, La/mok0;->n:I

    .line 234
    .line 235
    sget-object v6, La/iun;->a:La/iun;

    .line 236
    .line 237
    const/4 v1, 0x3

    .line 238
    move-object v5, p2

    .line 239
    invoke-static/range {v1 .. v7}, La/j0x;->E(IJLa/zje;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    if-ne p0, v8, :cond_a

    .line 244
    .line 245
    :goto_a
    return-object v8

    .line 246
    :cond_a
    :goto_b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto :goto_c

    .line 250
    :cond_b
    throw p1

    .line 251
    :cond_c
    :goto_c
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 252
    .line 253
    return-object p0
.end method
