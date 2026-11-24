.class public final La/ume0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/zqu;

.field public final p:Ljava/lang/String;

.field public final q:J

.field public final r:La/i1w0;

.field public final s:La/duj;


# direct methods
.method public constructor <init>(La/ctf0;La/zqu;Ljava/lang/String;JLa/i1w0;La/duj;La/ocl;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/o6e0;

    .line 5
    .line 6
    const/16 v0, 0x15

    .line 7
    .line 8
    invoke-direct {v2, v0}, La/o6e0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/gpb0;

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    invoke-direct {v3, p8, p1, v0}, La/gpb0;-><init>(La/ocl;La/ctf0;B)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p9, La/mne;->a:La/rwj;

    .line 18
    .line 19
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 27
    .line 28
    .line 29
    iput-object p2, v0, La/ume0;->o:La/zqu;

    .line 30
    .line 31
    iput-object p3, v0, La/ume0;->p:Ljava/lang/String;

    .line 32
    .line 33
    iput-wide p4, v0, La/ume0;->q:J

    .line 34
    .line 35
    iput-object p6, v0, La/ume0;->r:La/i1w0;

    .line 36
    .line 37
    iput-object p7, v0, La/ume0;->s:La/duj;

    .line 38
    .line 39
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p3, p9, La/mne;->b:La/dvj;

    .line 44
    .line 45
    new-instance p1, La/eme0;

    .line 46
    .line 47
    const/4 p2, 0x1

    .line 48
    invoke-direct {p1, v0, p2}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance p4, La/coc0;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    const/16 p5, 0xd

    .line 55
    .line 56
    invoke-direct {p4, v0, p2, p5}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 57
    .line 58
    .line 59
    const/16 p5, 0xa

    .line 60
    .line 61
    invoke-static/range {p0 .. p5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 62
    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/jme0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/hme0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, La/ume0;->r:La/i1w0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, La/c8d;

    .line 21
    .line 22
    sget-object v0, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    :goto_0
    move-object p1, p0

    .line 34
    check-cast p1, La/paw;

    .line 35
    .line 36
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/oe50;

    .line 47
    .line 48
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    instance-of v0, p1, La/ime0;

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    check-cast p1, La/ime0;

    .line 57
    .line 58
    iget-object v4, p1, La/ime0;->a:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v3, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;

    .line 61
    .line 62
    iget-object v7, p0, La/ume0;->p:Ljava/lang/String;

    .line 63
    .line 64
    sget-object v8, La/oaa0;->b:La/oaa0;

    .line 65
    .line 66
    iget-wide v5, p0, La/ume0;->q:J

    .line 67
    .line 68
    invoke-direct/range {v3 .. v8}, Lorg/xplatform/statistic/player/impl/player/player_menu/presentation/screen/PlayerMainScreen;-><init>(Ljava/lang/String;JLjava/lang/String;La/oaa0;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    instance-of p1, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 76
    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    new-instance p1, La/e1w0;

    .line 80
    .line 81
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 82
    .line 83
    invoke-direct {p1, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, La/c8d;

    .line 87
    .line 88
    sget-object v3, La/y7d;->a:La/v7d;

    .line 89
    .line 90
    invoke-direct {v0, v3, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    new-instance p1, La/w0w0;

    .line 98
    .line 99
    invoke-direct {p1, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, La/c8d;

    .line 103
    .line 104
    sget-object v3, La/y7d;->a:La/v7d;

    .line 105
    .line 106
    invoke-direct {v0, v3, p1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-static {v2, p0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    :goto_2
    move-object p1, p0

    .line 117
    check-cast p1, La/paw;

    .line 118
    .line 119
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_2

    .line 124
    .line 125
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    check-cast p1, La/oe50;

    .line 130
    .line 131
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    return-void

    .line 136
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 137
    .line 138
    .line 139
    return-void
.end method
