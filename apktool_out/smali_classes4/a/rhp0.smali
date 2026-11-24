.class public final La/rhp0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final o:La/mne;

.field public final p:La/duj;

.field public final q:La/hnu;

.field public final r:Ljava/lang/String;

.field public final s:La/i1w0;


# direct methods
.method public constructor <init>(La/m1e;La/mne;La/ocl;La/duj;La/hnu;Ljava/lang/String;La/i1w0;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/mhp0;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {v2, v0}, La/mhp0;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/yar;

    .line 11
    .line 12
    const/16 v0, 0xd

    .line 13
    .line 14
    invoke-direct {v3, p3, v0}, La/yar;-><init>(La/ocl;B)V

    .line 15
    .line 16
    .line 17
    iget-object p3, p2, La/mne;->a:La/rwj;

    .line 18
    .line 19
    iget-object v6, p2, La/mne;->b:La/dvj;

    .line 20
    .line 21
    invoke-static {p3, v6}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v1, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, v0, La/rhp0;->o:La/mne;

    .line 32
    .line 33
    iput-object p4, v0, La/rhp0;->p:La/duj;

    .line 34
    .line 35
    iput-object p5, v0, La/rhp0;->q:La/hnu;

    .line 36
    .line 37
    iput-object p6, v0, La/rhp0;->r:Ljava/lang/String;

    .line 38
    .line 39
    iput-object p7, v0, La/rhp0;->s:La/i1w0;

    .line 40
    .line 41
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, La/z2n0;

    .line 46
    .line 47
    const/4 p2, 0x0

    .line 48
    const/16 p3, 0x8

    .line 49
    .line 50
    invoke-direct {p1, v0, p2, p3}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/fnq;

    .line 54
    .line 55
    const/4 p2, 0x4

    .line 56
    invoke-direct {v1, p0, p1, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 57
    .line 58
    .line 59
    new-instance p0, La/g0p0;

    .line 60
    .line 61
    const/4 p6, 0x0

    .line 62
    const/16 p7, 0xb

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    const-class p3, La/rhp0;

    .line 66
    .line 67
    const-string p4, "handleError"

    .line 68
    .line 69
    const-string p5, "handleError(Ljava/lang/Throwable;)V"

    .line 70
    .line 71
    move-object p2, v0

    .line 72
    invoke-direct/range {p0 .. p7}, La/g0p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1, v6, p0}, La/i3t0;->J(La/gmq;La/lne;Lkotlin/jvm/functions/Function1;)La/c4m0;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, La/rhp0;->M()V

    .line 79
    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 6

    .line 1
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 2
    .line 3
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 4
    .line 5
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, La/ghp0;

    .line 14
    .line 15
    iget-object v3, p0, La/i3t0;->f:La/oyg0;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v2, v2, La/ghp0;->a:La/shp0;

    .line 21
    .line 22
    new-instance v3, La/ghp0;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-direct {v3, v2, v4, v5, v5}, La/ghp0;-><init>(La/shp0;ZZZ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, La/rhp0;->o:La/mne;

    .line 36
    .line 37
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 38
    .line 39
    new-instance v1, La/ttn0;

    .line 40
    .line 41
    const/16 v2, 0x19

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    new-instance v2, La/hhb0;

    .line 47
    .line 48
    const/4 v3, 0x0

    .line 49
    const/16 v4, 0x17

    .line 50
    .line 51
    invoke-direct {v2, p0, v3, v4}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0, v1, v2}, La/i3t0;->I(La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/bby;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/rgp0;

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
    instance-of v0, p1, La/pgp0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, La/rhp0;->s:La/i1w0;

    .line 14
    .line 15
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, La/c8d;

    .line 20
    .line 21
    sget-object v1, La/y7d;->a:La/v7d;

    .line 22
    .line 23
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    move-object v0, p1

    .line 34
    check-cast v0, La/paw;

    .line 35
    .line 36
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/oe50;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    return-void

    .line 53
    :cond_1
    instance-of p1, p1, La/qgp0;

    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, La/rhp0;->M()V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 62
    .line 63
    .line 64
    return-void
.end method
