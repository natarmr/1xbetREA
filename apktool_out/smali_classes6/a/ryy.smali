.class public final La/ryy;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public final o:La/i1w0;

.field public final p:Lorg/xplatform/ufc/api/last_fights/LastFightsParams;

.field public final q:La/ctf0;

.field public final r:La/kys0;

.field public final s:La/m1e;

.field public final t:La/j3c;

.field public final u:La/f4u;

.field public v:J

.field public w:La/bby;

.field public x:La/c4m0;

.field public y:La/bby;


# direct methods
.method public constructor <init>(La/i1w0;Lorg/xplatform/ufc/api/last_fights/LastFightsParams;La/ctf0;La/kys0;La/m1e;La/pru;La/g2v;La/r9u;La/j3c;La/luu;La/f4u;La/mne;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p12, p12, La/mne;->a:La/rwj;

    .line 8
    .line 9
    invoke-static {p12, p12}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 10
    .line 11
    .line 12
    move-result-object p12

    .line 13
    new-instance v0, La/g8l;

    .line 14
    .line 15
    const/16 v1, 0x12

    .line 16
    .line 17
    invoke-direct {v0, p10, p6, p8, v1}, La/g8l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance p6, La/o20;

    .line 21
    .line 22
    const/16 p8, 0xb

    .line 23
    .line 24
    invoke-direct {p6, p3, p7, p8}, La/o20;-><init>(La/ctf0;La/g2v;B)V

    .line 25
    .line 26
    .line 27
    const/4 p7, 0x0

    .line 28
    invoke-direct {p0, v0, p12, p6, p7}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/ryy;->o:La/i1w0;

    .line 32
    .line 33
    iput-object p2, p0, La/ryy;->p:Lorg/xplatform/ufc/api/last_fights/LastFightsParams;

    .line 34
    .line 35
    iput-object p3, p0, La/ryy;->q:La/ctf0;

    .line 36
    .line 37
    iput-object p4, p0, La/ryy;->r:La/kys0;

    .line 38
    .line 39
    iput-object p5, p0, La/ryy;->s:La/m1e;

    .line 40
    .line 41
    iput-object p9, p0, La/ryy;->t:La/j3c;

    .line 42
    .line 43
    iput-object p11, p0, La/ryy;->u:La/f4u;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ryy;->x:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ryy;->s:La/m1e;

    .line 7
    .line 8
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, La/slx;

    .line 17
    .line 18
    const/4 v2, 0x7

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, p0, v3, v2}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/fnq;

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    invoke-direct {v2, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    invoke-static {p0, v2, v3, v3, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/ryy;->x:La/c4m0;

    .line 35
    .line 36
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/eyy;

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
    instance-of v0, p1, La/zxy;

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    check-cast p1, La/zxy;

    .line 14
    .line 15
    sget-object v0, La/yxy;->a:La/yxy;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/ryy;->M()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, La/xxy;->a:La/xxy;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, La/ryy;->y:La/bby;

    .line 36
    .line 37
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/ryy;->x:La/c4m0;

    .line 41
    .line 42
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    sget-object v0, La/wxy;->a:La/wxy;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    instance-of v0, p1, La/dyy;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    check-cast p1, La/dyy;

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    iget-wide v2, p0, La/ryy;->v:J

    .line 73
    .line 74
    sub-long v2, v0, v2

    .line 75
    .line 76
    sget-object v4, La/ymx;->b:La/ymx;

    .line 77
    .line 78
    const-wide/16 v4, 0xc8

    .line 79
    .line 80
    cmp-long v2, v2, v4

    .line 81
    .line 82
    if-lez v2, :cond_5

    .line 83
    .line 84
    iget-object v2, p0, La/ryy;->w:La/bby;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    if-eqz v2, :cond_4

    .line 88
    .line 89
    invoke-interface {v2, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    new-instance v2, La/r72;

    .line 93
    .line 94
    const/16 v4, 0xc

    .line 95
    .line 96
    invoke-direct {v2, p1, p0, v3, v4}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 97
    .line 98
    .line 99
    const/4 p1, 0x3

    .line 100
    invoke-static {p0, v3, v3, v2, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, La/ryy;->w:La/bby;

    .line 105
    .line 106
    iput-wide v0, p0, La/ryy;->v:J

    .line 107
    .line 108
    :cond_5
    return-void

    .line 109
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 110
    .line 111
    .line 112
    return-void
.end method
