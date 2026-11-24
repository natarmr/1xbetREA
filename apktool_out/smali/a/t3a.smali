.class public final La/t3a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lx9;


# instance fields
.field public final a:La/ap;

.field public final b:La/ap;

.field public final c:La/ipt0;

.field public final d:La/h0a;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:La/wy9;

.field public h:La/wju0;

.field public i:Ljava/util/List;

.field public j:Landroid/util/Range;

.field public final k:La/hy9;

.field public final l:Ljava/lang/Object;

.field public m:Z

.field public n:La/drd;

.field public o:La/fot0;

.field public p:La/qrm0;

.field public final q:La/c5k;

.field public final r:La/c5k;

.field public final s:La/kd30;

.field public final t:La/trm0;


# direct methods
.method public constructor <init>(La/s0a;La/s0a;La/zo;La/zo;La/c5k;La/c5k;La/wy9;La/trm0;La/ipt0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/t3a;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    iput-object v0, p0, La/t3a;->i:Ljava/util/List;

    .line 21
    .line 22
    sget-object v0, La/h55;->h:Landroid/util/Range;

    .line 23
    .line 24
    iput-object v0, p0, La/t3a;->j:Landroid/util/Range;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, La/t3a;->m:Z

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, La/t3a;->n:La/drd;

    .line 38
    .line 39
    new-instance v1, La/kd30;

    .line 40
    .line 41
    const/16 v2, 0x1b

    .line 42
    .line 43
    invoke-direct {v1, v2}, La/kd30;-><init>(B)V

    .line 44
    .line 45
    .line 46
    iput-object v1, p0, La/t3a;->s:La/kd30;

    .line 47
    .line 48
    iget-object v1, p3, La/zo;->c:La/hy9;

    .line 49
    .line 50
    iput-object v1, p0, La/t3a;->k:La/hy9;

    .line 51
    .line 52
    new-instance v1, La/ap;

    .line 53
    .line 54
    invoke-direct {v1, p1, p3}, La/ap;-><init>(La/s0a;La/zo;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, p0, La/t3a;->a:La/ap;

    .line 58
    .line 59
    if-eqz p2, :cond_0

    .line 60
    .line 61
    if-eqz p4, :cond_0

    .line 62
    .line 63
    new-instance p1, La/ap;

    .line 64
    .line 65
    invoke-direct {p1, p2, p4}, La/ap;-><init>(La/s0a;La/zo;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, La/t3a;->b:La/ap;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    iput-object v0, p0, La/t3a;->b:La/ap;

    .line 72
    .line 73
    :goto_0
    iput-object p5, p0, La/t3a;->q:La/c5k;

    .line 74
    .line 75
    iput-object p6, p0, La/t3a;->r:La/c5k;

    .line 76
    .line 77
    iput-object p7, p0, La/t3a;->g:La/wy9;

    .line 78
    .line 79
    iput-object p9, p0, La/t3a;->c:La/ipt0;

    .line 80
    .line 81
    invoke-static {p3, p4}, La/xf0;->M(La/zo;La/zo;)La/h0a;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, La/t3a;->d:La/h0a;

    .line 86
    .line 87
    iput-object p8, p0, La/t3a;->t:La/trm0;

    .line 88
    .line 89
    return-void
.end method

.method public static B(Ljava/util/HashMap;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/fot0;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/Set;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v2, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v2, 0x0

    .line 45
    :goto_1
    iput-object v2, v1, La/fot0;->h:Ljava/util/HashSet;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method public static C(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/fot0;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v1}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    throw p0

    .line 41
    :cond_1
    return-object v0
.end method

.method public static j(Ljava/util/LinkedHashSet;La/wsf0;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/fot0;

    .line 21
    .line 22
    iget-object v2, v1, La/fot0;->h:Ljava/util/HashSet;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object v3, p1, La/wsf0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move-object v3, v2

    .line 36
    :goto_1
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v2, Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iput-object v2, v1, La/fot0;->h:Ljava/util/HashSet;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-object v0
.end method

.method public static t(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    const-string v1, "Cannot compute viewport crop rects zero sized sensor rect."

    .line 17
    .line 18
    invoke-static {v1, v0}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/graphics/RectF;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    new-instance p0, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Landroid/graphics/RectF;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-direct {v1, v3, v3, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 48
    .line 49
    invoke-virtual {p0, v1, v0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public static w(Ljava/util/ArrayList;La/ipt0;La/ipt0;Landroid/util/Range;)Ljava/util/HashMap;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, La/fot0;

    .line 21
    .line 22
    instance-of v2, v1, La/qrm0;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, La/qrm0;

    .line 29
    .line 30
    new-instance v4, La/gyw;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    invoke-direct {v4, v5}, La/gyw;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/pub0;

    .line 37
    .line 38
    iget-object v4, v4, La/gyw;->b:La/wy40;

    .line 39
    .line 40
    invoke-static {v4}, La/b780;->j(La/drd;)La/b780;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v5, v4}, La/pub0;-><init>(La/b780;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v5}, La/w0x;->t(La/w0x;)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/oub0;

    .line 51
    .line 52
    invoke-direct {v4, v5}, La/fot0;-><init>(La/fpt0;)V

    .line 53
    .line 54
    .line 55
    sget-object v5, La/oub0;->z:Ljava/util/concurrent/ScheduledExecutorService;

    .line 56
    .line 57
    iput-object v5, v4, La/oub0;->s:Ljava/util/concurrent/Executor;

    .line 58
    .line 59
    invoke-virtual {v4, v3, p1}, La/oub0;->g(ZLa/ipt0;)La/fpt0;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_0

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    invoke-static {v4}, La/wy40;->p(La/drd;)La/wy40;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    sget-object v5, La/xto0;->A0:La/u15;

    .line 72
    .line 73
    invoke-virtual {v4, v5}, La/wy40;->z(La/u15;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4}, La/qrm0;->n(La/drd;)La/ept0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, La/eyg0;

    .line 81
    .line 82
    invoke-virtual {v2}, La/eyg0;->e()La/fpt0;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v1, v3, p1}, La/fot0;->g(ZLa/ipt0;)La/fpt0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_1
    const/4 v4, 0x1

    .line 92
    invoke-virtual {v1, v4, p2}, La/fot0;->g(ZLa/ipt0;)La/fpt0;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    invoke-static {v4}, La/wy40;->p(La/drd;)La/wy40;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    :goto_2
    sget-object v5, La/fpt0;->H0:La/u15;

    .line 108
    .line 109
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v4, v5, v3}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v3, La/h55;->h:Landroid/util/Range;

    .line 117
    .line 118
    invoke-virtual {v3, p3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    sget-object v3, La/fpt0;->I0:La/u15;

    .line 125
    .line 126
    sget-object v5, La/crd;->b:La/crd;

    .line 127
    .line 128
    invoke-virtual {v4, v3, v5, p3}, La/wy40;->x(La/u15;La/crd;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    sget-object v3, La/fpt0;->J0:La/u15;

    .line 132
    .line 133
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-virtual {v4, v3, v5}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    invoke-virtual {v1, v4}, La/fot0;->n(La/drd;)La/ept0;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-interface {v3}, La/ept0;->e()La/fpt0;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    new-instance v4, La/p3a;

    .line 147
    .line 148
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v2, v4, La/p3a;->a:La/fpt0;

    .line 152
    .line 153
    iput-object v3, v4, La/p3a;->b:La/fpt0;

    .line 154
    .line 155
    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_4
    return-object v0
.end method


# virtual methods
.method public final A(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/fot0;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    iput-object v3, v2, La/fot0;->h:Ljava/util/HashSet;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 25
    .line 26
    iget-object v2, p0, La/t3a;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, La/t3a;->b:La/ap;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_1
    invoke-virtual {p0, v1, p1}, La/t3a;->s(Ljava/util/LinkedHashSet;Z)La/kk9;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, La/t3a;->i(La/kk9;)V

    .line 46
    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p0
.end method

.method public final a()La/j0a;
    .locals 0

    .line 1
    iget-object p0, p0, La/t3a;->a:La/ap;

    .line 2
    .line 3
    iget-object p0, p0, La/ap;->b:La/zo;

    .line 4
    .line 5
    return-object p0
.end method

.method public final c(Ljava/util/Collection;La/wsf0;)V
    .locals 3

    .line 1
    const-string v0, "CameraUseCaseAdapter"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "addUseCases: appUseCasesToAdd = "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v2, ", featureGroup = "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, p0, La/t3a;->a:La/ap;

    .line 32
    .line 33
    iget-object v2, p0, La/t3a;->k:La/hy9;

    .line 34
    .line 35
    invoke-virtual {v1, v2}, La/ap;->f(La/hy9;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/t3a;->b:La/ap;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1, v2}, La/ap;->f(La/hy9;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    iget-object v2, p0, La/t3a;->e:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p2}, La/t3a;->j(Ljava/util/LinkedHashSet;La/wsf0;)Ljava/util/HashMap;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :try_start_1
    iget-object p2, p0, La/t3a;->b:La/ap;

    .line 60
    .line 61
    if-eqz p2, :cond_1

    .line 62
    .line 63
    const/4 p2, 0x1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 p2, 0x0

    .line 66
    :goto_0
    invoke-virtual {p0, v1, p2}, La/t3a;->s(Ljava/util/LinkedHashSet;Z)La/kk9;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p0, p2}, La/t3a;->i(La/kk9;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_2
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    goto :goto_1

    .line 77
    :catch_0
    move-exception p0

    .line 78
    invoke-static {p1}, La/t3a;->B(Ljava/util/HashMap;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, La/n3a;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 88
    throw p0
.end method

.method public final i(La/kk9;)V
    .locals 9

    .line 1
    iget-object v0, p1, La/kk9;->i:La/srm0;

    .line 2
    .line 3
    iget-object v7, v0, La/srm0;->a:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v0, p1, La/kk9;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v8, p0, La/t3a;->l:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v8

    .line 10
    :try_start_0
    iget-object v1, p0, La/t3a;->h:La/wju0;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, La/t3a;->a:La/ap;

    .line 21
    .line 22
    iget-object v1, v1, La/ap;->b:La/zo;

    .line 23
    .line 24
    iget-object v1, v1, La/ewq;->a:La/n0a;

    .line 25
    .line 26
    invoke-interface {v1}, La/j0a;->h()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    :goto_0
    move v2, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    iget-object v1, p0, La/t3a;->a:La/ap;

    .line 38
    .line 39
    iget-object v1, v1, La/ap;->b:La/zo;

    .line 40
    .line 41
    iget-object v1, v1, La/ewq;->a:La/n0a;

    .line 42
    .line 43
    invoke-interface {v1}, La/n0a;->g()Landroid/graphics/Rect;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v3, p0, La/t3a;->h:La/wju0;

    .line 48
    .line 49
    move-object v4, v3

    .line 50
    iget-object v3, v4, La/wju0;->b:Landroid/util/Rational;

    .line 51
    .line 52
    iget-object v5, p0, La/t3a;->a:La/ap;

    .line 53
    .line 54
    iget-object v5, v5, La/ap;->b:La/zo;

    .line 55
    .line 56
    iget v4, v4, La/wju0;->c:I

    .line 57
    .line 58
    iget-object v5, v5, La/ewq;->a:La/n0a;

    .line 59
    .line 60
    invoke-interface {v5, v4}, La/j0a;->B(I)I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    iget-object v5, p0, La/t3a;->h:La/wju0;

    .line 65
    .line 66
    move-object v6, v5

    .line 67
    iget v5, v6, La/wju0;->a:I

    .line 68
    .line 69
    iget v6, v6, La/wju0;->d:I

    .line 70
    .line 71
    invoke-static/range {v1 .. v7}, La/j5n0;->x(Landroid/graphics/Rect;ZLandroid/util/Rational;IIILjava/util/Map;)Ljava/util/HashMap;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_1

    .line 84
    .line 85
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    check-cast v3, La/fot0;

    .line 90
    .line 91
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, Landroid/graphics/Rect;

    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4}, La/fot0;->C(Landroid/graphics/Rect;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    move-object p0, v0

    .line 106
    goto/16 :goto_a

    .line 107
    .line 108
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_2

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, La/fot0;

    .line 123
    .line 124
    iget-object v2, p0, La/t3a;->a:La/ap;

    .line 125
    .line 126
    iget-object v2, v2, La/ap;->b:La/zo;

    .line 127
    .line 128
    iget-object v2, v2, La/ewq;->a:La/n0a;

    .line 129
    .line 130
    invoke-interface {v2}, La/n0a;->g()Landroid/graphics/Rect;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, La/h55;

    .line 139
    .line 140
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v3, v3, La/h55;->a:Landroid/util/Size;

    .line 144
    .line 145
    invoke-static {v2, v3}, La/t3a;->t(Landroid/graphics/Rect;Landroid/util/Size;)Landroid/graphics/Matrix;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v1, v2}, La/fot0;->B(Landroid/graphics/Matrix;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_2
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    iget-object v0, p0, La/t3a;->i:Ljava/util/List;

    .line 155
    .line 156
    iget-object v1, p1, La/kk9;->b:Ljava/util/ArrayList;

    .line 157
    .line 158
    iget-object v2, p1, La/kk9;->a:Ljava/util/LinkedHashSet;

    .line 159
    .line 160
    invoke-static {v1, v0}, La/t3a;->C(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    new-instance v3, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    invoke-static {v3, v0}, La/t3a;->C(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_3

    .line 181
    .line 182
    const-string v1, "CameraUseCaseAdapter"

    .line 183
    .line 184
    new-instance v2, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v3, "Unused effects: "

    .line 187
    .line 188
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v1, v0}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_3
    iget-object v0, p1, La/kk9;->e:Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    if-eqz v1, :cond_4

    .line 212
    .line 213
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    check-cast v1, La/fot0;

    .line 218
    .line 219
    iget-object v2, p0, La/t3a;->a:La/ap;

    .line 220
    .line 221
    invoke-virtual {v1, v2}, La/fot0;->D(La/s0a;)V

    .line 222
    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_4
    iget-object v0, p0, La/t3a;->a:La/ap;

    .line 226
    .line 227
    iget-object v1, p1, La/kk9;->e:Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-virtual {v0, v1}, La/ap;->n(Ljava/util/ArrayList;)V

    .line 230
    .line 231
    .line 232
    iget-object v0, p0, La/t3a;->b:La/ap;

    .line 233
    .line 234
    if-eqz v0, :cond_6

    .line 235
    .line 236
    iget-object v0, p1, La/kk9;->e:Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_5

    .line 247
    .line 248
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    check-cast v1, La/fot0;

    .line 253
    .line 254
    iget-object v2, p0, La/t3a;->b:La/ap;

    .line 255
    .line 256
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v2}, La/fot0;->D(La/s0a;)V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_5
    iget-object v0, p0, La/t3a;->b:La/ap;

    .line 264
    .line 265
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    iget-object v1, p1, La/kk9;->e:Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-virtual {v0, v1}, La/ap;->n(Ljava/util/ArrayList;)V

    .line 271
    .line 272
    .line 273
    :cond_6
    iget-object v0, p1, La/kk9;->e:Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_b

    .line 280
    .line 281
    iget-object v0, p1, La/kk9;->d:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_b

    .line 292
    .line 293
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, La/fot0;

    .line 298
    .line 299
    iget-object v2, p1, La/kk9;->i:La/srm0;

    .line 300
    .line 301
    iget-object v2, v2, La/srm0;->a:Ljava/util/Map;

    .line 302
    .line 303
    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-eqz v3, :cond_7

    .line 308
    .line 309
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, La/h55;

    .line 314
    .line 315
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    iget-object v2, v2, La/h55;->f:La/drd;

    .line 319
    .line 320
    if-eqz v2, :cond_7

    .line 321
    .line 322
    iget-object v3, v1, La/fot0;->p:La/xii0;

    .line 323
    .line 324
    iget-object v4, v3, La/xii0;->g:La/t7a;

    .line 325
    .line 326
    iget-object v4, v4, La/t7a;->b:La/b780;

    .line 327
    .line 328
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    invoke-interface {v2}, La/drd;->c()Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    invoke-interface {v5}, Ljava/util/Set;->size()I

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    iget-object v3, v3, La/xii0;->g:La/t7a;

    .line 340
    .line 341
    iget-object v3, v3, La/t7a;->b:La/b780;

    .line 342
    .line 343
    invoke-virtual {v3}, La/b780;->c()Ljava/util/Set;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    invoke-interface {v3}, Ljava/util/Set;->size()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    if-eq v5, v3, :cond_8

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_8
    invoke-interface {v2}, La/drd;->c()Ljava/util/Set;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_7

    .line 367
    .line 368
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    check-cast v5, La/u15;

    .line 373
    .line 374
    iget-object v6, v4, La/b780;->a:Ljava/util/TreeMap;

    .line 375
    .line 376
    invoke-virtual {v6, v5}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    if-eqz v6, :cond_a

    .line 381
    .line 382
    invoke-virtual {v4, v5}, La/b780;->d(La/u15;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-interface {v2, v5}, La/drd;->d(La/u15;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    invoke-static {v6, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    if-nez v5, :cond_9

    .line 395
    .line 396
    :cond_a
    :goto_7
    invoke-virtual {v1, v2}, La/fot0;->y(La/drd;)La/h55;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    iput-object v2, v1, La/fot0;->j:La/h55;

    .line 401
    .line 402
    iget-boolean v2, p0, La/t3a;->m:Z

    .line 403
    .line 404
    if-eqz v2, :cond_7

    .line 405
    .line 406
    iget-object v2, p0, La/t3a;->a:La/ap;

    .line 407
    .line 408
    invoke-virtual {v2, v1}, La/ap;->i(La/fot0;)V

    .line 409
    .line 410
    .line 411
    iget-object v2, p0, La/t3a;->b:La/ap;

    .line 412
    .line 413
    if-eqz v2, :cond_7

    .line 414
    .line 415
    invoke-virtual {v2, v1}, La/ap;->i(La/fot0;)V

    .line 416
    .line 417
    .line 418
    goto/16 :goto_6

    .line 419
    .line 420
    :cond_b
    iget-object v0, p1, La/kk9;->c:Ljava/util/ArrayList;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-eqz v1, :cond_d

    .line 431
    .line 432
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    check-cast v1, La/fot0;

    .line 437
    .line 438
    iget-object v2, p1, La/kk9;->h:Ljava/util/HashMap;

    .line 439
    .line 440
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    check-cast v2, La/p3a;

    .line 445
    .line 446
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    iget-object v3, p0, La/t3a;->b:La/ap;

    .line 450
    .line 451
    iget-object v4, p0, La/t3a;->a:La/ap;

    .line 452
    .line 453
    iget-object v5, v2, La/p3a;->a:La/fpt0;

    .line 454
    .line 455
    if-eqz v3, :cond_c

    .line 456
    .line 457
    iget-object v2, v2, La/p3a;->b:La/fpt0;

    .line 458
    .line 459
    invoke-virtual {v1, v4, v3, v5, v2}, La/fot0;->b(La/s0a;La/s0a;La/fpt0;La/fpt0;)V

    .line 460
    .line 461
    .line 462
    iget-object v2, p1, La/kk9;->i:La/srm0;

    .line 463
    .line 464
    iget-object v2, v2, La/srm0;->a:Ljava/util/Map;

    .line 465
    .line 466
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    check-cast v2, La/h55;

    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v3, p1, La/kk9;->j:La/srm0;

    .line 476
    .line 477
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    iget-object v3, v3, La/srm0;->a:Ljava/util/Map;

    .line 481
    .line 482
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    check-cast v3, La/h55;

    .line 487
    .line 488
    invoke-virtual {v1, v2, v3}, La/fot0;->F(La/h55;La/h55;)V

    .line 489
    .line 490
    .line 491
    goto :goto_8

    .line 492
    :cond_c
    iget-object v2, v2, La/p3a;->b:La/fpt0;

    .line 493
    .line 494
    const/4 v3, 0x0

    .line 495
    invoke-virtual {v1, v4, v3, v5, v2}, La/fot0;->b(La/s0a;La/s0a;La/fpt0;La/fpt0;)V

    .line 496
    .line 497
    .line 498
    iget-object v2, p1, La/kk9;->i:La/srm0;

    .line 499
    .line 500
    iget-object v2, v2, La/srm0;->a:Ljava/util/Map;

    .line 501
    .line 502
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    check-cast v2, La/h55;

    .line 507
    .line 508
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v2, v3}, La/fot0;->F(La/h55;La/h55;)V

    .line 512
    .line 513
    .line 514
    goto :goto_8

    .line 515
    :cond_d
    iget-boolean v0, p0, La/t3a;->m:Z

    .line 516
    .line 517
    if-eqz v0, :cond_e

    .line 518
    .line 519
    iget-object v0, p0, La/t3a;->a:La/ap;

    .line 520
    .line 521
    iget-object v1, p1, La/kk9;->c:Ljava/util/ArrayList;

    .line 522
    .line 523
    invoke-virtual {v0, v1}, La/ap;->o(Ljava/util/ArrayList;)V

    .line 524
    .line 525
    .line 526
    iget-object v0, p0, La/t3a;->b:La/ap;

    .line 527
    .line 528
    if-eqz v0, :cond_e

    .line 529
    .line 530
    iget-object v1, p1, La/kk9;->c:Ljava/util/ArrayList;

    .line 531
    .line 532
    invoke-virtual {v0, v1}, La/ap;->o(Ljava/util/ArrayList;)V

    .line 533
    .line 534
    .line 535
    :cond_e
    iget-object v0, p1, La/kk9;->c:Ljava/util/ArrayList;

    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    if-eqz v1, :cond_f

    .line 546
    .line 547
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    check-cast v1, La/fot0;

    .line 552
    .line 553
    invoke-virtual {v1}, La/fot0;->s()V

    .line 554
    .line 555
    .line 556
    goto :goto_9

    .line 557
    :cond_f
    iget-object v0, p0, La/t3a;->e:Ljava/util/ArrayList;

    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 560
    .line 561
    .line 562
    iget-object v0, p0, La/t3a;->e:Ljava/util/ArrayList;

    .line 563
    .line 564
    iget-object v1, p1, La/kk9;->a:Ljava/util/LinkedHashSet;

    .line 565
    .line 566
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 567
    .line 568
    .line 569
    iget-object v0, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 572
    .line 573
    .line 574
    iget-object v0, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 575
    .line 576
    iget-object v1, p1, La/kk9;->b:Ljava/util/ArrayList;

    .line 577
    .line 578
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 579
    .line 580
    .line 581
    iget-object v0, p1, La/kk9;->g:La/fot0;

    .line 582
    .line 583
    iput-object v0, p0, La/t3a;->o:La/fot0;

    .line 584
    .line 585
    iget-object p1, p1, La/kk9;->f:La/qrm0;

    .line 586
    .line 587
    iput-object p1, p0, La/t3a;->p:La/qrm0;

    .line 588
    .line 589
    return-void

    .line 590
    :goto_a
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 591
    throw p0
.end method

.method public final l()V
    .locals 4

    .line 1
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, La/t3a;->m:Z

    .line 5
    .line 6
    if-nez v1, :cond_4

    .line 7
    .line 8
    iget-object v1, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, La/t3a;->a:La/ap;

    .line 17
    .line 18
    iget-object v2, p0, La/t3a;->k:La/hy9;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, La/ap;->f(La/hy9;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, La/t3a;->b:La/ap;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v2, p0, La/t3a;->k:La/hy9;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, La/ap;->f(La/hy9;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_5

    .line 35
    :cond_0
    :goto_0
    iget-object v1, p0, La/t3a;->a:La/ap;

    .line 36
    .line 37
    iget-object v2, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, La/ap;->o(Ljava/util/ArrayList;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, La/t3a;->b:La/ap;

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, La/ap;->o(Ljava/util/ArrayList;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v1, p0, La/t3a;->l:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :try_start_1
    iget-object v2, p0, La/t3a;->n:La/drd;

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, La/t3a;->a:La/ap;

    .line 59
    .line 60
    iget-object v3, v3, La/ap;->c:La/yo;

    .line 61
    .line 62
    invoke-virtual {v3, v2}, La/yo;->g(La/drd;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    :try_start_2
    iget-object v1, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, La/fot0;

    .line 86
    .line 87
    invoke-virtual {v2}, La/fot0;->s()V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const/4 v1, 0x1

    .line 92
    iput-boolean v1, p0, La/t3a;->m:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    :try_start_4
    throw p0

    .line 97
    :cond_4
    :goto_4
    monitor-exit v0

    .line 98
    return-void

    .line 99
    :goto_5
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 100
    throw p0
.end method

.method public final s(Ljava/util/LinkedHashSet;Z)La/kk9;
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-virtual {v1}, La/t3a;->z()V

    .line 6
    .line 7
    .line 8
    iget-object v3, v1, La/t3a;->l:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v3

    .line 11
    :try_start_0
    iget-object v0, v1, La/t3a;->i:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v4, 0x2

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v0, :cond_7

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    check-cast v7, La/fot0;

    .line 37
    .line 38
    instance-of v8, v7, La/mzw;

    .line 39
    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    iget-object v7, v7, La/fot0;->i:La/fpt0;

    .line 44
    .line 45
    sget-object v8, La/nzw;->f:La/u15;

    .line 46
    .line 47
    invoke-interface {v7, v8}, La/qae0;->f(La/u15;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_0

    .line 52
    .line 53
    invoke-interface {v7, v8}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    check-cast v7, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eq v7, v6, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_5

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    check-cast v7, La/fot0;

    .line 84
    .line 85
    instance-of v8, v7, La/mzw;

    .line 86
    .line 87
    if-nez v8, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    iget-object v7, v7, La/fot0;->i:La/fpt0;

    .line 91
    .line 92
    sget-object v8, La/nzw;->f:La/u15;

    .line 93
    .line 94
    invoke-interface {v7, v8}, La/qae0;->f(La/u15;)Z

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_3

    .line 99
    .line 100
    invoke-interface {v7, v8}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    check-cast v7, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-ne v7, v4, :cond_3

    .line 114
    .line 115
    move v0, v6

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    move v0, v5

    .line 118
    :goto_2
    if-nez v0, :cond_6

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    const-string v1, "Ultra HDR image and Raw capture does not support for use with CameraEffect."

    .line 124
    .line 125
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :catchall_0
    move-exception v0

    .line 130
    goto/16 :goto_1b

    .line 131
    .line 132
    :cond_7
    :goto_3
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    if-nez p2, :cond_11

    .line 134
    .line 135
    invoke-virtual {v1}, La/t3a;->z()V

    .line 136
    .line 137
    .line 138
    iget-object v0, v1, La/t3a;->s:La/kd30;

    .line 139
    .line 140
    iget-object v3, v1, La/t3a;->a:La/ap;

    .line 141
    .line 142
    iget-object v3, v3, La/ap;->b:La/zo;

    .line 143
    .line 144
    iget-object v3, v3, La/ewq;->a:La/n0a;

    .line 145
    .line 146
    invoke-interface {v3}, La/n0a;->e()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    iget-object v7, v0, La/kd30;->a:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v7, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;

    .line 153
    .line 154
    if-eqz v7, :cond_9

    .line 155
    .line 156
    const-string v0, "1"

    .line 157
    .line 158
    sget-object v7, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->a:Ljava/util/HashSet;

    .line 159
    .line 160
    const-string v7, "oneplus"

    .line 161
    .line 162
    sget-object v8, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    if-eqz v7, :cond_8

    .line 169
    .line 170
    const-string v7, "cph2583"

    .line 171
    .line 172
    sget-object v9, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v7, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_8

    .line 179
    .line 180
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_11

    .line 185
    .line 186
    invoke-static {v2}, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->b(Ljava/util/LinkedHashSet;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_11

    .line 191
    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :cond_8
    const-string v7, "google"

    .line 195
    .line 196
    invoke-virtual {v7, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-eqz v7, :cond_11

    .line 201
    .line 202
    sget-object v7, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->a:Ljava/util/HashSet;

    .line 203
    .line 204
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-eqz v7, :cond_11

    .line 215
    .line 216
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_11

    .line 221
    .line 222
    invoke-static {v2}, Landroidx/camera/core/internal/compat/quirk/ImageCaptureFailedForSpecificCombinationQuirk;->b(Ljava/util/LinkedHashSet;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_11

    .line 227
    .line 228
    goto/16 :goto_6

    .line 229
    .line 230
    :cond_9
    iget-object v0, v0, La/kd30;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v0, Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;

    .line 233
    .line 234
    if-eqz v0, :cond_11

    .line 235
    .line 236
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    const-string v0, "motorola"

    .line 240
    .line 241
    sget-object v7, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_11

    .line 248
    .line 249
    const-string v0, "moto e20"

    .line 250
    .line 251
    sget-object v7, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_11

    .line 258
    .line 259
    const-string v0, "0"

    .line 260
    .line 261
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v0

    .line 265
    if-eqz v0, :cond_11

    .line 266
    .line 267
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-eq v0, v4, :cond_a

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_a
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_c

    .line 279
    .line 280
    :cond_b
    move v0, v5

    .line 281
    goto :goto_4

    .line 282
    :cond_c
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    if-eqz v3, :cond_b

    .line 291
    .line 292
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    check-cast v3, La/fot0;

    .line 297
    .line 298
    instance-of v3, v3, La/oub0;

    .line 299
    .line 300
    if-eqz v3, :cond_d

    .line 301
    .line 302
    move v0, v6

    .line 303
    :goto_4
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-eqz v3, :cond_f

    .line 308
    .line 309
    :cond_e
    move v3, v5

    .line 310
    goto :goto_5

    .line 311
    :cond_f
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    :cond_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    if-eqz v7, :cond_e

    .line 320
    .line 321
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    check-cast v7, La/fot0;

    .line 326
    .line 327
    iget-object v8, v7, La/fot0;->i:La/fpt0;

    .line 328
    .line 329
    sget-object v9, La/fpt0;->N0:La/u15;

    .line 330
    .line 331
    invoke-interface {v8, v9}, La/qae0;->f(La/u15;)Z

    .line 332
    .line 333
    .line 334
    move-result v8

    .line 335
    if-eqz v8, :cond_10

    .line 336
    .line 337
    iget-object v7, v7, La/fot0;->i:La/fpt0;

    .line 338
    .line 339
    invoke-interface {v7}, La/fpt0;->v()La/hpt0;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    sget-object v8, La/hpt0;->d:La/hpt0;

    .line 344
    .line 345
    if-ne v7, v8, :cond_10

    .line 346
    .line 347
    move v3, v6

    .line 348
    :goto_5
    if-eqz v0, :cond_11

    .line 349
    .line 350
    if-eqz v3, :cond_11

    .line 351
    .line 352
    :goto_6
    invoke-virtual {v1, v2, v6}, La/t3a;->s(Ljava/util/LinkedHashSet;Z)La/kk9;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    return-object v0

    .line 357
    :cond_11
    :goto_7
    iget-object v7, v1, La/t3a;->l:Ljava/lang/Object;

    .line 358
    .line 359
    monitor-enter v7

    .line 360
    :try_start_1
    invoke-virtual/range {p0 .. p2}, La/t3a;->x(Ljava/util/LinkedHashSet;Z)Ljava/util/HashSet;

    .line 361
    .line 362
    .line 363
    move-result-object v13

    .line 364
    invoke-virtual {v13}, Ljava/util/HashSet;->size()I

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-ge v0, v4, :cond_12

    .line 369
    .line 370
    invoke-virtual {v1}, La/t3a;->z()V

    .line 371
    .line 372
    .line 373
    monitor-exit v7

    .line 374
    :goto_8
    const/4 v0, 0x0

    .line 375
    goto/16 :goto_c

    .line 376
    .line 377
    :catchall_1
    move-exception v0

    .line 378
    goto/16 :goto_1a

    .line 379
    .line 380
    :cond_12
    iget-object v0, v1, La/t3a;->p:La/qrm0;

    .line 381
    .line 382
    if-eqz v0, :cond_14

    .line 383
    .line 384
    iget-object v0, v0, La/qrm0;->s:La/fnu0;

    .line 385
    .line 386
    iget-object v0, v0, La/fnu0;->a:Ljava/util/HashSet;

    .line 387
    .line 388
    invoke-interface {v0, v13}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_14

    .line 393
    .line 394
    iget-object v0, v1, La/t3a;->p:La/qrm0;

    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v8

    .line 403
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    check-cast v8, La/fot0;

    .line 408
    .line 409
    iget-object v8, v8, La/fot0;->h:Ljava/util/HashSet;

    .line 410
    .line 411
    if-eqz v8, :cond_13

    .line 412
    .line 413
    new-instance v9, Ljava/util/HashSet;

    .line 414
    .line 415
    invoke-direct {v9, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 416
    .line 417
    .line 418
    goto :goto_9

    .line 419
    :cond_13
    const/4 v9, 0x0

    .line 420
    :goto_9
    iput-object v9, v0, La/fot0;->h:Ljava/util/HashSet;

    .line 421
    .line 422
    iget-object v0, v1, La/t3a;->p:La/qrm0;

    .line 423
    .line 424
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    monitor-exit v7

    .line 428
    goto :goto_c

    .line 429
    :cond_14
    const/4 v0, 0x4

    .line 430
    filled-new-array {v6, v4, v0}, [I

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    new-instance v8, Ljava/util/HashSet;

    .line 435
    .line 436
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    :cond_15
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 444
    .line 445
    .line 446
    move-result v10

    .line 447
    if-eqz v10, :cond_1a

    .line 448
    .line 449
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    check-cast v10, La/fot0;

    .line 454
    .line 455
    move v11, v5

    .line 456
    :goto_a
    const/4 v12, 0x3

    .line 457
    if-ge v11, v12, :cond_15

    .line 458
    .line 459
    aget v12, v0, v11

    .line 460
    .line 461
    invoke-virtual {v10}, La/fot0;->l()Ljava/util/Set;

    .line 462
    .line 463
    .line 464
    move-result-object v14

    .line 465
    invoke-interface {v14}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 466
    .line 467
    .line 468
    move-result-object v14

    .line 469
    :cond_16
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 470
    .line 471
    .line 472
    move-result v15

    .line 473
    if-eqz v15, :cond_17

    .line 474
    .line 475
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    check-cast v15, Ljava/lang/Integer;

    .line 480
    .line 481
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 482
    .line 483
    .line 484
    move-result v15

    .line 485
    and-int v3, v12, v15

    .line 486
    .line 487
    if-ne v3, v15, :cond_16

    .line 488
    .line 489
    move v3, v6

    .line 490
    goto :goto_b

    .line 491
    :cond_17
    move v3, v5

    .line 492
    :goto_b
    if-eqz v3, :cond_19

    .line 493
    .line 494
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    if-eqz v3, :cond_18

    .line 503
    .line 504
    monitor-exit v7

    .line 505
    goto/16 :goto_8

    .line 506
    .line 507
    :cond_18
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-virtual {v8, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    :cond_19
    add-int/lit8 v11, v11, 0x1

    .line 515
    .line 516
    goto :goto_a

    .line 517
    :cond_1a
    new-instance v8, La/qrm0;

    .line 518
    .line 519
    iget-object v9, v1, La/t3a;->a:La/ap;

    .line 520
    .line 521
    iget-object v10, v1, La/t3a;->b:La/ap;

    .line 522
    .line 523
    iget-object v11, v1, La/t3a;->q:La/c5k;

    .line 524
    .line 525
    iget-object v12, v1, La/t3a;->r:La/c5k;

    .line 526
    .line 527
    iget-object v14, v1, La/t3a;->c:La/ipt0;

    .line 528
    .line 529
    invoke-direct/range {v8 .. v14}, La/qrm0;-><init>(La/s0a;La/s0a;La/c5k;La/c5k;Ljava/util/HashSet;La/ipt0;)V

    .line 530
    .line 531
    .line 532
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 533
    move-object v0, v8

    .line 534
    :goto_c
    iget-object v3, v1, La/t3a;->l:Ljava/lang/Object;

    .line 535
    .line 536
    monitor-enter v3

    .line 537
    :try_start_2
    new-instance v7, Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 540
    .line 541
    .line 542
    if-eqz v0, :cond_1b

    .line 543
    .line 544
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    iget-object v8, v0, La/qrm0;->s:La/fnu0;

    .line 548
    .line 549
    iget-object v8, v8, La/fnu0;->a:Ljava/util/HashSet;

    .line 550
    .line 551
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 552
    .line 553
    .line 554
    goto :goto_d

    .line 555
    :catchall_2
    move-exception v0

    .line 556
    goto/16 :goto_19

    .line 557
    .line 558
    :cond_1b
    :goto_d
    iget-object v8, v1, La/t3a;->l:Ljava/lang/Object;

    .line 559
    .line 560
    monitor-enter v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 561
    :try_start_3
    iget-object v9, v1, La/t3a;->k:La/hy9;

    .line 562
    .line 563
    sget-object v10, La/hy9;->J:La/u15;

    .line 564
    .line 565
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object v11

    .line 569
    invoke-interface {v9, v10, v11}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v9

    .line 573
    check-cast v9, Ljava/lang/Integer;

    .line 574
    .line 575
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 576
    .line 577
    .line 578
    move-result v9

    .line 579
    if-ne v9, v6, :cond_1c

    .line 580
    .line 581
    move v9, v6

    .line 582
    goto :goto_e

    .line 583
    :cond_1c
    move v9, v5

    .line 584
    :goto_e
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 585
    if-eqz v9, :cond_28

    .line 586
    .line 587
    :try_start_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 588
    .line 589
    .line 590
    move-result-object v8

    .line 591
    move v9, v5

    .line 592
    move v10, v9

    .line 593
    :cond_1d
    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 594
    .line 595
    .line 596
    move-result v11

    .line 597
    if-eqz v11, :cond_20

    .line 598
    .line 599
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 600
    .line 601
    .line 602
    move-result-object v11

    .line 603
    check-cast v11, La/fot0;

    .line 604
    .line 605
    instance-of v12, v11, La/oub0;

    .line 606
    .line 607
    if-nez v12, :cond_1f

    .line 608
    .line 609
    instance-of v12, v11, La/qrm0;

    .line 610
    .line 611
    if-eqz v12, :cond_1e

    .line 612
    .line 613
    goto :goto_10

    .line 614
    :cond_1e
    instance-of v11, v11, La/mzw;

    .line 615
    .line 616
    if-eqz v11, :cond_1d

    .line 617
    .line 618
    move v9, v6

    .line 619
    goto :goto_f

    .line 620
    :cond_1f
    :goto_10
    move v10, v6

    .line 621
    goto :goto_f

    .line 622
    :cond_20
    if-eqz v9, :cond_22

    .line 623
    .line 624
    if-nez v10, :cond_22

    .line 625
    .line 626
    iget-object v7, v1, La/t3a;->o:La/fot0;

    .line 627
    .line 628
    instance-of v8, v7, La/oub0;

    .line 629
    .line 630
    if-eqz v8, :cond_21

    .line 631
    .line 632
    goto/16 :goto_13

    .line 633
    .line 634
    :cond_21
    new-instance v7, La/gyw;

    .line 635
    .line 636
    invoke-direct {v7, v4}, La/gyw;-><init>(B)V

    .line 637
    .line 638
    .line 639
    const-string v8, "Preview-Extra"

    .line 640
    .line 641
    iget-object v9, v7, La/gyw;->b:La/wy40;

    .line 642
    .line 643
    sget-object v10, La/xto0;->z0:La/u15;

    .line 644
    .line 645
    invoke-virtual {v9, v10, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    new-instance v8, La/pub0;

    .line 649
    .line 650
    iget-object v7, v7, La/gyw;->b:La/wy40;

    .line 651
    .line 652
    invoke-static {v7}, La/b780;->j(La/drd;)La/b780;

    .line 653
    .line 654
    .line 655
    move-result-object v7

    .line 656
    invoke-direct {v8, v7}, La/pub0;-><init>(La/b780;)V

    .line 657
    .line 658
    .line 659
    invoke-static {v8}, La/w0x;->t(La/w0x;)V

    .line 660
    .line 661
    .line 662
    new-instance v7, La/oub0;

    .line 663
    .line 664
    invoke-direct {v7, v8}, La/fot0;-><init>(La/fpt0;)V

    .line 665
    .line 666
    .line 667
    sget-object v8, La/oub0;->z:Ljava/util/concurrent/ScheduledExecutorService;

    .line 668
    .line 669
    iput-object v8, v7, La/oub0;->s:Ljava/util/concurrent/Executor;

    .line 670
    .line 671
    new-instance v8, La/c99;

    .line 672
    .line 673
    const/4 v9, 0x7

    .line 674
    invoke-direct {v8, v9}, La/c99;-><init>(B)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v7, v8}, La/oub0;->H(La/nub0;)V

    .line 678
    .line 679
    .line 680
    goto :goto_13

    .line 681
    :cond_22
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 682
    .line 683
    .line 684
    move-result-object v7

    .line 685
    move v8, v5

    .line 686
    move v9, v8

    .line 687
    :cond_23
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v10

    .line 691
    if-eqz v10, :cond_26

    .line 692
    .line 693
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v10

    .line 697
    check-cast v10, La/fot0;

    .line 698
    .line 699
    instance-of v11, v10, La/oub0;

    .line 700
    .line 701
    if-nez v11, :cond_25

    .line 702
    .line 703
    instance-of v11, v10, La/qrm0;

    .line 704
    .line 705
    if-eqz v11, :cond_24

    .line 706
    .line 707
    goto :goto_12

    .line 708
    :cond_24
    instance-of v10, v10, La/mzw;

    .line 709
    .line 710
    if-eqz v10, :cond_23

    .line 711
    .line 712
    move v9, v6

    .line 713
    goto :goto_11

    .line 714
    :cond_25
    :goto_12
    move v8, v6

    .line 715
    goto :goto_11

    .line 716
    :cond_26
    if-eqz v8, :cond_28

    .line 717
    .line 718
    if-nez v9, :cond_28

    .line 719
    .line 720
    iget-object v7, v1, La/t3a;->o:La/fot0;

    .line 721
    .line 722
    instance-of v8, v7, La/mzw;

    .line 723
    .line 724
    if-eqz v8, :cond_27

    .line 725
    .line 726
    goto :goto_13

    .line 727
    :cond_27
    new-instance v7, La/gyw;

    .line 728
    .line 729
    invoke-direct {v7, v6}, La/gyw;-><init>(B)V

    .line 730
    .line 731
    .line 732
    const-string v8, "ImageCapture-Extra"

    .line 733
    .line 734
    iget-object v9, v7, La/gyw;->b:La/wy40;

    .line 735
    .line 736
    sget-object v10, La/xto0;->z0:La/u15;

    .line 737
    .line 738
    invoke-virtual {v9, v10, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v7}, La/gyw;->a()La/mzw;

    .line 742
    .line 743
    .line 744
    move-result-object v7

    .line 745
    goto :goto_13

    .line 746
    :cond_28
    const/4 v7, 0x0

    .line 747
    :goto_13
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 748
    new-instance v3, Ljava/util/ArrayList;

    .line 749
    .line 750
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 751
    .line 752
    .line 753
    if-eqz v7, :cond_29

    .line 754
    .line 755
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    :cond_29
    if-eqz v0, :cond_2a

    .line 759
    .line 760
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    iget-object v8, v0, La/qrm0;->s:La/fnu0;

    .line 764
    .line 765
    iget-object v8, v8, La/fnu0;->a:Ljava/util/HashSet;

    .line 766
    .line 767
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 768
    .line 769
    .line 770
    :cond_2a
    new-instance v8, Ljava/util/ArrayList;

    .line 771
    .line 772
    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 773
    .line 774
    .line 775
    iget-object v9, v1, La/t3a;->f:Ljava/util/ArrayList;

    .line 776
    .line 777
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 778
    .line 779
    .line 780
    new-instance v9, Ljava/util/ArrayList;

    .line 781
    .line 782
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 783
    .line 784
    .line 785
    iget-object v10, v1, La/t3a;->f:Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->retainAll(Ljava/util/Collection;)Z

    .line 788
    .line 789
    .line 790
    move v10, v5

    .line 791
    new-instance v5, Ljava/util/ArrayList;

    .line 792
    .line 793
    iget-object v11, v1, La/t3a;->f:Ljava/util/ArrayList;

    .line 794
    .line 795
    invoke-direct {v5, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 799
    .line 800
    .line 801
    iget-object v11, v1, La/t3a;->k:La/hy9;

    .line 802
    .line 803
    sget-object v12, La/hy9;->H:La/u15;

    .line 804
    .line 805
    sget-object v13, La/ipt0;->a:La/gpt0;

    .line 806
    .line 807
    invoke-interface {v11, v12, v13}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v11

    .line 811
    check-cast v11, La/ipt0;

    .line 812
    .line 813
    iget-object v12, v1, La/t3a;->c:La/ipt0;

    .line 814
    .line 815
    iget-object v13, v1, La/t3a;->j:Landroid/util/Range;

    .line 816
    .line 817
    invoke-static {v8, v11, v12, v13}, La/t3a;->w(Ljava/util/ArrayList;La/ipt0;La/ipt0;Landroid/util/Range;)Ljava/util/HashMap;

    .line 818
    .line 819
    .line 820
    move-result-object v11

    .line 821
    new-array v12, v4, [Ljava/util/List;

    .line 822
    .line 823
    aput-object v8, v12, v10

    .line 824
    .line 825
    aput-object v9, v12, v6

    .line 826
    .line 827
    move v13, v10

    .line 828
    :goto_14
    if-ge v10, v4, :cond_2d

    .line 829
    .line 830
    aget-object v14, v12, v10

    .line 831
    .line 832
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 833
    .line 834
    .line 835
    move-result-object v14

    .line 836
    :cond_2b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 837
    .line 838
    .line 839
    move-result v15

    .line 840
    if-eqz v15, :cond_2c

    .line 841
    .line 842
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v15

    .line 846
    check-cast v15, La/fot0;

    .line 847
    .line 848
    iget-object v15, v15, La/fot0;->h:Ljava/util/HashSet;

    .line 849
    .line 850
    if-eqz v15, :cond_2b

    .line 851
    .line 852
    move v13, v6

    .line 853
    :cond_2c
    if-eqz v13, :cond_2e

    .line 854
    .line 855
    :cond_2d
    move/from16 v23, v13

    .line 856
    .line 857
    goto :goto_15

    .line 858
    :cond_2e
    add-int/lit8 v10, v10, 0x1

    .line 859
    .line 860
    goto :goto_14

    .line 861
    :goto_15
    :try_start_5
    iget-object v4, v1, La/t3a;->t:La/trm0;

    .line 862
    .line 863
    invoke-virtual {v1}, La/t3a;->v()I

    .line 864
    .line 865
    .line 866
    move-result v17

    .line 867
    iget-object v10, v1, La/t3a;->a:La/ap;

    .line 868
    .line 869
    iget-object v10, v10, La/ap;->b:La/zo;

    .line 870
    .line 871
    iget-object v12, v1, La/t3a;->k:La/hy9;

    .line 872
    .line 873
    iget-object v13, v1, La/t3a;->j:Landroid/util/Range;

    .line 874
    .line 875
    move-object/from16 v16, v4

    .line 876
    .line 877
    move-object/from16 v19, v8

    .line 878
    .line 879
    move-object/from16 v20, v9

    .line 880
    .line 881
    move-object/from16 v18, v10

    .line 882
    .line 883
    move-object/from16 v21, v12

    .line 884
    .line 885
    move-object/from16 v22, v13

    .line 886
    .line 887
    invoke-virtual/range {v16 .. v23}, La/trm0;->d(ILa/n0a;Ljava/util/ArrayList;Ljava/util/ArrayList;La/hy9;Landroid/util/Range;Z)La/srm0;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    iget-object v4, v1, La/t3a;->b:La/ap;

    .line 892
    .line 893
    if-eqz v4, :cond_2f

    .line 894
    .line 895
    iget-object v4, v1, La/t3a;->t:La/trm0;

    .line 896
    .line 897
    invoke-virtual {v1}, La/t3a;->v()I

    .line 898
    .line 899
    .line 900
    move-result v17

    .line 901
    iget-object v8, v1, La/t3a;->b:La/ap;

    .line 902
    .line 903
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    iget-object v8, v8, La/ap;->b:La/zo;

    .line 907
    .line 908
    iget-object v10, v1, La/t3a;->k:La/hy9;

    .line 909
    .line 910
    iget-object v12, v1, La/t3a;->j:Landroid/util/Range;

    .line 911
    .line 912
    move-object/from16 v16, v4

    .line 913
    .line 914
    move-object/from16 v18, v8

    .line 915
    .line 916
    move-object/from16 v21, v10

    .line 917
    .line 918
    move-object/from16 v22, v12

    .line 919
    .line 920
    invoke-virtual/range {v16 .. v23}, La/trm0;->d(ILa/n0a;Ljava/util/ArrayList;Ljava/util/ArrayList;La/hy9;Landroid/util/Range;Z)La/srm0;

    .line 921
    .line 922
    .line 923
    move-result-object v1
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    .line 924
    move-object v10, v1

    .line 925
    :goto_16
    move-object v6, v0

    .line 926
    goto :goto_17

    .line 927
    :catch_0
    move-exception v0

    .line 928
    goto :goto_18

    .line 929
    :cond_2f
    const/4 v10, 0x0

    .line 930
    goto :goto_16

    .line 931
    :goto_17
    new-instance v0, La/kk9;

    .line 932
    .line 933
    move-object v1, v2

    .line 934
    move-object v2, v3

    .line 935
    move-object v8, v11

    .line 936
    move-object/from16 v3, v19

    .line 937
    .line 938
    move-object/from16 v4, v20

    .line 939
    .line 940
    invoke-direct/range {v0 .. v10}, La/kk9;-><init>(Ljava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;La/qrm0;La/fot0;Ljava/util/HashMap;La/srm0;La/srm0;)V

    .line 941
    .line 942
    .line 943
    return-object v0

    .line 944
    :goto_18
    if-nez p2, :cond_30

    .line 945
    .line 946
    invoke-virtual {v1}, La/t3a;->z()V

    .line 947
    .line 948
    .line 949
    iget-object v3, v1, La/t3a;->b:La/ap;

    .line 950
    .line 951
    if-nez v3, :cond_30

    .line 952
    .line 953
    invoke-virtual {v1, v2, v6}, La/t3a;->s(Ljava/util/LinkedHashSet;Z)La/kk9;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    return-object v0

    .line 958
    :cond_30
    throw v0

    .line 959
    :catchall_3
    move-exception v0

    .line 960
    :try_start_6
    monitor-exit v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 961
    :try_start_7
    throw v0

    .line 962
    :goto_19
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 963
    throw v0

    .line 964
    :goto_1a
    :try_start_8
    monitor-exit v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 965
    throw v0

    .line 966
    :goto_1b
    :try_start_9
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 967
    throw v0
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, La/t3a;->m:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, La/t3a;->a:La/ap;

    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v3, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, La/ap;->n(Ljava/util/ArrayList;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, La/t3a;->b:La/ap;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v3, p0, La/t3a;->f:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, La/ap;->n(Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    :goto_0
    iget-object v1, p0, La/t3a;->l:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :try_start_1
    iget-object v2, p0, La/t3a;->a:La/ap;

    .line 41
    .line 42
    iget-object v2, v2, La/ap;->c:La/yo;

    .line 43
    .line 44
    iget-object v3, v2, La/yo;->b:La/ry9;

    .line 45
    .line 46
    invoke-interface {v3}, La/ry9;->f()La/drd;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iput-object v3, p0, La/t3a;->n:La/drd;

    .line 51
    .line 52
    invoke-virtual {v2}, La/yo;->i()V

    .line 53
    .line 54
    .line 55
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    const/4 v1, 0x0

    .line 57
    :try_start_2
    iput-boolean v1, p0, La/t3a;->m:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catchall_1
    move-exception p0

    .line 61
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :try_start_4
    throw p0

    .line 63
    :cond_1
    :goto_1
    monitor-exit v0

    .line 64
    return-void

    .line 65
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 66
    throw p0
.end method

.method public final v()I
    .locals 2

    .line 1
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/t3a;->g:La/wy9;

    .line 5
    .line 6
    iget-object v1, p0, La/wy9;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    :try_start_1
    iget-boolean p0, p0, La/wy9;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 10
    .line 11
    :try_start_2
    monitor-exit v1

    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    monitor-exit v0

    .line 17
    return p0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit v0

    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :catchall_1
    move-exception p0

    .line 24
    monitor-exit v1

    .line 25
    throw p0

    .line 26
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    throw p0
.end method

.method public final x(Ljava/util/LinkedHashSet;Z)Ljava/util/HashSet;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/t3a;->l:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    iget-object p0, p0, La/t3a;->i:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_4

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, La/fot0;

    .line 42
    .line 43
    instance-of v1, p2, La/qrm0;

    .line 44
    .line 45
    xor-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    const-string v2, "Only support one level of sharing for now."

    .line 48
    .line 49
    invoke-static {v2, v1}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, La/fot0;->l()Ljava/util/Set;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    and-int v3, p0, v2

    .line 77
    .line 78
    if-ne v3, v2, :cond_2

    .line 79
    .line 80
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    return-object v0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-nez p0, :cond_5

    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    throw p0

    .line 95
    :cond_5
    new-instance p0, Ljava/lang/ClassCastException;

    .line 96
    .line 97
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 98
    .line 99
    .line 100
    throw p0

    .line 101
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    throw p0
.end method

.method public final y()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object p0, p0, La/t3a;->e:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v1

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method public final z()V
    .locals 1

    .line 1
    iget-object v0, p0, La/t3a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/t3a;->k:La/hy9;

    .line 5
    .line 6
    invoke-interface {p0}, La/hy9;->o()V

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
.end method
