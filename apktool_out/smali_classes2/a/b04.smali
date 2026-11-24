.class public final La/b04;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/b04;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p0, p0, La/b04;->i:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, La/b04;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {p0, v0, p2, v1}, La/b04;-><init>(ILa/yje;B)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput-boolean p1, p0, La/b04;->j:Z

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance p0, La/b04;

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    const/4 v0, 0x6

    .line 26
    invoke-direct {p0, p1, p2, v0}, La/b04;-><init>(ILa/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_1
    new-instance p0, La/b04;

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    const/4 v1, 0x5

    .line 34
    invoke-direct {p0, v0, p2, v1}, La/b04;-><init>(ILa/yje;B)V

    .line 35
    .line 36
    .line 37
    check-cast p1, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput-boolean p1, p0, La/b04;->j:Z

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_2
    new-instance p0, La/b04;

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    const/4 v1, 0x4

    .line 50
    invoke-direct {p0, v0, p2, v1}, La/b04;-><init>(ILa/yje;B)V

    .line 51
    .line 52
    .line 53
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput-boolean p1, p0, La/b04;->j:Z

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_3
    new-instance p0, La/b04;

    .line 63
    .line 64
    const/4 p1, 0x2

    .line 65
    const/4 v0, 0x3

    .line 66
    invoke-direct {p0, p1, p2, v0}, La/b04;-><init>(ILa/yje;B)V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_4
    new-instance p0, La/b04;

    .line 71
    .line 72
    const/4 p1, 0x2

    .line 73
    const/4 v0, 0x2

    .line 74
    invoke-direct {p0, p1, p2, v0}, La/b04;-><init>(ILa/yje;B)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_5
    new-instance p0, La/b04;

    .line 79
    .line 80
    const/4 p1, 0x2

    .line 81
    const/4 v0, 0x1

    .line 82
    invoke-direct {p0, p1, p2, v0}, La/b04;-><init>(ILa/yje;B)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_6
    new-instance p0, La/b04;

    .line 87
    .line 88
    const/4 v0, 0x2

    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-direct {p0, v0, p2, v1}, La/b04;-><init>(ILa/yje;B)V

    .line 91
    .line 92
    .line 93
    check-cast p1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    iput-boolean p1, p0, La/b04;->j:Z

    .line 100
    .line 101
    return-object p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/b04;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/b04;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/b04;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    check-cast p2, La/yje;

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/b04;

    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    check-cast p2, La/yje;

    .line 69
    .line 70
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/b04;

    .line 75
    .line 76
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_3
    check-cast p1, La/vne;

    .line 84
    .line 85
    check-cast p2, La/yje;

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    check-cast p0, La/b04;

    .line 92
    .line 93
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :pswitch_4
    check-cast p1, La/vne;

    .line 101
    .line 102
    check-cast p2, La/yje;

    .line 103
    .line 104
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/b04;

    .line 109
    .line 110
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_5
    check-cast p1, La/vne;

    .line 118
    .line 119
    check-cast p2, La/yje;

    .line 120
    .line 121
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, La/b04;

    .line 126
    .line 127
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 128
    .line 129
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    check-cast p2, La/yje;

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2}, La/b04;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, La/b04;

    .line 146
    .line 147
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    invoke-virtual {p0, p1}, La/b04;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/b04;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x7530

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/b04;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    xor-int/2addr p0, v4

    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-boolean v1, p0, La/b04;->j:Z

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    if-ne v1, v4, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object p1, v3

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 46
    .line 47
    monitor-enter v1

    .line 48
    :try_start_0
    invoke-static {}, La/nfq;->d()La/nfq;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Lcom/google/firebase/messaging/FirebaseMessaging;->getInstance(La/nfq;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    monitor-exit v1

    .line 57
    iget-object v1, p1, Lcom/google/firebase/messaging/FirebaseMessaging;->d:La/a6u;

    .line 58
    .line 59
    invoke-virtual {v1}, La/a6u;->J()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app\'s manifest."

    .line 68
    .line 69
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 78
    .line 79
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v2, p1, Lcom/google/firebase/messaging/FirebaseMessaging;->g:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 83
    .line 84
    new-instance v3, La/llo;

    .line 85
    .line 86
    const/4 v5, 0x2

    .line 87
    invoke-direct {v3, p1, v1, v5}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iput-boolean v4, p0, La/b04;->j:Z

    .line 101
    .line 102
    invoke-static {p1, p0}, La/msm0;->h(Lcom/google/android/gms/tasks/Task;La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v0, :cond_3

    .line 107
    .line 108
    move-object p1, v0

    .line 109
    :cond_3
    :goto_1
    return-object p1

    .line 110
    :catchall_0
    move-exception p0

    .line 111
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    throw p0

    .line 113
    :pswitch_1
    iget-boolean p0, p0, La/b04;->j:Z

    .line 114
    .line 115
    sget-object v0, La/wne;->a:La/wne;

    .line 116
    .line 117
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_2
    iget-boolean p0, p0, La/b04;->j:Z

    .line 126
    .line 127
    sget-object v0, La/wne;->a:La/wne;

    .line 128
    .line 129
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    xor-int/2addr p0, v4

    .line 133
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 139
    .line 140
    iget-boolean v1, p0, La/b04;->j:Z

    .line 141
    .line 142
    if-eqz v1, :cond_5

    .line 143
    .line 144
    if-ne v1, v4, :cond_4

    .line 145
    .line 146
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 151
    .line 152
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iput-boolean v4, p0, La/b04;->j:Z

    .line 160
    .line 161
    const-wide/16 v1, 0xbb8

    .line 162
    .line 163
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    if-ne p0, v0, :cond_6

    .line 168
    .line 169
    move-object v3, v0

    .line 170
    goto :goto_3

    .line 171
    :cond_6
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 172
    .line 173
    :goto_3
    return-object v3

    .line 174
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 175
    .line 176
    iget-boolean v5, p0, La/b04;->j:Z

    .line 177
    .line 178
    if-eqz v5, :cond_8

    .line 179
    .line 180
    if-ne v5, v4, :cond_7

    .line 181
    .line 182
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_7
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 187
    .line 188
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    sget-object p1, La/wen;->b:La/uen;

    .line 196
    .line 197
    sget-object p1, La/bfn;->d:La/bfn;

    .line 198
    .line 199
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    iput-boolean v4, p0, La/b04;->j:Z

    .line 204
    .line 205
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    if-ne p0, v0, :cond_9

    .line 210
    .line 211
    move-object v3, v0

    .line 212
    goto :goto_5

    .line 213
    :cond_9
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    :goto_5
    return-object v3

    .line 216
    :pswitch_5
    sget-object v0, La/wne;->a:La/wne;

    .line 217
    .line 218
    iget-boolean v5, p0, La/b04;->j:Z

    .line 219
    .line 220
    if-eqz v5, :cond_b

    .line 221
    .line 222
    if-ne v5, v4, :cond_a

    .line 223
    .line 224
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_a
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 229
    .line 230
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    sget-object p1, La/wen;->b:La/uen;

    .line 238
    .line 239
    sget-object p1, La/bfn;->d:La/bfn;

    .line 240
    .line 241
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 242
    .line 243
    .line 244
    move-result-wide v1

    .line 245
    iput-boolean v4, p0, La/b04;->j:Z

    .line 246
    .line 247
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    if-ne p0, v0, :cond_c

    .line 252
    .line 253
    move-object v3, v0

    .line 254
    goto :goto_7

    .line 255
    :cond_c
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    :goto_7
    return-object v3

    .line 258
    :pswitch_6
    sget-object v0, La/wne;->a:La/wne;

    .line 259
    .line 260
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    iget-boolean p0, p0, La/b04;->j:Z

    .line 264
    .line 265
    xor-int/2addr p0, v4

    .line 266
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    return-object p0

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
