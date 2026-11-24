.class public final La/kje0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/duj;

.field public final p:La/reu;

.field public final q:La/i1w0;

.field public final r:Ljava/lang/String;

.field public final s:La/mne;

.field public t:La/bby;


# direct methods
.method public constructor <init>(La/duj;La/reu;La/m1e;La/i1w0;La/ocl;Ljava/lang/String;La/mne;La/r9u;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/o6e0;

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/o6e0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/xuh;

    .line 15
    .line 16
    const/16 v0, 0xb

    .line 17
    .line 18
    invoke-direct {v3, p5, p8, v0}, La/xuh;-><init>(La/ocl;La/r9u;B)V

    .line 19
    .line 20
    .line 21
    iget-object p5, p7, La/mne;->c:La/vs10;

    .line 22
    .line 23
    iget-object p8, p7, La/mne;->a:La/rwj;

    .line 24
    .line 25
    invoke-static {p5, p8}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    move-object v0, p0

    .line 32
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, La/kje0;->o:La/duj;

    .line 36
    .line 37
    iput-object p2, v0, La/kje0;->p:La/reu;

    .line 38
    .line 39
    iput-object p4, v0, La/kje0;->q:La/i1w0;

    .line 40
    .line 41
    iput-object p6, v0, La/kje0;->r:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p7, v0, La/kje0;->s:La/mne;

    .line 44
    .line 45
    new-instance p0, La/ax5;

    .line 46
    .line 47
    invoke-direct {p0, v0}, La/ax5;-><init>(La/kje0;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p3}, La/m1e;->b()La/gmq;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance p2, La/jje0;

    .line 55
    .line 56
    const/4 p3, 0x0

    .line 57
    const/4 p4, 0x0

    .line 58
    invoke-direct {p2, v0, p3, p4}, La/jje0;-><init>(La/kje0;La/yje;B)V

    .line 59
    .line 60
    .line 61
    new-instance p3, La/fnq;

    .line 62
    .line 63
    const/4 p4, 0x4

    .line 64
    invoke-direct {p3, p1, p2, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iget-object p2, p7, La/mne;->b:La/dvj;

    .line 72
    .line 73
    invoke-static {p1, p2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p3, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, La/kje0;->M()V

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, La/kje0;->t:La/bby;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 14
    .line 15
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-object v3, v2

    .line 25
    check-cast v3, La/dje0;

    .line 26
    .line 27
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static {v3, v1, v4}, La/dje0;->a(La/dje0;ZZ)La/dje0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v0, p0, La/kje0;->s:La/mne;

    .line 48
    .line 49
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 50
    .line 51
    new-instance v4, La/v6d0;

    .line 52
    .line 53
    const/16 v0, 0x1a

    .line 54
    .line 55
    invoke-direct {v4, p0, v0}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance v7, La/jje0;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {v7, p0, v0, v1}, La/jje0;-><init>(La/kje0;La/yje;B)V

    .line 62
    .line 63
    .line 64
    const/16 v8, 0xa

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/kje0;->t:La/bby;

    .line 72
    .line 73
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/wie0;

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
    sget-object v0, La/uie0;->a:La/uie0;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, La/kje0;->q:La/i1w0;

    .line 18
    .line 19
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, La/c8d;

    .line 24
    .line 25
    sget-object v1, La/y7d;->a:La/v7d;

    .line 26
    .line 27
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_0
    move-object v0, p1

    .line 38
    check-cast v0, La/paw;

    .line 39
    .line 40
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, La/oe50;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    sget-object v0, La/vie0;->a:La/vie0;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, La/kje0;->M()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 70
    .line 71
    .line 72
    return-void
.end method
