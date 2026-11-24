.class public final La/hf5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 21
    iput-byte p1, p0, La/hf5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/a4x0;Ljava/util/concurrent/atomic/AtomicReference;Lcom/google/android/gms/measurement/internal/zzr;)V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    iput-byte v0, p0, La/hf5;->a:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La/hf5;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, La/hf5;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/hf5;->d:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/aqv;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x6

    iput-byte v0, p0, La/hf5;->a:B

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hf5;->d:Ljava/lang/Object;

    .line 23
    iput-object p2, p0, La/hf5;->c:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, La/hf5;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Ljava/lang/Object;Landroid/view/View;Landroid/view/View;B)V
    .locals 0

    .line 18
    iput-byte p5, p0, La/hf5;->a:B

    iput-object p2, p0, La/hf5;->b:Ljava/lang/Object;

    iput-object p3, p0, La/hf5;->c:Ljava/lang/Object;

    iput-object p4, p0, La/hf5;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 19
    iput-byte p4, p0, La/hf5;->a:B

    iput-object p1, p0, La/hf5;->b:Ljava/lang/Object;

    iput-object p2, p0, La/hf5;->c:Ljava/lang/Object;

    iput-object p3, p0, La/hf5;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V
    .locals 0

    .line 20
    iput-byte p5, p0, La/hf5;->a:B

    iput-object p1, p0, La/hf5;->d:Ljava/lang/Object;

    iput-object p2, p0, La/hf5;->b:Ljava/lang/Object;

    iput-object p3, p0, La/hf5;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 9

    .line 1
    const-string v0, "Failed to get app instance id"

    .line 2
    .line 3
    iget-object v1, p0, La/hf5;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/gpw0;

    .line 6
    .line 7
    iget-object v2, p0, La/hf5;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/a4x0;

    .line 10
    .line 11
    iget-object v3, v2, La/p4;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, La/kxw0;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    :try_start_0
    iget-object v5, v3, La/kxw0;->e:La/wvw0;

    .line 17
    .line 18
    iget-object v6, v3, La/kxw0;->f:La/uuw0;

    .line 19
    .line 20
    invoke-static {v5}, La/kxw0;->e(La/p4;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v5}, La/wvw0;->t1()La/xyw0;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    sget-object v8, La/wyw0;->c:La/wyw0;

    .line 28
    .line 29
    invoke-virtual {v7, v8}, La/xyw0;->i(La/wyw0;)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_0

    .line 34
    .line 35
    invoke-static {v6}, La/kxw0;->g(La/ryw0;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, v6, La/uuw0;->l:La/quw0;

    .line 39
    .line 40
    const-string v2, "Analytics storage consent denied; will not get app instance id"

    .line 41
    .line 42
    invoke-virtual {p0, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, v3, La/kxw0;->m:La/b1x0;

    .line 46
    .line 47
    invoke-static {p0}, La/kxw0;->f(La/etw0;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/b1x0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 51
    .line 52
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5}, La/kxw0;->e(La/p4;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, v5, La/wvw0;->h:La/o24;

    .line 59
    .line 60
    invoke-virtual {p0, v4}, La/o24;->u(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_4

    .line 66
    :catch_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    iget-object v7, v2, La/a4x0;->e:La/gtw0;

    .line 69
    .line 70
    if-nez v7, :cond_1

    .line 71
    .line 72
    invoke-static {v6}, La/kxw0;->g(La/ryw0;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, v6, La/uuw0;->g:La/quw0;

    .line 76
    .line 77
    invoke-virtual {p0, v0}, La/quw0;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    :goto_0
    iget-object p0, v3, La/kxw0;->i:La/x6x0;

    .line 81
    .line 82
    :goto_1
    invoke-static {p0}, La/kxw0;->e(La/p4;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v4, v1}, La/x6x0;->Z1(Ljava/lang/String;La/gpw0;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_1
    :try_start_1
    iget-object p0, p0, La/hf5;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, Lcom/google/android/gms/measurement/internal/zzr;

    .line 92
    .line 93
    invoke-interface {v7, p0}, La/gtw0;->o(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    if-eqz v4, :cond_2

    .line 98
    .line 99
    iget-object p0, v3, La/kxw0;->m:La/b1x0;

    .line 100
    .line 101
    invoke-static {p0}, La/kxw0;->f(La/etw0;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, La/b1x0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 105
    .line 106
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v5}, La/kxw0;->e(La/p4;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v5, La/wvw0;->h:La/o24;

    .line 113
    .line 114
    invoke-virtual {p0, v4}, La/o24;->u(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-virtual {v2}, La/a4x0;->y1()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :goto_2
    :try_start_2
    iget-object v2, v3, La/kxw0;->f:La/uuw0;

    .line 122
    .line 123
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 124
    .line 125
    .line 126
    iget-object v2, v2, La/uuw0;->g:La/quw0;

    .line 127
    .line 128
    invoke-virtual {v2, p0, v0}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 129
    .line 130
    .line 131
    :goto_3
    iget-object p0, v3, La/kxw0;->i:La/x6x0;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :goto_4
    iget-object v0, v3, La/kxw0;->i:La/x6x0;

    .line 135
    .line 136
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v4, v1}, La/x6x0;->Z1(Ljava/lang/String;La/gpw0;)V

    .line 140
    .line 141
    .line 142
    throw p0
.end method


# virtual methods
.method public final run()V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, La/hf5;->a:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v5, 0x5

    .line 7
    const/4 v6, 0x4

    .line 8
    const/16 v7, 0x8

    .line 9
    .line 10
    const/4 v8, 0x2

    .line 11
    const/4 v9, 0x1

    .line 12
    const/4 v10, 0x3

    .line 13
    const/4 v11, 0x0

    .line 14
    const/4 v12, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/mie0;

    .line 21
    .line 22
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/icx0;

    .line 29
    .line 30
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, La/pb90;

    .line 33
    .line 34
    invoke-static {}, La/wcx0;->c()La/bex0;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2, v0}, La/wcx0;->b(La/bex0;La/icx0;)La/icx0;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    :try_start_0
    invoke-virtual {v1}, La/pb90;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3}, La/wcx0;->b(La/bex0;La/icx0;)La/icx0;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    invoke-static {v0}, La/qcx0;->a(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    invoke-static {v2, v3}, La/wcx0;->b(La/bex0;La/icx0;)La/icx0;

    .line 56
    .line 57
    .line 58
    throw v0

    .line 59
    :cond_0
    invoke-static {}, La/hny;->b()V

    .line 60
    .line 61
    .line 62
    :goto_0
    return-void

    .line 63
    :pswitch_0
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, La/drm0;

    .line 66
    .line 67
    iget-object v2, v1, La/hf5;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, La/uuw0;

    .line 70
    .line 71
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, Landroid/app/job/JobParameters;

    .line 74
    .line 75
    iget-object v2, v2, La/uuw0;->o:La/quw0;

    .line 76
    .line 77
    const-string v3, "AppMeasurementJobService processed last upload request."

    .line 78
    .line 79
    invoke-virtual {v2, v3}, La/quw0;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, v0, La/drm0;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Landroid/app/Service;

    .line 85
    .line 86
    check-cast v0, La/h4x0;

    .line 87
    .line 88
    invoke-interface {v0, v1}, La/h4x0;->b(Landroid/app/job/JobParameters;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, La/a4x0;

    .line 95
    .line 96
    iget-object v2, v1, La/hf5;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 99
    .line 100
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 103
    .line 104
    iget-object v3, v0, La/p4;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, La/kxw0;

    .line 107
    .line 108
    iget-object v4, v0, La/a4x0;->e:La/gtw0;

    .line 109
    .line 110
    if-nez v4, :cond_1

    .line 111
    .line 112
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 113
    .line 114
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 118
    .line 119
    const-string v1, "[sgtm] Discarding data. Failed to update batch upload status."

    .line 120
    .line 121
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    :try_start_2
    invoke-interface {v4, v2, v1}, La/gtw0;->r(Lcom/google/android/gms/measurement/internal/zzr;Lcom/google/android/gms/measurement/internal/zzaf;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, La/a4x0;->y1()V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catch_0
    move-exception v0

    .line 133
    iget-object v2, v3, La/kxw0;->f:La/uuw0;

    .line 134
    .line 135
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 136
    .line 137
    .line 138
    iget-object v2, v2, La/uuw0;->g:La/quw0;

    .line 139
    .line 140
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->a:J

    .line 141
    .line 142
    const-string v1, "[sgtm] Failed to update batch upload status, rowId, exception"

    .line 143
    .line 144
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v2, v3, v0, v1}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :goto_1
    return-void

    .line 152
    :pswitch_2
    invoke-direct {v1}, La/hf5;->a()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :pswitch_3
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 157
    .line 158
    move-object v2, v0

    .line 159
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 160
    .line 161
    monitor-enter v2

    .line 162
    :try_start_3
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, La/a4x0;

    .line 165
    .line 166
    iget-object v3, v0, La/p4;->b:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, La/kxw0;

    .line 169
    .line 170
    iget-object v4, v3, La/kxw0;->e:La/wvw0;

    .line 171
    .line 172
    invoke-static {v4}, La/kxw0;->e(La/p4;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, La/wvw0;->t1()La/xyw0;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    sget-object v5, La/wyw0;->c:La/wyw0;

    .line 180
    .line 181
    invoke-virtual {v4, v5}, La/xyw0;->i(La/wyw0;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_2

    .line 186
    .line 187
    iget-object v4, v3, La/kxw0;->f:La/uuw0;

    .line 188
    .line 189
    invoke-static {v4}, La/kxw0;->g(La/ryw0;)V

    .line 190
    .line 191
    .line 192
    iget-object v4, v4, La/uuw0;->l:La/quw0;

    .line 193
    .line 194
    const-string v5, "Analytics storage consent denied; will not get app instance id"

    .line 195
    .line 196
    invoke-virtual {v4, v5}, La/quw0;->a(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v0, La/kxw0;

    .line 202
    .line 203
    iget-object v0, v0, La/kxw0;->m:La/b1x0;

    .line 204
    .line 205
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, v0, La/b1x0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 209
    .line 210
    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iget-object v0, v3, La/kxw0;->e:La/wvw0;

    .line 214
    .line 215
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, La/wvw0;->h:La/o24;

    .line 219
    .line 220
    invoke-virtual {v0, v12}, La/o24;->u(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v12}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 224
    .line 225
    .line 226
    :goto_2
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    .line 227
    .line 228
    .line 229
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 230
    goto :goto_5

    .line 231
    :catchall_2
    move-exception v0

    .line 232
    goto :goto_7

    .line 233
    :catchall_3
    move-exception v0

    .line 234
    goto :goto_6

    .line 235
    :catch_1
    move-exception v0

    .line 236
    goto :goto_3

    .line 237
    :cond_2
    :try_start_5
    iget-object v4, v0, La/a4x0;->e:La/gtw0;

    .line 238
    .line 239
    if-nez v4, :cond_3

    .line 240
    .line 241
    iget-object v0, v3, La/kxw0;->f:La/uuw0;

    .line 242
    .line 243
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 244
    .line 245
    .line 246
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 247
    .line 248
    const-string v3, "Failed to get app instance id"

    .line 249
    .line 250
    invoke-virtual {v0, v3}, La/quw0;->a(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_3
    iget-object v5, v1, La/hf5;->c:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v5, Lcom/google/android/gms/measurement/internal/zzr;

    .line 257
    .line 258
    invoke-interface {v4, v5}, La/gtw0;->o(Lcom/google/android/gms/measurement/internal/zzr;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    check-cast v4, Ljava/lang/String;

    .line 270
    .line 271
    if-eqz v4, :cond_4

    .line 272
    .line 273
    iget-object v5, v0, La/p4;->b:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v5, La/kxw0;

    .line 276
    .line 277
    iget-object v5, v5, La/kxw0;->m:La/b1x0;

    .line 278
    .line 279
    invoke-static {v5}, La/kxw0;->f(La/etw0;)V

    .line 280
    .line 281
    .line 282
    iget-object v5, v5, La/b1x0;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 283
    .line 284
    invoke-virtual {v5, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    iget-object v3, v3, La/kxw0;->e:La/wvw0;

    .line 288
    .line 289
    invoke-static {v3}, La/kxw0;->e(La/p4;)V

    .line 290
    .line 291
    .line 292
    iget-object v3, v3, La/wvw0;->h:La/o24;

    .line 293
    .line 294
    invoke-virtual {v3, v4}, La/o24;->u(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :cond_4
    invoke-virtual {v0}, La/a4x0;->y1()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 298
    .line 299
    .line 300
    :try_start_6
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :goto_3
    :try_start_7
    iget-object v3, v1, La/hf5;->d:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v3, La/a4x0;

    .line 308
    .line 309
    iget-object v3, v3, La/p4;->b:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v3, La/kxw0;

    .line 312
    .line 313
    iget-object v3, v3, La/kxw0;->f:La/uuw0;

    .line 314
    .line 315
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 316
    .line 317
    .line 318
    iget-object v3, v3, La/uuw0;->g:La/quw0;

    .line 319
    .line 320
    const-string v4, "Failed to get app instance id"

    .line 321
    .line 322
    invoke-virtual {v3, v0, v4}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 323
    .line 324
    .line 325
    :try_start_8
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 328
    .line 329
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 330
    .line 331
    .line 332
    monitor-exit v2

    .line 333
    :goto_5
    return-void

    .line 334
    :goto_6
    iget-object v1, v1, La/hf5;->b:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 339
    .line 340
    .line 341
    throw v0

    .line 342
    :goto_7
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 343
    throw v0

    .line 344
    :pswitch_4
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, La/oyw0;

    .line 347
    .line 348
    iget-object v2, v1, La/hf5;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 351
    .line 352
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzaf;

    .line 355
    .line 356
    iget-object v11, v0, La/oyw0;->a:La/m6x0;

    .line 357
    .line 358
    invoke-virtual {v11}, La/m6x0;->V()V

    .line 359
    .line 360
    .line 361
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 362
    .line 363
    invoke-static {v2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    iget-object v13, v11, La/m6x0;->f1:Ljava/util/HashMap;

    .line 367
    .line 368
    invoke-virtual {v11}, La/m6x0;->J()La/fxw0;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v11}, La/m6x0;->l0()V

    .line 376
    .line 377
    .line 378
    iget-object v14, v11, La/m6x0;->c:La/zlw0;

    .line 379
    .line 380
    invoke-static {v14}, La/m6x0;->T(La/u5x0;)V

    .line 381
    .line 382
    .line 383
    const-wide/16 v29, 0x0

    .line 384
    .line 385
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->a:J

    .line 386
    .line 387
    move-object/from16 v31, v12

    .line 388
    .line 389
    move-object/from16 p0, v13

    .line 390
    .line 391
    iget-wide v12, v1, Lcom/google/android/gms/measurement/internal/zzaf;->c:J

    .line 392
    .line 393
    invoke-virtual {v14}, La/p4;->m1()V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v14}, La/u5x0;->n1()V

    .line 397
    .line 398
    .line 399
    :try_start_9
    invoke-virtual {v14}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 400
    .line 401
    .line 402
    move-result-object v15

    .line 403
    const-string v16, "upload_queue"

    .line 404
    .line 405
    const-string v17, "rowId"

    .line 406
    .line 407
    const-string v18, "app_id"

    .line 408
    .line 409
    const-string v19, "measurement_batch"

    .line 410
    .line 411
    const-string v20, "upload_uri"

    .line 412
    .line 413
    const-string v21, "upload_headers"

    .line 414
    .line 415
    const-string v22, "upload_type"

    .line 416
    .line 417
    const-string v23, "retry_count"

    .line 418
    .line 419
    const-string v24, "creation_timestamp"

    .line 420
    .line 421
    const-string v25, "associated_row_id"

    .line 422
    .line 423
    const-string v26, "last_upload_timestamp"

    .line 424
    .line 425
    filled-new-array/range {v17 .. v26}, [Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v17

    .line 429
    const-string v18, "rowId=?"

    .line 430
    .line 431
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    filled-new-array {v0}, [Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v19

    .line 439
    const-string v23, "1"

    .line 440
    .line 441
    const/16 v20, 0x0

    .line 442
    .line 443
    const/16 v21, 0x0

    .line 444
    .line 445
    const/16 v22, 0x0

    .line 446
    .line 447
    invoke-virtual/range {v15 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 448
    .line 449
    .line 450
    move-result-object v15
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 451
    :try_start_a
    invoke-interface {v15}, Landroid/database/Cursor;->moveToFirst()Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-nez v0, :cond_5

    .line 456
    .line 457
    move-wide/from16 v16, v3

    .line 458
    .line 459
    goto/16 :goto_d

    .line 460
    .line 461
    :cond_5
    invoke-interface {v15, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    invoke-interface {v15, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 469
    .line 470
    .line 471
    move-result-object v18

    .line 472
    invoke-interface {v15, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v19

    .line 476
    invoke-interface {v15, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 477
    .line 478
    .line 479
    move-result-object v20

    .line 480
    invoke-interface {v15, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 481
    .line 482
    .line 483
    move-result v21

    .line 484
    const/4 v5, 0x6

    .line 485
    invoke-interface {v15, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 486
    .line 487
    .line 488
    move-result v22

    .line 489
    const/4 v5, 0x7

    .line 490
    invoke-interface {v15, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 491
    .line 492
    .line 493
    move-result-wide v23

    .line 494
    invoke-interface {v15, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 495
    .line 496
    .line 497
    move-result-wide v25

    .line 498
    const/16 v5, 0x9

    .line 499
    .line 500
    invoke-interface {v15, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 501
    .line 502
    .line 503
    move-result-wide v27
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 504
    move-wide/from16 v16, v3

    .line 505
    .line 506
    move-object v3, v15

    .line 507
    move-object v15, v0

    .line 508
    :try_start_b
    invoke-virtual/range {v14 .. v28}, La/zlw0;->P1(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJJ)La/p6x0;

    .line 509
    .line 510
    .line 511
    move-result-object v0
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 512
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 513
    .line 514
    .line 515
    goto :goto_e

    .line 516
    :catchall_4
    move-exception v0

    .line 517
    goto :goto_8

    .line 518
    :catch_2
    move-exception v0

    .line 519
    goto :goto_9

    .line 520
    :catchall_5
    move-exception v0

    .line 521
    move-object v3, v15

    .line 522
    goto :goto_8

    .line 523
    :catch_3
    move-exception v0

    .line 524
    move-wide/from16 v16, v3

    .line 525
    .line 526
    move-object v3, v15

    .line 527
    goto :goto_9

    .line 528
    :goto_8
    move-object v12, v3

    .line 529
    goto/16 :goto_13

    .line 530
    .line 531
    :goto_9
    move-object v15, v3

    .line 532
    goto :goto_c

    .line 533
    :catchall_6
    move-exception v0

    .line 534
    goto :goto_a

    .line 535
    :catch_4
    move-exception v0

    .line 536
    move-wide/from16 v16, v3

    .line 537
    .line 538
    goto :goto_b

    .line 539
    :goto_a
    move-object/from16 v12, v31

    .line 540
    .line 541
    goto/16 :goto_13

    .line 542
    .line 543
    :goto_b
    move-object/from16 v15, v31

    .line 544
    .line 545
    :goto_c
    :try_start_c
    iget-object v3, v14, La/p4;->b:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v3, La/kxw0;

    .line 548
    .line 549
    iget-object v3, v3, La/kxw0;->f:La/uuw0;

    .line 550
    .line 551
    invoke-static {v3}, La/kxw0;->g(La/ryw0;)V

    .line 552
    .line 553
    .line 554
    iget-object v3, v3, La/uuw0;->g:La/quw0;

    .line 555
    .line 556
    const-string v4, "Error to querying MeasurementBatch from upload_queue. rowId"

    .line 557
    .line 558
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 559
    .line 560
    .line 561
    move-result-object v5

    .line 562
    invoke-virtual {v3, v5, v0, v4}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 563
    .line 564
    .line 565
    :goto_d
    if-eqz v15, :cond_6

    .line 566
    .line 567
    invoke-interface {v15}, Landroid/database/Cursor;->close()V

    .line 568
    .line 569
    .line 570
    :cond_6
    move-object/from16 v0, v31

    .line 571
    .line 572
    :goto_e
    if-nez v0, :cond_7

    .line 573
    .line 574
    invoke-virtual {v11}, La/m6x0;->r()La/uuw0;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    iget-object v0, v0, La/uuw0;->j:La/quw0;

    .line 579
    .line 580
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    const-string v3, "[sgtm] Queued batch doesn\'t exist. appId, rowId"

    .line 585
    .line 586
    invoke-virtual {v0, v2, v1, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    goto/16 :goto_12

    .line 590
    .line 591
    :cond_7
    iget-object v0, v0, La/p6x0;->c:Ljava/lang/String;

    .line 592
    .line 593
    iget v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->b:I

    .line 594
    .line 595
    if-ne v3, v9, :cond_a

    .line 596
    .line 597
    move-object/from16 v4, p0

    .line 598
    .line 599
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-eqz v1, :cond_8

    .line 604
    .line 605
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    :cond_8
    iget-object v0, v11, La/m6x0;->c:La/zlw0;

    .line 609
    .line 610
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 611
    .line 612
    .line 613
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    invoke-virtual {v0, v1}, La/zlw0;->t1(Ljava/lang/Long;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v11}, La/m6x0;->r()La/uuw0;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 625
    .line 626
    const-string v3, "[sgtm] queued batch deleted after successful client upload. appId, rowId"

    .line 627
    .line 628
    invoke-virtual {v0, v2, v1, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    cmp-long v0, v12, v29

    .line 632
    .line 633
    if-lez v0, :cond_d

    .line 634
    .line 635
    iget-object v0, v11, La/m6x0;->c:La/zlw0;

    .line 636
    .line 637
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 638
    .line 639
    .line 640
    iget-object v1, v0, La/p4;->b:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v1, La/kxw0;

    .line 643
    .line 644
    invoke-virtual {v0}, La/p4;->m1()V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0}, La/u5x0;->n1()V

    .line 648
    .line 649
    .line 650
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    new-instance v4, Landroid/content/ContentValues;

    .line 655
    .line 656
    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 660
    .line 661
    .line 662
    move-result-object v5

    .line 663
    const-string v7, "upload_type"

    .line 664
    .line 665
    invoke-virtual {v4, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 666
    .line 667
    .line 668
    iget-object v5, v1, La/kxw0;->k:La/lwf;

    .line 669
    .line 670
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 671
    .line 672
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 676
    .line 677
    .line 678
    move-result-wide v7

    .line 679
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 680
    .line 681
    .line 682
    move-result-object v5

    .line 683
    const-string v7, "creation_timestamp"

    .line 684
    .line 685
    invoke-virtual {v4, v7, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 686
    .line 687
    .line 688
    :try_start_d
    invoke-virtual {v0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    const-string v5, "upload_queue"

    .line 693
    .line 694
    const-string v7, "rowid=? AND app_id=? AND upload_type=?"

    .line 695
    .line 696
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object v8

    .line 700
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v6

    .line 704
    filled-new-array {v8, v2, v6}, [Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v6

    .line 708
    invoke-virtual {v0, v5, v4, v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    int-to-long v4, v0

    .line 713
    const-wide/16 v6, 0x1

    .line 714
    .line 715
    cmp-long v0, v4, v6

    .line 716
    .line 717
    if-eqz v0, :cond_9

    .line 718
    .line 719
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 720
    .line 721
    .line 722
    iget-object v0, v1, La/uuw0;->j:La/quw0;

    .line 723
    .line 724
    const-string v4, "Google Signal pending batch not updated. appId, rowId"

    .line 725
    .line 726
    invoke-virtual {v0, v2, v3, v4}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_5

    .line 727
    .line 728
    .line 729
    goto :goto_f

    .line 730
    :catch_5
    move-exception v0

    .line 731
    goto :goto_10

    .line 732
    :cond_9
    :goto_f
    invoke-virtual {v11}, La/m6x0;->r()La/uuw0;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 737
    .line 738
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 739
    .line 740
    .line 741
    move-result-object v1

    .line 742
    const-string v3, "[sgtm] queued Google Signal batch updated. appId, signalRowId"

    .line 743
    .line 744
    invoke-virtual {v0, v2, v1, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-virtual {v11, v2}, La/m6x0;->o(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    goto :goto_12

    .line 751
    :goto_10
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 752
    .line 753
    .line 754
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 755
    .line 756
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 757
    .line 758
    .line 759
    move-result-object v3

    .line 760
    const-string v4, "Failed to update google Signal pending batch. appid, rowId"

    .line 761
    .line 762
    invoke-virtual {v1, v4, v2, v3, v0}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    throw v0

    .line 766
    :cond_a
    move-object/from16 v4, p0

    .line 767
    .line 768
    if-ne v3, v10, :cond_c

    .line 769
    .line 770
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v3

    .line 774
    check-cast v3, La/j6x0;

    .line 775
    .line 776
    if-nez v3, :cond_b

    .line 777
    .line 778
    new-instance v3, La/j6x0;

    .line 779
    .line 780
    invoke-direct {v3, v11}, La/j6x0;-><init>(La/m6x0;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v4, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    goto :goto_11

    .line 787
    :cond_b
    iget v4, v3, La/j6x0;->b:I

    .line 788
    .line 789
    add-int/2addr v4, v9

    .line 790
    iput v4, v3, La/j6x0;->b:I

    .line 791
    .line 792
    invoke-virtual {v3}, La/j6x0;->a()J

    .line 793
    .line 794
    .line 795
    move-result-wide v4

    .line 796
    iput-wide v4, v3, La/j6x0;->c:J

    .line 797
    .line 798
    :goto_11
    invoke-virtual {v11}, La/m6x0;->S()La/lwf;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 806
    .line 807
    .line 808
    move-result-wide v4

    .line 809
    iget-wide v6, v3, La/j6x0;->c:J

    .line 810
    .line 811
    sub-long/2addr v6, v4

    .line 812
    invoke-virtual {v11}, La/m6x0;->r()La/uuw0;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    iget-object v3, v3, La/uuw0;->o:La/quw0;

    .line 817
    .line 818
    const-wide/16 v4, 0x3e8

    .line 819
    .line 820
    div-long/2addr v6, v4

    .line 821
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    const-string v5, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"

    .line 826
    .line 827
    invoke-virtual {v3, v5, v2, v0, v4}, La/quw0;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    :cond_c
    iget-object v0, v11, La/m6x0;->c:La/zlw0;

    .line 831
    .line 832
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 833
    .line 834
    .line 835
    iget-wide v3, v1, Lcom/google/android/gms/measurement/internal/zzaf;->a:J

    .line 836
    .line 837
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 838
    .line 839
    .line 840
    move-result-object v1

    .line 841
    invoke-virtual {v0, v1}, La/zlw0;->y1(Ljava/lang/Long;)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v11}, La/m6x0;->r()La/uuw0;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 849
    .line 850
    const-string v3, "[sgtm] increased batch retry count after failed client upload. appId, rowId"

    .line 851
    .line 852
    invoke-virtual {v0, v2, v1, v3}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    :cond_d
    :goto_12
    return-void

    .line 856
    :catchall_7
    move-exception v0

    .line 857
    move-object v12, v15

    .line 858
    :goto_13
    if-eqz v12, :cond_e

    .line 859
    .line 860
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 861
    .line 862
    .line 863
    :cond_e
    throw v0

    .line 864
    :pswitch_5
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v0, La/oyw0;

    .line 867
    .line 868
    iget-object v0, v0, La/oyw0;->a:La/m6x0;

    .line 869
    .line 870
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 871
    .line 872
    .line 873
    iget-object v2, v1, La/hf5;->b:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzpl;

    .line 876
    .line 877
    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/zzpl;->m()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    iget-object v1, v1, La/hf5;->c:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzr;

    .line 884
    .line 885
    if-nez v3, :cond_f

    .line 886
    .line 887
    iget-object v2, v2, Lcom/google/android/gms/measurement/internal/zzpl;->b:Ljava/lang/String;

    .line 888
    .line 889
    invoke-virtual {v0, v2, v1}, La/m6x0;->X(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 890
    .line 891
    .line 892
    goto :goto_14

    .line 893
    :cond_f
    invoke-virtual {v0, v2, v1}, La/m6x0;->W(Lcom/google/android/gms/measurement/internal/zzpl;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 894
    .line 895
    .line 896
    :goto_14
    return-void

    .line 897
    :pswitch_6
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v0, La/oyw0;

    .line 900
    .line 901
    iget-object v0, v0, La/oyw0;->a:La/m6x0;

    .line 902
    .line 903
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 904
    .line 905
    .line 906
    iget-object v2, v1, La/hf5;->b:Ljava/lang/Object;

    .line 907
    .line 908
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 909
    .line 910
    iget-object v1, v1, La/hf5;->c:Ljava/lang/Object;

    .line 911
    .line 912
    check-cast v1, Ljava/lang/String;

    .line 913
    .line 914
    invoke-virtual {v0, v2, v1}, La/m6x0;->c(Lcom/google/android/gms/measurement/internal/zzbh;Ljava/lang/String;)V

    .line 915
    .line 916
    .line 917
    return-void

    .line 918
    :pswitch_7
    move-object/from16 v31, v12

    .line 919
    .line 920
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v0, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 923
    .line 924
    iget-object v2, v1, La/hf5;->c:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzr;

    .line 927
    .line 928
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v1, La/oyw0;

    .line 931
    .line 932
    iget-object v1, v1, La/oyw0;->a:La/m6x0;

    .line 933
    .line 934
    const-string v3, "_cmp"

    .line 935
    .line 936
    iget-object v4, v0, Lcom/google/android/gms/measurement/internal/zzbh;->a:Ljava/lang/String;

    .line 937
    .line 938
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v3

    .line 942
    if-eqz v3, :cond_12

    .line 943
    .line 944
    iget-object v12, v0, Lcom/google/android/gms/measurement/internal/zzbh;->b:Lcom/google/android/gms/measurement/internal/zzbf;

    .line 945
    .line 946
    if-eqz v12, :cond_12

    .line 947
    .line 948
    iget-object v3, v12, Lcom/google/android/gms/measurement/internal/zzbf;->a:Landroid/os/Bundle;

    .line 949
    .line 950
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 951
    .line 952
    .line 953
    move-result v4

    .line 954
    if-nez v4, :cond_10

    .line 955
    .line 956
    goto :goto_15

    .line 957
    :cond_10
    const-string v4, "_cis"

    .line 958
    .line 959
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 960
    .line 961
    .line 962
    move-result-object v3

    .line 963
    const-string v4, "referrer broadcast"

    .line 964
    .line 965
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v4

    .line 969
    if-nez v4, :cond_11

    .line 970
    .line 971
    const-string v4, "referrer API"

    .line 972
    .line 973
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    if-eqz v3, :cond_12

    .line 978
    .line 979
    :cond_11
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    iget-object v3, v3, La/uuw0;->m:La/quw0;

    .line 984
    .line 985
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzbh;->toString()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    const-string v5, "Event has been filtered "

    .line 990
    .line 991
    invoke-virtual {v3, v4, v5}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 992
    .line 993
    .line 994
    new-instance v10, Lcom/google/android/gms/measurement/internal/zzbh;

    .line 995
    .line 996
    iget-object v13, v0, Lcom/google/android/gms/measurement/internal/zzbh;->c:Ljava/lang/String;

    .line 997
    .line 998
    iget-wide v14, v0, Lcom/google/android/gms/measurement/internal/zzbh;->d:J

    .line 999
    .line 1000
    iget-wide v3, v0, Lcom/google/android/gms/measurement/internal/zzbh;->e:J

    .line 1001
    .line 1002
    const-string v11, "_cmpx"

    .line 1003
    .line 1004
    move-wide/from16 v16, v3

    .line 1005
    .line 1006
    invoke-direct/range {v10 .. v17}, Lcom/google/android/gms/measurement/internal/zzbh;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzbf;Ljava/lang/String;JJ)V

    .line 1007
    .line 1008
    .line 1009
    move-object v0, v10

    .line 1010
    :cond_12
    :goto_15
    iget-object v3, v0, Lcom/google/android/gms/measurement/internal/zzbh;->a:Ljava/lang/String;

    .line 1011
    .line 1012
    iget-object v4, v1, La/m6x0;->a:La/uww0;

    .line 1013
    .line 1014
    iget-object v5, v1, La/m6x0;->g:La/r6x0;

    .line 1015
    .line 1016
    invoke-static {v4}, La/m6x0;->T(La/u5x0;)V

    .line 1017
    .line 1018
    .line 1019
    iget-object v6, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 1020
    .line 1021
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v7

    .line 1025
    if-eqz v7, :cond_13

    .line 1026
    .line 1027
    move-object/from16 v12, v31

    .line 1028
    .line 1029
    goto :goto_16

    .line 1030
    :cond_13
    iget-object v4, v4, La/uww0;->l:La/gww0;

    .line 1031
    .line 1032
    invoke-virtual {v4, v6}, La/dj10;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v4

    .line 1036
    move-object v12, v4

    .line 1037
    check-cast v12, La/pnw0;

    .line 1038
    .line 1039
    :goto_16
    if-eqz v12, :cond_17

    .line 1040
    .line 1041
    :try_start_e
    iget-object v4, v12, La/pnw0;->c:La/mpt0;

    .line 1042
    .line 1043
    invoke-static {v5}, La/m6x0;->T(La/u5x0;)V

    .line 1044
    .line 1045
    .line 1046
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzbh;->b:Lcom/google/android/gms/measurement/internal/zzbf;

    .line 1047
    .line 1048
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzbf;->s()Landroid/os/Bundle;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v6

    .line 1052
    invoke-static {v6, v9}, La/r6x0;->a2(Landroid/os/Bundle;Z)Ljava/util/HashMap;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v6

    .line 1056
    sget-object v7, La/cwr0;->o:[Ljava/lang/String;

    .line 1057
    .line 1058
    sget-object v8, La/cwr0;->j:[Ljava/lang/String;

    .line 1059
    .line 1060
    invoke-static {v3, v7, v8}, La/o5n0;->x(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v7

    .line 1064
    if-eqz v7, :cond_14

    .line 1065
    .line 1066
    goto :goto_17

    .line 1067
    :cond_14
    move-object v7, v3

    .line 1068
    :goto_17
    new-instance v8, La/nbw0;

    .line 1069
    .line 1070
    iget-wide v9, v0, Lcom/google/android/gms/measurement/internal/zzbh;->d:J

    .line 1071
    .line 1072
    invoke-direct {v8, v7, v9, v10, v6}, La/nbw0;-><init>(Ljava/lang/String;JLjava/util/HashMap;)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v12, v8}, La/pnw0;->a(La/nbw0;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v6
    :try_end_e
    .catch La/cqw0; {:try_start_e .. :try_end_e} :catch_6

    .line 1079
    if-nez v6, :cond_15

    .line 1080
    .line 1081
    goto/16 :goto_1a

    .line 1082
    .line 1083
    :cond_15
    iget-object v6, v4, La/mpt0;->d:Ljava/lang/Object;

    .line 1084
    .line 1085
    check-cast v6, La/nbw0;

    .line 1086
    .line 1087
    iget-object v7, v4, La/mpt0;->b:Ljava/lang/Object;

    .line 1088
    .line 1089
    check-cast v7, La/nbw0;

    .line 1090
    .line 1091
    invoke-virtual {v6, v7}, La/nbw0;->equals(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v6

    .line 1095
    if-nez v6, :cond_16

    .line 1096
    .line 1097
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 1102
    .line 1103
    const-string v6, "EES edited event"

    .line 1104
    .line 1105
    invoke-virtual {v0, v3, v6}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1106
    .line 1107
    .line 1108
    invoke-static {v5}, La/m6x0;->T(La/u5x0;)V

    .line 1109
    .line 1110
    .line 1111
    iget-object v0, v4, La/mpt0;->d:Ljava/lang/Object;

    .line 1112
    .line 1113
    check-cast v0, La/nbw0;

    .line 1114
    .line 1115
    invoke-static {v0}, La/r6x0;->q1(La/nbw0;)Lcom/google/android/gms/measurement/internal/zzbh;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    invoke-virtual {v1}, La/m6x0;->V()V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v1, v0, v2}, La/m6x0;->e(Lcom/google/android/gms/measurement/internal/zzbh;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_18

    .line 1126
    :cond_16
    invoke-virtual {v1}, La/m6x0;->V()V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v1, v0, v2}, La/m6x0;->e(Lcom/google/android/gms/measurement/internal/zzbh;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1130
    .line 1131
    .line 1132
    :goto_18
    iget-object v0, v4, La/mpt0;->c:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v0, Ljava/util/ArrayList;

    .line 1135
    .line 1136
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1137
    .line 1138
    .line 1139
    move-result v0

    .line 1140
    if-nez v0, :cond_18

    .line 1141
    .line 1142
    iget-object v0, v4, La/mpt0;->c:Ljava/lang/Object;

    .line 1143
    .line 1144
    check-cast v0, Ljava/util/ArrayList;

    .line 1145
    .line 1146
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1151
    .line 1152
    .line 1153
    move-result v3

    .line 1154
    if-eqz v3, :cond_18

    .line 1155
    .line 1156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v3

    .line 1160
    check-cast v3, La/nbw0;

    .line 1161
    .line 1162
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v4

    .line 1166
    iget-object v4, v4, La/uuw0;->o:La/quw0;

    .line 1167
    .line 1168
    iget-object v6, v3, La/nbw0;->a:Ljava/lang/String;

    .line 1169
    .line 1170
    const-string v7, "EES logging created event"

    .line 1171
    .line 1172
    invoke-virtual {v4, v6, v7}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-static {v5}, La/m6x0;->T(La/u5x0;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-static {v3}, La/r6x0;->q1(La/nbw0;)Lcom/google/android/gms/measurement/internal/zzbh;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v3

    .line 1182
    invoke-virtual {v1}, La/m6x0;->V()V

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v1, v3, v2}, La/m6x0;->e(Lcom/google/android/gms/measurement/internal/zzbh;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1186
    .line 1187
    .line 1188
    goto :goto_19

    .line 1189
    :catch_6
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v4

    .line 1193
    iget-object v4, v4, La/uuw0;->g:La/quw0;

    .line 1194
    .line 1195
    iget-object v5, v2, Lcom/google/android/gms/measurement/internal/zzr;->b:Ljava/lang/String;

    .line 1196
    .line 1197
    const-string v6, "EES error. appId, eventName"

    .line 1198
    .line 1199
    invoke-virtual {v4, v5, v3, v6}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    :goto_1a
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v4

    .line 1206
    iget-object v4, v4, La/uuw0;->o:La/quw0;

    .line 1207
    .line 1208
    const-string v5, "EES was not applied to event"

    .line 1209
    .line 1210
    invoke-virtual {v4, v3, v5}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v1}, La/m6x0;->V()V

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v1, v0, v2}, La/m6x0;->e(Lcom/google/android/gms/measurement/internal/zzbh;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1217
    .line 1218
    .line 1219
    goto :goto_1b

    .line 1220
    :cond_17
    invoke-virtual {v1}, La/m6x0;->r()La/uuw0;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v3

    .line 1224
    iget-object v3, v3, La/uuw0;->o:La/quw0;

    .line 1225
    .line 1226
    iget-object v4, v2, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 1227
    .line 1228
    const-string v5, "EES not loaded for"

    .line 1229
    .line 1230
    invoke-virtual {v3, v4, v5}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v1}, La/m6x0;->V()V

    .line 1234
    .line 1235
    .line 1236
    invoke-virtual {v1, v0, v2}, La/m6x0;->e(Lcom/google/android/gms/measurement/internal/zzbh;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1237
    .line 1238
    .line 1239
    :cond_18
    :goto_1b
    return-void

    .line 1240
    :pswitch_8
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v0, La/oyw0;

    .line 1243
    .line 1244
    iget-object v0, v0, La/oyw0;->a:La/m6x0;

    .line 1245
    .line 1246
    invoke-virtual {v0}, La/m6x0;->V()V

    .line 1247
    .line 1248
    .line 1249
    iget-object v2, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1250
    .line 1251
    check-cast v2, Lcom/google/android/gms/measurement/internal/zzah;

    .line 1252
    .line 1253
    iget-object v3, v2, Lcom/google/android/gms/measurement/internal/zzah;->c:Lcom/google/android/gms/measurement/internal/zzpl;

    .line 1254
    .line 1255
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzpl;->m()Ljava/lang/Object;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v3

    .line 1259
    iget-object v1, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1260
    .line 1261
    check-cast v1, Lcom/google/android/gms/measurement/internal/zzr;

    .line 1262
    .line 1263
    if-nez v3, :cond_19

    .line 1264
    .line 1265
    invoke-virtual {v0, v2, v1}, La/m6x0;->a0(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_1c

    .line 1269
    :cond_19
    invoke-virtual {v0, v2, v1}, La/m6x0;->Z(Lcom/google/android/gms/measurement/internal/zzah;Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 1270
    .line 1271
    .line 1272
    :goto_1c
    return-void

    .line 1273
    :pswitch_9
    move-object/from16 v31, v12

    .line 1274
    .line 1275
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;

    .line 1278
    .line 1279
    iget-object v2, v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;->a:Landroid/content/Intent;

    .line 1280
    .line 1281
    const-string v3, "google.message_id"

    .line 1282
    .line 1283
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v3

    .line 1287
    if-nez v3, :cond_1a

    .line 1288
    .line 1289
    const-string v3, "message_id"

    .line 1290
    .line 1291
    invoke-virtual {v2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v3

    .line 1295
    :cond_1a
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    if-eqz v2, :cond_1b

    .line 1300
    .line 1301
    invoke-static/range {v31 .. v31}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    goto :goto_1e

    .line 1306
    :cond_1b
    new-instance v2, Landroid/os/Bundle;

    .line 1307
    .line 1308
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1309
    .line 1310
    .line 1311
    iget-object v3, v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;->a:Landroid/content/Intent;

    .line 1312
    .line 1313
    const-string v4, "google.message_id"

    .line 1314
    .line 1315
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v4

    .line 1319
    if-nez v4, :cond_1c

    .line 1320
    .line 1321
    const-string v4, "message_id"

    .line 1322
    .line 1323
    invoke-virtual {v3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v4

    .line 1327
    :cond_1c
    const-string v3, "google.message_id"

    .line 1328
    .line 1329
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    iget-object v0, v0, Lcom/google/android/gms/cloudmessaging/CloudMessage;->a:Landroid/content/Intent;

    .line 1333
    .line 1334
    const-string v3, "google.product_id"

    .line 1335
    .line 1336
    invoke-virtual {v0, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 1337
    .line 1338
    .line 1339
    move-result v4

    .line 1340
    if-eqz v4, :cond_1d

    .line 1341
    .line 1342
    invoke-virtual {v0, v3, v11}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1343
    .line 1344
    .line 1345
    move-result v0

    .line 1346
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v12

    .line 1350
    goto :goto_1d

    .line 1351
    :cond_1d
    move-object/from16 v12, v31

    .line 1352
    .line 1353
    :goto_1d
    if-eqz v12, :cond_1e

    .line 1354
    .line 1355
    const-string v0, "google.product_id"

    .line 1356
    .line 1357
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1358
    .line 1359
    .line 1360
    move-result v3

    .line 1361
    invoke-virtual {v2, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1362
    .line 1363
    .line 1364
    :cond_1e
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1365
    .line 1366
    check-cast v0, Landroid/content/Context;

    .line 1367
    .line 1368
    const-string v3, "supports_message_handled"

    .line 1369
    .line 1370
    invoke-virtual {v2, v3, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1371
    .line 1372
    .line 1373
    invoke-static {v0}, La/sbx0;->m(Landroid/content/Context;)La/sbx0;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v3

    .line 1377
    new-instance v0, La/f8x0;

    .line 1378
    .line 1379
    monitor-enter v3

    .line 1380
    :try_start_f
    iget v4, v3, La/sbx0;->b:I

    .line 1381
    .line 1382
    add-int/lit8 v5, v4, 0x1

    .line 1383
    .line 1384
    iput v5, v3, La/sbx0;->b:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 1385
    .line 1386
    monitor-exit v3

    .line 1387
    invoke-direct {v0, v4, v8, v2, v11}, La/f8x0;-><init>(IILandroid/os/Bundle;B)V

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v3, v0}, La/sbx0;->n(La/f8x0;)Lcom/google/android/gms/tasks/Task;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    :goto_1e
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 1397
    .line 1398
    sget-object v2, La/haw0;->e:La/haw0;

    .line 1399
    .line 1400
    new-instance v3, La/ilp0;

    .line 1401
    .line 1402
    invoke-direct {v3, v1}, La/ilp0;-><init>(Ljava/lang/Object;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 1406
    .line 1407
    .line 1408
    return-void

    .line 1409
    :catchall_8
    move-exception v0

    .line 1410
    :try_start_10
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 1411
    throw v0

    .line 1412
    :pswitch_a
    move-object/from16 v31, v12

    .line 1413
    .line 1414
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v0, La/nkz;

    .line 1417
    .line 1418
    iget-object v2, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1419
    .line 1420
    check-cast v2, La/vnw0;

    .line 1421
    .line 1422
    iget-byte v3, v2, La/vnw0;->b:B

    .line 1423
    .line 1424
    if-lez v3, :cond_20

    .line 1425
    .line 1426
    iget-object v3, v2, La/vnw0;->c:Landroid/os/Bundle;

    .line 1427
    .line 1428
    if-eqz v3, :cond_1f

    .line 1429
    .line 1430
    iget-object v1, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1431
    .line 1432
    check-cast v1, Ljava/lang/String;

    .line 1433
    .line 1434
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v12

    .line 1438
    goto :goto_1f

    .line 1439
    :cond_1f
    move-object/from16 v12, v31

    .line 1440
    .line 1441
    :goto_1f
    invoke-virtual {v0, v12}, La/nkz;->onCreate(Landroid/os/Bundle;)V

    .line 1442
    .line 1443
    .line 1444
    :cond_20
    iget-byte v1, v2, La/vnw0;->b:B

    .line 1445
    .line 1446
    if-lt v1, v8, :cond_21

    .line 1447
    .line 1448
    invoke-virtual {v0}, La/nkz;->onStart()V

    .line 1449
    .line 1450
    .line 1451
    :cond_21
    iget-byte v1, v2, La/vnw0;->b:B

    .line 1452
    .line 1453
    if-lt v1, v10, :cond_22

    .line 1454
    .line 1455
    invoke-virtual {v0}, La/nkz;->onResume()V

    .line 1456
    .line 1457
    .line 1458
    :cond_22
    iget-byte v1, v2, La/vnw0;->b:B

    .line 1459
    .line 1460
    if-lt v1, v6, :cond_23

    .line 1461
    .line 1462
    invoke-virtual {v0}, La/nkz;->onStop()V

    .line 1463
    .line 1464
    .line 1465
    :cond_23
    iget-byte v1, v2, La/vnw0;->b:B

    .line 1466
    .line 1467
    if-lt v1, v5, :cond_24

    .line 1468
    .line 1469
    invoke-virtual {v0}, La/nkz;->onDestroy()V

    .line 1470
    .line 1471
    .line 1472
    :cond_24
    return-void

    .line 1473
    :pswitch_b
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v0, La/fck0;

    .line 1476
    .line 1477
    iget-object v2, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1478
    .line 1479
    check-cast v2, La/dgw0;

    .line 1480
    .line 1481
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1482
    .line 1483
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1484
    .line 1485
    iget-object v0, v0, La/fck0;->b:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v0, La/ffw0;

    .line 1488
    .line 1489
    invoke-virtual {v2, v1, v0}, La/dgw0;->d(Lcom/google/android/gms/tasks/TaskCompletionSource;La/ffw0;)V

    .line 1490
    .line 1491
    .line 1492
    return-void

    .line 1493
    :pswitch_c
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1494
    .line 1495
    move-object v3, v0

    .line 1496
    check-cast v3, La/n5a;

    .line 1497
    .line 1498
    :try_start_11
    iget-object v0, v3, La/n5a;->e:Lkotlin/coroutines/CoroutineContext;

    .line 1499
    .line 1500
    sget-object v2, Lkotlin/coroutines/d;->d1:La/ake;

    .line 1501
    .line 1502
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->minusKey(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    new-instance v2, La/wmq;

    .line 1507
    .line 1508
    iget-object v4, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1509
    .line 1510
    check-cast v4, La/zdg0;

    .line 1511
    .line 1512
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1513
    .line 1514
    check-cast v1, La/lcl0;

    .line 1515
    .line 1516
    const/4 v5, 0x0

    .line 1517
    const/16 v6, 0x1d

    .line 1518
    .line 1519
    move-object/from16 v32, v4

    .line 1520
    .line 1521
    move-object v4, v1

    .line 1522
    move-object v1, v2

    .line 1523
    move-object/from16 v2, v32

    .line 1524
    .line 1525
    invoke-direct/range {v1 .. v6}, La/wmq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1526
    .line 1527
    .line 1528
    invoke-static {v0, v1}, La/eeq;->U(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .line 1529
    .line 1530
    .line 1531
    goto :goto_20

    .line 1532
    :catchall_9
    move-exception v0

    .line 1533
    invoke-virtual {v3, v0}, La/n5a;->h(Ljava/lang/Throwable;)Z

    .line 1534
    .line 1535
    .line 1536
    :goto_20
    return-void

    .line 1537
    :pswitch_d
    move-object/from16 v31, v12

    .line 1538
    .line 1539
    :try_start_12
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v0, La/asq;

    .line 1542
    .line 1543
    invoke-virtual {v0}, La/asq;->call()Ljava/lang/Object;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v12
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_7

    .line 1547
    goto :goto_21

    .line 1548
    :catch_7
    move-object/from16 v12, v31

    .line 1549
    .line 1550
    :goto_21
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1551
    .line 1552
    check-cast v0, La/gjn;

    .line 1553
    .line 1554
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1555
    .line 1556
    check-cast v1, Landroid/os/Handler;

    .line 1557
    .line 1558
    new-instance v2, La/lfr;

    .line 1559
    .line 1560
    const/16 v3, 0xe

    .line 1561
    .line 1562
    invoke-direct {v2, v0, v12, v3}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1563
    .line 1564
    .line 1565
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1566
    .line 1567
    .line 1568
    return-void

    .line 1569
    :pswitch_e
    move-object/from16 v31, v12

    .line 1570
    .line 1571
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1572
    .line 1573
    check-cast v0, La/amf0;

    .line 1574
    .line 1575
    iget-object v2, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1576
    .line 1577
    check-cast v2, La/x15;

    .line 1578
    .line 1579
    iget-object v1, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1580
    .line 1581
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1582
    .line 1583
    invoke-virtual {v0, v2, v1}, La/amf0;->b(La/x15;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 1584
    .line 1585
    .line 1586
    iget-object v1, v0, La/amf0;->i:La/zn00;

    .line 1587
    .line 1588
    iget-object v1, v1, La/zn00;->b:Ljava/lang/Object;

    .line 1589
    .line 1590
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1591
    .line 1592
    invoke-virtual {v1, v11}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1593
    .line 1594
    .line 1595
    const-wide v3, 0x40ed4c0000000000L    # 60000.0

    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    iget-wide v5, v0, La/amf0;->a:D

    .line 1601
    .line 1602
    div-double/2addr v3, v5

    .line 1603
    iget-wide v5, v0, La/amf0;->b:D

    .line 1604
    .line 1605
    invoke-virtual {v0}, La/amf0;->a()I

    .line 1606
    .line 1607
    .line 1608
    move-result v0

    .line 1609
    int-to-double v0, v0

    .line 1610
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 1611
    .line 1612
    .line 1613
    move-result-wide v0

    .line 1614
    mul-double/2addr v0, v3

    .line 1615
    const-wide v3, 0x414b774000000000L    # 3600000.0

    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 1621
    .line 1622
    .line 1623
    move-result-wide v0

    .line 1624
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1625
    .line 1626
    const-string v4, "Delay for: "

    .line 1627
    .line 1628
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1629
    .line 1630
    .line 1631
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1632
    .line 1633
    const-string v5, "%.2f"

    .line 1634
    .line 1635
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    div-double v6, v0, v6

    .line 1641
    .line 1642
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v6

    .line 1646
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v6

    .line 1650
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v4

    .line 1654
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1655
    .line 1656
    .line 1657
    const-string v4, " s for report: "

    .line 1658
    .line 1659
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1660
    .line 1661
    .line 1662
    iget-object v2, v2, La/x15;->b:Ljava/lang/String;

    .line 1663
    .line 1664
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1668
    .line 1669
    .line 1670
    move-result-object v2

    .line 1671
    const-string v3, "FirebaseCrashlytics"

    .line 1672
    .line 1673
    invoke-static {v3, v10}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v4

    .line 1677
    if-eqz v4, :cond_25

    .line 1678
    .line 1679
    move-object/from16 v4, v31

    .line 1680
    .line 1681
    invoke-static {v3, v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1682
    .line 1683
    .line 1684
    :cond_25
    double-to-long v0, v0

    .line 1685
    :try_start_13
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_13
    .catch Ljava/lang/InterruptedException; {:try_start_13 .. :try_end_13} :catch_8

    .line 1686
    .line 1687
    .line 1688
    :catch_8
    return-void

    .line 1689
    :pswitch_f
    const-wide/16 v29, 0x0

    .line 1690
    .line 1691
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1692
    .line 1693
    check-cast v0, Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1694
    .line 1695
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1696
    .line 1697
    check-cast v1, La/ra10;

    .line 1698
    .line 1699
    iget-wide v2, v1, La/ra10;->e:J

    .line 1700
    .line 1701
    cmp-long v2, v2, v29

    .line 1702
    .line 1703
    if-lez v2, :cond_26

    .line 1704
    .line 1705
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->w(La/ra10;)V

    .line 1706
    .line 1707
    .line 1708
    goto :goto_22

    .line 1709
    :cond_26
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 1710
    .line 1711
    .line 1712
    :goto_22
    invoke-virtual {v0, v11}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1713
    .line 1714
    .line 1715
    return-void

    .line 1716
    :pswitch_10
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1717
    .line 1718
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 1719
    .line 1720
    iget-object v2, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1721
    .line 1722
    check-cast v2, La/aqv;

    .line 1723
    .line 1724
    iget-object v3, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1725
    .line 1726
    check-cast v3, Landroid/view/View;

    .line 1727
    .line 1728
    if-eqz v3, :cond_28

    .line 1729
    .line 1730
    iget-object v4, v2, La/aqv;->d:Landroid/widget/OverScroller;

    .line 1731
    .line 1732
    if-eqz v4, :cond_28

    .line 1733
    .line 1734
    invoke-virtual {v4}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 1735
    .line 1736
    .line 1737
    move-result v4

    .line 1738
    if-eqz v4, :cond_27

    .line 1739
    .line 1740
    iget-object v4, v2, La/aqv;->d:Landroid/widget/OverScroller;

    .line 1741
    .line 1742
    invoke-virtual {v4}, Landroid/widget/OverScroller;->getCurrY()I

    .line 1743
    .line 1744
    .line 1745
    move-result v4

    .line 1746
    invoke-virtual {v2, v0, v3, v4}, La/aqv;->D(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 1747
    .line 1748
    .line 1749
    invoke-virtual {v3, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1750
    .line 1751
    .line 1752
    goto :goto_23

    .line 1753
    :cond_27
    invoke-virtual {v2, v0, v3}, La/aqv;->B(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)V

    .line 1754
    .line 1755
    .line 1756
    :cond_28
    :goto_23
    return-void

    .line 1757
    :pswitch_11
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1758
    .line 1759
    check-cast v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;

    .line 1760
    .line 1761
    iget-object v3, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1762
    .line 1763
    check-cast v3, Landroid/widget/ImageView;

    .line 1764
    .line 1765
    iget-object v1, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1766
    .line 1767
    check-cast v1, Ljava/util/Map;

    .line 1768
    .line 1769
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v1

    .line 1773
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v1

    .line 1777
    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1778
    .line 1779
    .line 1780
    move-result v4

    .line 1781
    if-eqz v4, :cond_2c

    .line 1782
    .line 1783
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v4

    .line 1787
    check-cast v4, Ljava/util/Map$Entry;

    .line 1788
    .line 1789
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v4

    .line 1793
    check-cast v4, Lkotlin/Pair;

    .line 1794
    .line 1795
    iget-object v5, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1796
    .line 1797
    check-cast v5, La/wof;

    .line 1798
    .line 1799
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1800
    .line 1801
    check-cast v4, Landroid/widget/ImageView;

    .line 1802
    .line 1803
    iget v6, v5, La/wof;->f:I

    .line 1804
    .line 1805
    iget v9, v5, La/wof;->c:I

    .line 1806
    .line 1807
    iget v10, v5, La/wof;->b:I

    .line 1808
    .line 1809
    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1810
    .line 1811
    .line 1812
    iget v6, v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->u:I

    .line 1813
    .line 1814
    div-int/2addr v6, v8

    .line 1815
    if-eq v10, v2, :cond_29

    .line 1816
    .line 1817
    if-eq v9, v2, :cond_29

    .line 1818
    .line 1819
    move v12, v11

    .line 1820
    goto :goto_25

    .line 1821
    :cond_29
    move v12, v7

    .line 1822
    :goto_25
    invoke-virtual {v4, v12}, Landroid/view/View;->setVisibility(I)V

    .line 1823
    .line 1824
    .line 1825
    iget-short v12, v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->w:S

    .line 1826
    .line 1827
    add-int/2addr v10, v12

    .line 1828
    int-to-float v10, v10

    .line 1829
    iget v12, v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->y:F

    .line 1830
    .line 1831
    div-float/2addr v10, v12

    .line 1832
    const/high16 v13, 0x44800000    # 1024.0f

    .line 1833
    .line 1834
    div-float/2addr v10, v13

    .line 1835
    const/high16 v14, 0x42c80000    # 100.0f

    .line 1836
    .line 1837
    mul-float/2addr v10, v14

    .line 1838
    iget-short v15, v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->x:S

    .line 1839
    .line 1840
    add-int/2addr v9, v15

    .line 1841
    int-to-float v9, v9

    .line 1842
    div-float/2addr v9, v12

    .line 1843
    div-float/2addr v9, v13

    .line 1844
    mul-float/2addr v9, v14

    .line 1845
    iget-object v12, v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->z:Ljava/util/List;

    .line 1846
    .line 1847
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 1848
    .line 1849
    .line 1850
    move-result v12

    .line 1851
    if-nez v12, :cond_2b

    .line 1852
    .line 1853
    iget-object v12, v0, Lorg/xplatform/cyber/game/counterstrike/impl/presentation/map_movement/Cs2MapMovementView;->z:Ljava/util/List;

    .line 1854
    .line 1855
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v12

    .line 1859
    :goto_26
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 1860
    .line 1861
    .line 1862
    move-result v13

    .line 1863
    if-eqz v13, :cond_2b

    .line 1864
    .line 1865
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v13

    .line 1869
    check-cast v13, La/xof;

    .line 1870
    .line 1871
    iget v15, v5, La/wof;->d:I

    .line 1872
    .line 1873
    iget v8, v13, La/xof;->b:I

    .line 1874
    .line 1875
    if-le v15, v8, :cond_2a

    .line 1876
    .line 1877
    iget v8, v13, La/xof;->a:I

    .line 1878
    .line 1879
    if-ge v15, v8, :cond_2a

    .line 1880
    .line 1881
    iget v8, v13, La/xof;->c:F

    .line 1882
    .line 1883
    add-float/2addr v10, v8

    .line 1884
    iget v8, v13, La/xof;->d:F

    .line 1885
    .line 1886
    add-float/2addr v9, v8

    .line 1887
    :cond_2a
    const/4 v8, 0x2

    .line 1888
    goto :goto_26

    .line 1889
    :cond_2b
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 1890
    .line 1891
    .line 1892
    move-result v5

    .line 1893
    int-to-float v5, v5

    .line 1894
    mul-float/2addr v5, v10

    .line 1895
    div-float/2addr v5, v14

    .line 1896
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 1897
    .line 1898
    .line 1899
    move-result v8

    .line 1900
    int-to-float v8, v8

    .line 1901
    mul-float/2addr v8, v9

    .line 1902
    div-float/2addr v8, v14

    .line 1903
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v4

    .line 1907
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    .line 1908
    .line 1909
    .line 1910
    move-result v9

    .line 1911
    int-to-float v9, v9

    .line 1912
    sub-float/2addr v9, v8

    .line 1913
    int-to-float v6, v6

    .line 1914
    sub-float/2addr v9, v6

    .line 1915
    invoke-virtual {v4, v9}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v4

    .line 1919
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    .line 1920
    .line 1921
    .line 1922
    move-result v8

    .line 1923
    int-to-float v8, v8

    .line 1924
    add-float/2addr v8, v5

    .line 1925
    sub-float/2addr v8, v6

    .line 1926
    invoke-virtual {v4, v8}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 1927
    .line 1928
    .line 1929
    const/4 v8, 0x2

    .line 1930
    goto/16 :goto_24

    .line 1931
    .line 1932
    :cond_2c
    return-void

    .line 1933
    :pswitch_12
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 1934
    .line 1935
    check-cast v0, La/e7e;

    .line 1936
    .line 1937
    sget-object v3, La/e7e;->d2:La/kwd;

    .line 1938
    .line 1939
    invoke-virtual {v0}, La/e7e;->I0()I

    .line 1940
    .line 1941
    .line 1942
    move-result v3

    .line 1943
    if-eq v3, v2, :cond_2d

    .line 1944
    .line 1945
    invoke-virtual {v0}, La/e7e;->G0()La/d6e;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    invoke-virtual {v0}, La/zz3;->d()I

    .line 1950
    .line 1951
    .line 1952
    move-result v0

    .line 1953
    sub-int/2addr v0, v10

    .line 1954
    if-ge v3, v0, :cond_2d

    .line 1955
    .line 1956
    goto :goto_27

    .line 1957
    :cond_2d
    move v9, v11

    .line 1958
    :goto_27
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1959
    .line 1960
    check-cast v0, Landroid/widget/ImageView;

    .line 1961
    .line 1962
    if-eqz v9, :cond_2e

    .line 1963
    .line 1964
    move v2, v11

    .line 1965
    goto :goto_28

    .line 1966
    :cond_2e
    move v2, v7

    .line 1967
    :goto_28
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1968
    .line 1969
    .line 1970
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 1971
    .line 1972
    check-cast v0, Landroid/widget/TextView;

    .line 1973
    .line 1974
    if-eqz v9, :cond_2f

    .line 1975
    .line 1976
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v1

    .line 1980
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1981
    .line 1982
    .line 1983
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 1984
    .line 1985
    .line 1986
    move-result v1

    .line 1987
    if-lez v1, :cond_2f

    .line 1988
    .line 1989
    move v7, v11

    .line 1990
    :cond_2f
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1991
    .line 1992
    .line 1993
    return-void

    .line 1994
    :pswitch_13
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 1995
    .line 1996
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 1997
    .line 1998
    check-cast v0, La/cp;

    .line 1999
    .line 2000
    iget-object v2, v0, La/cp;->u:La/yfu0;

    .line 2001
    .line 2002
    check-cast v2, La/v1k;

    .line 2003
    .line 2004
    iget-object v2, v2, La/v1k;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 2005
    .line 2006
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 2007
    .line 2008
    check-cast v1, La/yos0;

    .line 2009
    .line 2010
    invoke-static {v1}, La/ibc;->j0(La/yos0;)Ljava/lang/String;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v1

    .line 2014
    sget-object v3, La/f2x;->a:La/f2x;

    .line 2015
    .line 2016
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v3

    .line 2020
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 2021
    .line 2022
    .line 2023
    move-result-object v0

    .line 2024
    check-cast v0, La/k1d;

    .line 2025
    .line 2026
    iget-object v0, v0, La/k1d;->a:La/g0x;

    .line 2027
    .line 2028
    iget-object v0, v0, La/g0x;->d:Ljava/lang/String;

    .line 2029
    .line 2030
    invoke-static {v2, v1, v3, v0}, La/u0d;->f(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 2031
    .line 2032
    .line 2033
    return-void

    .line 2034
    :pswitch_14
    iget-object v0, v1, La/hf5;->b:Ljava/lang/Object;

    .line 2035
    .line 2036
    check-cast v0, Landroid/view/View;

    .line 2037
    .line 2038
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 2039
    .line 2040
    invoke-static {v0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 2041
    .line 2042
    .line 2043
    move-result-object v0

    .line 2044
    if-eqz v0, :cond_30

    .line 2045
    .line 2046
    iget-object v0, v0, La/xiv0;->a:La/uiv0;

    .line 2047
    .line 2048
    invoke-virtual {v0, v7}, La/uiv0;->u(I)Z

    .line 2049
    .line 2050
    .line 2051
    move-result v0

    .line 2052
    if-ne v0, v9, :cond_30

    .line 2053
    .line 2054
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 2055
    .line 2056
    check-cast v0, La/iw5;

    .line 2057
    .line 2058
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 2059
    .line 2060
    .line 2061
    move-result v0

    .line 2062
    if-eqz v0, :cond_30

    .line 2063
    .line 2064
    iget-object v0, v1, La/hf5;->d:Ljava/lang/Object;

    .line 2065
    .line 2066
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2067
    .line 2068
    invoke-virtual {v0, v10}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 2069
    .line 2070
    .line 2071
    :cond_30
    return-void

    .line 2072
    :pswitch_15
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 2073
    .line 2074
    check-cast v0, La/if5;

    .line 2075
    .line 2076
    iget-object v0, v0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 2077
    .line 2078
    if-eqz v0, :cond_31

    .line 2079
    .line 2080
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 2081
    .line 2082
    check-cast v1, Landroid/view/ViewGroup;

    .line 2083
    .line 2084
    sget-object v2, La/jmu0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2085
    .line 2086
    invoke-virtual {v1}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v1

    .line 2090
    invoke-static {v0, v1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 2091
    .line 2092
    .line 2093
    :cond_31
    return-void

    .line 2094
    :pswitch_16
    iget-object v0, v1, La/hf5;->c:Ljava/lang/Object;

    .line 2095
    .line 2096
    check-cast v0, La/if5;

    .line 2097
    .line 2098
    iput-boolean v11, v0, La/if5;->i:Z

    .line 2099
    .line 2100
    iget-object v0, v0, La/if5;->c:Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 2101
    .line 2102
    if-eqz v0, :cond_32

    .line 2103
    .line 2104
    iget-object v1, v1, La/hf5;->d:Ljava/lang/Object;

    .line 2105
    .line 2106
    check-cast v1, Landroid/content/res/ColorStateList;

    .line 2107
    .line 2108
    invoke-static {v0, v1}, La/jmu0;->j(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 2109
    .line 2110
    .line 2111
    :cond_32
    return-void

    .line 2112
    nop

    .line 2113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hf5;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, La/hf5;->d:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/pb90;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0xe

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const-string v0, "propagating=["

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, "]"

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method
