.class public final La/v000;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

.field public final p:La/bei0;

.field public final q:La/i1w0;

.field public final r:La/mne;

.field public final s:La/duj;


# direct methods
.method public constructor <init>(Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;La/bei0;La/i1w0;La/ctf0;La/mne;La/duj;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/mbz;

    .line 8
    .line 9
    const/4 v0, 0x7

    .line 10
    invoke-direct {v2, p1, p4, v0}, La/mbz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/z8z;

    .line 14
    .line 15
    const/16 p4, 0x14

    .line 16
    .line 17
    invoke-direct {v3, p4}, La/z8z;-><init>(B)V

    .line 18
    .line 19
    .line 20
    iget-object p4, p5, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object v0, p5, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p4, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/v000;->o:Lorg/xplatform/limits_ne/api/domain/LimitNeGroupEnum;

    .line 35
    .line 36
    iput-object p2, v0, La/v000;->p:La/bei0;

    .line 37
    .line 38
    iput-object p3, v0, La/v000;->q:La/i1w0;

    .line 39
    .line 40
    iput-object p5, v0, La/v000;->r:La/mne;

    .line 41
    .line 42
    iput-object p6, v0, La/v000;->s:La/duj;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 12

    .line 1
    check-cast p1, La/n000;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/k000;->a:La/k000;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x19

    .line 13
    .line 14
    const/16 v2, 0x15

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iget-object v4, p0, La/v000;->r:La/mne;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    iget-object v8, v4, La/mne;->b:La/dvj;

    .line 26
    .line 27
    new-instance v6, La/ebz;

    .line 28
    .line 29
    invoke-direct {v6, p0, v2}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance v9, La/u88;

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    invoke-direct {v9, p0, p1, v3, v1}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 36
    .line 37
    .line 38
    const/16 v10, 0xa

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    sget-object v0, La/j000;->a:La/j000;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/4 v5, 0x0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    iget-object v9, v4, La/mne;->b:La/dvj;

    .line 59
    .line 60
    new-instance v7, La/ebz;

    .line 61
    .line 62
    invoke-direct {v7, p0, v2}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    new-instance v10, La/u88;

    .line 66
    .line 67
    invoke-direct {v10, p0, v5, v3, v1}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 68
    .line 69
    .line 70
    const/16 v11, 0xa

    .line 71
    .line 72
    const/4 v8, 0x0

    .line 73
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    sget-object v0, La/l000;->a:La/l000;

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
    iget-object p0, p0, La/v000;->q:La/i1w0;

    .line 86
    .line 87
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v0, La/c8d;

    .line 92
    .line 93
    sget-object v1, La/y7d;->a:La/v7d;

    .line 94
    .line 95
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 96
    .line 97
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1, v0, p0, p1, v5}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_0
    move-object v0, p1

    .line 105
    check-cast v0, La/paw;

    .line 106
    .line 107
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/oe50;

    .line 118
    .line 119
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    return-void

    .line 124
    :cond_3
    sget-object v0, La/m000;->a:La/m000;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 137
    .line 138
    .line 139
    return-void
.end method
