.class public La/p8l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 163
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/p8l;->d:Ljava/lang/Object;

    .line 164
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    iput-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 165
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    iput-object v0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 166
    sget-object v0, La/vfr;->a:[I

    iput-object v0, p0, La/p8l;->g:Ljava/lang/Object;

    .line 167
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    iput-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 168
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object v0, p0, La/p8l;->k:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 169
    iput-object v0, p0, La/p8l;->l:Ljava/lang/Object;

    .line 170
    sget-object v0, La/sfr;->a:La/sfr;

    iput-object v0, p0, La/p8l;->m:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 171
    iput v0, p0, La/p8l;->a:I

    return-void
.end method

.method public constructor <init>(La/p7l;La/i8l;)V
    .locals 3

    .line 172
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 173
    iput-object p1, p0, La/p8l;->c:Ljava/lang/Object;

    .line 174
    iput-object p2, p0, La/p8l;->d:Ljava/lang/Object;

    .line 175
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La/p8l;->b:Ljava/lang/Object;

    .line 176
    new-instance v0, La/kki;

    invoke-direct {v0, p1, p2}, La/kki;-><init>(La/p7l;La/i8l;)V

    iput-object v0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 177
    new-instance v0, La/m8l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/m8l;-><init>(La/p8l;B)V

    .line 178
    sget-object v1, La/wez;->b:La/wez;

    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    move-result-object v0

    .line 179
    iput-object v0, p0, La/p8l;->g:Ljava/lang/Object;

    .line 180
    new-instance v0, La/m8l;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, La/m8l;-><init>(La/p8l;B)V

    .line 181
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    move-result-object v0

    .line 182
    iput-object v0, p0, La/p8l;->h:Ljava/lang/Object;

    .line 183
    new-instance v0, La/m8l;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, La/m8l;-><init>(La/p8l;B)V

    .line 184
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    move-result-object v0

    .line 185
    iput-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 186
    new-instance v0, La/m8l;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2}, La/m8l;-><init>(La/p8l;B)V

    .line 187
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    move-result-object v0

    .line 188
    iput-object v0, p0, La/p8l;->j:Ljava/lang/Object;

    .line 189
    new-instance v0, La/m8l;

    const/4 v2, 0x4

    invoke-direct {v0, p0, v2}, La/m8l;-><init>(La/p8l;B)V

    .line 190
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    move-result-object v0

    .line 191
    iput-object v0, p0, La/p8l;->k:Ljava/lang/Object;

    .line 192
    const-string v0, ""

    iput-object v0, p0, La/p8l;->l:Ljava/lang/Object;

    .line 193
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 194
    new-instance v0, La/l8l;

    invoke-direct {v0, p1, p2}, La/l8l;-><init>(La/p7l;La/i8l;)V

    iput-object v0, p0, La/p8l;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p8l;->m:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/p8l;->b:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Landroid/graphics/Paint;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/p8l;->g:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 22
    .line 23
    .line 24
    const/16 v2, -0x55cd

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 27
    .line 28
    .line 29
    const/high16 v2, 0x40000000    # 2.0f

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 32
    .line 33
    .line 34
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 35
    .line 36
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, La/p8l;->h:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 47
    .line 48
    .line 49
    const v4, -0x1f8a66

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, Landroid/graphics/Paint;

    .line 62
    .line 63
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 69
    .line 70
    .line 71
    const v4, -0xcc5600

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 81
    .line 82
    .line 83
    new-instance v2, Landroid/graphics/Paint;

    .line 84
    .line 85
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v2, p0, La/p8l;->j:Ljava/lang/Object;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 109
    .line 110
    const/high16 v3, 0x41400000    # 12.0f

    .line 111
    .line 112
    mul-float/2addr p1, v3

    .line 113
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 114
    .line 115
    .line 116
    const/16 p1, 0x8

    .line 117
    .line 118
    new-array p1, p1, [F

    .line 119
    .line 120
    iput-object p1, p0, La/p8l;->l:Ljava/lang/Object;

    .line 121
    .line 122
    new-instance p1, Landroid/graphics/Paint;

    .line 123
    .line 124
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, La/p8l;->k:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 130
    .line 131
    .line 132
    new-instance p1, Landroid/graphics/DashPathEffect;

    .line 133
    .line 134
    const/4 v1, 0x2

    .line 135
    new-array v1, v1, [F

    .line 136
    .line 137
    fill-array-data v1, :array_0

    .line 138
    .line 139
    .line 140
    const/4 v2, 0x0

    .line 141
    invoke-direct {p1, v1, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 145
    .line 146
    .line 147
    const/16 p1, 0x64

    .line 148
    .line 149
    new-array p1, p1, [F

    .line 150
    .line 151
    iput-object p1, p0, La/p8l;->e:Ljava/lang/Object;

    .line 152
    .line 153
    const/16 p1, 0x32

    .line 154
    .line 155
    new-array p1, p1, [I

    .line 156
    .line 157
    iput-object p1, p0, La/p8l;->d:Ljava/lang/Object;

    .line 158
    .line 159
    return-void

    .line 160
    nop

    .line 161
    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x41000000    # 8.0f
    .end array-data
.end method


# virtual methods
.method public A(JLa/vne;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/p7l;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/p8l;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/i8l;

    .line 11
    .line 12
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, La/p8l;->n()La/j8l;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0}, La/p7l;->e()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    invoke-virtual {v0}, La/p7l;->f()F

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    const/4 v10, 0x0

    .line 39
    const/16 v11, 0x20

    .line 40
    .line 41
    const v4, 0x7f0804b8

    .line 42
    .line 43
    .line 44
    move-wide v5, p1

    .line 45
    move-object v7, p3

    .line 46
    invoke-static/range {v3 .. v11}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, La/p8l;->n()La/j8l;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/16 p2, 0x8

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/p8l;->m:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/l8l;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    move-wide v5, p1

    .line 67
    move-object v7, p3

    .line 68
    new-instance p1, La/o8l;

    .line 69
    .line 70
    invoke-direct {p1, p0, v5, v6, v7}, La/o8l;-><init>(La/p8l;JLa/vne;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public B(I)V
    .locals 2

    .line 1
    iget-object v0, p0, La/p8l;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    iget-object v1, p0, La/p8l;->m:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/sfr;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/tfr;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, La/p8l;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/tfr;

    .line 20
    .line 21
    if-eq v1, v0, :cond_0

    .line 22
    .line 23
    iput-object v0, p0, La/p8l;->l:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0}, La/tfr;->b()V

    .line 26
    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Using program for input format "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/p8l;->m:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, La/sfr;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ": "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/p8l;->l:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, La/tfr;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "OpenGlRenderer"

    .line 59
    .line 60
    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_0
    const p0, 0x84c0

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    .line 67
    .line 68
    .line 69
    const-string p0, "glActiveTexture"

    .line 70
    .line 71
    invoke-static {p0}, La/vfr;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const p0, 0x8d65

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 78
    .line 79
    .line 80
    const-string p0, "glBindTexture"

    .line 81
    .line 82
    invoke-static {p0}, La/vfr;->b(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_1
    iget-object p0, p0, La/p8l;->m:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p0, La/sfr;

    .line 89
    .line 90
    const-string p1, "Unable to configure program for input format: "

    .line 91
    .line 92
    invoke-static {p0, p1}, La/hny;->w(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public a(La/agn;La/v35;)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v2}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iput-object v3, v0, La/p8l;->e:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 13
    .line 14
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-nez v3, :cond_8

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    new-array v4, v3, [I

    .line 22
    .line 23
    iget-object v5, v0, La/p8l;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, Landroid/opengl/EGLDisplay;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-static {v5, v4, v2, v4, v6}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_7

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    new-instance v5, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    aget v7, v4, v2

    .line 42
    .line 43
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v7, "."

    .line 47
    .line 48
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    aget v4, v4, v6

    .line 52
    .line 53
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    iput-object v4, v1, La/v35;->b:Ljava/lang/String;

    .line 61
    .line 62
    :cond_0
    invoke-virtual/range {p1 .. p1}, La/agn;->a()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    const/16 v4, 0x8

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    const/16 v1, 0xa

    .line 71
    .line 72
    move v8, v1

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    move v8, v4

    .line 75
    :goto_0
    invoke-virtual/range {p1 .. p1}, La/agn;->a()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    move v14, v3

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v14, v4

    .line 84
    :goto_1
    invoke-virtual/range {p1 .. p1}, La/agn;->a()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    const/16 v1, 0x40

    .line 91
    .line 92
    :goto_2
    move/from16 v20, v1

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    const/4 v1, 0x4

    .line 96
    goto :goto_2

    .line 97
    :goto_3
    invoke-virtual/range {p1 .. p1}, La/agn;->a()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    const/4 v1, -0x1

    .line 104
    move/from16 v22, v1

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_4
    move/from16 v22, v6

    .line 108
    .line 109
    :goto_4
    const/16 v24, 0x5

    .line 110
    .line 111
    const/16 v25, 0x3038

    .line 112
    .line 113
    const/16 v7, 0x3024

    .line 114
    .line 115
    const/16 v9, 0x3023

    .line 116
    .line 117
    const/16 v11, 0x3022

    .line 118
    .line 119
    const/16 v13, 0x3021

    .line 120
    .line 121
    const/16 v15, 0x3025

    .line 122
    .line 123
    const/16 v16, 0x0

    .line 124
    .line 125
    const/16 v17, 0x3026

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v19, 0x3040

    .line 130
    .line 131
    const/16 v21, 0x3142

    .line 132
    .line 133
    const/16 v23, 0x3033

    .line 134
    .line 135
    move v10, v8

    .line 136
    move v12, v8

    .line 137
    filled-new-array/range {v7 .. v25}, [I

    .line 138
    .line 139
    .line 140
    move-result-object v27

    .line 141
    const/4 v1, 0x1

    .line 142
    new-array v4, v1, [Landroid/opengl/EGLConfig;

    .line 143
    .line 144
    new-array v5, v6, [I

    .line 145
    .line 146
    iget-object v7, v0, La/p8l;->e:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v26, v7

    .line 149
    .line 150
    check-cast v26, Landroid/opengl/EGLDisplay;

    .line 151
    .line 152
    const/16 v30, 0x0

    .line 153
    .line 154
    const/16 v33, 0x0

    .line 155
    .line 156
    const/16 v28, 0x0

    .line 157
    .line 158
    move/from16 v31, v1

    .line 159
    .line 160
    move-object/from16 v29, v4

    .line 161
    .line 162
    move-object/from16 v32, v5

    .line 163
    .line 164
    invoke-static/range {v26 .. v33}, Landroid/opengl/EGL14;->eglChooseConfig(Landroid/opengl/EGLDisplay;[II[Landroid/opengl/EGLConfig;II[II)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_6

    .line 169
    .line 170
    aget-object v1, v29, v2

    .line 171
    .line 172
    invoke-virtual/range {p1 .. p1}, La/agn;->a()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_5

    .line 177
    .line 178
    const/4 v3, 0x3

    .line 179
    :cond_5
    const/16 v4, 0x3038

    .line 180
    .line 181
    const/16 v5, 0x3098

    .line 182
    .line 183
    filled-new-array {v5, v3, v4}, [I

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iget-object v4, v0, La/p8l;->e:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v4, Landroid/opengl/EGLDisplay;

    .line 190
    .line 191
    sget-object v7, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 192
    .line 193
    invoke-static {v4, v1, v7, v3, v2}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    const-string v4, "eglCreateContext"

    .line 198
    .line 199
    invoke-static {v4}, La/vfr;->a(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    iput-object v1, v0, La/p8l;->h:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v3, v0, La/p8l;->f:Ljava/lang/Object;

    .line 205
    .line 206
    new-array v1, v6, [I

    .line 207
    .line 208
    iget-object v0, v0, La/p8l;->e:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 211
    .line 212
    invoke-static {v0, v3, v5, v1, v2}, Landroid/opengl/EGL14;->eglQueryContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;I[II)Z

    .line 213
    .line 214
    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v3, "EGLContext created, client version "

    .line 218
    .line 219
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    aget v1, v1, v2

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    const-string v1, "OpenGlRenderer"

    .line 232
    .line 233
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :cond_6
    const-string v0, "Unable to find a suitable EGLConfig"

    .line 238
    .line 239
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :cond_7
    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 244
    .line 245
    iput-object v1, v0, La/p8l;->e:Ljava/lang/Object;

    .line 246
    .line 247
    const-string v0, "Unable to initialize EGL14"

    .line 248
    .line 249
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_8
    const-string v0, "Unable to get EGL14 display"

    .line 254
    .line 255
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-void
.end method

.method public b(Landroid/view/Surface;)La/m45;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    iget-object v1, p0, La/p8l;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/opengl/EGLConfig;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    :try_start_1
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 10
    .line 11
    .line 12
    :try_start_2
    iget-object v2, p0, La/p8l;->g:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [I
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 15
    .line 16
    :try_start_3
    invoke-static {v0, v1, p1, v2}, La/vfr;->i(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/view/Surface;[I)Landroid/opengl/EGLSurface;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    .line 20
    iget-object p0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/opengl/EGLDisplay;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    new-array v1, v0, [I

    .line 26
    .line 27
    const/16 v2, 0x3057

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-static {p0, p1, v2, v1, v3}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    .line 31
    .line 32
    .line 33
    aget v1, v1, v3

    .line 34
    .line 35
    new-array v0, v0, [I

    .line 36
    .line 37
    const/16 v2, 0x3056

    .line 38
    .line 39
    invoke-static {p0, p1, v2, v0, v3}, Landroid/opengl/EGL14;->eglQuerySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;I[II)Z

    .line 40
    .line 41
    .line 42
    aget p0, v0, v3

    .line 43
    .line 44
    new-instance v0, Landroid/util/Size;

    .line 45
    .line 46
    invoke-direct {v0, v1, p0}, Landroid/util/Size;-><init>(II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    new-instance v1, La/m45;

    .line 58
    .line 59
    invoke-direct {v1, p1, p0, v0}, La/m45;-><init>(Landroid/opengl/EGLSurface;II)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :catch_0
    move-exception p0

    .line 64
    goto :goto_0

    .line 65
    :catch_1
    move-exception p0

    .line 66
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v0, "Failed to create EGL surface: "

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "OpenGlRenderer"

    .line 85
    .line 86
    invoke-static {v0, p1, p0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    return-object p0
.end method

.method public c()V
    .locals 6

    .line 1
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    iget-object v1, p0, La/p8l;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/opengl/EGLConfig;

    .line 8
    .line 9
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    sget-object v2, La/vfr;->a:[I

    .line 13
    .line 14
    const/16 v2, 0x3056

    .line 15
    .line 16
    const/16 v3, 0x3038

    .line 17
    .line 18
    const/16 v4, 0x3057

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    filled-new-array {v4, v5, v2, v5, v3}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-static {v0, v1, v2, v3}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "eglCreatePbufferSurface"

    .line 31
    .line 32
    invoke-static {v1}, La/vfr;->a(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iput-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const-string p0, "surface was null"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public d(Landroid/graphics/Canvas;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/p8l;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/a8z;

    .line 8
    .line 9
    iget-object v3, v0, La/p8l;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Landroid/graphics/Rect;

    .line 12
    .line 13
    iget-object v4, v0, La/p8l;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Landroid/graphics/Rect;

    .line 16
    .line 17
    iget-object v5, v0, La/p8l;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/p7l;

    .line 20
    .line 21
    iget v6, v5, La/p7l;->r:I

    .line 22
    .line 23
    iget-object v7, v5, La/p7l;->u:La/a8z;

    .line 24
    .line 25
    iget v8, v5, La/p7l;->c:I

    .line 26
    .line 27
    iget-object v9, v0, La/p8l;->m:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v9, La/l8l;

    .line 30
    .line 31
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v10, v9, La/l8l;->e:Landroid/graphics/RectF;

    .line 35
    .line 36
    iget-object v11, v9, La/l8l;->b:La/i8l;

    .line 37
    .line 38
    iget-object v12, v9, La/l8l;->f:Landroid/graphics/Rect;

    .line 39
    .line 40
    iget v13, v12, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    int-to-float v13, v13

    .line 43
    iget v14, v12, Landroid/graphics/Rect;->top:I

    .line 44
    .line 45
    int-to-float v14, v14

    .line 46
    iget v15, v12, Landroid/graphics/Rect;->right:I

    .line 47
    .line 48
    int-to-float v15, v15

    .line 49
    move-object/from16 v16, v2

    .line 50
    .line 51
    iget v2, v12, Landroid/graphics/Rect;->bottom:I

    .line 52
    .line 53
    int-to-float v2, v2

    .line 54
    move/from16 v24, v15

    .line 55
    .line 56
    move v15, v2

    .line 57
    move-object v2, v12

    .line 58
    move v12, v13

    .line 59
    move v13, v14

    .line 60
    move/from16 v14, v24

    .line 61
    .line 62
    invoke-static/range {v10 .. v15}, La/l8l;->a(Landroid/graphics/RectF;Landroid/view/ViewGroup;FFFF)V

    .line 63
    .line 64
    .line 65
    iget-object v12, v9, La/l8l;->a:La/p7l;

    .line 66
    .line 67
    iget v13, v12, La/p7l;->g:F

    .line 68
    .line 69
    iget v14, v12, La/p7l;->e:F

    .line 70
    .line 71
    mul-float v15, v13, v14

    .line 72
    .line 73
    move-object/from16 v17, v3

    .line 74
    .line 75
    iget v3, v12, La/p7l;->b:I

    .line 76
    .line 77
    mul-float/2addr v13, v14

    .line 78
    iget-object v14, v9, La/l8l;->c:La/a8z;

    .line 79
    .line 80
    invoke-interface {v14}, La/a8z;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    check-cast v14, Landroid/graphics/Paint;

    .line 85
    .line 86
    invoke-virtual {v1, v10, v15, v13, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 87
    .line 88
    .line 89
    iget v13, v2, Landroid/graphics/Rect;->right:I

    .line 90
    .line 91
    iget v14, v12, La/p7l;->c:I

    .line 92
    .line 93
    sub-int/2addr v13, v14

    .line 94
    iget v15, v9, La/l8l;->g:I

    .line 95
    .line 96
    sub-int v15, v13, v15

    .line 97
    .line 98
    int-to-float v15, v15

    .line 99
    move-object/from16 v18, v7

    .line 100
    .line 101
    iget v7, v2, Landroid/graphics/Rect;->top:I

    .line 102
    .line 103
    move/from16 v19, v7

    .line 104
    .line 105
    add-int v7, v19, v14

    .line 106
    .line 107
    int-to-float v7, v7

    .line 108
    int-to-float v13, v13

    .line 109
    invoke-virtual {v12}, La/p7l;->d()I

    .line 110
    .line 111
    .line 112
    move-result v20

    .line 113
    add-int v20, v20, v19

    .line 114
    .line 115
    move/from16 v19, v7

    .line 116
    .line 117
    add-int v7, v20, v14

    .line 118
    .line 119
    int-to-float v7, v7

    .line 120
    move/from16 v24, v15

    .line 121
    .line 122
    move v15, v7

    .line 123
    move-object v7, v12

    .line 124
    move/from16 v12, v24

    .line 125
    .line 126
    move/from16 v24, v14

    .line 127
    .line 128
    move v14, v13

    .line 129
    move/from16 v13, v19

    .line 130
    .line 131
    move/from16 v19, v24

    .line 132
    .line 133
    invoke-static/range {v10 .. v15}, La/l8l;->a(Landroid/graphics/RectF;Landroid/view/ViewGroup;FFFF)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7}, La/p7l;->a()F

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    invoke-virtual {v7}, La/p7l;->a()F

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    iget-object v14, v9, La/l8l;->d:La/a8z;

    .line 145
    .line 146
    invoke-interface {v14}, La/a8z;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    check-cast v15, Landroid/graphics/Paint;

    .line 151
    .line 152
    invoke-virtual {v1, v10, v12, v13, v15}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 153
    .line 154
    .line 155
    iget-boolean v12, v9, La/l8l;->h:Z

    .line 156
    .line 157
    const/high16 v20, 0x3fc00000    # 1.5f

    .line 158
    .line 159
    if-nez v12, :cond_0

    .line 160
    .line 161
    move-object/from16 v23, v7

    .line 162
    .line 163
    move-object v7, v14

    .line 164
    goto :goto_0

    .line 165
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    invoke-virtual {v7}, La/p7l;->g()I

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    int-to-float v13, v13

    .line 174
    mul-float v13, v13, v20

    .line 175
    .line 176
    sub-float/2addr v12, v13

    .line 177
    int-to-float v13, v3

    .line 178
    sub-float/2addr v12, v13

    .line 179
    iget v15, v2, Landroid/graphics/Rect;->bottom:I

    .line 180
    .line 181
    sub-int v15, v15, v19

    .line 182
    .line 183
    invoke-virtual {v7}, La/p7l;->d()I

    .line 184
    .line 185
    .line 186
    move-result v21

    .line 187
    sub-int v15, v15, v21

    .line 188
    .line 189
    int-to-float v15, v15

    .line 190
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 191
    .line 192
    .line 193
    move-result v21

    .line 194
    invoke-virtual {v7}, La/p7l;->g()I

    .line 195
    .line 196
    .line 197
    move-result v22

    .line 198
    move-object/from16 v23, v7

    .line 199
    .line 200
    div-int/lit8 v7, v22, 0x2

    .line 201
    .line 202
    int-to-float v7, v7

    .line 203
    sub-float v21, v21, v7

    .line 204
    .line 205
    sub-float v21, v21, v13

    .line 206
    .line 207
    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 208
    .line 209
    sub-int v7, v7, v19

    .line 210
    .line 211
    int-to-float v7, v7

    .line 212
    move v13, v15

    .line 213
    move v15, v7

    .line 214
    move-object v7, v14

    .line 215
    move/from16 v14, v21

    .line 216
    .line 217
    invoke-static/range {v10 .. v15}, La/l8l;->a(Landroid/graphics/RectF;Landroid/view/ViewGroup;FFFF)V

    .line 218
    .line 219
    .line 220
    invoke-virtual/range {v23 .. v23}, La/p7l;->a()F

    .line 221
    .line 222
    .line 223
    move-result v12

    .line 224
    invoke-virtual/range {v23 .. v23}, La/p7l;->a()F

    .line 225
    .line 226
    .line 227
    move-result v13

    .line 228
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v14

    .line 232
    check-cast v14, Landroid/graphics/Paint;

    .line 233
    .line 234
    invoke-virtual {v1, v10, v12, v13, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 235
    .line 236
    .line 237
    :goto_0
    iget-boolean v9, v9, La/l8l;->i:Z

    .line 238
    .line 239
    if-nez v9, :cond_1

    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    invoke-virtual/range {v23 .. v23}, La/p7l;->g()I

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    div-int/lit8 v12, v12, 0x2

    .line 251
    .line 252
    int-to-float v12, v12

    .line 253
    add-float/2addr v9, v12

    .line 254
    int-to-float v3, v3

    .line 255
    add-float v12, v9, v3

    .line 256
    .line 257
    iget v9, v2, Landroid/graphics/Rect;->bottom:I

    .line 258
    .line 259
    sub-int v9, v9, v19

    .line 260
    .line 261
    invoke-virtual/range {v23 .. v23}, La/p7l;->d()I

    .line 262
    .line 263
    .line 264
    move-result v13

    .line 265
    sub-int/2addr v9, v13

    .line 266
    int-to-float v13, v9

    .line 267
    invoke-virtual {v2}, Landroid/graphics/Rect;->exactCenterX()F

    .line 268
    .line 269
    .line 270
    move-result v9

    .line 271
    invoke-virtual/range {v23 .. v23}, La/p7l;->g()I

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    int-to-float v14, v14

    .line 276
    mul-float v14, v14, v20

    .line 277
    .line 278
    add-float/2addr v14, v9

    .line 279
    add-float/2addr v14, v3

    .line 280
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 281
    .line 282
    sub-int v2, v2, v19

    .line 283
    .line 284
    int-to-float v15, v2

    .line 285
    invoke-static/range {v10 .. v15}, La/l8l;->a(Landroid/graphics/RectF;Landroid/view/ViewGroup;FFFF)V

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v23 .. v23}, La/p7l;->a()F

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    invoke-virtual/range {v23 .. v23}, La/p7l;->a()F

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    check-cast v7, Landroid/graphics/Paint;

    .line 301
    .line 302
    invoke-virtual {v1, v10, v2, v3, v7}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 303
    .line 304
    .line 305
    :goto_1
    iget-object v2, v0, La/p8l;->l:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v2, Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    invoke-interface/range {v16 .. v16}, La/a8z;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    check-cast v7, Landroid/widget/ImageView;

    .line 318
    .line 319
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    sub-int/2addr v3, v7

    .line 324
    mul-int/lit8 v7, v8, 0x4

    .line 325
    .line 326
    sub-int/2addr v3, v7

    .line 327
    iget v7, v0, La/p8l;->a:I

    .line 328
    .line 329
    sub-int/2addr v3, v7

    .line 330
    int-to-float v3, v3

    .line 331
    invoke-interface/range {v18 .. v18}, La/a8z;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    check-cast v7, Landroid/text/TextPaint;

    .line 336
    .line 337
    invoke-virtual {v7, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 338
    .line 339
    .line 340
    move-result v7

    .line 341
    cmpg-float v7, v3, v7

    .line 342
    .line 343
    if-gez v7, :cond_2

    .line 344
    .line 345
    invoke-interface/range {v18 .. v18}, La/a8z;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v7

    .line 349
    check-cast v7, Landroid/text/TextPaint;

    .line 350
    .line 351
    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 352
    .line 353
    invoke-static {v2, v7, v3, v9}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    :cond_2
    invoke-virtual/range {v17 .. v17}, Landroid/graphics/Rect;->width()I

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    iget-object v0, v0, La/p8l;->d:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v0, La/i8l;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-nez v0, :cond_3

    .line 374
    .line 375
    iget v0, v4, Landroid/graphics/Rect;->left:I

    .line 376
    .line 377
    mul-int/lit8 v8, v8, 0x2

    .line 378
    .line 379
    add-int/2addr v8, v0

    .line 380
    int-to-float v0, v6

    .line 381
    iget v3, v5, La/p7l;->e:F

    .line 382
    .line 383
    mul-float/2addr v0, v3

    .line 384
    invoke-static {v0}, La/si30;->b(F)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    add-int/2addr v0, v8

    .line 389
    int-to-float v0, v0

    .line 390
    goto :goto_2

    .line 391
    :cond_3
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    int-to-float v0, v0

    .line 396
    mul-int/lit8 v8, v8, 0x2

    .line 397
    .line 398
    int-to-float v6, v6

    .line 399
    iget v7, v5, La/p7l;->e:F

    .line 400
    .line 401
    mul-float/2addr v6, v7

    .line 402
    invoke-static {v6}, La/si30;->b(F)I

    .line 403
    .line 404
    .line 405
    move-result v6

    .line 406
    add-int/2addr v6, v8

    .line 407
    add-int/2addr v6, v3

    .line 408
    int-to-float v3, v6

    .line 409
    sub-float/2addr v0, v3

    .line 410
    :goto_2
    iget v3, v4, Landroid/graphics/Rect;->top:I

    .line 411
    .line 412
    iget v4, v5, La/p7l;->s:I

    .line 413
    .line 414
    int-to-float v4, v4

    .line 415
    iget v5, v5, La/p7l;->e:F

    .line 416
    .line 417
    mul-float/2addr v4, v5

    .line 418
    invoke-static {v4}, La/si30;->b(F)I

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    add-int/2addr v4, v3

    .line 423
    invoke-interface/range {v16 .. v16}, La/a8z;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    check-cast v3, Landroid/widget/ImageView;

    .line 428
    .line 429
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    div-int/lit8 v3, v3, 0x2

    .line 434
    .line 435
    add-int/2addr v3, v4

    .line 436
    invoke-virtual/range {v17 .. v17}, Landroid/graphics/Rect;->height()I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    div-int/lit8 v4, v4, 0x2

    .line 441
    .line 442
    add-int/2addr v4, v3

    .line 443
    int-to-float v3, v4

    .line 444
    invoke-interface/range {v18 .. v18}, La/a8z;->getValue()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    check-cast v4, Landroid/text/TextPaint;

    .line 449
    .line 450
    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 451
    .line 452
    .line 453
    return-void
.end method

.method public e(Landroid/graphics/Canvas;IILa/ds40;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v7, p2

    .line 4
    .line 5
    move-object/from16 v8, p4

    .line 6
    .line 7
    iget-object v1, v0, La/p8l;->i:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v6, v1

    .line 10
    check-cast v6, Landroid/graphics/Paint;

    .line 11
    .line 12
    iget-object v1, v0, La/p8l;->d:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v9, v1

    .line 15
    check-cast v9, [I

    .line 16
    .line 17
    const/4 v10, 0x2

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x1

    .line 20
    const/4 v13, 0x4

    .line 21
    if-ne v7, v13, :cond_4

    .line 22
    .line 23
    move v1, v11

    .line 24
    move v2, v1

    .line 25
    move v14, v2

    .line 26
    :goto_0
    iget v3, v0, La/p8l;->a:I

    .line 27
    .line 28
    if-ge v1, v3, :cond_2

    .line 29
    .line 30
    aget v3, v9, v1

    .line 31
    .line 32
    if-ne v3, v12, :cond_0

    .line 33
    .line 34
    move v2, v12

    .line 35
    :cond_0
    if-nez v3, :cond_1

    .line 36
    .line 37
    move v14, v12

    .line 38
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    if-eqz v2, :cond_3

    .line 42
    .line 43
    iget-object v1, v0, La/p8l;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, [F

    .line 46
    .line 47
    aget v2, v1, v11

    .line 48
    .line 49
    aget v3, v1, v12

    .line 50
    .line 51
    array-length v4, v1

    .line 52
    sub-int/2addr v4, v10

    .line 53
    aget v4, v1, v4

    .line 54
    .line 55
    array-length v5, v1

    .line 56
    sub-int/2addr v5, v12

    .line 57
    aget v5, v1, v5

    .line 58
    .line 59
    move-object/from16 v1, p1

    .line 60
    .line 61
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    if-eqz v14, :cond_4

    .line 65
    .line 66
    invoke-virtual/range {p0 .. p1}, La/p8l;->f(Landroid/graphics/Canvas;)V

    .line 67
    .line 68
    .line 69
    :cond_4
    if-ne v7, v10, :cond_5

    .line 70
    .line 71
    iget-object v1, v0, La/p8l;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, [F

    .line 74
    .line 75
    aget v2, v1, v11

    .line 76
    .line 77
    aget v3, v1, v12

    .line 78
    .line 79
    array-length v4, v1

    .line 80
    sub-int/2addr v4, v10

    .line 81
    aget v4, v1, v4

    .line 82
    .line 83
    array-length v5, v1

    .line 84
    sub-int/2addr v5, v12

    .line 85
    aget v5, v1, v5

    .line 86
    .line 87
    move-object/from16 v1, p1

    .line 88
    .line 89
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    move-object/from16 v1, p1

    .line 94
    .line 95
    :goto_1
    const/4 v6, 0x3

    .line 96
    if-ne v7, v6, :cond_6

    .line 97
    .line 98
    invoke-virtual/range {p0 .. p1}, La/p8l;->f(Landroid/graphics/Canvas;)V

    .line 99
    .line 100
    .line 101
    :cond_6
    iget-object v2, v0, La/p8l;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, [F

    .line 104
    .line 105
    iget-object v3, v0, La/p8l;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v3, Landroid/graphics/Paint;

    .line 108
    .line 109
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, La/p8l;->h:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v14, v2

    .line 115
    check-cast v14, Landroid/graphics/Paint;

    .line 116
    .line 117
    iget-object v2, v0, La/p8l;->k:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v15, v2

    .line 120
    check-cast v15, Landroid/graphics/Paint;

    .line 121
    .line 122
    iget-object v2, v8, La/ds40;->b:Landroid/view/View;

    .line 123
    .line 124
    if-eqz v2, :cond_7

    .line 125
    .line 126
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    iget-object v3, v8, La/ds40;->b:Landroid/view/View;

    .line 131
    .line 132
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    move v4, v2

    .line 137
    move v5, v3

    .line 138
    goto :goto_2

    .line 139
    :cond_7
    move v4, v11

    .line 140
    move v5, v4

    .line 141
    :goto_2
    move v2, v12

    .line 142
    :goto_3
    add-int/lit8 v3, p3, -0x1

    .line 143
    .line 144
    if-ge v2, v3, :cond_10

    .line 145
    .line 146
    if-ne v7, v13, :cond_8

    .line 147
    .line 148
    add-int/lit8 v3, v2, -0x1

    .line 149
    .line 150
    aget v3, v9, v3

    .line 151
    .line 152
    if-nez v3, :cond_8

    .line 153
    .line 154
    move v10, v6

    .line 155
    move/from16 v17, v11

    .line 156
    .line 157
    move v6, v2

    .line 158
    goto/16 :goto_7

    .line 159
    .line 160
    :cond_8
    iget-object v3, v0, La/p8l;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v3, [F

    .line 163
    .line 164
    mul-int/lit8 v16, v2, 0x2

    .line 165
    .line 166
    move/from16 v17, v11

    .line 167
    .line 168
    aget v11, v3, v16

    .line 169
    .line 170
    add-int/lit8 v16, v16, 0x1

    .line 171
    .line 172
    aget v3, v3, v16

    .line 173
    .line 174
    iget-object v6, v0, La/p8l;->f:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v6, Landroid/graphics/Path;

    .line 177
    .line 178
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 179
    .line 180
    .line 181
    iget-object v6, v0, La/p8l;->f:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v6, Landroid/graphics/Path;

    .line 184
    .line 185
    const/high16 v18, 0x41200000    # 10.0f

    .line 186
    .line 187
    add-float v10, v3, v18

    .line 188
    .line 189
    invoke-virtual {v6, v11, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 190
    .line 191
    .line 192
    iget-object v6, v0, La/p8l;->f:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v6, Landroid/graphics/Path;

    .line 195
    .line 196
    add-float v10, v11, v18

    .line 197
    .line 198
    invoke-virtual {v6, v10, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 199
    .line 200
    .line 201
    iget-object v6, v0, La/p8l;->f:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v6, Landroid/graphics/Path;

    .line 204
    .line 205
    sub-float v10, v3, v18

    .line 206
    .line 207
    invoke-virtual {v6, v11, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 208
    .line 209
    .line 210
    iget-object v6, v0, La/p8l;->f:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v6, Landroid/graphics/Path;

    .line 213
    .line 214
    sub-float v10, v11, v18

    .line 215
    .line 216
    invoke-virtual {v6, v10, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 217
    .line 218
    .line 219
    iget-object v6, v0, La/p8l;->f:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v6, Landroid/graphics/Path;

    .line 222
    .line 223
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 224
    .line 225
    .line 226
    add-int/lit8 v6, v2, -0x1

    .line 227
    .line 228
    iget-object v10, v8, La/ds40;->u:Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    check-cast v10, La/pt40;

    .line 235
    .line 236
    const/4 v10, 0x0

    .line 237
    if-ne v7, v13, :cond_c

    .line 238
    .line 239
    aget v6, v9, v6

    .line 240
    .line 241
    if-ne v6, v12, :cond_9

    .line 242
    .line 243
    sub-float v6, v11, v10

    .line 244
    .line 245
    move/from16 v18, v10

    .line 246
    .line 247
    sub-float v10, v3, v18

    .line 248
    .line 249
    invoke-virtual {v0, v1, v6, v10}, La/p8l;->h(Landroid/graphics/Canvas;FF)V

    .line 250
    .line 251
    .line 252
    :goto_4
    move v6, v2

    .line 253
    move/from16 v20, v3

    .line 254
    .line 255
    const/4 v10, 0x2

    .line 256
    goto :goto_5

    .line 257
    :cond_9
    move/from16 v18, v10

    .line 258
    .line 259
    if-nez v6, :cond_a

    .line 260
    .line 261
    sub-float v6, v11, v18

    .line 262
    .line 263
    sub-float v10, v3, v18

    .line 264
    .line 265
    invoke-virtual {v0, v1, v6, v10}, La/p8l;->g(Landroid/graphics/Canvas;FF)V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_a
    const/4 v10, 0x2

    .line 270
    if-ne v6, v10, :cond_b

    .line 271
    .line 272
    move v6, v2

    .line 273
    sub-float v2, v11, v18

    .line 274
    .line 275
    move/from16 v19, v3

    .line 276
    .line 277
    sub-float v3, v19, v18

    .line 278
    .line 279
    move/from16 v20, v19

    .line 280
    .line 281
    invoke-virtual/range {v0 .. v5}, La/p8l;->i(Landroid/graphics/Canvas;FFII)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_b
    move v6, v2

    .line 286
    move/from16 v20, v3

    .line 287
    .line 288
    :goto_5
    iget-object v2, v0, La/p8l;->f:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v2, Landroid/graphics/Path;

    .line 291
    .line 292
    invoke-virtual {v1, v2, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 293
    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_c
    move v6, v2

    .line 297
    move/from16 v20, v3

    .line 298
    .line 299
    move/from16 v18, v10

    .line 300
    .line 301
    const/4 v10, 0x2

    .line 302
    :goto_6
    if-ne v7, v10, :cond_d

    .line 303
    .line 304
    sub-float v2, v11, v18

    .line 305
    .line 306
    sub-float v3, v20, v18

    .line 307
    .line 308
    invoke-virtual {v0, v1, v2, v3}, La/p8l;->h(Landroid/graphics/Canvas;FF)V

    .line 309
    .line 310
    .line 311
    :cond_d
    const/4 v10, 0x3

    .line 312
    if-ne v7, v10, :cond_e

    .line 313
    .line 314
    sub-float v2, v11, v18

    .line 315
    .line 316
    sub-float v3, v20, v18

    .line 317
    .line 318
    invoke-virtual {v0, v1, v2, v3}, La/p8l;->g(Landroid/graphics/Canvas;FF)V

    .line 319
    .line 320
    .line 321
    :cond_e
    const/4 v2, 0x6

    .line 322
    if-ne v7, v2, :cond_f

    .line 323
    .line 324
    sub-float v2, v11, v18

    .line 325
    .line 326
    sub-float v3, v20, v18

    .line 327
    .line 328
    invoke-virtual/range {v0 .. v5}, La/p8l;->i(Landroid/graphics/Canvas;FFII)V

    .line 329
    .line 330
    .line 331
    :cond_f
    iget-object v2, v0, La/p8l;->f:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast v2, Landroid/graphics/Path;

    .line 334
    .line 335
    invoke-virtual {v1, v2, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 336
    .line 337
    .line 338
    :goto_7
    add-int/lit8 v2, v6, 0x1

    .line 339
    .line 340
    move v6, v10

    .line 341
    move/from16 v11, v17

    .line 342
    .line 343
    const/4 v10, 0x2

    .line 344
    goto/16 :goto_3

    .line 345
    .line 346
    :cond_10
    move/from16 v17, v11

    .line 347
    .line 348
    iget-object v2, v0, La/p8l;->c:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v2, [F

    .line 351
    .line 352
    array-length v3, v2

    .line 353
    if-le v3, v12, :cond_11

    .line 354
    .line 355
    aget v3, v2, v17

    .line 356
    .line 357
    aget v2, v2, v12

    .line 358
    .line 359
    const/high16 v4, 0x41000000    # 8.0f

    .line 360
    .line 361
    invoke-virtual {v1, v3, v2, v4, v14}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 362
    .line 363
    .line 364
    iget-object v0, v0, La/p8l;->c:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v0, [F

    .line 367
    .line 368
    array-length v2, v0

    .line 369
    const/16 v19, 0x2

    .line 370
    .line 371
    add-int/lit8 v2, v2, -0x2

    .line 372
    .line 373
    aget v2, v0, v2

    .line 374
    .line 375
    array-length v3, v0

    .line 376
    sub-int/2addr v3, v12

    .line 377
    aget v0, v0, v3

    .line 378
    .line 379
    invoke-virtual {v1, v2, v0, v4, v14}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 380
    .line 381
    .line 382
    :cond_11
    return-void
.end method

.method public f(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/p8l;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, [F

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aget v2, v1, v2

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    aget v4, v1, v3

    .line 12
    .line 13
    array-length v5, v1

    .line 14
    add-int/lit8 v5, v5, -0x2

    .line 15
    .line 16
    aget v5, v1, v5

    .line 17
    .line 18
    array-length v6, v1

    .line 19
    sub-int/2addr v6, v3

    .line 20
    aget v1, v1, v6

    .line 21
    .line 22
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 35
    .line 36
    .line 37
    move-result v10

    .line 38
    iget-object v0, v0, La/p8l;->i:Ljava/lang/Object;

    .line 39
    .line 40
    move-object/from16 v16, v0

    .line 41
    .line 42
    check-cast v16, Landroid/graphics/Paint;

    .line 43
    .line 44
    move-object/from16 v6, p1

    .line 45
    .line 46
    move-object/from16 v11, v16

    .line 47
    .line 48
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    invoke-static {v4, v1}, Ljava/lang/Math;->min(FF)F

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 60
    .line 61
    .line 62
    move-result v14

    .line 63
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 64
    .line 65
    .line 66
    move-result v15

    .line 67
    move-object/from16 v11, p1

    .line 68
    .line 69
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public g(Landroid/graphics/Canvas;FF)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/p8l;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, [F

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    aget v3, v2, v6

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    aget v7, v2, v4

    .line 14
    .line 15
    array-length v5, v2

    .line 16
    add-int/lit8 v5, v5, -0x2

    .line 17
    .line 18
    aget v5, v2, v5

    .line 19
    .line 20
    array-length v8, v2

    .line 21
    sub-int/2addr v8, v4

    .line 22
    aget v8, v2, v8

    .line 23
    .line 24
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    sub-float v4, p2, v4

    .line 37
    .line 38
    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    sub-float v10, v10, p3

    .line 43
    .line 44
    new-instance v11, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v12, ""

    .line 47
    .line 48
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/high16 v13, 0x42c80000    # 100.0f

    .line 52
    .line 53
    mul-float v14, v4, v13

    .line 54
    .line 55
    sub-float v15, v5, v3

    .line 56
    .line 57
    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    .line 58
    .line 59
    .line 60
    move-result v15

    .line 61
    div-float/2addr v14, v15

    .line 62
    float-to-double v14, v14

    .line 63
    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    .line 64
    .line 65
    add-double v14, v14, v16

    .line 66
    .line 67
    double-to-int v14, v14

    .line 68
    int-to-float v14, v14

    .line 69
    div-float/2addr v14, v13

    .line 70
    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    iget-object v14, v0, La/p8l;->j:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v14, Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v15

    .line 85
    move/from16 v18, v13

    .line 86
    .line 87
    iget-object v13, v0, La/p8l;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v13, Landroid/graphics/Rect;

    .line 90
    .line 91
    invoke-virtual {v14, v11, v6, v15, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 92
    .line 93
    .line 94
    const/high16 v15, 0x40000000    # 2.0f

    .line 95
    .line 96
    div-float/2addr v4, v15

    .line 97
    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    .line 98
    .line 99
    .line 100
    move-result v19

    .line 101
    move/from16 v20, v15

    .line 102
    .line 103
    div-int/lit8 v15, v19, 0x2

    .line 104
    .line 105
    int-to-float v15, v15

    .line 106
    sub-float/2addr v4, v15

    .line 107
    add-float/2addr v4, v2

    .line 108
    const/high16 v2, 0x41a00000    # 20.0f

    .line 109
    .line 110
    sub-float v2, p3, v2

    .line 111
    .line 112
    invoke-virtual {v1, v11, v4, v2, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 113
    .line 114
    .line 115
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    iget-object v0, v0, La/p8l;->i:Ljava/lang/Object;

    .line 120
    .line 121
    move-object v5, v0

    .line 122
    check-cast v5, Landroid/graphics/Paint;

    .line 123
    .line 124
    move/from16 v4, p3

    .line 125
    .line 126
    move/from16 v2, p3

    .line 127
    .line 128
    move-object v0, v1

    .line 129
    move/from16 v1, p2

    .line 130
    .line 131
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    new-instance v1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    mul-float v2, v10, v18

    .line 140
    .line 141
    sub-float v3, v8, v7

    .line 142
    .line 143
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    div-float/2addr v2, v3

    .line 148
    float-to-double v2, v2

    .line 149
    add-double v2, v2, v16

    .line 150
    .line 151
    double-to-int v2, v2

    .line 152
    int-to-float v2, v2

    .line 153
    div-float v2, v2, v18

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {v14, v1, v6, v2, v13}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 167
    .line 168
    .line 169
    div-float v10, v10, v20

    .line 170
    .line 171
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    div-int/lit8 v2, v2, 0x2

    .line 176
    .line 177
    int-to-float v2, v2

    .line 178
    sub-float/2addr v10, v2

    .line 179
    const/high16 v2, 0x40a00000    # 5.0f

    .line 180
    .line 181
    add-float v2, p2, v2

    .line 182
    .line 183
    sub-float/2addr v9, v10

    .line 184
    invoke-virtual {v0, v1, v2, v9, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    move/from16 v3, p2

    .line 192
    .line 193
    move/from16 v1, p2

    .line 194
    .line 195
    move/from16 v2, p3

    .line 196
    .line 197
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public h(Landroid/graphics/Canvas;FF)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, La/p8l;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [F

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    aget v5, v3, v4

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    aget v7, v3, v6

    .line 16
    .line 17
    array-length v8, v3

    .line 18
    add-int/lit8 v8, v8, -0x2

    .line 19
    .line 20
    aget v8, v3, v8

    .line 21
    .line 22
    array-length v9, v3

    .line 23
    sub-int/2addr v9, v6

    .line 24
    aget v3, v3, v9

    .line 25
    .line 26
    sub-float v6, v5, v8

    .line 27
    .line 28
    float-to-double v9, v6

    .line 29
    sub-float v6, v7, v3

    .line 30
    .line 31
    float-to-double v11, v6

    .line 32
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->hypot(DD)D

    .line 33
    .line 34
    .line 35
    move-result-wide v9

    .line 36
    double-to-float v6, v9

    .line 37
    sub-float v9, v1, v5

    .line 38
    .line 39
    sub-float/2addr v8, v5

    .line 40
    mul-float/2addr v9, v8

    .line 41
    sub-float v10, v2, v7

    .line 42
    .line 43
    sub-float/2addr v3, v7

    .line 44
    mul-float/2addr v10, v3

    .line 45
    add-float/2addr v10, v9

    .line 46
    mul-float v9, v6, v6

    .line 47
    .line 48
    div-float/2addr v10, v9

    .line 49
    mul-float/2addr v8, v10

    .line 50
    add-float/2addr v8, v5

    .line 51
    mul-float/2addr v10, v3

    .line 52
    add-float/2addr v10, v7

    .line 53
    new-instance v13, Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v13, v1, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v13, v8, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 62
    .line 63
    .line 64
    sub-float v3, v8, v1

    .line 65
    .line 66
    float-to-double v11, v3

    .line 67
    sub-float v3, v10, v2

    .line 68
    .line 69
    float-to-double v14, v3

    .line 70
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->hypot(DD)D

    .line 71
    .line 72
    .line 73
    move-result-wide v11

    .line 74
    double-to-float v3, v11

    .line 75
    new-instance v5, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v7, ""

    .line 78
    .line 79
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/high16 v7, 0x42c80000    # 100.0f

    .line 83
    .line 84
    mul-float v9, v3, v7

    .line 85
    .line 86
    div-float/2addr v9, v6

    .line 87
    float-to-int v6, v9

    .line 88
    int-to-float v6, v6

    .line 89
    div-float/2addr v6, v7

    .line 90
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    iget-object v5, v0, La/p8l;->j:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, Landroid/graphics/Paint;

    .line 100
    .line 101
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    iget-object v7, v0, La/p8l;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v7, Landroid/graphics/Rect;

    .line 108
    .line 109
    invoke-virtual {v5, v12, v4, v6, v7}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 110
    .line 111
    .line 112
    const/high16 v4, 0x40000000    # 2.0f

    .line 113
    .line 114
    div-float/2addr v3, v4

    .line 115
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    div-int/lit8 v4, v4, 0x2

    .line 120
    .line 121
    int-to-float v4, v4

    .line 122
    sub-float v14, v3, v4

    .line 123
    .line 124
    const/high16 v15, -0x3e600000    # -20.0f

    .line 125
    .line 126
    move-object/from16 v11, p1

    .line 127
    .line 128
    move-object/from16 v16, v5

    .line 129
    .line 130
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, La/p8l;->i:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v5, v0

    .line 136
    check-cast v5, Landroid/graphics/Paint;

    .line 137
    .line 138
    move-object/from16 v0, p1

    .line 139
    .line 140
    move v3, v8

    .line 141
    move v4, v10

    .line 142
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public i(Landroid/graphics/Canvas;FFII)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v6, ""

    .line 8
    .line 9
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    div-int/lit8 v3, p4, 0x2

    .line 13
    .line 14
    int-to-float v3, v3

    .line 15
    sub-float v3, p2, v3

    .line 16
    .line 17
    const/high16 v7, 0x42c80000    # 100.0f

    .line 18
    .line 19
    mul-float/2addr v3, v7

    .line 20
    iget-object v4, v0, La/p8l;->m:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v8, v4

    .line 23
    check-cast v8, Landroidx/constraintlayout/motion/widget/MotionLayout;

    .line 24
    .line 25
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    sub-int v4, v4, p4

    .line 30
    .line 31
    int-to-float v4, v4

    .line 32
    div-float/2addr v3, v4

    .line 33
    float-to-double v3, v3

    .line 34
    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    .line 35
    .line 36
    add-double/2addr v3, v9

    .line 37
    double-to-int v3, v3

    .line 38
    int-to-float v3, v3

    .line 39
    div-float/2addr v3, v7

    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v3, v0, La/p8l;->j:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v11, v3

    .line 50
    check-cast v11, Landroid/graphics/Paint;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iget-object v4, v0, La/p8l;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v12, v4

    .line 59
    check-cast v12, Landroid/graphics/Rect;

    .line 60
    .line 61
    const/4 v13, 0x0

    .line 62
    invoke-virtual {v11, v2, v13, v3, v12}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    const/high16 v14, 0x40000000    # 2.0f

    .line 66
    .line 67
    div-float v3, p2, v14

    .line 68
    .line 69
    invoke-virtual {v12}, Landroid/graphics/Rect;->width()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    div-int/lit8 v4, v4, 0x2

    .line 74
    .line 75
    int-to-float v4, v4

    .line 76
    sub-float/2addr v3, v4

    .line 77
    const/4 v15, 0x0

    .line 78
    add-float/2addr v3, v15

    .line 79
    const/high16 v4, 0x41a00000    # 20.0f

    .line 80
    .line 81
    sub-float v4, p3, v4

    .line 82
    .line 83
    invoke-virtual {v1, v2, v3, v4, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 84
    .line 85
    .line 86
    const/high16 v2, 0x3f800000    # 1.0f

    .line 87
    .line 88
    invoke-static {v15, v2}, Ljava/lang/Math;->min(FF)F

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    iget-object v0, v0, La/p8l;->i:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v5, v0

    .line 95
    check-cast v5, Landroid/graphics/Paint;

    .line 96
    .line 97
    move/from16 v4, p3

    .line 98
    .line 99
    move-object v0, v1

    .line 100
    move/from16 v16, v7

    .line 101
    .line 102
    move/from16 v1, p2

    .line 103
    .line 104
    move v7, v2

    .line 105
    move/from16 v2, p3

    .line 106
    .line 107
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    div-int/lit8 v2, p5, 0x2

    .line 116
    .line 117
    int-to-float v2, v2

    .line 118
    sub-float v2, p3, v2

    .line 119
    .line 120
    mul-float v2, v2, v16

    .line 121
    .line 122
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    sub-int v3, v3, p5

    .line 127
    .line 128
    int-to-float v3, v3

    .line 129
    div-float/2addr v2, v3

    .line 130
    float-to-double v2, v2

    .line 131
    add-double/2addr v2, v9

    .line 132
    double-to-int v2, v2

    .line 133
    int-to-float v2, v2

    .line 134
    div-float v2, v2, v16

    .line 135
    .line 136
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    invoke-virtual {v11, v1, v13, v2, v12}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 148
    .line 149
    .line 150
    div-float v2, p3, v14

    .line 151
    .line 152
    invoke-virtual {v12}, Landroid/graphics/Rect;->height()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    div-int/lit8 v3, v3, 0x2

    .line 157
    .line 158
    int-to-float v3, v3

    .line 159
    sub-float/2addr v2, v3

    .line 160
    const/high16 v3, 0x40a00000    # 5.0f

    .line 161
    .line 162
    add-float v3, p2, v3

    .line 163
    .line 164
    sub-float v2, v15, v2

    .line 165
    .line 166
    invoke-virtual {v0, v1, v3, v2, v11}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v15, v7}, Ljava/lang/Math;->max(FF)F

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    move/from16 v3, p2

    .line 174
    .line 175
    move/from16 v1, p2

    .line 176
    .line 177
    move/from16 v2, p3

    .line 178
    .line 179
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method public j()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/p8l;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/a8z;

    .line 4
    .line 5
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/j8l;

    .line 10
    .line 11
    return-object p0
.end method

.method public k(La/agn;)La/tm80;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "Failed to get GL or EGL extensions: "

    .line 4
    .line 5
    iget-object v2, p0, La/p8l;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v2, v3}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    :try_start_0
    invoke-virtual {p0, p1, v2}, La/p8l;->a(La/agn;La/v35;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/p8l;->c()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, La/p8l;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Landroid/opengl/EGLSurface;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/p8l;->q(Landroid/opengl/EGLSurface;)V

    .line 25
    .line 26
    .line 27
    const/16 p1, 0x1f03

    .line 28
    .line 29
    invoke-static {p1}, Landroid/opengl/GLES20;->glGetString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v2, p0, La/p8l;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 36
    .line 37
    const/16 v3, 0x3055

    .line 38
    .line 39
    invoke-static {v2, v3}, Landroid/opengl/EGL14;->eglQueryString(Landroid/opengl/EGLDisplay;I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    new-instance v3, La/tm80;

    .line 44
    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object p1, v0

    .line 49
    :goto_0
    if-eqz v2, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object v2, v0

    .line 53
    :goto_1
    invoke-direct {v3, p1, v2}, La/tm80;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/p8l;->t()V

    .line 57
    .line 58
    .line 59
    return-object v3

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_2

    .line 62
    :catch_0
    move-exception p1

    .line 63
    :try_start_1
    const-string v2, "OpenGlRenderer"

    .line 64
    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v2, v1, p1}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, La/tm80;

    .line 85
    .line 86
    invoke-direct {p1, v0, v0}, La/tm80;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/p8l;->t()V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :goto_2
    invoke-virtual {p0}, La/p8l;->t()V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public l()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/a8z;

    .line 4
    .line 5
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/j8l;

    .line 10
    .line 11
    return-object p0
.end method

.method public m()La/o7l;
    .locals 0

    .line 1
    iget-object p0, p0, La/p8l;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/a8z;

    .line 4
    .line 5
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/o7l;

    .line 10
    .line 11
    return-object p0
.end method

.method public n()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/p8l;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/a8z;

    .line 4
    .line 5
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/j8l;

    .line 10
    .line 11
    return-object p0
.end method

.method public o(La/agn;)La/w35;
    .locals 6

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/v35;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "0.0"

    .line 17
    .line 18
    iput-object v2, v1, La/v35;->a:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v2, v1, La/v35;->b:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    iput-object v2, v1, La/v35;->c:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v2, v1, La/v35;->d:Ljava/lang/String;

    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p1}, La/agn;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/p8l;->k(La/agn;)La/tm80;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, v3, La/tm80;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v3, v3, La/tm80;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-string v5, "GL_EXT_YUV_target"

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-nez v5, :cond_0

    .line 59
    .line 60
    const-string p1, "OpenGlRenderer"

    .line 61
    .line 62
    const-string v5, "Device does not support GL_EXT_YUV_target. Fallback to SDR."

    .line 63
    .line 64
    invoke-static {p1, v5}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, La/agn;->d:La/agn;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :catch_1
    move-exception p1

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    :goto_0
    invoke-static {v3, p1}, La/vfr;->f(Ljava/lang/String;La/agn;)[I

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    iput-object v5, p0, La/p8l;->g:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v4, v1, La/v35;->c:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v3, v1, La/v35;->d:Ljava/lang/String;

    .line 83
    .line 84
    :cond_1
    invoke-virtual {p0, p1, v1}, La/p8l;->a(La/agn;La/v35;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/p8l;->c()V

    .line 88
    .line 89
    .line 90
    iget-object v3, p0, La/p8l;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v3, Landroid/opengl/EGLSurface;

    .line 93
    .line 94
    invoke-virtual {p0, v3}, La/p8l;->q(Landroid/opengl/EGLSurface;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, La/vfr;->j()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iput-object v3, v1, La/v35;->a:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {p1}, La/vfr;->g(La/agn;)Ljava/util/HashMap;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, La/p8l;->k:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {}, La/vfr;->h()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput p1, p0, La/p8l;->a:I

    .line 114
    .line 115
    invoke-virtual {p0, p1}, La/p8l;->B(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    .line 117
    .line 118
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, La/p8l;->b:Ljava/lang/Object;

    .line 123
    .line 124
    const/4 p0, 0x1

    .line 125
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_2

    .line 133
    .line 134
    new-instance p0, La/w35;

    .line 135
    .line 136
    iget-object p1, v1, La/v35;->a:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v0, v1, La/v35;->b:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v2, v1, La/v35;->c:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v1, v1, La/v35;->d:Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct {p0, p1, v0, v2, v1}, La/w35;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-object p0

    .line 148
    :cond_2
    const-string p0, "Missing required properties:"

    .line 149
    .line 150
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const/4 p0, 0x0

    .line 158
    return-object p0

    .line 159
    :goto_1
    invoke-virtual {p0}, La/p8l;->t()V

    .line 160
    .line 161
    .line 162
    throw p1
.end method

.method public p(IIII)V
    .locals 9

    .line 1
    iget-object v0, p0, La/p8l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/p8l;->m()La/o7l;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p2, p0, La/p8l;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, La/p7l;

    .line 19
    .line 20
    iget p3, p2, La/p7l;->m:I

    .line 21
    .line 22
    iget p4, p2, La/p7l;->o:I

    .line 23
    .line 24
    iget v1, p2, La/p7l;->c:I

    .line 25
    .line 26
    mul-int/lit8 v2, v1, 0x2

    .line 27
    .line 28
    add-int/2addr v2, p1

    .line 29
    iput v2, p0, La/p8l;->a:I

    .line 30
    .line 31
    iget-object p1, p0, La/p8l;->k:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, La/a8z;

    .line 34
    .line 35
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/widget/ImageView;

    .line 40
    .line 41
    iget-object v2, p0, La/p8l;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/i8l;

    .line 44
    .line 45
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 46
    .line 47
    add-int/2addr v3, v1

    .line 48
    iget v4, v0, Landroid/graphics/Rect;->top:I

    .line 49
    .line 50
    iget v5, p2, La/p7l;->s:I

    .line 51
    .line 52
    int-to-float v5, v5

    .line 53
    iget v6, p2, La/p7l;->e:F

    .line 54
    .line 55
    mul-float/2addr v5, v6

    .line 56
    invoke-static {v5}, La/si30;->b(F)I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    add-int/2addr v5, v4

    .line 61
    invoke-static {p1, v2, v3, v5}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/p8l;->m()La/o7l;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 69
    .line 70
    invoke-virtual {p0}, La/p8l;->m()La/o7l;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    sub-int/2addr v3, v4

    .line 79
    mul-int/lit8 v4, v1, 0x2

    .line 80
    .line 81
    sub-int/2addr v3, v4

    .line 82
    iget v4, v0, Landroid/graphics/Rect;->top:I

    .line 83
    .line 84
    invoke-virtual {p2}, La/p7l;->d()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {p0}, La/p8l;->m()La/o7l;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    sub-int/2addr v5, v6

    .line 97
    div-int/lit8 v5, v5, 0x2

    .line 98
    .line 99
    add-int/2addr v5, v4

    .line 100
    add-int/2addr v5, v1

    .line 101
    invoke-static {p1, v2, v3, v5}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La/p8l;->l()La/j8l;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {p2}, La/p7l;->g()I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    sub-int/2addr v3, v4

    .line 117
    iget v4, p2, La/p7l;->b:I

    .line 118
    .line 119
    sub-int/2addr v3, v4

    .line 120
    invoke-virtual {p0}, La/p8l;->l()La/j8l;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    div-int/lit8 v5, v5, 0x2

    .line 129
    .line 130
    sub-int/2addr v3, v5

    .line 131
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 132
    .line 133
    sub-int/2addr v5, v1

    .line 134
    invoke-virtual {p2}, La/p7l;->d()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    invoke-virtual {p0}, La/p8l;->l()La/j8l;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    add-int/2addr v7, v6

    .line 147
    div-int/lit8 v7, v7, 0x2

    .line 148
    .line 149
    sub-int/2addr v5, v7

    .line 150
    invoke-static {p1, v2, v3, v5}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, La/p8l;->n()La/j8l;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    invoke-virtual {p0}, La/p8l;->n()La/j8l;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    div-int/lit8 v5, v5, 0x2

    .line 170
    .line 171
    sub-int/2addr v3, v5

    .line 172
    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    .line 173
    .line 174
    sub-int/2addr v5, v1

    .line 175
    invoke-virtual {p2}, La/p7l;->d()I

    .line 176
    .line 177
    .line 178
    move-result v6

    .line 179
    invoke-virtual {p0}, La/p8l;->n()La/j8l;

    .line 180
    .line 181
    .line 182
    move-result-object v7

    .line 183
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    add-int/2addr v7, v6

    .line 188
    div-int/lit8 v7, v7, 0x2

    .line 189
    .line 190
    sub-int/2addr v5, v7

    .line 191
    invoke-static {p1, v2, v3, v5}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, La/p8l;->j()La/j8l;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    invoke-virtual {p2}, La/p7l;->g()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    add-int/2addr v5, v3

    .line 207
    add-int/2addr v5, v4

    .line 208
    invoke-virtual {p0}, La/p8l;->j()La/j8l;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 213
    .line 214
    .line 215
    move-result v3

    .line 216
    div-int/lit8 v3, v3, 0x2

    .line 217
    .line 218
    sub-int/2addr v5, v3

    .line 219
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 220
    .line 221
    sub-int/2addr v3, v1

    .line 222
    invoke-virtual {p2}, La/p7l;->d()I

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-virtual {p0}, La/p8l;->j()La/j8l;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    add-int/2addr v4, v1

    .line 235
    div-int/lit8 v4, v4, 0x2

    .line 236
    .line 237
    sub-int/2addr v3, v4

    .line 238
    invoke-static {p1, v2, v5, v3}, La/cww;->A(Landroid/view/View;Landroid/widget/FrameLayout;II)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-nez p1, :cond_0

    .line 246
    .line 247
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    invoke-virtual {p2}, La/p7l;->c()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    mul-int/lit8 v1, v1, 0x5

    .line 256
    .line 257
    int-to-float v2, p4

    .line 258
    iget v3, p2, La/p7l;->e:F

    .line 259
    .line 260
    mul-float/2addr v2, v3

    .line 261
    invoke-static {v2}, La/si30;->b(F)I

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    mul-int/lit8 v2, v2, 0x4

    .line 266
    .line 267
    add-int/2addr v2, v1

    .line 268
    div-int/lit8 v2, v2, 0x2

    .line 269
    .line 270
    sub-int/2addr p1, v2

    .line 271
    goto :goto_0

    .line 272
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    invoke-virtual {p2}, La/p7l;->c()I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    mul-int/lit8 v1, v1, 0x5

    .line 281
    .line 282
    int-to-float v2, p4

    .line 283
    iget v3, p2, La/p7l;->e:F

    .line 284
    .line 285
    mul-float/2addr v2, v3

    .line 286
    invoke-static {v2}, La/si30;->b(F)I

    .line 287
    .line 288
    .line 289
    move-result v2

    .line 290
    mul-int/lit8 v2, v2, 0x4

    .line 291
    .line 292
    add-int/2addr v2, v1

    .line 293
    sub-int/2addr p1, v2

    .line 294
    div-int/lit8 p1, p1, 0x2

    .line 295
    .line 296
    :goto_0
    iget-object v1, p0, La/p8l;->f:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, La/kki;

    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    int-to-float v3, p3

    .line 305
    iget v4, p2, La/p7l;->e:F

    .line 306
    .line 307
    mul-float/2addr v3, v4

    .line 308
    invoke-static {v3}, La/si30;->b(F)I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    div-int/lit8 v3, v3, 0x2

    .line 313
    .line 314
    sub-int/2addr v2, v3

    .line 315
    invoke-virtual {p2}, La/p7l;->c()I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    mul-int/lit8 v3, v3, 0x5

    .line 320
    .line 321
    int-to-float p4, p4

    .line 322
    iget v4, p2, La/p7l;->e:F

    .line 323
    .line 324
    mul-float/2addr p4, v4

    .line 325
    invoke-static {p4}, La/si30;->b(F)I

    .line 326
    .line 327
    .line 328
    move-result p4

    .line 329
    mul-int/lit8 p4, p4, 0x4

    .line 330
    .line 331
    add-int/2addr p4, v3

    .line 332
    add-int/2addr p4, p1

    .line 333
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    int-to-float p3, p3

    .line 338
    iget v4, p2, La/p7l;->e:F

    .line 339
    .line 340
    mul-float/2addr p3, v4

    .line 341
    invoke-static {p3}, La/si30;->b(F)I

    .line 342
    .line 343
    .line 344
    move-result p3

    .line 345
    div-int/lit8 p3, p3, 0x2

    .line 346
    .line 347
    add-int/2addr p3, v3

    .line 348
    iget-object v3, v1, La/kki;->f:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v3, Landroid/graphics/Rect;

    .line 351
    .line 352
    invoke-virtual {v3, p1, v2, p4, p3}, Landroid/graphics/Rect;->set(IIII)V

    .line 353
    .line 354
    .line 355
    iget-object p1, v1, La/kki;->c:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast p1, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    const/4 p3, 0x0

    .line 364
    move p4, p3

    .line 365
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-eqz v2, :cond_3

    .line 370
    .line 371
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    add-int/lit8 v4, p4, 0x1

    .line 376
    .line 377
    if-ltz p4, :cond_2

    .line 378
    .line 379
    check-cast v2, La/w6l;

    .line 380
    .line 381
    iget-object v5, v1, La/kki;->e:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v5, La/p7l;

    .line 384
    .line 385
    iget v6, v5, La/p7l;->o:I

    .line 386
    .line 387
    iget-object v7, v1, La/kki;->b:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v7, La/i8l;

    .line 390
    .line 391
    invoke-virtual {v7}, Landroid/view/View;->getLayoutDirection()I

    .line 392
    .line 393
    .line 394
    move-result v7

    .line 395
    if-nez v7, :cond_1

    .line 396
    .line 397
    iget v7, v3, Landroid/graphics/Rect;->left:I

    .line 398
    .line 399
    invoke-virtual {v5}, La/p7l;->c()I

    .line 400
    .line 401
    .line 402
    move-result v8

    .line 403
    int-to-float v6, v6

    .line 404
    iget v5, v5, La/p7l;->e:F

    .line 405
    .line 406
    mul-float/2addr v6, v5

    .line 407
    invoke-static {v6}, La/si30;->b(F)I

    .line 408
    .line 409
    .line 410
    move-result v5

    .line 411
    add-int/2addr v5, v8

    .line 412
    mul-int/2addr v5, p4

    .line 413
    add-int/2addr v5, v7

    .line 414
    goto :goto_2

    .line 415
    :cond_1
    iget v7, v3, Landroid/graphics/Rect;->right:I

    .line 416
    .line 417
    invoke-virtual {v5}, La/p7l;->c()I

    .line 418
    .line 419
    .line 420
    move-result v8

    .line 421
    sub-int/2addr v7, v8

    .line 422
    invoke-virtual {v5}, La/p7l;->c()I

    .line 423
    .line 424
    .line 425
    move-result v8

    .line 426
    int-to-float v6, v6

    .line 427
    iget v5, v5, La/p7l;->e:F

    .line 428
    .line 429
    mul-float/2addr v6, v5

    .line 430
    invoke-static {v6}, La/si30;->b(F)I

    .line 431
    .line 432
    .line 433
    move-result v5

    .line 434
    add-int/2addr v5, v8

    .line 435
    mul-int/2addr v5, p4

    .line 436
    sub-int v5, v7, v5

    .line 437
    .line 438
    :goto_2
    iget p4, v3, Landroid/graphics/Rect;->top:I

    .line 439
    .line 440
    invoke-static {v2, v5, p4}, La/bcm0;->s(Landroid/view/View;II)V

    .line 441
    .line 442
    .line 443
    move p4, v4

    .line 444
    goto :goto_1

    .line 445
    :cond_2
    invoke-static {}, La/q3d;->p()V

    .line 446
    .line 447
    .line 448
    const/4 p0, 0x0

    .line 449
    throw p0

    .line 450
    :cond_3
    iget-object p1, p2, La/p7l;->u:La/a8z;

    .line 451
    .line 452
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    check-cast p1, Landroid/text/TextPaint;

    .line 457
    .line 458
    iget-object p2, p0, La/p8l;->l:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast p2, Ljava/lang/String;

    .line 461
    .line 462
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 463
    .line 464
    .line 465
    move-result p4

    .line 466
    iget-object v1, p0, La/p8l;->e:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v1, Landroid/graphics/Rect;

    .line 469
    .line 470
    invoke-virtual {p1, p2, p3, p4, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 471
    .line 472
    .line 473
    iget-object p1, p0, La/p8l;->m:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast p1, La/l8l;

    .line 476
    .line 477
    iget p0, p0, La/p8l;->a:I

    .line 478
    .line 479
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    iget-object p2, p1, La/l8l;->f:Landroid/graphics/Rect;

    .line 483
    .line 484
    invoke-virtual {p2, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 485
    .line 486
    .line 487
    iput p0, p1, La/l8l;->g:I

    .line 488
    .line 489
    return-void
.end method

.method public q(Landroid/opengl/EGLSurface;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/opengl/EGLContext;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 18
    .line 19
    iget-object p0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/opengl/EGLContext;

    .line 22
    .line 23
    invoke-static {v0, p1, p1, p0}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p0, "eglMakeCurrent failed"

    .line 31
    .line 32
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public r()V
    .locals 5

    .line 1
    iget-object v0, p0, La/p8l;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/a8z;

    .line 4
    .line 5
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/ImageView;

    .line 10
    .line 11
    iget-object v1, p0, La/p8l;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/p7l;

    .line 14
    .line 15
    iget v2, v1, La/p7l;->r:I

    .line 16
    .line 17
    int-to-float v3, v2

    .line 18
    iget v4, v1, La/p7l;->e:F

    .line 19
    .line 20
    mul-float/2addr v3, v4

    .line 21
    invoke-static {v3}, La/si30;->b(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    int-to-float v2, v2

    .line 26
    iget v1, v1, La/p7l;->e:F

    .line 27
    .line 28
    mul-float/2addr v2, v1

    .line 29
    invoke-static {v2}, La/si30;->b(F)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v3, v1}, La/bcm0;->t(Landroid/view/View;II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/p8l;->m()La/o7l;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, La/p8l;->l()La/j8l;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/p8l;->n()La/j8l;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, La/p8l;->j()La/j8l;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, La/kki;

    .line 67
    .line 68
    iget-object v0, p0, La/kki;->e:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, La/p7l;

    .line 71
    .line 72
    iget-object p0, p0, La/kki;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, La/w6l;

    .line 91
    .line 92
    invoke-virtual {v0}, La/p7l;->c()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    iget v3, v0, La/p7l;->m:I

    .line 97
    .line 98
    int-to-float v3, v3

    .line 99
    iget v4, v0, La/p7l;->e:F

    .line 100
    .line 101
    mul-float/2addr v3, v4

    .line 102
    invoke-static {v3}, La/si30;->b(F)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-static {v1, v2, v3}, La/bcm0;->t(Landroid/view/View;II)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    return-void
.end method

.method public s(Landroid/view/Surface;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v0, v1}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/p8l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Thread;

    .line 12
    .line 13
    invoke-static {v0}, La/vfr;->c(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/p8l;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    sget-object v0, La/vfr;->j:La/m45;

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public t()V
    .locals 6

    .line 1
    iget-object v0, p0, La/p8l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    iget-object v1, p0, La/p8l;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, La/tfr;

    .line 28
    .line 29
    iget v2, v2, La/tfr;->a:I

    .line 30
    .line 31
    invoke-static {v2}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 36
    .line 37
    iput-object v1, p0, La/p8l;->k:Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    iput-object v1, p0, La/p8l;->l:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v2, p0, La/p8l;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 45
    .line 46
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 47
    .line 48
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    iget-object v2, p0, La/p8l;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Landroid/opengl/EGLDisplay;

    .line 57
    .line 58
    sget-object v3, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 59
    .line 60
    sget-object v4, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 61
    .line 62
    invoke-static {v2, v3, v3, v4}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    check-cast v3, La/m45;

    .line 84
    .line 85
    iget-object v4, v3, La/m45;->a:Landroid/opengl/EGLSurface;

    .line 86
    .line 87
    sget-object v5, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 88
    .line 89
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_1

    .line 94
    .line 95
    iget-object v4, p0, La/p8l;->e:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v4, Landroid/opengl/EGLDisplay;

    .line 98
    .line 99
    iget-object v3, v3, La/m45;->a:Landroid/opengl/EGLSurface;

    .line 100
    .line 101
    invoke-static {v4, v3}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-nez v3, :cond_1

    .line 106
    .line 107
    const-string v3, "eglDestroySurface"

    .line 108
    .line 109
    :try_start_0
    invoke-static {v3}, La/vfr;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catch_0
    move-exception v3

    .line 114
    const-string v4, "GLUtils"

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v4, v5, v3}, La/l8x;->Y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Landroid/opengl/EGLSurface;

    .line 130
    .line 131
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 132
    .line 133
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_3

    .line 138
    .line 139
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 142
    .line 143
    iget-object v2, p0, La/p8l;->i:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, Landroid/opengl/EGLSurface;

    .line 146
    .line 147
    invoke-static {v0, v2}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 148
    .line 149
    .line 150
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    .line 151
    .line 152
    iput-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 153
    .line 154
    :cond_3
    iget-object v0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v0, Landroid/opengl/EGLContext;

    .line 157
    .line 158
    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 159
    .line 160
    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-nez v0, :cond_4

    .line 165
    .line 166
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 169
    .line 170
    iget-object v2, p0, La/p8l;->f:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v2, Landroid/opengl/EGLContext;

    .line 173
    .line 174
    invoke-static {v0, v2}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    .line 175
    .line 176
    .line 177
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    .line 178
    .line 179
    iput-object v0, p0, La/p8l;->f:Ljava/lang/Object;

    .line 180
    .line 181
    :cond_4
    invoke-static {}, Landroid/opengl/EGL14;->eglReleaseThread()Z

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Landroid/opengl/EGLDisplay;

    .line 187
    .line 188
    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    .line 189
    .line 190
    .line 191
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    .line 192
    .line 193
    iput-object v0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 194
    .line 195
    :cond_5
    iput-object v1, p0, La/p8l;->h:Ljava/lang/Object;

    .line 196
    .line 197
    const/4 v0, -0x1

    .line 198
    iput v0, p0, La/p8l;->a:I

    .line 199
    .line 200
    sget-object v0, La/sfr;->a:La/sfr;

    .line 201
    .line 202
    iput-object v0, p0, La/p8l;->m:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v1, p0, La/p8l;->j:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v1, p0, La/p8l;->b:Ljava/lang/Object;

    .line 207
    .line 208
    return-void
.end method

.method public u(Landroid/view/Surface;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, La/p8l;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/Surface;

    .line 4
    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, La/p8l;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v0, p0, La/p8l;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Landroid/opengl/EGLSurface;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/p8l;->q(Landroid/opengl/EGLSurface;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, La/p8l;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/util/HashMap;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, La/m45;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget-object p2, La/vfr;->j:La/m45;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/m45;

    .line 37
    .line 38
    :goto_0
    if-eqz p1, :cond_2

    .line 39
    .line 40
    sget-object p2, La/vfr;->j:La/m45;

    .line 41
    .line 42
    if-eq p1, p2, :cond_2

    .line 43
    .line 44
    :try_start_0
    iget-object p0, p0, La/p8l;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Landroid/opengl/EGLDisplay;

    .line 47
    .line 48
    iget-object p1, p1, La/m45;->a:Landroid/opengl/EGLSurface;

    .line 49
    .line 50
    invoke-static {p0, p1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catch_0
    move-exception p0

    .line 55
    new-instance p1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string p2, "Failed to destroy EGL surface: "

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string p2, "OpenGlRenderer"

    .line 74
    .line 75
    invoke-static {p2, p1, p0}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    return-void
.end method

.method public v(J[FLandroid/view/Surface;)V
    .locals 6

    .line 1
    iget-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-static {v0, v1}, La/vfr;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/p8l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Thread;

    .line 12
    .line 13
    invoke-static {v0}, La/vfr;->c(Ljava/lang/Thread;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/p8l;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v0, p4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-string v3, "The surface is not registered."

    .line 25
    .line 26
    invoke-static {v3, v2}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/m45;

    .line 34
    .line 35
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object v3, La/vfr;->j:La/m45;

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0, p4}, La/p8l;->b(Landroid/view/Surface;)La/m45;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v0, p4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_1
    iget v0, v2, La/m45;->c:I

    .line 53
    .line 54
    iget v3, v2, La/m45;->b:I

    .line 55
    .line 56
    iget-object v2, v2, La/m45;->a:Landroid/opengl/EGLSurface;

    .line 57
    .line 58
    iget-object v4, p0, La/p8l;->j:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Landroid/view/Surface;

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    if-eq p4, v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0, v2}, La/p8l;->q(Landroid/opengl/EGLSurface;)V

    .line 66
    .line 67
    .line 68
    iput-object p4, p0, La/p8l;->j:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {v5, v5, v3, v0}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 71
    .line 72
    .line 73
    invoke-static {v5, v5, v3, v0}, Landroid/opengl/GLES20;->glScissor(IIII)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v0, p0, La/p8l;->l:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/tfr;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    instance-of v3, v0, La/ufr;

    .line 84
    .line 85
    if-eqz v3, :cond_3

    .line 86
    .line 87
    check-cast v0, La/ufr;

    .line 88
    .line 89
    iget v0, v0, La/ufr;->f:I

    .line 90
    .line 91
    invoke-static {v0, v1, v5, p3, v5}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    .line 92
    .line 93
    .line 94
    const-string p3, "glUniformMatrix4fv"

    .line 95
    .line 96
    invoke-static {p3}, La/vfr;->b(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    const/4 p3, 0x5

    .line 100
    const/4 v0, 0x4

    .line 101
    invoke-static {p3, v5, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    .line 102
    .line 103
    .line 104
    const-string p3, "glDrawArrays"

    .line 105
    .line 106
    invoke-static {p3}, La/vfr;->b(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object p3, p0, La/p8l;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p3, Landroid/opengl/EGLDisplay;

    .line 112
    .line 113
    invoke-static {p3, v2, p1, p2}, Landroid/opengl/EGLExt;->eglPresentationTimeANDROID(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;J)Z

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, La/p8l;->e:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Landroid/opengl/EGLDisplay;

    .line 119
    .line 120
    invoke-static {p1, v2}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_4

    .line 125
    .line 126
    new-instance p1, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string p2, "Failed to swap buffers with EGL error: 0x"

    .line 129
    .line 130
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const-string p2, "OpenGlRenderer"

    .line 149
    .line 150
    invoke-static {p2, p1}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, p4, v5}, La/p8l;->u(Landroid/view/Surface;Z)V

    .line 154
    .line 155
    .line 156
    :cond_4
    :goto_0
    return-void
.end method

.method public w(JZLa/vne;)V
    .locals 11

    .line 1
    iget-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/p7l;

    .line 4
    .line 5
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/p8l;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/i8l;

    .line 11
    .line 12
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, La/p8l;->j()La/j8l;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0}, La/p7l;->e()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    invoke-virtual {v0}, La/p7l;->f()F

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    new-instance v10, La/v9k;

    .line 39
    .line 40
    const/16 v0, 0x1c

    .line 41
    .line 42
    invoke-direct {v10, p0, v0}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    const v4, 0x7f080498

    .line 46
    .line 47
    .line 48
    move-wide v5, p1

    .line 49
    move-object v7, p4

    .line 50
    invoke-virtual/range {v3 .. v10}, La/j8l;->k(IJLa/vne;IFLkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/p8l;->j()La/j8l;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p3, :cond_0

    .line 58
    .line 59
    const/4 p2, 0x0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/16 p2, 0x8

    .line 62
    .line 63
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, La/p8l;->m:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/l8l;

    .line 69
    .line 70
    iput-boolean p3, p0, La/l8l;->i:Z

    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    move-wide v4, p1

    .line 74
    move-object v6, p4

    .line 75
    new-instance v2, La/n8l;

    .line 76
    .line 77
    move-object v3, p0

    .line 78
    move v7, p3

    .line 79
    invoke-direct/range {v2 .. v7}, La/n8l;-><init>(La/p8l;JLa/vne;Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public x(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/p8l;->l()La/j8l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, La/p8l;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/p7l;

    .line 11
    .line 12
    invoke-virtual {v1}, La/p7l;->e()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {v1}, La/p7l;->f()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-virtual {v0, v3, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 25
    .line 26
    .line 27
    const v1, 0x7f0804a4

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, La/j8l;->j(II)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/p8l;->l()La/j8l;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v3, 0x8

    .line 44
    .line 45
    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/p8l;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, La/l8l;

    .line 51
    .line 52
    iput-boolean p2, p0, La/l8l;->h:Z

    .line 53
    .line 54
    return-void
.end method

.method public y(Ljava/util/List;)V
    .locals 16

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v0, v0, La/p8l;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/kki;

    .line 9
    .line 10
    iget-object v1, v0, La/kki;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v0, v0, La/kki;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x5

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    if-ge v2, v3, :cond_2

    .line 26
    .line 27
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_8

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    add-int/lit8 v6, v5, 0x1

    .line 42
    .line 43
    if-ltz v5, :cond_1

    .line 44
    .line 45
    check-cast v3, La/u6l;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, La/w6l;

    .line 55
    .line 56
    iget-object v7, v3, La/u6l;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v5, v7}, La/w6l;->setHeroImage(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-boolean v7, v3, La/u6l;->d:Z

    .line 62
    .line 63
    iget-wide v8, v3, La/u6l;->f:J

    .line 64
    .line 65
    invoke-virtual {v5, v7, v8, v9}, La/w6l;->b(ZJ)V

    .line 66
    .line 67
    .line 68
    iget-boolean v7, v3, La/u6l;->c:Z

    .line 69
    .line 70
    if-eqz v7, :cond_0

    .line 71
    .line 72
    iget-wide v7, v3, La/u6l;->e:J

    .line 73
    .line 74
    invoke-virtual {v5, v7, v8}, La/w6l;->setHeroAegisState(J)V

    .line 75
    .line 76
    .line 77
    :cond_0
    move v5, v6

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    invoke-static {}, La/q3d;->p()V

    .line 80
    .line 81
    .line 82
    throw v4

    .line 83
    :cond_2
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_8

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    add-int/lit8 v6, v5, 0x1

    .line 98
    .line 99
    if-ltz v5, :cond_7

    .line 100
    .line 101
    check-cast v3, La/u6l;

    .line 102
    .line 103
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, La/u6l;

    .line 108
    .line 109
    iget-object v8, v3, La/u6l;->b:Ljava/lang/String;

    .line 110
    .line 111
    iget-wide v9, v3, La/u6l;->e:J

    .line 112
    .line 113
    iget-wide v11, v3, La/u6l;->f:J

    .line 114
    .line 115
    iget-boolean v13, v3, La/u6l;->c:Z

    .line 116
    .line 117
    iget-boolean v14, v3, La/u6l;->d:Z

    .line 118
    .line 119
    iget-object v15, v7, La/u6l;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v8, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_4

    .line 126
    .line 127
    iget-boolean v8, v7, La/u6l;->d:Z

    .line 128
    .line 129
    if-ne v14, v8, :cond_4

    .line 130
    .line 131
    iget-boolean v8, v7, La/u6l;->c:Z

    .line 132
    .line 133
    if-ne v13, v8, :cond_4

    .line 134
    .line 135
    move-object/from16 p0, v4

    .line 136
    .line 137
    move/from16 p1, v5

    .line 138
    .line 139
    iget-wide v4, v7, La/u6l;->f:J

    .line 140
    .line 141
    cmp-long v4, v11, v4

    .line 142
    .line 143
    if-nez v4, :cond_3

    .line 144
    .line 145
    iget-wide v4, v7, La/u6l;->e:J

    .line 146
    .line 147
    cmp-long v4, v9, v4

    .line 148
    .line 149
    if-eqz v4, :cond_6

    .line 150
    .line 151
    :cond_3
    move/from16 v5, p1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_4
    move-object/from16 p0, v4

    .line 155
    .line 156
    :goto_2
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, La/w6l;

    .line 161
    .line 162
    iget-object v7, v3, La/u6l;->b:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v4, v7}, La/w6l;->setHeroImage(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v14, v11, v12}, La/w6l;->b(ZJ)V

    .line 168
    .line 169
    .line 170
    if-eqz v13, :cond_5

    .line 171
    .line 172
    invoke-virtual {v4, v9, v10}, La/w6l;->setHeroAegisState(J)V

    .line 173
    .line 174
    .line 175
    :cond_5
    invoke-virtual {v0, v5, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    :cond_6
    move-object/from16 v4, p0

    .line 179
    .line 180
    move v5, v6

    .line 181
    goto :goto_1

    .line 182
    :cond_7
    move-object/from16 p0, v4

    .line 183
    .line 184
    invoke-static {}, La/q3d;->p()V

    .line 185
    .line 186
    .line 187
    throw p0

    .line 188
    :cond_8
    return-void
.end method

.method public z(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/p8l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/p7l;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/p8l;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, La/i8l;

    .line 11
    .line 12
    sget-object v2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->isLayoutRequested()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, La/p8l;->m()La/o7l;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget v1, v0, La/p7l;->w:I

    .line 31
    .line 32
    int-to-float v1, v1

    .line 33
    iget v2, v0, La/p7l;->e:F

    .line 34
    .line 35
    mul-float/2addr v1, v2

    .line 36
    invoke-static {v1}, La/si30;->b(F)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v2, v0, La/p7l;->v:F

    .line 41
    .line 42
    iget v0, v0, La/p7l;->e:F

    .line 43
    .line 44
    mul-float/2addr v2, v0

    .line 45
    invoke-virtual {p0, v2, p1, v1, p2}, La/o7l;->j(FIILjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    new-instance v0, La/hc3;

    .line 50
    .line 51
    invoke-direct {v0, p0, p1, p2}, La/hc3;-><init>(La/p8l;ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
