.class public final Landroidx/fragment/app/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fhj;

.field public final b:La/pmi;

.field public final c:Landroidx/fragment/app/Fragment;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(La/fhj;La/pmi;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    const/4 v0, -0x1

    .line 73
    iput v0, p0, Landroidx/fragment/app/f;->e:I

    .line 74
    iput-object p1, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 75
    iput-object p2, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 76
    iput-object p3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    return-void
.end method

.method public constructor <init>(La/fhj;La/pmi;Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V
    .locals 2

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 78
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    const/4 v1, -0x1

    .line 79
    iput v1, p0, Landroidx/fragment/app/f;->e:I

    .line 80
    iput-object p1, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 81
    iput-object p2, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 82
    iput-object p3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    const/4 p0, 0x0

    .line 83
    iput-object p0, p3, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 84
    iput-object p0, p3, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 85
    iput v0, p3, Landroidx/fragment/app/Fragment;->u:I

    .line 86
    iput-boolean v0, p3, Landroidx/fragment/app/Fragment;->q:Z

    .line 87
    iput-boolean v0, p3, Landroidx/fragment/app/Fragment;->l:Z

    .line 88
    iget-object p1, p3, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    iput-object p1, p3, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 89
    iput-object p0, p3, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 90
    iput-object p4, p3, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 91
    const-string p0, "arguments"

    invoke-virtual {p4, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p0

    iput-object p0, p3, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(La/fhj;La/pmi;Ljava/lang/ClassLoader;La/m1r;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroidx/fragment/app/f;->e:I

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 11
    .line 12
    iput-object p2, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 13
    .line 14
    const-string p1, "state"

    .line 15
    .line 16
    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroidx/fragment/app/FragmentState;

    .line 21
    .line 22
    invoke-virtual {p1, p4}, Landroidx/fragment/app/FragmentState;->a(La/m1r;)Landroidx/fragment/app/Fragment;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 27
    .line 28
    iput-object p5, p1, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 29
    .line 30
    const-string p0, "arguments"

    .line 31
    .line 32
    invoke-virtual {p5, p0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x2

    .line 45
    invoke-static {p0}, Landroidx/fragment/app/e;->V(I)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_1

    .line 50
    .line 51
    new-instance p0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p2, "Instantiated fragment "

    .line 54
    .line 55
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "FragmentManager"

    .line 66
    .line 67
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "moveto ACTIVITY_CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 30
    .line 31
    const-string v4, "savedInstanceState"

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    move-object v1, v5

    .line 42
    :goto_0
    iget-object v6, v3, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 43
    .line 44
    invoke-virtual {v6}, Landroidx/fragment/app/e;->c0()V

    .line 45
    .line 46
    .line 47
    iput v0, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    iput-boolean v6, v3, Landroidx/fragment/app/Fragment;->j1:Z

    .line 51
    .line 52
    iget-object v7, v3, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 53
    .line 54
    new-instance v8, La/vwq;

    .line 55
    .line 56
    invoke-direct {v8, v3, v1}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    const-string v1, "Fragment#onActivityCreated"

    .line 60
    .line 61
    invoke-virtual {v7, v8, v1}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v1, v3, Landroidx/fragment/app/Fragment;->j1:Z

    .line 65
    .line 66
    const-string v8, "Fragment "

    .line 67
    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v1, "moveto RESTORE_VIEW_STATE: "

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    :cond_2
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 94
    .line 95
    if-eqz v0, :cond_6

    .line 96
    .line 97
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v0, v5

    .line 107
    :goto_1
    iget-object v1, v3, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    iget-object v2, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 112
    .line 113
    invoke-virtual {v2, v1}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 114
    .line 115
    .line 116
    iput-object v5, v3, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 117
    .line 118
    :cond_4
    iput-boolean v6, v3, Landroidx/fragment/app/Fragment;->j1:Z

    .line 119
    .line 120
    new-instance v1, La/wwq;

    .line 121
    .line 122
    const/4 v2, 0x2

    .line 123
    invoke-direct {v1, v3, v0, v2}, La/wwq;-><init>(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;B)V

    .line 124
    .line 125
    .line 126
    const-string v0, "Fragment#onViewStateRestored"

    .line 127
    .line 128
    invoke-virtual {v7, v1, v0}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-boolean v0, v3, Landroidx/fragment/app/Fragment;->j1:Z

    .line 132
    .line 133
    if-eqz v0, :cond_5

    .line 134
    .line 135
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    new-instance v0, La/vwq;

    .line 140
    .line 141
    const/16 v1, 0xe

    .line 142
    .line 143
    invoke-direct {v0, v3, v1}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 144
    .line 145
    .line 146
    const-string v1, "FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)"

    .line 147
    .line 148
    invoke-virtual {v7, v0, v1}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_5
    new-instance p0, La/iin0;

    .line 153
    .line 154
    const-string v0, " did not call through to super.onViewStateRestored()"

    .line 155
    .line 156
    invoke-static {v8, v3, v0}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_6
    :goto_2
    iput-object v5, v3, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 165
    .line 166
    iget-object v0, v3, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 167
    .line 168
    iput-boolean v6, v0, Landroidx/fragment/app/e;->I:Z

    .line 169
    .line 170
    iput-boolean v6, v0, Landroidx/fragment/app/e;->J:Z

    .line 171
    .line 172
    iget-object v1, v0, Landroidx/fragment/app/e;->P:La/w1r;

    .line 173
    .line 174
    iput-boolean v6, v1, La/w1r;->g:Z

    .line 175
    .line 176
    const/4 v1, 0x4

    .line 177
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->x(I)V

    .line 178
    .line 179
    .line 180
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 181
    .line 182
    invoke-virtual {p0, v3, v6}, La/fhj;->b(Landroidx/fragment/app/Fragment;Z)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_7
    new-instance p0, La/iin0;

    .line 187
    .line 188
    const-string v0, " did not call through to super.onActivityCreated()"

    .line 189
    .line 190
    invoke-static {v8, v3, v0}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/fragment/app/e;->L(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-eq v1, v2, :cond_0

    .line 14
    .line 15
    iget v2, v0, Landroidx/fragment/app/Fragment;->A:I

    .line 16
    .line 17
    sget-object v3, La/k5r;->a:La/j5r;

    .line 18
    .line 19
    new-instance v3, La/nrv0;

    .line 20
    .line 21
    new-instance v4, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v5, "Attempting to nest fragment "

    .line 24
    .line 25
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v5, " within the view of parent fragment "

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, " via container with ID "

    .line 40
    .line 41
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, " without using parent\'s childFragmentManager"

    .line 45
    .line 46
    invoke-static {v2, v1, v4}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v3, v0, v1}, La/wmu0;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, La/k5r;->c(La/wmu0;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, La/k5r;->a(Landroidx/fragment/app/Fragment;)La/j5r;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iget-object v2, v1, La/j5r;->a:Ljava/util/Set;

    .line 61
    .line 62
    sget-object v4, La/i5r;->e:La/i5r;

    .line 63
    .line 64
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_0

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-class v4, La/nrv0;

    .line 75
    .line 76
    invoke-static {v1, v2, v4}, La/k5r;->e(La/j5r;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_0

    .line 81
    .line 82
    invoke-static {v1, v3}, La/k5r;->b(La/j5r;La/wmu0;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object p0, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 86
    .line 87
    iget-object p0, p0, La/pmi;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ljava/util/ArrayList;

    .line 90
    .line 91
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 92
    .line 93
    const/4 v2, -0x1

    .line 94
    if-nez v1, :cond_1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_1
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    add-int/lit8 v4, v3, -0x1

    .line 102
    .line 103
    :goto_0
    if-ltz v4, :cond_3

    .line 104
    .line 105
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 110
    .line 111
    iget-object v6, v5, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 112
    .line 113
    if-ne v6, v1, :cond_2

    .line 114
    .line 115
    iget-object v5, v5, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 116
    .line 117
    if-eqz v5, :cond_2

    .line 118
    .line 119
    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    add-int/lit8 v2, p0, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    add-int/lit8 v4, v4, -0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-ge v3, v4, :cond_5

    .line 136
    .line 137
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 142
    .line 143
    iget-object v5, v4, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 144
    .line 145
    if-ne v5, v1, :cond_4

    .line 146
    .line 147
    iget-object v4, v4, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 148
    .line 149
    if-eqz v4, :cond_4

    .line 150
    .line 151
    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 152
    .line 153
    .line 154
    move-result v2

    .line 155
    goto :goto_2

    .line 156
    :cond_4
    goto :goto_1

    .line 157
    :cond_5
    :goto_2
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 158
    .line 159
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 160
    .line 161
    invoke-virtual {p0, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 162
    .line 163
    .line 164
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const-string v3, " that does not belong to this FragmentManager!"

    .line 33
    .line 34
    const-string v4, " declared target fragment "

    .line 35
    .line 36
    iget-object v5, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 37
    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, v5, La/pmi;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Landroidx/fragment/app/f;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 57
    .line 58
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v3, v1, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v2, v1, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 63
    .line 64
    move-object v2, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 77
    .line 78
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_2
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v2, v5, La/pmi;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v2, v0

    .line 108
    check-cast v2, Landroidx/fragment/app/f;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 114
    .line 115
    invoke-direct {p0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {p0, v0, v3}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 135
    .line 136
    invoke-virtual {v2}, Landroidx/fragment/app/f;->k()V

    .line 137
    .line 138
    .line 139
    :cond_5
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/e;

    .line 140
    .line 141
    iget-object v2, v0, Landroidx/fragment/app/e;->x:La/jxq;

    .line 142
    .line 143
    iput-object v2, v1, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 144
    .line 145
    iget-object v0, v0, Landroidx/fragment/app/e;->z:Landroidx/fragment/app/Fragment;

    .line 146
    .line 147
    iput-object v0, v1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 148
    .line 149
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    invoke-virtual {p0, v1, v0}, La/fhj;->h(Landroidx/fragment/app/Fragment;Z)V

    .line 153
    .line 154
    .line 155
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->D1:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_6

    .line 166
    .line 167
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    check-cast v4, La/dxq;

    .line 172
    .line 173
    invoke-virtual {v4}, La/dxq;->a()V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_6
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 178
    .line 179
    .line 180
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 181
    .line 182
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 183
    .line 184
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->y()La/vbc;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    invoke-virtual {v2, v3, v4, v1}, Landroidx/fragment/app/e;->b(La/jxq;La/vbc;Landroidx/fragment/app/Fragment;)V

    .line 189
    .line 190
    .line 191
    iput v0, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 192
    .line 193
    iput-boolean v0, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 194
    .line 195
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 196
    .line 197
    new-instance v3, La/vwq;

    .line 198
    .line 199
    const/16 v4, 0x14

    .line 200
    .line 201
    invoke-direct {v3, v1, v4}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 202
    .line 203
    .line 204
    const-string v4, "Fragment#onAttach"

    .line 205
    .line 206
    invoke-virtual {v2, v3, v4}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    iget-boolean v2, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 210
    .line 211
    if-eqz v2, :cond_8

    .line 212
    .line 213
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/e;

    .line 214
    .line 215
    iget-object v3, v2, Landroidx/fragment/app/e;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 216
    .line 217
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_7

    .line 226
    .line 227
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, La/h2r;

    .line 232
    .line 233
    invoke-interface {v4, v2, v1}, La/h2r;->a(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_7
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 238
    .line 239
    iput-boolean v0, v2, Landroidx/fragment/app/e;->I:Z

    .line 240
    .line 241
    iput-boolean v0, v2, Landroidx/fragment/app/e;->J:Z

    .line 242
    .line 243
    iget-object v3, v2, Landroidx/fragment/app/e;->P:La/w1r;

    .line 244
    .line 245
    iput-boolean v0, v3, La/w1r;->g:Z

    .line 246
    .line 247
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->x(I)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0, v1, v0}, La/fhj;->c(Landroidx/fragment/app/Fragment;Z)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_8
    new-instance p0, La/iin0;

    .line 255
    .line 256
    const-string v0, " did not call through to super.onAttach()"

    .line 257
    .line 258
    invoke-static {v6, v1, v0}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw p0
.end method

.method public final d()I
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/e;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget p0, v0, Landroidx/fragment/app/Fragment;->a:I

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    iget v1, p0, Landroidx/fragment/app/f;->e:I

    .line 11
    .line 12
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->t1:La/lkz;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x5

    .line 19
    const/4 v4, -0x1

    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x4

    .line 22
    const/4 v7, 0x2

    .line 23
    const/4 v8, 0x1

    .line 24
    if-eq v2, v8, :cond_3

    .line 25
    .line 26
    if-eq v2, v7, :cond_2

    .line 27
    .line 28
    if-eq v2, v5, :cond_1

    .line 29
    .line 30
    if-eq v2, v6, :cond_4

    .line 31
    .line 32
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const/4 v2, 0x0

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->p:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->q:Z

    .line 57
    .line 58
    iget p0, p0, Landroidx/fragment/app/f;->e:I

    .line 59
    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-static {p0, v7}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 67
    .line 68
    if-eqz p0, :cond_7

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-nez p0, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    if-ge p0, v6, :cond_6

    .line 82
    .line 83
    iget p0, v0, Landroidx/fragment/app/Fragment;->a:I

    .line 84
    .line 85
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    goto :goto_1

    .line 90
    :cond_6
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    :cond_7
    :goto_1
    iget-boolean p0, v0, Landroidx/fragment/app/Fragment;->r:Z

    .line 95
    .line 96
    if-eqz p0, :cond_8

    .line 97
    .line 98
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 99
    .line 100
    if-nez p0, :cond_8

    .line 101
    .line 102
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    :cond_8
    iget-boolean p0, v0, Landroidx/fragment/app/Fragment;->l:Z

    .line 107
    .line 108
    if-nez p0, :cond_9

    .line 109
    .line 110
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    :cond_9
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    if-eqz p0, :cond_d

    .line 118
    .line 119
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-static {p0, v9}, La/nxj;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)La/nxj;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0, v0}, La/nxj;->f(Landroidx/fragment/app/Fragment;)La/rnk0;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    if-eqz v9, :cond_a

    .line 132
    .line 133
    iget-object v9, v9, La/rnk0;->b:La/snk0;

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_a
    move-object v9, v2

    .line 137
    :goto_2
    invoke-virtual {p0, v0}, La/nxj;->g(Landroidx/fragment/app/Fragment;)La/rnk0;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    if-eqz p0, :cond_b

    .line 142
    .line 143
    iget-object v2, p0, La/rnk0;->b:La/snk0;

    .line 144
    .line 145
    :cond_b
    if-nez v9, :cond_c

    .line 146
    .line 147
    move p0, v4

    .line 148
    goto :goto_3

    .line 149
    :cond_c
    sget-object p0, La/unk0;->a:[I

    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    aget p0, p0, v10

    .line 156
    .line 157
    :goto_3
    if-eq p0, v4, :cond_d

    .line 158
    .line 159
    if-eq p0, v8, :cond_d

    .line 160
    .line 161
    move-object v2, v9

    .line 162
    :cond_d
    sget-object p0, La/snk0;->b:La/snk0;

    .line 163
    .line 164
    if-ne v2, p0, :cond_e

    .line 165
    .line 166
    const/4 p0, 0x6

    .line 167
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    goto :goto_4

    .line 172
    :cond_e
    sget-object p0, La/snk0;->c:La/snk0;

    .line 173
    .line 174
    if-ne v2, p0, :cond_f

    .line 175
    .line 176
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    goto :goto_4

    .line 181
    :cond_f
    iget-boolean p0, v0, Landroidx/fragment/app/Fragment;->m:Z

    .line 182
    .line 183
    if-eqz p0, :cond_11

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->P()Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-eqz p0, :cond_10

    .line 190
    .line 191
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    goto :goto_4

    .line 196
    :cond_10
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    :cond_11
    :goto_4
    iget-boolean p0, v0, Landroidx/fragment/app/Fragment;->m1:Z

    .line 201
    .line 202
    if-eqz p0, :cond_12

    .line 203
    .line 204
    iget p0, v0, Landroidx/fragment/app/Fragment;->a:I

    .line 205
    .line 206
    if-ge p0, v3, :cond_12

    .line 207
    .line 208
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    :cond_12
    iget-boolean p0, v0, Landroidx/fragment/app/Fragment;->n:Z

    .line 213
    .line 214
    if-eqz p0, :cond_13

    .line 215
    .line 216
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :cond_13
    invoke-static {v7}, Landroidx/fragment/app/e;->V(I)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-eqz p0, :cond_14

    .line 225
    .line 226
    new-instance p0, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v2, "computeExpectedState() of "

    .line 229
    .line 230
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v2, " for "

    .line 237
    .line 238
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    const-string v0, "FragmentManager"

    .line 249
    .line 250
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    :cond_14
    return v1
.end method

.method public final e()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "moveto CREATED: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v3, "savedInstanceState"

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    :goto_0
    iget-boolean v3, v2, Landroidx/fragment/app/Fragment;->r1:Z

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    const/4 v5, 0x0

    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 48
    .line 49
    invoke-virtual {p0, v2, v5}, La/fhj;->i(Landroidx/fragment/app/Fragment;Z)V

    .line 50
    .line 51
    .line 52
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 53
    .line 54
    invoke-virtual {v3}, Landroidx/fragment/app/e;->c0()V

    .line 55
    .line 56
    .line 57
    iput v4, v2, Landroidx/fragment/app/Fragment;->a:I

    .line 58
    .line 59
    iput-boolean v5, v2, Landroidx/fragment/app/Fragment;->j1:Z

    .line 60
    .line 61
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 62
    .line 63
    new-instance v6, La/ige0;

    .line 64
    .line 65
    invoke-direct {v6, v2, v0}, La/ige0;-><init>(Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v6}, La/glz;->a(La/blz;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 72
    .line 73
    new-instance v3, La/wwq;

    .line 74
    .line 75
    invoke-direct {v3, v2, v1, v4}, La/wwq;-><init>(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;B)V

    .line 76
    .line 77
    .line 78
    const-string v1, "Fragment#onCreate"

    .line 79
    .line 80
    invoke-virtual {v0, v3, v1}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iput-boolean v4, v2, Landroidx/fragment/app/Fragment;->r1:Z

    .line 84
    .line 85
    iget-boolean v1, v2, Landroidx/fragment/app/Fragment;->j1:Z

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    new-instance v1, La/vwq;

    .line 90
    .line 91
    const/16 v3, 0xc

    .line 92
    .line 93
    invoke-direct {v1, v2, v3}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 94
    .line 95
    .line 96
    const-string v3, "FragmentLifecycle#handleLifecycleEvent(ON_CREATE)"

    .line 97
    .line 98
    invoke-virtual {v0, v1, v3}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v2, v5}, La/fhj;->d(Landroidx/fragment/app/Fragment;Z)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_2
    new-instance p0, La/iin0;

    .line 106
    .line 107
    const-string v0, "Fragment "

    .line 108
    .line 109
    const-string v1, " did not call through to super.onCreate()"

    .line 110
    .line 111
    invoke-static {v0, v2, v1}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :cond_3
    iput v4, v2, Landroidx/fragment/app/Fragment;->a:I

    .line 120
    .line 121
    iget-object p0, v2, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 122
    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    const-string v0, "childFragmentManager"

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_4

    .line 132
    .line 133
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Landroidx/fragment/app/e;->o0(Landroid/os/Bundle;)V

    .line 136
    .line 137
    .line 138
    iget-object p0, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 139
    .line 140
    iput-boolean v5, p0, Landroidx/fragment/app/e;->I:Z

    .line 141
    .line 142
    iput-boolean v5, p0, Landroidx/fragment/app/e;->J:Z

    .line 143
    .line 144
    iget-object v0, p0, Landroidx/fragment/app/e;->P:La/w1r;

    .line 145
    .line 146
    iput-boolean v5, v0, La/w1r;->g:Z

    .line 147
    .line 148
    invoke-virtual {p0, v4}, Landroidx/fragment/app/e;->x(I)V

    .line 149
    .line 150
    .line 151
    :cond_4
    return-void
.end method

.method public final f()V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->p:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, "FragmentManager"

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v4, "moveto CREATE_VIEW: "

    .line 20
    .line 21
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 35
    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    const-string v5, "savedInstanceState"

    .line 40
    .line 41
    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v2, v4

    .line 47
    :goto_0
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->b0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iput-object v5, v0, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 52
    .line 53
    iget-object v6, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 54
    .line 55
    if-eqz v6, :cond_3

    .line 56
    .line 57
    move-object v4, v6

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_3
    iget v6, v0, Landroidx/fragment/app/Fragment;->A:I

    .line 61
    .line 62
    if-eqz v6, :cond_7

    .line 63
    .line 64
    const/4 v4, -0x1

    .line 65
    if-eq v6, v4, :cond_6

    .line 66
    .line 67
    iget-object v4, v0, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/e;

    .line 68
    .line 69
    iget-object v4, v4, Landroidx/fragment/app/e;->y:La/vbc;

    .line 70
    .line 71
    invoke-virtual {v4, v6}, La/vbc;->b0(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Landroid/view/ViewGroup;

    .line 76
    .line 77
    if-nez v4, :cond_5

    .line 78
    .line 79
    iget-boolean v6, v0, Landroidx/fragment/app/Fragment;->s:Z

    .line 80
    .line 81
    if-nez v6, :cond_7

    .line 82
    .line 83
    iget-boolean v6, v0, Landroidx/fragment/app/Fragment;->r:Z

    .line 84
    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    iget v1, v0, Landroidx/fragment/app/Fragment;->A:I

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    goto :goto_1

    .line 100
    :catch_0
    const-string p0, "unknown"

    .line 101
    .line 102
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    iget v2, v0, Landroidx/fragment/app/Fragment;->A:I

    .line 105
    .line 106
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    new-instance v3, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v4, "No view found for id 0x"

    .line 113
    .line 114
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v2, " ("

    .line 121
    .line 122
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p0, ") for fragment "

    .line 129
    .line 130
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v1

    .line 144
    :cond_5
    instance-of v6, v4, Landroidx/fragment/app/FragmentContainerView;

    .line 145
    .line 146
    if-nez v6, :cond_7

    .line 147
    .line 148
    sget-object v6, La/k5r;->a:La/j5r;

    .line 149
    .line 150
    new-instance v6, La/mrv0;

    .line 151
    .line 152
    new-instance v7, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v8, "Attempting to add fragment "

    .line 155
    .line 156
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v8, " to container "

    .line 163
    .line 164
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v8, " which is not a FragmentContainerView"

    .line 171
    .line 172
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-direct {v6, v0, v7}, La/wmu0;-><init>(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v6}, La/k5r;->c(La/wmu0;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, La/k5r;->a(Landroidx/fragment/app/Fragment;)La/j5r;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    iget-object v8, v7, La/j5r;->a:Ljava/util/Set;

    .line 190
    .line 191
    sget-object v9, La/i5r;->g:La/i5r;

    .line 192
    .line 193
    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-eqz v8, :cond_7

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    const-class v9, La/mrv0;

    .line 204
    .line 205
    invoke-static {v7, v8, v9}, La/k5r;->e(La/j5r;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    if-eqz v8, :cond_7

    .line 210
    .line 211
    invoke-static {v7, v6}, La/k5r;->b(La/j5r;La/wmu0;)V

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_6
    const-string p0, "Cannot create fragment "

    .line 216
    .line 217
    const-string v1, " for a container view with no id"

    .line 218
    .line 219
    invoke-static {p0, v0, v1}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_7
    :goto_2
    iput-object v4, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 228
    .line 229
    invoke-virtual {v0, v5, v4, v2}, Landroidx/fragment/app/Fragment;->k0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 230
    .line 231
    .line 232
    iget-object v5, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 233
    .line 234
    const/4 v6, 0x2

    .line 235
    if-eqz v5, :cond_d

    .line 236
    .line 237
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-eqz v1, :cond_8

    .line 242
    .line 243
    new-instance v1, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v5, "moveto VIEW_CREATED: "

    .line 246
    .line 247
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    :cond_8
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 261
    .line 262
    const/4 v5, 0x0

    .line 263
    invoke-virtual {v1, v5}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 264
    .line 265
    .line 266
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 267
    .line 268
    const v7, 0x7f0a0611

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v7, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    if-eqz v4, :cond_9

    .line 275
    .line 276
    invoke-virtual {p0}, Landroidx/fragment/app/f;->b()V

    .line 277
    .line 278
    .line 279
    :cond_9
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->Y:Z

    .line 280
    .line 281
    if-eqz v1, :cond_a

    .line 282
    .line 283
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 284
    .line 285
    const/16 v4, 0x8

    .line 286
    .line 287
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 288
    .line 289
    .line 290
    :cond_a
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 291
    .line 292
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    iget-object v4, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 297
    .line 298
    if-eqz v1, :cond_b

    .line 299
    .line 300
    sget-object v1, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 301
    .line 302
    invoke-virtual {v4}, Landroid/view/View;->requestApplyInsets()V

    .line 303
    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_b
    new-instance v1, La/bc0;

    .line 307
    .line 308
    const/4 v7, 0x6

    .line 309
    invoke-direct {v1, v4, v7}, La/bc0;-><init>(Ljava/lang/Object;B)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 313
    .line 314
    .line 315
    :goto_3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->l0()V

    .line 316
    .line 317
    .line 318
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 319
    .line 320
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 321
    .line 322
    invoke-virtual {p0, v0, v1, v2, v5}, La/fhj;->n(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 323
    .line 324
    .line 325
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 326
    .line 327
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 328
    .line 329
    .line 330
    move-result p0

    .line 331
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 332
    .line 333
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->A()La/cxq;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    iput v1, v2, La/cxq;->j:F

    .line 342
    .line 343
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 344
    .line 345
    if-eqz v1, :cond_d

    .line 346
    .line 347
    if-nez p0, :cond_d

    .line 348
    .line 349
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 350
    .line 351
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    if-eqz p0, :cond_c

    .line 356
    .line 357
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->A()La/cxq;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    iput-object p0, v1, La/cxq;->k:Landroid/view/View;

    .line 362
    .line 363
    invoke-static {v6}, Landroidx/fragment/app/e;->V(I)Z

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    if-eqz v1, :cond_c

    .line 368
    .line 369
    new-instance v1, Ljava/lang/StringBuilder;

    .line 370
    .line 371
    const-string v2, "requestFocus: Saved focused view "

    .line 372
    .line 373
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string p0, " for Fragment "

    .line 380
    .line 381
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 392
    .line 393
    .line 394
    :cond_c
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 395
    .line 396
    const/4 v1, 0x0

    .line 397
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 398
    .line 399
    .line 400
    :cond_d
    iput v6, v0, Landroidx/fragment/app/Fragment;->a:I

    .line 401
    .line 402
    return-void
.end method

.method public final g()V
    .locals 10

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "movefrom CREATED: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v3, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v1, v2, Landroidx/fragment/app/Fragment;->m:Z

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->P()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    move v1, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v1, v4

    .line 44
    :goto_0
    const/4 v5, 0x0

    .line 45
    iget-object v6, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-boolean v7, v2, Landroidx/fragment/app/Fragment;->o:Z

    .line 50
    .line 51
    if-nez v7, :cond_2

    .line 52
    .line 53
    iget-object v7, v2, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v6, v5, v7}, La/pmi;->G(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 56
    .line 57
    .line 58
    :cond_2
    if-nez v1, :cond_7

    .line 59
    .line 60
    iget-object v7, v6, La/pmi;->e:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v7, La/w1r;

    .line 63
    .line 64
    iget-object v8, v7, La/w1r;->b:Ljava/util/HashMap;

    .line 65
    .line 66
    iget-object v9, v2, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    if-nez v8, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    iget-boolean v8, v7, La/w1r;->e:Z

    .line 76
    .line 77
    if-eqz v8, :cond_4

    .line 78
    .line 79
    iget-boolean v7, v7, La/w1r;->f:Z

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    :goto_1
    move v7, v3

    .line 83
    :goto_2
    if-eqz v7, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    iget-object p0, v2, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 87
    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    invoke-virtual {v6, p0}, La/pmi;->j(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_6

    .line 95
    .line 96
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->f1:Z

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iput-object p0, v2, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 101
    .line 102
    :cond_6
    iput v4, v2, Landroidx/fragment/app/Fragment;->a:I

    .line 103
    .line 104
    return-void

    .line 105
    :cond_7
    :goto_3
    iget-object v7, v2, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 106
    .line 107
    if-eqz v7, :cond_8

    .line 108
    .line 109
    iget-object v3, v6, La/pmi;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, La/w1r;

    .line 112
    .line 113
    iget-boolean v3, v3, La/w1r;->f:Z

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_8
    iget-object v7, v7, La/jxq;->b:Landroid/content/Context;

    .line 117
    .line 118
    instance-of v8, v7, Landroid/app/Activity;

    .line 119
    .line 120
    if-eqz v8, :cond_9

    .line 121
    .line 122
    check-cast v7, Landroid/app/Activity;

    .line 123
    .line 124
    invoke-virtual {v7}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    xor-int/2addr v3, v7

    .line 129
    :cond_9
    :goto_4
    if-eqz v1, :cond_a

    .line 130
    .line 131
    iget-boolean v1, v2, Landroidx/fragment/app/Fragment;->o:Z

    .line 132
    .line 133
    if-eqz v1, :cond_b

    .line 134
    .line 135
    :cond_a
    if-eqz v3, :cond_c

    .line 136
    .line 137
    :cond_b
    iget-object v1, v6, La/pmi;->e:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, La/w1r;

    .line 140
    .line 141
    invoke-virtual {v1, v2, v4}, La/w1r;->x(Landroidx/fragment/app/Fragment;Z)V

    .line 142
    .line 143
    .line 144
    :cond_c
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 145
    .line 146
    invoke-virtual {v1}, Landroidx/fragment/app/e;->o()V

    .line 147
    .line 148
    .line 149
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 150
    .line 151
    new-instance v3, La/vwq;

    .line 152
    .line 153
    invoke-direct {v3, v2, v0}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 154
    .line 155
    .line 156
    const-string v0, "FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)"

    .line 157
    .line 158
    invoke-virtual {v1, v3, v0}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    iput v4, v2, Landroidx/fragment/app/Fragment;->a:I

    .line 162
    .line 163
    iput-boolean v4, v2, Landroidx/fragment/app/Fragment;->j1:Z

    .line 164
    .line 165
    iput-boolean v4, v2, Landroidx/fragment/app/Fragment;->r1:Z

    .line 166
    .line 167
    new-instance v0, La/vwq;

    .line 168
    .line 169
    const/4 v3, 0x4

    .line 170
    invoke-direct {v0, v2, v3}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 171
    .line 172
    .line 173
    const-string v3, "Fragment#onDestroy"

    .line 174
    .line 175
    invoke-virtual {v1, v0, v3}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-boolean v0, v2, Landroidx/fragment/app/Fragment;->j1:Z

    .line 179
    .line 180
    if-eqz v0, :cond_10

    .line 181
    .line 182
    iget-object v0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 183
    .line 184
    invoke-virtual {v0, v2, v4}, La/fhj;->e(Landroidx/fragment/app/Fragment;Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6}, La/pmi;->m()Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    :cond_d
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_e

    .line 200
    .line 201
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Landroidx/fragment/app/f;

    .line 206
    .line 207
    if-eqz v1, :cond_d

    .line 208
    .line 209
    iget-object v1, v1, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 210
    .line 211
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 212
    .line 213
    iget-object v4, v1, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_d

    .line 220
    .line 221
    iput-object v2, v1, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 222
    .line 223
    iput-object v5, v1, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_e
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 227
    .line 228
    if-eqz v0, :cond_f

    .line 229
    .line 230
    invoke-virtual {v6, v0}, La/pmi;->j(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iput-object v0, v2, Landroidx/fragment/app/Fragment;->h:Landroidx/fragment/app/Fragment;

    .line 235
    .line 236
    :cond_f
    invoke-virtual {v6, p0}, La/pmi;->D(Landroidx/fragment/app/f;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_10
    new-instance p0, La/iin0;

    .line 241
    .line 242
    const-string v0, "Fragment "

    .line 243
    .line 244
    const-string v1, " did not call through to super.onDestroy()"

    .line 245
    .line 246
    invoke-static {v0, v2, v1}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw p0
.end method

.method public final h()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATE_VIEW: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 41
    .line 42
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->x(I)V

    .line 46
    .line 47
    .line 48
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 53
    .line 54
    invoke-virtual {v2}, La/n6r;->b()V

    .line 55
    .line 56
    .line 57
    iget-object v2, v2, La/n6r;->c:La/glz;

    .line 58
    .line 59
    iget-object v2, v2, La/glz;->i:La/lkz;

    .line 60
    .line 61
    sget-object v4, La/lkz;->c:La/lkz;

    .line 62
    .line 63
    invoke-virtual {v2, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-ltz v2, :cond_2

    .line 68
    .line 69
    new-instance v2, La/vwq;

    .line 70
    .line 71
    const/16 v4, 0x9

    .line 72
    .line 73
    invoke-direct {v2, v1, v4}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 74
    .line 75
    .line 76
    const-string v4, "FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v4}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    iput v3, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    iput-boolean v2, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 85
    .line 86
    new-instance v3, La/vwq;

    .line 87
    .line 88
    const/16 v4, 0xb

    .line 89
    .line 90
    invoke-direct {v3, v1, v4}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 91
    .line 92
    .line 93
    const-string v4, "Fragment#onDestroyView"

    .line 94
    .line 95
    invoke-virtual {v0, v3, v4}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-boolean v0, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-interface {v1}, La/riu0;->g()La/piu0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget-object v3, La/vbf;->b:La/vbf;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v4, La/h0q0;

    .line 115
    .line 116
    sget-object v5, La/rq00;->d:La/dzj;

    .line 117
    .line 118
    invoke-direct {v4, v0, v5, v3}, La/h0q0;-><init>(La/piu0;La/miu0;La/wbf;)V

    .line 119
    .line 120
    .line 121
    const-class v0, La/rq00;

    .line 122
    .line 123
    sget-object v3, La/sre0;->a:La/tre0;

    .line 124
    .line 125
    invoke-virtual {v3, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, La/ny9;->T(La/sgy;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 136
    .line 137
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v4, v0, v3}, La/h0q0;->t(La/sgy;Ljava/lang/String;)La/diu0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, La/rq00;

    .line 146
    .line 147
    iget-object v0, v0, La/rq00;->b:La/gnk0;

    .line 148
    .line 149
    iget v3, v0, La/gnk0;->c:I

    .line 150
    .line 151
    move v4, v2

    .line 152
    :goto_0
    if-ge v4, v3, :cond_3

    .line 153
    .line 154
    invoke-virtual {v0, v4}, La/gnk0;->d(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, La/pq00;

    .line 159
    .line 160
    invoke-virtual {v5}, La/pq00;->m()V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_3
    iput-boolean v2, v1, Landroidx/fragment/app/Fragment;->t:Z

    .line 167
    .line 168
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 169
    .line 170
    invoke-virtual {p0, v1, v2}, La/fhj;->o(Landroidx/fragment/app/Fragment;Z)V

    .line 171
    .line 172
    .line 173
    const/4 p0, 0x0

    .line 174
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 175
    .line 176
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 177
    .line 178
    iput-object p0, v1, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 179
    .line 180
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->x1:La/hy40;

    .line 181
    .line 182
    invoke-virtual {v0, p0}, La/wh00;->l(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    iput-boolean v2, v1, Landroidx/fragment/app/Fragment;->q:Z

    .line 186
    .line 187
    return-void

    .line 188
    :cond_4
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 189
    .line 190
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_5
    new-instance p0, La/iin0;

    .line 195
    .line 196
    const-string v0, "Fragment "

    .line 197
    .line 198
    const-string v2, " did not call through to super.onDestroyView()"

    .line 199
    .line 200
    invoke-static {v0, v1, v2}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p0
.end method

.method public final i()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "movefrom ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    iput v3, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    iput-boolean v4, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 36
    .line 37
    iget-object v5, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 38
    .line 39
    new-instance v6, La/vwq;

    .line 40
    .line 41
    const/4 v7, 0x5

    .line 42
    invoke-direct {v6, v1, v7}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 43
    .line 44
    .line 45
    const-string v7, "Fragment#onDetach"

    .line 46
    .line 47
    invoke-virtual {v5, v6, v7}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    iput-object v5, v1, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 52
    .line 53
    iget-boolean v6, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 54
    .line 55
    if-eqz v6, :cond_7

    .line 56
    .line 57
    iget-object v6, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 58
    .line 59
    iget-boolean v7, v6, Landroidx/fragment/app/e;->K:Z

    .line 60
    .line 61
    if-nez v7, :cond_1

    .line 62
    .line 63
    invoke-virtual {v6}, Landroidx/fragment/app/e;->o()V

    .line 64
    .line 65
    .line 66
    new-instance v6, La/v1r;

    .line 67
    .line 68
    invoke-direct {v6}, Landroidx/fragment/app/e;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v6, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 72
    .line 73
    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 74
    .line 75
    iget-object v6, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 76
    .line 77
    invoke-virtual {v1, v6, v4}, La/fhj;->f(Landroidx/fragment/app/Fragment;Z)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 81
    .line 82
    iput v3, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 83
    .line 84
    iput-object v5, v1, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 85
    .line 86
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->v1:La/fbv;

    .line 87
    .line 88
    iput-object v5, v1, La/fbv;->b:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 91
    .line 92
    iput-object v5, v1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 93
    .line 94
    iput-object v5, v1, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/e;

    .line 95
    .line 96
    iget-boolean v3, v1, Landroidx/fragment/app/Fragment;->m:Z

    .line 97
    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->P()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-nez v1, :cond_2

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 108
    .line 109
    iget-object v1, v1, La/pmi;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, La/w1r;

    .line 112
    .line 113
    iget-object v3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 114
    .line 115
    iget-object v4, v1, La/w1r;->b:Ljava/util/HashMap;

    .line 116
    .line 117
    iget-object v3, v3, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-nez v3, :cond_3

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_3
    iget-boolean v3, v1, La/w1r;->e:Z

    .line 127
    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    iget-boolean v1, v1, La/w1r;->f:Z

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_4
    :goto_0
    const/4 v1, 0x1

    .line 134
    :goto_1
    if-eqz v1, :cond_6

    .line 135
    .line 136
    :goto_2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    new-instance v0, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v1, "initState called for fragment: "

    .line 145
    .line 146
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    .line 160
    .line 161
    :cond_5
    iget-object p0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 162
    .line 163
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->M()V

    .line 164
    .line 165
    .line 166
    :cond_6
    return-void

    .line 167
    :cond_7
    new-instance p0, La/iin0;

    .line 168
    .line 169
    const-string v0, "Fragment "

    .line 170
    .line 171
    const-string v2, " did not call through to super.onDetach()"

    .line 172
    .line 173
    invoke-static {v0, v1, v2}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p0
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->p:Z

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->q:Z

    .line 8
    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    iget-boolean v1, v0, Landroidx/fragment/app/Fragment;->t:Z

    .line 12
    .line 13
    if-nez v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "moveto CREATE_VIEW: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "FragmentManager"

    .line 37
    .line 38
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const-string v3, "savedInstanceState"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object v1, v2

    .line 54
    :goto_0
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->b0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, v0, Landroidx/fragment/app/Fragment;->q1:Landroid/view/LayoutInflater;

    .line 59
    .line 60
    invoke-virtual {v0, v3, v2, v1}, Landroidx/fragment/app/Fragment;->k0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 64
    .line 65
    if-eqz v2, :cond_3

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    invoke-virtual {v2, v3}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 72
    .line 73
    const v4, 0x7f0a0611

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v2, v0, Landroidx/fragment/app/Fragment;->Y:Z

    .line 80
    .line 81
    if-eqz v2, :cond_2

    .line 82
    .line 83
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 84
    .line 85
    const/16 v4, 0x8

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->l0()V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 94
    .line 95
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 96
    .line 97
    invoke-virtual {p0, v0, v2, v1, v3}, La/fhj;->n(Landroidx/fragment/app/Fragment;Landroid/view/View;Landroid/os/Bundle;Z)V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x2

    .line 101
    iput p0, v0, Landroidx/fragment/app/Fragment;->a:I

    .line 102
    .line 103
    :cond_3
    return-void
.end method

.method public final k()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "FragmentManager"

    .line 5
    .line 6
    iget-object v3, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    new-instance p0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v0, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 19
    .line 20
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {v2, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    :try_start_0
    iput-boolean v4, p0, Landroidx/fragment/app/f;->d:Z

    .line 37
    .line 38
    move v5, v0

    .line 39
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/f;->d()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    iget v7, v3, Landroidx/fragment/app/Fragment;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    const/4 v8, 0x3

    .line 46
    iget-object v9, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 47
    .line 48
    if-eq v6, v7, :cond_b

    .line 49
    .line 50
    if-le v6, v7, :cond_4

    .line 51
    .line 52
    add-int/lit8 v7, v7, 0x1

    .line 53
    .line 54
    packed-switch v7, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/f;->n()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    .line 64
    :catchall_0
    move-exception v1

    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :pswitch_1
    const/4 v5, 0x6

    .line 68
    iput v5, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 69
    .line 70
    goto/16 :goto_2

    .line 71
    .line 72
    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/f;->q()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_2

    .line 76
    .line 77
    :pswitch_3
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 78
    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 82
    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v5, v6}, La/nxj;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)La/nxj;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-object v6, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 94
    .line 95
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    sget-object v7, La/tnk0;->a:La/cge0;

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v6}, La/cge0;->f(I)La/tnk0;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-eqz v7, :cond_2

    .line 113
    .line 114
    new-instance v7, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v8, "SpecialEffectsController: Enqueuing add operation for fragment "

    .line 117
    .line 118
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    invoke-static {v2, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    :cond_2
    sget-object v7, La/snk0;->b:La/snk0;

    .line 132
    .line 133
    invoke-virtual {v5, v6, v7, p0}, La/nxj;->d(La/tnk0;La/snk0;Landroidx/fragment/app/f;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    const/4 v5, 0x4

    .line 137
    iput v5, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 138
    .line 139
    goto/16 :goto_2

    .line 140
    .line 141
    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/f;->a()V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_2

    .line 145
    .line 146
    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/f;->j()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Landroidx/fragment/app/f;->f()V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_2

    .line 153
    .line 154
    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/f;->e()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_2

    .line 158
    .line 159
    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/f;->c()V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_2

    .line 163
    .line 164
    :cond_4
    add-int/lit8 v7, v7, -0x1

    .line 165
    .line 166
    packed-switch v7, :pswitch_data_1

    .line 167
    .line 168
    .line 169
    goto/16 :goto_2

    .line 170
    .line 171
    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/f;->l()V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_2

    .line 175
    .line 176
    :pswitch_9
    const/4 v5, 0x5

    .line 177
    iput v5, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 178
    .line 179
    goto/16 :goto_2

    .line 180
    .line 181
    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/f;->r()V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_2

    .line 185
    .line 186
    :pswitch_b
    invoke-static {v8}, Landroidx/fragment/app/e;->V(I)Z

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    if-eqz v5, :cond_5

    .line 191
    .line 192
    new-instance v5, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v6, "movefrom ACTIVITY_CREATED: "

    .line 198
    .line 199
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    .line 211
    .line 212
    :cond_5
    iget-boolean v5, v3, Landroidx/fragment/app/Fragment;->o:Z

    .line 213
    .line 214
    if-eqz v5, :cond_6

    .line 215
    .line 216
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {p0}, Landroidx/fragment/app/f;->o()Landroid/os/Bundle;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v9, v6, v5}, La/pmi;->G(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 223
    .line 224
    .line 225
    goto :goto_1

    .line 226
    :cond_6
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 227
    .line 228
    if-eqz v5, :cond_7

    .line 229
    .line 230
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 231
    .line 232
    if-nez v5, :cond_7

    .line 233
    .line 234
    invoke-virtual {p0}, Landroidx/fragment/app/f;->p()V

    .line 235
    .line 236
    .line 237
    :cond_7
    :goto_1
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 238
    .line 239
    if-eqz v5, :cond_9

    .line 240
    .line 241
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 242
    .line 243
    if-eqz v5, :cond_9

    .line 244
    .line 245
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-static {v5, v6}, La/nxj;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)La/nxj;

    .line 250
    .line 251
    .line 252
    move-result-object v5

    .line 253
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-eqz v6, :cond_8

    .line 258
    .line 259
    new-instance v6, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v7, "SpecialEffectsController: Enqueuing remove operation for fragment "

    .line 262
    .line 263
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-static {v2, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    :cond_8
    sget-object v6, La/tnk0;->b:La/tnk0;

    .line 277
    .line 278
    sget-object v7, La/snk0;->c:La/snk0;

    .line 279
    .line 280
    invoke-virtual {v5, v6, v7, p0}, La/nxj;->d(La/tnk0;La/snk0;Landroidx/fragment/app/f;)V

    .line 281
    .line 282
    .line 283
    :cond_9
    iput v8, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 284
    .line 285
    goto :goto_2

    .line 286
    :pswitch_c
    iput-boolean v0, v3, Landroidx/fragment/app/Fragment;->q:Z

    .line 287
    .line 288
    iput v1, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 289
    .line 290
    goto :goto_2

    .line 291
    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/f;->h()V

    .line 292
    .line 293
    .line 294
    iput v4, v3, Landroidx/fragment/app/Fragment;->a:I

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :pswitch_e
    iget-boolean v5, v3, Landroidx/fragment/app/Fragment;->o:Z

    .line 298
    .line 299
    if-eqz v5, :cond_a

    .line 300
    .line 301
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 302
    .line 303
    iget-object v6, v9, La/pmi;->d:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v6, Ljava/util/HashMap;

    .line 306
    .line 307
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    check-cast v5, Landroid/os/Bundle;

    .line 312
    .line 313
    if-nez v5, :cond_a

    .line 314
    .line 315
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 316
    .line 317
    invoke-virtual {p0}, Landroidx/fragment/app/f;->o()Landroid/os/Bundle;

    .line 318
    .line 319
    .line 320
    move-result-object v6

    .line 321
    invoke-virtual {v9, v6, v5}, La/pmi;->G(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 322
    .line 323
    .line 324
    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/f;->g()V

    .line 325
    .line 326
    .line 327
    goto :goto_2

    .line 328
    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/f;->i()V

    .line 329
    .line 330
    .line 331
    :goto_2
    move v5, v4

    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :cond_b
    if-nez v5, :cond_e

    .line 335
    .line 336
    const/4 v5, -0x1

    .line 337
    if-ne v7, v5, :cond_e

    .line 338
    .line 339
    iget-boolean v5, v3, Landroidx/fragment/app/Fragment;->m:Z

    .line 340
    .line 341
    if-eqz v5, :cond_e

    .line 342
    .line 343
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->P()Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-nez v5, :cond_e

    .line 348
    .line 349
    iget-boolean v5, v3, Landroidx/fragment/app/Fragment;->o:Z

    .line 350
    .line 351
    if-nez v5, :cond_e

    .line 352
    .line 353
    invoke-static {v8}, Landroidx/fragment/app/e;->V(I)Z

    .line 354
    .line 355
    .line 356
    move-result v5

    .line 357
    if-eqz v5, :cond_c

    .line 358
    .line 359
    new-instance v5, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    const-string v6, "Cleaning up state of never attached fragment: "

    .line 365
    .line 366
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    .line 378
    .line 379
    :cond_c
    iget-object v5, v9, La/pmi;->e:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v5, La/w1r;

    .line 382
    .line 383
    invoke-virtual {v5, v3, v4}, La/w1r;->x(Landroidx/fragment/app/Fragment;Z)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v9, p0}, La/pmi;->D(Landroidx/fragment/app/f;)V

    .line 387
    .line 388
    .line 389
    invoke-static {v8}, Landroidx/fragment/app/e;->V(I)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_d

    .line 394
    .line 395
    new-instance v5, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 398
    .line 399
    .line 400
    const-string v6, "initState called for fragment: "

    .line 401
    .line 402
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-static {v2, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 413
    .line 414
    .line 415
    :cond_d
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->M()V

    .line 416
    .line 417
    .line 418
    :cond_e
    iget-boolean v5, v3, Landroidx/fragment/app/Fragment;->p1:Z

    .line 419
    .line 420
    if-eqz v5, :cond_14

    .line 421
    .line 422
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 423
    .line 424
    if-eqz v5, :cond_12

    .line 425
    .line 426
    iget-object v5, v3, Landroidx/fragment/app/Fragment;->k1:Landroid/view/ViewGroup;

    .line 427
    .line 428
    if-eqz v5, :cond_12

    .line 429
    .line 430
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 431
    .line 432
    .line 433
    move-result-object v6

    .line 434
    invoke-static {v5, v6}, La/nxj;->i(Landroid/view/ViewGroup;Landroidx/fragment/app/e;)La/nxj;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    iget-boolean v6, v3, Landroidx/fragment/app/Fragment;->Y:Z

    .line 439
    .line 440
    if-eqz v6, :cond_10

    .line 441
    .line 442
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_f

    .line 447
    .line 448
    new-instance v1, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    .line 451
    .line 452
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 463
    .line 464
    .line 465
    :cond_f
    sget-object v1, La/tnk0;->d:La/tnk0;

    .line 466
    .line 467
    sget-object v2, La/snk0;->a:La/snk0;

    .line 468
    .line 469
    invoke-virtual {v5, v1, v2, p0}, La/nxj;->d(La/tnk0;La/snk0;Landroidx/fragment/app/f;)V

    .line 470
    .line 471
    .line 472
    goto :goto_3

    .line 473
    :cond_10
    invoke-static {v1}, Landroidx/fragment/app/e;->V(I)Z

    .line 474
    .line 475
    .line 476
    move-result v1

    .line 477
    if-eqz v1, :cond_11

    .line 478
    .line 479
    new-instance v1, Ljava/lang/StringBuilder;

    .line 480
    .line 481
    const-string v6, "SpecialEffectsController: Enqueuing show operation for fragment "

    .line 482
    .line 483
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    :cond_11
    sget-object v1, La/tnk0;->c:La/tnk0;

    .line 497
    .line 498
    sget-object v2, La/snk0;->a:La/snk0;

    .line 499
    .line 500
    invoke-virtual {v5, v1, v2, p0}, La/nxj;->d(La/tnk0;La/snk0;Landroidx/fragment/app/f;)V

    .line 501
    .line 502
    .line 503
    :cond_12
    :goto_3
    iget-object v1, v3, Landroidx/fragment/app/Fragment;->v:Landroidx/fragment/app/e;

    .line 504
    .line 505
    if-eqz v1, :cond_13

    .line 506
    .line 507
    iget-boolean v2, v3, Landroidx/fragment/app/Fragment;->l:Z

    .line 508
    .line 509
    if-eqz v2, :cond_13

    .line 510
    .line 511
    invoke-static {v3}, Landroidx/fragment/app/e;->W(Landroidx/fragment/app/Fragment;)Z

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    if-eqz v2, :cond_13

    .line 516
    .line 517
    iput-boolean v4, v1, Landroidx/fragment/app/e;->H:Z

    .line 518
    .line 519
    :cond_13
    iput-boolean v0, v3, Landroidx/fragment/app/Fragment;->p1:Z

    .line 520
    .line 521
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->c0()V

    .line 522
    .line 523
    .line 524
    iget-object v1, v3, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 525
    .line 526
    invoke-virtual {v1}, Landroidx/fragment/app/e;->r()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 527
    .line 528
    .line 529
    :cond_14
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    .line 530
    .line 531
    return-void

    .line 532
    :goto_4
    iput-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    .line 533
    .line 534
    throw v1

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 30
    .line 31
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 32
    .line 33
    iget-object v3, v2, Landroidx/fragment/app/e;->h:La/zb5;

    .line 34
    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Landroidx/fragment/app/e;->d()V

    .line 38
    .line 39
    .line 40
    :cond_1
    const/4 v3, 0x5

    .line 41
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->x(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    new-instance v2, La/vwq;

    .line 49
    .line 50
    const/16 v3, 0x15

    .line 51
    .line 52
    invoke-direct {v2, v1, v3}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 53
    .line 54
    .line 55
    const-string v3, "FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)"

    .line 56
    .line 57
    invoke-virtual {v0, v2, v3}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    new-instance v2, La/vwq;

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    invoke-direct {v2, v1, v3}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 64
    .line 65
    .line 66
    const-string v3, "FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)"

    .line 67
    .line 68
    invoke-virtual {v0, v2, v3}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x6

    .line 72
    iput v2, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    iput-boolean v2, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 76
    .line 77
    new-instance v3, La/vwq;

    .line 78
    .line 79
    const/4 v4, 0x2

    .line 80
    invoke-direct {v3, v1, v4}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 81
    .line 82
    .line 83
    const-string v4, "Fragment#onPause"

    .line 84
    .line 85
    invoke-virtual {v0, v3, v4}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v0, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 93
    .line 94
    invoke-virtual {p0, v1, v2}, La/fhj;->g(Landroidx/fragment/app/Fragment;Z)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    new-instance p0, La/iin0;

    .line 99
    .line 100
    const-string v0, "Fragment "

    .line 101
    .line 102
    const-string v2, " did not call through to super.onPause()"

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v0, "savedInstanceState"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 22
    .line 23
    new-instance v1, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :try_start_0
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v0, "viewState"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 42
    .line 43
    const-string v0, "viewRegistryState"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 50
    .line 51
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 52
    .line 53
    const-string v0, "state"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroidx/fragment/app/FragmentState;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object v0, p1, Landroidx/fragment/app/FragmentState;->m:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->i:Ljava/lang/String;

    .line 66
    .line 67
    iget v0, p1, Landroidx/fragment/app/FragmentState;->n:I

    .line 68
    .line 69
    iput v0, p0, Landroidx/fragment/app/Fragment;->j:I

    .line 70
    .line 71
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->e:Ljava/lang/Boolean;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->n1:Z

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    iput-object p1, p0, Landroidx/fragment/app/Fragment;->e:Ljava/lang/Boolean;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    iget-boolean p1, p1, Landroidx/fragment/app/FragmentState;->o:Z

    .line 86
    .line 87
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->n1:Z

    .line 88
    .line 89
    :cond_3
    :goto_0
    iget-boolean p1, p0, Landroidx/fragment/app/Fragment;->n1:Z

    .line 90
    .line 91
    if-nez p1, :cond_4

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    iput-boolean p1, p0, Landroidx/fragment/app/Fragment;->m1:Z

    .line 95
    .line 96
    :cond_4
    :goto_1
    return-void

    .line 97
    :catch_0
    move-exception p1

    .line 98
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, "Failed to restore view hierarchy state for fragment "

    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    throw v0
.end method

.method public final n()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "moveto RESUMED: "

    .line 15
    .line 16
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->o1:La/cxq;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move-object v0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, La/cxq;->k:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget-object v4, v2, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 41
    .line 42
    if-ne v0, v4, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :goto_1
    if-eqz v4, :cond_5

    .line 50
    .line 51
    iget-object v5, v2, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 52
    .line 53
    if-ne v4, v5, :cond_4

    .line 54
    .line 55
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x2

    .line 60
    invoke-static {v5}, Landroidx/fragment/app/e;->V(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, "requestFocus: Restoring focused view "

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, " "

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    const-string v0, "succeeded"

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    const-string v0, "failed"

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, " on Fragment "

    .line 92
    .line 93
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " resulting in focused view "

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    :goto_4
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->A()La/cxq;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v3, v0, La/cxq;->k:Landroid/view/View;

    .line 131
    .line 132
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 133
    .line 134
    invoke-virtual {v0}, Landroidx/fragment/app/e;->c0()V

    .line 135
    .line 136
    .line 137
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->C(Z)Z

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x7

    .line 144
    iput v0, v2, Landroidx/fragment/app/Fragment;->a:I

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    iput-boolean v1, v2, Landroidx/fragment/app/Fragment;->j1:Z

    .line 148
    .line 149
    iget-object v4, v2, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 150
    .line 151
    new-instance v5, La/vwq;

    .line 152
    .line 153
    const/4 v6, 0x6

    .line 154
    invoke-direct {v5, v2, v6}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 155
    .line 156
    .line 157
    const-string v6, "Fragment#onResume"

    .line 158
    .line 159
    invoke-virtual {v4, v5, v6}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-boolean v5, v2, Landroidx/fragment/app/Fragment;->j1:Z

    .line 163
    .line 164
    if-eqz v5, :cond_7

    .line 165
    .line 166
    new-instance v5, La/vwq;

    .line 167
    .line 168
    invoke-direct {v5, v2, v0}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 169
    .line 170
    .line 171
    const-string v6, "FragmentLifecycle#handleLifecycleEvent(ON_RESUME)"

    .line 172
    .line 173
    invoke-virtual {v4, v5, v6}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    iget-object v5, v2, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 177
    .line 178
    if-eqz v5, :cond_6

    .line 179
    .line 180
    new-instance v5, La/vwq;

    .line 181
    .line 182
    const/16 v6, 0x8

    .line 183
    .line 184
    invoke-direct {v5, v2, v6}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 185
    .line 186
    .line 187
    const-string v6, "FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)"

    .line 188
    .line 189
    invoke-virtual {v4, v5, v6}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    iget-object v4, v2, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 193
    .line 194
    iput-boolean v1, v4, Landroidx/fragment/app/e;->I:Z

    .line 195
    .line 196
    iput-boolean v1, v4, Landroidx/fragment/app/e;->J:Z

    .line 197
    .line 198
    iget-object v5, v4, Landroidx/fragment/app/e;->P:La/w1r;

    .line 199
    .line 200
    iput-boolean v1, v5, La/w1r;->g:Z

    .line 201
    .line 202
    invoke-virtual {v4, v0}, Landroidx/fragment/app/e;->x(I)V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 206
    .line 207
    invoke-virtual {v0, v2, v1}, La/fhj;->j(Landroidx/fragment/app/Fragment;Z)V

    .line 208
    .line 209
    .line 210
    iget-object p0, p0, Landroidx/fragment/app/f;->b:La/pmi;

    .line 211
    .line 212
    iget-object v0, v2, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {p0, v3, v0}, La/pmi;->G(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 215
    .line 216
    .line 217
    iput-object v3, v2, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 218
    .line 219
    iput-object v3, v2, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 220
    .line 221
    iput-object v3, v2, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 222
    .line 223
    return-void

    .line 224
    :cond_7
    new-instance p0, La/iin0;

    .line 225
    .line 226
    const-string v0, "Fragment "

    .line 227
    .line 228
    const-string v1, " did not call through to super.onResume()"

    .line 229
    .line 230
    invoke-static {v0, v2, v1}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    throw p0
.end method

.method public final o()Landroid/os/Bundle;
    .locals 7

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    iget v2, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->b:Landroid/os/Bundle;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    new-instance v2, Landroidx/fragment/app/FragmentState;

    .line 21
    .line 22
    invoke-direct {v2, v1}, Landroidx/fragment/app/FragmentState;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 23
    .line 24
    .line 25
    const-string v3, "state"

    .line 26
    .line 27
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 28
    .line 29
    .line 30
    iget v2, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 31
    .line 32
    if-lez v2, :cond_6

    .line 33
    .line 34
    new-instance v2, Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 40
    .line 41
    new-instance v4, La/wwq;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-direct {v4, v1, v2, v5}, La/wwq;-><init>(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;B)V

    .line 45
    .line 46
    .line 47
    const-string v6, "Fragment#onSaveInstanceState"

    .line 48
    .line 49
    invoke-virtual {v3, v4, v6}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_1

    .line 57
    .line 58
    const-string v3, "savedInstanceState"

    .line 59
    .line 60
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    iget-object v3, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 64
    .line 65
    invoke-virtual {v3, v1, v2, v5}, La/fhj;->k(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;Z)V

    .line 66
    .line 67
    .line 68
    new-instance v2, Landroid/os/Bundle;

    .line 69
    .line 70
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->z1:La/nw20;

    .line 74
    .line 75
    invoke-virtual {v3, v2}, La/nw20;->q(Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_2

    .line 83
    .line 84
    const-string v3, "registryState"

    .line 85
    .line 86
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 90
    .line 91
    invoke-virtual {v2}, Landroidx/fragment/app/e;->p0()Landroid/os/Bundle;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-nez v3, :cond_3

    .line 100
    .line 101
    const-string v3, "childFragmentManager"

    .line 102
    .line 103
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 104
    .line 105
    .line 106
    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 107
    .line 108
    if-eqz v2, :cond_4

    .line 109
    .line 110
    invoke-virtual {p0}, Landroidx/fragment/app/f;->p()V

    .line 111
    .line 112
    .line 113
    :cond_4
    iget-object p0, v1, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 114
    .line 115
    if-eqz p0, :cond_5

    .line 116
    .line 117
    const-string v2, "viewState"

    .line 118
    .line 119
    invoke-virtual {v0, v2, p0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-object p0, v1, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 123
    .line 124
    if-eqz p0, :cond_6

    .line 125
    .line 126
    const-string v2, "viewRegistryState"

    .line 127
    .line 128
    invoke-virtual {v0, v2, p0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    iget-object p0, v1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 132
    .line 133
    if-eqz p0, :cond_7

    .line 134
    .line 135
    const-string v1, "arguments"

    .line 136
    .line 137
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    return-object v0
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Saving view state for fragment "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, " with view "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "FragmentManager"

    .line 40
    .line 41
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    :cond_1
    new-instance v0, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-lez v1, :cond_2

    .line 59
    .line 60
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->c:Landroid/util/SparseArray;

    .line 61
    .line 62
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 68
    .line 69
    iget-object v1, v1, La/n6r;->g:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/nw20;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, La/nw20;->q(Landroid/os/Bundle;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_3

    .line 81
    .line 82
    iput-object v0, p0, Landroidx/fragment/app/Fragment;->d:Landroid/os/Bundle;

    .line 83
    .line 84
    :cond_3
    :goto_0
    return-void
.end method

.method public final q()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/fragment/app/e;->c0()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, Landroidx/fragment/app/e;->C(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iput-boolean v2, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 45
    .line 46
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 47
    .line 48
    new-instance v4, La/vwq;

    .line 49
    .line 50
    const/16 v5, 0x11

    .line 51
    .line 52
    invoke-direct {v4, v1, v5}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 53
    .line 54
    .line 55
    const-string v5, "Fragment#onStart"

    .line 56
    .line 57
    invoke-virtual {v3, v4, v5}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-boolean v4, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 61
    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    new-instance v4, La/vwq;

    .line 65
    .line 66
    const/16 v5, 0x12

    .line 67
    .line 68
    invoke-direct {v4, v1, v5}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 69
    .line 70
    .line 71
    const-string v5, "FragmentLifecycle#handleLifecycleEvent(ON_START)"

    .line 72
    .line 73
    invoke-virtual {v3, v4, v5}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v4, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 77
    .line 78
    if-eqz v4, :cond_1

    .line 79
    .line 80
    new-instance v4, La/vwq;

    .line 81
    .line 82
    const/16 v5, 0x13

    .line 83
    .line 84
    invoke-direct {v4, v1, v5}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 85
    .line 86
    .line 87
    const-string v5, "FragmentViewLifecycle#handleLifecycleEvent(ON_START)"

    .line 88
    .line 89
    invoke-virtual {v3, v4, v5}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    iget-object v3, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 93
    .line 94
    iput-boolean v2, v3, Landroidx/fragment/app/e;->I:Z

    .line 95
    .line 96
    iput-boolean v2, v3, Landroidx/fragment/app/e;->J:Z

    .line 97
    .line 98
    iget-object v4, v3, Landroidx/fragment/app/e;->P:La/w1r;

    .line 99
    .line 100
    iput-boolean v2, v4, La/w1r;->g:Z

    .line 101
    .line 102
    invoke-virtual {v3, v0}, Landroidx/fragment/app/e;->x(I)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 106
    .line 107
    invoke-virtual {p0, v1, v2}, La/fhj;->l(Landroidx/fragment/app/Fragment;Z)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_2
    new-instance p0, La/iin0;

    .line 112
    .line 113
    const-string v0, "Fragment "

    .line 114
    .line 115
    const-string v2, " did not call through to super.onStart()"

    .line 116
    .line 117
    invoke-static {v0, v1, v2}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0
.end method

.method public final r()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Landroidx/fragment/app/e;->V(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/fragment/app/f;->c:Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, Landroidx/fragment/app/Fragment;->B1:La/a7q;

    .line 30
    .line 31
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->x:La/v1r;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    iput-boolean v3, v2, Landroidx/fragment/app/e;->J:Z

    .line 35
    .line 36
    iget-object v4, v2, Landroidx/fragment/app/e;->P:La/w1r;

    .line 37
    .line 38
    iput-boolean v3, v4, La/w1r;->g:Z

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->x(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    new-instance v2, La/vwq;

    .line 50
    .line 51
    invoke-direct {v2, v1, v4}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 52
    .line 53
    .line 54
    const-string v5, "FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)"

    .line 55
    .line 56
    invoke-virtual {v0, v2, v5}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    new-instance v2, La/vwq;

    .line 60
    .line 61
    const/16 v5, 0xa

    .line 62
    .line 63
    invoke-direct {v2, v1, v5}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 64
    .line 65
    .line 66
    const-string v5, "FragmentLifecycle#handleLifecycleEvent(ON_STOP)"

    .line 67
    .line 68
    invoke-virtual {v0, v2, v5}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    iput v3, v1, Landroidx/fragment/app/Fragment;->a:I

    .line 72
    .line 73
    iput-boolean v4, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 74
    .line 75
    new-instance v2, La/vwq;

    .line 76
    .line 77
    const/16 v3, 0xf

    .line 78
    .line 79
    invoke-direct {v2, v1, v3}, La/vwq;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 80
    .line 81
    .line 82
    const-string v3, "Fragment#onStop"

    .line 83
    .line 84
    invoke-virtual {v0, v2, v3}, La/a7q;->g(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-boolean v0, v1, Landroidx/fragment/app/Fragment;->j1:Z

    .line 88
    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    iget-object p0, p0, Landroidx/fragment/app/f;->a:La/fhj;

    .line 92
    .line 93
    invoke-virtual {p0, v1, v4}, La/fhj;->m(Landroidx/fragment/app/Fragment;Z)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    new-instance p0, La/iin0;

    .line 98
    .line 99
    const-string v0, "Fragment "

    .line 100
    .line 101
    const-string v2, " did not call through to super.onStop()"

    .line 102
    .line 103
    invoke-static {v0, v1, v2}, La/axq;->k(Ljava/lang/String;Landroidx/fragment/app/Fragment;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0
.end method
