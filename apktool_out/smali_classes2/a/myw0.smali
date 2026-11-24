.class public final synthetic La/myw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d6x0;


# direct methods
.method public synthetic constructor <init>(La/d6x0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/myw0;->a:B

    iput-object p1, p0, La/myw0;->b:La/d6x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-byte v0, p0, La/myw0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string v0, "Service disconnected"

    .line 8
    .line 9
    iget-object p0, p0, La/myw0;->b:La/d6x0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, La/d6x0;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :goto_0
    :pswitch_0
    iget-object v0, p0, La/myw0;->b:La/d6x0;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-byte v2, v0, La/d6x0;->a:B

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    if-eq v2, v3, :cond_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    iget-object v2, v0, La/d6x0;->d:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, La/d6x0;->d()V

    .line 37
    .line 38
    .line 39
    monitor-exit v0

    .line 40
    :goto_1
    return-void

    .line 41
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, La/f8x0;

    .line 46
    .line 47
    iget-object v3, v0, La/d6x0;->e:Landroid/util/SparseArray;

    .line 48
    .line 49
    iget v4, v2, La/f8x0;->a:I

    .line 50
    .line 51
    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, v0, La/d6x0;->f:La/sbx0;

    .line 55
    .line 56
    iget-object v3, v3, La/sbx0;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    .line 59
    .line 60
    new-instance v5, La/k3x0;

    .line 61
    .line 62
    invoke-direct {v5, v0, v2, v1}, La/k3x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 66
    .line 67
    const-wide/16 v7, 0x1e

    .line 68
    .line 69
    invoke-interface {v3, v5, v7, v8, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 70
    .line 71
    .line 72
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    const-string v3, "MessengerIpcClient"

    .line 74
    .line 75
    const/4 v5, 0x3

    .line 76
    invoke-static {v3, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_2

    .line 81
    .line 82
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const-string v5, "Sending "

    .line 87
    .line 88
    const-string v6, "MessengerIpcClient"

    .line 89
    .line 90
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v6, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    :cond_2
    iget-object v3, v0, La/d6x0;->f:La/sbx0;

    .line 98
    .line 99
    iget-object v5, v0, La/d6x0;->b:Landroid/os/Messenger;

    .line 100
    .line 101
    iget-byte v6, v2, La/f8x0;->c:B

    .line 102
    .line 103
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    iput v6, v7, Landroid/os/Message;->what:I

    .line 108
    .line 109
    iput v4, v7, Landroid/os/Message;->arg1:I

    .line 110
    .line 111
    iput-object v5, v7, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 112
    .line 113
    new-instance v4, Landroid/os/Bundle;

    .line 114
    .line 115
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2}, La/f8x0;->a()Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const-string v6, "oneWay"

    .line 123
    .line 124
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    iget-object v3, v3, La/sbx0;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, Landroid/content/Context;

    .line 130
    .line 131
    const-string v5, "pkg"

    .line 132
    .line 133
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    invoke-virtual {v4, v5, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, v2, La/f8x0;->d:Landroid/os/Bundle;

    .line 141
    .line 142
    const-string v3, "data"

    .line 143
    .line 144
    invoke-virtual {v4, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v4}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 148
    .line 149
    .line 150
    :try_start_1
    iget-object v2, v0, La/d6x0;->c:La/fuj0;

    .line 151
    .line 152
    iget-object v3, v2, La/fuj0;->a:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v3, Landroid/os/Messenger;

    .line 155
    .line 156
    if-eqz v3, :cond_3

    .line 157
    .line 158
    invoke-virtual {v3, v7}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 159
    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_3
    iget-object v2, v2, La/fuj0;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v2, Lcom/google/android/gms/cloudmessaging/zzd;

    .line 166
    .line 167
    if-eqz v2, :cond_4

    .line 168
    .line 169
    iget-object v2, v2, Lcom/google/android/gms/cloudmessaging/zzd;->a:Landroid/os/Messenger;

    .line 170
    .line 171
    invoke-virtual {v2, v7}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_4
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    const-string v3, "Both messengers are null"

    .line 179
    .line 180
    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v2
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 184
    :catch_0
    move-exception v2

    .line 185
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v0, v2}, La/d6x0;->b(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 195
    throw p0

    .line 196
    :pswitch_1
    iget-object p0, p0, La/myw0;->b:La/d6x0;

    .line 197
    .line 198
    monitor-enter p0

    .line 199
    :try_start_3
    iget-byte v0, p0, La/d6x0;->a:B

    .line 200
    .line 201
    if-ne v0, v1, :cond_5

    .line 202
    .line 203
    const-string v0, "Timed out while binding"

    .line 204
    .line 205
    invoke-virtual {p0, v0}, La/d6x0;->b(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 206
    .line 207
    .line 208
    :cond_5
    monitor-exit p0

    .line 209
    goto :goto_3

    .line 210
    :catchall_1
    move-exception v0

    .line 211
    goto :goto_4

    .line 212
    :goto_3
    return-void

    .line 213
    :goto_4
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 214
    throw v0

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
