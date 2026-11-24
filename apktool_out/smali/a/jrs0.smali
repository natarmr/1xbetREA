.class public final La/jrs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/da60;


# static fields
.field public static final k:[Ljava/lang/String;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "UPDATE"

    .line 2
    .line 3
    const-string v1, "DELETE"

    .line 4
    .line 5
    const-string v2, "INSERT"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/jrs0;->k:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/q0a;La/qkj;Landroid/os/Handler;)V
    .locals 2

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 219
    iput-boolean v0, p0, La/jrs0;->a:Z

    .line 220
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 221
    new-instance v0, La/mz4;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, La/mz4;-><init>(Ljava/lang/Object;B)V

    iput-object v0, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 222
    new-instance v0, La/yqc;

    const/16 v1, 0x16

    invoke-direct {v0, p0, v1}, La/yqc;-><init>(Ljava/lang/Object;B)V

    iput-object v0, p0, La/jrs0;->j:Ljava/lang/Object;

    .line 223
    invoke-static {}, La/cvm0;->q()V

    .line 224
    iput-object p1, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 225
    iput-object p2, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 226
    iput-object p3, p0, La/jrs0;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vae0;La/sje;Ljava/util/List;Landroid/content/Context;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 197
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La/jrs0;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 198
    iput-object v0, p0, La/jrs0;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 199
    iput-boolean v1, p0, La/jrs0;->a:Z

    .line 200
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 201
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 202
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    invoke-static {v3, v0, v0}, La/xf0;->H(Ljava/lang/String;Ljava/lang/String;La/y35;)La/h0a;

    move-result-object v3

    .line 204
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 205
    :cond_0
    iput-object v2, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 206
    iput-object p1, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 207
    iput-object p2, p0, La/jrs0;->g:Ljava/lang/Object;

    .line 208
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 209
    const-string p1, "camera"

    invoke-virtual {p4, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Landroid/hardware/camera2/CameraManager;

    iput-object p1, p0, La/jrs0;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/viq;)V
    .locals 3

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 212
    new-instance p1, La/pmi0;

    .line 213
    invoke-direct {p1, p0}, La/pmi0;-><init>(Ljava/lang/Object;)V

    .line 214
    iput-object p1, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 215
    invoke-static {}, La/vtt0;->u()Landroid/os/Looper;

    move-result-object p1

    .line 216
    new-instance v0, La/q9o0;

    new-instance v1, Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-direct {v0, v1}, La/q9o0;-><init>(Landroid/os/Handler;)V

    .line 217
    iput-object v0, p0, La/jrs0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/onexdatabase/OnexDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p5, p0, La/jrs0;->a:Z

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, La/xal;

    .line 21
    .line 22
    const/4 p3, 0x3

    .line 23
    invoke-direct {p1, p3}, La/xal;-><init>(B)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/jrs0;->j:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    array-length p1, p4

    .line 36
    new-array p3, p1, [Ljava/lang/String;

    .line 37
    .line 38
    :goto_0
    if-ge p2, p1, :cond_2

    .line 39
    .line 40
    aget-object p5, p4, p2

    .line 41
    .line 42
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 43
    .line 44
    invoke-virtual {p5, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v1, p5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    aget-object v2, p4, p2

    .line 67
    .line 68
    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/String;

    .line 73
    .line 74
    if-eqz v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    const/4 v0, 0x0

    .line 85
    :goto_1
    if-nez v0, :cond_1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    move-object p5, v0

    .line 89
    :goto_2
    aput-object p5, p3, p2

    .line 90
    .line 91
    add-int/lit8 p2, p2, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    iput-object p3, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object p1, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    if-eqz p2, :cond_4

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Ljava/util/Map$Entry;

    .line 119
    .line 120
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    check-cast p3, Ljava/lang/String;

    .line 125
    .line 126
    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 127
    .line 128
    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    iget-object p5, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast p5, Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    invoke-interface {p5, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p5

    .line 143
    if-eqz p5, :cond_3

    .line 144
    .line 145
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object p4, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p4, Ljava/util/LinkedHashMap;

    .line 161
    .line 162
    invoke-static {p4, p3}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p3

    .line 166
    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_4
    new-instance p1, La/be60;

    .line 171
    .line 172
    iget-object p2, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p2, [Ljava/lang/String;

    .line 175
    .line 176
    array-length p2, p2

    .line 177
    invoke-direct {p1, p2}, La/be60;-><init>(I)V

    .line 178
    .line 179
    .line 180
    iput-object p1, p0, La/jrs0;->g:Ljava/lang/Object;

    .line 181
    .line 182
    new-instance p1, La/imb;

    .line 183
    .line 184
    iget-object p2, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p2, [Ljava/lang/String;

    .line 187
    .line 188
    array-length p2, p2

    .line 189
    invoke-direct {p1, p2}, La/imb;-><init>(I)V

    .line 190
    .line 191
    .line 192
    iput-object p1, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 193
    .line 194
    return-void
.end method

.method public static c(La/mq80;JJ)La/wn00;
    .locals 6

    .line 1
    new-instance v0, La/vn00;

    .line 2
    .line 3
    iget-wide v1, p0, La/mq80;->a:J

    .line 4
    .line 5
    iget-object v3, p0, La/mq80;->b:La/mbj;

    .line 6
    .line 7
    move-wide v4, p1

    .line 8
    invoke-direct/range {v0 .. v5}, La/vn00;-><init>(JLa/mbj;J)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/mq80;->d:La/enm0;

    .line 12
    .line 13
    iget-object p1, p0, La/enm0;->c:Landroid/net/Uri;

    .line 14
    .line 15
    iput-object p1, v0, La/vn00;->f:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p1, p0, La/enm0;->d:Ljava/util/Map;

    .line 18
    .line 19
    iput-object p1, v0, La/vn00;->g:Ljava/lang/Object;

    .line 20
    .line 21
    iput-wide p3, v0, La/vn00;->c:J

    .line 22
    .line 23
    iget-wide p0, p0, La/enm0;->b:J

    .line 24
    .line 25
    iput-wide p0, v0, La/vn00;->d:J

    .line 26
    .line 27
    new-instance p0, La/wn00;

    .line 28
    .line 29
    invoke-direct {p0, v0}, La/wn00;-><init>(La/vn00;)V

    .line 30
    .line 31
    .line 32
    return-object p0
.end method


# virtual methods
.method public a(La/ca60;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/c1;

    .line 21
    .line 22
    iget-object v3, v1, La/c1;->b:La/ca60;

    .line 23
    .line 24
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v1, v2

    .line 32
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object p1, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter p1

    .line 44
    :try_start_0
    iget-boolean v0, p0, La/jrs0;->a:Z

    .line 45
    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    iget-object v0, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    const-string v0, "CameraPresenceSrc"

    .line 59
    .line 60
    const-string v1, "Last observer removed. Stopping monitoring."

    .line 61
    .line 62
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    iput-boolean v0, p0, La/jrs0;->a:Z

    .line 67
    .line 68
    const-string v1, "PipePresenceSrc"

    .line 69
    .line 70
    const-string v3, "Stopping camera ID flow collection."

    .line 71
    .line 72
    invoke-static {v1, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_3

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iget-object v0, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, La/c4m0;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 94
    .line 95
    .line 96
    :cond_4
    iput-object v2, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception p0

    .line 100
    goto :goto_2

    .line 101
    :cond_5
    :goto_1
    monitor-exit p1

    .line 102
    return-void

    .line 103
    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    throw p0
.end method

.method public b(Ljava/util/concurrent/Executor;La/ca60;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    new-instance v1, La/c1;

    .line 9
    .line 10
    invoke-direct {v1, p1, p2}, La/c1;-><init>(Ljava/util/concurrent/Executor;La/ca60;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-boolean v1, p0, La/jrs0;->a:Z

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    const-string v1, "CameraPresenceSrc"

    .line 34
    .line 35
    const-string v2, "First observer added. Starting monitoring."

    .line 36
    .line 37
    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    iput-boolean v1, p0, La/jrs0;->a:Z

    .line 42
    .line 43
    invoke-virtual {p0}, La/jrs0;->i()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    :goto_0
    iget-object v1, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object p0, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Ljava/lang/Throwable;

    .line 60
    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    new-instance v0, La/c1;

    .line 63
    .line 64
    invoke-direct {v0, p1, p2}, La/c1;-><init>(Ljava/util/concurrent/Executor;La/ca60;)V

    .line 65
    .line 66
    .line 67
    new-instance p2, La/b1;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-direct {p2, p0, v0, v1, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p0
.end method

.method public d(La/iva0;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/uqs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/uqs0;

    .line 7
    .line 8
    iget v1, v0, La/uqs0;->l:I

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
    iput v1, v0, La/uqs0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/uqs0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/uqs0;-><init>(La/jrs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/uqs0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/uqs0;->l:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    const/4 v4, 0x2

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, La/uqs0;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/util/Set;

    .line 43
    .line 44
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :cond_2
    iget-object p1, v0, La/uqs0;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/iva0;

    .line 57
    .line 58
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance p0, La/tri0;

    .line 66
    .line 67
    const/16 v1, 0x17

    .line 68
    .line 69
    invoke-direct {p0, v4, v2, v1}, La/tri0;-><init>(ILa/yje;B)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v0, La/uqs0;->i:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, v0, La/uqs0;->l:I

    .line 75
    .line 76
    const-string v1, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 77
    .line 78
    invoke-interface {p1, v1, p0, v0}, La/iva0;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, p2, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    :goto_1
    check-cast p0, Ljava/util/Set;

    .line 86
    .line 87
    move-object v1, p0

    .line 88
    check-cast v1, Ljava/util/Collection;

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_5

    .line 95
    .line 96
    iput-object p0, v0, La/uqs0;->i:Ljava/lang/Object;

    .line 97
    .line 98
    iput v4, v0, La/uqs0;->l:I

    .line 99
    .line 100
    const-string v1, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 101
    .line 102
    invoke-static {p1, v1, v0}, La/knm0;->l(La/iva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, p2, :cond_5

    .line 107
    .line 108
    :goto_2
    return-object p2

    .line 109
    :cond_5
    return-object p0
.end method

.method public e(La/qpg0;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, La/wqs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/wqs0;

    .line 7
    .line 8
    iget v1, v0, La/wqs0;->l:I

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
    iput v1, v0, La/wqs0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wqs0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/wqs0;-><init>(La/jrs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/wqs0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wqs0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    if-eqz v2, :cond_6

    .line 38
    .line 39
    if-eq v2, v8, :cond_5

    .line 40
    .line 41
    if-eq v2, v6, :cond_4

    .line 42
    .line 43
    if-eq v2, v5, :cond_3

    .line 44
    .line 45
    if-eq v2, v4, :cond_2

    .line 46
    .line 47
    if-ne v2, v3, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v7

    .line 56
    :cond_2
    :goto_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_3
    iget-object p1, v0, La/wqs0;->i:La/qpg0;

    .line 62
    .line 63
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    iget-object p1, v0, La/wqs0;->i:La/qpg0;

    .line 68
    .line 69
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    iget-object p1, v0, La/wqs0;->i:La/qpg0;

    .line 74
    .line 75
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_6
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const-string p2, "PRAGMA query_only"

    .line 83
    .line 84
    invoke-interface {p1, p2}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :try_start_0
    invoke-interface {p2}, La/xpg0;->W0()Z

    .line 89
    .line 90
    .line 91
    invoke-interface {p2}, La/xpg0;->B0()Z

    .line 92
    .line 93
    .line 94
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 95
    invoke-static {p2, v7}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    if-nez v2, :cond_c

    .line 99
    .line 100
    iput-object p1, v0, La/wqs0;->i:La/qpg0;

    .line 101
    .line 102
    iput v8, v0, La/wqs0;->l:I

    .line 103
    .line 104
    const-string p2, "PRAGMA temp_store = MEMORY"

    .line 105
    .line 106
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    if-ne p2, v1, :cond_7

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_7
    :goto_2
    iput-object p1, v0, La/wqs0;->i:La/qpg0;

    .line 114
    .line 115
    iput v6, v0, La/wqs0;->l:I

    .line 116
    .line 117
    const-string p2, "PRAGMA recursive_triggers = 1"

    .line 118
    .line 119
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    if-ne p2, v1, :cond_8

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_8
    :goto_3
    iput-object p1, v0, La/wqs0;->i:La/qpg0;

    .line 127
    .line 128
    iput v5, v0, La/wqs0;->l:I

    .line 129
    .line 130
    const-string p2, "DROP TABLE IF EXISTS room_table_modification_log"

    .line 131
    .line 132
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-ne p2, v1, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    :goto_4
    iget-boolean p2, p0, La/jrs0;->a:Z

    .line 140
    .line 141
    const-string v2, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"

    .line 142
    .line 143
    if-eqz p2, :cond_a

    .line 144
    .line 145
    iput-object v7, v0, La/wqs0;->i:La/qpg0;

    .line 146
    .line 147
    iput v4, v0, La/wqs0;->l:I

    .line 148
    .line 149
    invoke-static {p1, v2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    if-ne p1, v1, :cond_b

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_a
    const-string p2, ""

    .line 157
    .line 158
    const/4 v4, 0x0

    .line 159
    const-string v5, "TEMP"

    .line 160
    .line 161
    invoke-static {v2, v5, p2, v4}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    iput-object v7, v0, La/wqs0;->i:La/qpg0;

    .line 166
    .line 167
    iput v3, v0, La/wqs0;->l:I

    .line 168
    .line 169
    invoke-static {p1, p2}, La/j0x;->s(La/qpg0;Ljava/lang/String;)Lkotlin/Unit;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-ne p1, v1, :cond_b

    .line 174
    .line 175
    :goto_5
    return-object v1

    .line 176
    :cond_b
    :goto_6
    iget-object p0, p0, La/jrs0;->g:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast p0, La/be60;

    .line 179
    .line 180
    iget-object p1, p0, La/be60;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 183
    .line 184
    .line 185
    :try_start_1
    iput-boolean v8, p0, La/be60;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 188
    .line 189
    .line 190
    goto :goto_7

    .line 191
    :catchall_0
    move-exception p0

    .line 192
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 193
    .line 194
    .line 195
    throw p0

    .line 196
    :cond_c
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p0

    .line 199
    :catchall_1
    move-exception p0

    .line 200
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 201
    :catchall_2
    move-exception p1

    .line 202
    invoke-static {p2, p0}, La/ay3;->L(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    throw p1
.end method

.method public f()La/ig00;
    .locals 7

    .line 1
    const-string v0, "FetchData for PipeCameraPresence0"

    .line 2
    .line 3
    new-instance v1, La/tu9;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, La/msf0;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, La/tu9;->c:La/msf0;

    .line 14
    .line 15
    new-instance v2, La/wu9;

    .line 16
    .line 17
    invoke-direct {v2, v1}, La/wu9;-><init>(La/tu9;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, La/tu9;->b:La/wu9;

    .line 21
    .line 22
    const-class v3, La/hne;

    .line 23
    .line 24
    iput-object v3, v1, La/tu9;->a:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    iget-object v3, p0, La/jrs0;->g:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, La/sje;

    .line 29
    .line 30
    new-instance v4, La/s980;

    .line 31
    .line 32
    const/16 v5, 0xd

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    invoke-direct {v4, p0, v1, v6, v5}, La/s980;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x3

    .line 39
    invoke-static {v3, v6, v6, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 40
    .line 41
    .line 42
    iput-object v0, v1, La/tu9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    return-object v2

    .line 45
    :catch_0
    move-exception p0

    .line 46
    invoke-virtual {v2, p0}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 47
    .line 48
    .line 49
    return-object v2
.end method

.method public g()V
    .locals 14

    .line 1
    iget-boolean v0, p0, La/jrs0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/net/Uri;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/hru;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, La/hru;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/xaw;

    .line 27
    .line 28
    iget-boolean v2, v1, La/xaw;->k:Z

    .line 29
    .line 30
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, La/xaw;->l:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, v1, La/xaw;->c:La/rsj;

    .line 36
    .line 37
    invoke-virtual {v1}, La/rsj;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v3, "_HLS_pathway"

    .line 46
    .line 47
    const-string v4, "_HLS_throughput"

    .line 48
    .line 49
    invoke-static {v3, v2, v4, v1}, La/wcf0;->g(Ljava/io/Serializable;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;)La/wcf0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v2, Ljava/util/TreeMap;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Ljava/util/Map$Entry;

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    check-cast v2, Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v4, La/mbj;

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    const/4 v7, 0x0

    .line 107
    const-wide/16 v9, 0x0

    .line 108
    .line 109
    const-wide/16 v11, -0x1

    .line 110
    .line 111
    const/4 v13, 0x0

    .line 112
    invoke-direct/range {v4 .. v13}, La/mbj;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    .line 113
    .line 114
    .line 115
    new-instance v0, La/mq80;

    .line 116
    .line 117
    iget-object v1, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, La/viq;

    .line 120
    .line 121
    invoke-virtual {v1}, La/viq;->d()La/jbj;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v2, La/m6m0;

    .line 126
    .line 127
    const/4 v3, 0x2

    .line 128
    invoke-direct {v2, v3}, La/m6m0;-><init>(B)V

    .line 129
    .line 130
    .line 131
    const/16 v3, 0x8

    .line 132
    .line 133
    invoke-direct {v0, v1, v4, v3, v2}, La/mq80;-><init>(La/jbj;La/mbj;ILa/lq80;)V

    .line 134
    .line 135
    .line 136
    iget-object v1, p0, La/jrs0;->j:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v1, La/lhf0;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p0, La/pmi0;

    .line 146
    .line 147
    const/4 v2, 0x0

    .line 148
    invoke-virtual {v1, v0, p0, v2}, La/lhf0;->J(La/kq00;La/iq00;I)V

    .line 149
    .line 150
    .line 151
    return-void
.end method

.method public h(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

    .line 4
    .line 5
    instance-of v1, p1, La/zqs0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La/zqs0;

    .line 11
    .line 12
    iget v2, v1, La/zqs0;->l:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/zqs0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/zqs0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/zqs0;-><init>(La/jrs0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/zqs0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/zqs0;->l:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    if-ne v3, v6, :cond_1

    .line 41
    .line 42
    iget-object v0, v1, La/zqs0;->i:La/cu;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v4

    .line 57
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, v0, La/zdg0;->e:La/cu;

    .line 61
    .line 62
    invoke-virtual {p1}, La/cu;->a()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_b

    .line 67
    .line 68
    :try_start_1
    iget-object v3, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    .line 72
    invoke-virtual {v3, v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_3

    .line 77
    .line 78
    sget-object p0, La/xun;->a:La/xun;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    invoke-virtual {p1}, La/cu;->s()V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :catchall_1
    move-exception p0

    .line 85
    move-object v0, p1

    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_3
    :try_start_2
    iget-object v3, p0, La/jrs0;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 91
    .line 92
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_4

    .line 103
    .line 104
    sget-object p0, La/xun;->a:La/xun;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    invoke-virtual {p1}, La/cu;->s()V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_4
    :try_start_3
    new-instance v3, La/wbl0;

    .line 111
    .line 112
    const/16 v7, 0xd

    .line 113
    .line 114
    invoke-direct {v3, p0, v4, v7}, La/wbl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    iput-object p1, v1, La/zqs0;->i:La/cu;

    .line 118
    .line 119
    iput v6, v1, La/zqs0;->l:I

    .line 120
    .line 121
    invoke-virtual {v0, v5, v3, v1}, La/zdg0;->h(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 125
    if-ne v0, v2, :cond_5

    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_5
    move-object v9, v0

    .line 129
    move-object v0, p1

    .line 130
    move-object p1, v9

    .line 131
    :goto_1
    :try_start_4
    check-cast p1, Ljava/util/Set;

    .line 132
    .line 133
    move-object v1, p1

    .line 134
    check-cast v1, Ljava/util/Collection;

    .line 135
    .line 136
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_a

    .line 141
    .line 142
    iget-object p0, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, La/imb;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_6

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    iget-object p0, p0, La/imb;->a:La/p7m0;

    .line 157
    .line 158
    :cond_7
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    move-object v2, v1

    .line 163
    check-cast v2, [I

    .line 164
    .line 165
    array-length v3, v2

    .line 166
    new-array v4, v3, [I

    .line 167
    .line 168
    move v7, v5

    .line 169
    :goto_2
    if-ge v7, v3, :cond_9

    .line 170
    .line 171
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-interface {p1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    if-eqz v8, :cond_8

    .line 180
    .line 181
    aget v8, v2, v7

    .line 182
    .line 183
    add-int/2addr v8, v6

    .line 184
    goto :goto_3

    .line 185
    :cond_8
    aget v8, v2, v7

    .line 186
    .line 187
    :goto_3
    aput v8, v4, v7

    .line 188
    .line 189
    add-int/lit8 v7, v7, 0x1

    .line 190
    .line 191
    goto :goto_2

    .line 192
    :cond_9
    invoke-virtual {p0, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 196
    if-eqz v1, :cond_7

    .line 197
    .line 198
    :cond_a
    :goto_4
    invoke-virtual {v0}, La/cu;->s()V

    .line 199
    .line 200
    .line 201
    return-object p1

    .line 202
    :goto_5
    invoke-virtual {v0}, La/cu;->s()V

    .line 203
    .line 204
    .line 205
    throw p0

    .line 206
    :cond_b
    sget-object p0, La/xun;->a:La/xun;

    .line 207
    .line 208
    return-object p0
.end method

.method public i()V
    .locals 6

    .line 1
    iget-object v0, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "PipePresenceSrc"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string p0, "Monitoring is already active. Ignoring redundant start call."

    .line 16
    .line 17
    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const-string v0, "Starting to collect camera ID flow."

    .line 22
    .line 23
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/c4m0;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance v0, La/hie0;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-boolean v2, v0, La/hie0;->a:Z

    .line 42
    .line 43
    iget-object v3, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, La/gmq;

    .line 46
    .line 47
    new-instance v4, La/wk30;

    .line 48
    .line 49
    const/16 v5, 0x10

    .line 50
    .line 51
    invoke-direct {v4, v3, v5}, La/wk30;-><init>(La/gmq;B)V

    .line 52
    .line 53
    .line 54
    new-instance v3, La/w090;

    .line 55
    .line 56
    const/16 v5, 0x18

    .line 57
    .line 58
    invoke-direct {v3, p0, v0, v1, v5}, La/w090;-><init>(Ljava/lang/Object;Ljava/io/Serializable;La/yje;B)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/fnq;

    .line 62
    .line 63
    const/4 v5, 0x4

    .line 64
    invoke-direct {v0, v4, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/qos;

    .line 68
    .line 69
    const/16 v4, 0x1d

    .line 70
    .line 71
    invoke-direct {v3, p0, v1, v4}, La/qos;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 72
    .line 73
    .line 74
    new-instance v1, La/dnq;

    .line 75
    .line 76
    invoke-direct {v1, v0, v3, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, La/jrs0;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/sje;

    .line 82
    .line 83
    invoke-static {v1, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/jrs0;->h:Ljava/lang/Object;

    .line 88
    .line 89
    return-void
.end method

.method public j(La/fhs0;ILa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, La/crs0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/crs0;

    .line 15
    .line 16
    iget v5, v4, La/crs0;->q:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/crs0;->q:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/crs0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, La/crs0;-><init>(La/jrs0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, La/crs0;->o:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/crs0;->q:I

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    const/4 v8, 0x1

    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    if-eq v6, v8, :cond_2

    .line 44
    .line 45
    if-ne v6, v7, :cond_1

    .line 46
    .line 47
    iget v1, v4, La/crs0;->n:I

    .line 48
    .line 49
    iget v2, v4, La/crs0;->m:I

    .line 50
    .line 51
    iget v6, v4, La/crs0;->l:I

    .line 52
    .line 53
    iget-object v9, v4, La/crs0;->k:[Ljava/lang/String;

    .line 54
    .line 55
    iget-object v10, v4, La/crs0;->j:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v11, v4, La/crs0;->i:La/iva0;

    .line 58
    .line 59
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move/from16 p3, v8

    .line 63
    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    return-object v0

    .line 73
    :cond_2
    iget v1, v4, La/crs0;->l:I

    .line 74
    .line 75
    iget-object v2, v4, La/crs0;->i:La/iva0;

    .line 76
    .line 77
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v16, v2

    .line 81
    .line 82
    move v2, v1

    .line 83
    move-object/from16 v1, v16

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v6, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 92
    .line 93
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v6, ", 0)"

    .line 100
    .line 101
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    iput-object v1, v4, La/crs0;->i:La/iva0;

    .line 109
    .line 110
    iput v2, v4, La/crs0;->l:I

    .line 111
    .line 112
    iput v8, v4, La/crs0;->q:I

    .line 113
    .line 114
    invoke-static {v1, v3, v4}, La/knm0;->l(La/iva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-ne v3, v5, :cond_4

    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    :goto_1
    iget-object v3, v0, La/jrs0;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v3, [Ljava/lang/String;

    .line 124
    .line 125
    aget-object v3, v3, v2

    .line 126
    .line 127
    sget-object v6, La/jrs0;->k:[Ljava/lang/String;

    .line 128
    .line 129
    const/4 v9, 0x0

    .line 130
    const/4 v10, 0x3

    .line 131
    move-object v11, v6

    .line 132
    move v6, v2

    .line 133
    move v2, v9

    .line 134
    move-object v9, v11

    .line 135
    move-object v11, v1

    .line 136
    move v1, v10

    .line 137
    move-object v10, v3

    .line 138
    :goto_2
    if-ge v2, v1, :cond_7

    .line 139
    .line 140
    aget-object v3, v9, v2

    .line 141
    .line 142
    iget-boolean v12, v0, La/jrs0;->a:Z

    .line 143
    .line 144
    if-eqz v12, :cond_5

    .line 145
    .line 146
    const-string v12, "TEMP"

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    const-string v12, ""

    .line 150
    .line 151
    :goto_3
    const-string v13, "room_table_modification_trigger_"

    .line 152
    .line 153
    const-string v14, "_"

    .line 154
    .line 155
    invoke-static {v13, v10, v14, v3}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    const-string v14, " TRIGGER IF NOT EXISTS `"

    .line 160
    .line 161
    const-string v15, "` AFTER "

    .line 162
    .line 163
    move/from16 p3, v8

    .line 164
    .line 165
    const-string v8, "CREATE "

    .line 166
    .line 167
    invoke-static {v8, v12, v14, v13, v15}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    const-string v12, " ON `"

    .line 172
    .line 173
    const-string v13, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 174
    .line 175
    invoke-static {v8, v3, v12, v10, v13}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const-string v3, " AND invalidated = 0; END"

    .line 179
    .line 180
    invoke-static {v6, v3, v8}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    iput-object v11, v4, La/crs0;->i:La/iva0;

    .line 185
    .line 186
    iput-object v10, v4, La/crs0;->j:Ljava/lang/String;

    .line 187
    .line 188
    iput-object v9, v4, La/crs0;->k:[Ljava/lang/String;

    .line 189
    .line 190
    iput v6, v4, La/crs0;->l:I

    .line 191
    .line 192
    iput v2, v4, La/crs0;->m:I

    .line 193
    .line 194
    iput v1, v4, La/crs0;->n:I

    .line 195
    .line 196
    iput v7, v4, La/crs0;->q:I

    .line 197
    .line 198
    invoke-static {v11, v3, v4}, La/knm0;->l(La/iva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    if-ne v3, v5, :cond_6

    .line 203
    .line 204
    :goto_4
    return-object v5

    .line 205
    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 206
    .line 207
    move/from16 v8, p3

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0
.end method

.method public k(La/fhs0;ILa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, La/ers0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/ers0;

    .line 7
    .line 8
    iget v1, v0, La/ers0;->p:I

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
    iput v1, v0, La/ers0;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ers0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/ers0;-><init>(La/jrs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/ers0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ers0;->p:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p0, v0, La/ers0;->m:I

    .line 37
    .line 38
    iget p1, v0, La/ers0;->l:I

    .line 39
    .line 40
    iget-object p2, v0, La/ers0;->k:[Ljava/lang/String;

    .line 41
    .line 42
    iget-object v2, v0, La/ers0;->j:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v0, La/ers0;->i:La/iva0;

    .line 45
    .line 46
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object p3, p2

    .line 50
    move-object p2, v4

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
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/jrs0;->f:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, [Ljava/lang/String;

    .line 65
    .line 66
    aget-object p0, p0, p2

    .line 67
    .line 68
    sget-object p2, La/jrs0;->k:[Ljava/lang/String;

    .line 69
    .line 70
    const/4 p3, 0x0

    .line 71
    const/4 v2, 0x3

    .line 72
    move v7, v2

    .line 73
    move-object v2, p0

    .line 74
    move p0, v7

    .line 75
    move-object v7, p2

    .line 76
    move-object p2, p1

    .line 77
    move p1, p3

    .line 78
    move-object p3, v7

    .line 79
    :goto_1
    if-ge p1, p0, :cond_4

    .line 80
    .line 81
    aget-object v4, p3, p1

    .line 82
    .line 83
    const-string v5, "room_table_modification_trigger_"

    .line 84
    .line 85
    const-string v6, "_"

    .line 86
    .line 87
    invoke-static {v5, v2, v6, v4}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const-string v5, "DROP TRIGGER IF EXISTS `"

    .line 92
    .line 93
    const-string v6, "`"

    .line 94
    .line 95
    invoke-static {v5, v4, v6}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iput-object p2, v0, La/ers0;->i:La/iva0;

    .line 100
    .line 101
    iput-object v2, v0, La/ers0;->j:Ljava/lang/String;

    .line 102
    .line 103
    iput-object p3, v0, La/ers0;->k:[Ljava/lang/String;

    .line 104
    .line 105
    iput p1, v0, La/ers0;->l:I

    .line 106
    .line 107
    iput p0, v0, La/ers0;->m:I

    .line 108
    .line 109
    iput v3, v0, La/ers0;->p:I

    .line 110
    .line 111
    invoke-static {p2, v4, v0}, La/knm0;->l(La/iva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-ne v4, v1, :cond_3

    .line 116
    .line 117
    return-object v1

    .line 118
    :cond_3
    :goto_2
    add-int/2addr p1, v3

    .line 119
    goto :goto_1

    .line 120
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0
.end method

.method public l(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lorg/xplatform/onexdatabase/OnexDatabase_Impl;

    .line 4
    .line 5
    instance-of v1, p1, La/grs0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La/grs0;

    .line 11
    .line 12
    iget v2, v1, La/grs0;->l:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/grs0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/grs0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/grs0;-><init>(La/jrs0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/grs0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/grs0;->l:I

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
    iget-object p0, v1, La/grs0;->i:La/cu;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception p1

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
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, v0, La/zdg0;->e:La/cu;

    .line 59
    .line 60
    invoke-virtual {p1}, La/cu;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    :try_start_1
    new-instance v3, La/kv;

    .line 67
    .line 68
    const/16 v6, 0x16

    .line 69
    .line 70
    invoke-direct {v3, p0, v4, v6}, La/kv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    iput-object p1, v1, La/grs0;->i:La/cu;

    .line 74
    .line 75
    iput v5, v1, La/grs0;->l:I

    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    invoke-virtual {v0, p0, v3, v1}, La/zdg0;->h(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    if-ne p0, v2, :cond_3

    .line 83
    .line 84
    return-object v2

    .line 85
    :cond_3
    move-object p0, p1

    .line 86
    :goto_1
    invoke-virtual {p0}, La/cu;->s()V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    move-object v7, p1

    .line 92
    move-object p1, p0

    .line 93
    move-object p0, v7

    .line 94
    :goto_2
    invoke-virtual {p0}, La/cu;->s()V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0
.end method

.method public m(Ljava/lang/Throwable;Ljava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    :try_start_0
    iget-object p2, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Throwable;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p2, v2

    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto/16 :goto_7

    .line 29
    .line 30
    :cond_1
    :goto_0
    move p2, v1

    .line 31
    :goto_1
    iput-object p1, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    .line 35
    iput-object p1, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Throwable;

    .line 44
    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    iget-object p1, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {p1, p2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    move p1, v2

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    :goto_2
    move p1, v1

    .line 61
    :goto_3
    const/4 v3, 0x0

    .line 62
    iput-object v3, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object p2, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 65
    .line 66
    move-object v5, p2

    .line 67
    move p2, p1

    .line 68
    move-object p1, v5

    .line 69
    :goto_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-object v3, p0, La/jrs0;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, Ljava/lang/Throwable;

    .line 76
    .line 77
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    if-eqz p2, :cond_6

    .line 79
    .line 80
    const-string p2, "CameraPresenceSrc"

    .line 81
    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v4, "Data changed. Notifying "

    .line 85
    .line 86
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v4, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v4, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v4, " observers. Error: "

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    if-eqz v3, :cond_5

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_5
    move v1, v2

    .line 109
    :goto_5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    iget-object p0, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_6

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    check-cast p2, La/c1;

    .line 138
    .line 139
    iget-object v0, p2, La/c1;->a:Ljava/util/concurrent/Executor;

    .line 140
    .line 141
    new-instance v1, La/b1;

    .line 142
    .line 143
    invoke-direct {v1, v3, p2, p1, v2}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_6
    return-void

    .line 151
    :goto_7
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    throw p0
.end method
