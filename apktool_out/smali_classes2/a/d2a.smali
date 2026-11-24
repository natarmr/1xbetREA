.class public abstract La/d2a;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final synthetic A:I


# instance fields
.field public a:La/q0a;

.field public b:Landroid/view/WindowManager;

.field public c:Landroid/os/Handler;

.field public d:Z

.field public e:Landroid/view/SurfaceView;

.field public f:Landroid/view/TextureView;

.field public g:Z

.field public h:La/sbx0;

.field public i:I

.field public final j:Ljava/util/ArrayList;

.field public k:La/zz2;

.field public l:La/o2a;

.field public m:La/g7k0;

.field public n:La/g7k0;

.field public o:Landroid/graphics/Rect;

.field public p:La/g7k0;

.field public q:Landroid/graphics/Rect;

.field public r:Landroid/graphics/Rect;

.field public s:La/g7k0;

.field public t:D

.field public u:La/tub0;

.field public v:Z

.field public final w:La/b2a;

.field public final x:La/yu5;

.field public final y:La/yk50;

.field public final z:La/c2a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/d2a;->d:Z

    .line 6
    .line 7
    iput-boolean v0, p0, La/d2a;->g:Z

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    iput v1, p0, La/d2a;->i:I

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/d2a;->j:Ljava/util/ArrayList;

    .line 18
    .line 19
    new-instance v1, La/o2a;

    .line 20
    .line 21
    invoke-direct {v1}, La/o2a;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, La/d2a;->l:La/o2a;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, La/d2a;->q:Landroid/graphics/Rect;

    .line 28
    .line 29
    iput-object v1, p0, La/d2a;->r:Landroid/graphics/Rect;

    .line 30
    .line 31
    iput-object v1, p0, La/d2a;->s:La/g7k0;

    .line 32
    .line 33
    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iput-wide v2, p0, La/d2a;->t:D

    .line 39
    .line 40
    iput-object v1, p0, La/d2a;->u:La/tub0;

    .line 41
    .line 42
    iput-boolean v0, p0, La/d2a;->v:Z

    .line 43
    .line 44
    new-instance v0, La/b2a;

    .line 45
    .line 46
    move-object v2, p0

    .line 47
    check-cast v2, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 48
    .line 49
    invoke-direct {v0, v2}, La/b2a;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, La/d2a;->w:La/b2a;

    .line 53
    .line 54
    new-instance v0, La/yu5;

    .line 55
    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-direct {v0, v2, v3}, La/yu5;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;B)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/d2a;->x:La/yu5;

    .line 61
    .line 62
    new-instance v0, La/yk50;

    .line 63
    .line 64
    const/16 v3, 0x11

    .line 65
    .line 66
    invoke-direct {v0, v2, v3}, La/yk50;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, La/d2a;->y:La/yk50;

    .line 70
    .line 71
    new-instance v0, La/c2a;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-direct {v0, v2, v3}, La/c2a;-><init>(Ljava/lang/Object;B)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/d2a;->z:La/c2a;

    .line 78
    .line 79
    invoke-virtual {p0, p1, v1}, La/d2a;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 83
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 84
    iput-boolean v0, p0, La/d2a;->d:Z

    .line 85
    iput-boolean v0, p0, La/d2a;->g:Z

    const/4 v1, -0x1

    .line 86
    iput v1, p0, La/d2a;->i:I

    .line 87
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, La/d2a;->j:Ljava/util/ArrayList;

    .line 88
    new-instance v1, La/o2a;

    invoke-direct {v1}, La/o2a;-><init>()V

    iput-object v1, p0, La/d2a;->l:La/o2a;

    const/4 v1, 0x0

    .line 89
    iput-object v1, p0, La/d2a;->q:Landroid/graphics/Rect;

    .line 90
    iput-object v1, p0, La/d2a;->r:Landroid/graphics/Rect;

    .line 91
    iput-object v1, p0, La/d2a;->s:La/g7k0;

    const-wide v2, 0x3fb999999999999aL    # 0.1

    .line 92
    iput-wide v2, p0, La/d2a;->t:D

    .line 93
    iput-object v1, p0, La/d2a;->u:La/tub0;

    .line 94
    iput-boolean v0, p0, La/d2a;->v:Z

    .line 95
    new-instance v0, La/b2a;

    move-object v1, p0

    check-cast v1, Lcom/journeyapps/barcodescanner/BarcodeView;

    invoke-direct {v0, v1}, La/b2a;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;)V

    iput-object v0, p0, La/d2a;->w:La/b2a;

    .line 96
    new-instance v0, La/yu5;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La/yu5;-><init>(Lcom/journeyapps/barcodescanner/BarcodeView;B)V

    iput-object v0, p0, La/d2a;->x:La/yu5;

    .line 97
    new-instance v0, La/yk50;

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, La/yk50;-><init>(Ljava/lang/Object;B)V

    iput-object v0, p0, La/d2a;->y:La/yk50;

    .line 98
    new-instance v0, La/c2a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La/c2a;-><init>(Ljava/lang/Object;B)V

    iput-object v0, p0, La/d2a;->z:La/c2a;

    .line 99
    invoke-virtual {p0, p1, p2}, La/d2a;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private getDisplayRotation()I
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->b:Landroid/view/WindowManager;

    .line 2
    .line 3
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/view/Display;->getRotation()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, -0x1000000

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p2}, La/d2a;->b(Landroid/util/AttributeSet;)V

    .line 13
    .line 14
    .line 15
    const-string p2, "window"

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Landroid/view/WindowManager;

    .line 22
    .line 23
    iput-object p1, p0, La/d2a;->b:Landroid/view/WindowManager;

    .line 24
    .line 25
    new-instance p1, Landroid/os/Handler;

    .line 26
    .line 27
    iget-object p2, p0, La/d2a;->x:La/yu5;

    .line 28
    .line 29
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/d2a;->c:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance p1, La/sbx0;

    .line 35
    .line 36
    const/16 p2, 0xa

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-direct {p1, p2, v0}, La/sbx0;-><init>(BZ)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/d2a;->h:La/sbx0;

    .line 43
    .line 44
    return-void
.end method

.method public final b(Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/spd0;->a:[I

    .line 6
    .line 7
    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x1

    .line 12
    const/high16 v1, -0x40800000    # -1.0f

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    float-to-int v2, v2

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    float-to-int v1, v1

    .line 25
    if-lez v2, :cond_0

    .line 26
    .line 27
    if-lez v1, :cond_0

    .line 28
    .line 29
    new-instance v4, La/g7k0;

    .line 30
    .line 31
    invoke-direct {v4, v2, v1}, La/g7k0;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object v4, p0, La/d2a;->s:La/g7k0;

    .line 35
    .line 36
    :cond_0
    const/4 v1, 0x3

    .line 37
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iput-boolean v2, p0, La/d2a;->d:Z

    .line 42
    .line 43
    const/4 v2, -0x1

    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ne v2, v0, :cond_1

    .line 50
    .line 51
    new-instance v0, La/tab;

    .line 52
    .line 53
    invoke-direct {v0, v3}, La/tab;-><init>(B)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, La/d2a;->u:La/tub0;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    if-ne v2, v4, :cond_2

    .line 60
    .line 61
    new-instance v1, La/tab;

    .line 62
    .line 63
    invoke-direct {v1, v0}, La/tab;-><init>(B)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, La/d2a;->u:La/tub0;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-ne v2, v1, :cond_3

    .line 70
    .line 71
    new-instance v0, La/tab;

    .line 72
    .line 73
    invoke-direct {v0, v4}, La/tab;-><init>(B)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/d2a;->u:La/tub0;

    .line 77
    .line 78
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public abstract c()V
.end method

.method public final d()V
    .locals 8

    .line 1
    invoke-static {}, La/cvm0;->q()V

    .line 2
    .line 3
    .line 4
    const-string v0, "d2a"

    .line 5
    .line 6
    const-string v1, "resume()"

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/d2a;->a:La/q0a;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "d2a"

    .line 17
    .line 18
    const-string v2, "initCamera called twice"

    .line 19
    .line 20
    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_0
    new-instance v0, La/q0a;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-boolean v1, v0, La/q0a;->f:Z

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    iput-boolean v3, v0, La/q0a;->g:Z

    .line 38
    .line 39
    new-instance v4, La/o2a;

    .line 40
    .line 41
    invoke-direct {v4}, La/o2a;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v4, v0, La/q0a;->i:La/o2a;

    .line 45
    .line 46
    new-instance v4, La/p0a;

    .line 47
    .line 48
    invoke-direct {v4, v0, v1}, La/p0a;-><init>(La/q0a;B)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/p0a;

    .line 52
    .line 53
    invoke-direct {v5, v0, v3}, La/p0a;-><init>(La/q0a;B)V

    .line 54
    .line 55
    .line 56
    iput-object v5, v0, La/q0a;->j:La/p0a;

    .line 57
    .line 58
    new-instance v5, La/p0a;

    .line 59
    .line 60
    const/4 v6, 0x2

    .line 61
    invoke-direct {v5, v0, v6}, La/p0a;-><init>(La/q0a;B)V

    .line 62
    .line 63
    .line 64
    iput-object v5, v0, La/q0a;->k:La/p0a;

    .line 65
    .line 66
    new-instance v5, La/p0a;

    .line 67
    .line 68
    const/4 v6, 0x3

    .line 69
    invoke-direct {v5, v0, v6}, La/p0a;-><init>(La/q0a;B)V

    .line 70
    .line 71
    .line 72
    iput-object v5, v0, La/q0a;->l:La/p0a;

    .line 73
    .line 74
    invoke-static {}, La/cvm0;->q()V

    .line 75
    .line 76
    .line 77
    sget-object v5, La/sbx0;->g:La/sbx0;

    .line 78
    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    new-instance v5, La/sbx0;

    .line 82
    .line 83
    invoke-direct {v5, v6}, La/sbx0;-><init>(B)V

    .line 84
    .line 85
    .line 86
    sput-object v5, La/sbx0;->g:La/sbx0;

    .line 87
    .line 88
    :cond_1
    iput-object v5, v0, La/q0a;->a:La/sbx0;

    .line 89
    .line 90
    new-instance v6, La/a1a;

    .line 91
    .line 92
    invoke-direct {v6, v2}, La/a1a;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    iput-object v6, v0, La/q0a;->c:La/a1a;

    .line 96
    .line 97
    iget-object v2, v0, La/q0a;->i:La/o2a;

    .line 98
    .line 99
    iput-object v2, v6, La/a1a;->g:La/o2a;

    .line 100
    .line 101
    new-instance v2, Landroid/os/Handler;

    .line 102
    .line 103
    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v2, v0, La/q0a;->h:Landroid/os/Handler;

    .line 107
    .line 108
    iget-object v2, p0, La/d2a;->l:La/o2a;

    .line 109
    .line 110
    iget-boolean v7, v0, La/q0a;->f:Z

    .line 111
    .line 112
    if-nez v7, :cond_2

    .line 113
    .line 114
    iput-object v2, v0, La/q0a;->i:La/o2a;

    .line 115
    .line 116
    iput-object v2, v6, La/a1a;->g:La/o2a;

    .line 117
    .line 118
    :cond_2
    iput-object v0, p0, La/d2a;->a:La/q0a;

    .line 119
    .line 120
    iget-object v2, p0, La/d2a;->c:Landroid/os/Handler;

    .line 121
    .line 122
    iput-object v2, v0, La/q0a;->d:Landroid/os/Handler;

    .line 123
    .line 124
    invoke-static {}, La/cvm0;->q()V

    .line 125
    .line 126
    .line 127
    iput-boolean v3, v0, La/q0a;->f:Z

    .line 128
    .line 129
    iput-boolean v1, v0, La/q0a;->g:Z

    .line 130
    .line 131
    iget-object v0, v5, La/sbx0;->e:Ljava/lang/Object;

    .line 132
    .line 133
    monitor-enter v0

    .line 134
    :try_start_0
    iget v2, v5, La/sbx0;->b:I

    .line 135
    .line 136
    add-int/2addr v2, v3

    .line 137
    iput v2, v5, La/sbx0;->b:I

    .line 138
    .line 139
    invoke-virtual {v5, v4}, La/sbx0;->e(Ljava/lang/Runnable;)V

    .line 140
    .line 141
    .line 142
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    invoke-direct {p0}, La/d2a;->getDisplayRotation()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    iput v0, p0, La/d2a;->i:I

    .line 148
    .line 149
    :goto_0
    iget-object v0, p0, La/d2a;->p:La/g7k0;

    .line 150
    .line 151
    if-eqz v0, :cond_3

    .line 152
    .line 153
    invoke-virtual {p0}, La/d2a;->g()V

    .line 154
    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_3
    iget-object v0, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 158
    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v1, p0, La/d2a;->w:La/b2a;

    .line 166
    .line 167
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 172
    .line 173
    if-eqz v0, :cond_6

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/view/TextureView;->isAvailable()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_5

    .line 180
    .line 181
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 182
    .line 183
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 184
    .line 185
    .line 186
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget-object v1, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    new-instance v2, La/g7k0;

    .line 199
    .line 200
    invoke-direct {v2, v0, v1}, La/g7k0;-><init>(II)V

    .line 201
    .line 202
    .line 203
    iput-object v2, p0, La/d2a;->p:La/g7k0;

    .line 204
    .line 205
    invoke-virtual {p0}, La/d2a;->g()V

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_5
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 210
    .line 211
    new-instance v2, La/a2a;

    .line 212
    .line 213
    invoke-direct {v2, p0, v1}, La/a2a;-><init>(Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 217
    .line 218
    .line 219
    :cond_6
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, La/d2a;->h:La/sbx0;

    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object p0, p0, La/d2a;->y:La/yk50;

    .line 229
    .line 230
    iget-object v2, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, La/teg0;

    .line 233
    .line 234
    if-eqz v2, :cond_7

    .line 235
    .line 236
    invoke-virtual {v2}, Landroid/view/OrientationEventListener;->disable()V

    .line 237
    .line 238
    .line 239
    :cond_7
    const/4 v2, 0x0

    .line 240
    iput-object v2, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v2, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v2, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    iput-object p0, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 251
    .line 252
    const-string p0, "window"

    .line 253
    .line 254
    invoke-virtual {v1, p0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    check-cast p0, Landroid/view/WindowManager;

    .line 259
    .line 260
    iput-object p0, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 261
    .line 262
    new-instance p0, La/teg0;

    .line 263
    .line 264
    invoke-direct {p0, v0, v1}, La/teg0;-><init>(La/sbx0;Landroid/content/Context;)V

    .line 265
    .line 266
    .line 267
    iput-object p0, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 268
    .line 269
    invoke-virtual {p0}, Landroid/view/OrientationEventListener;->enable()V

    .line 270
    .line 271
    .line 272
    iget-object p0, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast p0, Landroid/view/WindowManager;

    .line 275
    .line 276
    invoke-interface {p0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 277
    .line 278
    .line 279
    move-result-object p0

    .line 280
    invoke-virtual {p0}, Landroid/view/Display;->getRotation()I

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    iput p0, v0, La/sbx0;->b:I

    .line 285
    .line 286
    return-void

    .line 287
    :catchall_0
    move-exception p0

    .line 288
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 289
    throw p0
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, La/d2a;->a:La/q0a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, La/d2a;->getDisplayRotation()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, La/d2a;->i:I

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/d2a;->c()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/d2a;->d()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final f(La/c5k;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/d2a;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/d2a;->a:La/q0a;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "d2a"

    .line 10
    .line 11
    const-string v1, "Starting preview"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/d2a;->a:La/q0a;

    .line 17
    .line 18
    iput-object p1, v0, La/q0a;->b:La/c5k;

    .line 19
    .line 20
    invoke-static {}, La/cvm0;->q()V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, v0, La/q0a;->f:Z

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, v0, La/q0a;->a:La/sbx0;

    .line 28
    .line 29
    iget-object v0, v0, La/q0a;->k:La/p0a;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, La/sbx0;->e(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    iput-boolean p1, p0, La/d2a;->g:Z

    .line 36
    .line 37
    move-object p1, p0

    .line 38
    check-cast p1, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/journeyapps/barcodescanner/BarcodeView;->i()V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/d2a;->z:La/c2a;

    .line 44
    .line 45
    invoke-virtual {p0}, La/c2a;->g()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p0, "CameraInstance is not open"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public final g()V
    .locals 6

    .line 1
    iget-object v0, p0, La/d2a;->p:La/g7k0;

    .line 2
    .line 3
    if-eqz v0, :cond_5

    .line 4
    .line 5
    iget-object v1, p0, La/d2a;->n:La/g7k0;

    .line 6
    .line 7
    if-eqz v1, :cond_5

    .line 8
    .line 9
    iget-object v1, p0, La/d2a;->o:Landroid/graphics/Rect;

    .line 10
    .line 11
    if-eqz v1, :cond_5

    .line 12
    .line 13
    iget-object v2, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    new-instance v2, La/g7k0;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v3, p0, La/d2a;->o:Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v2, v1, v3}, La/g7k0;-><init>(II)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v2}, La/g7k0;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    new-instance v0, La/c5k;

    .line 39
    .line 40
    iget-object v1, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iput-object v1, v0, La/c5k;->a:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p0, v0}, La/d2a;->f(La/c5k;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const-string p0, "surfaceHolder may not be null"

    .line 58
    .line 59
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    iget-object v0, p0, La/d2a;->n:La/g7k0;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v1, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 84
    .line 85
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget-object v2, p0, La/d2a;->n:La/g7k0;

    .line 90
    .line 91
    int-to-float v3, v0

    .line 92
    int-to-float v1, v1

    .line 93
    div-float/2addr v3, v1

    .line 94
    iget v4, v2, La/g7k0;->a:I

    .line 95
    .line 96
    int-to-float v4, v4

    .line 97
    iget v2, v2, La/g7k0;->b:I

    .line 98
    .line 99
    int-to-float v2, v2

    .line 100
    div-float/2addr v4, v2

    .line 101
    cmpg-float v2, v3, v4

    .line 102
    .line 103
    const/high16 v5, 0x3f800000    # 1.0f

    .line 104
    .line 105
    if-gez v2, :cond_2

    .line 106
    .line 107
    div-float/2addr v4, v3

    .line 108
    move v3, v5

    .line 109
    move v5, v4

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    div-float/2addr v3, v4

    .line 112
    :goto_0
    new-instance v2, Landroid/graphics/Matrix;

    .line 113
    .line 114
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v5, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 118
    .line 119
    .line 120
    int-to-float v0, v0

    .line 121
    mul-float/2addr v5, v0

    .line 122
    mul-float/2addr v3, v1

    .line 123
    sub-float/2addr v0, v5

    .line 124
    const/high16 v4, 0x40000000    # 2.0f

    .line 125
    .line 126
    div-float/2addr v0, v4

    .line 127
    sub-float/2addr v1, v3

    .line 128
    div-float/2addr v1, v4

    .line 129
    invoke-virtual {v2, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 135
    .line 136
    .line 137
    :cond_3
    new-instance v0, La/c5k;

    .line 138
    .line 139
    iget-object v1, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 140
    .line 141
    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 146
    .line 147
    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    iput-object v1, v0, La/c5k;->b:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {p0, v0}, La/d2a;->f(La/c5k;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_4
    const-string p0, "surfaceTexture may not be null"

    .line 157
    .line 158
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_5
    return-void
.end method

.method public getCameraInstance()La/q0a;
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->a:La/q0a;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCameraSettings()La/o2a;
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->l:La/o2a;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFramingRect()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->q:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public getFramingRectSize()La/g7k0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->s:La/g7k0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMarginFraction()D
    .locals 2

    .line 1
    iget-wide v0, p0, La/d2a;->t:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public getPreviewFramingRect()Landroid/graphics/Rect;
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->r:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPreviewScalingStrategy()La/tub0;
    .locals 1

    .line 1
    iget-object v0, p0, La/d2a;->u:La/tub0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object p0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    new-instance p0, La/tab;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p0, v0}, La/tab;-><init>(B)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance p0, La/tab;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p0, v0}, La/tab;-><init>(B)V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public getPreviewSize()La/g7k0;
    .locals 0

    .line 1
    iget-object p0, p0, La/d2a;->n:La/g7k0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/d2a;->d:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/view/TextureView;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 18
    .line 19
    new-instance v1, La/a2a;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, La/a2a;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Landroid/view/SurfaceView;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {v0, v1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, La/d2a;->w:La/b2a;

    .line 50
    .line 51
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    new-instance p1, La/g7k0;

    .line 2
    .line 3
    sub-int/2addr p4, p2

    .line 4
    sub-int/2addr p5, p3

    .line 5
    invoke-direct {p1, p4, p5}, La/g7k0;-><init>(II)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, La/d2a;->m:La/g7k0;

    .line 9
    .line 10
    iget-object p2, p0, La/d2a;->a:La/q0a;

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object p2, p2, La/q0a;->e:La/zz2;

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    new-instance p2, La/zz2;

    .line 19
    .line 20
    invoke-direct {p0}, La/d2a;->getDisplayRotation()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance p4, La/tab;

    .line 28
    .line 29
    const/4 p5, 0x1

    .line 30
    invoke-direct {p4, p5}, La/tab;-><init>(B)V

    .line 31
    .line 32
    .line 33
    iput-object p4, p2, La/zz2;->c:Ljava/lang/Object;

    .line 34
    .line 35
    iput p3, p2, La/zz2;->a:I

    .line 36
    .line 37
    iput-object p1, p2, La/zz2;->b:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p2, p0, La/d2a;->k:La/zz2;

    .line 40
    .line 41
    invoke-virtual {p0}, La/d2a;->getPreviewScalingStrategy()La/tub0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p2, La/zz2;->c:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object p1, p0, La/d2a;->a:La/q0a;

    .line 48
    .line 49
    iget-object p2, p0, La/d2a;->k:La/zz2;

    .line 50
    .line 51
    iput-object p2, p1, La/q0a;->e:La/zz2;

    .line 52
    .line 53
    iget-object p3, p1, La/q0a;->c:La/a1a;

    .line 54
    .line 55
    iput-object p2, p3, La/a1a;->h:La/zz2;

    .line 56
    .line 57
    invoke-static {}, La/cvm0;->q()V

    .line 58
    .line 59
    .line 60
    iget-boolean p2, p1, La/q0a;->f:Z

    .line 61
    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    iget-object p2, p1, La/q0a;->a:La/sbx0;

    .line 65
    .line 66
    iget-object p1, p1, La/q0a;->j:La/p0a;

    .line 67
    .line 68
    invoke-virtual {p2, p1}, La/sbx0;->e(Ljava/lang/Runnable;)V

    .line 69
    .line 70
    .line 71
    iget-boolean p1, p0, La/d2a;->v:Z

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    iget-object p2, p0, La/d2a;->a:La/q0a;

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {}, La/cvm0;->q()V

    .line 81
    .line 82
    .line 83
    iget-boolean p3, p2, La/q0a;->f:Z

    .line 84
    .line 85
    if-eqz p3, :cond_1

    .line 86
    .line 87
    iget-object p3, p2, La/q0a;->a:La/sbx0;

    .line 88
    .line 89
    new-instance p4, La/hp2;

    .line 90
    .line 91
    const/4 p5, 0x2

    .line 92
    invoke-direct {p4, p2, p1, p5}, La/hp2;-><init>(Ljava/lang/Object;ZB)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, p4}, La/sbx0;->e(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const-string p0, "CameraInstance is not open"

    .line 100
    .line 101
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    :goto_0
    iget-object p1, p0, La/d2a;->e:Landroid/view/SurfaceView;

    .line 106
    .line 107
    const/4 p2, 0x0

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    iget-object p3, p0, La/d2a;->o:Landroid/graphics/Rect;

    .line 111
    .line 112
    if-nez p3, :cond_2

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 115
    .line 116
    .line 117
    move-result p3

    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    invoke-virtual {p1, p2, p2, p3, p0}, Landroid/view/View;->layout(IIII)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_2
    iget p0, p3, Landroid/graphics/Rect;->left:I

    .line 127
    .line 128
    iget p2, p3, Landroid/graphics/Rect;->top:I

    .line 129
    .line 130
    iget p4, p3, Landroid/graphics/Rect;->right:I

    .line 131
    .line 132
    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    .line 133
    .line 134
    invoke-virtual {p1, p0, p2, p4, p3}, Landroid/view/View;->layout(IIII)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_3
    iget-object p1, p0, La/d2a;->f:Landroid/view/TextureView;

    .line 139
    .line 140
    if-eqz p1, :cond_4

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    invoke-virtual {p1, p2, p2, p3, p0}, Landroid/view/View;->layout(IIII)V

    .line 151
    .line 152
    .line 153
    :cond_4
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Landroid/os/Bundle;

    .line 10
    .line 11
    const-string v0, "super"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "torch"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, La/d2a;->setTorch(Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "super"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "torch"

    .line 16
    .line 17
    iget-boolean p0, p0, La/d2a;->v:Z

    .line 18
    .line 19
    invoke-virtual {v1, v0, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public setCameraSettings(La/o2a;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d2a;->l:La/o2a;

    .line 2
    .line 3
    return-void
.end method

.method public setFramingRectSize(La/g7k0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d2a;->s:La/g7k0;

    .line 2
    .line 3
    return-void
.end method

.method public setMarginFraction(D)V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    .line 2
    .line 3
    cmpl-double v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput-wide p1, p0, La/d2a;->t:D

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p0, "The margin fraction must be less than 0.5"

    .line 11
    .line 12
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setPreviewScalingStrategy(La/tub0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d2a;->u:La/tub0;

    .line 2
    .line 3
    return-void
.end method

.method public setTorch(Z)V
    .locals 3

    .line 1
    iput-boolean p1, p0, La/d2a;->v:Z

    .line 2
    .line 3
    iget-object p0, p0, La/d2a;->a:La/q0a;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {}, La/cvm0;->q()V

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, La/q0a;->f:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, La/q0a;->a:La/sbx0;

    .line 15
    .line 16
    new-instance v1, La/hp2;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v1, p0, p1, v2}, La/hp2;-><init>(Ljava/lang/Object;ZB)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/sbx0;->e(Ljava/lang/Runnable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public setUseTextureView(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/d2a;->d:Z

    .line 2
    .line 3
    return-void
.end method
