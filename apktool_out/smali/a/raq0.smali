.class public final La/raq0;
.super La/dvb0;
.source "SourceFile"


# instance fields
.field public e:Landroid/view/TextureView;

.field public f:Landroid/graphics/SurfaceTexture;

.field public g:La/wu9;

.field public h:La/pmn0;

.field public i:Z

.field public j:Landroid/graphics/SurfaceTexture;

.field public k:Ljava/util/concurrent/atomic/AtomicReference;

.field public l:La/hi;


# virtual methods
.method public final a()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/raq0;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/raq0;->j:Landroid/graphics/SurfaceTexture;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/raq0;->j:Landroid/graphics/SurfaceTexture;

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, La/raq0;->j:Landroid/graphics/SurfaceTexture;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, La/raq0;->i:Z

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/raq0;->i:Z

    .line 3
    .line 4
    return-void
.end method

.method public final e(La/pmn0;La/hi;)V
    .locals 5

    .line 1
    iget-object v0, p1, La/pmn0;->b:Landroid/util/Size;

    .line 2
    .line 3
    iput-object v0, p0, La/dvb0;->a:Landroid/util/Size;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/view/TextureView;

    .line 9
    .line 10
    iget-object v1, p0, La/dvb0;->b:Landroid/widget/FrameLayout;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 20
    .line 21
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    iget-object v3, p0, La/dvb0;->a:Landroid/util/Size;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, p0, La/dvb0;->a:Landroid/util/Size;

    .line 30
    .line 31
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 42
    .line 43
    new-instance v2, La/a2a;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-direct {v2, p0, v3}, La/a2a;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, La/raq0;->h:La/pmn0;

    .line 61
    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    invoke-virtual {v0}, La/pmn0;->c()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    iget-object v0, p0, La/raq0;->l:La/hi;

    .line 71
    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    invoke-virtual {v0}, La/hi;->b()V

    .line 75
    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, La/raq0;->l:La/hi;

    .line 79
    .line 80
    :cond_0
    iput-object p1, p0, La/raq0;->h:La/pmn0;

    .line 81
    .line 82
    iput-object p2, p0, La/raq0;->l:La/hi;

    .line 83
    .line 84
    iget-object p2, p0, La/raq0;->e:Landroid/view/TextureView;

    .line 85
    .line 86
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {p2}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    new-instance v0, La/qaq0;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {v0, p0, p1, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    iget-object p1, p1, La/pmn0;->j:La/tu9;

    .line 101
    .line 102
    invoke-virtual {p1, v0, p2}, La/tu9;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, La/raq0;->h()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final g()La/ig00;
    .locals 4

    .line 1
    const-string v0, "textureViewImpl_waitForNextFrame"

    .line 2
    .line 3
    new-instance v1, La/tu9;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, La/msf0;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v2, v1, La/tu9;->c:La/msf0;

    .line 14
    .line 15
    new-instance v2, La/wu9;

    .line 16
    .line 17
    invoke-direct {v2, v1}, La/wu9;-><init>(La/tu9;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, La/tu9;->b:La/wu9;

    .line 21
    .line 22
    const-class v3, La/hne;

    .line 23
    .line 24
    iput-object v3, v1, La/tu9;->a:Ljava/lang/Object;

    .line 25
    .line 26
    :try_start_0
    iget-object p0, p0, La/raq0;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, v1, La/tu9;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-object v2

    .line 34
    :catch_0
    move-exception p0

    .line 35
    invoke-virtual {v2, p0}, La/wu9;->b(Ljava/lang/Throwable;)Z

    .line 36
    .line 37
    .line 38
    return-object v2
.end method

.method public final h()V
    .locals 9

    .line 1
    iget-object v0, p0, La/dvb0;->a:Landroid/util/Size;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, La/raq0;->f:Landroid/graphics/SurfaceTexture;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v2, p0, La/raq0;->h:La/pmn0;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, La/dvb0;->a:Landroid/util/Size;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v0, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 25
    .line 26
    .line 27
    new-instance v5, Landroid/view/Surface;

    .line 28
    .line 29
    iget-object v0, p0, La/raq0;->f:Landroid/graphics/SurfaceTexture;

    .line 30
    .line 31
    invoke-direct {v5, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 32
    .line 33
    .line 34
    iget-object v7, p0, La/raq0;->h:La/pmn0;

    .line 35
    .line 36
    new-instance v0, La/lmn0;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-direct {v0, p0, v5, v1}, La/lmn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, La/y0x0;->I(La/uu9;)La/wu9;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    iput-object v6, p0, La/raq0;->g:La/wu9;

    .line 47
    .line 48
    new-instance v3, La/qx9;

    .line 49
    .line 50
    const/16 v8, 0x9

    .line 51
    .line 52
    move-object v4, p0

    .line 53
    invoke-direct/range {v3 .. v8}, La/qx9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    iget-object p0, v4, La/raq0;->e:Landroid/view/TextureView;

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object v0, v6, La/wu9;->b:La/vu9;

    .line 67
    .line 68
    invoke-virtual {v0, v3, p0}, La/y4;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    iput-boolean p0, v4, La/dvb0;->d:Z

    .line 73
    .line 74
    invoke-virtual {v4}, La/dvb0;->f()V

    .line 75
    .line 76
    .line 77
    :cond_1
    :goto_0
    return-void
.end method
