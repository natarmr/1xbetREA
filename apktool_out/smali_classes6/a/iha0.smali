.class public final La/iha0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:La/n4u;

.field public final q:La/clc;

.field public final r:La/i1w0;

.field public final s:La/duj;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/n4u;La/clc;La/i1w0;La/m1e;La/mne;La/ocl;La/duj;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v2, La/raa0;

    .line 11
    .line 12
    const/16 v1, 0x12

    .line 13
    .line 14
    invoke-direct {v2, v1}, La/raa0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v3, La/yar;

    .line 18
    .line 19
    const/16 v1, 0x8

    .line 20
    .line 21
    invoke-direct {v3, p7, v1}, La/yar;-><init>(La/ocl;B)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p6, La/mne;->c:La/vs10;

    .line 25
    .line 26
    iget-object v6, p6, La/mne;->b:La/dvj;

    .line 27
    .line 28
    invoke-static {v1, v6}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v1, 0x0

    .line 34
    move-object v0, p0

    .line 35
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/iha0;->o:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p2, p0, La/iha0;->p:La/n4u;

    .line 41
    .line 42
    iput-object p3, p0, La/iha0;->q:La/clc;

    .line 43
    .line 44
    iput-object p4, p0, La/iha0;->r:La/i1w0;

    .line 45
    .line 46
    iput-object p8, p0, La/iha0;->s:La/duj;

    .line 47
    .line 48
    invoke-interface {p5}, La/m1e;->b()La/gmq;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance p2, La/c670;

    .line 53
    .line 54
    const/4 p3, 0x0

    .line 55
    const/16 p4, 0xe

    .line 56
    .line 57
    invoke-direct {p2, p0, p3, p4}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    new-instance v1, La/fnq;

    .line 61
    .line 62
    const/4 p3, 0x4

    .line 63
    invoke-direct {v1, p1, p2, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 64
    .line 65
    .line 66
    new-instance p1, La/yi90;

    .line 67
    .line 68
    const/4 p2, 0x0

    .line 69
    const/16 p3, 0x16

    .line 70
    .line 71
    const/4 p4, 0x1

    .line 72
    const-class p5, La/iha0;

    .line 73
    .line 74
    const-string v2, "handleError"

    .line 75
    .line 76
    const-string v3, "handleError(Ljava/lang/Throwable;)V"

    .line 77
    .line 78
    move p7, p2

    .line 79
    move p8, p3

    .line 80
    move p2, p4

    .line 81
    move-object p4, p5

    .line 82
    move-object p5, v2

    .line 83
    move-object p6, v3

    .line 84
    move-object p3, p0

    .line 85
    invoke-direct/range {p1 .. p8}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1, v6, p1}, La/i3t0;->J(La/gmq;La/lne;Lkotlin/jvm/functions/Function1;)La/c4m0;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, La/iha0;->M()V

    .line 92
    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 8

    .line 1
    new-instance v0, La/yi90;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/16 v7, 0x15

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v3, La/iha0;

    .line 8
    .line 9
    const-string v4, "handleError"

    .line 10
    .line 11
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 12
    .line 13
    move-object v2, p0

    .line 14
    invoke-direct/range {v0 .. v7}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 15
    .line 16
    .line 17
    new-instance p0, La/epp;

    .line 18
    .line 19
    const/16 v1, 0x18

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {p0, v2, v3, v1}, La/epp;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-static {v2, v3, v0, p0, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/yga0;

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
    instance-of v0, p1, La/wga0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iget-object v2, p0, La/iha0;->r:La/i1w0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, La/iha0;->q:La/clc;

    .line 17
    .line 18
    iget-object p0, p0, La/clc;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/w5z;

    .line 21
    .line 22
    iget-object p0, p0, La/w5z;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/bca0;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, La/bca0;->a:La/cca0;

    .line 28
    .line 29
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p1, La/c8d;

    .line 34
    .line 35
    sget-object v0, La/y7d;->a:La/v7d;

    .line 36
    .line 37
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 38
    .line 39
    invoke-direct {p1, v0, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, p1, v2, p0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    move-object p1, p0

    .line 47
    check-cast p1, La/paw;

    .line 48
    .line 49
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, La/oe50;

    .line 60
    .line 61
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    instance-of v0, p1, La/xga0;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    check-cast p1, La/xga0;

    .line 70
    .line 71
    iget-object p0, p1, La/xga0;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    new-instance v0, Lorg/xplatform/statistic/tennis/impl/player_menu/presentation/screen/PlayersStatisticScreen;

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    invoke-direct {v0, p0, v3}, Lorg/xplatform/statistic/tennis/impl/player_menu/presentation/screen/PlayersStatisticScreen;-><init>(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    instance-of p0, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 84
    .line 85
    if-eqz p0, :cond_1

    .line 86
    .line 87
    new-instance p0, La/e1w0;

    .line 88
    .line 89
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 90
    .line 91
    invoke-direct {p0, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, La/c8d;

    .line 95
    .line 96
    sget-object v3, La/y7d;->a:La/v7d;

    .line 97
    .line 98
    invoke-direct {v0, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    new-instance p0, La/w0w0;

    .line 106
    .line 107
    invoke-direct {p0, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, La/c8d;

    .line 111
    .line 112
    sget-object v3, La/y7d;->a:La/v7d;

    .line 113
    .line 114
    invoke-direct {v0, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :goto_1
    invoke-static {v2, p1, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :goto_2
    move-object p1, p0

    .line 125
    check-cast p1, La/paw;

    .line 126
    .line 127
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, La/oe50;

    .line 138
    .line 139
    invoke-virtual {v2, p1}, La/i1w0;->a(La/oe50;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_2
    return-void

    .line 144
    :cond_3
    sget-object v0, La/vga0;->a:La/vga0;

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    invoke-virtual {p0}, La/iha0;->M()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 157
    .line 158
    .line 159
    return-void
.end method
