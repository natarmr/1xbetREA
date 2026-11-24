.class public final La/t7p0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;

.field public final p:La/reu;

.field public final q:La/hzg;

.field public final r:La/m1e;

.field public s:La/c4m0;

.field public t:La/bby;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;La/reu;La/hzg;La/ctf0;La/mne;La/m1e;La/g2v;)V
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
    new-instance v0, La/fno0;

    .line 16
    .line 17
    const/16 v1, 0x14

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/fno0;-><init>(B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/o20;

    .line 23
    .line 24
    const/16 v2, 0x1d

    .line 25
    .line 26
    invoke-direct {v1, p4, p7, v2}, La/o20;-><init>(La/ctf0;La/g2v;B)V

    .line 27
    .line 28
    .line 29
    const/4 p4, 0x0

    .line 30
    invoke-direct {p0, v0, p5, v1, p4}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/t7p0;->o:Lorg/xplatform/cyber/section/api/team_details/presentation/TeamDetailsAchievementParams;

    .line 34
    .line 35
    iput-object p2, p0, La/t7p0;->p:La/reu;

    .line 36
    .line 37
    iput-object p3, p0, La/t7p0;->q:La/hzg;

    .line 38
    .line 39
    iput-object p6, p0, La/t7p0;->r:La/m1e;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 5

    .line 1
    iget-object v0, p0, La/t7p0;->s:La/c4m0;

    .line 2
    .line 3
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/t7p0;->r:La/m1e;

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
    new-instance v1, La/z2n0;

    .line 17
    .line 18
    const/4 v2, 0x6

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-direct {v1, p0, v3, v2}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

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
    iput-object v0, p0, La/t7p0;->s:La/c4m0;

    .line 35
    .line 36
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, La/g7p0;

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
    instance-of v0, p1, La/c7p0;

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    check-cast p1, La/c7p0;

    .line 14
    .line 15
    sget-object v0, La/b7p0;->a:La/b7p0;

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
    invoke-virtual {p0}, La/t7p0;->M()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, La/a7p0;->a:La/a7p0;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object p1, p0, La/t7p0;->s:La/c4m0;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p1, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, La/t7p0;->t:La/bby;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-interface {p0, v0}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void

    .line 51
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_4
    instance-of v0, p1, La/f7p0;

    .line 56
    .line 57
    if-eqz v0, :cond_7

    .line 58
    .line 59
    check-cast p1, La/f7p0;

    .line 60
    .line 61
    sget-object v0, La/d7p0;->a:La/d7p0;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    iget-object p0, p0, La/t7p0;->q:La/hzg;

    .line 70
    .line 71
    check-cast p0, La/uzg;

    .line 72
    .line 73
    invoke-virtual {p0}, La/uzg;->a()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_5
    sget-object v0, La/e7p0;->a:La/e7p0;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    invoke-virtual {p0}, La/t7p0;->M()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 94
    .line 95
    .line 96
    return-void
.end method
