.class public final La/ypq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wpq;


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final c:La/nqq;

.field public final d:La/tpq;

.field public final e:La/xpq;

.field public f:La/ky40;

.field public final g:La/vy40;

.field public h:La/nqq;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ypq;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 5
    .line 6
    iput-object p2, p0, La/ypq;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 7
    .line 8
    new-instance p1, La/nqq;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {p1, v2, v0, v1}, La/nqq;-><init>(ILkotlin/jvm/functions/Function2;I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/ypq;->c:La/nqq;

    .line 18
    .line 19
    new-instance p1, La/tpq;

    .line 20
    .line 21
    invoke-direct {p1, p0, p2}, La/tpq;-><init>(La/ypq;Landroidx/compose/ui/platform/AndroidComposeView;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/ypq;->d:La/tpq;

    .line 25
    .line 26
    new-instance p1, La/xpq;

    .line 27
    .line 28
    invoke-direct {p1, p0}, La/xpq;-><init>(La/ypq;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/ypq;->e:La/xpq;

    .line 32
    .line 33
    new-instance p1, La/vy40;

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    invoke-direct {p1, p2}, La/vy40;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/ypq;->g:La/vy40;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    invoke-virtual {p0, v1, p1, v0}, La/ypq;->d(IZZ)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(Z)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_6

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1}, La/ypq;->k(La/nqq;)V

    .line 16
    .line 17
    .line 18
    if-eqz p1, :cond_c

    .line 19
    .line 20
    sget-object p0, La/iqq;->a:La/iqq;

    .line 21
    .line 22
    sget-object v2, La/iqq;->c:La/iqq;

    .line 23
    .line 24
    invoke-virtual {p1, p0, v2}, La/nqq;->a1(La/iqq;La/iqq;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p1, La/lm40;->a:La/lm40;

    .line 28
    .line 29
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    const-string p0, "visitAncestors called on an unattached node"

    .line 34
    .line 35
    invoke-static {p0}, La/xcx;->b(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    iget-object p0, p1, La/lm40;->a:La/lm40;

    .line 39
    .line 40
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 41
    .line 42
    invoke-static {p1}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    if-eqz p1, :cond_c

    .line 47
    .line 48
    iget-object v2, p1, La/e7z;->h1:La/tzi;

    .line 49
    .line 50
    iget-object v2, v2, La/tzi;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, La/lm40;

    .line 53
    .line 54
    iget v2, v2, La/lm40;->d:I

    .line 55
    .line 56
    and-int/lit16 v2, v2, 0x400

    .line 57
    .line 58
    if-eqz v2, :cond_a

    .line 59
    .line 60
    :goto_1
    if-eqz p0, :cond_a

    .line 61
    .line 62
    iget v2, p0, La/lm40;->c:I

    .line 63
    .line 64
    and-int/lit16 v2, v2, 0x400

    .line 65
    .line 66
    if-eqz v2, :cond_9

    .line 67
    .line 68
    move-object v2, p0

    .line 69
    move-object v3, v1

    .line 70
    :goto_2
    if-eqz v2, :cond_9

    .line 71
    .line 72
    instance-of v4, v2, La/nqq;

    .line 73
    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    check-cast v2, La/nqq;

    .line 77
    .line 78
    sget-object v4, La/iqq;->b:La/iqq;

    .line 79
    .line 80
    sget-object v5, La/iqq;->c:La/iqq;

    .line 81
    .line 82
    invoke-virtual {v2, v4, v5}, La/nqq;->a1(La/iqq;La/iqq;)V

    .line 83
    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_2
    iget v4, v2, La/lm40;->c:I

    .line 87
    .line 88
    and-int/lit16 v4, v4, 0x400

    .line 89
    .line 90
    if-eqz v4, :cond_8

    .line 91
    .line 92
    instance-of v4, v2, La/f3k;

    .line 93
    .line 94
    if-eqz v4, :cond_8

    .line 95
    .line 96
    move-object v4, v2

    .line 97
    check-cast v4, La/f3k;

    .line 98
    .line 99
    iget-object v4, v4, La/f3k;->p:La/lm40;

    .line 100
    .line 101
    const/4 v5, 0x0

    .line 102
    :goto_3
    if-eqz v4, :cond_7

    .line 103
    .line 104
    iget v6, v4, La/lm40;->c:I

    .line 105
    .line 106
    and-int/lit16 v6, v6, 0x400

    .line 107
    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    if-ne v5, v0, :cond_3

    .line 113
    .line 114
    move-object v2, v4

    .line 115
    goto :goto_4

    .line 116
    :cond_3
    if-nez v3, :cond_4

    .line 117
    .line 118
    new-instance v3, La/xz40;

    .line 119
    .line 120
    const/16 v6, 0x10

    .line 121
    .line 122
    new-array v6, v6, [La/lm40;

    .line 123
    .line 124
    invoke-direct {v3, v6}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    if-eqz v2, :cond_5

    .line 128
    .line 129
    invoke-virtual {v3, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    move-object v2, v1

    .line 133
    :cond_5
    invoke-virtual {v3, v4}, La/xz40;->b(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    :goto_4
    iget-object v4, v4, La/lm40;->f:La/lm40;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_7
    if-ne v5, v0, :cond_8

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_8
    :goto_5
    invoke-static {v3}, La/vcc;->V(La/xz40;)La/lm40;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    goto :goto_2

    .line 147
    :cond_9
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    invoke-virtual {p1}, La/e7z;->v()La/e7z;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    if-eqz p1, :cond_b

    .line 155
    .line 156
    iget-object p0, p1, La/e7z;->h1:La/tzi;

    .line 157
    .line 158
    if-eqz p0, :cond_b

    .line 159
    .line 160
    iget-object p0, p0, La/tzi;->f:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, La/wso0;

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_b
    move-object p0, v1

    .line 166
    goto :goto_0

    .line 167
    :cond_c
    :goto_6
    return v0
.end method

.method public final d(IZZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_3

    .line 3
    .line 4
    iget-object v1, p0, La/ypq;->c:La/nqq;

    .line 5
    .line 6
    invoke-static {v1, p1}, La/qzb;->J0(La/nqq;I)La/ixf;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    if-ne p1, v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 27
    .line 28
    .line 29
    return p2

    .line 30
    :cond_1
    :goto_0
    move v0, p2

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {p0, p2}, La/ypq;->c(Z)Z

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-virtual {p0, p2}, La/ypq;->c(Z)Z

    .line 37
    .line 38
    .line 39
    :goto_1
    if-eqz v0, :cond_4

    .line 40
    .line 41
    if-eqz p3, :cond_4

    .line 42
    .line 43
    invoke-virtual {p0}, La/ypq;->e()V

    .line 44
    .line 45
    .line 46
    :cond_4
    return v0
.end method

.method public final e()V
    .locals 1

    .line 1
    iget-object p0, p0, La/ypq;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void

    .line 35
    :cond_3
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->clearFocus()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final f(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z
    .locals 12

    .line 1
    iget-object v0, p0, La/ypq;->c:La/nqq;

    .line 2
    .line 3
    const-string v1, "FocusOwnerImpl:dispatchKeyEvent"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, La/ypq;->d:La/tpq;

    .line 9
    .line 10
    iget-boolean v1, v1, La/tpq;->e:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p0, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 16
    .line 17
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, La/ypq;->l(Landroid/view/KeyEvent;)Z

    .line 27
    .line 28
    .line 29
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 33
    .line 34
    .line 35
    return v2

    .line 36
    :cond_1
    :try_start_2
    invoke-static {v0}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 37
    .line 38
    .line 39
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    const-string v1, "visitAncestors called on an unattached node"

    .line 41
    .line 42
    const/16 v3, 0x10

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eqz p0, :cond_7

    .line 47
    .line 48
    :try_start_3
    iget-object v6, p0, La/lm40;->a:La/lm40;

    .line 49
    .line 50
    iget-boolean v6, v6, La/lm40;->n:Z

    .line 51
    .line 52
    if-nez v6, :cond_2

    .line 53
    .line 54
    const-string v6, "visitLocalDescendants called on an unattached node"

    .line 55
    .line 56
    invoke-static {v6}, La/xcx;->b(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    iget-object v6, p0, La/lm40;->a:La/lm40;

    .line 60
    .line 61
    iget v7, v6, La/lm40;->d:I

    .line 62
    .line 63
    and-int/lit16 v7, v7, 0x2400

    .line 64
    .line 65
    if-eqz v7, :cond_5

    .line 66
    .line 67
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 68
    .line 69
    move-object v7, v4

    .line 70
    :goto_0
    if-eqz v6, :cond_6

    .line 71
    .line 72
    iget v8, v6, La/lm40;->c:I

    .line 73
    .line 74
    and-int/lit16 v9, v8, 0x2400

    .line 75
    .line 76
    if-eqz v9, :cond_4

    .line 77
    .line 78
    and-int/lit16 v8, v8, 0x400

    .line 79
    .line 80
    if-eqz v8, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object v7, v6

    .line 84
    :cond_4
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    move-object v7, v4

    .line 88
    :cond_6
    :goto_1
    if-nez v7, :cond_22

    .line 89
    .line 90
    :cond_7
    if-eqz p0, :cond_14

    .line 91
    .line 92
    iget-object v6, p0, La/lm40;->a:La/lm40;

    .line 93
    .line 94
    iget-boolean v6, v6, La/lm40;->n:Z

    .line 95
    .line 96
    if-nez v6, :cond_8

    .line 97
    .line 98
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :cond_8
    iget-object v6, p0, La/lm40;->a:La/lm40;

    .line 102
    .line 103
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    if-eqz p0, :cond_13

    .line 108
    .line 109
    iget-object v7, p0, La/e7z;->h1:La/tzi;

    .line 110
    .line 111
    iget-object v7, v7, La/tzi;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v7, La/lm40;

    .line 114
    .line 115
    iget v7, v7, La/lm40;->d:I

    .line 116
    .line 117
    and-int/lit16 v7, v7, 0x2000

    .line 118
    .line 119
    if-eqz v7, :cond_11

    .line 120
    .line 121
    :goto_3
    if-eqz v6, :cond_11

    .line 122
    .line 123
    iget v7, v6, La/lm40;->c:I

    .line 124
    .line 125
    and-int/lit16 v7, v7, 0x2000

    .line 126
    .line 127
    if-eqz v7, :cond_10

    .line 128
    .line 129
    move-object v8, v4

    .line 130
    move-object v7, v6

    .line 131
    :goto_4
    if-eqz v7, :cond_10

    .line 132
    .line 133
    instance-of v9, v7, La/lky;

    .line 134
    .line 135
    if-eqz v9, :cond_9

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_9
    iget v9, v7, La/lm40;->c:I

    .line 139
    .line 140
    and-int/lit16 v9, v9, 0x2000

    .line 141
    .line 142
    if-eqz v9, :cond_f

    .line 143
    .line 144
    instance-of v9, v7, La/f3k;

    .line 145
    .line 146
    if-eqz v9, :cond_f

    .line 147
    .line 148
    move-object v9, v7

    .line 149
    check-cast v9, La/f3k;

    .line 150
    .line 151
    iget-object v9, v9, La/f3k;->p:La/lm40;

    .line 152
    .line 153
    move v10, v2

    .line 154
    :goto_5
    if-eqz v9, :cond_e

    .line 155
    .line 156
    iget v11, v9, La/lm40;->c:I

    .line 157
    .line 158
    and-int/lit16 v11, v11, 0x2000

    .line 159
    .line 160
    if-eqz v11, :cond_d

    .line 161
    .line 162
    add-int/lit8 v10, v10, 0x1

    .line 163
    .line 164
    if-ne v10, v5, :cond_a

    .line 165
    .line 166
    move-object v7, v9

    .line 167
    goto :goto_6

    .line 168
    :cond_a
    if-nez v8, :cond_b

    .line 169
    .line 170
    new-instance v8, La/xz40;

    .line 171
    .line 172
    new-array v11, v3, [La/lm40;

    .line 173
    .line 174
    invoke-direct {v8, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_b
    if-eqz v7, :cond_c

    .line 178
    .line 179
    invoke-virtual {v8, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    move-object v7, v4

    .line 183
    :cond_c
    invoke-virtual {v8, v9}, La/xz40;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_d
    :goto_6
    iget-object v9, v9, La/lm40;->f:La/lm40;

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_e
    if-ne v10, v5, :cond_f

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_f
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    goto :goto_4

    .line 197
    :cond_10
    iget-object v6, v6, La/lm40;->e:La/lm40;

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_11
    invoke-virtual {p0}, La/e7z;->v()La/e7z;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    if-eqz p0, :cond_12

    .line 205
    .line 206
    iget-object v6, p0, La/e7z;->h1:La/tzi;

    .line 207
    .line 208
    if-eqz v6, :cond_12

    .line 209
    .line 210
    iget-object v6, v6, La/tzi;->f:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v6, La/wso0;

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_12
    move-object v6, v4

    .line 216
    goto :goto_2

    .line 217
    :cond_13
    move-object v7, v4

    .line 218
    :goto_7
    check-cast v7, La/lky;

    .line 219
    .line 220
    if-eqz v7, :cond_14

    .line 221
    .line 222
    check-cast v7, La/lm40;

    .line 223
    .line 224
    iget-object v7, v7, La/lm40;->a:La/lm40;

    .line 225
    .line 226
    goto/16 :goto_e

    .line 227
    .line 228
    :cond_14
    iget-object p0, v0, La/lm40;->a:La/lm40;

    .line 229
    .line 230
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 231
    .line 232
    if-nez p0, :cond_15

    .line 233
    .line 234
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    :cond_15
    iget-object p0, v0, La/lm40;->a:La/lm40;

    .line 238
    .line 239
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 240
    .line 241
    invoke-static {v0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    :goto_8
    if-eqz v0, :cond_20

    .line 246
    .line 247
    iget-object v6, v0, La/e7z;->h1:La/tzi;

    .line 248
    .line 249
    iget-object v6, v6, La/tzi;->g:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v6, La/lm40;

    .line 252
    .line 253
    iget v6, v6, La/lm40;->d:I

    .line 254
    .line 255
    and-int/lit16 v6, v6, 0x2000

    .line 256
    .line 257
    if-eqz v6, :cond_1e

    .line 258
    .line 259
    :goto_9
    if-eqz p0, :cond_1e

    .line 260
    .line 261
    iget v6, p0, La/lm40;->c:I

    .line 262
    .line 263
    and-int/lit16 v6, v6, 0x2000

    .line 264
    .line 265
    if-eqz v6, :cond_1d

    .line 266
    .line 267
    move-object v6, p0

    .line 268
    move-object v7, v4

    .line 269
    :goto_a
    if-eqz v6, :cond_1d

    .line 270
    .line 271
    instance-of v8, v6, La/lky;

    .line 272
    .line 273
    if-eqz v8, :cond_16

    .line 274
    .line 275
    goto :goto_d

    .line 276
    :cond_16
    iget v8, v6, La/lm40;->c:I

    .line 277
    .line 278
    and-int/lit16 v8, v8, 0x2000

    .line 279
    .line 280
    if-eqz v8, :cond_1c

    .line 281
    .line 282
    instance-of v8, v6, La/f3k;

    .line 283
    .line 284
    if-eqz v8, :cond_1c

    .line 285
    .line 286
    move-object v8, v6

    .line 287
    check-cast v8, La/f3k;

    .line 288
    .line 289
    iget-object v8, v8, La/f3k;->p:La/lm40;

    .line 290
    .line 291
    move v9, v2

    .line 292
    :goto_b
    if-eqz v8, :cond_1b

    .line 293
    .line 294
    iget v10, v8, La/lm40;->c:I

    .line 295
    .line 296
    and-int/lit16 v10, v10, 0x2000

    .line 297
    .line 298
    if-eqz v10, :cond_1a

    .line 299
    .line 300
    add-int/lit8 v9, v9, 0x1

    .line 301
    .line 302
    if-ne v9, v5, :cond_17

    .line 303
    .line 304
    move-object v6, v8

    .line 305
    goto :goto_c

    .line 306
    :cond_17
    if-nez v7, :cond_18

    .line 307
    .line 308
    new-instance v7, La/xz40;

    .line 309
    .line 310
    new-array v10, v3, [La/lm40;

    .line 311
    .line 312
    invoke-direct {v7, v10}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_18
    if-eqz v6, :cond_19

    .line 316
    .line 317
    invoke-virtual {v7, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    move-object v6, v4

    .line 321
    :cond_19
    invoke-virtual {v7, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_1a
    :goto_c
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_1b
    if-ne v9, v5, :cond_1c

    .line 328
    .line 329
    goto :goto_a

    .line 330
    :cond_1c
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    goto :goto_a

    .line 335
    :cond_1d
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_1e
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    if-eqz v0, :cond_1f

    .line 343
    .line 344
    iget-object p0, v0, La/e7z;->h1:La/tzi;

    .line 345
    .line 346
    if-eqz p0, :cond_1f

    .line 347
    .line 348
    iget-object p0, p0, La/tzi;->f:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p0, La/wso0;

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_1f
    move-object p0, v4

    .line 354
    goto :goto_8

    .line 355
    :cond_20
    move-object v6, v4

    .line 356
    :goto_d
    check-cast v6, La/lky;

    .line 357
    .line 358
    if-eqz v6, :cond_21

    .line 359
    .line 360
    check-cast v6, La/lm40;

    .line 361
    .line 362
    iget-object v7, v6, La/lm40;->a:La/lm40;

    .line 363
    .line 364
    goto :goto_e

    .line 365
    :cond_21
    move-object v7, v4

    .line 366
    :cond_22
    :goto_e
    if-eqz v7, :cond_45

    .line 367
    .line 368
    iget-object p0, v7, La/lm40;->a:La/lm40;

    .line 369
    .line 370
    iget-boolean p0, p0, La/lm40;->n:Z

    .line 371
    .line 372
    if-nez p0, :cond_23

    .line 373
    .line 374
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    :cond_23
    iget-object p0, v7, La/lm40;->a:La/lm40;

    .line 378
    .line 379
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 380
    .line 381
    invoke-static {v7}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    move-object v1, v4

    .line 386
    :goto_f
    if-eqz v0, :cond_2f

    .line 387
    .line 388
    iget-object v6, v0, La/e7z;->h1:La/tzi;

    .line 389
    .line 390
    iget-object v6, v6, La/tzi;->g:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v6, La/lm40;

    .line 393
    .line 394
    iget v6, v6, La/lm40;->d:I

    .line 395
    .line 396
    and-int/lit16 v6, v6, 0x2000

    .line 397
    .line 398
    if-eqz v6, :cond_2d

    .line 399
    .line 400
    :goto_10
    if-eqz p0, :cond_2d

    .line 401
    .line 402
    iget v6, p0, La/lm40;->c:I

    .line 403
    .line 404
    and-int/lit16 v6, v6, 0x2000

    .line 405
    .line 406
    if-eqz v6, :cond_2c

    .line 407
    .line 408
    move-object v6, p0

    .line 409
    move-object v8, v4

    .line 410
    :goto_11
    if-eqz v6, :cond_2c

    .line 411
    .line 412
    instance-of v9, v6, La/lky;

    .line 413
    .line 414
    if-eqz v9, :cond_25

    .line 415
    .line 416
    if-nez v1, :cond_24

    .line 417
    .line 418
    new-instance v1, Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 421
    .line 422
    .line 423
    :cond_24
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    move v9, v2

    .line 427
    goto :goto_12

    .line 428
    :cond_25
    move v9, v5

    .line 429
    :goto_12
    if-eqz v9, :cond_2b

    .line 430
    .line 431
    iget v9, v6, La/lm40;->c:I

    .line 432
    .line 433
    and-int/lit16 v9, v9, 0x2000

    .line 434
    .line 435
    if-eqz v9, :cond_2b

    .line 436
    .line 437
    instance-of v9, v6, La/f3k;

    .line 438
    .line 439
    if-eqz v9, :cond_2b

    .line 440
    .line 441
    move-object v9, v6

    .line 442
    check-cast v9, La/f3k;

    .line 443
    .line 444
    iget-object v9, v9, La/f3k;->p:La/lm40;

    .line 445
    .line 446
    move v10, v2

    .line 447
    :goto_13
    if-eqz v9, :cond_2a

    .line 448
    .line 449
    iget v11, v9, La/lm40;->c:I

    .line 450
    .line 451
    and-int/lit16 v11, v11, 0x2000

    .line 452
    .line 453
    if-eqz v11, :cond_29

    .line 454
    .line 455
    add-int/lit8 v10, v10, 0x1

    .line 456
    .line 457
    if-ne v10, v5, :cond_26

    .line 458
    .line 459
    move-object v6, v9

    .line 460
    goto :goto_14

    .line 461
    :cond_26
    if-nez v8, :cond_27

    .line 462
    .line 463
    new-instance v8, La/xz40;

    .line 464
    .line 465
    new-array v11, v3, [La/lm40;

    .line 466
    .line 467
    invoke-direct {v8, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    :cond_27
    if-eqz v6, :cond_28

    .line 471
    .line 472
    invoke-virtual {v8, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    move-object v6, v4

    .line 476
    :cond_28
    invoke-virtual {v8, v9}, La/xz40;->b(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_29
    :goto_14
    iget-object v9, v9, La/lm40;->f:La/lm40;

    .line 480
    .line 481
    goto :goto_13

    .line 482
    :cond_2a
    if-ne v10, v5, :cond_2b

    .line 483
    .line 484
    goto :goto_11

    .line 485
    :cond_2b
    invoke-static {v8}, La/vcc;->V(La/xz40;)La/lm40;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    goto :goto_11

    .line 490
    :cond_2c
    iget-object p0, p0, La/lm40;->e:La/lm40;

    .line 491
    .line 492
    goto :goto_10

    .line 493
    :cond_2d
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-eqz v0, :cond_2e

    .line 498
    .line 499
    iget-object p0, v0, La/e7z;->h1:La/tzi;

    .line 500
    .line 501
    if-eqz p0, :cond_2e

    .line 502
    .line 503
    iget-object p0, p0, La/tzi;->f:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast p0, La/wso0;

    .line 506
    .line 507
    goto :goto_f

    .line 508
    :cond_2e
    move-object p0, v4

    .line 509
    goto :goto_f

    .line 510
    :cond_2f
    if-eqz v1, :cond_32

    .line 511
    .line 512
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 513
    .line 514
    .line 515
    move-result p0

    .line 516
    add-int/lit8 p0, p0, -0x1

    .line 517
    .line 518
    if-ltz p0, :cond_32

    .line 519
    .line 520
    :goto_15
    add-int/lit8 v0, p0, -0x1

    .line 521
    .line 522
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    check-cast p0, La/lky;

    .line 527
    .line 528
    invoke-interface {p0, p1}, La/lky;->c0(Landroid/view/KeyEvent;)Z

    .line 529
    .line 530
    .line 531
    move-result p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 532
    if-eqz p0, :cond_30

    .line 533
    .line 534
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 535
    .line 536
    .line 537
    return v5

    .line 538
    :cond_30
    if-gez v0, :cond_31

    .line 539
    .line 540
    goto :goto_16

    .line 541
    :cond_31
    move p0, v0

    .line 542
    goto :goto_15

    .line 543
    :cond_32
    :goto_16
    :try_start_4
    iget-object p0, v7, La/lm40;->a:La/lm40;

    .line 544
    .line 545
    move-object v0, v4

    .line 546
    :goto_17
    if-eqz p0, :cond_3a

    .line 547
    .line 548
    instance-of v6, p0, La/lky;

    .line 549
    .line 550
    if-eqz v6, :cond_33

    .line 551
    .line 552
    check-cast p0, La/lky;

    .line 553
    .line 554
    invoke-interface {p0, p1}, La/lky;->c0(Landroid/view/KeyEvent;)Z

    .line 555
    .line 556
    .line 557
    move-result p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 558
    if-eqz p0, :cond_39

    .line 559
    .line 560
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 561
    .line 562
    .line 563
    return v5

    .line 564
    :cond_33
    :try_start_5
    iget v6, p0, La/lm40;->c:I

    .line 565
    .line 566
    and-int/lit16 v6, v6, 0x2000

    .line 567
    .line 568
    if-eqz v6, :cond_39

    .line 569
    .line 570
    instance-of v6, p0, La/f3k;

    .line 571
    .line 572
    if-eqz v6, :cond_39

    .line 573
    .line 574
    move-object v6, p0

    .line 575
    check-cast v6, La/f3k;

    .line 576
    .line 577
    iget-object v6, v6, La/f3k;->p:La/lm40;

    .line 578
    .line 579
    move v8, v2

    .line 580
    :goto_18
    if-eqz v6, :cond_38

    .line 581
    .line 582
    iget v9, v6, La/lm40;->c:I

    .line 583
    .line 584
    and-int/lit16 v9, v9, 0x2000

    .line 585
    .line 586
    if-eqz v9, :cond_37

    .line 587
    .line 588
    add-int/lit8 v8, v8, 0x1

    .line 589
    .line 590
    if-ne v8, v5, :cond_34

    .line 591
    .line 592
    move-object p0, v6

    .line 593
    goto :goto_19

    .line 594
    :cond_34
    if-nez v0, :cond_35

    .line 595
    .line 596
    new-instance v0, La/xz40;

    .line 597
    .line 598
    new-array v9, v3, [La/lm40;

    .line 599
    .line 600
    invoke-direct {v0, v9}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    :cond_35
    if-eqz p0, :cond_36

    .line 604
    .line 605
    invoke-virtual {v0, p0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 606
    .line 607
    .line 608
    move-object p0, v4

    .line 609
    :cond_36
    invoke-virtual {v0, v6}, La/xz40;->b(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    :cond_37
    :goto_19
    iget-object v6, v6, La/lm40;->f:La/lm40;

    .line 613
    .line 614
    goto :goto_18

    .line 615
    :cond_38
    if-ne v8, v5, :cond_39

    .line 616
    .line 617
    goto :goto_17

    .line 618
    :cond_39
    invoke-static {v0}, La/vcc;->V(La/xz40;)La/lm40;

    .line 619
    .line 620
    .line 621
    move-result-object p0

    .line 622
    goto :goto_17

    .line 623
    :cond_3a
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object p0

    .line 627
    check-cast p0, Ljava/lang/Boolean;

    .line 628
    .line 629
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 630
    .line 631
    .line 632
    move-result p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 633
    if-eqz p0, :cond_3b

    .line 634
    .line 635
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 636
    .line 637
    .line 638
    return v5

    .line 639
    :cond_3b
    :try_start_6
    iget-object p0, v7, La/lm40;->a:La/lm40;

    .line 640
    .line 641
    move-object p2, v4

    .line 642
    :goto_1a
    if-eqz p0, :cond_43

    .line 643
    .line 644
    instance-of v0, p0, La/lky;

    .line 645
    .line 646
    if-eqz v0, :cond_3c

    .line 647
    .line 648
    check-cast p0, La/lky;

    .line 649
    .line 650
    invoke-interface {p0, p1}, La/lky;->l0(Landroid/view/KeyEvent;)Z

    .line 651
    .line 652
    .line 653
    move-result p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 654
    if-eqz p0, :cond_42

    .line 655
    .line 656
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 657
    .line 658
    .line 659
    return v5

    .line 660
    :cond_3c
    :try_start_7
    iget v0, p0, La/lm40;->c:I

    .line 661
    .line 662
    and-int/lit16 v0, v0, 0x2000

    .line 663
    .line 664
    if-eqz v0, :cond_42

    .line 665
    .line 666
    instance-of v0, p0, La/f3k;

    .line 667
    .line 668
    if-eqz v0, :cond_42

    .line 669
    .line 670
    move-object v0, p0

    .line 671
    check-cast v0, La/f3k;

    .line 672
    .line 673
    iget-object v0, v0, La/f3k;->p:La/lm40;

    .line 674
    .line 675
    move v6, v2

    .line 676
    :goto_1b
    if-eqz v0, :cond_41

    .line 677
    .line 678
    iget v7, v0, La/lm40;->c:I

    .line 679
    .line 680
    and-int/lit16 v7, v7, 0x2000

    .line 681
    .line 682
    if-eqz v7, :cond_40

    .line 683
    .line 684
    add-int/lit8 v6, v6, 0x1

    .line 685
    .line 686
    if-ne v6, v5, :cond_3d

    .line 687
    .line 688
    move-object p0, v0

    .line 689
    goto :goto_1c

    .line 690
    :cond_3d
    if-nez p2, :cond_3e

    .line 691
    .line 692
    new-instance p2, La/xz40;

    .line 693
    .line 694
    new-array v7, v3, [La/lm40;

    .line 695
    .line 696
    invoke-direct {p2, v7}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    :cond_3e
    if-eqz p0, :cond_3f

    .line 700
    .line 701
    invoke-virtual {p2, p0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 702
    .line 703
    .line 704
    move-object p0, v4

    .line 705
    :cond_3f
    invoke-virtual {p2, v0}, La/xz40;->b(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    :cond_40
    :goto_1c
    iget-object v0, v0, La/lm40;->f:La/lm40;

    .line 709
    .line 710
    goto :goto_1b

    .line 711
    :cond_41
    if-ne v6, v5, :cond_42

    .line 712
    .line 713
    goto :goto_1a

    .line 714
    :cond_42
    invoke-static {p2}, La/vcc;->V(La/xz40;)La/lm40;

    .line 715
    .line 716
    .line 717
    move-result-object p0

    .line 718
    goto :goto_1a

    .line 719
    :cond_43
    if-eqz v1, :cond_45

    .line 720
    .line 721
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 722
    .line 723
    .line 724
    move-result p0

    .line 725
    move p2, v2

    .line 726
    :goto_1d
    if-ge p2, p0, :cond_45

    .line 727
    .line 728
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    check-cast v0, La/lky;

    .line 733
    .line 734
    invoke-interface {v0, p1}, La/lky;->l0(Landroid/view/KeyEvent;)Z

    .line 735
    .line 736
    .line 737
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 738
    if-eqz v0, :cond_44

    .line 739
    .line 740
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 741
    .line 742
    .line 743
    return v5

    .line 744
    :cond_44
    add-int/lit8 p2, p2, 0x1

    .line 745
    .line 746
    goto :goto_1d

    .line 747
    :cond_45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 748
    .line 749
    .line 750
    return v2

    .line 751
    :catchall_0
    move-exception p0

    .line 752
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 753
    .line 754
    .line 755
    throw p0
.end method

.method public final g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, La/ypq;->c:La/nqq;

    .line 10
    .line 11
    invoke-static {v4}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x6

    .line 18
    const/4 v10, 0x5

    .line 19
    const/4 v11, 0x2

    .line 20
    iget-object v13, v0, La/ypq;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 21
    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    const/16 v17, 0x0

    .line 25
    .line 26
    const/4 v15, 0x1

    .line 27
    if-eqz v5, :cond_25

    .line 28
    .line 29
    invoke-interface {v13}, La/cg80;->getLayoutDirection()La/k6z;

    .line 30
    .line 31
    .line 32
    move-result-object v18

    .line 33
    invoke-virtual {v5}, La/nqq;->b1()La/aqq;

    .line 34
    .line 35
    .line 36
    move-result-object v14

    .line 37
    iget-object v6, v14, La/aqq;->h:La/cqq;

    .line 38
    .line 39
    iget-object v12, v14, La/aqq;->i:La/cqq;

    .line 40
    .line 41
    if-ne v1, v15, :cond_0

    .line 42
    .line 43
    iget-object v6, v14, La/aqq;->b:La/cqq;

    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_0
    if-ne v1, v11, :cond_1

    .line 48
    .line 49
    iget-object v6, v14, La/aqq;->c:La/cqq;

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    if-ne v1, v10, :cond_2

    .line 54
    .line 55
    iget-object v6, v14, La/aqq;->d:La/cqq;

    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_2
    if-ne v1, v9, :cond_3

    .line 60
    .line 61
    iget-object v6, v14, La/aqq;->e:La/cqq;

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_3
    if-ne v1, v8, :cond_7

    .line 66
    .line 67
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-eqz v9, :cond_5

    .line 72
    .line 73
    if-ne v9, v15, :cond_4

    .line 74
    .line 75
    move-object v6, v12

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 78
    .line 79
    .line 80
    return-object v17

    .line 81
    :cond_5
    :goto_0
    sget-object v9, La/cqq;->b:La/cqq;

    .line 82
    .line 83
    if-ne v6, v9, :cond_6

    .line 84
    .line 85
    move-object/from16 v6, v17

    .line 86
    .line 87
    :cond_6
    if-nez v6, :cond_10

    .line 88
    .line 89
    iget-object v6, v14, La/aqq;->f:La/cqq;

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_7
    if-ne v1, v7, :cond_b

    .line 93
    .line 94
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    if-eqz v9, :cond_9

    .line 99
    .line 100
    if-ne v9, v15, :cond_8

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 104
    .line 105
    .line 106
    return-object v17

    .line 107
    :cond_9
    move-object v6, v12

    .line 108
    :goto_1
    sget-object v9, La/cqq;->b:La/cqq;

    .line 109
    .line 110
    if-ne v6, v9, :cond_a

    .line 111
    .line 112
    move-object/from16 v6, v17

    .line 113
    .line 114
    :cond_a
    if-nez v6, :cond_10

    .line 115
    .line 116
    iget-object v6, v14, La/aqq;->g:La/cqq;

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_b
    const/4 v6, 0x7

    .line 120
    if-ne v1, v6, :cond_c

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_c
    const/16 v9, 0x8

    .line 124
    .line 125
    if-ne v1, v9, :cond_24

    .line 126
    .line 127
    :goto_2
    new-instance v9, La/d5a;

    .line 128
    .line 129
    invoke-direct {v9, v1}, La/d5a;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-static {v5}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    invoke-interface {v12}, La/cg80;->getFocusOwner()La/wpq;

    .line 137
    .line 138
    .line 139
    move-result-object v12

    .line 140
    check-cast v12, La/ypq;

    .line 141
    .line 142
    invoke-virtual {v12}, La/ypq;->h()La/nqq;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    if-ne v1, v6, :cond_d

    .line 147
    .line 148
    iget-object v6, v14, La/aqq;->j:Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    invoke-interface {v6, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_d
    iget-object v6, v14, La/aqq;->k:Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    invoke-interface {v6, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    :goto_3
    iget-boolean v6, v9, La/d5a;->b:Z

    .line 160
    .line 161
    if-eqz v6, :cond_e

    .line 162
    .line 163
    sget-object v6, La/cqq;->c:La/cqq;

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_e
    invoke-virtual {v12}, La/ypq;->h()La/nqq;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    if-eq v10, v6, :cond_f

    .line 171
    .line 172
    sget-object v6, La/cqq;->d:La/cqq;

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_f
    sget-object v6, La/cqq;->b:La/cqq;

    .line 176
    .line 177
    :cond_10
    :goto_4
    sget-object v9, La/cqq;->c:La/cqq;

    .line 178
    .line 179
    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v10

    .line 183
    if-eqz v10, :cond_11

    .line 184
    .line 185
    goto/16 :goto_11

    .line 186
    .line 187
    :cond_11
    sget-object v10, La/cqq;->d:La/cqq;

    .line 188
    .line 189
    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_12

    .line 194
    .line 195
    invoke-static {v4}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_31

    .line 200
    .line 201
    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Ljava/lang/Boolean;

    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_12
    sget-object v10, La/cqq;->b:La/cqq;

    .line 209
    .line 210
    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    if-nez v12, :cond_26

    .line 215
    .line 216
    const-string v0, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 217
    .line 218
    if-eq v6, v10, :cond_23

    .line 219
    .line 220
    if-eq v6, v9, :cond_22

    .line 221
    .line 222
    iget-object v0, v6, La/cqq;->a:La/xz40;

    .line 223
    .line 224
    iget v1, v0, La/xz40;->c:I

    .line 225
    .line 226
    if-nez v1, :cond_13

    .line 227
    .line 228
    const-string v0, "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 229
    .line 230
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 231
    .line 232
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    goto/16 :goto_c

    .line 236
    .line 237
    :cond_13
    iget-object v0, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 238
    .line 239
    move/from16 v2, v16

    .line 240
    .line 241
    move v4, v2

    .line 242
    :goto_5
    if-ge v2, v1, :cond_21

    .line 243
    .line 244
    aget-object v5, v0, v2

    .line 245
    .line 246
    check-cast v5, La/eqq;

    .line 247
    .line 248
    move-object v6, v5

    .line 249
    check-cast v6, La/lm40;

    .line 250
    .line 251
    iget-object v6, v6, La/lm40;->a:La/lm40;

    .line 252
    .line 253
    iget-boolean v6, v6, La/lm40;->n:Z

    .line 254
    .line 255
    if-nez v6, :cond_14

    .line 256
    .line 257
    const-string v6, "visitChildren called on an unattached node"

    .line 258
    .line 259
    invoke-static {v6}, La/xcx;->b(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_14
    new-instance v6, La/xz40;

    .line 263
    .line 264
    const/16 v7, 0x10

    .line 265
    .line 266
    new-array v8, v7, [La/lm40;

    .line 267
    .line 268
    invoke-direct {v6, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    check-cast v5, La/lm40;

    .line 272
    .line 273
    iget-object v5, v5, La/lm40;->a:La/lm40;

    .line 274
    .line 275
    iget-object v7, v5, La/lm40;->f:La/lm40;

    .line 276
    .line 277
    if-nez v7, :cond_15

    .line 278
    .line 279
    invoke-static {v6, v5}, La/vcc;->v(La/xz40;La/lm40;)V

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :cond_15
    invoke-virtual {v6, v7}, La/xz40;->b(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_16
    :goto_6
    iget v5, v6, La/xz40;->c:I

    .line 287
    .line 288
    if-eqz v5, :cond_20

    .line 289
    .line 290
    add-int/lit8 v5, v5, -0x1

    .line 291
    .line 292
    invoke-virtual {v6, v5}, La/xz40;->k(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    check-cast v5, La/lm40;

    .line 297
    .line 298
    iget v7, v5, La/lm40;->d:I

    .line 299
    .line 300
    and-int/lit16 v7, v7, 0x400

    .line 301
    .line 302
    if-nez v7, :cond_17

    .line 303
    .line 304
    invoke-static {v6, v5}, La/vcc;->v(La/xz40;La/lm40;)V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :cond_17
    :goto_7
    if-eqz v5, :cond_16

    .line 309
    .line 310
    iget v7, v5, La/lm40;->c:I

    .line 311
    .line 312
    and-int/lit16 v7, v7, 0x400

    .line 313
    .line 314
    if-eqz v7, :cond_1f

    .line 315
    .line 316
    move-object/from16 v7, v17

    .line 317
    .line 318
    :goto_8
    if-eqz v5, :cond_16

    .line 319
    .line 320
    instance-of v8, v5, La/nqq;

    .line 321
    .line 322
    if-eqz v8, :cond_18

    .line 323
    .line 324
    check-cast v5, La/nqq;

    .line 325
    .line 326
    invoke-interface {v3, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    check-cast v5, Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_1e

    .line 337
    .line 338
    move v4, v15

    .line 339
    goto :goto_b

    .line 340
    :cond_18
    iget v8, v5, La/lm40;->c:I

    .line 341
    .line 342
    and-int/lit16 v8, v8, 0x400

    .line 343
    .line 344
    if-eqz v8, :cond_1e

    .line 345
    .line 346
    instance-of v8, v5, La/f3k;

    .line 347
    .line 348
    if-eqz v8, :cond_1e

    .line 349
    .line 350
    move-object v8, v5

    .line 351
    check-cast v8, La/f3k;

    .line 352
    .line 353
    iget-object v8, v8, La/f3k;->p:La/lm40;

    .line 354
    .line 355
    move/from16 v9, v16

    .line 356
    .line 357
    :goto_9
    if-eqz v8, :cond_1d

    .line 358
    .line 359
    iget v10, v8, La/lm40;->c:I

    .line 360
    .line 361
    and-int/lit16 v10, v10, 0x400

    .line 362
    .line 363
    if-eqz v10, :cond_1c

    .line 364
    .line 365
    add-int/lit8 v9, v9, 0x1

    .line 366
    .line 367
    if-ne v9, v15, :cond_19

    .line 368
    .line 369
    move-object v5, v8

    .line 370
    goto :goto_a

    .line 371
    :cond_19
    if-nez v7, :cond_1a

    .line 372
    .line 373
    new-instance v7, La/xz40;

    .line 374
    .line 375
    const/16 v10, 0x10

    .line 376
    .line 377
    new-array v11, v10, [La/lm40;

    .line 378
    .line 379
    invoke-direct {v7, v11}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    :cond_1a
    if-eqz v5, :cond_1b

    .line 383
    .line 384
    invoke-virtual {v7, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    move-object/from16 v5, v17

    .line 388
    .line 389
    :cond_1b
    invoke-virtual {v7, v8}, La/xz40;->b(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :cond_1c
    :goto_a
    iget-object v8, v8, La/lm40;->f:La/lm40;

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_1d
    if-ne v9, v15, :cond_1e

    .line 396
    .line 397
    goto :goto_8

    .line 398
    :cond_1e
    invoke-static {v7}, La/vcc;->V(La/xz40;)La/lm40;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    goto :goto_8

    .line 403
    :cond_1f
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_20
    :goto_b
    add-int/lit8 v2, v2, 0x1

    .line 407
    .line 408
    goto/16 :goto_5

    .line 409
    .line 410
    :cond_21
    move/from16 v16, v4

    .line 411
    .line 412
    :goto_c
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    return-object v0

    .line 417
    :cond_22
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    return-object v17

    .line 421
    :cond_23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    return-object v17

    .line 425
    :cond_24
    const-string v0, "invalid FocusDirection"

    .line 426
    .line 427
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-object v17

    .line 431
    :cond_25
    move-object/from16 v5, v17

    .line 432
    .line 433
    :cond_26
    invoke-interface {v13}, La/cg80;->getLayoutDirection()La/k6z;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    new-instance v9, La/f8m;

    .line 438
    .line 439
    const/16 v10, 0x17

    .line 440
    .line 441
    invoke-direct {v9, v5, v0, v3, v10}, La/f8m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 442
    .line 443
    .line 444
    if-ne v1, v15, :cond_27

    .line 445
    .line 446
    goto :goto_d

    .line 447
    :cond_27
    if-ne v1, v11, :cond_2a

    .line 448
    .line 449
    :goto_d
    if-ne v1, v15, :cond_28

    .line 450
    .line 451
    invoke-static {v4, v9}, La/ydx;->H(La/nqq;La/f8m;)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    goto :goto_e

    .line 456
    :cond_28
    if-ne v1, v11, :cond_29

    .line 457
    .line 458
    invoke-static {v4, v9}, La/ydx;->v(La/nqq;La/f8m;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    :goto_e
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    return-object v0

    .line 467
    :cond_29
    const-string v0, "This function should only be used for 1-D focus search"

    .line 468
    .line 469
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    return-object v17

    .line 473
    :cond_2a
    if-ne v1, v8, :cond_2b

    .line 474
    .line 475
    goto :goto_f

    .line 476
    :cond_2b
    if-ne v1, v7, :cond_2c

    .line 477
    .line 478
    goto :goto_f

    .line 479
    :cond_2c
    const/4 v0, 0x5

    .line 480
    if-ne v1, v0, :cond_2d

    .line 481
    .line 482
    goto :goto_f

    .line 483
    :cond_2d
    const/4 v0, 0x6

    .line 484
    if-ne v1, v0, :cond_2e

    .line 485
    .line 486
    :goto_f
    invoke-static {v1, v9, v4, v2}, La/k7n0;->G(ILa/f8m;La/nqq;La/jge0;)Ljava/lang/Boolean;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    return-object v0

    .line 491
    :cond_2e
    const/4 v0, 0x7

    .line 492
    if-ne v1, v0, :cond_32

    .line 493
    .line 494
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 495
    .line 496
    .line 497
    move-result v0

    .line 498
    if-eqz v0, :cond_30

    .line 499
    .line 500
    if-ne v0, v15, :cond_2f

    .line 501
    .line 502
    move v7, v8

    .line 503
    goto :goto_10

    .line 504
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 505
    .line 506
    .line 507
    return-object v17

    .line 508
    :cond_30
    :goto_10
    invoke-static {v4}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    if-eqz v0, :cond_31

    .line 513
    .line 514
    invoke-static {v7, v9, v0, v2}, La/k7n0;->G(ILa/f8m;La/nqq;La/jge0;)Ljava/lang/Boolean;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    return-object v0

    .line 519
    :cond_31
    :goto_11
    return-object v17

    .line 520
    :cond_32
    const/16 v0, 0x8

    .line 521
    .line 522
    if-ne v1, v0, :cond_41

    .line 523
    .line 524
    invoke-static {v4}, La/uzb;->Z(La/nqq;)La/nqq;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    if-eqz v0, :cond_3f

    .line 529
    .line 530
    iget-object v1, v0, La/lm40;->a:La/lm40;

    .line 531
    .line 532
    iget-boolean v1, v1, La/lm40;->n:Z

    .line 533
    .line 534
    if-nez v1, :cond_33

    .line 535
    .line 536
    const-string v1, "visitAncestors called on an unattached node"

    .line 537
    .line 538
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    :cond_33
    iget-object v1, v0, La/lm40;->a:La/lm40;

    .line 542
    .line 543
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 544
    .line 545
    invoke-static {v0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    :goto_12
    if-eqz v0, :cond_3f

    .line 550
    .line 551
    iget-object v2, v0, La/e7z;->h1:La/tzi;

    .line 552
    .line 553
    iget-object v2, v2, La/tzi;->g:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v2, La/lm40;

    .line 556
    .line 557
    iget v2, v2, La/lm40;->d:I

    .line 558
    .line 559
    and-int/lit16 v2, v2, 0x400

    .line 560
    .line 561
    if-eqz v2, :cond_3d

    .line 562
    .line 563
    :goto_13
    if-eqz v1, :cond_3d

    .line 564
    .line 565
    iget v2, v1, La/lm40;->c:I

    .line 566
    .line 567
    and-int/lit16 v2, v2, 0x400

    .line 568
    .line 569
    if-eqz v2, :cond_3c

    .line 570
    .line 571
    move-object v2, v1

    .line 572
    move-object/from16 v3, v17

    .line 573
    .line 574
    :goto_14
    if-eqz v2, :cond_3c

    .line 575
    .line 576
    instance-of v5, v2, La/nqq;

    .line 577
    .line 578
    if-eqz v5, :cond_35

    .line 579
    .line 580
    check-cast v2, La/nqq;

    .line 581
    .line 582
    invoke-virtual {v2}, La/nqq;->b1()La/aqq;

    .line 583
    .line 584
    .line 585
    move-result-object v5

    .line 586
    iget-boolean v5, v5, La/aqq;->a:Z

    .line 587
    .line 588
    if-eqz v5, :cond_34

    .line 589
    .line 590
    move-object v15, v2

    .line 591
    goto/16 :goto_19

    .line 592
    .line 593
    :cond_34
    const/16 v7, 0x10

    .line 594
    .line 595
    goto :goto_18

    .line 596
    :cond_35
    iget v5, v2, La/lm40;->c:I

    .line 597
    .line 598
    and-int/lit16 v5, v5, 0x400

    .line 599
    .line 600
    if-eqz v5, :cond_34

    .line 601
    .line 602
    instance-of v5, v2, La/f3k;

    .line 603
    .line 604
    if-eqz v5, :cond_34

    .line 605
    .line 606
    move-object v5, v2

    .line 607
    check-cast v5, La/f3k;

    .line 608
    .line 609
    iget-object v5, v5, La/f3k;->p:La/lm40;

    .line 610
    .line 611
    move/from16 v6, v16

    .line 612
    .line 613
    :goto_15
    if-eqz v5, :cond_3a

    .line 614
    .line 615
    iget v7, v5, La/lm40;->c:I

    .line 616
    .line 617
    and-int/lit16 v7, v7, 0x400

    .line 618
    .line 619
    if-eqz v7, :cond_36

    .line 620
    .line 621
    add-int/lit8 v6, v6, 0x1

    .line 622
    .line 623
    if-ne v6, v15, :cond_37

    .line 624
    .line 625
    move-object v2, v5

    .line 626
    :cond_36
    const/16 v7, 0x10

    .line 627
    .line 628
    goto :goto_17

    .line 629
    :cond_37
    if-nez v3, :cond_38

    .line 630
    .line 631
    new-instance v3, La/xz40;

    .line 632
    .line 633
    const/16 v7, 0x10

    .line 634
    .line 635
    new-array v8, v7, [La/lm40;

    .line 636
    .line 637
    invoke-direct {v3, v8}, La/xz40;-><init>([Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    goto :goto_16

    .line 641
    :cond_38
    const/16 v7, 0x10

    .line 642
    .line 643
    :goto_16
    if-eqz v2, :cond_39

    .line 644
    .line 645
    invoke-virtual {v3, v2}, La/xz40;->b(Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    move-object/from16 v2, v17

    .line 649
    .line 650
    :cond_39
    invoke-virtual {v3, v5}, La/xz40;->b(Ljava/lang/Object;)V

    .line 651
    .line 652
    .line 653
    :goto_17
    iget-object v5, v5, La/lm40;->f:La/lm40;

    .line 654
    .line 655
    goto :goto_15

    .line 656
    :cond_3a
    const/16 v7, 0x10

    .line 657
    .line 658
    if-ne v6, v15, :cond_3b

    .line 659
    .line 660
    goto :goto_14

    .line 661
    :cond_3b
    :goto_18
    invoke-static {v3}, La/vcc;->V(La/xz40;)La/lm40;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    goto :goto_14

    .line 666
    :cond_3c
    const/16 v7, 0x10

    .line 667
    .line 668
    iget-object v1, v1, La/lm40;->e:La/lm40;

    .line 669
    .line 670
    goto :goto_13

    .line 671
    :cond_3d
    const/16 v7, 0x10

    .line 672
    .line 673
    invoke-virtual {v0}, La/e7z;->v()La/e7z;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    if-eqz v0, :cond_3e

    .line 678
    .line 679
    iget-object v1, v0, La/e7z;->h1:La/tzi;

    .line 680
    .line 681
    if-eqz v1, :cond_3e

    .line 682
    .line 683
    iget-object v1, v1, La/tzi;->f:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v1, La/wso0;

    .line 686
    .line 687
    goto/16 :goto_12

    .line 688
    .line 689
    :cond_3e
    move-object/from16 v1, v17

    .line 690
    .line 691
    goto/16 :goto_12

    .line 692
    .line 693
    :cond_3f
    move-object/from16 v15, v17

    .line 694
    .line 695
    :goto_19
    if-eqz v15, :cond_40

    .line 696
    .line 697
    if-eq v15, v4, :cond_40

    .line 698
    .line 699
    invoke-virtual {v9, v15}, La/f8m;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    check-cast v0, Ljava/lang/Boolean;

    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 706
    .line 707
    .line 708
    move-result v16

    .line 709
    :cond_40
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    return-object v0

    .line 714
    :cond_41
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 715
    .line 716
    invoke-static {v1}, La/jpq;->a(I)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    const-string v2, "Focus search invoked with invalid FocusDirection "

    .line 721
    .line 722
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    throw v0
.end method

.method public final h()La/nqq;
    .locals 2

    .line 1
    iget-object p0, p0, La/ypq;->h:La/nqq;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/lm40;->n:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final i(IZ)Z
    .locals 7

    .line 1
    sget-boolean v0, La/ebc;->a:Z

    .line 2
    .line 3
    iget-object v1, p0, La/ypq;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, v0, La/nqq;->o:Z

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->u(I)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :cond_0
    new-instance v0, La/mie0;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    iput-object v3, v0, La/mie0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v1}, La/sv90;->getEmbeddedViewFocusRect()La/jge0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    new-instance v5, La/z08;

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    invoke-direct {v5, v0, p1, v6}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1, v4, v5}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, La/ypq;->h()La/nqq;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-eq v3, v5, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    const/4 v3, 0x0

    .line 69
    if-eqz v4, :cond_8

    .line 70
    .line 71
    iget-object v5, v0, La/mie0;->a:Ljava/lang/Object;

    .line 72
    .line 73
    if-nez v5, :cond_2

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    if-ne p1, v2, :cond_4

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    const/4 v0, 0x2

    .line 97
    if-ne p1, v0, :cond_6

    .line 98
    .line 99
    :goto_0
    if-eqz p2, :cond_6

    .line 100
    .line 101
    invoke-virtual {p0, p1, v3, v3}, La/ypq;->d(IZZ)Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    if-eqz p2, :cond_8

    .line 106
    .line 107
    new-instance p2, La/dx2;

    .line 108
    .line 109
    const/16 v0, 0xf

    .line 110
    .line 111
    invoke-direct {p2, p1, v0}, La/dx2;-><init>(IB)V

    .line 112
    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    invoke-virtual {p0, p1, v0, p2}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    move p0, v3

    .line 127
    :goto_1
    if-eqz p0, :cond_8

    .line 128
    .line 129
    :goto_2
    return v2

    .line 130
    :cond_6
    sget-boolean p0, La/ebc;->a:Z

    .line 131
    .line 132
    if-eqz p0, :cond_7

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_7
    invoke-virtual {v1, p1}, Landroidx/compose/ui/platform/AndroidComposeView;->u(I)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    return p0

    .line 140
    :cond_8
    :goto_3
    return v3
.end method

.method public final j(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0, v0}, La/ypq;->d(IZZ)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    new-instance v1, La/dx2;

    .line 10
    .line 11
    const/16 v2, 0xe

    .line 12
    .line 13
    invoke-direct {v1, p1, v2}, La/dx2;-><init>(IB)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {p0, p1, v2, v1}, La/ypq;->g(ILa/jge0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    :cond_1
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, La/ypq;->e()V

    .line 30
    .line 31
    .line 32
    :cond_2
    return v0
.end method

.method public final k(La/nqq;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/ypq;->h:La/nqq;

    .line 2
    .line 3
    iput-object p1, p0, La/ypq;->h:La/nqq;

    .line 4
    .line 5
    iget-object p0, p0, La/ypq;->g:La/vy40;

    .line 6
    .line 7
    iget-object v1, p0, La/vy40;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    iget p0, p0, La/vy40;->b:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, p0, :cond_0

    .line 13
    .line 14
    aget-object v3, v1, v2

    .line 15
    .line 16
    check-cast v3, La/upq;

    .line 17
    .line 18
    invoke-interface {v3, v0, p1}, La/upq;->a(La/nqq;La/nqq;)V

    .line 19
    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final l(Landroid/view/KeyEvent;)Z
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, La/n7x;->C(Landroid/view/KeyEvent;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static/range {p1 .. p1}, La/n7x;->H(Landroid/view/KeyEvent;)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x2

    .line 12
    const v10, -0x3361d2af    # -8.293031E7f

    .line 13
    .line 14
    .line 15
    const-wide/16 v15, 0x0

    .line 16
    .line 17
    const-wide v17, 0x101010101010101L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide/16 v19, 0xfe

    .line 23
    .line 24
    const/16 p1, 0x6

    .line 25
    .line 26
    const/16 v5, 0x8

    .line 27
    .line 28
    const/16 v21, 0x0

    .line 29
    .line 30
    const-wide/16 v22, 0x1

    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/4 v7, 0x1

    .line 34
    if-ne v3, v4, :cond_10

    .line 35
    .line 36
    iget-object v3, v0, La/ypq;->f:La/ky40;

    .line 37
    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    new-instance v3, La/ky40;

    .line 41
    .line 42
    invoke-direct {v3, v6}, La/ky40;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object v3, v0, La/ypq;->f:La/ky40;

    .line 46
    .line 47
    :cond_0
    move-object v4, v3

    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    ushr-int/lit8 v3, v0, 0x10

    .line 53
    .line 54
    xor-int/2addr v0, v3

    .line 55
    mul-int/2addr v0, v10

    .line 56
    ushr-int/lit8 v3, v0, 0x10

    .line 57
    .line 58
    xor-int/2addr v0, v3

    .line 59
    ushr-int/lit8 v3, v0, 0x7

    .line 60
    .line 61
    and-int/lit8 v0, v0, 0x7f

    .line 62
    .line 63
    move/from16 v24, v6

    .line 64
    .line 65
    iget v6, v4, La/ky40;->c:I

    .line 66
    .line 67
    and-int v25, v3, v6

    .line 68
    .line 69
    move/from16 v26, v21

    .line 70
    .line 71
    const/16 v27, 0x3f

    .line 72
    .line 73
    :goto_0
    iget-object v8, v4, La/ky40;->a:[J

    .line 74
    .line 75
    shr-int/lit8 v28, v25, 0x3

    .line 76
    .line 77
    and-int/lit8 v29, v25, 0x7

    .line 78
    .line 79
    const/16 v30, 0x7

    .line 80
    .line 81
    shl-int/lit8 v9, v29, 0x3

    .line 82
    .line 83
    aget-wide v31, v8, v28

    .line 84
    .line 85
    ushr-long v31, v31, v9

    .line 86
    .line 87
    add-int/lit8 v28, v28, 0x1

    .line 88
    .line 89
    aget-wide v28, v8, v28

    .line 90
    .line 91
    rsub-int/lit8 v8, v9, 0x40

    .line 92
    .line 93
    shl-long v28, v28, v8

    .line 94
    .line 95
    int-to-long v8, v9

    .line 96
    neg-long v8, v8

    .line 97
    shr-long v8, v8, v27

    .line 98
    .line 99
    and-long v8, v28, v8

    .line 100
    .line 101
    or-long v8, v31, v8

    .line 102
    .line 103
    move/from16 v28, v10

    .line 104
    .line 105
    const-wide/16 v31, 0xff

    .line 106
    .line 107
    int-to-long v10, v0

    .line 108
    mul-long v33, v10, v17

    .line 109
    .line 110
    const-wide v35, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    xor-long v13, v8, v33

    .line 116
    .line 117
    sub-long v33, v13, v17

    .line 118
    .line 119
    not-long v12, v13

    .line 120
    and-long v12, v33, v12

    .line 121
    .line 122
    and-long v12, v12, v35

    .line 123
    .line 124
    :goto_1
    cmp-long v14, v12, v15

    .line 125
    .line 126
    if-eqz v14, :cond_2

    .line 127
    .line 128
    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    shr-int/lit8 v14, v14, 0x3

    .line 133
    .line 134
    add-int v14, v25, v14

    .line 135
    .line 136
    and-int/2addr v14, v6

    .line 137
    move-wide/from16 v33, v15

    .line 138
    .line 139
    iget-object v15, v4, La/ky40;->b:[J

    .line 140
    .line 141
    aget-wide v37, v15, v14

    .line 142
    .line 143
    cmp-long v15, v37, v1

    .line 144
    .line 145
    if-nez v15, :cond_1

    .line 146
    .line 147
    move/from16 v37, v7

    .line 148
    .line 149
    goto/16 :goto_a

    .line 150
    .line 151
    :cond_1
    sub-long v14, v12, v22

    .line 152
    .line 153
    and-long/2addr v12, v14

    .line 154
    move-wide/from16 v15, v33

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_2
    move-wide/from16 v33, v15

    .line 158
    .line 159
    not-long v12, v8

    .line 160
    shl-long v12, v12, p1

    .line 161
    .line 162
    and-long/2addr v8, v12

    .line 163
    and-long v8, v8, v35

    .line 164
    .line 165
    cmp-long v8, v8, v33

    .line 166
    .line 167
    if-eqz v8, :cond_f

    .line 168
    .line 169
    invoke-virtual {v4, v3}, La/ky40;->b(I)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v6, v4, La/ky40;->e:I

    .line 174
    .line 175
    if-nez v6, :cond_3

    .line 176
    .line 177
    iget-object v6, v4, La/ky40;->a:[J

    .line 178
    .line 179
    shr-int/lit8 v12, v0, 0x3

    .line 180
    .line 181
    aget-wide v12, v6, v12

    .line 182
    .line 183
    and-int/lit8 v6, v0, 0x7

    .line 184
    .line 185
    shl-int/lit8 v6, v6, 0x3

    .line 186
    .line 187
    shr-long/2addr v12, v6

    .line 188
    and-long v12, v12, v31

    .line 189
    .line 190
    cmp-long v6, v12, v19

    .line 191
    .line 192
    if-nez v6, :cond_4

    .line 193
    .line 194
    :cond_3
    move/from16 v37, v7

    .line 195
    .line 196
    const-wide/16 p0, 0x80

    .line 197
    .line 198
    goto/16 :goto_9

    .line 199
    .line 200
    :cond_4
    iget v0, v4, La/ky40;->c:I

    .line 201
    .line 202
    if-le v0, v5, :cond_c

    .line 203
    .line 204
    iget v6, v4, La/ky40;->d:I

    .line 205
    .line 206
    int-to-long v12, v6

    .line 207
    sget-object v6, La/h2t0;->b:La/g2t0;

    .line 208
    .line 209
    const-wide/16 v14, 0x20

    .line 210
    .line 211
    mul-long/2addr v12, v14

    .line 212
    int-to-long v14, v0

    .line 213
    const-wide/16 v16, 0x19

    .line 214
    .line 215
    mul-long v14, v14, v16

    .line 216
    .line 217
    const-wide/high16 v16, -0x8000000000000000L

    .line 218
    .line 219
    xor-long v12, v12, v16

    .line 220
    .line 221
    xor-long v14, v14, v16

    .line 222
    .line 223
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Long;->compare(JJ)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-gtz v0, :cond_c

    .line 228
    .line 229
    iget-object v0, v4, La/ky40;->a:[J

    .line 230
    .line 231
    iget v6, v4, La/ky40;->c:I

    .line 232
    .line 233
    iget-object v12, v4, La/ky40;->b:[J

    .line 234
    .line 235
    add-int/lit8 v13, v6, 0x7

    .line 236
    .line 237
    shr-int/lit8 v13, v13, 0x3

    .line 238
    .line 239
    move/from16 v14, v21

    .line 240
    .line 241
    :goto_2
    if-ge v14, v13, :cond_5

    .line 242
    .line 243
    aget-wide v22, v0, v14

    .line 244
    .line 245
    const-wide/16 p0, 0x80

    .line 246
    .line 247
    and-long v8, v22, v35

    .line 248
    .line 249
    move v15, v5

    .line 250
    move/from16 v18, v6

    .line 251
    .line 252
    not-long v5, v8

    .line 253
    ushr-long v8, v8, v30

    .line 254
    .line 255
    add-long/2addr v5, v8

    .line 256
    const-wide v8, -0x101010101010102L

    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    and-long/2addr v5, v8

    .line 262
    aput-wide v5, v0, v14

    .line 263
    .line 264
    add-int/lit8 v14, v14, 0x1

    .line 265
    .line 266
    move v5, v15

    .line 267
    move/from16 v6, v18

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_5
    move v15, v5

    .line 271
    move/from16 v18, v6

    .line 272
    .line 273
    const-wide/16 p0, 0x80

    .line 274
    .line 275
    invoke-static {v0}, La/tx3;->D([J)I

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    add-int/lit8 v6, v5, -0x1

    .line 280
    .line 281
    aget-wide v8, v0, v6

    .line 282
    .line 283
    const-wide v13, 0xffffffffffffffL

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    and-long/2addr v8, v13

    .line 289
    const-wide/high16 v22, -0x100000000000000L

    .line 290
    .line 291
    or-long v8, v8, v22

    .line 292
    .line 293
    aput-wide v8, v0, v6

    .line 294
    .line 295
    aget-wide v8, v0, v21

    .line 296
    .line 297
    aput-wide v8, v0, v5

    .line 298
    .line 299
    move/from16 v5, v18

    .line 300
    .line 301
    move/from16 v6, v21

    .line 302
    .line 303
    :goto_3
    if-eq v6, v5, :cond_a

    .line 304
    .line 305
    shr-int/lit8 v8, v6, 0x3

    .line 306
    .line 307
    aget-wide v22, v0, v8

    .line 308
    .line 309
    and-int/lit8 v9, v6, 0x7

    .line 310
    .line 311
    shl-int/lit8 v9, v9, 0x3

    .line 312
    .line 313
    shr-long v22, v22, v9

    .line 314
    .line 315
    and-long v22, v22, v31

    .line 316
    .line 317
    cmp-long v18, v22, p0

    .line 318
    .line 319
    if-nez v18, :cond_6

    .line 320
    .line 321
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 322
    .line 323
    goto :goto_3

    .line 324
    :cond_6
    cmp-long v18, v22, v19

    .line 325
    .line 326
    if-eqz v18, :cond_7

    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_7
    aget-wide v22, v12, v6

    .line 330
    .line 331
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->hashCode(J)I

    .line 332
    .line 333
    .line 334
    move-result v18

    .line 335
    ushr-int/lit8 v22, v18, 0x10

    .line 336
    .line 337
    xor-int v18, v18, v22

    .line 338
    .line 339
    mul-int v18, v18, v28

    .line 340
    .line 341
    ushr-int/lit8 v22, v18, 0x10

    .line 342
    .line 343
    xor-int v18, v18, v22

    .line 344
    .line 345
    move-wide/from16 v22, v13

    .line 346
    .line 347
    ushr-int/lit8 v13, v18, 0x7

    .line 348
    .line 349
    invoke-virtual {v4, v13}, La/ky40;->b(I)I

    .line 350
    .line 351
    .line 352
    move-result v14

    .line 353
    and-int/2addr v13, v5

    .line 354
    sub-int v25, v14, v13

    .line 355
    .line 356
    and-int v25, v25, v5

    .line 357
    .line 358
    move/from16 v29, v15

    .line 359
    .line 360
    div-int/lit8 v15, v25, 0x8

    .line 361
    .line 362
    sub-int v13, v6, v13

    .line 363
    .line 364
    and-int/2addr v13, v5

    .line 365
    div-int/lit8 v13, v13, 0x8

    .line 366
    .line 367
    if-ne v15, v13, :cond_8

    .line 368
    .line 369
    and-int/lit8 v13, v18, 0x7f

    .line 370
    .line 371
    int-to-long v13, v13

    .line 372
    aget-wide v25, v0, v8

    .line 373
    .line 374
    move v15, v7

    .line 375
    move/from16 v27, v8

    .line 376
    .line 377
    shl-long v7, v31, v9

    .line 378
    .line 379
    not-long v7, v7

    .line 380
    and-long v7, v25, v7

    .line 381
    .line 382
    shl-long/2addr v13, v9

    .line 383
    or-long/2addr v7, v13

    .line 384
    aput-wide v7, v0, v27

    .line 385
    .line 386
    array-length v7, v0

    .line 387
    sub-int/2addr v7, v15

    .line 388
    aget-wide v8, v0, v21

    .line 389
    .line 390
    and-long v8, v8, v22

    .line 391
    .line 392
    or-long v8, v8, v16

    .line 393
    .line 394
    aput-wide v8, v0, v7

    .line 395
    .line 396
    add-int/lit8 v6, v6, 0x1

    .line 397
    .line 398
    move v7, v15

    .line 399
    move-wide/from16 v13, v22

    .line 400
    .line 401
    move/from16 v15, v29

    .line 402
    .line 403
    goto :goto_3

    .line 404
    :cond_8
    move v15, v7

    .line 405
    move/from16 v27, v8

    .line 406
    .line 407
    shr-int/lit8 v7, v14, 0x3

    .line 408
    .line 409
    aget-wide v25, v0, v7

    .line 410
    .line 411
    and-int/lit8 v8, v14, 0x7

    .line 412
    .line 413
    shl-int/lit8 v8, v8, 0x3

    .line 414
    .line 415
    shr-long v35, v25, v8

    .line 416
    .line 417
    and-long v35, v35, v31

    .line 418
    .line 419
    cmp-long v13, v35, p0

    .line 420
    .line 421
    if-nez v13, :cond_9

    .line 422
    .line 423
    and-int/lit8 v13, v18, 0x7f

    .line 424
    .line 425
    move/from16 v35, v5

    .line 426
    .line 427
    move/from16 v36, v6

    .line 428
    .line 429
    int-to-long v5, v13

    .line 430
    move-wide/from16 v37, v5

    .line 431
    .line 432
    shl-long v5, v31, v8

    .line 433
    .line 434
    not-long v5, v5

    .line 435
    and-long v5, v25, v5

    .line 436
    .line 437
    shl-long v25, v37, v8

    .line 438
    .line 439
    or-long v5, v5, v25

    .line 440
    .line 441
    aput-wide v5, v0, v7

    .line 442
    .line 443
    aget-wide v5, v0, v27

    .line 444
    .line 445
    shl-long v7, v31, v9

    .line 446
    .line 447
    not-long v7, v7

    .line 448
    and-long/2addr v5, v7

    .line 449
    shl-long v7, p0, v9

    .line 450
    .line 451
    or-long/2addr v5, v7

    .line 452
    aput-wide v5, v0, v27

    .line 453
    .line 454
    aget-wide v5, v12, v36

    .line 455
    .line 456
    aput-wide v5, v12, v14

    .line 457
    .line 458
    aput-wide v33, v12, v36

    .line 459
    .line 460
    move/from16 v6, v36

    .line 461
    .line 462
    goto :goto_5

    .line 463
    :cond_9
    move/from16 v35, v5

    .line 464
    .line 465
    move/from16 v36, v6

    .line 466
    .line 467
    and-int/lit8 v5, v18, 0x7f

    .line 468
    .line 469
    int-to-long v5, v5

    .line 470
    move-wide/from16 v37, v5

    .line 471
    .line 472
    shl-long v5, v31, v8

    .line 473
    .line 474
    not-long v5, v5

    .line 475
    and-long v5, v25, v5

    .line 476
    .line 477
    shl-long v8, v37, v8

    .line 478
    .line 479
    or-long/2addr v5, v8

    .line 480
    aput-wide v5, v0, v7

    .line 481
    .line 482
    aget-wide v5, v12, v14

    .line 483
    .line 484
    aget-wide v7, v12, v36

    .line 485
    .line 486
    aput-wide v7, v12, v14

    .line 487
    .line 488
    aput-wide v5, v12, v36

    .line 489
    .line 490
    add-int/lit8 v6, v36, -0x1

    .line 491
    .line 492
    :goto_5
    array-length v5, v0

    .line 493
    sub-int/2addr v5, v15

    .line 494
    aget-wide v7, v0, v21

    .line 495
    .line 496
    and-long v7, v7, v22

    .line 497
    .line 498
    or-long v7, v7, v16

    .line 499
    .line 500
    aput-wide v7, v0, v5

    .line 501
    .line 502
    add-int/2addr v6, v15

    .line 503
    move v7, v15

    .line 504
    move-wide/from16 v13, v22

    .line 505
    .line 506
    move/from16 v15, v29

    .line 507
    .line 508
    move/from16 v5, v35

    .line 509
    .line 510
    goto/16 :goto_3

    .line 511
    .line 512
    :cond_a
    move v15, v7

    .line 513
    iget v0, v4, La/ky40;->c:I

    .line 514
    .line 515
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    iget v5, v4, La/ky40;->d:I

    .line 520
    .line 521
    sub-int/2addr v0, v5

    .line 522
    iput v0, v4, La/ky40;->e:I

    .line 523
    .line 524
    :cond_b
    move/from16 v37, v15

    .line 525
    .line 526
    goto/16 :goto_8

    .line 527
    .line 528
    :cond_c
    move v15, v7

    .line 529
    const-wide/16 p0, 0x80

    .line 530
    .line 531
    iget v0, v4, La/ky40;->c:I

    .line 532
    .line 533
    invoke-static {v0}, La/u1h0;->b(I)I

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    iget-object v5, v4, La/ky40;->a:[J

    .line 538
    .line 539
    iget-object v6, v4, La/ky40;->b:[J

    .line 540
    .line 541
    iget v7, v4, La/ky40;->c:I

    .line 542
    .line 543
    invoke-virtual {v4, v0}, La/ky40;->c(I)V

    .line 544
    .line 545
    .line 546
    iget-object v0, v4, La/ky40;->a:[J

    .line 547
    .line 548
    iget-object v8, v4, La/ky40;->b:[J

    .line 549
    .line 550
    iget v9, v4, La/ky40;->c:I

    .line 551
    .line 552
    move/from16 v12, v21

    .line 553
    .line 554
    :goto_6
    if-ge v12, v7, :cond_b

    .line 555
    .line 556
    shr-int/lit8 v13, v12, 0x3

    .line 557
    .line 558
    aget-wide v13, v5, v13

    .line 559
    .line 560
    and-int/lit8 v16, v12, 0x7

    .line 561
    .line 562
    shl-int/lit8 v16, v16, 0x3

    .line 563
    .line 564
    shr-long v13, v13, v16

    .line 565
    .line 566
    and-long v13, v13, v31

    .line 567
    .line 568
    cmp-long v13, v13, p0

    .line 569
    .line 570
    if-gez v13, :cond_d

    .line 571
    .line 572
    aget-wide v13, v6, v12

    .line 573
    .line 574
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 575
    .line 576
    .line 577
    move-result v16

    .line 578
    ushr-int/lit8 v17, v16, 0x10

    .line 579
    .line 580
    xor-int v16, v16, v17

    .line 581
    .line 582
    mul-int v16, v16, v28

    .line 583
    .line 584
    ushr-int/lit8 v17, v16, 0x10

    .line 585
    .line 586
    xor-int v16, v16, v17

    .line 587
    .line 588
    move/from16 v37, v15

    .line 589
    .line 590
    ushr-int/lit8 v15, v16, 0x7

    .line 591
    .line 592
    invoke-virtual {v4, v15}, La/ky40;->b(I)I

    .line 593
    .line 594
    .line 595
    move-result v15

    .line 596
    move-object/from16 v17, v0

    .line 597
    .line 598
    and-int/lit8 v0, v16, 0x7f

    .line 599
    .line 600
    move-object/from16 v16, v5

    .line 601
    .line 602
    move-object/from16 v18, v6

    .line 603
    .line 604
    int-to-long v5, v0

    .line 605
    shr-int/lit8 v0, v15, 0x3

    .line 606
    .line 607
    and-int/lit8 v19, v15, 0x7

    .line 608
    .line 609
    shl-int/lit8 v19, v19, 0x3

    .line 610
    .line 611
    aget-wide v22, v17, v0

    .line 612
    .line 613
    move-wide/from16 v25, v5

    .line 614
    .line 615
    shl-long v5, v31, v19

    .line 616
    .line 617
    not-long v5, v5

    .line 618
    and-long v5, v22, v5

    .line 619
    .line 620
    shl-long v19, v25, v19

    .line 621
    .line 622
    or-long v5, v5, v19

    .line 623
    .line 624
    aput-wide v5, v17, v0

    .line 625
    .line 626
    add-int/lit8 v0, v15, -0x7

    .line 627
    .line 628
    and-int/2addr v0, v9

    .line 629
    and-int/lit8 v19, v9, 0x7

    .line 630
    .line 631
    add-int v0, v0, v19

    .line 632
    .line 633
    shr-int/lit8 v0, v0, 0x3

    .line 634
    .line 635
    aput-wide v5, v17, v0

    .line 636
    .line 637
    aput-wide v13, v8, v15

    .line 638
    .line 639
    goto :goto_7

    .line 640
    :cond_d
    move-object/from16 v17, v0

    .line 641
    .line 642
    move-object/from16 v16, v5

    .line 643
    .line 644
    move-object/from16 v18, v6

    .line 645
    .line 646
    move/from16 v37, v15

    .line 647
    .line 648
    :goto_7
    add-int/lit8 v12, v12, 0x1

    .line 649
    .line 650
    move-object/from16 v5, v16

    .line 651
    .line 652
    move-object/from16 v0, v17

    .line 653
    .line 654
    move-object/from16 v6, v18

    .line 655
    .line 656
    move/from16 v15, v37

    .line 657
    .line 658
    goto :goto_6

    .line 659
    :goto_8
    invoke-virtual {v4, v3}, La/ky40;->b(I)I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    :goto_9
    move v14, v0

    .line 664
    iget v0, v4, La/ky40;->d:I

    .line 665
    .line 666
    add-int/lit8 v0, v0, 0x1

    .line 667
    .line 668
    iput v0, v4, La/ky40;->d:I

    .line 669
    .line 670
    iget v0, v4, La/ky40;->e:I

    .line 671
    .line 672
    iget-object v3, v4, La/ky40;->a:[J

    .line 673
    .line 674
    shr-int/lit8 v5, v14, 0x3

    .line 675
    .line 676
    aget-wide v6, v3, v5

    .line 677
    .line 678
    and-int/lit8 v8, v14, 0x7

    .line 679
    .line 680
    shl-int/lit8 v8, v8, 0x3

    .line 681
    .line 682
    shr-long v12, v6, v8

    .line 683
    .line 684
    and-long v12, v12, v31

    .line 685
    .line 686
    cmp-long v9, v12, p0

    .line 687
    .line 688
    if-nez v9, :cond_e

    .line 689
    .line 690
    move/from16 v21, v37

    .line 691
    .line 692
    :cond_e
    sub-int v0, v0, v21

    .line 693
    .line 694
    iput v0, v4, La/ky40;->e:I

    .line 695
    .line 696
    iget v0, v4, La/ky40;->c:I

    .line 697
    .line 698
    shl-long v12, v31, v8

    .line 699
    .line 700
    not-long v12, v12

    .line 701
    and-long/2addr v6, v12

    .line 702
    shl-long v8, v10, v8

    .line 703
    .line 704
    or-long/2addr v6, v8

    .line 705
    aput-wide v6, v3, v5

    .line 706
    .line 707
    add-int/lit8 v5, v14, -0x7

    .line 708
    .line 709
    and-int/2addr v5, v0

    .line 710
    and-int/lit8 v0, v0, 0x7

    .line 711
    .line 712
    add-int/2addr v5, v0

    .line 713
    shr-int/lit8 v0, v5, 0x3

    .line 714
    .line 715
    aput-wide v6, v3, v0

    .line 716
    .line 717
    :goto_a
    iget-object v0, v4, La/ky40;->b:[J

    .line 718
    .line 719
    aput-wide v1, v0, v14

    .line 720
    .line 721
    return v37

    .line 722
    :cond_f
    move/from16 v29, v5

    .line 723
    .line 724
    move/from16 v37, v7

    .line 725
    .line 726
    add-int/lit8 v26, v26, 0x8

    .line 727
    .line 728
    add-int v25, v25, v26

    .line 729
    .line 730
    and-int v25, v25, v6

    .line 731
    .line 732
    move/from16 v10, v28

    .line 733
    .line 734
    move-wide/from16 v15, v33

    .line 735
    .line 736
    goto/16 :goto_0

    .line 737
    .line 738
    :cond_10
    move/from16 v29, v5

    .line 739
    .line 740
    move/from16 v24, v6

    .line 741
    .line 742
    move/from16 v28, v10

    .line 743
    .line 744
    move-wide/from16 v33, v15

    .line 745
    .line 746
    const/16 v27, 0x3f

    .line 747
    .line 748
    const/16 v30, 0x7

    .line 749
    .line 750
    const-wide/16 v31, 0xff

    .line 751
    .line 752
    const-wide v35, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    move v15, v7

    .line 758
    if-ne v3, v15, :cond_16

    .line 759
    .line 760
    iget-object v3, v0, La/ypq;->f:La/ky40;

    .line 761
    .line 762
    if-eqz v3, :cond_15

    .line 763
    .line 764
    invoke-virtual {v3, v1, v2}, La/ky40;->a(J)Z

    .line 765
    .line 766
    .line 767
    move-result v3

    .line 768
    if-ne v3, v15, :cond_15

    .line 769
    .line 770
    iget-object v0, v0, La/ypq;->f:La/ky40;

    .line 771
    .line 772
    if-eqz v0, :cond_13

    .line 773
    .line 774
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    ushr-int/lit8 v4, v3, 0x10

    .line 779
    .line 780
    xor-int/2addr v3, v4

    .line 781
    mul-int v3, v3, v28

    .line 782
    .line 783
    ushr-int/lit8 v4, v3, 0x10

    .line 784
    .line 785
    xor-int/2addr v3, v4

    .line 786
    and-int/lit8 v4, v3, 0x7f

    .line 787
    .line 788
    iget v5, v0, La/ky40;->c:I

    .line 789
    .line 790
    ushr-int/lit8 v3, v3, 0x7

    .line 791
    .line 792
    :goto_b
    and-int/2addr v3, v5

    .line 793
    iget-object v6, v0, La/ky40;->a:[J

    .line 794
    .line 795
    shr-int/lit8 v7, v3, 0x3

    .line 796
    .line 797
    and-int/lit8 v8, v3, 0x7

    .line 798
    .line 799
    shl-int/lit8 v8, v8, 0x3

    .line 800
    .line 801
    aget-wide v9, v6, v7

    .line 802
    .line 803
    ushr-long/2addr v9, v8

    .line 804
    const/4 v15, 0x1

    .line 805
    add-int/2addr v7, v15

    .line 806
    aget-wide v11, v6, v7

    .line 807
    .line 808
    rsub-int/lit8 v6, v8, 0x40

    .line 809
    .line 810
    shl-long v6, v11, v6

    .line 811
    .line 812
    int-to-long v11, v8

    .line 813
    neg-long v11, v11

    .line 814
    shr-long v11, v11, v27

    .line 815
    .line 816
    and-long/2addr v6, v11

    .line 817
    or-long/2addr v6, v9

    .line 818
    int-to-long v8, v4

    .line 819
    mul-long v8, v8, v17

    .line 820
    .line 821
    xor-long/2addr v8, v6

    .line 822
    sub-long v10, v8, v17

    .line 823
    .line 824
    not-long v8, v8

    .line 825
    and-long/2addr v8, v10

    .line 826
    and-long v8, v8, v35

    .line 827
    .line 828
    :goto_c
    cmp-long v10, v8, v33

    .line 829
    .line 830
    if-eqz v10, :cond_12

    .line 831
    .line 832
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 833
    .line 834
    .line 835
    move-result v10

    .line 836
    shr-int/lit8 v10, v10, 0x3

    .line 837
    .line 838
    add-int/2addr v10, v3

    .line 839
    and-int/2addr v10, v5

    .line 840
    iget-object v11, v0, La/ky40;->b:[J

    .line 841
    .line 842
    aget-wide v12, v11, v10

    .line 843
    .line 844
    cmp-long v11, v12, v1

    .line 845
    .line 846
    if-nez v11, :cond_11

    .line 847
    .line 848
    goto :goto_d

    .line 849
    :cond_11
    sub-long v10, v8, v22

    .line 850
    .line 851
    and-long/2addr v8, v10

    .line 852
    goto :goto_c

    .line 853
    :cond_12
    not-long v8, v6

    .line 854
    shl-long v8, v8, p1

    .line 855
    .line 856
    and-long/2addr v6, v8

    .line 857
    and-long v6, v6, v35

    .line 858
    .line 859
    cmp-long v6, v6, v33

    .line 860
    .line 861
    if-eqz v6, :cond_14

    .line 862
    .line 863
    const/4 v10, -0x1

    .line 864
    :goto_d
    if-ltz v10, :cond_13

    .line 865
    .line 866
    iget v1, v0, La/ky40;->d:I

    .line 867
    .line 868
    const/4 v15, 0x1

    .line 869
    sub-int/2addr v1, v15

    .line 870
    iput v1, v0, La/ky40;->d:I

    .line 871
    .line 872
    iget-object v1, v0, La/ky40;->a:[J

    .line 873
    .line 874
    iget v0, v0, La/ky40;->c:I

    .line 875
    .line 876
    shr-int/lit8 v2, v10, 0x3

    .line 877
    .line 878
    and-int/lit8 v3, v10, 0x7

    .line 879
    .line 880
    shl-int/lit8 v3, v3, 0x3

    .line 881
    .line 882
    aget-wide v4, v1, v2

    .line 883
    .line 884
    shl-long v6, v31, v3

    .line 885
    .line 886
    not-long v6, v6

    .line 887
    and-long/2addr v4, v6

    .line 888
    shl-long v6, v19, v3

    .line 889
    .line 890
    or-long v3, v4, v6

    .line 891
    .line 892
    aput-wide v3, v1, v2

    .line 893
    .line 894
    add-int/lit8 v10, v10, -0x7

    .line 895
    .line 896
    and-int v2, v10, v0

    .line 897
    .line 898
    and-int/lit8 v0, v0, 0x7

    .line 899
    .line 900
    add-int/2addr v2, v0

    .line 901
    shr-int/lit8 v0, v2, 0x3

    .line 902
    .line 903
    aput-wide v3, v1, v0

    .line 904
    .line 905
    const/4 v15, 0x1

    .line 906
    return v15

    .line 907
    :cond_13
    const/4 v15, 0x1

    .line 908
    goto :goto_e

    .line 909
    :cond_14
    const/4 v15, 0x1

    .line 910
    add-int/lit8 v21, v21, 0x8

    .line 911
    .line 912
    add-int v3, v3, v21

    .line 913
    .line 914
    goto :goto_b

    .line 915
    :cond_15
    return v21

    .line 916
    :cond_16
    :goto_e
    return v15
.end method
