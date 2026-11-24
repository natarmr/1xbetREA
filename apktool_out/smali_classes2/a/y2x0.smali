.class public final La/y2x0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/tzw0;


# direct methods
.method public constructor <init>(La/tzw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y2x0;->a:La/tzw0;

    .line 5
    .line 6
    return-void
.end method

.method public static b(Lcom/google/android/gms/tasks/Task;)La/d1;
    .locals 4

    .line 1
    new-instance v0, La/n0x0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, La/n0x0;->h:Lcom/google/android/gms/tasks/Task;

    .line 7
    .line 8
    new-instance v1, La/rkt0;

    .line 9
    .line 10
    const/16 v2, 0xd

    .line 11
    .line 12
    invoke-direct {v1, v0, v2}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    sget-object v2, La/ank;->a:La/ank;

    .line 16
    .line 17
    invoke-virtual {p0, v2, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    sget p0, La/f1;->l:I

    .line 21
    .line 22
    new-instance p0, La/d1;

    .line 23
    .line 24
    const-class v1, La/qa3;

    .line 25
    .line 26
    sget-object v3, La/u2x0;->a:La/u2x0;

    .line 27
    .line 28
    invoke-direct {p0, v0, v1, v3}, La/f1;-><init>(La/ig00;Ljava/lang/Class;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, p0}, La/n2x;->I(Ljava/util/concurrent/Executor;La/epq;)Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, p0, v1}, La/l2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method


# virtual methods
.method public final a(La/k7x0;)La/d1;
    .locals 6

    .line 1
    iget-object p0, p0, La/y2x0;->a:La/tzw0;

    .line 2
    .line 3
    const-class v0, La/i0x0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, La/nav;->g:Landroid/os/Looper;

    .line 10
    .line 11
    const-string v3, "Looper must not be null"

    .line 12
    .line 13
    invoke-static {v2, v3}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v3, La/fbv;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v4, La/vox;

    .line 22
    .line 23
    invoke-direct {v4, v2}, La/vox;-><init>(Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object v4, v3, La/fbv;->a:Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v2, La/qg00;

    .line 29
    .line 30
    invoke-static {v1}, La/s0x;->E(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v2, p1, v1}, La/qg00;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, v3, La/fbv;->b:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {}, La/p7x;->w()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    const-string p1, "__PH_INTERNAL__NO_PROCESS__"

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    new-instance v4, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    add-int/2addr v1, v2

    .line 68
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, "|"

    .line 75
    .line 76
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    new-instance v0, La/glt0;

    .line 87
    .line 88
    invoke-direct {v0, p0, p1, v3}, La/glt0;-><init>(La/tzw0;Ljava/lang/String;La/fbv;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, La/qow0;->r:La/qow0;

    .line 92
    .line 93
    new-instance v1, La/td9;

    .line 94
    .line 95
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v3, v1, La/td9;->d:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v0, v1, La/td9;->b:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object p1, v1, La/td9;->c:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object p1, La/f1t0;->j:Lcom/google/android/gms/common/Feature;

    .line 105
    .line 106
    filled-new-array {p1}, [Lcom/google/android/gms/common/Feature;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, v1, La/td9;->e:Ljava/lang/Object;

    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    iput-boolean p1, v1, La/td9;->a:Z

    .line 114
    .line 115
    iget-object v0, v1, La/td9;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/fbv;

    .line 118
    .line 119
    iget-object v0, v0, La/fbv;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, La/qg00;

    .line 122
    .line 123
    const-string v2, "Key must not be null"

    .line 124
    .line 125
    invoke-static {v0, v2}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v2, La/o24;

    .line 129
    .line 130
    iget-object v3, v1, La/td9;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, La/fbv;

    .line 133
    .line 134
    iget-object v4, v1, La/td9;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v4, [Lcom/google/android/gms/common/Feature;

    .line 137
    .line 138
    iget-boolean v5, v1, La/td9;->a:Z

    .line 139
    .line 140
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object v1, v2, La/o24;->d:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object v3, v2, La/o24;->b:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v4, v2, La/o24;->c:Ljava/lang/Object;

    .line 148
    .line 149
    iput-boolean v5, v2, La/o24;->a:Z

    .line 150
    .line 151
    new-instance v4, La/zlt0;

    .line 152
    .line 153
    invoke-direct {v4, v1, v0}, La/zlt0;-><init>(La/td9;La/qg00;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v3, La/fbv;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, La/qg00;

    .line 159
    .line 160
    const-string v1, "Listener has already been released."

    .line 161
    .line 162
    invoke-static {v0, v1}, La/s0x;->I(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, La/nav;->k:La/sav;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 171
    .line 172
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1, p1, p0}, La/sav;->c(Lcom/google/android/gms/tasks/TaskCompletionSource;ILa/nav;)V

    .line 176
    .line 177
    .line 178
    new-instance p1, La/y9w0;

    .line 179
    .line 180
    new-instance v3, La/q9w0;

    .line 181
    .line 182
    invoke-direct {v3, v2, v4}, La/q9w0;-><init>(La/o24;La/zlt0;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p1, v3, v1}, La/y9w0;-><init>(La/q9w0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 186
    .line 187
    .line 188
    iget-object v2, v0, La/sav;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 189
    .line 190
    new-instance v3, La/p9w0;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-direct {v3, p1, v2, p0}, La/p9w0;-><init>(La/caw0;ILa/nav;)V

    .line 197
    .line 198
    .line 199
    iget-object p0, v0, La/sav;->m:La/jaw0;

    .line 200
    .line 201
    const/16 p1, 0x8

    .line 202
    .line 203
    invoke-virtual {p0, p1, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-static {p0}, La/y2x0;->b(Lcom/google/android/gms/tasks/Task;)La/d1;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0
.end method
