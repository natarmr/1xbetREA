.class public final La/mg4;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;

.field public final p:La/kf4;

.field public final q:La/jqt;

.field public r:La/c4m0;


# direct methods
.method public constructor <init>(La/mne;La/i1w0;La/kf4;La/jqt;)V
    .locals 6

    .line 1
    new-instance v2, La/a04;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-direct {v2, v0}, La/a04;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v3, La/or3;

    .line 9
    .line 10
    const/16 v0, 0x17

    .line 11
    .line 12
    invoke-direct {v3, v0}, La/or3;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 16
    .line 17
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v1, 0x0

    .line 23
    move-object v0, p0

    .line 24
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, v0, La/mg4;->o:La/i1w0;

    .line 28
    .line 29
    iput-object p3, v0, La/mg4;->p:La/kf4;

    .line 30
    .line 31
    iput-object p4, v0, La/mg4;->q:La/jqt;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, La/dg4;

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
    sget-object v0, La/cg4;->a:La/cg4;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, La/mg4;->o:La/i1w0;

    .line 18
    .line 19
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object p0, p0, La/mg4;->p:La/kf4;

    .line 24
    .line 25
    invoke-virtual {p0}, La/kf4;->a()Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v1, La/e1w0;

    .line 30
    .line 31
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 32
    .line 33
    .line 34
    new-instance p0, La/c8d;

    .line 35
    .line 36
    sget-object v2, La/y7d;->a:La/v7d;

    .line 37
    .line 38
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static {v0, p0, p1, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    move-object v0, p0

    .line 47
    check-cast v0, La/paw;

    .line 48
    .line 49
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_2

    .line 54
    .line 55
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/oe50;

    .line 60
    .line 61
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object v0, La/ag4;->a:La/ag4;

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    iget-object p0, p0, La/mg4;->r:La/c4m0;

    .line 74
    .line 75
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    sget-object v0, La/bg4;->a:La/bg4;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    iget-object p1, p0, La/mg4;->r:La/c4m0;

    .line 88
    .line 89
    if-eqz p1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const/4 v0, 0x1

    .line 96
    if-ne p1, v0, :cond_3

    .line 97
    .line 98
    :cond_2
    return-void

    .line 99
    :cond_3
    iget-object p1, p0, La/mg4;->q:La/jqt;

    .line 100
    .line 101
    invoke-virtual {p1}, La/jqt;->a()La/h2c;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance v0, La/qv3;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    const/4 v2, 0x3

    .line 109
    invoke-direct {v0, p0, v1, v2}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 110
    .line 111
    .line 112
    new-instance v3, La/fnq;

    .line 113
    .line 114
    const/4 v4, 0x4

    .line 115
    invoke-direct {v3, p1, v0, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {p0, v3, v1, v1, v2}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, La/mg4;->r:La/c4m0;

    .line 123
    .line 124
    return-void

    .line 125
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 126
    .line 127
    .line 128
    return-void
.end method
