.class public abstract La/f5r;
.super La/yge0;
.source "SourceFile"

# interfaces
.implements La/k8m0;


# instance fields
.field public final d:La/glz;

.field public final e:Landroidx/fragment/app/e;

.field public final f:La/u710;

.field public final g:La/u710;

.field public final h:La/u710;

.field public i:La/lrd;

.field public final j:La/gnw0;

.field public k:Z

.field public l:Z


# direct methods
.method public constructor <init>(Landroidx/fragment/app/e;La/glz;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/u710;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, La/u710;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/f5r;->f:La/u710;

    .line 11
    .line 12
    new-instance v0, La/u710;

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/u710;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/f5r;->g:La/u710;

    .line 18
    .line 19
    new-instance v0, La/u710;

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/u710;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/f5r;->h:La/u710;

    .line 25
    .line 26
    new-instance v0, La/gnw0;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v1, v0, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    iput-object v0, p0, La/f5r;->j:La/gnw0;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput-boolean v0, p0, La/f5r;->k:Z

    .line 42
    .line 43
    iput-boolean v0, p0, La/f5r;->l:Z

    .line 44
    .line 45
    iput-object p1, p0, La/f5r;->e:Landroidx/fragment/app/e;

    .line 46
    .line 47
    iput-object p2, p0, La/f5r;->d:La/glz;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-virtual {p0, p1}, La/yge0;->w(Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static z(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-gt v0, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-ne v0, p1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    const-string p0, "Design assumption violated."

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public A(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, La/yge0;->d()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    int-to-long v0, p0

    .line 12
    cmp-long p0, p1, v0

    .line 13
    .line 14
    if-gez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method public B(I)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    if-eq p1, p0, :cond_0

    .line 5
    .line 6
    new-instance p0, La/u3s0;

    .line 7
    .line 8
    invoke-direct {p0}, La/u3s0;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, La/z8s0;

    .line 13
    .line 14
    invoke-direct {p0}, La/z8s0;-><init>()V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, La/k1s0;

    .line 19
    .line 20
    invoke-direct {p0}, La/k1s0;-><init>()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public final C()V
    .locals 8

    .line 1
    iget-boolean v0, p0, La/f5r;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, La/f5r;->e:Landroidx/fragment/app/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/e;->a0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    new-instance v0, La/lx3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, La/lx3;-><init>(I)V

    .line 19
    .line 20
    .line 21
    move v2, v1

    .line 22
    :goto_0
    iget-object v3, p0, La/f5r;->f:La/u710;

    .line 23
    .line 24
    invoke-virtual {v3}, La/u710;->h()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    iget-object v5, p0, La/f5r;->h:La/u710;

    .line 29
    .line 30
    if-ge v2, v4, :cond_2

    .line 31
    .line 32
    invoke-virtual {v3, v2}, La/u710;->e(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    invoke-virtual {p0, v3, v4}, La/f5r;->A(J)Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v0, v6}, La/lx3;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v3, v4}, La/u710;->g(J)V

    .line 50
    .line 51
    .line 52
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    iget-boolean v2, p0, La/f5r;->k:Z

    .line 56
    .line 57
    if-nez v2, :cond_7

    .line 58
    .line 59
    iput-boolean v1, p0, La/f5r;->l:Z

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v3}, La/u710;->h()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-ge v1, v2, :cond_7

    .line 66
    .line 67
    invoke-virtual {v3, v1}, La/u710;->e(I)J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    invoke-virtual {v5, v6, v7}, La/u710;->c(J)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-ltz v2, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    invoke-virtual {v3, v6, v7}, La/u710;->b(J)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->J()Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-nez v2, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_6
    :goto_2
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v0, v2}, La/lx3;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_7
    new-instance v1, La/bx3;

    .line 112
    .line 113
    invoke-direct {v1, v0}, La/bx3;-><init>(La/lx3;)V

    .line 114
    .line 115
    .line 116
    :goto_4
    invoke-virtual {v1}, La/bx3;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_8

    .line 121
    .line 122
    invoke-virtual {v1}, La/bx3;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Ljava/lang/Long;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 129
    .line 130
    .line 131
    move-result-wide v2

    .line 132
    invoke-virtual {p0, v2, v3}, La/f5r;->F(J)V

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_8
    :goto_5
    return-void
.end method

.method public final D(I)Ljava/lang/Long;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    move-object v2, v0

    .line 4
    :goto_0
    iget-object v3, p0, La/f5r;->h:La/u710;

    .line 5
    .line 6
    invoke-virtual {v3}, La/u710;->h()I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    if-ge v1, v4, :cond_2

    .line 11
    .line 12
    invoke-virtual {v3, v1}, La/u710;->i(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ne v4, p1, :cond_1

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v3, v1}, La/u710;->e(I)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const-string p0, "Design assumption violated: a ViewHolder can only be bound to one item at a time."

    .line 36
    .line 37
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-object v2
.end method

.method public final E(La/m6r;)V
    .locals 8

    .line 1
    const-string v0, "f"

    .line 2
    .line 3
    iget-object v1, p0, La/f5r;->f:La/u710;

    .line 4
    .line 5
    iget-wide v2, p1, La/xhe0;->e:J

    .line 6
    .line 7
    invoke-virtual {v1, v2, v3}, La/u710;->b(J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    const-string v2, "Design assumption violated."

    .line 14
    .line 15
    if-eqz v1, :cond_9

    .line 16
    .line 17
    iget-object v3, p1, La/xhe0;->a:Landroid/view/View;

    .line 18
    .line 19
    check-cast v3, Landroid/widget/FrameLayout;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->J()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-nez v5, :cond_1

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v5, 0x0

    .line 43
    iget-object v6, p0, La/f5r;->e:Landroidx/fragment/app/e;

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    new-instance p1, La/e5r;

    .line 50
    .line 51
    invoke-direct {p1, p0, v1, v3}, La/e5r;-><init>(La/f5r;Landroidx/fragment/app/Fragment;Landroid/widget/FrameLayout;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, p1, v5}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-eq p0, v3, :cond_7

    .line 75
    .line 76
    invoke-static {v4, v3}, La/f5r;->z(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_3
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    invoke-static {v4, v3}, La/f5r;->z(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    invoke-virtual {v6}, Landroidx/fragment/app/e;->a0()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    new-instance v2, La/e5r;

    .line 97
    .line 98
    invoke-direct {v2, p0, v1, v3}, La/e5r;-><init>(La/f5r;Landroidx/fragment/app/Fragment;Landroid/widget/FrameLayout;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v6, v2, v5}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, La/f5r;->j:La/gnw0;

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v3, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 112
    .line 113
    .line 114
    iget-object v2, v2, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-nez v4, :cond_5

    .line 125
    .line 126
    :try_start_0
    invoke-virtual {v1, v5}, Landroidx/fragment/app/Fragment;->u0(Z)V

    .line 127
    .line 128
    .line 129
    new-instance v2, La/zb5;

    .line 130
    .line 131
    invoke-direct {v2, v6}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 132
    .line 133
    .line 134
    new-instance v4, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-wide v6, p1, La/xhe0;->e:J

    .line 140
    .line 141
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    const/4 v0, 0x1

    .line 149
    invoke-virtual {v2, v5, v1, p1, v0}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 150
    .line 151
    .line 152
    sget-object p1, La/lkz;->d:La/lkz;

    .line 153
    .line 154
    invoke-virtual {v2, v1, p1}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, La/zb5;->h()V

    .line 158
    .line 159
    .line 160
    iget-object p0, p0, La/f5r;->i:La/lrd;

    .line 161
    .line 162
    invoke-virtual {p0, v5}, La/lrd;->b(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    .line 165
    invoke-static {v3}, La/gnw0;->a(Ljava/util/List;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catchall_0
    move-exception p0

    .line 170
    invoke-static {v3}, La/gnw0;->a(Ljava/util/List;)V

    .line 171
    .line 172
    .line 173
    throw p0

    .line 174
    :cond_5
    invoke-static {v2}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    throw p0

    .line 179
    :cond_6
    iget-boolean v0, v6, Landroidx/fragment/app/e;->K:Z

    .line 180
    .line 181
    if-eqz v0, :cond_8

    .line 182
    .line 183
    :cond_7
    return-void

    .line 184
    :cond_8
    new-instance v0, La/lz2;

    .line 185
    .line 186
    invoke-direct {v0, p0, p1}, La/lz2;-><init>(La/f5r;La/m6r;)V

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, La/f5r;->d:La/glz;

    .line 190
    .line 191
    invoke-virtual {p0, v0}, La/glz;->a(La/blz;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :cond_9
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public final F(J)V
    .locals 7

    .line 1
    iget-object v0, p0, La/f5r;->f:La/u710;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, La/u710;->b(J)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->J()Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->J()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    check-cast v2, Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0, p1, p2}, La/f5r;->A(J)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, La/f5r;->g:La/u710;

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    invoke-virtual {v3, p1, p2}, La/u710;->g(J)V

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0, p1, p2}, La/u710;->g(J)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    iget-object v2, p0, La/f5r;->e:Landroidx/fragment/app/e;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroidx/fragment/app/e;->a0()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    iput-boolean p1, p0, La/f5r;->l:Z

    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->N()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    iget-object v5, p0, La/f5r;->j:La/gnw0;

    .line 71
    .line 72
    if-eqz v4, :cond_6

    .line 73
    .line 74
    invoke-virtual {p0, p1, p2}, La/f5r;->A(J)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_6

    .line 79
    .line 80
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance p0, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    iget-object v4, v5, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 89
    .line 90
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_5

    .line 99
    .line 100
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->q0(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment$SavedState;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {p0}, La/gnw0;->a(Ljava/util/List;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v4, p1, p2}, La/u710;->f(Ljava/lang/Object;J)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    invoke-static {v4}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    throw p0

    .line 116
    :cond_6
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    new-instance p0, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-object v3, v5, La/gnw0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 125
    .line 126
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_7

    .line 135
    .line 136
    :try_start_0
    new-instance v3, La/zb5;

    .line 137
    .line 138
    invoke-direct {v3, v2}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v1}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, La/zb5;->h()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p1, p2}, La/u710;->g(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    invoke-static {p0}, La/gnw0;->a(Ljava/util/List;)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :catchall_0
    move-exception p1

    .line 155
    invoke-static {p0}, La/gnw0;->a(Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_7
    invoke-static {v3}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    throw p0
.end method

.method public e(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final m(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/f5r;->i:La/lrd;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, La/z1x;->u(Z)V

    .line 9
    .line 10
    .line 11
    new-instance v0, La/lrd;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p0, v0, La/lrd;->f:Ljava/lang/Object;

    .line 17
    .line 18
    const-wide/16 v1, -0x1

    .line 19
    .line 20
    iput-wide v1, v0, La/lrd;->a:J

    .line 21
    .line 22
    iput-object v0, p0, La/f5r;->i:La/lrd;

    .line 23
    .line 24
    invoke-static {p1}, La/lrd;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, La/lrd;->e:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v1, La/xp6;

    .line 31
    .line 32
    const/4 v2, 0x7

    .line 33
    invoke-direct {v1, v0, v2}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    iput-object v1, v0, La/lrd;->b:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, La/l5g;

    .line 42
    .line 43
    const/4 v1, 0x3

    .line 44
    invoke-direct {p1, v0, v1}, La/l5g;-><init>(Ljava/lang/Object;B)V

    .line 45
    .line 46
    .line 47
    iput-object p1, v0, La/lrd;->c:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/yge0;->v(La/ahe0;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, La/ige0;

    .line 53
    .line 54
    const/4 v1, 0x4

    .line 55
    invoke-direct {p1, v0, v1}, La/ige0;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    iput-object p1, v0, La/lrd;->d:Ljava/lang/Object;

    .line 59
    .line 60
    iget-object p0, p0, La/f5r;->d:La/glz;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, La/glz;->a(La/blz;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final n(La/xhe0;I)V
    .locals 8

    .line 1
    check-cast p1, La/m6r;

    .line 2
    .line 3
    iget-wide v0, p1, La/xhe0;->e:J

    .line 4
    .line 5
    iget-object v2, p1, La/xhe0;->a:Landroid/view/View;

    .line 6
    .line 7
    check-cast v2, Landroid/widget/FrameLayout;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {p0, v3}, La/f5r;->D(I)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    iget-object v5, p0, La/f5r;->h:La/u710;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    cmp-long v6, v6, v0

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    invoke-virtual {p0, v6, v7}, La/f5r;->F(J)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v6

    .line 40
    invoke-virtual {v5, v6, v7}, La/u710;->g(J)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v5, v3, v0, v1}, La/u710;->f(Ljava/lang/Object;J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p2}, La/f5r;->e(I)J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    iget-object v3, p0, La/f5r;->f:La/u710;

    .line 55
    .line 56
    invoke-virtual {v3, v0, v1}, La/u710;->c(J)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-ltz v4, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p0, p2}, La/f5r;->B(I)Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget-object v4, p0, La/f5r;->g:La/u710;

    .line 68
    .line 69
    invoke-virtual {v4, v0, v1}, La/u710;->b(J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Landroidx/fragment/app/Fragment$SavedState;

    .line 74
    .line 75
    invoke-virtual {p2, v4}, Landroidx/fragment/app/Fragment;->t0(Landroidx/fragment/app/Fragment$SavedState;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, p2, v0, v1}, La/u710;->f(Ljava/lang/Object;J)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0, p1}, La/f5r;->E(La/m6r;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {p0}, La/f5r;->C()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final q(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/f5r;->i:La/lrd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/lrd;->a(Landroidx/recyclerview/widget/RecyclerView;)Landroidx/viewpager2/widget/ViewPager2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v1, v0, La/lrd;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La/xp6;

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v0, La/lrd;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/f5r;

    .line 20
    .line 21
    iget-object v1, v0, La/lrd;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/l5g;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, La/yge0;->y(La/ahe0;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, La/f5r;->d:La/glz;

    .line 29
    .line 30
    iget-object v1, v0, La/lrd;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, La/ige0;

    .line 33
    .line 34
    invoke-virtual {p1, v1}, La/glz;->f(La/blz;)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, v0, La/lrd;->e:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object p1, p0, La/f5r;->i:La/lrd;

    .line 41
    .line 42
    return-void
.end method

.method public final r(La/xhe0;)Z
    .locals 0

    .line 1
    check-cast p1, La/m6r;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method

.method public final s(La/xhe0;)V
    .locals 0

    .line 1
    check-cast p1, La/m6r;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/f5r;->E(La/m6r;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/f5r;->C()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final u(La/xhe0;)V
    .locals 2

    .line 1
    check-cast p1, La/m6r;

    .line 2
    .line 3
    iget-object p1, p1, La/xhe0;->a:Landroid/view/View;

    .line 4
    .line 5
    check-cast p1, Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, La/f5r;->D(I)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0, v0, v1}, La/f5r;->F(J)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/f5r;->h:La/u710;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-virtual {p0, v0, v1}, La/u710;->g(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method
