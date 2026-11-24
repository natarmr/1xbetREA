.class public final La/ztu0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic w:I


# instance fields
.field public final o:La/i1w0;

.field public final p:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

.field public final q:La/m1e;

.field public final r:La/bzu;

.field public s:J

.field public t:La/bby;

.field public u:La/bby;

.field public v:La/c4m0;


# direct methods
.method public constructor <init>(La/i1w0;Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;La/ctf0;La/m1e;La/mne;La/g2v;La/bzu;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p5, La/mne;->c:La/vs10;

    .line 8
    .line 9
    iget-object p5, p5, La/mne;->a:La/rwj;

    .line 10
    .line 11
    invoke-static {v0, p5}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 12
    .line 13
    .line 14
    move-result-object p5

    .line 15
    new-instance v0, La/rbt0;

    .line 16
    .line 17
    const/16 v1, 0x11

    .line 18
    .line 19
    invoke-direct {v0, p2, v1}, La/rbt0;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/cls0;

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    invoke-direct {v1, p3, p6, v2}, La/cls0;-><init>(La/ctf0;La/g2v;B)V

    .line 27
    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    invoke-direct {p0, v0, p5, v1, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/ztu0;->o:La/i1w0;

    .line 34
    .line 35
    iput-object p2, p0, La/ztu0;->p:Lorg/xplatform/cyber/section/api/presentation/rules/VirtualSportRulesParams;

    .line 36
    .line 37
    iput-object p4, p0, La/ztu0;->q:La/m1e;

    .line 38
    .line 39
    iput-object p7, p0, La/ztu0;->r:La/bzu;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/ztu0;->v:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ztu0;->q:La/m1e;

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
    const/16 v2, 0x14

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
    iput-object v0, p0, La/ztu0;->v:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, La/psu0;

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
    instance-of v0, p1, La/ksu0;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    check-cast p1, La/ksu0;

    .line 14
    .line 15
    sget-object v0, La/jsu0;->a:La/jsu0;

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
    invoke-virtual {p0}, La/ztu0;->M()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, La/isu0;->a:La/isu0;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, La/ztu0;->u:La/bby;

    .line 36
    .line 37
    invoke-static {p1}, La/e3c;->n(La/bby;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, La/ztu0;->v:La/c4m0;

    .line 41
    .line 42
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    instance-of v0, p1, La/osu0;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    check-cast p1, La/osu0;

    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v0

    .line 60
    iget-wide v2, p0, La/ztu0;->s:J

    .line 61
    .line 62
    sub-long v2, v0, v2

    .line 63
    .line 64
    sget-object v4, La/ymx;->b:La/ymx;

    .line 65
    .line 66
    const-wide/16 v4, 0xc8

    .line 67
    .line 68
    cmp-long v2, v2, v4

    .line 69
    .line 70
    if-lez v2, :cond_4

    .line 71
    .line 72
    iget-object v2, p0, La/ztu0;->t:La/bby;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v2, :cond_3

    .line 76
    .line 77
    invoke-interface {v2, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    new-instance v2, La/r72;

    .line 81
    .line 82
    const/16 v4, 0x19

    .line 83
    .line 84
    invoke-direct {v2, p1, p0, v3, v4}, La/r72;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 85
    .line 86
    .line 87
    const/4 p1, 0x3

    .line 88
    invoke-static {p0, v3, v3, v2, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, La/ztu0;->t:La/bby;

    .line 93
    .line 94
    iput-wide v0, p0, La/ztu0;->s:J

    .line 95
    .line 96
    :cond_4
    return-void

    .line 97
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 98
    .line 99
    .line 100
    return-void
.end method
