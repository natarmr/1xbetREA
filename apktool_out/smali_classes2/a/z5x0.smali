.class public final synthetic La/z5x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(La/drm0;La/m6x0;Ljava/lang/Runnable;)V
    .locals 0

    const/4 p1, 0x1

    iput-byte p1, p0, La/z5x0;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/z5x0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/z5x0;->c:Ljava/lang/Runnable;

    return-void
.end method

.method public synthetic constructor <init>(La/l6x0;La/m5;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/z5x0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/z5x0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/z5x0;->c:Ljava/lang/Runnable;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/z5x0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/z5x0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/m6x0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/z5x0;->c:Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-virtual {v0}, La/m6x0;->J()La/fxw0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, La/fxw0;->m1()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, La/m6x0;->p:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, La/m6x0;->p:Ljava/util/ArrayList;

    .line 32
    .line 33
    :cond_0
    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, La/m6x0;->l()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    iget-object v0, p0, La/z5x0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, La/l6x0;

    .line 43
    .line 44
    iget-object p0, p0, La/z5x0;->c:Ljava/lang/Runnable;

    .line 45
    .line 46
    check-cast p0, La/m5;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p0}, La/hkb;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/y7x0;

    .line 53
    .line 54
    new-instance v1, La/un00;

    .line 55
    .line 56
    const/4 v2, 0x6

    .line 57
    const/4 v3, 0x2

    .line 58
    invoke-direct {v1, v2, v3}, La/un00;-><init>(II)V

    .line 59
    .line 60
    .line 61
    new-instance v2, La/td9;

    .line 62
    .line 63
    invoke-direct {v2, p0, v1}, La/td9;-><init>(La/y7x0;La/un00;)V

    .line 64
    .line 65
    .line 66
    iget-boolean v1, v0, La/l6x0;->d:Z

    .line 67
    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    iget-object v3, v0, La/l6x0;->a:La/td9;

    .line 71
    .line 72
    if-nez v3, :cond_3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catch_0
    move-exception p0

    .line 76
    goto/16 :goto_3

    .line 77
    .line 78
    :catch_1
    move-exception p0

    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :cond_1
    :goto_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    if-nez v1, :cond_4

    .line 83
    .line 84
    :try_start_1
    iget-object v3, v0, La/l6x0;->a:La/td9;

    .line 85
    .line 86
    if-nez v3, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :cond_3
    :try_start_2
    iget-object v1, v3, La/td9;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, La/wcf0;

    .line 93
    .line 94
    iget-object v2, v2, La/td9;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, La/wcf0;

    .line 97
    .line 98
    invoke-static {v1, v2}, La/k9x;->I(Ljava/util/Map;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_5

    .line 103
    .line 104
    iget-object p0, v0, La/l6x0;->b:La/c1x0;

    .line 105
    .line 106
    iget-object p0, p0, La/c1x0;->e:La/lin0;

    .line 107
    .line 108
    invoke-interface {p0}, La/lin0;->get()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, La/r7x0;

    .line 113
    .line 114
    if-eqz p0, :cond_6

    .line 115
    .line 116
    invoke-interface {p0}, La/r7x0;->zza()V
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    :goto_1
    :try_start_3
    iput-object v2, v0, La/l6x0;->a:La/td9;

    .line 123
    .line 124
    iget-object v1, v0, La/l6x0;->f:La/yvj;

    .line 125
    .line 126
    iget-object v1, v1, La/yvj;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 129
    .line 130
    .line 131
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 132
    :cond_5
    :try_start_4
    iget-boolean v1, v0, La/l6x0;->d:Z

    .line 133
    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    iget-object v1, v0, La/l6x0;->b:La/c1x0;

    .line 137
    .line 138
    iget-object v2, v1, La/c1x0;->d:La/lin0;

    .line 139
    .line 140
    invoke-interface {v2}, La/lin0;->get()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    check-cast v2, La/y2x0;

    .line 145
    .line 146
    invoke-virtual {p0}, La/y7x0;->r()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    iget-object v2, v2, La/y2x0;->a:La/tzw0;

    .line 157
    .line 158
    invoke-virtual {v2, p0}, La/tzw0;->c(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, La/y2x0;->b(Lcom/google/android/gms/tasks/Task;)La/d1;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    const-class v2, Ljava/lang/Throwable;

    .line 167
    .line 168
    new-instance v3, La/a6x0;

    .line 169
    .line 170
    const/4 v4, 0x0

    .line 171
    invoke-direct {v3, v0, v4}, La/a6x0;-><init>(Ljava/lang/Object;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, La/c1x0;->a()La/fr40;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    new-instance v4, La/e1;

    .line 179
    .line 180
    invoke-direct {v4, p0, v2, v3}, La/f1;-><init>(La/ig00;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v4}, La/n2x;->I(Ljava/util/concurrent/Executor;La/epq;)Ljava/util/concurrent/Executor;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {p0, v4, v1}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    .line 188
    .line 189
    .line 190
    goto :goto_4

    .line 191
    :goto_2
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 192
    :try_start_6
    throw p0
    :try_end_6
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_0

    .line 193
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    instance-of v1, v1, Ljava/lang/SecurityException;

    .line 198
    .line 199
    if-nez v1, :cond_6

    .line 200
    .line 201
    iget-object v0, v0, La/l6x0;->c:Ljava/lang/String;

    .line 202
    .line 203
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    new-instance v2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    add-int/lit8 v1, v1, 0x40

    .line 214
    .line 215
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 216
    .line 217
    .line 218
    const-string v1, "Unable to update local snapshot for "

    .line 219
    .line 220
    const-string v3, ", may result in stale flags."

    .line 221
    .line 222
    invoke-static {v2, v1, v0, v3}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const-string v1, "FlagStore"

    .line 227
    .line 228
    invoke-static {v1, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 229
    .line 230
    .line 231
    :cond_6
    :goto_4
    return-void

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
