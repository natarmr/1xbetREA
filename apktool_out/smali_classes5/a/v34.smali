.class public final La/v34;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/media/AudioRecord;

.field public b:La/c4m0;

.field public c:La/sje;

.field public d:La/q99;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public f:Landroid/media/audiofx/AcousticEchoCanceler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/tvk;->a:La/rwj;

    .line 5
    .line 6
    sget-object v0, La/dvj;->c:La/dvj;

    .line 7
    .line 8
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/v34;->c:La/sje;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/v34;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a()La/q99;
    .locals 8

    .line 1
    invoke-virtual {p0}, La/v34;->b()V

    .line 2
    .line 3
    .line 4
    const/16 v2, 0x1f40

    .line 5
    .line 6
    const/16 v3, 0x10

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    invoke-static {v2, v3, v4}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x140

    .line 14
    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    move v5, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v5, v0

    .line 20
    :goto_0
    const/16 v0, 0x8

    .line 21
    .line 22
    const/4 v1, 0x6

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-static {v0, v6, v6, v1}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    iput-object v7, p0, La/v34;->d:La/q99;

    .line 29
    .line 30
    :try_start_0
    new-instance v0, Landroid/media/AudioRecord;

    .line 31
    .line 32
    const/4 v1, 0x7

    .line 33
    invoke-direct/range {v0 .. v5}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getState()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x1

    .line 41
    if-eq v1, v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v6}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 47
    .line 48
    .line 49
    return-object v7

    .line 50
    :cond_1
    iput-object v0, p0, La/v34;->a:Landroid/media/AudioRecord;

    .line 51
    .line 52
    invoke-static {}, Landroid/media/audiofx/AcousticEchoCanceler;->isAvailable()Z

    .line 53
    .line 54
    .line 55
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getAudioSessionId()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {v1}, Landroid/media/audiofx/AcousticEchoCanceler;->create(I)Landroid/media/audiofx/AcousticEchoCanceler;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, La/v34;->f:Landroid/media/audiofx/AcousticEchoCanceler;

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    .line 72
    .line 73
    :catch_0
    :cond_2
    :try_start_2
    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 74
    .line 75
    .line 76
    sget-object v0, La/tvk;->a:La/rwj;

    .line 77
    .line 78
    sget-object v0, La/dvj;->c:La/dvj;

    .line 79
    .line 80
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, La/v34;->c:La/sje;

    .line 96
    .line 97
    new-instance v1, La/ee0;

    .line 98
    .line 99
    const/16 v2, 0xa

    .line 100
    .line 101
    invoke-direct {v1, p0, v7, v6, v2}, La/ee0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 102
    .line 103
    .line 104
    const/4 v2, 0x3

    .line 105
    invoke-static {v0, v6, v6, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, La/v34;->b:La/c4m0;

    .line 110
    .line 111
    return-object v7

    .line 112
    :catch_1
    invoke-virtual {v7, v6}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 113
    .line 114
    .line 115
    return-object v7
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, La/v34;->d:La/q99;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, La/v34;->d:La/q99;

    .line 10
    .line 11
    iget-object v0, p0, La/v34;->b:La/c4m0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v1, p0, La/v34;->b:La/c4m0;

    .line 19
    .line 20
    :try_start_0
    iget-object v0, p0, La/v34;->f:Landroid/media/audiofx/AcousticEchoCanceler;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/media/audiofx/AudioEffect;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    :cond_2
    iput-object v1, p0, La/v34;->f:Landroid/media/audiofx/AcousticEchoCanceler;

    .line 28
    .line 29
    iget-object v0, p0, La/v34;->c:La/sje;

    .line 30
    .line 31
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, La/tvk;->a:La/rwj;

    .line 35
    .line 36
    sget-object v0, La/dvj;->c:La/dvj;

    .line 37
    .line 38
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/v34;->c:La/sje;

    .line 54
    .line 55
    :try_start_1
    iget-object v0, p0, La/v34;->a:Landroid/media/AudioRecord;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    .line 61
    .line 62
    :catch_1
    :cond_3
    :try_start_2
    iget-object v0, p0, La/v34;->a:Landroid/media/AudioRecord;

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 67
    .line 68
    .line 69
    :catch_2
    :cond_4
    iput-object v1, p0, La/v34;->a:Landroid/media/AudioRecord;

    .line 70
    .line 71
    return-void
.end method
