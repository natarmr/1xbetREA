.class public final La/jj60;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/au0;

.field public final p:La/zg;

.field public final q:La/mne;

.field public final r:La/pmi0;

.field public final s:La/i1w0;


# direct methods
.method public constructor <init>(La/au0;La/zg;La/mne;La/ctf0;La/pmi0;La/i1w0;La/f7u;La/lbu;)V
    .locals 6

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/a540;

    .line 5
    .line 6
    const/16 v0, 0x11

    .line 7
    .line 8
    invoke-direct {v2, p7, p8, v0}, La/a540;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/v510;

    .line 12
    .line 13
    const/16 p7, 0x15

    .line 14
    .line 15
    invoke-direct {v3, p4, p7}, La/v510;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p4, p3, La/mne;->c:La/vs10;

    .line 19
    .line 20
    iget-object p7, p3, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p4, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/jj60;->o:La/au0;

    .line 33
    .line 34
    iput-object p2, v0, La/jj60;->p:La/zg;

    .line 35
    .line 36
    iput-object p3, v0, La/jj60;->q:La/mne;

    .line 37
    .line 38
    iput-object p5, v0, La/jj60;->r:La/pmi0;

    .line 39
    .line 40
    iput-object p6, v0, La/jj60;->s:La/i1w0;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/zi60;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/xi60;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, La/jj60;->s:La/i1w0;

    .line 11
    .line 12
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-instance v0, La/c8d;

    .line 17
    .line 18
    sget-object v1, La/y7d;->a:La/v7d;

    .line 19
    .line 20
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    move-object v0, p1

    .line 31
    check-cast v0, La/paw;

    .line 32
    .line 33
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/oe50;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void

    .line 50
    :cond_1
    instance-of v0, p1, La/yi60;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    check-cast p1, La/yi60;

    .line 55
    .line 56
    iget-object p1, p1, La/yi60;->a:La/lk60;

    .line 57
    .line 58
    sget-object v0, La/fk60;->b:La/uuz;

    .line 59
    .line 60
    iget-byte v1, p1, La/lk60;->a:B

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, La/uuz;->g(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-lez v1, :cond_2

    .line 74
    .line 75
    iget-object v1, p0, La/jj60;->p:La/zg;

    .line 76
    .line 77
    iget-object v1, v1, La/zg;->a:La/kt2;

    .line 78
    .line 79
    const-string v2, "acc_app_intro_menu_call"

    .line 80
    .line 81
    const-string v3, "point"

    .line 82
    .line 83
    invoke-static {v3, v0, v1, v2}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, La/jj60;->o:La/au0;

    .line 87
    .line 88
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 89
    .line 90
    const-wide/16 v2, 0xbfa

    .line 91
    .line 92
    invoke-static {v0, v1, v2, v3}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 93
    .line 94
    .line 95
    :cond_2
    iget-object v0, p0, La/jj60;->r:La/pmi0;

    .line 96
    .line 97
    iget-object v0, v0, La/pmi0;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, La/t91;

    .line 100
    .line 101
    iget-object v0, v0, La/t91;->a:La/zoq0;

    .line 102
    .line 103
    const/4 v1, 0x1

    .line 104
    iput-boolean v1, v0, La/zoq0;->b:Z

    .line 105
    .line 106
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v0, p0, La/jj60;->q:La/mne;

    .line 111
    .line 112
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 113
    .line 114
    sget-object v3, La/ij60;->a:La/ij60;

    .line 115
    .line 116
    new-instance v6, La/nf60;

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-direct {v6, p0, p1, v0, v1}, La/nf60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 120
    .line 121
    .line 122
    const/16 v7, 0xa

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    instance-of p1, p1, La/wi60;

    .line 130
    .line 131
    if-eqz p1, :cond_4

    .line 132
    .line 133
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 138
    .line 139
    .line 140
    return-void
.end method
