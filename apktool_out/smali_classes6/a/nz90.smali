.class public final La/nz90;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:La/vzg0;

.field public final p:La/svu;

.field public final q:Ljava/lang/String;

.field public final r:La/i1w0;

.field public final s:La/mne;

.field public t:La/bby;

.field public u:La/bby;


# direct methods
.method public constructor <init>(La/vzg0;La/svu;La/m1e;Ljava/lang/String;La/i1w0;La/ocl;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/wm90;

    .line 5
    .line 6
    const/16 v0, 0xd

    .line 7
    .line 8
    invoke-direct {v2, v0}, La/wm90;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/yar;

    .line 12
    .line 13
    const/4 v0, 0x7

    .line 14
    invoke-direct {v3, p6, v0}, La/yar;-><init>(La/ocl;B)V

    .line 15
    .line 16
    .line 17
    iget-object p6, p7, La/mne;->c:La/vs10;

    .line 18
    .line 19
    iget-object v0, p7, La/mne;->a:La/rwj;

    .line 20
    .line 21
    invoke-static {p6, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, v0, La/nz90;->o:La/vzg0;

    .line 32
    .line 33
    iput-object p2, v0, La/nz90;->p:La/svu;

    .line 34
    .line 35
    iput-object p4, v0, La/nz90;->q:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p5, v0, La/nz90;->r:La/i1w0;

    .line 38
    .line 39
    iput-object p7, v0, La/nz90;->s:La/mne;

    .line 40
    .line 41
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, La/mz90;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    const/4 p3, 0x0

    .line 49
    invoke-direct {p1, v0, p2, p3}, La/mz90;-><init>(La/nz90;La/yje;B)V

    .line 50
    .line 51
    .line 52
    new-instance p2, La/fnq;

    .line 53
    .line 54
    const/4 p3, 0x4

    .line 55
    invoke-direct {p2, p0, p1, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p1, p7, La/mne;->b:La/dvj;

    .line 63
    .line 64
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p2, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 69
    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 8

    .line 1
    iget-object v0, p0, La/nz90;->u:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/nz90;->s:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/lz90;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {v3, p0, v0}, La/lz90;-><init>(La/nz90;B)V

    .line 25
    .line 26
    .line 27
    new-instance v6, La/mz90;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-direct {v6, p0, v0, v1}, La/mz90;-><init>(La/nz90;La/yje;B)V

    .line 31
    .line 32
    .line 33
    const/16 v7, 0xa

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/nz90;->u:La/bby;

    .line 41
    .line 42
    return-void
.end method

.method public final N()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/x48;

    .line 8
    .line 9
    iget-object v1, v1, La/x48;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x2

    .line 16
    const/4 v3, 0x1

    .line 17
    if-lt v1, v2, :cond_0

    .line 18
    .line 19
    move v1, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    iget-object v2, v0, La/nz90;->t:La/bby;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ne v2, v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    if-nez v1, :cond_2

    .line 34
    .line 35
    :goto_1
    return-void

    .line 36
    :cond_2
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const-class v1, La/nz90;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v14, La/lz90;

    .line 47
    .line 48
    invoke-direct {v14, v0, v3}, La/lz90;-><init>(La/nz90;B)V

    .line 49
    .line 50
    .line 51
    new-instance v15, La/z210;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    const/16 v2, 0x1d

    .line 55
    .line 56
    invoke-direct {v15, v0, v1, v2}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 v16, 0x78

    .line 60
    .line 61
    const-wide/16 v6, 0x4

    .line 62
    .line 63
    const-wide/16 v8, 0x4

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    const-wide/16 v11, 0x0

    .line 67
    .line 68
    const/4 v13, 0x0

    .line 69
    invoke-static/range {v4 .. v16}, La/sac;->d0(La/vne;Ljava/lang/String;JJLkotlin/coroutines/CoroutineContext;JLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, v0, La/nz90;->t:La/bby;

    .line 74
    .line 75
    return-void
.end method

.method public final v()V
    .locals 1

    .line 1
    iget-object p0, p0, La/nz90;->t:La/bby;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/k48;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/f48;->a:La/f48;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, La/nz90;->r:La/i1w0;

    .line 15
    .line 16
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/c8d;

    .line 21
    .line 22
    sget-object v1, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    move-object v0, p1

    .line 35
    check-cast v0, La/paw;

    .line 36
    .line 37
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/oe50;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object v0, La/h48;->a:La/h48;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, La/nz90;->M()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    sget-object v0, La/i48;->a:La/i48;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0}, La/nz90;->N()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    sget-object v0, La/j48;->a:La/j48;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    iget-object p0, p0, La/nz90;->t:La/bby;

    .line 86
    .line 87
    if-eqz p0, :cond_5

    .line 88
    .line 89
    const/4 p1, 0x0

    .line 90
    invoke-interface {p0, p1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    instance-of v0, p1, La/g48;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    check-cast p1, La/g48;

    .line 99
    .line 100
    iget v4, p1, La/g48;->a:I

    .line 101
    .line 102
    const-string p1, "KEY_CURRENT_PHOTO"

    .line 103
    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, p0, La/nz90;->o:La/vzg0;

    .line 109
    .line 110
    invoke-virtual {v1, p1, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 114
    .line 115
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 116
    .line 117
    :cond_4
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-object v0, v6

    .line 125
    check-cast v0, La/x48;

    .line 126
    .line 127
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    const/16 v5, 0x1f

    .line 134
    .line 135
    const/4 v1, 0x0

    .line 136
    const/4 v2, 0x0

    .line 137
    invoke-static/range {v0 .. v5}, La/x48;->a(La/x48;ZZZII)La/x48;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p1, v6, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    :cond_5
    return-void

    .line 148
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 149
    .line 150
    .line 151
    return-void
.end method
