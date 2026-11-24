.class public final La/wxm0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic q:I


# instance fields
.field public final o:La/sbu;

.field public p:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;La/sbu;La/g2v;La/ctf0;La/mne;)V
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p5, p5, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p5, p5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p5

    .line 10
    new-instance v0, La/jfm0;

    .line 11
    .line 12
    const/4 v1, 0x5

    .line 13
    invoke-direct {v0, p1, v1}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/o20;

    .line 17
    .line 18
    const/16 v1, 0x1b

    .line 19
    .line 20
    invoke-direct {p1, p3, p4, v1}, La/o20;-><init>(La/g2v;La/ctf0;B)V

    .line 21
    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-direct {p0, v0, p5, p1, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, La/wxm0;->o:La/sbu;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/exm0;

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
    instance-of v0, p1, La/cxm0;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 16
    .line 17
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, La/txm0;

    .line 28
    .line 29
    iget-object v5, p0, La/i3t0;->f:La/oyg0;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-object v5, p1

    .line 35
    check-cast v5, La/cxm0;

    .line 36
    .line 37
    iget-object v5, v5, La/cxm0;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v2, v2, v5, v1}, La/txm0;->a(La/txm0;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;I)La/txm0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v0, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    instance-of v0, p1, La/dxm0;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    check-cast p1, La/dxm0;

    .line 55
    .line 56
    new-instance v0, La/rxm0;

    .line 57
    .line 58
    iget-wide v1, p1, La/dxm0;->a:J

    .line 59
    .line 60
    invoke-direct {v0, v1, v2}, La/rxm0;-><init>(J)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    sget-object v0, La/zwm0;->a:La/zwm0;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    sget-object v0, La/axm0;->a:La/axm0;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    iget-object p0, p0, La/wxm0;->p:La/bby;

    .line 88
    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void

    .line 95
    :cond_5
    sget-object v0, La/bxm0;->a:La/bxm0;

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    iget-object p1, p0, La/wxm0;->p:La/bby;

    .line 104
    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    invoke-interface {p1, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 108
    .line 109
    .line 110
    :cond_6
    new-instance p1, La/hhb0;

    .line 111
    .line 112
    const/16 v0, 0x11

    .line 113
    .line 114
    invoke-direct {p1, p0, v2, v0}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v2, v2, p1, v1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, La/wxm0;->p:La/bby;

    .line 122
    .line 123
    return-void

    .line 124
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 125
    .line 126
    .line 127
    return-void
.end method
