.class public final La/krs0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final l:[Ljava/lang/String;


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

.field public k:Ljava/lang/Object;


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
    sput-object v0, La/krs0;->l:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/gne;La/m24;Landroid/media/AudioDeviceInfo;)V
    .locals 1

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 214
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 215
    iput-object p1, p0, La/krs0;->b:Ljava/lang/Object;

    .line 216
    iput-object p2, p0, La/krs0;->c:Ljava/lang/Object;

    .line 217
    iput-object p3, p0, La/krs0;->k:Ljava/lang/Object;

    .line 218
    iput-object p4, p0, La/krs0;->j:Ljava/lang/Object;

    .line 219
    invoke-static {}, La/vtt0;->u()Landroid/os/Looper;

    move-result-object p2

    .line 220
    new-instance p3, Landroid/os/Handler;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 221
    iput-object p3, p0, La/krs0;->d:Ljava/lang/Object;

    .line 222
    new-instance p2, La/r24;

    .line 223
    invoke-direct {p2, p0}, La/r24;-><init>(La/krs0;)V

    .line 224
    iput-object p2, p0, La/krs0;->e:Ljava/lang/Object;

    .line 225
    new-instance p2, La/md3;

    const/4 v0, 0x1

    .line 226
    invoke-direct {p2, p0, v0}, La/md3;-><init>(Ljava/lang/Object;B)V

    .line 227
    iput-object p2, p0, La/krs0;->f:Ljava/lang/Object;

    .line 228
    sget-object p2, La/q24;->e:La/rcf0;

    .line 229
    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "Amazon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Xiaomi"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, p4

    goto :goto_1

    .line 230
    :cond_1
    :goto_0
    const-string p2, "external_surround_sound_enabled"

    invoke-static {p2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_1
    if-eqz p2, :cond_2

    .line 231
    new-instance p4, La/s24;

    .line 232
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {p4, p0, p3, p1, p2}, La/s24;-><init>(La/krs0;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 233
    :cond_2
    iput-object p4, p0, La/krs0;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;[Ljava/lang/String;ZLa/n5w;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/krs0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/krs0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/krs0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p5, p0, La/krs0;->a:Z

    .line 11
    .line 12
    iput-object p6, p0, La/krs0;->f:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/krs0;->j:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, La/zxb;

    .line 23
    .line 24
    const/16 p3, 0x1c

    .line 25
    .line 26
    invoke-direct {p1, p3}, La/zxb;-><init>(B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/krs0;->k:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/krs0;->e:Ljava/lang/Object;

    .line 37
    .line 38
    array-length p1, p4

    .line 39
    new-array p3, p1, [Ljava/lang/String;

    .line 40
    .line 41
    :goto_0
    if-ge p2, p1, :cond_2

    .line 42
    .line 43
    aget-object p5, p4, p2

    .line 44
    .line 45
    sget-object p6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {p5, p6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p5

    .line 51
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, La/krs0;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-interface {v1, p5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, La/krs0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    aget-object v1, p4, p2

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    invoke-virtual {v0, p6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p6

    .line 83
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    const/4 p6, 0x0

    .line 88
    :goto_1
    if-nez p6, :cond_1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    move-object p5, p6

    .line 92
    :goto_2
    aput-object p5, p3, p2

    .line 93
    .line 94
    add-int/lit8 p2, p2, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    iput-object p3, p0, La/krs0;->g:Ljava/lang/Object;

    .line 98
    .line 99
    iget-object p1, p0, La/krs0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ljava/util/LinkedHashMap;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    if-eqz p2, :cond_4

    .line 116
    .line 117
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    check-cast p2, Ljava/util/Map$Entry;

    .line 122
    .line 123
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    check-cast p3, Ljava/lang/String;

    .line 128
    .line 129
    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 130
    .line 131
    invoke-virtual {p3, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object p5, p0, La/krs0;->e:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast p5, Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-interface {p5, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result p5

    .line 146
    if-eqz p5, :cond_3

    .line 147
    .line 148
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    check-cast p2, Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {p2, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object p4, p0, La/krs0;->e:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast p4, Ljava/util/LinkedHashMap;

    .line 164
    .line 165
    invoke-static {p4, p3}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-interface {p4, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_4
    new-instance p1, La/o24;

    .line 174
    .line 175
    iget-object p2, p0, La/krs0;->g:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p2, [Ljava/lang/String;

    .line 178
    .line 179
    array-length p2, p2

    .line 180
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 181
    .line 182
    .line 183
    new-instance p3, Ljava/util/concurrent/locks/ReentrantLock;

    .line 184
    .line 185
    invoke-direct {p3}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 186
    .line 187
    .line 188
    iput-object p3, p1, La/o24;->b:Ljava/lang/Object;

    .line 189
    .line 190
    new-array p3, p2, [J

    .line 191
    .line 192
    iput-object p3, p1, La/o24;->c:Ljava/lang/Object;

    .line 193
    .line 194
    new-array p2, p2, [Z

    .line 195
    .line 196
    iput-object p2, p1, La/o24;->d:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object p1, p0, La/krs0;->h:Ljava/lang/Object;

    .line 199
    .line 200
    new-instance p1, La/s2g;

    .line 201
    .line 202
    iget-object p2, p0, La/krs0;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p2, [Ljava/lang/String;

    .line 205
    .line 206
    array-length p2, p2

    .line 207
    invoke-direct {p1, p2}, La/s2g;-><init>(I)V

    .line 208
    .line 209
    .line 210
    iput-object p1, p0, La/krs0;->i:Ljava/lang/Object;

    .line 211
    .line 212
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCharacteristics;)V
    .locals 2

    .line 234
    sget-object p2, La/khk;->a:La/kpd0;

    .line 235
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 236
    const-class v0, Landroidx/camera/core/internal/compat/quirk/LowMemoryQuirk;

    .line 237
    sget-object v1, La/khk;->a:La/kpd0;

    invoke-virtual {v1, v0}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 238
    new-instance v0, La/rgi0;

    invoke-direct {v0, p1}, La/rgi0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 239
    iput-object v0, p0, La/krs0;->b:Ljava/lang/Object;

    goto :goto_0

    .line 240
    :cond_0
    iput-object p1, p0, La/krs0;->b:Ljava/lang/Object;

    .line 241
    :goto_0
    iput-object p2, p0, La/krs0;->k:Ljava/lang/Object;

    .line 242
    const-class p1, Landroidx/camera/core/internal/compat/quirk/IncorrectJpegMetadataQuirk;

    invoke-virtual {p2, p1}, La/kpd0;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, La/krs0;->a:Z

    return-void
.end method


# virtual methods
.method public a(La/jva0;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/vqs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/vqs0;

    .line 7
    .line 8
    iget v1, v0, La/vqs0;->l:I

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
    iput v1, v0, La/vqs0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/vqs0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/vqs0;-><init>(La/krs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/vqs0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/vqs0;->l:I

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, La/vqs0;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/util/Set;

    .line 42
    .line 43
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_2
    iget-object p1, v0, La/vqs0;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/jva0;

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
    new-instance p0, La/g4s0;

    .line 66
    .line 67
    const/16 v1, 0x19

    .line 68
    .line 69
    invoke-direct {p0, v1}, La/g4s0;-><init>(B)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v0, La/vqs0;->i:Ljava/lang/Object;

    .line 73
    .line 74
    iput v3, v0, La/vqs0;->l:I

    .line 75
    .line 76
    const-string v1, "SELECT * FROM room_table_modification_log WHERE invalidated = 1"

    .line 77
    .line 78
    invoke-interface {p1, v1, p0, v0}, La/jva0;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/zje;)Ljava/lang/Object;

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
    iput-object p0, v0, La/vqs0;->i:Ljava/lang/Object;

    .line 97
    .line 98
    iput v2, v0, La/vqs0;->l:I

    .line 99
    .line 100
    const-string v1, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"

    .line 101
    .line 102
    invoke-static {p1, v1, v0}, La/xnm0;->i(La/jva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

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

.method public b()Ljava/util/List;
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    if-lt v0, v1, :cond_2

    .line 6
    .line 7
    iget-object p0, p0, La/krs0;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/o24;

    .line 10
    .line 11
    if-eqz p0, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, La/o24;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/media/Spatializer;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-boolean v2, p0, La/o24;->a:Z

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-static {v1}, La/b7;->i(Landroid/media/Spatializer;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, La/o24;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Landroid/media/Spatializer;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-static {v1}, La/b7;->m(Landroid/media/Spatializer;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/16 v1, 0x24

    .line 42
    .line 43
    if-lt v0, v1, :cond_0

    .line 44
    .line 45
    iget-object p0, p0, La/o24;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Landroid/media/Spatializer;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/b7;->d(Ljava/lang/Object;)Landroid/media/Spatializer;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, La/ob5;->g(Landroid/media/Spatializer;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_0
    const/16 p0, 0xfc

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_1
    sget-object p0, La/b4x;->b:La/v3x;

    .line 73
    .line 74
    sget-object p0, La/rcf0;->e:La/rcf0;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    sget-object p0, La/b4x;->b:La/v3x;

    .line 78
    .line 79
    sget-object p0, La/rcf0;->e:La/rcf0;

    .line 80
    .line 81
    return-object p0
.end method

.method public c(La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/krs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    instance-of v1, p1, La/ars0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La/ars0;

    .line 11
    .line 12
    iget v2, v1, La/ars0;->m:I

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
    iput v2, v1, La/ars0;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/ars0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/ars0;-><init>(La/krs0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/ars0;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/ars0;->m:I

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
    iget-object p0, v1, La/ars0;->j:La/yzn0;

    .line 43
    .line 44
    iget-object v0, v1, La/ars0;->i:La/krs0;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    move-object v10, p1

    .line 50
    move-object p1, p0

    .line 51
    move-object p0, v0

    .line 52
    move-object v0, v10

    .line 53
    goto :goto_1

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v4

    .line 63
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, v0, La/aeg0;->g:La/yzn0;

    .line 67
    .line 68
    invoke-virtual {p1}, La/yzn0;->a()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_b

    .line 73
    .line 74
    :try_start_1
    iget-object v3, p0, La/krs0;->j:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 77
    .line 78
    invoke-virtual {v3, v6, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_3

    .line 83
    .line 84
    sget-object p0, La/xun;->a:La/xun;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    .line 86
    invoke-virtual {p1}, La/yzn0;->w()V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :catchall_1
    move-exception p0

    .line 91
    move-object v10, p1

    .line 92
    move-object p1, p0

    .line 93
    move-object p0, v10

    .line 94
    goto/16 :goto_5

    .line 95
    .line 96
    :cond_3
    :try_start_2
    iget-object v3, p0, La/krs0;->k:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 99
    .line 100
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    check-cast v3, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    if-nez v3, :cond_4

    .line 111
    .line 112
    sget-object p0, La/xun;->a:La/xun;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 113
    .line 114
    invoke-virtual {p1}, La/yzn0;->w()V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_4
    :try_start_3
    new-instance v3, La/brs0;

    .line 119
    .line 120
    invoke-direct {v3, p0, v4, v5}, La/brs0;-><init>(La/krs0;La/yje;B)V

    .line 121
    .line 122
    .line 123
    iput-object p0, v1, La/ars0;->i:La/krs0;

    .line 124
    .line 125
    iput-object p1, v1, La/ars0;->j:La/yzn0;

    .line 126
    .line 127
    iput v6, v1, La/ars0;->m:I

    .line 128
    .line 129
    invoke-virtual {v0, v5, v3, v1}, La/aeg0;->r(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-ne v0, v2, :cond_5

    .line 134
    .line 135
    return-object v2

    .line 136
    :cond_5
    :goto_1
    check-cast v0, Ljava/util/Set;

    .line 137
    .line 138
    move-object v1, v0

    .line 139
    check-cast v1, Ljava/util/Collection;

    .line 140
    .line 141
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_a

    .line 146
    .line 147
    iget-object v1, p0, La/krs0;->i:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, La/s2g;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_6

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    iget-object v1, v1, La/s2g;->a:La/p7m0;

    .line 162
    .line 163
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    move-object v3, v2

    .line 168
    check-cast v3, [I

    .line 169
    .line 170
    array-length v4, v3

    .line 171
    new-array v7, v4, [I

    .line 172
    .line 173
    move v8, v5

    .line 174
    :goto_2
    if-ge v8, v4, :cond_9

    .line 175
    .line 176
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-eqz v9, :cond_8

    .line 185
    .line 186
    aget v9, v3, v8

    .line 187
    .line 188
    add-int/2addr v9, v6

    .line 189
    goto :goto_3

    .line 190
    :cond_8
    aget v9, v3, v8

    .line 191
    .line 192
    :goto_3
    aput v9, v7, v8

    .line 193
    .line 194
    add-int/lit8 v8, v8, 0x1

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_9
    invoke-virtual {v1, v2, v7}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_7

    .line 202
    .line 203
    :goto_4
    iget-object p0, p0, La/krs0;->f:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p0, La/n5w;

    .line 206
    .line 207
    invoke-virtual {p0, v0}, La/n5w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 208
    .line 209
    .line 210
    :cond_a
    invoke-virtual {p1}, La/yzn0;->w()V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :goto_5
    invoke-virtual {p0}, La/yzn0;->w()V

    .line 215
    .line 216
    .line 217
    throw p1

    .line 218
    :cond_b
    sget-object p0, La/xun;->a:La/xun;

    .line 219
    .line 220
    return-object p0
.end method

.method public d(La/q24;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/krs0;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/krs0;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/q24;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, La/q24;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-object p1, p0, La/krs0;->i:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object p0, p0, La/krs0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/gne;

    .line 20
    .line 21
    iget-object p0, p0, La/gne;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/n44;

    .line 24
    .line 25
    invoke-virtual {p0}, La/n44;->f()V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/n44;->g:La/q24;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v0}, La/q24;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    iput-object p1, p0, La/n44;->g:La/q24;

    .line 39
    .line 40
    iget-object p0, p0, La/n44;->e:La/vg00;

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    new-instance p1, La/jf4;

    .line 45
    .line 46
    const/16 v0, 0x14

    .line 47
    .line 48
    invoke-direct {p1, v0}, La/jf4;-><init>(B)V

    .line 49
    .line 50
    .line 51
    const/4 v0, -0x1

    .line 52
    invoke-virtual {p0, v0, p1}, La/vg00;->e(ILa/sg00;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public e(La/s45;)La/b1x;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "ProcessingNode"

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v4, "processInMemoryCapture: request ID = "

    .line 10
    .line 11
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v4, v1, La/s45;->a:La/dzb0;

    .line 15
    .line 16
    iget v4, v4, La/dzb0;->a:I

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v2, v3}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, La/s45;->a:La/dzb0;

    .line 29
    .line 30
    iget-object v3, v0, La/krs0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, La/xi70;

    .line 33
    .line 34
    invoke-virtual {v3, v1}, La/xi70;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/n45;

    .line 39
    .line 40
    iget-object v3, v0, La/krs0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, La/r45;

    .line 43
    .line 44
    iget-object v3, v3, La/r45;->d:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/4 v5, 0x1

    .line 51
    xor-int/2addr v4, v5

    .line 52
    invoke-static {v4}, La/z1x;->u(Z)V

    .line 53
    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    check-cast v6, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    iget v7, v1, La/n45;->c:I

    .line 67
    .line 68
    const/16 v8, 0x23

    .line 69
    .line 70
    if-eq v7, v8, :cond_0

    .line 71
    .line 72
    iget-boolean v7, v0, La/krs0;->a:Z

    .line 73
    .line 74
    if-eqz v7, :cond_4

    .line 75
    .line 76
    :cond_0
    const/16 v7, 0x100

    .line 77
    .line 78
    if-ne v6, v7, :cond_4

    .line 79
    .line 80
    iget-object v6, v0, La/krs0;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v6, La/hnu;

    .line 83
    .line 84
    iget v9, v2, La/dzb0;->e:I

    .line 85
    .line 86
    new-instance v10, La/z35;

    .line 87
    .line 88
    invoke-direct {v10, v1, v9}, La/z35;-><init>(La/n45;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-string v9, "Unexpected format: "

    .line 95
    .line 96
    :try_start_0
    iget-object v11, v1, La/n45;->a:Ljava/lang/Object;

    .line 97
    .line 98
    iget v12, v1, La/n45;->c:I

    .line 99
    .line 100
    if-eq v12, v8, :cond_3

    .line 101
    .line 102
    if-eq v12, v7, :cond_2

    .line 103
    .line 104
    const/16 v8, 0x1005

    .line 105
    .line 106
    if-ne v12, v8, :cond_1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    new-instance v2, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    goto :goto_3

    .line 129
    :cond_2
    :goto_0
    invoke-virtual {v6, v10, v12}, La/hnu;->k(La/z35;I)La/n45;

    .line 130
    .line 131
    .line 132
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :goto_1
    check-cast v11, La/b1x;

    .line 134
    .line 135
    invoke-interface {v11}, Ljava/lang/AutoCloseable;->close()V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_3
    :try_start_1
    invoke-static {v10}, La/hnu;->l(La/z35;)La/n45;

    .line 140
    .line 141
    .line 142
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 143
    goto :goto_1

    .line 144
    :goto_2
    iget-object v6, v0, La/krs0;->i:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v6, La/gst;

    .line 147
    .line 148
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    new-instance v6, La/ibe0;

    .line 152
    .line 153
    iget-object v8, v1, La/n45;->d:Landroid/util/Size;

    .line 154
    .line 155
    invoke-virtual {v8}, Landroid/util/Size;->getWidth()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    iget-object v9, v1, La/n45;->d:Landroid/util/Size;

    .line 160
    .line 161
    invoke-virtual {v9}, Landroid/util/Size;->getHeight()I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    const/4 v10, 0x2

    .line 166
    invoke-static {v8, v9, v7, v10}, La/g1x;->r(IIII)La/cgx0;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-direct {v6, v7}, La/ibe0;-><init>(La/e1x;)V

    .line 171
    .line 172
    .line 173
    iget-object v7, v1, La/n45;->a:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v7, [B

    .line 176
    .line 177
    invoke-static {v6, v7}, Landroidx/camera/core/ImageProcessingUtil;->a(La/ibe0;[B)La/b1x;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-virtual {v6}, La/ibe0;->e()V

    .line 182
    .line 183
    .line 184
    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    iget-object v10, v1, La/n45;->b:La/fko;

    .line 188
    .line 189
    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    iget-object v13, v1, La/n45;->e:Landroid/graphics/Rect;

    .line 193
    .line 194
    iget v14, v1, La/n45;->f:I

    .line 195
    .line 196
    iget-object v15, v1, La/n45;->g:Landroid/graphics/Matrix;

    .line 197
    .line 198
    iget-object v1, v1, La/n45;->h:La/cy9;

    .line 199
    .line 200
    new-instance v12, Landroid/util/Size;

    .line 201
    .line 202
    move-object v6, v9

    .line 203
    check-cast v6, La/jwq;

    .line 204
    .line 205
    invoke-virtual {v6}, La/jwq;->j()I

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    invoke-virtual {v6}, La/jwq;->f()I

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    invoke-direct {v12, v7, v8}, Landroid/util/Size;-><init>(II)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, La/jwq;->getFormat()I

    .line 217
    .line 218
    .line 219
    new-instance v8, La/n45;

    .line 220
    .line 221
    invoke-virtual {v6}, La/jwq;->getFormat()I

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    move-object/from16 v16, v1

    .line 226
    .line 227
    invoke-direct/range {v8 .. v16}, La/n45;-><init>(Ljava/lang/Object;La/fko;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;La/cy9;)V

    .line 228
    .line 229
    .line 230
    move-object v1, v8

    .line 231
    goto :goto_4

    .line 232
    :goto_3
    iget-object v1, v1, La/n45;->a:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, La/b1x;

    .line 235
    .line 236
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 237
    .line 238
    .line 239
    throw v0

    .line 240
    :cond_4
    :goto_4
    iget-object v0, v0, La/krs0;->h:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v0, La/rqt;

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    iget-object v0, v1, La/n45;->a:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v0, La/b1x;

    .line 250
    .line 251
    invoke-interface {v0}, La/b1x;->K0()La/f0x;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    invoke-interface {v6}, La/f0x;->f()La/eoo0;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    invoke-interface {v0}, La/b1x;->K0()La/f0x;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-interface {v6}, La/f0x;->h()J

    .line 264
    .line 265
    .line 266
    move-result-wide v9

    .line 267
    iget v11, v1, La/n45;->f:I

    .line 268
    .line 269
    iget-object v12, v1, La/n45;->g:Landroid/graphics/Matrix;

    .line 270
    .line 271
    invoke-interface {v0}, La/b1x;->K0()La/f0x;

    .line 272
    .line 273
    .line 274
    move-result-object v6

    .line 275
    invoke-interface {v6}, La/f0x;->c()I

    .line 276
    .line 277
    .line 278
    move-result v13

    .line 279
    new-instance v7, La/a45;

    .line 280
    .line 281
    invoke-direct/range {v7 .. v13}, La/a45;-><init>(La/eoo0;JILandroid/graphics/Matrix;I)V

    .line 282
    .line 283
    .line 284
    new-instance v6, La/gui0;

    .line 285
    .line 286
    iget-object v8, v1, La/n45;->d:Landroid/util/Size;

    .line 287
    .line 288
    invoke-direct {v6, v0, v8, v7}, La/gui0;-><init>(La/b1x;Landroid/util/Size;La/f0x;)V

    .line 289
    .line 290
    .line 291
    iget-object v0, v1, La/n45;->e:Landroid/graphics/Rect;

    .line 292
    .line 293
    new-instance v1, Landroid/graphics/Rect;

    .line 294
    .line 295
    invoke-direct {v1, v0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 296
    .line 297
    .line 298
    iget v0, v6, La/gui0;->g:I

    .line 299
    .line 300
    iget v7, v6, La/gui0;->h:I

    .line 301
    .line 302
    invoke-virtual {v1, v4, v4, v0, v7}, Landroid/graphics/Rect;->intersect(IIII)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_5

    .line 307
    .line 308
    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 309
    .line 310
    .line 311
    :cond_5
    iget-object v4, v6, La/gui0;->d:Ljava/lang/Object;

    .line 312
    .line 313
    monitor-enter v4

    .line 314
    :try_start_2
    iput-object v1, v6, La/gui0;->f:Landroid/graphics/Rect;

    .line 315
    .line 316
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 317
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    if-le v0, v5, :cond_6

    .line 322
    .line 323
    iget-object v0, v2, La/dzb0;->b:La/o55;

    .line 324
    .line 325
    invoke-interface {v6}, La/b1x;->getFormat()I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    invoke-virtual {v0, v1}, La/o55;->b(I)V

    .line 330
    .line 331
    .line 332
    :cond_6
    return-object v6

    .line 333
    :catchall_1
    move-exception v0

    .line 334
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 335
    throw v0
.end method

.method public f(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/krs0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, La/krs0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroidx/work/impl/WorkDatabase_Impl;

    .line 25
    .line 26
    invoke-virtual {p1}, La/aeg0;->f()La/vne;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, La/rne;

    .line 31
    .line 32
    const-string v1, "Room Invalidation Tracker Refresh"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/rne;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/meq0;

    .line 38
    .line 39
    const/16 v2, 0x19

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v1, p0, p2, v3, v2}, La/meq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x2

    .line 46
    invoke-static {p1, v0, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public g(La/ghs0;ILa/zje;)Ljava/lang/Object;
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
    instance-of v4, v3, La/drs0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/drs0;

    .line 15
    .line 16
    iget v5, v4, La/drs0;->r:I

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
    iput v5, v4, La/drs0;->r:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/drs0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, La/drs0;-><init>(La/krs0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, La/drs0;->p:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/drs0;->r:I

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
    iget v0, v4, La/drs0;->o:I

    .line 48
    .line 49
    iget v1, v4, La/drs0;->n:I

    .line 50
    .line 51
    iget v2, v4, La/drs0;->m:I

    .line 52
    .line 53
    iget-object v6, v4, La/drs0;->l:[Ljava/lang/String;

    .line 54
    .line 55
    iget-object v9, v4, La/drs0;->k:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v10, v4, La/drs0;->j:La/jva0;

    .line 58
    .line 59
    iget-object v11, v4, La/drs0;->i:La/krs0;

    .line 60
    .line 61
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move/from16 p3, v8

    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_2
    iget v0, v4, La/drs0;->m:I

    .line 76
    .line 77
    iget-object v1, v4, La/drs0;->j:La/jva0;

    .line 78
    .line 79
    iget-object v2, v4, La/drs0;->i:La/krs0;

    .line 80
    .line 81
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v16, v2

    .line 85
    .line 86
    move v2, v0

    .line 87
    move-object/from16 v0, v16

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v3, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v6, "INSERT OR IGNORE INTO room_table_modification_log VALUES("

    .line 96
    .line 97
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v6, ", 0)"

    .line 104
    .line 105
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iput-object v0, v4, La/drs0;->i:La/krs0;

    .line 113
    .line 114
    iput-object v1, v4, La/drs0;->j:La/jva0;

    .line 115
    .line 116
    iput v2, v4, La/drs0;->m:I

    .line 117
    .line 118
    iput v8, v4, La/drs0;->r:I

    .line 119
    .line 120
    invoke-static {v1, v3, v4}, La/xnm0;->i(La/jva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-ne v3, v5, :cond_4

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_4
    :goto_1
    iget-object v3, v0, La/krs0;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, [Ljava/lang/String;

    .line 130
    .line 131
    aget-object v3, v3, v2

    .line 132
    .line 133
    sget-object v6, La/krs0;->l:[Ljava/lang/String;

    .line 134
    .line 135
    const/4 v9, 0x0

    .line 136
    const/4 v10, 0x3

    .line 137
    move-object v11, v0

    .line 138
    move v0, v10

    .line 139
    move-object v10, v1

    .line 140
    move v1, v9

    .line 141
    move-object v9, v3

    .line 142
    :goto_2
    if-ge v1, v0, :cond_7

    .line 143
    .line 144
    aget-object v3, v6, v1

    .line 145
    .line 146
    iget-boolean v12, v11, La/krs0;->a:Z

    .line 147
    .line 148
    if-eqz v12, :cond_5

    .line 149
    .line 150
    const-string v12, "TEMP"

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_5
    const-string v12, ""

    .line 154
    .line 155
    :goto_3
    new-instance v13, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v14, "room_table_modification_trigger_"

    .line 158
    .line 159
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const/16 v14, 0x5f

    .line 166
    .line 167
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v13

    .line 177
    const-string v14, " TRIGGER IF NOT EXISTS `"

    .line 178
    .line 179
    const-string v15, "` AFTER "

    .line 180
    .line 181
    move/from16 p3, v8

    .line 182
    .line 183
    const-string v8, "CREATE "

    .line 184
    .line 185
    invoke-static {v8, v12, v14, v13, v15}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    const-string v12, " ON `"

    .line 190
    .line 191
    const-string v13, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = "

    .line 192
    .line 193
    invoke-static {v8, v3, v12, v9, v13}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const-string v3, " AND invalidated = 0; END"

    .line 197
    .line 198
    invoke-static {v2, v3, v8}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    iput-object v11, v4, La/drs0;->i:La/krs0;

    .line 203
    .line 204
    iput-object v10, v4, La/drs0;->j:La/jva0;

    .line 205
    .line 206
    iput-object v9, v4, La/drs0;->k:Ljava/lang/String;

    .line 207
    .line 208
    iput-object v6, v4, La/drs0;->l:[Ljava/lang/String;

    .line 209
    .line 210
    iput v2, v4, La/drs0;->m:I

    .line 211
    .line 212
    iput v1, v4, La/drs0;->n:I

    .line 213
    .line 214
    iput v0, v4, La/drs0;->o:I

    .line 215
    .line 216
    iput v7, v4, La/drs0;->r:I

    .line 217
    .line 218
    invoke-static {v10, v3, v4}, La/xnm0;->i(La/jva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    if-ne v3, v5, :cond_6

    .line 223
    .line 224
    :goto_4
    return-object v5

    .line 225
    :cond_6
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 226
    .line 227
    move/from16 v8, p3

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object v0
.end method

.method public h(La/ghs0;ILa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, La/frs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/frs0;

    .line 7
    .line 8
    iget v1, v0, La/frs0;->p:I

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
    iput v1, v0, La/frs0;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/frs0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/frs0;-><init>(La/krs0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/frs0;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/frs0;->p:I

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
    iget p0, v0, La/frs0;->m:I

    .line 37
    .line 38
    iget p1, v0, La/frs0;->l:I

    .line 39
    .line 40
    iget-object p2, v0, La/frs0;->k:[Ljava/lang/String;

    .line 41
    .line 42
    iget-object v2, v0, La/frs0;->j:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v4, v0, La/frs0;->i:La/jva0;

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
    iget-object p0, p0, La/krs0;->g:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, [Ljava/lang/String;

    .line 65
    .line 66
    aget-object p0, p0, p2

    .line 67
    .line 68
    sget-object p2, La/krs0;->l:[Ljava/lang/String;

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
    new-instance v5, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v6, "room_table_modification_trigger_"

    .line 86
    .line 87
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/16 v6, 0x5f

    .line 94
    .line 95
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const-string v5, "DROP TRIGGER IF EXISTS `"

    .line 106
    .line 107
    const/16 v6, 0x60

    .line 108
    .line 109
    invoke-static {v6, v5, v4}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iput-object p2, v0, La/frs0;->i:La/jva0;

    .line 114
    .line 115
    iput-object v2, v0, La/frs0;->j:Ljava/lang/String;

    .line 116
    .line 117
    iput-object p3, v0, La/frs0;->k:[Ljava/lang/String;

    .line 118
    .line 119
    iput p1, v0, La/frs0;->l:I

    .line 120
    .line 121
    iput p0, v0, La/frs0;->m:I

    .line 122
    .line 123
    iput v3, v0, La/frs0;->p:I

    .line 124
    .line 125
    invoke-static {p2, v4, v0}, La/xnm0;->i(La/jva0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-ne v4, v1, :cond_3

    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_3
    :goto_2
    add-int/2addr p1, v3

    .line 133
    goto :goto_1

    .line 134
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0
.end method

.method public i(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/krs0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 4
    .line 5
    instance-of v1, p1, La/hrs0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La/hrs0;

    .line 11
    .line 12
    iget v2, v1, La/hrs0;->l:I

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
    iput v2, v1, La/hrs0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/hrs0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/hrs0;-><init>(La/krs0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/hrs0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/hrs0;->l:I

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
    iget-object p0, v1, La/hrs0;->i:La/yzn0;

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
    iget-object p1, v0, La/aeg0;->g:La/yzn0;

    .line 59
    .line 60
    invoke-virtual {p1}, La/yzn0;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    :try_start_1
    new-instance v3, La/brs0;

    .line 67
    .line 68
    invoke-direct {v3, p0, v4, v5}, La/brs0;-><init>(La/krs0;La/yje;B)V

    .line 69
    .line 70
    .line 71
    iput-object p1, v1, La/hrs0;->i:La/yzn0;

    .line 72
    .line 73
    iput v5, v1, La/hrs0;->l:I

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    invoke-virtual {v0, p0, v3, v1}, La/aeg0;->r(ZLkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    if-ne p0, v2, :cond_3

    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_3
    move-object p0, p1

    .line 84
    :goto_1
    invoke-virtual {p0}, La/yzn0;->w()V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :catchall_1
    move-exception p0

    .line 89
    move-object v6, p1

    .line 90
    move-object p1, p0

    .line 91
    move-object p0, v6

    .line 92
    :goto_2
    invoke-virtual {p0}, La/yzn0;->w()V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0
.end method

.method public j()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/krs0;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/krs0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v2, p0, La/krs0;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/m24;

    .line 12
    .line 13
    iget-object v3, p0, La/krs0;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Landroid/media/AudioDeviceInfo;

    .line 16
    .line 17
    sget-object v4, La/q24;->e:La/rcf0;

    .line 18
    .line 19
    new-instance v4, Landroid/content/IntentFilter;

    .line 20
    .line 21
    const-string v5, "android.media.action.HDMI_AUDIO_PLUG"

    .line 22
    .line 23
    invoke-direct {v4, v5}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-virtual {v1, v5, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v1, v4, v2, v3, v0}, La/q24;->b(Landroid/content/Context;Landroid/content/Intent;La/m24;Landroid/media/AudioDeviceInfo;Ljava/util/List;)La/q24;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, La/krs0;->d(La/q24;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public k([Ljava/lang/String;)Lkotlin/Pair;
    .locals 7

    .line 1
    new-instance v0, La/yni0;

    .line 2
    .line 3
    invoke-direct {v0}, La/yni0;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    aget-object v4, p1, v3

    .line 12
    .line 13
    iget-object v5, p0, La/krs0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljava/util/Set;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    check-cast v5, Ljava/util/Collection;

    .line 35
    .line 36
    invoke-virtual {v0, v5}, La/yni0;->addAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    invoke-virtual {v0, v4}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {v0}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-array v0, v2, [Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, [Ljava/lang/String;

    .line 57
    .line 58
    array-length v0, p1

    .line 59
    new-array v1, v0, [I

    .line 60
    .line 61
    :goto_2
    if-ge v2, v0, :cond_3

    .line 62
    .line 63
    aget-object v3, p1, v2

    .line 64
    .line 65
    iget-object v4, p0, La/krs0;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 70
    .line 71
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v5}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ljava/lang/Integer;

    .line 83
    .line 84
    if-eqz v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    aput v3, v1, v2

    .line 91
    .line 92
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    const-string p0, "There is no table with name "

    .line 96
    .line 97
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    return-object p0

    .line 106
    :cond_3
    new-instance p0, Lkotlin/Pair;

    .line 107
    .line 108
    invoke-direct {p0, p1, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    return-object p0
.end method
