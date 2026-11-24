.class public final La/k6k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r6k0;

.field public final b:La/t6k0;

.field public final c:La/x5k0;

.field public final d:La/ukg0;

.field public final e:La/v34;

.field public final f:La/u24;

.field public final g:La/tn30;

.field public final h:La/r1e;

.field public final i:La/jt2;

.field public final j:La/qoj0;

.field public final k:La/qoj0;

.field public final l:La/sje;

.field public m:La/c4m0;

.field public n:La/c4m0;

.field public o:La/c4m0;

.field public p:La/c4m0;

.field public q:La/c4m0;

.field public r:La/c4m0;

.field public s:La/t5k0;

.field public final t:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final u:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(La/r6k0;La/t6k0;La/x5k0;La/ukg0;La/v34;La/u24;La/tn30;La/r1e;La/jt2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/k6k0;->a:La/r6k0;

    .line 32
    .line 33
    iput-object p2, p0, La/k6k0;->b:La/t6k0;

    .line 34
    .line 35
    iput-object p3, p0, La/k6k0;->c:La/x5k0;

    .line 36
    .line 37
    iput-object p4, p0, La/k6k0;->d:La/ukg0;

    .line 38
    .line 39
    iput-object p5, p0, La/k6k0;->e:La/v34;

    .line 40
    .line 41
    iput-object p6, p0, La/k6k0;->f:La/u24;

    .line 42
    .line 43
    iput-object p7, p0, La/k6k0;->g:La/tn30;

    .line 44
    .line 45
    iput-object p8, p0, La/k6k0;->h:La/r1e;

    .line 46
    .line 47
    iput-object p9, p0, La/k6k0;->i:La/jt2;

    .line 48
    .line 49
    const/4 p1, 0x0

    .line 50
    const/4 p2, 0x5

    .line 51
    const/4 p3, 0x0

    .line 52
    const/16 p4, 0x10

    .line 53
    .line 54
    invoke-static {p3, p4, p1, p2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/k6k0;->j:La/qoj0;

    .line 59
    .line 60
    iput-object p1, p0, La/k6k0;->k:La/qoj0;

    .line 61
    .line 62
    sget-object p1, La/tvk;->a:La/rwj;

    .line 63
    .line 64
    sget-object p1, La/dvj;->c:La/dvj;

    .line 65
    .line 66
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iput-object p1, p0, La/k6k0;->l:La/sje;

    .line 82
    .line 83
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 84
    .line 85
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, La/k6k0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 89
    .line 90
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 91
    .line 92
    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, La/k6k0;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/k6k0;->s:La/t5k0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput-object v2, v0, La/k6k0;->s:La/t5k0;

    .line 7
    .line 8
    iget-object v3, v0, La/k6k0;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, La/k6k0;->c()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, La/k6k0;->m:La/c4m0;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v3, v0, La/k6k0;->o:La/c4m0;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v5, v4

    .line 31
    :goto_0
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {v3, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    iput-object v2, v0, La/k6k0;->o:La/c4m0;

    .line 37
    .line 38
    if-eqz v5, :cond_3

    .line 39
    .line 40
    iget-object v3, v0, La/k6k0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 43
    .line 44
    .line 45
    :cond_3
    iget-object v3, v0, La/k6k0;->p:La/c4m0;

    .line 46
    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    invoke-virtual {v3, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    iput-object v2, v0, La/k6k0;->p:La/c4m0;

    .line 53
    .line 54
    iget-object v3, v0, La/k6k0;->q:La/c4m0;

    .line 55
    .line 56
    if-eqz v3, :cond_5

    .line 57
    .line 58
    invoke-virtual {v3, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 59
    .line 60
    .line 61
    :cond_5
    iput-object v2, v0, La/k6k0;->q:La/c4m0;

    .line 62
    .line 63
    iget-object v3, v0, La/k6k0;->c:La/x5k0;

    .line 64
    .line 65
    iget-object v5, v3, La/x5k0;->g:La/c4m0;

    .line 66
    .line 67
    if-eqz v5, :cond_6

    .line 68
    .line 69
    invoke-virtual {v5, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 70
    .line 71
    .line 72
    :cond_6
    iput-object v2, v3, La/x5k0;->g:La/c4m0;

    .line 73
    .line 74
    iget-object v5, v3, La/x5k0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 75
    .line 76
    iget-object v6, v3, La/x5k0;->a:La/r6k0;

    .line 77
    .line 78
    iget-object v7, v6, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 79
    .line 80
    if-eqz v7, :cond_7

    .line 81
    .line 82
    :try_start_0
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    check-cast v7, La/y5k0;

    .line 87
    .line 88
    iget-object v7, v7, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 89
    .line 90
    if-eqz v7, :cond_7

    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    check-cast v5, La/y5k0;

    .line 97
    .line 98
    iget-boolean v5, v5, La/y5k0;->f:Z

    .line 99
    .line 100
    if-nez v5, :cond_7

    .line 101
    .line 102
    invoke-interface {v7}, Landroid/javax/sip/ClientTransaction;->createCancel()Landroid/javax/sip/message/Request;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-interface {v6, v5}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-interface {v5}, Landroid/javax/sip/ClientTransaction;->sendRequest()V

    .line 121
    .line 122
    .line 123
    iget-object v5, v3, La/x5k0;->c:La/jt2;

    .line 124
    .line 125
    const-string v6, "cancelSent"

    .line 126
    .line 127
    const-string v7, "CANCEL sent"

    .line 128
    .line 129
    iget-object v5, v5, La/jt2;->a:La/n6k0;

    .line 130
    .line 131
    invoke-virtual {v5, v6, v7}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    :catch_0
    :cond_7
    invoke-virtual {v3}, La/x5k0;->a()V

    .line 135
    .line 136
    .line 137
    iget-object v3, v0, La/k6k0;->b:La/t6k0;

    .line 138
    .line 139
    iget-object v5, v3, La/t6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 140
    .line 141
    iget-object v6, v3, La/t6k0;->a:La/r6k0;

    .line 142
    .line 143
    iget-object v7, v6, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 144
    .line 145
    if-eqz v7, :cond_9

    .line 146
    .line 147
    :try_start_1
    iget-object v7, v3, La/t6k0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 148
    .line 149
    invoke-virtual {v7, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    iget-object v6, v3, La/t6k0;->h:La/s6k0;

    .line 157
    .line 158
    if-eqz v6, :cond_8

    .line 159
    .line 160
    invoke-interface {v4, v6}, Landroid/javax/sip/SipProvider;->removeSipListener(Landroid/javax/sip/SipListener;)V

    .line 161
    .line 162
    .line 163
    :cond_8
    iput-object v2, v3, La/t6k0;->h:La/s6k0;

    .line 164
    .line 165
    invoke-static {}, La/r6k0;->b()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    iget-wide v6, v3, La/t6k0;->i:J

    .line 170
    .line 171
    const-wide/16 v8, 0x1

    .line 172
    .line 173
    add-long v12, v6, v8

    .line 174
    .line 175
    iput-wide v12, v3, La/t6k0;->i:J

    .line 176
    .line 177
    iget-object v7, v3, La/t6k0;->e:La/zx10;

    .line 178
    .line 179
    iget-object v8, v3, La/t6k0;->j:Ljava/lang/String;

    .line 180
    .line 181
    iget-object v9, v3, La/t6k0;->k:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v11, v3, La/t6k0;->l:Ljava/lang/String;

    .line 184
    .line 185
    iget-object v14, v3, La/t6k0;->m:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v15, v3, La/t6k0;->n:Ljava/util/Map;

    .line 188
    .line 189
    const/16 v16, 0x0

    .line 190
    .line 191
    invoke-virtual/range {v7 .. v16}, La/zx10;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;I)Landroid/javax/sip/message/Request;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-interface {v4, v6}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-interface {v4}, Landroid/javax/sip/ClientTransaction;->sendRequest()V

    .line 203
    .line 204
    .line 205
    iget-object v3, v3, La/t6k0;->c:La/jt2;

    .line 206
    .line 207
    const-string v4, "unregisterSent"

    .line 208
    .line 209
    const-string v6, "UNREGISTER sent"

    .line 210
    .line 211
    iget-object v3, v3, La/jt2;->a:La/n6k0;

    .line 212
    .line 213
    invoke-virtual {v3, v4, v6}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 214
    .line 215
    .line 216
    :catch_1
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_9
    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :goto_1
    iget-object v3, v0, La/k6k0;->r:La/c4m0;

    .line 224
    .line 225
    if-eqz v3, :cond_a

    .line 226
    .line 227
    invoke-virtual {v3, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 228
    .line 229
    .line 230
    :cond_a
    sget-object v3, La/dvj;->c:La/dvj;

    .line 231
    .line 232
    new-instance v4, La/z8b0;

    .line 233
    .line 234
    const/16 v5, 0x15

    .line 235
    .line 236
    invoke-direct {v4, v0, v2, v5}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 237
    .line 238
    .line 239
    const/4 v5, 0x2

    .line 240
    iget-object v6, v0, La/k6k0;->l:La/sje;

    .line 241
    .line 242
    invoke-static {v6, v3, v2, v4, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iput-object v2, v0, La/k6k0;->r:La/c4m0;

    .line 247
    .line 248
    if-eqz v1, :cond_b

    .line 249
    .line 250
    sget-object v1, La/b6k0;->a:La/b6k0;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, La/k6k0;->b(La/g6k0;)V

    .line 253
    .line 254
    .line 255
    :cond_b
    return-void
.end method

.method public final b(La/g6k0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/k6k0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p0, p0, La/k6k0;->j:La/qoj0;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final c()V
    .locals 6

    .line 1
    new-instance v0, La/h6k0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, p0, v1, v2}, La/h6k0;-><init>(La/k6k0;La/yje;B)V

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    iget-object v4, p0, La/k6k0;->l:La/sje;

    .line 10
    .line 11
    invoke-static {v4, v1, v1, v0, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/k6k0;->n:La/c4m0;

    .line 16
    .line 17
    iget-object p0, p0, La/k6k0;->c:La/x5k0;

    .line 18
    .line 19
    iget-object v0, p0, La/x5k0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    iget-object v3, p0, La/x5k0;->a:La/r6k0;

    .line 22
    .line 23
    iget-object v4, v3, La/r6k0;->d:Landroid/javax/sip/SipProvider;

    .line 24
    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, La/y5k0;

    .line 32
    .line 33
    iget-object v4, v4, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, La/y5k0;

    .line 42
    .line 43
    iget-boolean v5, v5, La/y5k0;->d:Z

    .line 44
    .line 45
    if-eqz v5, :cond_0

    .line 46
    .line 47
    move-object v1, v4

    .line 48
    :cond_0
    if-eqz v1, :cond_1

    .line 49
    .line 50
    const-string v4, "BYE"

    .line 51
    .line 52
    invoke-interface {v1, v4}, Landroid/javax/sip/Dialog;->createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v3, v4}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v4, La/w5k0;

    .line 71
    .line 72
    invoke-direct {v4, v2}, La/w5k0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    invoke-interface {v1, v3}, Landroid/javax/sip/Dialog;->sendRequest(Landroid/javax/sip/ClientTransaction;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, La/x5k0;->c:La/jt2;

    .line 82
    .line 83
    const-string v1, "byeSent"

    .line 84
    .line 85
    const-string v2, "BYE sent"

    .line 86
    .line 87
    iget-object v0, v0, La/jt2;->a:La/n6k0;

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    :catch_0
    :cond_1
    invoke-virtual {p0}, La/x5k0;->a()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final d(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/k6k0;->t:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    const-string p1, ""

    .line 22
    .line 23
    :cond_0
    const-string v1, ": "

    .line 24
    .line 25
    invoke-static {v0, v1, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v0, p0, La/k6k0;->i:La/jt2;

    .line 30
    .line 31
    iget-object v0, v0, La/jt2;->a:La/n6k0;

    .line 32
    .line 33
    const-string v1, "callFailed"

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sget-object p1, La/d6k0;->a:La/d6k0;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, La/k6k0;->b(La/g6k0;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final e(La/t5k0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/k6k0;->a()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/k6k0;->s:La/t5k0;

    .line 8
    .line 9
    iget-object v0, p0, La/k6k0;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    new-instance v0, La/h6k0;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    invoke-direct {v0, p0, v5, v1}, La/h6k0;-><init>(La/k6k0;La/yje;B)V

    .line 20
    .line 21
    .line 22
    iget-object v7, p0, La/k6k0;->l:La/sje;

    .line 23
    .line 24
    const/4 v8, 0x3

    .line 25
    invoke-static {v7, v5, v5, v0, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/k6k0;->p:La/c4m0;

    .line 30
    .line 31
    new-instance v1, La/gc1;

    .line 32
    .line 33
    const/16 v6, 0x14

    .line 34
    .line 35
    move-object v2, p0

    .line 36
    move-object v3, p1

    .line 37
    invoke-direct/range {v1 .. v6}, La/gc1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v7, v5, v5, v1, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iput-object p0, v2, La/k6k0;->m:La/c4m0;

    .line 45
    .line 46
    return-void
.end method
