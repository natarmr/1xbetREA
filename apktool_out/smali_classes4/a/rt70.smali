.class public final La/rt70;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final o:La/mne;

.field public final p:La/pht0;

.field public final q:La/hqx;

.field public final r:La/uq70;

.field public final s:La/wri0;

.field public final t:La/xr;

.field public final u:La/xfu;

.field public final v:La/ani0;

.field public w:La/c4m0;

.field public x:La/c4m0;

.field public final y:La/c4m0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/mne;La/pht0;La/hqx;La/uq70;La/m1e;La/wri0;La/rlt0;La/qlt0;La/xr;La/xfu;La/ani0;)V
    .locals 7

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/fq60;

    .line 8
    .line 9
    const/16 v0, 0x1c

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/fq60;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/wk60;

    .line 15
    .line 16
    invoke-direct {v3, v0}, La/wk60;-><init>(B)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p2, La/mne;->c:La/vs10;

    .line 20
    .line 21
    iget-object v6, p2, La/mne;->a:La/rwj;

    .line 22
    .line 23
    invoke-static {v0, v6}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v1, 0x0

    .line 29
    move-object v0, p0

    .line 30
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, La/rt70;->o:La/mne;

    .line 34
    .line 35
    iput-object p3, p0, La/rt70;->p:La/pht0;

    .line 36
    .line 37
    iput-object p4, p0, La/rt70;->q:La/hqx;

    .line 38
    .line 39
    iput-object p5, p0, La/rt70;->r:La/uq70;

    .line 40
    .line 41
    iput-object p7, p0, La/rt70;->s:La/wri0;

    .line 42
    .line 43
    move-object/from16 p2, p10

    .line 44
    .line 45
    iput-object p2, p0, La/rt70;->t:La/xr;

    .line 46
    .line 47
    move-object/from16 p2, p11

    .line 48
    .line 49
    iput-object p2, p0, La/rt70;->u:La/xfu;

    .line 50
    .line 51
    move-object/from16 p2, p12

    .line 52
    .line 53
    iput-object p2, p0, La/rt70;->v:La/ani0;

    .line 54
    .line 55
    iget-object p2, p0, La/rt70;->y:La/c4m0;

    .line 56
    .line 57
    const/4 p3, 0x4

    .line 58
    const/4 p4, 0x1

    .line 59
    const/4 p5, 0x0

    .line 60
    if-eqz p2, :cond_0

    .line 61
    .line 62
    invoke-virtual {p2}, La/pby;->isActive()Z

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    if-ne p2, p4, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-interface {p6}, La/m1e;->b()La/gmq;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    new-instance p6, La/jt70;

    .line 74
    .line 75
    invoke-direct {p6, p0, p5, p4}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance p4, La/fnq;

    .line 79
    .line 80
    invoke-direct {p4, p2, p6, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-static {p2, v6}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    sget-object p6, La/kt70;->h:La/kt70;

    .line 92
    .line 93
    invoke-static {p4, p2, p6}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iput-object p2, p0, La/rt70;->y:La/c4m0;

    .line 98
    .line 99
    :goto_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    sget-object p4, La/nt70;->a:La/nt70;

    .line 104
    .line 105
    new-instance p6, La/jt70;

    .line 106
    .line 107
    invoke-direct {p6, p0, p5, p3}, La/jt70;-><init>(La/rt70;La/yje;B)V

    .line 108
    .line 109
    .line 110
    const/16 p7, 0xa

    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    move-object p3, p4

    .line 114
    move-object p5, v6

    .line 115
    move-object p4, p0

    .line 116
    invoke-static/range {p2 .. p7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 117
    .line 118
    .line 119
    iget-object p0, p8, La/rlt0;->a:La/gt70;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object p0, p0, La/gt70;->a:La/ft70;

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    iget-object p2, p0, La/ft70;->a:Ljava/lang/String;

    .line 130
    .line 131
    const-string p3, "org.xplatform.feature.online_call.impl.service.OnlineCallService"

    .line 132
    .line 133
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_1

    .line 138
    .line 139
    :goto_1
    move-object/from16 p0, p9

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_1
    iput-object p3, p0, La/ft70;->a:Ljava/lang/String;

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :goto_2
    iget-object p0, p0, La/qlt0;->a:La/gt70;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object p0, p0, La/gt70;->a:La/ft70;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object p2, p0, La/ft70;->b:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-eqz p2, :cond_2

    .line 162
    .line 163
    return-void

    .line 164
    :cond_2
    iput-object p1, p0, La/ft70;->b:Ljava/lang/String;

    .line 165
    .line 166
    return-void
.end method


# virtual methods
.method public final M(La/dt70;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/bt70;->a:La/bt70;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/rt70;->N()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, La/ct70;->a:La/ct70;

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final N()V
    .locals 2

    .line 1
    iget-object v0, p0, La/rt70;->s:La/wri0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, La/wri0;->a(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/rt70;->r:La/uq70;

    .line 8
    .line 9
    invoke-interface {v0}, La/uq70;->a()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, La/uq70;->close()V

    .line 13
    .line 14
    .line 15
    sget-object v0, La/ht70;->a:La/ht70;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/dt70;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/rt70;->M(La/dt70;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
