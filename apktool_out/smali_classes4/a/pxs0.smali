.class public final La/pxs0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:Ljava/util/Set;


# instance fields
.field public final a:La/azk;

.field public final b:La/jzk;

.field public final c:La/vyk;

.field public final d:La/uyk;

.field public final e:La/nk50;

.field public final f:La/tiu;

.field public final g:La/qoj0;

.field public final h:La/n0o0;

.field public i:La/c4m0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "9.9.9.11"

    .line 2
    .line 3
    const-string v1, "149.112.112.11"

    .line 4
    .line 5
    const-string v2, "8.8.8.8"

    .line 6
    .line 7
    const-string v3, "208.67.222.222"

    .line 8
    .line 9
    const-string v4, "208.67.220.220"

    .line 10
    .line 11
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/pxs0;->j:Ljava/util/Set;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(La/azk;La/jzk;La/vyk;La/uyk;La/nk50;La/tiu;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/pxs0;->a:La/azk;

    .line 11
    .line 12
    iput-object p2, p0, La/pxs0;->b:La/jzk;

    .line 13
    .line 14
    iput-object p3, p0, La/pxs0;->c:La/vyk;

    .line 15
    .line 16
    iput-object p4, p0, La/pxs0;->d:La/uyk;

    .line 17
    .line 18
    iput-object p5, p0, La/pxs0;->e:La/nk50;

    .line 19
    .line 20
    iput-object p6, p0, La/pxs0;->f:La/tiu;

    .line 21
    .line 22
    const p1, 0x7fffffff

    .line 23
    .line 24
    .line 25
    sget-object p2, La/i99;->b:La/i99;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    invoke-static {p3, p1, p2}, La/roj0;->a(IILa/i99;)La/qoj0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/pxs0;->g:La/qoj0;

    .line 33
    .line 34
    new-instance p1, La/xns0;

    .line 35
    .line 36
    const/16 p2, 0x8

    .line 37
    .line 38
    invoke-direct {p1, p2}, La/xns0;-><init>(B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, La/pxs0;->h:La/n0o0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/pxs0;->i:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, La/pby;->getChildren()Lkotlin/sequences/Sequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/sx3;

    .line 11
    .line 12
    iget-object v0, v0, La/sx3;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    invoke-static {v0}, La/igi0;->a(Lkotlin/jvm/functions/Function2;)La/egi0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-virtual {v0}, La/egi0;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, La/egi0;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, La/bby;

    .line 31
    .line 32
    invoke-interface {v2, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p0, p0, La/pxs0;->i:La/c4m0;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, La/mxs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/mxs0;

    .line 7
    .line 8
    iget v1, v0, La/mxs0;->m:I

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
    iput v1, v0, La/mxs0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/mxs0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/mxs0;-><init>(La/pxs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/mxs0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/mxs0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, La/mxs0;->j:Ljava/lang/String;

    .line 39
    .line 40
    iget-object p2, v0, La/mxs0;->i:Ljava/lang/String;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string p4, "://"

    .line 58
    .line 59
    invoke-static {p1, p4, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p4

    .line 63
    if-eqz p4, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {p3, p1}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    :try_start_1
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 71
    .line 72
    iget-object p0, p0, La/pxs0;->d:La/uyk;

    .line 73
    .line 74
    new-instance p3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    iput-object p2, v0, La/mxs0;->i:Ljava/lang/String;

    .line 90
    .line 91
    iput-object p1, v0, La/mxs0;->j:Ljava/lang/String;

    .line 92
    .line 93
    iput v3, v0, La/mxs0;->m:I

    .line 94
    .line 95
    invoke-interface {p0, p3, v0}, La/uyk;->c(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 99
    if-ne p4, v1, :cond_4

    .line 100
    .line 101
    return-object v1

    .line 102
    :cond_4
    move-object p0, p1

    .line 103
    :goto_2
    :try_start_2
    check-cast p4, La/jtf0;

    .line 104
    .line 105
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    move-object v6, p1

    .line 110
    move-object p1, p0

    .line 111
    move-object p0, v6

    .line 112
    :goto_3
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 113
    .line 114
    new-instance p4, La/g0g0;

    .line 115
    .line 116
    invoke-direct {p4, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    :goto_4
    sget-object p1, Lokhttp3/ResponseBody;->a:Lokhttp3/ResponseBody$Companion$asResponseBody$1;

    .line 120
    .line 121
    new-array p1, v4, [B

    .line 122
    .line 123
    new-instance p3, La/f99;

    .line 124
    .line 125
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p3, p1, v4}, La/f99;->U([BI)V

    .line 129
    .line 130
    .line 131
    new-instance p1, Lokhttp3/ResponseBody$Companion$asResponseBody$1;

    .line 132
    .line 133
    const-wide/16 v0, 0x0

    .line 134
    .line 135
    invoke-direct {p1, v5, v0, v1, p3}, Lokhttp3/ResponseBody$Companion$asResponseBody$1;-><init>(Lokhttp3/MediaType;JLa/u99;)V

    .line 136
    .line 137
    .line 138
    new-instance p3, Lokhttp3/Response$Builder;

    .line 139
    .line 140
    invoke-direct {p3}, Lokhttp3/Response$Builder;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v2, La/if60;

    .line 144
    .line 145
    invoke-direct {v2, v5, v0, v1}, La/if60;-><init>(Lokhttp3/MediaType;J)V

    .line 146
    .line 147
    .line 148
    iput-object v2, p3, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 149
    .line 150
    const/16 v0, 0x1f4

    .line 151
    .line 152
    iput v0, p3, Lokhttp3/Response$Builder;->c:I

    .line 153
    .line 154
    const-string v0, "Response.error()"

    .line 155
    .line 156
    iput-object v0, p3, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 157
    .line 158
    sget-object v0, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 159
    .line 160
    iput-object v0, p3, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 161
    .line 162
    new-instance v0, Lokhttp3/Request$Builder;

    .line 163
    .line 164
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v1, "http://localhost/"

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->d(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    new-instance v1, Lokhttp3/Request;

    .line 173
    .line 174
    invoke-direct {v1, v0}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 175
    .line 176
    .line 177
    iput-object v1, p3, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 178
    .line 179
    invoke-virtual {p3}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-static {p1, p3}, La/jtf0;->a(Lokhttp3/ResponseBody$Companion$asResponseBody$1;Lokhttp3/Response;)La/jtf0;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    instance-of p3, p4, La/g0g0;

    .line 188
    .line 189
    if-eqz p3, :cond_5

    .line 190
    .line 191
    move-object p4, p1

    .line 192
    :cond_5
    check-cast p4, La/jtf0;

    .line 193
    .line 194
    iget-object p1, p4, La/jtf0;->a:Lokhttp3/Response;

    .line 195
    .line 196
    iget p1, p1, Lokhttp3/Response;->d:I

    .line 197
    .line 198
    const/16 p3, 0xc8

    .line 199
    .line 200
    if-eq p1, p3, :cond_8

    .line 201
    .line 202
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-lez p1, :cond_6

    .line 207
    .line 208
    goto :goto_6

    .line 209
    :cond_6
    iget-object p1, p4, La/jtf0;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast p1, La/m0c;

    .line 212
    .line 213
    if-eqz p1, :cond_7

    .line 214
    .line 215
    invoke-virtual {p1}, La/m0c;->isAvailable()Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    goto :goto_5

    .line 226
    :cond_7
    move p1, v4

    .line 227
    :goto_5
    if-eqz p1, :cond_8

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_8
    move v3, v4

    .line 231
    :goto_6
    new-instance p1, La/o9c;

    .line 232
    .line 233
    invoke-direct {p1, p0, v3}, La/o9c;-><init>(Ljava/lang/String;Z)V

    .line 234
    .line 235
    .line 236
    return-object p1
.end method

.method public final c(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/nxs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/nxs0;

    .line 7
    .line 8
    iget v1, v0, La/nxs0;->k:I

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
    iput v1, v0, La/nxs0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nxs0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/nxs0;-><init>(La/pxs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/nxs0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/nxs0;->k:I

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    filled-new-array {p1}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, La/otp0;

    .line 55
    .line 56
    const/4 v2, 0x6

    .line 57
    invoke-direct {p2, p0, p1, v3, v2}, La/otp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, La/nkb;->z(Lkotlin/jvm/functions/Function2;)La/ltb;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iput v4, v0, La/nxs0;->k:I

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ntb;->M(La/gmq;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 74
    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    return-object p2

    .line 78
    :cond_4
    new-instance p0, Ljava/net/UnknownHostException;

    .line 79
    .line 80
    const-string p1, "No domains resolved"

    .line 81
    .line 82
    invoke-direct {p0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p0
.end method
