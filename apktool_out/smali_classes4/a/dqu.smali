.class public final La/dqu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bqu;


# instance fields
.field public final a:La/img;


# direct methods
.method public constructor <init>(La/img;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dqu;->a:La/img;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(ILa/zje;Ljava/util/List;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/dqu;->a:La/img;

    .line 2
    .line 3
    iget-object v1, v0, La/img;->b:La/laj;

    .line 4
    .line 5
    instance-of v2, p2, La/cqu;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p2

    .line 10
    check-cast v2, La/cqu;

    .line 11
    .line 12
    iget v3, v2, La/cqu;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/cqu;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/cqu;

    .line 25
    .line 26
    invoke-direct {v2, p0, p2}, La/cqu;-><init>(La/dqu;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v2, La/cqu;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v2, La/cqu;->l:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    iget-object p3, v2, La/cqu;->i:Ljava/util/List;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :try_start_1
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 59
    .line 60
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 61
    .line 62
    iput-object p3, v2, La/cqu;->i:Ljava/util/List;

    .line 63
    .line 64
    iput v5, v2, La/cqu;->l:I

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-virtual {v0, p0, p1, v3, v2}, La/img;->a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;IZLa/zje;)Ljava/io/Serializable;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, p2, :cond_3

    .line 72
    .line 73
    return-object p2

    .line 74
    :cond_3
    :goto_1
    check-cast p0, Ljava/util/List;

    .line 75
    .line 76
    sget-object p1, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :goto_2
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 80
    .line 81
    new-instance p1, La/g0g0;

    .line 82
    .line 83
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object p0, p1

    .line 87
    :goto_3
    nop

    .line 88
    instance-of p1, p0, La/g0g0;

    .line 89
    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    move-object p1, p0

    .line 93
    check-cast p1, Ljava/util/List;

    .line 94
    .line 95
    sget-object p2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v0, v1, La/laj;->a:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-nez v2, :cond_4

    .line 110
    .line 111
    new-instance v2, La/or30;

    .line 112
    .line 113
    invoke-direct {v2}, La/or30;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {v0, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_4
    check-cast v2, La/or30;

    .line 120
    .line 121
    invoke-virtual {v2, p1}, La/or30;->d(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-nez p1, :cond_6

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    sget-object p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    iget-object p1, v1, La/laj;->a:Ljava/util/LinkedHashMap;

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    if-nez p2, :cond_7

    .line 143
    .line 144
    new-instance p2, La/or30;

    .line 145
    .line 146
    invoke-direct {p2}, La/or30;-><init>()V

    .line 147
    .line 148
    .line 149
    invoke-interface {p1, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_7
    check-cast p2, La/or30;

    .line 153
    .line 154
    const-wide p0, 0x7fffffffffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, p0, p1}, La/or30;->c(J)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    check-cast p0, Ljava/util/List;

    .line 164
    .line 165
    :goto_4
    check-cast p0, Ljava/util/List;

    .line 166
    .line 167
    new-instance p1, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    :cond_8
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_9

    .line 181
    .line 182
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    move-object v0, p2

    .line 187
    check-cast v0, La/cmg;

    .line 188
    .line 189
    iget-wide v0, v0, La/cmg;->a:J

    .line 190
    .line 191
    invoke-static {v0, v1, p3}, La/axq;->y(JLjava/util/List;)Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-nez v0, :cond_8

    .line 196
    .line 197
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    sget-object p0, La/f1e0;->a:La/e1e0;

    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 207
    .line 208
    .line 209
    move-result p0

    .line 210
    if-eqz p0, :cond_a

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    sget-object p2, La/f1e0;->b:La/k4;

    .line 218
    .line 219
    invoke-virtual {p2, p0}, La/k4;->f(I)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->Q(Ljava/lang/Iterable;I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    :goto_6
    return-object v4
.end method
