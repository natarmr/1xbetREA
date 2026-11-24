.class public final La/xgc;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/mne;

.field public final p:La/m1e;

.field public final q:La/tgu;

.field public r:La/c4m0;

.field public s:La/c4m0;


# direct methods
.method public constructor <init>(La/mne;La/m1e;La/tgu;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/zxb;

    .line 5
    .line 6
    const/16 v0, 0xc

    .line 7
    .line 8
    invoke-direct {v2, v0}, La/zxb;-><init>(B)V

    .line 9
    .line 10
    .line 11
    sget-object v3, La/kgc;->a:La/kgc;

    .line 12
    .line 13
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 14
    .line 15
    invoke-static {v0, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v1, 0x0

    .line 21
    move-object v0, p0

    .line 22
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/xgc;->o:La/mne;

    .line 26
    .line 27
    iput-object p2, v0, La/xgc;->p:La/m1e;

    .line 28
    .line 29
    iput-object p3, v0, La/xgc;->q:La/tgu;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/mgc;

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
    instance-of v0, p1, La/sgc;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p1, La/sgc;

    .line 14
    .line 15
    iget p1, p1, La/sgc;->a:I

    .line 16
    .line 17
    new-instance v0, La/pgc;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La/pgc;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    instance-of v0, p1, La/tgc;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 32
    .line 33
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 34
    .line 35
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-object v3, v2

    .line 43
    check-cast v3, La/qgc;

    .line 44
    .line 45
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-object v4, p1

    .line 51
    check-cast v4, La/tgc;

    .line 52
    .line 53
    iget-object v4, v4, La/tgc;->a:Ljava/lang/String;

    .line 54
    .line 55
    const/4 v5, 0x2

    .line 56
    invoke-static {v3, v4, v1, v5}, La/qgc;->a(La/qgc;Ljava/lang/String;Ljava/util/List;I)La/qgc;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    instance-of v0, p1, La/ngc;

    .line 68
    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, La/xgc;->r:La/c4m0;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    const/4 v0, 0x1

    .line 80
    if-ne p1, v0, :cond_3

    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    iget-object p1, p0, La/xgc;->p:La/m1e;

    .line 84
    .line 85
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v0, La/wib;

    .line 90
    .line 91
    const/4 v2, 0x7

    .line 92
    invoke-direct {v0, p0, v1, v2}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 93
    .line 94
    .line 95
    new-instance v1, La/fnq;

    .line 96
    .line 97
    const/4 v2, 0x4

    .line 98
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 99
    .line 100
    .line 101
    sget-object p1, La/ugc;->h:La/ugc;

    .line 102
    .line 103
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v2, p0, La/xgc;->o:La/mne;

    .line 108
    .line 109
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 110
    .line 111
    invoke-static {v0, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v1, v0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, La/xgc;->r:La/c4m0;

    .line 120
    .line 121
    return-void

    .line 122
    :cond_4
    instance-of p1, p1, La/ogc;

    .line 123
    .line 124
    if-eqz p1, :cond_5

    .line 125
    .line 126
    iget-object p1, p0, La/xgc;->r:La/c4m0;

    .line 127
    .line 128
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 129
    .line 130
    .line 131
    iget-object p0, p0, La/xgc;->s:La/c4m0;

    .line 132
    .line 133
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 138
    .line 139
    .line 140
    return-void
.end method
