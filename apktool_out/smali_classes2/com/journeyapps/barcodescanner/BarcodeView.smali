.class public Lcom/journeyapps/barcodescanner/BarcodeView;
.super La/d2a;
.source "SourceFile"


# instance fields
.field public B:I

.field public f1:La/dlj;

.field public g1:La/jrs0;

.field public h1:La/ukj;

.field public final i1:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, La/d2a;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->f1:La/dlj;

    .line 9
    .line 10
    new-instance p1, La/yu5;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p1, p0, v0}, La/yu5;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;B)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/sbx0;

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, La/sbx0;-><init>(BZ)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 24
    .line 25
    new-instance v0, Landroid/os/Handler;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->i1:Landroid/os/Handler;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 33
    invoke-direct {p0, p1, p2}, La/d2a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 34
    iput p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->f1:La/dlj;

    .line 36
    new-instance p1, La/yu5;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, La/yu5;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;B)V

    .line 37
    new-instance p2, La/sbx0;

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 38
    invoke-direct {p2, v0, v1}, La/sbx0;-><init>(BZ)V

    .line 39
    iput-object p2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 40
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p2, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->i1:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->j()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/cvm0;->q()V

    .line 5
    .line 6
    .line 7
    const-string v0, "d2a"

    .line 8
    .line 9
    const-string v1, "pause()"

    .line 10
    .line 11
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, La/d2a;->i:I

    .line 16
    .line 17
    iget-object v0, p0, La/d2a;->a:La/q0a;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, La/cvm0;->q()V

    .line 23
    .line 24
    .line 25
    iget-boolean v2, v0, La/q0a;->f:Z

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v0, La/q0a;->a:La/sbx0;

    .line 30
    .line 31
    iget-object v3, v0, La/q0a;->l:La/p0a;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, La/sbx0;->e(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x1

    .line 38
    iput-boolean v2, v0, La/q0a;->g:Z

    .line 39
    .line 40
    :goto_0
    const/4 v2, 0x0

    .line 41
    iput-boolean v2, v0, La/q0a;->f:Z

    .line 42
    .line 43
    iput-object v1, p0, La/d2a;->a:La/q0a;

    .line 44
    .line 45
    iput-boolean v2, p0, La/d2a;->g:Z

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v0, p0, La/d2a;->c:Landroid/os/Handler;

    .line 49
    .line 50
    const v2, 0x7f0a147d

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object v0, p0, La/d2a;->p:La/g7k0;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    iget-object v0, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v2, p0, La/d2a;->w:La/b2a;

    .line 69
    .line 70
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v0, p0, La/d2a;->p:La/g7k0;

    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    iput-object v1, p0, La/d2a;->m:La/g7k0;

    .line 85
    .line 86
    iput-object v1, p0, La/d2a;->n:La/g7k0;

    .line 87
    .line 88
    iput-object v1, p0, La/d2a;->r:Landroid/graphics/Rect;

    .line 89
    .line 90
    iget-object v0, p0, La/d2a;->h:La/sbx0;

    .line 91
    .line 92
    iget-object v2, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v2, La/teg0;

    .line 95
    .line 96
    if-eqz v2, :cond_4

    .line 97
    .line 98
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    .line 99
    .line 100
    .line 101
    :cond_4
    iput-object v1, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object v1, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v1, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 106
    .line 107
    iget-object p0, p0, La/d2a;->z:La/c2a;

    .line 108
    .line 109
    invoke-virtual {p0}, La/c2a;->j()V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public getDecoderFactory()La/ukj;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()La/qkj;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, La/sbx0;

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, La/sbx0;-><init>(BZ)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 13
    .line 14
    :cond_0
    new-instance v0, La/zkj;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/gkj;->j:La/gkj;

    .line 25
    .line 26
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 30
    .line 31
    check-cast p0, La/sbx0;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, Ljava/util/EnumMap;

    .line 37
    .line 38
    const-class v3, La/gkj;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/util/EnumMap;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2, v1}, Ljava/util/EnumMap;->putAll(Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Ljava/util/Set;

    .line 58
    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    sget-object v3, La/gkj;->c:La/gkj;

    .line 62
    .line 63
    invoke-virtual {v2, v3, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    sget-object v3, La/gkj;->e:La/gkj;

    .line 73
    .line 74
    invoke-virtual {v2, v3, v1}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_3
    new-instance v1, La/vv40;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, La/vv40;->c(Ljava/util/Map;)V

    .line 83
    .line 84
    .line 85
    iget p0, p0, La/sbx0;->b:I

    .line 86
    .line 87
    if-eqz p0, :cond_6

    .line 88
    .line 89
    const/4 v2, 0x1

    .line 90
    if-eq p0, v2, :cond_5

    .line 91
    .line 92
    const/4 v3, 0x2

    .line 93
    if-eq p0, v3, :cond_4

    .line 94
    .line 95
    new-instance p0, La/qkj;

    .line 96
    .line 97
    invoke-direct {p0, v1}, La/qkj;-><init>(La/vv40;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    new-instance p0, La/hh40;

    .line 102
    .line 103
    invoke-direct {p0, v1}, La/qkj;-><init>(La/vv40;)V

    .line 104
    .line 105
    .line 106
    iput-boolean v2, p0, La/hh40;->c:Z

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    new-instance p0, La/nox;

    .line 110
    .line 111
    invoke-direct {p0, v1}, La/qkj;-><init>(La/vv40;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    new-instance p0, La/qkj;

    .line 116
    .line 117
    invoke-direct {p0, v1}, La/qkj;-><init>(La/vv40;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    iput-object p0, v0, La/zkj;->a:La/qkj;

    .line 121
    .line 122
    return-object p0
.end method

.method public final i()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->j()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->B:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, La/d2a;->g:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, La/jrs0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/d2a;->getCameraInstance()La/q0a;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->h()La/qkj;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v4, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->i1:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-direct {v0, v2, v3, v4}, La/jrs0;-><init>(La/q0a;La/qkj;Landroid/os/Handler;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->g1:La/jrs0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/d2a;->getPreviewFramingRect()Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, v0, La/jrs0;->g:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->g1:La/jrs0;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, La/cvm0;->q()V

    .line 42
    .line 43
    .line 44
    new-instance v0, Landroid/os/HandlerThread;

    .line 45
    .line 46
    const-string v2, "jrs0"

    .line 47
    .line 48
    invoke-direct {v0, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 54
    .line 55
    .line 56
    new-instance v0, Landroid/os/Handler;

    .line 57
    .line 58
    iget-object v2, p0, La/jrs0;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Landroid/os/HandlerThread;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v3, p0, La/jrs0;->i:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, La/mz4;

    .line 69
    .line 70
    invoke-direct {v0, v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/jrs0;->d:Ljava/lang/Object;

    .line 74
    .line 75
    iput-boolean v1, p0, La/jrs0;->a:Z

    .line 76
    .line 77
    iget-object v0, p0, La/jrs0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v0, La/q0a;

    .line 80
    .line 81
    iget-object p0, p0, La/jrs0;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p0, La/yqc;

    .line 84
    .line 85
    iget-object v1, v0, La/q0a;->h:Landroid/os/Handler;

    .line 86
    .line 87
    new-instance v2, La/o0a;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-direct {v2, v0, p0, v3}, La/o0a;-><init>(La/q0a;La/yqc;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 94
    .line 95
    .line 96
    :cond_0
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->g1:La/jrs0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, La/cvm0;->q()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/jrs0;->h:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    iput-boolean v2, v0, La/jrs0;->a:Z

    .line 13
    .line 14
    iget-object v2, v0, La/jrs0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroid/os/Handler;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, La/jrs0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Landroid/os/HandlerThread;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 27
    .line 28
    .line 29
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    iput-object v3, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->g1:La/jrs0;

    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0

    .line 36
    :cond_0
    return-void
.end method

.method public setDecoderFactory(La/ukj;)V
    .locals 0

    .line 1
    invoke-static {}, La/cvm0;->q()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->h1:La/ukj;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/journeyapps/barcodescanner/BarcodeView;->g1:La/jrs0;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/journeyapps/barcodescanner/BarcodeView;->h()La/qkj;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iput-object p0, p1, La/jrs0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    return-void
.end method
