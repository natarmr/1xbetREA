.class public abstract La/aw00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:B = 0x0t

.field public static final b:La/cgx0;

.field public static final c:La/htz;

.field public static final d:[Ljava/lang/String;

.field public static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/cgx0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/cgx0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/aw00;->b:La/cgx0;

    .line 9
    .line 10
    new-instance v0, La/htz;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/aw00;->c:La/htz;

    .line 16
    .line 17
    const-string v0, "slf4j.detectLoggerNameMismatch"

    .line 18
    .line 19
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-string v1, "true"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    :goto_1
    const-string v0, "1.6"

    .line 34
    .line 35
    const-string v1, "1.7"

    .line 36
    .line 37
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, La/aw00;->d:[Ljava/lang/String;

    .line 42
    .line 43
    const-string v0, "org/slf4j/impl/StaticLoggerBinder.class"

    .line 44
    .line 45
    sput-object v0, La/aw00;->e:Ljava/lang/String;

    .line 46
    .line 47
    return-void
.end method

.method public static a()Ljava/util/LinkedHashSet;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-class v1, La/aw00;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    sget-object v2, La/aw00;->e:Ljava/lang/String;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    :try_start_1
    invoke-static {v2}, Ljava/lang/ClassLoader;->getSystemResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :catch_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/net/URL;

    .line 38
    .line 39
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    return-object v0

    .line 44
    :goto_1
    const-string v2, "Error getting resources from path"

    .line 45
    .line 46
    invoke-static {v2, v1}, La/lvm0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static b(Ljava/lang/String;)La/zv00;
    .locals 3

    .line 1
    sget-byte v0, La/aw00;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, La/aw00;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-byte v2, La/aw00;->a:B

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    sput-byte v1, La/aw00;->a:B

    .line 14
    .line 15
    invoke-static {}, La/aw00;->d()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0

    .line 25
    :cond_1
    :goto_2
    sget-byte v0, La/aw00;->a:B

    .line 26
    .line 27
    if-eq v0, v1, :cond_5

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x0

    .line 31
    if-eq v0, v1, :cond_4

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    if-eq v0, v1, :cond_3

    .line 35
    .line 36
    const/4 v1, 0x4

    .line 37
    if-ne v0, v1, :cond_2

    .line 38
    .line 39
    sget-object v0, La/aw00;->c:La/htz;

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    const-string p0, "Unreachable code"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_3
    sget-object v0, La/v8m0;->b:La/v8m0;

    .line 49
    .line 50
    iget-object v0, v0, La/v8m0;->a:La/h03;

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const-string p0, "org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_5
    sget-object v0, La/aw00;->b:La/cgx0;

    .line 60
    .line 61
    :goto_3
    invoke-interface {v0, p0}, La/vuw;->p(Ljava/lang/String;)La/zv00;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public static c()Z
    .locals 2

    .line 1
    const-string v0, "java.vendor.url"

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    goto :goto_0

    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "android"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
.end method

.method public static final d()V
    .locals 6

    .line 1
    const-string v0, "Failed to instantiate SLF4J LoggerFactory"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x3

    .line 5
    :try_start_0
    invoke-static {}, La/aw00;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    invoke-static {}, La/aw00;->a()Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {v3}, La/aw00;->g(Ljava/util/LinkedHashSet;)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v2

    .line 20
    goto :goto_2

    .line 21
    :catch_1
    move-exception v0

    .line 22
    goto :goto_3

    .line 23
    :catch_2
    move-exception v3

    .line 24
    goto :goto_4

    .line 25
    :cond_0
    const/4 v3, 0x0

    .line 26
    :goto_0
    sget-object v4, La/v8m0;->b:La/v8m0;

    .line 27
    .line 28
    sput-byte v2, La/aw00;->a:B

    .line 29
    .line 30
    invoke-static {v3}, La/aw00;->f(Ljava/util/LinkedHashSet;)V
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-static {}, La/aw00;->e()V

    .line 34
    .line 35
    .line 36
    goto :goto_6

    .line 37
    :goto_2
    :try_start_1
    sput-byte v1, La/aw00;->a:B

    .line 38
    .line 39
    invoke-static {v0, v2}, La/lvm0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v1, "Unexpected initialization failure"

    .line 45
    .line 46
    invoke-direct {v0, v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    const-string v3, "org.slf4j.impl.StaticLoggerBinder.getSingleton()"

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    sput-byte v1, La/aw00;->a:B

    .line 65
    .line 66
    const-string v1, "slf4j-api 1.6.x (or later) is incompatible with this binding."

    .line 67
    .line 68
    invoke-static {v1}, La/lvm0;->m(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v1, "Your binding is version 1.5.5 or earlier."

    .line 72
    .line 73
    invoke-static {v1}, La/lvm0;->m(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v1, "Upgrade your binding to version 1.6.x."

    .line 77
    .line 78
    invoke-static {v1}, La/lvm0;->m(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_1
    throw v0

    .line 82
    :goto_4
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    if-eqz v4, :cond_6

    .line 87
    .line 88
    const-string v5, "org/slf4j/impl/StaticLoggerBinder"

    .line 89
    .line 90
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_2

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_2
    const-string v5, "org.slf4j.impl.StaticLoggerBinder"

    .line 98
    .line 99
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_6

    .line 104
    .line 105
    :goto_5
    const/4 v0, 0x4

    .line 106
    sput-byte v0, La/aw00;->a:B

    .line 107
    .line 108
    const-string v0, "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."

    .line 109
    .line 110
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v0, "Defaulting to no-operation (NOP) logger implementation"

    .line 114
    .line 115
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-string v0, "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."

    .line 119
    .line 120
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :goto_6
    sget-byte v0, La/aw00;->a:B

    .line 125
    .line 126
    if-ne v0, v2, :cond_5

    .line 127
    .line 128
    sget-object v0, La/aw00;->d:[Ljava/lang/String;

    .line 129
    .line 130
    :try_start_2
    sget-object v1, La/v8m0;->c:Ljava/lang/String;

    .line 131
    .line 132
    array-length v2, v0

    .line 133
    const/4 v3, 0x0

    .line 134
    move v4, v3

    .line 135
    :goto_7
    if-ge v3, v2, :cond_4

    .line 136
    .line 137
    aget-object v5, v0, v3

    .line 138
    .line 139
    invoke-virtual {v1, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_3

    .line 144
    .line 145
    const/4 v4, 0x1

    .line 146
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_4
    if-nez v4, :cond_5

    .line 150
    .line 151
    new-instance v2, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v3, "The requested version "

    .line 157
    .line 158
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, " by your slf4j binding is not compatible with "

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    const-string v0, "See http://www.slf4j.org/codes.html#version_mismatch for further details."

    .line 188
    .line 189
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    .line 191
    .line 192
    goto :goto_8

    .line 193
    :catchall_0
    move-exception v0

    .line 194
    const-string v1, "Unexpected problem occured during version sanity check"

    .line 195
    .line 196
    invoke-static {v1, v0}, La/lvm0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :catch_3
    :cond_5
    :goto_8
    return-void

    .line 200
    :cond_6
    :try_start_3
    sput-byte v1, La/aw00;->a:B

    .line 201
    .line 202
    invoke-static {v0, v3}, La/lvm0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 203
    .line 204
    .line 205
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 206
    :catchall_1
    move-exception v0

    .line 207
    invoke-static {}, La/aw00;->e()V

    .line 208
    .line 209
    .line 210
    throw v0
.end method

.method public static e()V
    .locals 10

    .line 1
    sget-object v0, La/aw00;->b:La/cgx0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, v0, La/cgx0;->b:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, v0, La/cgx0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, La/xen0;

    .line 35
    .line 36
    iget-object v3, v2, La/xen0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3}, La/aw00;->b(Ljava/lang/String;)La/zv00;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iput-object v3, v2, La/xen0;->b:La/zv00;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    sget-object v0, La/aw00;->b:La/cgx0;

    .line 50
    .line 51
    iget-object v0, v0, La/cgx0;->d:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    new-instance v3, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v4, 0x80

    .line 63
    .line 64
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    :goto_1
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/LinkedBlockingQueue;->drainTo(Ljava/util/Collection;I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_1

    .line 73
    .line 74
    sget-object v0, La/aw00;->b:La/cgx0;

    .line 75
    .line 76
    iget-object v1, v0, La/cgx0;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 81
    .line 82
    .line 83
    iget-object v0, v0, La/cgx0;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->clear()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_a

    .line 100
    .line 101
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, La/yen0;

    .line 106
    .line 107
    if-nez v6, :cond_2

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_2
    iget-object v7, v6, La/yen0;->a:La/xen0;

    .line 111
    .line 112
    iget-object v8, v7, La/xen0;->a:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v9, v7, La/xen0;->b:La/zv00;

    .line 115
    .line 116
    if-eqz v9, :cond_9

    .line 117
    .line 118
    iget-object v9, v7, La/xen0;->b:La/zv00;

    .line 119
    .line 120
    instance-of v9, v9, La/u850;

    .line 121
    .line 122
    if-eqz v9, :cond_3

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_3
    invoke-virtual {v7}, La/xen0;->p()Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_4

    .line 130
    .line 131
    invoke-virtual {v7}, La/xen0;->p()Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_5

    .line 136
    .line 137
    :try_start_1
    iget-object v8, v7, La/xen0;->d:Ljava/lang/reflect/Method;

    .line 138
    .line 139
    iget-object v7, v7, La/xen0;->b:La/zv00;

    .line 140
    .line 141
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    invoke-virtual {v8, v7, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-static {v8}, La/lvm0;->m(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :catch_0
    :cond_5
    :goto_3
    add-int/lit8 v7, v0, 0x1

    .line 153
    .line 154
    if-nez v0, :cond_8

    .line 155
    .line 156
    iget-object v0, v6, La/yen0;->a:La/xen0;

    .line 157
    .line 158
    invoke-virtual {v0}, La/xen0;->p()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_6

    .line 163
    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    const-string v6, "A number ("

    .line 167
    .line 168
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v6, ") of logging calls during the initialization phase have been intercepted and are"

    .line 175
    .line 176
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    const-string v0, "now being replayed. These are subject to the filtering rules of the underlying logging system."

    .line 187
    .line 188
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v0, "See also http://www.slf4j.org/codes.html#replay"

    .line 192
    .line 193
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_6
    iget-object v0, v6, La/yen0;->a:La/xen0;

    .line 198
    .line 199
    iget-object v0, v0, La/xen0;->b:La/zv00;

    .line 200
    .line 201
    instance-of v0, v0, La/u850;

    .line 202
    .line 203
    if-eqz v0, :cond_7

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_7
    const-string v0, "The following set of substitute loggers may have been accessed"

    .line 207
    .line 208
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    const-string v0, "during the initialization phase. Logging calls during this"

    .line 212
    .line 213
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    const-string v0, "phase were not honored. However, subsequent logging calls to these"

    .line 217
    .line 218
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const-string v0, "loggers will work as normally expected."

    .line 222
    .line 223
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    const-string v0, "See also http://www.slf4j.org/codes.html#substituteLogger"

    .line 227
    .line 228
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    :goto_4
    move v0, v7

    .line 232
    goto/16 :goto_2

    .line 233
    .line 234
    :cond_9
    const-string v0, "Delegate logger cannot be null at this state."

    .line 235
    .line 236
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_a
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_1

    .line 244
    .line 245
    :goto_5
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 246
    throw v1
.end method

.method public static f(Ljava/util/LinkedHashSet;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x1

    .line 8
    if-le p0, v0, :cond_0

    .line 9
    .line 10
    new-instance p0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v0, "Actual binding is of type ["

    .line 13
    .line 14
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, La/v8m0;->b:La/v8m0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, La/v8m0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, "]"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static g(Ljava/util/LinkedHashSet;)V
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-le v0, v1, :cond_1

    .line 7
    .line 8
    const-string v0, "Class path contains multiple SLF4J bindings."

    .line 9
    .line 10
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/net/URL;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Found binding in ["

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, "]"

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const-string p0, "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."

    .line 53
    .line 54
    invoke-static {p0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    return-void
.end method
