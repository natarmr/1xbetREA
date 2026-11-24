.class public final La/ilp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rh60;
.implements La/zlu0;
.implements La/mff0;
.implements La/ngw0;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/jix0;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/enj0;

    .line 11
    .line 12
    const/16 v0, 0x1d

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/lkr0;

    .line 24
    .line 25
    const/4 v0, 0x7

    .line 26
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 34
    iput-object p1, p0, La/ilp0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 33
    iput-object p2, p0, La/ilp0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/nj50;)La/ylu0;
    .locals 2

    .line 1
    new-instance v0, La/okt0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, La/okt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    check-cast p1, La/e9w0;

    .line 4
    .line 5
    invoke-virtual {p1}, La/hz5;->l()Landroid/os/IInterface;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La/daw0;

    .line 10
    .line 11
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/gms/common/internal/zab;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p1, La/y4w0;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget v1, La/o9w0;->a:I

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/common/internal/zab;->writeToParcel(Landroid/os/Parcel;I)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object p0, p1, La/y4w0;->b:Landroid/os/IBinder;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-interface {p0, v1, v0, p1, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p0

    .line 48
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public b(I)La/nj50;
    .locals 1

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/util/SparseArray;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/nj50;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "Cannot find the wrapper for global view type "

    .line 28
    .line 29
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method

.method public c(I)V
    .locals 6

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nps0;

    .line 4
    .line 5
    sget-object v0, La/nps0;->O1:[La/iiy;

    .line 6
    .line 7
    iget-object p0, p0, La/nps0;->M1:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, La/cqs0;

    .line 14
    .line 15
    iget-object v0, p0, La/cqs0;->f:La/m1e;

    .line 16
    .line 17
    invoke-interface {v0}, La/m1e;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object p1, La/d16;->a:La/d16;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/cqs0;->w(La/i16;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, La/cqs0;->d:La/mne;

    .line 34
    .line 35
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 36
    .line 37
    new-instance v1, La/tps0;

    .line 38
    .line 39
    const/4 v2, 0x2

    .line 40
    invoke-direct {v1, p0, v2}, La/tps0;-><init>(La/cqs0;B)V

    .line 41
    .line 42
    .line 43
    new-instance v4, La/bqs0;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct {v4, p0, p1, v2, v5}, La/bqs0;-><init>(La/diu0;ILa/yje;B)V

    .line 48
    .line 49
    .line 50
    const/16 v5, 0xa

    .line 51
    .line 52
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/g2v;

    .line 4
    .line 5
    iget-object p0, p0, La/g2v;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/n8v;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/n8v;->a:La/p7m0;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public e(Ljava/lang/String;JZLa/uaq0;)V
    .locals 8

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/roi0;

    .line 4
    .line 5
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rbq0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/rbq0;->a:La/us00;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz p4, :cond_0

    .line 30
    .line 31
    new-instance p4, La/xl60;

    .line 32
    .line 33
    const-class v2, Lorg/xplatform/themeswitch/impl/ThemeSwitchTimeWorker;

    .line 34
    .line 35
    invoke-direct {p4, v2}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p5

    .line 42
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p5

    .line 46
    new-instance v2, Lkotlin/Pair;

    .line 47
    .line 48
    const-string v3, "theme"

    .line 49
    .line 50
    invoke-direct {v2, v3, p5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object p5

    .line 57
    new-instance v2, La/laj;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-direct {v2, v3}, La/laj;-><init>(B)V

    .line 61
    .line 62
    .line 63
    aget-object p5, p5, v3

    .line 64
    .line 65
    iget-object v3, p5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, Ljava/lang/String;

    .line 68
    .line 69
    iget-object p5, p5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-virtual {v2, p5, v3}, La/laj;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, La/laj;->a()La/maj;

    .line 75
    .line 76
    .line 77
    move-result-object p5

    .line 78
    iget-object v2, p4, La/v0;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, La/ppv0;

    .line 81
    .line 82
    iput-object p5, v2, La/ppv0;->e:La/maj;

    .line 83
    .line 84
    invoke-virtual {p4, p1}, La/v0;->g(Ljava/lang/String;)La/v0;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    check-cast p4, La/xl60;

    .line 89
    .line 90
    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 91
    .line 92
    invoke-virtual {p4, p2, p3, p5}, La/v0;->x(JLjava/util/concurrent/TimeUnit;)La/v0;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    check-cast p2, La/xl60;

    .line 97
    .line 98
    invoke-virtual {p2}, La/v0;->k()La/lpv0;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, La/yl60;

    .line 103
    .line 104
    sget-object p3, La/zko;->a:La/zko;

    .line 105
    .line 106
    invoke-virtual {v0, p1, p3, p2}, La/cpv0;->c(Ljava/lang/String;La/zko;La/yl60;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p2, La/lpv0;->a:Ljava/util/UUID;

    .line 110
    .line 111
    iget-object p2, p0, La/rbq0;->c:La/n0o0;

    .line 112
    .line 113
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    move-object v2, p2

    .line 118
    check-cast v2, La/vne;

    .line 119
    .line 120
    sget-object v3, La/pbq0;->a:La/pbq0;

    .line 121
    .line 122
    new-instance v6, La/lcl0;

    .line 123
    .line 124
    const/16 p2, 0x1c

    .line 125
    .line 126
    invoke-direct {v6, p0, p1, v1, p2}, La/lcl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    const/16 v7, 0xe

    .line 130
    .line 131
    const/4 v4, 0x0

    .line 132
    const/4 v5, 0x0

    .line 133
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object p1, p0, La/rbq0;->e:La/bby;

    .line 138
    .line 139
    return-void

    .line 140
    :cond_0
    iget-object p2, v0, La/cpv0;->b:La/wsd;

    .line 141
    .line 142
    iget-object p2, p2, La/wsd;->f:La/std;

    .line 143
    .line 144
    const-string p3, "CancelWorkByName_"

    .line 145
    .line 146
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    iget-object p4, v0, La/cpv0;->d:La/fpv0;

    .line 151
    .line 152
    iget-object p4, p4, La/fpv0;->a:La/xgi0;

    .line 153
    .line 154
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance p5, La/h5a;

    .line 158
    .line 159
    invoke-direct {p5, p1, v0}, La/h5a;-><init>(Ljava/lang/String;La/cpv0;)V

    .line 160
    .line 161
    .line 162
    invoke-static {p2, p3, p4, p5}, La/r8x;->T(La/std;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)La/gqw0;

    .line 163
    .line 164
    .line 165
    iget-object p0, p0, La/rbq0;->e:La/bby;

    .line 166
    .line 167
    if-eqz p0, :cond_1

    .line 168
    .line 169
    invoke-interface {p0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 170
    .line 171
    .line 172
    :cond_1
    return-void
.end method

.method public f(Ljava/util/List;)V
    .locals 8

    .line 1
    invoke-static {p1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/d2w;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_1
    instance-of v3, v1, La/y1w;

    .line 26
    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    check-cast v1, La/y1w;

    .line 30
    .line 31
    iget-wide v2, v1, La/y1w;->d:J

    .line 32
    .line 33
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-wide v3, v1, La/y1w;->l:J

    .line 38
    .line 39
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v3, Lkotlin/Pair;

    .line 44
    .line 45
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    move-object v2, v3

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    instance-of v3, v1, La/u1w;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    check-cast v1, La/u1w;

    .line 55
    .line 56
    iget-wide v2, v1, La/u1w;->d:J

    .line 57
    .line 58
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-wide v3, v1, La/u1w;->l:J

    .line 63
    .line 64
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    new-instance v3, Lkotlin/Pair;

    .line 69
    .line 70
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    instance-of v3, v1, La/x1w;

    .line 75
    .line 76
    if-eqz v3, :cond_4

    .line 77
    .line 78
    check-cast v1, La/x1w;

    .line 79
    .line 80
    iget-wide v2, v1, La/x1w;->d:J

    .line 81
    .line 82
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    iget-wide v3, v1, La/x1w;->l:J

    .line 87
    .line 88
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    new-instance v3, Lkotlin/Pair;

    .line 93
    .line 94
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    instance-of v3, v1, La/c2w;

    .line 99
    .line 100
    if-eqz v3, :cond_5

    .line 101
    .line 102
    check-cast v1, La/c2w;

    .line 103
    .line 104
    iget-wide v2, v1, La/c2w;->d:J

    .line 105
    .line 106
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-wide v3, v1, La/c2w;->l:J

    .line 111
    .line 112
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    new-instance v3, Lkotlin/Pair;

    .line 117
    .line 118
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    :goto_2
    if-eqz v2, :cond_0

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, La/pv00;

    .line 131
    .line 132
    iget-object p0, p0, La/pv00;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, La/o5g0;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const-wide/16 v3, -0x141

    .line 140
    .line 141
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p0, p0, La/o5g0;->a:La/p7m0;

    .line 146
    .line 147
    new-instance v1, La/jo20;

    .line 148
    .line 149
    invoke-direct {v1}, La/jo20;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    if-eqz v3, :cond_9

    .line 161
    .line 162
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, Lkotlin/Pair;

    .line 167
    .line 168
    new-instance v4, Ljava/util/Date;

    .line 169
    .line 170
    iget-object v5, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v5, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 175
    .line 176
    .line 177
    move-result-wide v5

    .line 178
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 179
    .line 180
    invoke-virtual {v7, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-static {v5}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v5, v4}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 196
    .line 197
    .line 198
    const/16 v4, 0xb

    .line 199
    .line 200
    const/4 v6, 0x0

    .line 201
    invoke-virtual {v5, v4, v6}, Ljava/util/Calendar;->set(II)V

    .line 202
    .line 203
    .line 204
    const/16 v4, 0xc

    .line 205
    .line 206
    invoke-virtual {v5, v4, v6}, Ljava/util/Calendar;->set(II)V

    .line 207
    .line 208
    .line 209
    const/16 v4, 0xd

    .line 210
    .line 211
    invoke-virtual {v5, v4, v6}, Ljava/util/Calendar;->set(II)V

    .line 212
    .line 213
    .line 214
    const/16 v4, 0xe

    .line 215
    .line 216
    invoke-virtual {v5, v4, v6}, Ljava/util/Calendar;->set(II)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, p1}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-nez v5, :cond_7

    .line 231
    .line 232
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 233
    .line 234
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 235
    .line 236
    .line 237
    :cond_7
    move-object v6, v5

    .line 238
    check-cast v6, Ljava/util/Set;

    .line 239
    .line 240
    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, p1, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    iget-object v3, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-virtual {v1, v3}, La/jo20;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    if-nez v5, :cond_8

    .line 253
    .line 254
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 255
    .line 256
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 257
    .line 258
    .line 259
    :cond_8
    move-object v6, v5

    .line 260
    check-cast v6, Ljava/util/Set;

    .line 261
    .line 262
    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v3, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_9
    invoke-virtual {v1}, La/jo20;->b()La/jo20;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p0, v2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    return-void
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/kxw0;

    .line 4
    .line 5
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 6
    .line 7
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/uuw0;->s1()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v0, 0x3

    .line 15
    invoke-static {p0, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public synthetic h(La/xfw0;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 2
    .line 3
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/hcp0;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, La/hcp0;->f(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 8

    .line 1
    instance-of p1, p1, La/lgq;

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    sget-object p1, La/tlw0;->e:La/zz2;

    .line 6
    .line 7
    const-string v0, "Failure to refresh token; scheduling refresh after failure"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v2, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v2}, La/zz2;->K(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/mfr;

    .line 18
    .line 19
    iget-object p0, p0, La/mfr;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/tlw0;

    .line 22
    .line 23
    iget-wide v2, p0, La/tlw0;->b:J

    .line 24
    .line 25
    long-to-int v0, v2

    .line 26
    const/16 v2, 0x1e

    .line 27
    .line 28
    if-eq v0, v2, :cond_1

    .line 29
    .line 30
    const/16 v2, 0x3c

    .line 31
    .line 32
    if-eq v0, v2, :cond_1

    .line 33
    .line 34
    const/16 v2, 0x78

    .line 35
    .line 36
    if-eq v0, v2, :cond_1

    .line 37
    .line 38
    const/16 v2, 0xf0

    .line 39
    .line 40
    if-eq v0, v2, :cond_1

    .line 41
    .line 42
    const/16 v2, 0x1e0

    .line 43
    .line 44
    if-eq v0, v2, :cond_1

    .line 45
    .line 46
    const/16 v2, 0x3c0

    .line 47
    .line 48
    if-eq v0, v2, :cond_0

    .line 49
    .line 50
    const-wide/16 v2, 0x1e

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-wide/16 v2, 0x3c0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const-wide/16 v2, 0x2

    .line 57
    .line 58
    iget-wide v4, p0, La/tlw0;->b:J

    .line 59
    .line 60
    mul-long/2addr v2, v4

    .line 61
    :goto_0
    iput-wide v2, p0, La/tlw0;->b:J

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    iget-wide v4, p0, La/tlw0;->b:J

    .line 68
    .line 69
    const-wide/16 v6, 0x3e8

    .line 70
    .line 71
    mul-long/2addr v4, v6

    .line 72
    add-long/2addr v4, v2

    .line 73
    iput-wide v4, p0, La/tlw0;->a:J

    .line 74
    .line 75
    iget-wide v2, p0, La/tlw0;->a:J

    .line 76
    .line 77
    const-string v0, "Scheduling refresh for "

    .line 78
    .line 79
    invoke-static {v2, v3, v0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-array v1, v1, [Ljava/lang/Object;

    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, La/zz2;->K(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, La/tlw0;->c:La/jaw0;

    .line 89
    .line 90
    iget-object v0, p0, La/tlw0;->d:La/mfr;

    .line 91
    .line 92
    iget-wide v1, p0, La/tlw0;->b:J

    .line 93
    .line 94
    mul-long/2addr v1, v6

    .line 95
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void
.end method

.method public zza(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/lix0;

    .line 4
    .line 5
    const-string v0, "GmsCore_OpenSSL"

    .line 6
    .line 7
    const-string v1, "AndroidOpenSSL"

    .line 8
    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :goto_0
    const/4 v3, 0x2

    .line 20
    if-ge v2, v3, :cond_1

    .line 21
    .line 22
    aget-object v3, v0, v2

    .line 23
    .line 24
    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x0

    .line 41
    move-object v2, v1

    .line 42
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/security/Provider;

    .line 53
    .line 54
    :try_start_0
    invoke-interface {p0, p1, v3}, La/lix0;->b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return-object p0

    .line 59
    :catch_0
    move-exception v3

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    move-object v2, v3

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-interface {p0, p1, v1}, La/lix0;->b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    .line 70
    iget-object p0, p0, La/ilp0;->a:Ljava/lang/Object;

    check-cast p0, La/hcp0;

    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
