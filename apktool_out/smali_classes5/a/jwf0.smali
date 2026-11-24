.class public final La/jwf0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:La/pyu;

.field public final d:La/iqt;

.field public final e:La/sa10;

.field public final f:La/duj;

.field public final g:La/i1w0;

.field public final h:La/p7m0;

.field public final i:La/c4m0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/pyu;La/iqt;La/sa10;La/m1e;La/mne;La/duj;La/i1w0;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/jwf0;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/jwf0;->c:La/pyu;

    .line 13
    .line 14
    iput-object p3, p0, La/jwf0;->d:La/iqt;

    .line 15
    .line 16
    iput-object p4, p0, La/jwf0;->e:La/sa10;

    .line 17
    .line 18
    iput-object p7, p0, La/jwf0;->f:La/duj;

    .line 19
    .line 20
    iput-object p8, p0, La/jwf0;->g:La/i1w0;

    .line 21
    .line 22
    sget-object p1, La/gwf0;->a:La/gwf0;

    .line 23
    .line 24
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/jwf0;->h:La/p7m0;

    .line 29
    .line 30
    iget-object p1, p0, La/jwf0;->i:La/c4m0;

    .line 31
    .line 32
    const/4 p2, 0x1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-ne p1, p2, :cond_0

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-interface {p5}, La/m1e;->b()La/gmq;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance p3, La/fj3;

    .line 47
    .line 48
    const/16 p4, 0x14

    .line 49
    .line 50
    const/4 p5, 0x0

    .line 51
    invoke-direct {p3, p0, p5, p4}, La/fj3;-><init>(La/diu0;La/yje;B)V

    .line 52
    .line 53
    .line 54
    new-instance p4, La/fnq;

    .line 55
    .line 56
    const/4 p7, 0x4

    .line 57
    invoke-direct {p4, p1, p3, p7}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 58
    .line 59
    .line 60
    new-instance p1, La/jgb0;

    .line 61
    .line 62
    const/16 p3, 0x8

    .line 63
    .line 64
    invoke-direct {p1, p0, p5, p3}, La/jgb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance p3, La/dnq;

    .line 68
    .line 69
    invoke-direct {p3, p4, p1, p2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    iget-object p2, p6, La/mne;->a:La/rwj;

    .line 77
    .line 78
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p3, p1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, La/jwf0;->i:La/c4m0;

    .line 87
    .line 88
    return-void
.end method


# virtual methods
.method public final w(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, La/iwf0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/iwf0;

    .line 7
    .line 8
    iget v1, v0, La/iwf0;->m:I

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
    iput v1, v0, La/iwf0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/iwf0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/iwf0;-><init>(La/jwf0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/iwf0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/iwf0;->m:I

    .line 30
    .line 31
    iget-object v3, p0, La/jwf0;->h:La/p7m0;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    iget-object v7, p0, La/jwf0;->b:Ljava/lang/String;

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v6, :cond_3

    .line 42
    .line 43
    if-eq v2, v5, :cond_2

    .line 44
    .line 45
    if-ne v2, v4, :cond_1

    .line 46
    .line 47
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v8

    .line 57
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_9

    .line 61
    .line 62
    :cond_3
    iget-object p0, v0, La/iwf0;->j:La/mie0;

    .line 63
    .line 64
    iget-object v2, v0, La/iwf0;->i:La/mie0;

    .line 65
    .line 66
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_3

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    goto/16 :goto_6

    .line 72
    .line 73
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v2, ""

    .line 85
    .line 86
    if-eqz p1, :cond_7

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    new-instance p0, La/fwf0;

    .line 96
    .line 97
    invoke-direct {p0, v7, v2}, La/fwf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iput v4, v0, La/iwf0;->m:I

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v8, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    if-ne p0, v1, :cond_6

    .line 111
    .line 112
    goto/16 :goto_8

    .line 113
    .line 114
    :cond_6
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_7
    :goto_2
    new-instance p1, La/mie0;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v2, p1, La/mie0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    :try_start_1
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 125
    .line 126
    iget-object v2, p0, La/jwf0;->d:La/iqt;

    .line 127
    .line 128
    iget-object v2, v2, La/iqt;->a:La/gst0;

    .line 129
    .line 130
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_9

    .line 135
    .line 136
    iget-object p0, p0, La/jwf0;->c:La/pyu;

    .line 137
    .line 138
    iput-object p1, v0, La/iwf0;->i:La/mie0;

    .line 139
    .line 140
    iput-object p1, v0, La/iwf0;->j:La/mie0;

    .line 141
    .line 142
    iput v6, v0, La/iwf0;->m:I

    .line 143
    .line 144
    iget-object p0, p0, La/pyu;->a:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, La/trm0;

    .line 147
    .line 148
    invoke-virtual {p0, v0}, La/trm0;->i(La/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    if-ne p0, v1, :cond_8

    .line 153
    .line 154
    goto :goto_8

    .line 155
    :cond_8
    move-object v2, p1

    .line 156
    move-object p1, p0

    .line 157
    move-object p0, v2

    .line 158
    :goto_3
    :try_start_2
    iput-object p1, p0, La/mie0;->a:Ljava/lang/Object;

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :goto_4
    move-object v2, p1

    .line 162
    goto :goto_6

    .line 163
    :catchall_1
    move-exception p0

    .line 164
    goto :goto_4

    .line 165
    :cond_9
    move-object v2, p1

    .line 166
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    .line 170
    goto :goto_7

    .line 171
    :goto_6
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 172
    .line 173
    new-instance p1, La/g0g0;

    .line 174
    .line 175
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    move-object p0, p1

    .line 179
    :goto_7
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-eqz p0, :cond_a

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 186
    .line 187
    .line 188
    :cond_a
    new-instance p0, La/fwf0;

    .line 189
    .line 190
    iget-object p1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p1, Ljava/lang/String;

    .line 193
    .line 194
    invoke-direct {p0, v7, p1}, La/fwf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    iput-object v8, v0, La/iwf0;->i:La/mie0;

    .line 198
    .line 199
    iput-object v8, v0, La/iwf0;->j:La/mie0;

    .line 200
    .line 201
    iput v5, v0, La/iwf0;->m:I

    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v8, p0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    sget-object p1, La/wne;->a:La/wne;

    .line 212
    .line 213
    if-ne p0, v1, :cond_b

    .line 214
    .line 215
    :goto_8
    return-object v1

    .line 216
    :cond_b
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0
.end method
