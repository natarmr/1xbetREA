.class public final La/l6x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:La/zas0;

.field public static final i:La/n5x0;


# instance fields
.field public volatile a:La/td9;

.field public final b:La/c1x0;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:La/f4x;

.field public final f:La/yvj;

.field public final g:La/glt0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zas0;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/zas0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/l6x0;->h:La/zas0;

    .line 9
    .line 10
    new-instance v0, La/n5x0;

    .line 11
    .line 12
    sget-object v1, La/wgw0;->c:La/wgw0;

    .line 13
    .line 14
    sget v2, La/f4x;->c:I

    .line 15
    .line 16
    sget-object v2, La/ycf0;->j:La/ycf0;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, v1, v3, v2}, La/n5x0;-><init>(La/tdr;ZLa/f4x;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/l6x0;->i:La/n5x0;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(La/c1x0;La/n5x0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/l6x0;->b:La/c1x0;

    .line 5
    .line 6
    iget-object v0, p1, La/c1x0;->b:Landroid/content/Context;

    .line 7
    .line 8
    iget-object v1, p2, La/n5x0;->d:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p2, La/n5x0;->a:La/tdr;

    .line 13
    .line 14
    invoke-interface {v1, v0}, La/tdr;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    iput-object v1, p2, La/n5x0;->d:Ljava/lang/String;

    .line 22
    .line 23
    :cond_0
    iput-object v1, p0, La/l6x0;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v0, p2, La/n5x0;->b:Z

    .line 26
    .line 27
    iput-boolean v0, p0, La/l6x0;->d:Z

    .line 28
    .line 29
    iget-object p2, p2, La/n5x0;->c:La/f4x;

    .line 30
    .line 31
    iput-object p2, p0, La/l6x0;->e:La/f4x;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    iput-object p2, p0, La/l6x0;->a:La/td9;

    .line 35
    .line 36
    new-instance p2, La/yvj;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    invoke-direct {p2, v0}, La/yvj;-><init>(B)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, La/l6x0;->f:La/yvj;

    .line 43
    .line 44
    new-instance p2, La/glt0;

    .line 45
    .line 46
    invoke-direct {p2, p1, v1}, La/glt0;-><init>(La/c1x0;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, La/l6x0;->g:La/glt0;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final a()La/td9;
    .locals 6

    .line 1
    iget-object v0, p0, La/l6x0;->a:La/td9;

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, La/l6x0;->a:La/td9;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :try_start_1
    iget-object v1, p0, La/l6x0;->g:La/glt0;

    .line 15
    .line 16
    invoke-virtual {v1}, La/glt0;->j()La/td9;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    :try_start_2
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, La/td9;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/un00;

    .line 26
    .line 27
    iget v0, v0, La/un00;->b:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, -0x2

    .line 30
    .line 31
    const/16 v2, 0xf

    .line 32
    .line 33
    if-eq v0, v2, :cond_1

    .line 34
    .line 35
    const/16 v2, 0x10

    .line 36
    .line 37
    if-eq v0, v2, :cond_1

    .line 38
    .line 39
    iget-object v0, p0, La/l6x0;->b:La/c1x0;

    .line 40
    .line 41
    iget-object v2, v0, La/c1x0;->g:La/i8x0;

    .line 42
    .line 43
    invoke-virtual {v2}, La/i8x0;->a()V

    .line 44
    .line 45
    .line 46
    iget-boolean v2, p0, La/l6x0;->d:Z

    .line 47
    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    iget-object v2, p0, La/l6x0;->g:La/glt0;

    .line 51
    .line 52
    invoke-virtual {v2}, La/glt0;->l()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_0

    .line 57
    .line 58
    iget-object v2, v1, La/td9;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, La/c1x0;->a()La/fr40;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v2, La/r5x0;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-direct {v2, p0, v3}, La/r5x0;-><init>(La/l6x0;B)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2}, La/fr40;->execute(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, La/y7x0;->y()La/y7x0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v1, v1, La/td9;->e:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, La/un00;

    .line 88
    .line 89
    new-instance v2, La/td9;

    .line 90
    .line 91
    invoke-direct {v2, v0, v1}, La/td9;-><init>(La/y7x0;La/un00;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v2

    .line 95
    goto :goto_0

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    goto :goto_2

    .line 98
    :cond_0
    invoke-virtual {v0}, La/c1x0;->a()La/fr40;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    new-instance v3, La/r5x0;

    .line 103
    .line 104
    const/4 v4, 0x2

    .line 105
    invoke-direct {v3, p0, v4}, La/r5x0;-><init>(La/l6x0;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v3}, La/fr40;->execute(Ljava/lang/Runnable;)V

    .line 109
    .line 110
    .line 111
    iget-object v2, v0, La/c1x0;->a:La/cmt0;

    .line 112
    .line 113
    iget-object v3, v1, La/td9;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, La/qdw0;

    .line 116
    .line 117
    iget-object v4, p0, La/l6x0;->e:La/f4x;

    .line 118
    .line 119
    iget-object v5, p0, La/l6x0;->c:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v2, v3, v4, v5}, La/cmt0;->e(La/qdw0;Ljava/util/Set;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, p0, La/l6x0;->g:La/glt0;

    .line 125
    .line 126
    invoke-virtual {v2}, La/glt0;->l()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_1

    .line 131
    .line 132
    invoke-virtual {v0}, La/c1x0;->a()La/fr40;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    new-instance v2, La/r5x0;

    .line 137
    .line 138
    const/4 v3, 0x1

    .line 139
    invoke-direct {v2, p0, v3}, La/r5x0;-><init>(La/l6x0;B)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, La/fr40;->execute(Ljava/lang/Runnable;)V

    .line 143
    .line 144
    .line 145
    :cond_1
    move-object v0, v1

    .line 146
    :goto_0
    iget-boolean v1, p0, La/l6x0;->d:Z

    .line 147
    .line 148
    if-eqz v1, :cond_2

    .line 149
    .line 150
    iget-object v1, v0, La/td9;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, La/un00;

    .line 153
    .line 154
    iget v1, v1, La/un00;->b:I

    .line 155
    .line 156
    const/16 v2, 0x11

    .line 157
    .line 158
    if-ne v1, v2, :cond_2

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_2
    iput-object v0, p0, La/l6x0;->a:La/td9;

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :catchall_1
    move-exception v1

    .line 165
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 166
    .line 167
    .line 168
    throw v1

    .line 169
    :cond_3
    :goto_1
    monitor-exit p0

    .line 170
    return-object v0

    .line 171
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    throw v0

    .line 173
    :cond_4
    return-object v0
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, La/l6x0;->g:La/glt0;

    .line 2
    .line 3
    iget-object v1, v0, La/glt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/c1x0;

    .line 6
    .line 7
    iget-object v2, v1, La/c1x0;->d:La/lin0;

    .line 8
    .line 9
    invoke-interface {v2}, La/lin0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, La/y2x0;

    .line 14
    .line 15
    iget-object v3, v0, La/glt0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, v2, La/y2x0;->a:La/tzw0;

    .line 26
    .line 27
    invoke-static {}, La/s9w0;->a()La/euo0;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, La/hbb;

    .line 32
    .line 33
    const/4 v6, 0x7

    .line 34
    invoke-direct {v5, v3, v6}, La/hbb;-><init>(Ljava/lang/String;B)V

    .line 35
    .line 36
    .line 37
    iput-object v5, v4, La/euo0;->a:La/mff0;

    .line 38
    .line 39
    invoke-virtual {v4}, La/euo0;->a()La/s9w0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-virtual {v2, v4, v3}, La/nav;->b(ILa/s9w0;)Lcom/google/android/gms/tasks/Task;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, La/epw0;

    .line 49
    .line 50
    const/16 v4, 0x1c

    .line 51
    .line 52
    invoke-direct {v3, v4}, La/epw0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    sget-object v4, La/ank;->a:La/ank;

    .line 56
    .line 57
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {v2}, La/y2x0;->b(Lcom/google/android/gms/tasks/Task;)La/d1;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, La/wgw0;->d:La/wgw0;

    .line 66
    .line 67
    invoke-virtual {v1}, La/c1x0;->a()La/fr40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    sget v4, La/n5;->k:I

    .line 72
    .line 73
    new-instance v4, La/m5;

    .line 74
    .line 75
    invoke-direct {v4, v2, v3}, La/n5;-><init>(La/ig00;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v4}, La/n2x;->I(Ljava/util/concurrent/Executor;La/epq;)Ljava/util/concurrent/Executor;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v2, v4, v1}, La/l2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, La/v5x0;

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    invoke-direct {v1, v0, v2}, La/v5x0;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, La/l6x0;->b:La/c1x0;

    .line 92
    .line 93
    invoke-virtual {v0}, La/c1x0;->a()La/fr40;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v4, v1, v2}, La/n5;->q(La/ig00;La/yy3;Ljava/util/concurrent/Executor;)La/l5;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    new-instance v2, La/z5x0;

    .line 102
    .line 103
    invoke-direct {v2, p0, v4}, La/z5x0;-><init>(La/l6x0;La/m5;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, La/c1x0;->a()La/fr40;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {v1, v2, p0}, La/l2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method
