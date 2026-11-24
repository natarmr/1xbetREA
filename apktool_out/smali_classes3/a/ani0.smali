.class public final La/ani0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements La/bj;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/bbw0;)V
    .locals 1

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v0, La/xb5;

    invoke-direct {v0, p1}, La/xb5;-><init>(La/bbw0;)V

    .line 52
    iput-object v0, p0, La/ani0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sparse-switch p2, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/enj0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, La/ani0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/lkr0;

    .line 23
    .line 24
    const/16 v0, 0xc

    .line 25
    .line 26
    invoke-direct {p2, p1, v0}, La/lkr0;-><init>(La/gii0;B)V

    .line 27
    .line 28
    .line 29
    iput-object p2, p0, La/ani0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, La/enj0;

    .line 36
    .line 37
    const/16 v0, 0x11

    .line 38
    .line 39
    invoke-direct {p2, p1, v0}, La/enj0;-><init>(La/gii0;B)V

    .line 40
    .line 41
    .line 42
    iput-object p2, p0, La/ani0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_data_0
    .sparse-switch
        0xf -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/k3r0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, La/ani0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/r2m0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, La/ani0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 55
    new-instance v0, La/rkk0;

    .line 56
    invoke-direct {v0, p1}, La/lef0;-><init>(Ljava/lang/Object;)V

    .line 57
    iput-object p1, v0, La/rkk0;->b:Landroid/view/View;

    .line 58
    iput-object v0, p0, La/ani0;->a:Ljava/lang/Object;

    return-void

    .line 59
    :cond_0
    new-instance v0, La/lef0;

    invoke-direct {v0, p1}, La/lef0;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/ani0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, La/rkk0;

    const/4 v1, 0x0

    .line 62
    invoke-direct {v0, v1}, La/lef0;-><init>(Ljava/lang/Object;)V

    .line 63
    iput-object p1, v0, La/rkk0;->c:Landroid/view/WindowInsetsController;

    .line 64
    iput-object v0, p0, La/ani0;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 49
    iput-object p1, p0, La/ani0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/dqk0;La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/r2m0;

    .line 4
    .line 5
    iget-object p0, p0, La/r2m0;->c:La/m2m0;

    .line 6
    .line 7
    iget-object p0, p0, La/m2m0;->a:La/ouu;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2}, La/ouu;->O(La/dqk0;La/yje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    :goto_0
    if-ne p0, p1, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    :goto_1
    if-ne p0, p1, :cond_2

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method

.method public b(La/pm3;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/prc;

    .line 4
    .line 5
    iget-object p0, p0, La/prc;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/dcl;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/dcl;->a:La/p7m0;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public c(Ljava/util/List;Z)V
    .locals 24

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object/from16 v0, p0

    .line 5
    .line 6
    iget-object v0, v0, La/ani0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/qj9;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, La/qj9;->a:La/oj9;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, La/oj9;->a()La/qz40;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    move-object v2, v1

    .line 23
    check-cast v2, La/p7m0;

    .line 24
    .line 25
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    move-object v4, v3

    .line 30
    check-cast v4, La/hj9;

    .line 31
    .line 32
    invoke-interface {v4}, La/hj9;->getData()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/16 v6, 0xa

    .line 39
    .line 40
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_5

    .line 56
    .line 57
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, La/pbs0;

    .line 62
    .line 63
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v7

    .line 67
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-eqz v8, :cond_2

    .line 72
    .line 73
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    move-object v9, v8

    .line 78
    check-cast v9, La/m97;

    .line 79
    .line 80
    iget-object v10, v6, La/pbs0;->b:La/m97;

    .line 81
    .line 82
    invoke-static {v9, v10}, La/oj9;->b(La/m97;La/m97;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    const/4 v8, 0x0

    .line 90
    :goto_1
    move-object v9, v8

    .line 91
    check-cast v9, La/m97;

    .line 92
    .line 93
    if-eqz v9, :cond_4

    .line 94
    .line 95
    iget-object v7, v6, La/pbs0;->b:La/m97;

    .line 96
    .line 97
    iget-wide v12, v7, La/m97;->i:J

    .line 98
    .line 99
    iget-object v8, v7, La/m97;->p:Ljava/lang/String;

    .line 100
    .line 101
    iget-object v10, v7, La/m97;->o:Ljava/lang/String;

    .line 102
    .line 103
    iget-wide v14, v9, La/m97;->l:D

    .line 104
    .line 105
    iget-object v11, v9, La/m97;->m:Ljava/lang/String;

    .line 106
    .line 107
    move-object/from16 v16, v11

    .line 108
    .line 109
    iget-boolean v11, v9, La/m97;->d:Z

    .line 110
    .line 111
    if-eqz p2, :cond_3

    .line 112
    .line 113
    sget-object v7, La/izc;->d:La/izc;

    .line 114
    .line 115
    move-object/from16 v18, v8

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    sget-object v17, La/izc;->a:La/yk5;

    .line 119
    .line 120
    move-object/from16 v18, v8

    .line 121
    .line 122
    iget-wide v7, v7, La/m97;->l:D

    .line 123
    .line 124
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {v14, v15, v7, v8}, La/yk5;->b(DD)La/izc;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    :goto_2
    const/16 v22, 0x0

    .line 132
    .line 133
    const v23, 0x3ff26f3

    .line 134
    .line 135
    .line 136
    const/16 v19, 0x0

    .line 137
    .line 138
    const-wide/16 v20, 0x0

    .line 139
    .line 140
    move-object/from16 v17, v10

    .line 141
    .line 142
    move-object v10, v7

    .line 143
    invoke-static/range {v9 .. v23}, La/m97;->a(La/m97;La/izc;ZJDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/zfa0;DLjava/lang/String;I)La/m97;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    iget-object v6, v6, La/pbs0;->a:La/acs0;

    .line 148
    .line 149
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    new-instance v8, La/pbs0;

    .line 153
    .line 154
    invoke-direct {v8, v6, v7}, La/pbs0;-><init>(La/acs0;La/m97;)V

    .line 155
    .line 156
    .line 157
    move-object v6, v8

    .line 158
    :cond_4
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_5
    invoke-virtual {v0, v5}, La/oj9;->c(Ljava/util/List;)V

    .line 163
    .line 164
    .line 165
    new-instance v4, La/gj9;

    .line 166
    .line 167
    invoke-direct {v4, v5}, La/gj9;-><init>(Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_0

    .line 175
    .line 176
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/chf0;

    .line 4
    .line 5
    iget-object p0, p0, La/chf0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rpx;

    .line 8
    .line 9
    iget-object p0, p0, La/rpx;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/ani0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n5a;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isCanceled()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, La/n5a;->h(Ljava/lang/Throwable;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 33
    .line 34
    new-instance p1, La/g0g0;

    .line 35
    .line 36
    invoke-direct {p1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
