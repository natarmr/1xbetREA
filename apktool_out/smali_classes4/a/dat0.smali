.class public final La/dat0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic y:I


# instance fields
.field public final o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

.field public final p:La/hzg;

.field public final q:La/m1e;

.field public final r:La/rpt;

.field public final s:La/zr1;

.field public final t:La/ih5;

.field public u:J

.field public v:La/bby;

.field public w:La/bby;

.field public x:La/c4m0;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;La/mne;La/g2v;La/ctf0;La/hzg;La/m1e;La/rpt;La/zr1;La/ih5;)V
    .locals 3

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v0, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance v0, La/xns0;

    .line 16
    .line 17
    const/16 v1, 0xf

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/xns0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/cls0;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    invoke-direct {v1, p4, p3, v2}, La/cls0;-><init>(La/ctf0;La/g2v;B)V

    .line 26
    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p0, v0, p2, v1, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/dat0;->o:Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampInfoParams;

    .line 33
    .line 34
    iput-object p5, p0, La/dat0;->p:La/hzg;

    .line 35
    .line 36
    iput-object p6, p0, La/dat0;->q:La/m1e;

    .line 37
    .line 38
    iput-object p7, p0, La/dat0;->r:La/rpt;

    .line 39
    .line 40
    iput-object p8, p0, La/dat0;->s:La/zr1;

    .line 41
    .line 42
    iput-object p9, p0, La/dat0;->t:La/ih5;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/dat0;->x:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/dat0;->q:La/m1e;

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
    new-instance v1, La/k6s0;

    .line 17
    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct {v1, p0, v3, v2}, La/k6s0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/fnq;

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    invoke-direct {v2, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x3

    .line 31
    invoke-static {p0, v2, v3, v3, v0}, La/i3t0;->L(La/i3t0;La/gmq;La/lne;Lkotlin/jvm/functions/Function1;I)La/c4m0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, La/dat0;->x:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/t9t0;

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
    instance-of v0, p1, La/o9t0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    check-cast p1, La/o9t0;

    .line 15
    .line 16
    sget-object v0, La/n9t0;->a:La/n9t0;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, La/dat0;->M()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v0, La/m9t0;->a:La/m9t0;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    iget-object p1, p0, La/dat0;->x:La/c4m0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, La/dat0;->w:La/bby;

    .line 44
    .line 45
    if-eqz p0, :cond_5

    .line 46
    .line 47
    invoke-interface {p0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    instance-of v0, p1, La/s9t0;

    .line 56
    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    check-cast p1, La/s9t0;

    .line 60
    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    iget-wide v4, p0, La/dat0;->u:J

    .line 66
    .line 67
    sub-long v4, v2, v4

    .line 68
    .line 69
    sget-object v0, La/ymx;->b:La/ymx;

    .line 70
    .line 71
    const-wide/16 v6, 0xc8

    .line 72
    .line 73
    cmp-long v0, v4, v6

    .line 74
    .line 75
    if-lez v0, :cond_5

    .line 76
    .line 77
    iget-object v0, p0, La/dat0;->v:La/bby;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-interface {v0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    new-instance v0, La/r72;

    .line 85
    .line 86
    const/16 v4, 0x15

    .line 87
    .line 88
    invoke-direct {v0, p1, p0, v1, v4}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x3

    .line 92
    invoke-static {p0, v1, v1, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, La/dat0;->v:La/bby;

    .line 97
    .line 98
    iput-wide v2, p0, La/dat0;->u:J

    .line 99
    .line 100
    :cond_5
    return-void

    .line 101
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 102
    .line 103
    .line 104
    return-void
.end method
