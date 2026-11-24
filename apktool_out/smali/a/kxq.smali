.class public abstract La/kxq;
.super La/agd;
.source "SourceFile"


# instance fields
.field public final v:La/cad;

.field public final w:La/glz;

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/agd;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/jxq;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/jxq;-><init>(La/kxq;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/cad;

    .line 10
    .line 11
    const/16 v2, 0x17

    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, La/kxq;->v:La/cad;

    .line 17
    .line 18
    new-instance v0, La/glz;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p0, v1}, La/glz;-><init>(La/clz;Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, La/kxq;->w:La/glz;

    .line 25
    .line 26
    iput-boolean v1, p0, La/kxq;->z:Z

    .line 27
    .line 28
    iget-object v0, p0, La/agd;->d:La/nw20;

    .line 29
    .line 30
    iget-object v0, v0, La/nw20;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/kd30;

    .line 33
    .line 34
    new-instance v2, La/ufd;

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    invoke-direct {v2, p0, v3}, La/ufd;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    const-string v3, "android:support:lifecycle"

    .line 41
    .line 42
    invoke-virtual {v0, v3, v2}, La/kd30;->S(Ljava/lang/String;La/g0h0;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, La/ixq;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {v0, p0, v2}, La/ixq;-><init>(La/kxq;B)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, La/agd;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    new-instance v0, La/ixq;

    .line 57
    .line 58
    invoke-direct {v0, p0, v1}, La/ixq;-><init>(La/kxq;B)V

    .line 59
    .line 60
    .line 61
    iget-object v2, p0, La/agd;->l:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    new-instance v0, La/vfd;

    .line 67
    .line 68
    invoke-direct {v0, p0, v1}, La/vfd;-><init>(La/agd;B)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, La/agd;->m(La/bh60;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static s(Landroidx/fragment/app/e;)Z
    .locals 6

    .line 1
    sget-object v0, La/lkz;->c:La/lkz;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 4
    .line 5
    invoke-virtual {p0}, La/pmi;->p()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v1, 0x0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->w:La/jxq;

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget-object v3, v3, La/jxq;->e:La/kxq;

    .line 36
    .line 37
    :goto_1
    if-eqz v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, La/kxq;->s(Landroidx/fragment/app/e;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    or-int/2addr v1, v3

    .line 48
    :cond_3
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 49
    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v3, :cond_4

    .line 52
    .line 53
    invoke-virtual {v3}, La/n6r;->b()V

    .line 54
    .line 55
    .line 56
    iget-object v3, v3, La/n6r;->c:La/glz;

    .line 57
    .line 58
    iget-object v3, v3, La/glz;->i:La/lkz;

    .line 59
    .line 60
    sget-object v5, La/lkz;->d:La/lkz;

    .line 61
    .line 62
    invoke-virtual {v3, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-ltz v3, :cond_4

    .line 67
    .line 68
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->w1:La/n6r;

    .line 69
    .line 70
    iget-object v1, v1, La/n6r;->c:La/glz;

    .line 71
    .line 72
    invoke-virtual {v1, v0}, La/glz;->g(La/lkz;)V

    .line 73
    .line 74
    .line 75
    move v1, v4

    .line 76
    :cond_4
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 77
    .line 78
    iget-object v3, v3, La/glz;->i:La/lkz;

    .line 79
    .line 80
    sget-object v5, La/lkz;->d:La/lkz;

    .line 81
    .line 82
    invoke-virtual {v3, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-ltz v3, :cond_0

    .line 87
    .line 88
    iget-object v1, v2, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, La/glz;->g(La/lkz;)V

    .line 91
    .line 92
    .line 93
    move v1, v4

    .line 94
    goto :goto_0

    .line 95
    :cond_5
    return v1
.end method


# virtual methods
.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    if-eqz p4, :cond_5

    .line 5
    .line 6
    array-length v0, p4

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    aget-object v0, p4, v0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sparse-switch v1, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v1, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v1, 0x1a

    .line 33
    .line 34
    if-lt v0, v1, :cond_5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v1, "--contentcapture"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v1, 0x1d

    .line 49
    .line 50
    if-lt v0, v1, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :sswitch_2
    const-string v1, "--list-dumpables"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :sswitch_3
    const-string v1, "--dump-dumpable"

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v1, 0x21

    .line 74
    .line 75
    if-lt v0, v1, :cond_5

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :sswitch_4
    const-string v1, "--translation"

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 88
    .line 89
    const/16 v1, 0x1f

    .line 90
    .line 91
    if-lt v0, v1, :cond_5

    .line 92
    .line 93
    :goto_0
    return-void

    .line 94
    :cond_5
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const-string v0, "Local FragmentActivity "

    .line 98
    .line 99
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v0, " State:"

    .line 114
    .line 115
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v1, "  "

    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    const-string v1, "mCreated="

    .line 139
    .line 140
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-boolean v1, p0, La/kxq;->x:Z

    .line 144
    .line 145
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 146
    .line 147
    .line 148
    const-string v1, " mResumed="

    .line 149
    .line 150
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-boolean v1, p0, La/kxq;->y:Z

    .line 154
    .line 155
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 156
    .line 157
    .line 158
    const-string v1, " mStopped="

    .line 159
    .line 160
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    iget-boolean v1, p0, La/kxq;->z:Z

    .line 164
    .line 165
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    if-eqz v1, :cond_6

    .line 173
    .line 174
    new-instance v1, La/zpu;

    .line 175
    .line 176
    invoke-interface {p0}, La/riu0;->g()La/piu0;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-direct {v1, p0, v2}, La/zpu;-><init>(La/clz;La/piu0;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v0, p3}, La/zpu;->c(Ljava/lang/String;Ljava/io/PrintWriter;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 187
    .line 188
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p0, La/jxq;

    .line 191
    .line 192
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 193
    .line 194
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/e;->y(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    nop

    .line 199
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    invoke-virtual {v0}, La/cad;->i()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, La/agd;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/agd;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/kxq;->w:La/glz;

    .line 5
    .line 6
    sget-object v0, La/kkz;->ON_CREATE:La/kkz;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, La/glz;->d(La/kkz;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 12
    .line 13
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/jxq;

    .line 16
    .line 17
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Landroidx/fragment/app/e;->I:Z

    .line 21
    .line 22
    iput-boolean p1, p0, Landroidx/fragment/app/e;->J:Z

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/fragment/app/e;->P:La/w1r;

    .line 25
    .line 26
    iput-boolean p1, v0, La/w1r;->g:Z

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->x(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 24
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 25
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    check-cast v0, La/jxq;

    .line 26
    iget-object v0, v0, La/jxq;->d:La/v1r;

    .line 27
    iget-object v0, v0, Landroidx/fragment/app/e;->f:La/w0r;

    .line 28
    invoke-virtual {v0, p1, p2, p3, p4}, La/w0r;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 29
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/jxq;

    .line 6
    .line 7
    iget-object v0, v0, La/jxq;->d:La/v1r;

    .line 8
    .line 9
    iget-object v0, v0, Landroidx/fragment/app/e;->f:La/w0r;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, p1, p2, p3}, La/w0r;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 5
    .line 6
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/jxq;

    .line 9
    .line 10
    iget-object v0, v0, La/jxq;->d:La/v1r;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/fragment/app/e;->o()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/kxq;->w:La/glz;

    .line 16
    .line 17
    sget-object v0, La/kkz;->ON_DESTROY:La/kkz;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, La/agd;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 13
    .line 14
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/jxq;

    .line 17
    .line 18
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/e;->m()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/kxq;->y:Z

    .line 6
    .line 7
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 8
    .line 9
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/jxq;

    .line 12
    .line 13
    iget-object v0, v0, La/jxq;->d:La/v1r;

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/fragment/app/e;->h:La/zb5;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/e;->d()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v1, 0x5

    .line 23
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->x(I)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/kxq;->w:La/glz;

    .line 27
    .line 28
    sget-object v0, La/kkz;->ON_PAUSE:La/kkz;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/kxq;->w:La/glz;

    .line 5
    .line 6
    sget-object v1, La/kkz;->ON_RESUME:La/kkz;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, La/glz;->d(La/kkz;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 12
    .line 13
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/jxq;

    .line 16
    .line 17
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Landroidx/fragment/app/e;->I:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Landroidx/fragment/app/e;->J:Z

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/fragment/app/e;->P:La/w1r;

    .line 25
    .line 26
    iput-boolean v0, v1, La/w1r;->g:Z

    .line 27
    .line 28
    const/4 v0, 0x7

    .line 29
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->x(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    invoke-virtual {v0}, La/cad;->i()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, La/agd;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    invoke-virtual {v0}, La/cad;->i()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, La/kxq;->y:Z

    .line 11
    .line 12
    iget-object p0, v0, La/cad;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/jxq;

    .line 15
    .line 16
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroidx/fragment/app/e;->C(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 1
    iget-object v0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    invoke-virtual {v0}, La/cad;->i()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/jxq;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, La/kxq;->z:Z

    .line 15
    .line 16
    iget-boolean v2, p0, La/kxq;->x:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, La/kxq;->x:Z

    .line 22
    .line 23
    iget-object v2, v0, La/jxq;->d:La/v1r;

    .line 24
    .line 25
    iput-boolean v1, v2, Landroidx/fragment/app/e;->I:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Landroidx/fragment/app/e;->J:Z

    .line 28
    .line 29
    iget-object v4, v2, Landroidx/fragment/app/e;->P:La/w1r;

    .line 30
    .line 31
    iput-boolean v1, v4, La/w1r;->g:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Landroidx/fragment/app/e;->x(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, La/jxq;->d:La/v1r;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->C(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/kxq;->w:La/glz;

    .line 43
    .line 44
    sget-object v2, La/kkz;->ON_START:La/kkz;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, La/glz;->d(La/kkz;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, La/jxq;->d:La/v1r;

    .line 50
    .line 51
    iput-boolean v1, p0, Landroidx/fragment/app/e;->I:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Landroidx/fragment/app/e;->J:Z

    .line 54
    .line 55
    iget-object v0, p0, Landroidx/fragment/app/e;->P:La/w1r;

    .line 56
    .line 57
    iput-boolean v1, v0, La/w1r;->g:Z

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->x(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 0

    .line 1
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    invoke-virtual {p0}, La/cad;->i()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, La/kxq;->z:Z

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, La/kxq;->r()La/v1r;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, La/lkz;->a:La/lkz;

    .line 12
    .line 13
    invoke-static {v1}, La/kxq;->s(Landroidx/fragment/app/e;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, La/kxq;->v:La/cad;

    .line 20
    .line 21
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/jxq;

    .line 24
    .line 25
    iget-object v1, v1, La/jxq;->d:La/v1r;

    .line 26
    .line 27
    iput-boolean v0, v1, Landroidx/fragment/app/e;->J:Z

    .line 28
    .line 29
    iget-object v2, v1, Landroidx/fragment/app/e;->P:La/w1r;

    .line 30
    .line 31
    iput-boolean v0, v2, La/w1r;->g:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->x(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/kxq;->w:La/glz;

    .line 38
    .line 39
    sget-object v0, La/kkz;->ON_STOP:La/kkz;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, La/glz;->d(La/kkz;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final r()La/v1r;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxq;->v:La/cad;

    .line 2
    .line 3
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/jxq;

    .line 6
    .line 7
    iget-object p0, p0, La/jxq;->d:La/v1r;

    .line 8
    .line 9
    return-object p0
.end method
