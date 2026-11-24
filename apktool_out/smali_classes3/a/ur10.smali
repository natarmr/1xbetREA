.class public final La/ur10;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;

.field public final p:La/j910;


# direct methods
.method public constructor <init>(La/vzg0;La/ctf0;La/i1w0;La/mne;La/j910;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/gf10;

    .line 8
    .line 9
    const/16 p1, 0xa

    .line 10
    .line 11
    invoke-direct {v2, p1}, La/gf10;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/v510;

    .line 15
    .line 16
    const/4 p1, 0x4

    .line 17
    invoke-direct {v3, p2, p1}, La/v510;-><init>(La/ctf0;B)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p4, La/mne;->a:La/rwj;

    .line 21
    .line 22
    iget-object p2, p4, La/mne;->b:La/dvj;

    .line 23
    .line 24
    invoke-static {p1, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    iput-object p3, v0, La/ur10;->o:La/i1w0;

    .line 35
    .line 36
    iput-object p5, v0, La/ur10;->p:La/j910;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/mr10;

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
    instance-of v0, p1, La/ir10;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    check-cast p1, La/ir10;

    .line 14
    .line 15
    sget-object v0, La/ir10;->a:La/ir10;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, La/ir10;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of v0, p1, La/lr10;

    .line 32
    .line 33
    if-eqz v0, :cond_6

    .line 34
    .line 35
    check-cast p1, La/lr10;

    .line 36
    .line 37
    sget-object v0, La/jr10;->a:La/jr10;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-object p0, p0, La/ur10;->o:La/i1w0;

    .line 46
    .line 47
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, La/c8d;

    .line 52
    .line 53
    sget-object v1, La/y7d;->a:La/v7d;

    .line 54
    .line 55
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 56
    .line 57
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_0
    move-object v0, p1

    .line 66
    check-cast v0, La/paw;

    .line 67
    .line 68
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/oe50;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    return-void

    .line 85
    :cond_3
    instance-of v0, p1, La/kr10;

    .line 86
    .line 87
    if-eqz v0, :cond_5

    .line 88
    .line 89
    check-cast p1, La/kr10;

    .line 90
    .line 91
    iget p1, p1, La/kr10;->a:I

    .line 92
    .line 93
    iget-object v0, p0, La/ur10;->p:La/j910;

    .line 94
    .line 95
    invoke-virtual {v0, p1}, La/j910;->w(I)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 99
    .line 100
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 101
    .line 102
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v2, v1

    .line 110
    check-cast v2, La/rr10;

    .line 111
    .line 112
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 113
    .line 114
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v2, La/rr10;

    .line 118
    .line 119
    invoke-direct {v2, p1}, La/rr10;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    return-void

    .line 129
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    return-void
.end method
