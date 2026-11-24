.class public final La/hcx;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic v:I


# instance fields
.field public final o:La/e1u;

.field public final p:Ljava/lang/String;

.field public final q:La/i1w0;

.field public final r:La/ctf0;

.field public final s:La/mne;

.field public t:La/c4m0;

.field public u:La/bby;


# direct methods
.method public constructor <init>(La/e1u;La/m1e;Ljava/lang/String;La/i1w0;La/ctf0;La/ocl;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/kdw;

    .line 8
    .line 9
    const/16 v0, 0x1d

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/kdw;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/yar;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    invoke-direct {v3, p6, v0}, La/yar;-><init>(La/ocl;B)V

    .line 18
    .line 19
    .line 20
    iget-object p6, p7, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object v0, p7, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p6, v0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v0, La/hcx;->o:La/e1u;

    .line 35
    .line 36
    iput-object p3, v0, La/hcx;->p:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p4, v0, La/hcx;->q:La/i1w0;

    .line 39
    .line 40
    iput-object p5, v0, La/hcx;->r:La/ctf0;

    .line 41
    .line 42
    iput-object p7, v0, La/hcx;->s:La/mne;

    .line 43
    .line 44
    invoke-interface {p2}, La/m1e;->b()La/gmq;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, La/gcx;

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    const/4 p3, 0x0

    .line 52
    invoke-direct {p1, v0, p2, p3}, La/gcx;-><init>(La/hcx;La/yje;B)V

    .line 53
    .line 54
    .line 55
    new-instance p2, La/fnq;

    .line 56
    .line 57
    const/4 p3, 0x4

    .line 58
    invoke-direct {p2, p0, p1, p3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object p1, p7, La/mne;->b:La/dvj;

    .line 66
    .line 67
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p2, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 72
    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final M(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, La/hcx;->u:La/bby;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, La/hcx;->s:La/mne;

    .line 18
    .line 19
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 20
    .line 21
    new-instance v3, La/adw;

    .line 22
    .line 23
    const/16 v0, 0xe

    .line 24
    .line 25
    invoke-direct {v3, p0, v0}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v6, La/u88;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    const/16 v1, 0x16

    .line 32
    .line 33
    invoke-direct {v6, p0, p1, v0, v1}, La/u88;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 34
    .line 35
    .line 36
    const/16 v7, 0xa

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, La/hcx;->u:La/bby;

    .line 44
    .line 45
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/tbx;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/rbx;->a:La/rbx;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, La/hcx;->q:La/i1w0;

    .line 15
    .line 16
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/c8d;

    .line 21
    .line 22
    sget-object v1, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    move-object v0, p1

    .line 35
    check-cast v0, La/paw;

    .line 36
    .line 37
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/oe50;

    .line 48
    .line 49
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-void

    .line 54
    :cond_1
    sget-object v0, La/sbx;->a:La/sbx;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    invoke-virtual {p0, p1}, La/hcx;->M(Z)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 68
    .line 69
    .line 70
    return-void
.end method
