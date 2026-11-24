.class public final La/qon0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final o:La/bsc;

.field public final p:La/mne;

.field public final q:La/s31;

.field public final r:La/e41;


# direct methods
.method public constructor <init>(La/vzg0;La/ctf0;La/bsc;La/mne;La/s31;La/e41;Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/jfm0;

    .line 5
    .line 6
    const/16 p1, 0x10

    .line 7
    .line 8
    invoke-direct {v2, p7, p1}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/h0j0;

    .line 12
    .line 13
    const/16 p1, 0x9

    .line 14
    .line 15
    invoke-direct {v3, p2, p1}, La/h0j0;-><init>(La/ctf0;B)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p4, La/mne;->a:La/rwj;

    .line 19
    .line 20
    invoke-static {p1, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v1, 0x0

    .line 26
    move-object v0, p0

    .line 27
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 28
    .line 29
    .line 30
    iput-object p3, v0, La/qon0;->o:La/bsc;

    .line 31
    .line 32
    iput-object p4, v0, La/qon0;->p:La/mne;

    .line 33
    .line 34
    iput-object p5, v0, La/qon0;->q:La/s31;

    .line 35
    .line 36
    iput-object p6, v0, La/qon0;->r:La/e41;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 9

    .line 1
    check-cast p1, La/kon0;

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
    instance-of v0, p1, La/jon0;

    .line 10
    .line 11
    iget-object v1, p0, La/qon0;->r:La/e41;

    .line 12
    .line 13
    iget-object v2, p0, La/qon0;->q:La/s31;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    check-cast p1, La/jon0;

    .line 18
    .line 19
    sget-object v0, La/hon0;->a:La/hon0;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object p1, p0, La/qon0;->p:La/mne;

    .line 32
    .line 33
    iget-object v6, p1, La/mne;->a:La/rwj;

    .line 34
    .line 35
    sget-object v4, La/pon0;->a:La/pon0;

    .line 36
    .line 37
    new-instance v7, La/z2n0;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    const/4 v0, 0x2

    .line 41
    invoke-direct {v7, p0, p1, v0}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/16 v8, 0xa

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    sget-object v0, La/gon0;->a:La/gon0;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    sget-object p1, La/hsn0;->c:La/hsn0;

    .line 60
    .line 61
    invoke-virtual {v2, p1}, La/s31;->H(La/hsn0;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, La/qun0;->c:La/qun0;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, La/e41;->e(La/qun0;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, La/mon0;

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p1, v0}, La/mon0;-><init>(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    instance-of p1, p1, La/ion0;

    .line 80
    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    sget-object p1, La/hsn0;->d:La/hsn0;

    .line 84
    .line 85
    invoke-virtual {v2, p1}, La/s31;->H(La/hsn0;)V

    .line 86
    .line 87
    .line 88
    sget-object p1, La/qun0;->d:La/qun0;

    .line 89
    .line 90
    invoke-virtual {v1, p1}, La/e41;->e(La/qun0;)V

    .line 91
    .line 92
    .line 93
    new-instance p1, La/acm0;

    .line 94
    .line 95
    const/16 v0, 0xc

    .line 96
    .line 97
    invoke-direct {p1, v0}, La/acm0;-><init>(B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    sget-object v0, La/eon0;->a:La/eon0;

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_4
    sget-object p0, La/fon0;->a:La/fon0;

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-eqz p0, :cond_5

    .line 127
    .line 128
    sget-object p0, La/hsn0;->c:La/hsn0;

    .line 129
    .line 130
    invoke-virtual {v2, p0}, La/s31;->H(La/hsn0;)V

    .line 131
    .line 132
    .line 133
    sget-object p0, La/qun0;->c:La/qun0;

    .line 134
    .line 135
    invoke-virtual {v1, p0}, La/e41;->e(La/qun0;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 140
    .line 141
    .line 142
    return-void
.end method
