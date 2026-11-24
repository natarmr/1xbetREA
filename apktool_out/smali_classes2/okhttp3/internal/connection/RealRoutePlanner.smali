.class public final Lokhttp3/internal/connection/RealRoutePlanner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/connection/RoutePlanner;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/connection/RealRoutePlanner;",
        "Lokhttp3/internal/connection/RoutePlanner;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lokhttp3/internal/concurrent/TaskRunner;

.field public final b:Lokhttp3/internal/connection/RealConnectionPool;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Z

.field public final i:Z

.field public final j:Lokhttp3/Address;

.field public final k:Lokhttp3/internal/connection/RouteDatabase;

.field public final l:Lokhttp3/internal/connection/RealCall;

.field public final m:Z

.field public n:Lokhttp3/internal/connection/RouteSelector$Selection;

.field public o:Lokhttp3/internal/connection/RouteSelector;

.field public p:Lokhttp3/Route;

.field public final q:La/xw3;


# direct methods
.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZZLokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Lokhttp3/Request;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lokhttp3/internal/connection/RealRoutePlanner;->a:Lokhttp3/internal/concurrent/TaskRunner;

    .line 11
    .line 12
    iput-object p2, p0, Lokhttp3/internal/connection/RealRoutePlanner;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 13
    .line 14
    iput p3, p0, Lokhttp3/internal/connection/RealRoutePlanner;->c:I

    .line 15
    .line 16
    iput p4, p0, Lokhttp3/internal/connection/RealRoutePlanner;->d:I

    .line 17
    .line 18
    iput p5, p0, Lokhttp3/internal/connection/RealRoutePlanner;->e:I

    .line 19
    .line 20
    iput p6, p0, Lokhttp3/internal/connection/RealRoutePlanner;->f:I

    .line 21
    .line 22
    iput p7, p0, Lokhttp3/internal/connection/RealRoutePlanner;->g:I

    .line 23
    .line 24
    iput-boolean p8, p0, Lokhttp3/internal/connection/RealRoutePlanner;->h:Z

    .line 25
    .line 26
    iput-boolean p9, p0, Lokhttp3/internal/connection/RealRoutePlanner;->i:Z

    .line 27
    .line 28
    iput-object p10, p0, Lokhttp3/internal/connection/RealRoutePlanner;->j:Lokhttp3/Address;

    .line 29
    .line 30
    iput-object p11, p0, Lokhttp3/internal/connection/RealRoutePlanner;->k:Lokhttp3/internal/connection/RouteDatabase;

    .line 31
    .line 32
    iput-object p12, p0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 33
    .line 34
    iget-object p1, p13, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 35
    .line 36
    const-string p2, "GET"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    xor-int/lit8 p1, p1, 0x1

    .line 43
    .line 44
    iput-boolean p1, p0, Lokhttp3/internal/connection/RealRoutePlanner;->m:Z

    .line 45
    .line 46
    new-instance p1, La/xw3;

    .line 47
    .line 48
    invoke-direct {p1}, La/xw3;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lokhttp3/internal/connection/RealRoutePlanner;->q:La/xw3;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/internal/connection/RealConnection;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->q:La/xw3;

    .line 2
    .line 3
    invoke-virtual {v0}, La/xw3;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->p:Lokhttp3/Route;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    if-eqz p1, :cond_5

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    iget v0, p1, Lokhttp3/internal/connection/RealConnection;->m:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p1, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p1, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;

    .line 31
    .line 32
    iget-object v0, v0, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 33
    .line 34
    iget-object v0, v0, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 35
    .line 36
    iget-object v3, p0, Lokhttp3/internal/connection/RealRoutePlanner;->j:Lokhttp3/Address;

    .line 37
    .line 38
    iget-object v3, v3, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 39
    .line 40
    invoke-static {v0, v3}, Lokhttp3/internal/_UtilJvmKt;->a(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v2, p1, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :goto_0
    monitor-exit p1

    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iput-object v2, p0, Lokhttp3/internal/connection/RealRoutePlanner;->p:Lokhttp3/Route;

    .line 53
    .line 54
    return v1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit p1

    .line 57
    throw p0

    .line 58
    :cond_5
    iget-object p1, p0, Lokhttp3/internal/connection/RealRoutePlanner;->n:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget v0, p1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 63
    .line 64
    iget-object p1, p1, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-ge v0, p1, :cond_6

    .line 71
    .line 72
    return v1

    .line 73
    :cond_6
    iget-object p0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->o:Lokhttp3/internal/connection/RouteSelector;

    .line 74
    .line 75
    if-nez p0, :cond_7

    .line 76
    .line 77
    :goto_1
    return v1

    .line 78
    :cond_7
    invoke-virtual {p0}, Lokhttp3/internal/connection/RouteSelector;->a()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0
.end method

.method public final b(Lokhttp3/HttpUrl;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->j:Lokhttp3/Address;

    .line 5
    .line 6
    iget-object p0, p0, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 7
    .line 8
    iget v0, p1, Lokhttp3/HttpUrl;->e:I

    .line 9
    .line 10
    iget v1, p0, Lokhttp3/HttpUrl;->e:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p0, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final c()Lokhttp3/internal/connection/RoutePlanner$Plan;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 4
    .line 5
    iget-object v1, v1, Lokhttp3/internal/connection/RealCall;->j:Lokhttp3/internal/connection/RealConnection;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    :goto_0
    move-object v4, v2

    .line 12
    goto :goto_3

    .line 13
    :cond_0
    iget-boolean v4, v0, Lokhttp3/internal/connection/RealRoutePlanner;->m:Z

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Lokhttp3/internal/connection/RealConnection;->h(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    monitor-enter v1

    .line 20
    iget-boolean v5, v1, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 21
    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    :try_start_0
    iput-boolean v3, v1, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 25
    .line 26
    iget-object v4, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 27
    .line 28
    invoke-virtual {v4}, Lokhttp3/internal/connection/RealCall;->g()Ljava/net/Socket;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto/16 :goto_17

    .line 35
    .line 36
    :cond_1
    if-nez v5, :cond_3

    .line 37
    .line 38
    iget-object v4, v1, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;

    .line 39
    .line 40
    iget-object v4, v4, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 41
    .line 42
    iget-object v4, v4, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Lokhttp3/internal/connection/RealRoutePlanner;->b(Lokhttp3/HttpUrl;)Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-nez v4, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v4, v2

    .line 52
    goto :goto_2

    .line 53
    :cond_3
    :goto_1
    iget-object v4, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 54
    .line 55
    invoke-virtual {v4}, Lokhttp3/internal/connection/RealCall;->g()Ljava/net/Socket;

    .line 56
    .line 57
    .line 58
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :goto_2
    monitor-exit v1

    .line 60
    iget-object v5, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 61
    .line 62
    iget-object v5, v5, Lokhttp3/internal/connection/RealCall;->j:Lokhttp3/internal/connection/RealConnection;

    .line 63
    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    if-nez v4, :cond_4

    .line 67
    .line 68
    new-instance v4, Lokhttp3/internal/connection/ReusePlan;

    .line 69
    .line 70
    invoke-direct {v4, v1}, Lokhttp3/internal/connection/ReusePlan;-><init>(Lokhttp3/internal/connection/RealConnection;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const-string v0, "Check failed."

    .line 75
    .line 76
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v2

    .line 80
    :cond_5
    if-eqz v4, :cond_6

    .line 81
    .line 82
    invoke-static {v4}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    iget-object v4, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 86
    .line 87
    iget-object v4, v4, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 88
    .line 89
    iget-object v5, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 90
    .line 91
    invoke-virtual {v4, v5, v1}, Lokhttp3/EventListener;->k(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :goto_3
    if-eqz v4, :cond_7

    .line 96
    .line 97
    return-object v4

    .line 98
    :cond_7
    invoke-virtual {v0, v2, v2}, Lokhttp3/internal/connection/RealRoutePlanner;->e(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    if-eqz v1, :cond_8

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_8
    iget-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->q:La/xw3;

    .line 106
    .line 107
    invoke-virtual {v1}, La/xw3;->isEmpty()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_9

    .line 112
    .line 113
    iget-object v0, v0, Lokhttp3/internal/connection/RealRoutePlanner;->q:La/xw3;

    .line 114
    .line 115
    invoke-virtual {v0}, La/xw3;->removeFirst()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lokhttp3/internal/connection/RoutePlanner$Plan;

    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_9
    iget-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->p:Lokhttp3/Route;

    .line 123
    .line 124
    if-eqz v1, :cond_a

    .line 125
    .line 126
    iput-object v2, v0, Lokhttp3/internal/connection/RealRoutePlanner;->p:Lokhttp3/Route;

    .line 127
    .line 128
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/connection/RealRoutePlanner;->d(Lokhttp3/Route;Ljava/util/ArrayList;)Lokhttp3/internal/connection/ConnectPlan;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    goto/16 :goto_16

    .line 133
    .line 134
    :cond_a
    iget-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->n:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 135
    .line 136
    if-eqz v1, :cond_c

    .line 137
    .line 138
    iget v4, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 139
    .line 140
    iget-object v5, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-ge v4, v5, :cond_c

    .line 147
    .line 148
    iget v3, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 149
    .line 150
    iget-object v4, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->a:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-ge v3, v5, :cond_b

    .line 157
    .line 158
    iget v3, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 159
    .line 160
    add-int/lit8 v5, v3, 0x1

    .line 161
    .line 162
    iput v5, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 163
    .line 164
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Lokhttp3/Route;

    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/connection/RealRoutePlanner;->d(Lokhttp3/Route;Ljava/util/ArrayList;)Lokhttp3/internal/connection/ConnectPlan;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    goto/16 :goto_16

    .line 175
    .line 176
    :cond_b
    invoke-static {}, La/itt0;->a()V

    .line 177
    .line 178
    .line 179
    return-object v2

    .line 180
    :cond_c
    iget-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->o:Lokhttp3/internal/connection/RouteSelector;

    .line 181
    .line 182
    if-nez v1, :cond_d

    .line 183
    .line 184
    new-instance v1, Lokhttp3/internal/connection/RouteSelector;

    .line 185
    .line 186
    iget-object v4, v0, Lokhttp3/internal/connection/RealRoutePlanner;->j:Lokhttp3/Address;

    .line 187
    .line 188
    iget-object v5, v0, Lokhttp3/internal/connection/RealRoutePlanner;->k:Lokhttp3/internal/connection/RouteDatabase;

    .line 189
    .line 190
    iget-object v6, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 191
    .line 192
    iget-boolean v7, v0, Lokhttp3/internal/connection/RealRoutePlanner;->i:Z

    .line 193
    .line 194
    invoke-direct {v1, v4, v5, v6, v7}, Lokhttp3/internal/connection/RouteSelector;-><init>(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/internal/connection/RealCall;Z)V

    .line 195
    .line 196
    .line 197
    iput-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->o:Lokhttp3/internal/connection/RouteSelector;

    .line 198
    .line 199
    :cond_d
    invoke-virtual {v1}, Lokhttp3/internal/connection/RouteSelector;->a()Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-eqz v4, :cond_38

    .line 204
    .line 205
    invoke-virtual {v1}, Lokhttp3/internal/connection/RouteSelector;->a()Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-eqz v4, :cond_37

    .line 210
    .line 211
    new-instance v4, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 214
    .line 215
    .line 216
    :cond_e
    iget v5, v1, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 217
    .line 218
    iget-object v6, v1, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 219
    .line 220
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-ge v5, v6, :cond_32

    .line 225
    .line 226
    const-string v5, "No route to "

    .line 227
    .line 228
    iget v6, v1, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 229
    .line 230
    iget-object v7, v1, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 231
    .line 232
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    if-ge v6, v7, :cond_31

    .line 237
    .line 238
    iget-object v6, v1, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 239
    .line 240
    iget v7, v1, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 241
    .line 242
    add-int/lit8 v8, v7, 0x1

    .line 243
    .line 244
    iput v8, v1, Lokhttp3/internal/connection/RouteSelector;->f:I

    .line 245
    .line 246
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    check-cast v6, Ljava/net/Proxy;

    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 257
    .line 258
    if-eq v7, v8, :cond_12

    .line 259
    .line 260
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    sget-object v8, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 265
    .line 266
    if-ne v7, v8, :cond_f

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_f
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    instance-of v8, v7, Ljava/net/InetSocketAddress;

    .line 274
    .line 275
    if-eqz v8, :cond_11

    .line 276
    .line 277
    check-cast v7, Ljava/net/InetSocketAddress;

    .line 278
    .line 279
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 280
    .line 281
    .line 282
    move-result-object v8

    .line 283
    if-nez v8, :cond_10

    .line 284
    .line 285
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v8

    .line 289
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_10
    invoke-virtual {v8}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    :goto_4
    invoke-virtual {v7}, Ljava/net/InetSocketAddress;->getPort()I

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    goto :goto_6

    .line 305
    :cond_11
    const-string v0, "Proxy.address() is not an InetSocketAddress: "

    .line 306
    .line 307
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    invoke-static {v1, v0}, La/hny;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    return-object v2

    .line 315
    :cond_12
    :goto_5
    iget-object v7, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 316
    .line 317
    iget-object v7, v7, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 318
    .line 319
    iget-object v8, v7, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 320
    .line 321
    iget v7, v7, Lokhttp3/HttpUrl;->e:I

    .line 322
    .line 323
    :goto_6
    if-gt v3, v7, :cond_30

    .line 324
    .line 325
    const/high16 v9, 0x10000

    .line 326
    .line 327
    if-ge v7, v9, :cond_30

    .line 328
    .line 329
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    sget-object v9, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 334
    .line 335
    if-ne v5, v9, :cond_13

    .line 336
    .line 337
    new-instance v5, Lokhttp3/Route;

    .line 338
    .line 339
    iget-object v9, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 340
    .line 341
    invoke-static {v8, v7}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    invoke-direct {v5, v9, v6, v7, v2}, Lokhttp3/Route;-><init>(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;La/qg9;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    goto/16 :goto_13

    .line 356
    .line 357
    :cond_13
    sget-object v5, Lokhttp3/internal/_HostnamesCommonKt;->a:Lkotlin/text/Regex;

    .line 358
    .line 359
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    sget-object v5, Lokhttp3/internal/_HostnamesCommonKt;->a:Lkotlin/text/Regex;

    .line 363
    .line 364
    invoke-virtual {v5, v8}, Lkotlin/text/Regex;->g(Ljava/lang/CharSequence;)Z

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    if-eqz v5, :cond_14

    .line 369
    .line 370
    new-instance v5, Lokhttp3/Route;

    .line 371
    .line 372
    iget-object v9, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 373
    .line 374
    new-instance v10, Ljava/net/InetSocketAddress;

    .line 375
    .line 376
    invoke-static {v8}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 377
    .line 378
    .line 379
    move-result-object v8

    .line 380
    invoke-direct {v10, v8, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 381
    .line 382
    .line 383
    invoke-direct {v5, v9, v6, v10, v2}, Lokhttp3/Route;-><init>(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;La/qg9;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    goto/16 :goto_13

    .line 391
    .line 392
    :cond_14
    iget-object v5, v1, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 393
    .line 394
    iget-object v5, v5, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 395
    .line 396
    iget-object v9, v1, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 397
    .line 398
    invoke-virtual {v5, v9, v8}, Lokhttp3/EventListener;->o(Lokhttp3/internal/connection/RealCall;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    iget-object v5, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 402
    .line 403
    iget-object v5, v5, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 404
    .line 405
    invoke-virtual {v5}, Lokhttp3/HttpUrl;->f()Z

    .line 406
    .line 407
    .line 408
    move-result v5

    .line 409
    if-nez v5, :cond_15

    .line 410
    .line 411
    const/16 v5, 0x50

    .line 412
    .line 413
    if-ne v7, v5, :cond_15

    .line 414
    .line 415
    const/4 v5, -0x1

    .line 416
    goto :goto_7

    .line 417
    :cond_15
    move v5, v7

    .line 418
    :goto_7
    new-instance v9, Lokhttp3/Dns$Request;

    .line 419
    .line 420
    invoke-direct {v9, v8, v5}, Lokhttp3/Dns$Request;-><init>(Ljava/lang/String;I)V

    .line 421
    .line 422
    .line 423
    iget-object v5, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 424
    .line 425
    iget-object v5, v5, Lokhttp3/Address;->a:Lokhttp3/Dns;

    .line 426
    .line 427
    invoke-interface {v5, v9}, Lokhttp3/Dns;->b(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    instance-of v9, v5, Lokhttp3/internal/dns/LookupDnsCall;

    .line 432
    .line 433
    const/16 v10, 0xa

    .line 434
    .line 435
    if-eqz v9, :cond_16

    .line 436
    .line 437
    iget-object v5, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 438
    .line 439
    iget-object v5, v5, Lokhttp3/Address;->a:Lokhttp3/Dns;

    .line 440
    .line 441
    invoke-interface {v5, v8}, Lokhttp3/Dns;->a(Ljava/lang/String;)Ljava/util/List;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    new-instance v9, Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-static {v5, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 448
    .line 449
    .line 450
    move-result v11

    .line 451
    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    if-eqz v11, :cond_1f

    .line 463
    .line 464
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    check-cast v11, Ljava/net/InetAddress;

    .line 469
    .line 470
    new-instance v12, Lokhttp3/Route;

    .line 471
    .line 472
    iget-object v13, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 473
    .line 474
    new-instance v14, Ljava/net/InetSocketAddress;

    .line 475
    .line 476
    invoke-direct {v14, v11, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 477
    .line 478
    .line 479
    invoke-direct {v12, v13, v6, v14, v2}, Lokhttp3/Route;-><init>(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;La/qg9;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    goto :goto_8

    .line 486
    :cond_16
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 490
    .line 491
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 492
    .line 493
    .line 494
    new-instance v11, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;

    .line 495
    .line 496
    invoke-direct {v11, v5, v9}, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;-><init>(Lokhttp3/Dns$Call;Ljava/util/concurrent/LinkedBlockingQueue;)V

    .line 497
    .line 498
    .line 499
    invoke-interface {v5, v11}, Lokhttp3/Dns$Call;->a(Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v9}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    check-cast v5, La/j0g0;

    .line 510
    .line 511
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 512
    .line 513
    invoke-static {v5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    check-cast v5, Ljava/util/List;

    .line 517
    .line 518
    new-instance v9, Ljava/util/ArrayList;

    .line 519
    .line 520
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 521
    .line 522
    .line 523
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v11

    .line 527
    :cond_17
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v12

    .line 531
    if-eqz v12, :cond_18

    .line 532
    .line 533
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v12

    .line 537
    instance-of v13, v12, Lokhttp3/Dns$Record$ServiceMetadata;

    .line 538
    .line 539
    if-eqz v13, :cond_17

    .line 540
    .line 541
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :cond_18
    invoke-static {v9, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    invoke-static {v11}, La/wp20;->a(I)I

    .line 550
    .line 551
    .line 552
    move-result v11

    .line 553
    const/16 v12, 0x10

    .line 554
    .line 555
    if-ge v11, v12, :cond_19

    .line 556
    .line 557
    move v11, v12

    .line 558
    :cond_19
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 559
    .line 560
    invoke-direct {v12, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 564
    .line 565
    .line 566
    move-result-object v9

    .line 567
    :goto_a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 568
    .line 569
    .line 570
    move-result v11

    .line 571
    if-eqz v11, :cond_1a

    .line 572
    .line 573
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v11

    .line 577
    move-object v13, v11

    .line 578
    check-cast v13, Lokhttp3/Dns$Record$ServiceMetadata;

    .line 579
    .line 580
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-interface {v12, v2, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    goto :goto_a

    .line 587
    :cond_1a
    new-instance v9, Ljava/util/ArrayList;

    .line 588
    .line 589
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 590
    .line 591
    .line 592
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    :cond_1b
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 597
    .line 598
    .line 599
    move-result v11

    .line 600
    if-eqz v11, :cond_1c

    .line 601
    .line 602
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    instance-of v13, v11, Lokhttp3/Dns$Record$IpAddress;

    .line 607
    .line 608
    if-eqz v13, :cond_1b

    .line 609
    .line 610
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    goto :goto_b

    .line 614
    :cond_1c
    new-instance v5, Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-static {v9, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 617
    .line 618
    .line 619
    move-result v11

    .line 620
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v9

    .line 627
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    if-eqz v11, :cond_1e

    .line 632
    .line 633
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v11

    .line 637
    check-cast v11, Lokhttp3/Dns$Record$IpAddress;

    .line 638
    .line 639
    iget-object v13, v11, Lokhttp3/Dns$Record$IpAddress;->b:Ljava/lang/String;

    .line 640
    .line 641
    invoke-virtual {v12, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v13

    .line 645
    check-cast v13, Lokhttp3/Dns$Record$ServiceMetadata;

    .line 646
    .line 647
    new-instance v13, Lokhttp3/Route;

    .line 648
    .line 649
    iget-object v14, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 650
    .line 651
    new-instance v15, Ljava/net/InetSocketAddress;

    .line 652
    .line 653
    iget-object v11, v11, Lokhttp3/Dns$Record$IpAddress;->a:Ljava/net/InetAddress;

    .line 654
    .line 655
    invoke-direct {v15, v11, v7}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 659
    .line 660
    .line 661
    move-result-object v11

    .line 662
    if-nez v11, :cond_1d

    .line 663
    .line 664
    goto :goto_d

    .line 665
    :cond_1d
    sget-object v16, Lokhttp3/internal/connection/RouteSelector$WhenMappings;->a:[I

    .line 666
    .line 667
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 668
    .line 669
    .line 670
    move-result v11

    .line 671
    aget v11, v16, v11

    .line 672
    .line 673
    :goto_d
    invoke-direct {v13, v14, v6, v15, v2}, Lokhttp3/Route;-><init>(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;La/qg9;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    goto :goto_c

    .line 680
    :cond_1e
    move-object v9, v5

    .line 681
    :cond_1f
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    if-nez v5, :cond_2f

    .line 686
    .line 687
    iget-object v5, v1, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 688
    .line 689
    iget-object v5, v5, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 690
    .line 691
    iget-object v6, v1, Lokhttp3/internal/connection/RouteSelector;->c:Lokhttp3/internal/connection/RealCall;

    .line 692
    .line 693
    new-instance v7, Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-static {v9, v10}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 696
    .line 697
    .line 698
    move-result v10

    .line 699
    invoke-direct {v7, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 700
    .line 701
    .line 702
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 703
    .line 704
    .line 705
    move-result-object v10

    .line 706
    :goto_e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 707
    .line 708
    .line 709
    move-result v11

    .line 710
    if-eqz v11, :cond_20

    .line 711
    .line 712
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v11

    .line 716
    check-cast v11, Lokhttp3/Route;

    .line 717
    .line 718
    iget-object v11, v11, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 719
    .line 720
    invoke-virtual {v11}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 721
    .line 722
    .line 723
    move-result-object v11

    .line 724
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    goto :goto_e

    .line 728
    :cond_20
    invoke-virtual {v5, v6, v8, v7}, Lokhttp3/EventListener;->n(Lokhttp3/internal/connection/RealCall;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 729
    .line 730
    .line 731
    new-instance v5, Ljava/util/ArrayList;

    .line 732
    .line 733
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 734
    .line 735
    .line 736
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    :cond_21
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 741
    .line 742
    .line 743
    move-result v7

    .line 744
    if-eqz v7, :cond_22

    .line 745
    .line 746
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v7

    .line 750
    move-object v8, v7

    .line 751
    check-cast v8, Lokhttp3/Route;

    .line 752
    .line 753
    iget-object v8, v8, Lokhttp3/Route;->d:La/qg9;

    .line 754
    .line 755
    if-eqz v8, :cond_21

    .line 756
    .line 757
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 758
    .line 759
    .line 760
    goto :goto_f

    .line 761
    :cond_22
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 762
    .line 763
    .line 764
    move-result v6

    .line 765
    if-eqz v6, :cond_23

    .line 766
    .line 767
    move-object v5, v9

    .line 768
    :cond_23
    iget-boolean v6, v1, Lokhttp3/internal/connection/RouteSelector;->d:Z

    .line 769
    .line 770
    if-eqz v6, :cond_2c

    .line 771
    .line 772
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    const/4 v7, 0x2

    .line 777
    if-ge v6, v7, :cond_24

    .line 778
    .line 779
    goto/16 :goto_13

    .line 780
    .line 781
    :cond_24
    new-instance v6, Ljava/util/ArrayList;

    .line 782
    .line 783
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 784
    .line 785
    .line 786
    new-instance v7, Ljava/util/ArrayList;

    .line 787
    .line 788
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 789
    .line 790
    .line 791
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 796
    .line 797
    .line 798
    move-result v9

    .line 799
    if-eqz v9, :cond_26

    .line 800
    .line 801
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v9

    .line 805
    move-object v10, v9

    .line 806
    check-cast v10, Lokhttp3/Route;

    .line 807
    .line 808
    iget-object v10, v10, Lokhttp3/Route;->c:Ljava/net/InetSocketAddress;

    .line 809
    .line 810
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 811
    .line 812
    .line 813
    move-result-object v10

    .line 814
    instance-of v10, v10, Ljava/net/Inet6Address;

    .line 815
    .line 816
    if-eqz v10, :cond_25

    .line 817
    .line 818
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    goto :goto_10

    .line 822
    :cond_25
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 823
    .line 824
    .line 825
    goto :goto_10

    .line 826
    :cond_26
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 827
    .line 828
    .line 829
    move-result v8

    .line 830
    if-nez v8, :cond_2c

    .line 831
    .line 832
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 833
    .line 834
    .line 835
    move-result v8

    .line 836
    if-eqz v8, :cond_27

    .line 837
    .line 838
    goto :goto_13

    .line 839
    :cond_27
    sget-object v5, Lokhttp3/internal/_UtilCommonKt;->a:[B

    .line 840
    .line 841
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 842
    .line 843
    .line 844
    move-result-object v6

    .line 845
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 846
    .line 847
    .line 848
    move-result-object v7

    .line 849
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 850
    .line 851
    .line 852
    move-result-object v8

    .line 853
    :cond_28
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 854
    .line 855
    .line 856
    move-result v5

    .line 857
    if-nez v5, :cond_2a

    .line 858
    .line 859
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 860
    .line 861
    .line 862
    move-result v5

    .line 863
    if-eqz v5, :cond_29

    .line 864
    .line 865
    goto :goto_12

    .line 866
    :cond_29
    invoke-static {v8}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 867
    .line 868
    .line 869
    move-result-object v5

    .line 870
    goto :goto_13

    .line 871
    :cond_2a
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 872
    .line 873
    .line 874
    move-result v5

    .line 875
    if-eqz v5, :cond_2b

    .line 876
    .line 877
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v5

    .line 881
    invoke-virtual {v8, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    :cond_2b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 885
    .line 886
    .line 887
    move-result v5

    .line 888
    if-eqz v5, :cond_28

    .line 889
    .line 890
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v5

    .line 894
    invoke-virtual {v8, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 895
    .line 896
    .line 897
    goto :goto_11

    .line 898
    :cond_2c
    :goto_13
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 899
    .line 900
    .line 901
    move-result-object v5

    .line 902
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 903
    .line 904
    .line 905
    move-result v6

    .line 906
    if-eqz v6, :cond_2e

    .line 907
    .line 908
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    check-cast v6, Lokhttp3/Route;

    .line 913
    .line 914
    iget-object v7, v1, Lokhttp3/internal/connection/RouteSelector;->b:Lokhttp3/internal/connection/RouteDatabase;

    .line 915
    .line 916
    monitor-enter v7

    .line 917
    :try_start_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    iget-object v8, v7, Lokhttp3/internal/connection/RouteDatabase;->a:Ljava/util/LinkedHashSet;

    .line 921
    .line 922
    invoke-interface {v8, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 926
    monitor-exit v7

    .line 927
    if-eqz v8, :cond_2d

    .line 928
    .line 929
    iget-object v7, v1, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/ArrayList;

    .line 930
    .line 931
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    goto :goto_14

    .line 935
    :cond_2d
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 936
    .line 937
    .line 938
    goto :goto_14

    .line 939
    :catchall_1
    move-exception v0

    .line 940
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 941
    throw v0

    .line 942
    :cond_2e
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 943
    .line 944
    .line 945
    move-result v5

    .line 946
    if-nez v5, :cond_e

    .line 947
    .line 948
    goto :goto_15

    .line 949
    :cond_2f
    new-instance v0, Ljava/net/UnknownHostException;

    .line 950
    .line 951
    iget-object v1, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 952
    .line 953
    iget-object v1, v1, Lokhttp3/Address;->a:Lokhttp3/Dns;

    .line 954
    .line 955
    new-instance v2, Ljava/lang/StringBuilder;

    .line 956
    .line 957
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 961
    .line 962
    .line 963
    const-string v1, " returned no addresses for "

    .line 964
    .line 965
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 969
    .line 970
    .line 971
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    throw v0

    .line 979
    :cond_30
    new-instance v0, Ljava/net/SocketException;

    .line 980
    .line 981
    new-instance v1, Ljava/lang/StringBuilder;

    .line 982
    .line 983
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 987
    .line 988
    .line 989
    const/16 v2, 0x3a

    .line 990
    .line 991
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 995
    .line 996
    .line 997
    const-string v2, "; port is out of range"

    .line 998
    .line 999
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    throw v0

    .line 1010
    :cond_31
    new-instance v0, Ljava/net/SocketException;

    .line 1011
    .line 1012
    iget-object v2, v1, Lokhttp3/internal/connection/RouteSelector;->a:Lokhttp3/Address;

    .line 1013
    .line 1014
    iget-object v2, v2, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 1015
    .line 1016
    iget-object v2, v2, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 1017
    .line 1018
    const-string v3, "; exhausted proxy configurations: "

    .line 1019
    .line 1020
    iget-object v1, v1, Lokhttp3/internal/connection/RouteSelector;->e:Ljava/util/List;

    .line 1021
    .line 1022
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    invoke-direct {v0, v1}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    throw v0

    .line 1044
    :cond_32
    :goto_15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1045
    .line 1046
    .line 1047
    move-result v3

    .line 1048
    if-eqz v3, :cond_33

    .line 1049
    .line 1050
    iget-object v3, v1, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/ArrayList;

    .line 1051
    .line 1052
    invoke-static {v4, v3}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1053
    .line 1054
    .line 1055
    iget-object v1, v1, Lokhttp3/internal/connection/RouteSelector;->g:Ljava/util/ArrayList;

    .line 1056
    .line 1057
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1058
    .line 1059
    .line 1060
    :cond_33
    new-instance v1, Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 1061
    .line 1062
    invoke-direct {v1, v4}, Lokhttp3/internal/connection/RouteSelector$Selection;-><init>(Ljava/util/ArrayList;)V

    .line 1063
    .line 1064
    .line 1065
    iput-object v1, v0, Lokhttp3/internal/connection/RealRoutePlanner;->n:Lokhttp3/internal/connection/RouteSelector$Selection;

    .line 1066
    .line 1067
    iget-object v3, v0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 1068
    .line 1069
    iget-boolean v3, v3, Lokhttp3/internal/connection/RealCall;->r:Z

    .line 1070
    .line 1071
    if-nez v3, :cond_36

    .line 1072
    .line 1073
    iget v3, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 1074
    .line 1075
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1076
    .line 1077
    .line 1078
    move-result v5

    .line 1079
    if-ge v3, v5, :cond_35

    .line 1080
    .line 1081
    iget v2, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 1082
    .line 1083
    add-int/lit8 v3, v2, 0x1

    .line 1084
    .line 1085
    iput v3, v1, Lokhttp3/internal/connection/RouteSelector$Selection;->b:I

    .line 1086
    .line 1087
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    check-cast v1, Lokhttp3/Route;

    .line 1092
    .line 1093
    invoke-virtual {v0, v1, v4}, Lokhttp3/internal/connection/RealRoutePlanner;->d(Lokhttp3/Route;Ljava/util/ArrayList;)Lokhttp3/internal/connection/ConnectPlan;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    :goto_16
    iget-object v2, v1, Lokhttp3/internal/connection/ConnectPlan;->l:Ljava/util/List;

    .line 1098
    .line 1099
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/connection/RealRoutePlanner;->e(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    if-eqz v0, :cond_34

    .line 1104
    .line 1105
    return-object v0

    .line 1106
    :cond_34
    return-object v1

    .line 1107
    :cond_35
    invoke-static {}, La/itt0;->a()V

    .line 1108
    .line 1109
    .line 1110
    return-object v2

    .line 1111
    :cond_36
    const-string v0, "Canceled"

    .line 1112
    .line 1113
    invoke-static {v0}, La/ohq;->l(Ljava/lang/String;)V

    .line 1114
    .line 1115
    .line 1116
    return-object v2

    .line 1117
    :cond_37
    invoke-static {}, La/itt0;->a()V

    .line 1118
    .line 1119
    .line 1120
    return-object v2

    .line 1121
    :cond_38
    const-string v0, "exhausted all routes"

    .line 1122
    .line 1123
    invoke-static {v0}, La/ohq;->l(Ljava/lang/String;)V

    .line 1124
    .line 1125
    .line 1126
    return-object v2

    .line 1127
    :goto_17
    monitor-exit v1

    .line 1128
    throw v0
.end method

.method public final d(Lokhttp3/Route;Ljava/util/ArrayList;)Lokhttp3/internal/connection/ConnectPlan;
    .locals 18

    .line 1
    move-object/from16 v10, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, v11, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 9
    .line 10
    iget-object v1, v0, Lokhttp3/Address;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 11
    .line 12
    if-nez v1, :cond_2

    .line 13
    .line 14
    iget-object v0, v0, Lokhttp3/Address;->k:Ljava/util/List;

    .line 15
    .line 16
    sget-object v1, Lokhttp3/ConnectionSpec;->h:Lokhttp3/ConnectionSpec;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v11, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 25
    .line 26
    iget-object v0, v0, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 27
    .line 28
    iget-object v0, v0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 31
    .line 32
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lokhttp3/internal/platform/Platform;->j(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance v1, Ljava/net/UnknownServiceException;

    .line 42
    .line 43
    const-string v2, "CLEARTEXT communication to "

    .line 44
    .line 45
    const-string v3, " not permitted by network security policy"

    .line 46
    .line 47
    invoke-static {v2, v0, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {v1, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 56
    .line 57
    const-string v1, "CLEARTEXT communication not enabled for client"

    .line 58
    .line 59
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_2
    iget-object v0, v0, Lokhttp3/Address;->j:Ljava/util/List;

    .line 64
    .line 65
    sget-object v1, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 66
    .line 67
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_7

    .line 72
    .line 73
    :goto_0
    iget-object v0, v11, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 80
    .line 81
    const/4 v2, 0x0

    .line 82
    if-eq v0, v1, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    iget-object v0, v11, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 86
    .line 87
    iget-object v1, v0, Lokhttp3/Address;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 88
    .line 89
    if-nez v1, :cond_5

    .line 90
    .line 91
    iget-object v0, v0, Lokhttp3/Address;->j:Ljava/util/List;

    .line 92
    .line 93
    sget-object v1, Lokhttp3/Protocol;->g:Lokhttp3/Protocol;

    .line 94
    .line 95
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    :goto_1
    move-object v14, v2

    .line 103
    goto :goto_3

    .line 104
    :cond_5
    :goto_2
    new-instance v0, Lokhttp3/Request$Builder;

    .line 105
    .line 106
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 107
    .line 108
    .line 109
    iget-object v1, v11, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 110
    .line 111
    iget-object v1, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 112
    .line 113
    iput-object v1, v0, Lokhttp3/Request$Builder;->a:Lokhttp3/HttpUrl;

    .line 114
    .line 115
    const-string v1, "CONNECT"

    .line 116
    .line 117
    invoke-virtual {v0, v1, v2}, Lokhttp3/Request$Builder;->b(Ljava/lang/String;Lokhttp3/RequestBody;)V

    .line 118
    .line 119
    .line 120
    iget-object v1, v11, Lokhttp3/Route;->a:Lokhttp3/Address;

    .line 121
    .line 122
    iget-object v2, v1, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 123
    .line 124
    const/4 v3, 0x1

    .line 125
    invoke-static {v2, v3}, Lokhttp3/internal/_UtilJvmKt;->i(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const-string v3, "Host"

    .line 130
    .line 131
    invoke-virtual {v0, v3, v2}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v2, "Proxy-Connection"

    .line 135
    .line 136
    const-string v3, "Keep-Alive"

    .line 137
    .line 138
    invoke-virtual {v0, v2, v3}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-string v2, "User-Agent"

    .line 142
    .line 143
    const-string v3, "okhttp/5.5.1"

    .line 144
    .line 145
    invoke-virtual {v0, v2, v3}, Lokhttp3/Request$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    new-instance v2, Lokhttp3/Request;

    .line 149
    .line 150
    invoke-direct {v2, v0}, Lokhttp3/Request;-><init>(Lokhttp3/Request$Builder;)V

    .line 151
    .line 152
    .line 153
    new-instance v0, Lokhttp3/Response$Builder;

    .line 154
    .line 155
    invoke-direct {v0}, Lokhttp3/Response$Builder;-><init>()V

    .line 156
    .line 157
    .line 158
    iput-object v2, v0, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 159
    .line 160
    sget-object v3, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 161
    .line 162
    iput-object v3, v0, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 163
    .line 164
    const/16 v3, 0x197

    .line 165
    .line 166
    iput v3, v0, Lokhttp3/Response$Builder;->c:I

    .line 167
    .line 168
    const-string v3, "Preemptive Authenticate"

    .line 169
    .line 170
    iput-object v3, v0, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 171
    .line 172
    const-wide/16 v3, -0x1

    .line 173
    .line 174
    iput-wide v3, v0, Lokhttp3/Response$Builder;->l:J

    .line 175
    .line 176
    iput-wide v3, v0, Lokhttp3/Response$Builder;->m:J

    .line 177
    .line 178
    const-string v3, "OkHttp-Preemptive"

    .line 179
    .line 180
    iget-object v4, v0, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 181
    .line 182
    const-string v5, "Proxy-Authenticate"

    .line 183
    .line 184
    invoke-virtual {v4, v5, v3}, Lokhttp3/Headers$Builder;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    iget-object v1, v1, Lokhttp3/Address;->f:Lokhttp3/Authenticator;

    .line 192
    .line 193
    invoke-interface {v1, v11, v0}, Lokhttp3/Authenticator;->d(Lokhttp3/Route;Lokhttp3/Response;)Lokhttp3/Request;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-nez v0, :cond_6

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_6
    move-object v2, v0

    .line 201
    goto :goto_1

    .line 202
    :goto_3
    new-instance v0, Lokhttp3/internal/connection/ConnectPlan;

    .line 203
    .line 204
    iget-object v1, v10, Lokhttp3/internal/connection/RealRoutePlanner;->a:Lokhttp3/internal/concurrent/TaskRunner;

    .line 205
    .line 206
    iget-object v2, v10, Lokhttp3/internal/connection/RealRoutePlanner;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 207
    .line 208
    iget v3, v10, Lokhttp3/internal/connection/RealRoutePlanner;->c:I

    .line 209
    .line 210
    iget v4, v10, Lokhttp3/internal/connection/RealRoutePlanner;->d:I

    .line 211
    .line 212
    iget v5, v10, Lokhttp3/internal/connection/RealRoutePlanner;->e:I

    .line 213
    .line 214
    iget v6, v10, Lokhttp3/internal/connection/RealRoutePlanner;->f:I

    .line 215
    .line 216
    iget v7, v10, Lokhttp3/internal/connection/RealRoutePlanner;->g:I

    .line 217
    .line 218
    iget-boolean v8, v10, Lokhttp3/internal/connection/RealRoutePlanner;->h:Z

    .line 219
    .line 220
    iget-object v9, v10, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 221
    .line 222
    const/4 v15, -0x1

    .line 223
    const/16 v16, 0x0

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    move-object/from16 v12, p2

    .line 229
    .line 230
    invoke-direct/range {v0 .. v17}, Lokhttp3/internal/connection/ConnectPlan;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/internal/connection/RealConnectionPool;IIIIIZLokhttp3/internal/connection/RealCall;Lokhttp3/internal/connection/RealRoutePlanner;Lokhttp3/Route;Ljava/util/List;ILokhttp3/Request;IZLokhttp3/internal/ech/EchRetryPlan;)V

    .line 231
    .line 232
    .line 233
    return-object v0

    .line 234
    :cond_7
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 235
    .line 236
    const-string v1, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 237
    .line 238
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw v0
.end method

.method public final e(Lokhttp3/internal/connection/ConnectPlan;Ljava/util/List;)Lokhttp3/internal/connection/ReusePlan;
    .locals 10

    .line 1
    iget-object v0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->b:Lokhttp3/internal/connection/RealConnectionPool;

    .line 2
    .line 3
    iget-boolean v1, p0, Lokhttp3/internal/connection/RealRoutePlanner;->m:Z

    .line 4
    .line 5
    iget-object v2, p0, Lokhttp3/internal/connection/RealRoutePlanner;->j:Lokhttp3/Address;

    .line 6
    .line 7
    iget-object v3, p0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lokhttp3/internal/connection/ConnectPlan;->isReady()Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    move v6, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v6, v4

    .line 22
    :goto_0
    iget-object v0, v0, Lokhttp3/internal/connection/RealConnectionPool;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 v8, 0x0

    .line 36
    if-eqz v7, :cond_6

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lokhttp3/internal/connection/RealConnection;

    .line 43
    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    monitor-enter v7

    .line 48
    if-eqz v6, :cond_3

    .line 49
    .line 50
    :try_start_0
    iget-object v9, v7, Lokhttp3/internal/connection/RealConnection;->j:Lokhttp3/internal/http2/Http2Connection;

    .line 51
    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    move v9, v5

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v9, v4

    .line 57
    :goto_2
    if-nez v9, :cond_3

    .line 58
    .line 59
    :goto_3
    move v9, v4

    .line 60
    goto :goto_4

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto :goto_5

    .line 63
    :cond_3
    invoke-virtual {v7, v2, p2}, Lokhttp3/internal/connection/RealConnection;->g(Lokhttp3/Address;Ljava/util/List;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-nez v9, :cond_4

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    invoke-virtual {v3, v7}, Lokhttp3/internal/connection/RealCall;->a(Lokhttp3/internal/connection/RealConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    move v9, v5

    .line 74
    :goto_4
    monitor-exit v7

    .line 75
    if-eqz v9, :cond_1

    .line 76
    .line 77
    invoke-virtual {v7, v1}, Lokhttp3/internal/connection/RealConnection;->h(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_5

    .line 82
    .line 83
    goto :goto_6

    .line 84
    :cond_5
    monitor-enter v7

    .line 85
    :try_start_1
    iput-boolean v5, v7, Lokhttp3/internal/connection/RealConnection;->k:Z

    .line 86
    .line 87
    invoke-virtual {v3}, Lokhttp3/internal/connection/RealCall;->g()Ljava/net/Socket;

    .line 88
    .line 89
    .line 90
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    monitor-exit v7

    .line 92
    if-eqz v8, :cond_1

    .line 93
    .line 94
    invoke-static {v8}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_1
    move-exception p0

    .line 99
    monitor-exit v7

    .line 100
    throw p0

    .line 101
    :goto_5
    monitor-exit v7

    .line 102
    throw p0

    .line 103
    :cond_6
    move-object v7, v8

    .line 104
    :goto_6
    if-nez v7, :cond_7

    .line 105
    .line 106
    return-object v8

    .line 107
    :cond_7
    if-eqz p1, :cond_8

    .line 108
    .line 109
    iget-object p2, p1, Lokhttp3/internal/connection/ConnectPlan;->k:Lokhttp3/Route;

    .line 110
    .line 111
    iput-object p2, p0, Lokhttp3/internal/connection/RealRoutePlanner;->p:Lokhttp3/Route;

    .line 112
    .line 113
    iget-object p1, p1, Lokhttp3/internal/connection/ConnectPlan;->t:Ljava/net/Socket;

    .line 114
    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    invoke-static {p1}, Lokhttp3/internal/_UtilJvmKt;->c(Ljava/net/Socket;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    iget-object p1, p0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 121
    .line 122
    iget-object p1, p1, Lokhttp3/internal/connection/RealCall;->e:Lokhttp3/EventListener;

    .line 123
    .line 124
    iget-object p0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->l:Lokhttp3/internal/connection/RealCall;

    .line 125
    .line 126
    invoke-virtual {p1, p0, v7}, Lokhttp3/EventListener;->j(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, Lokhttp3/internal/connection/ReusePlan;

    .line 130
    .line 131
    invoke-direct {p0, v7}, Lokhttp3/internal/connection/ReusePlan;-><init>(Lokhttp3/internal/connection/RealConnection;)V

    .line 132
    .line 133
    .line 134
    return-object p0
.end method

.method public final getAddress()Lokhttp3/Address;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/connection/RealRoutePlanner;->j:Lokhttp3/Address;

    .line 2
    .line 3
    return-object p0
.end method
