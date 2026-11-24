.class public final La/qke0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/b8u;

.field public final p:La/mne;

.field public final q:La/i1w0;

.field public final r:La/duj;

.field public final s:Ljava/lang/String;

.field public t:La/bby;


# direct methods
.method public constructor <init>(La/b8u;La/m1e;La/mne;La/i1w0;La/duj;Ljava/lang/String;La/ocl;La/ctf0;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    const/16 v0, 0x10

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/o6e0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/gpb0;

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    invoke-direct {v3, p7, p8, v0}, La/gpb0;-><init>(La/ocl;La/ctf0;B)V

    .line 18
    .line 19
    .line 20
    iget-object p7, p3, La/mne;->a:La/rwj;

    .line 21
    .line 22
    invoke-static {p7, p7}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v1, 0x0

    .line 28
    move-object v0, p0

    .line 29
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/qke0;->o:La/b8u;

    .line 33
    .line 34
    iput-object p3, v0, La/qke0;->p:La/mne;

    .line 35
    .line 36
    iput-object p4, v0, La/qke0;->q:La/i1w0;

    .line 37
    .line 38
    iput-object p5, v0, La/qke0;->r:La/duj;

    .line 39
    .line 40
    iput-object p6, v0, La/qke0;->s:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {p2}, La/m1e;->b()La/gmq;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    new-instance p1, La/pke0;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    const/4 p4, 0x0

    .line 50
    invoke-direct {p1, v0, p2, p4}, La/pke0;-><init>(La/qke0;La/yje;B)V

    .line 51
    .line 52
    .line 53
    new-instance p2, La/fnq;

    .line 54
    .line 55
    const/4 p4, 0x4

    .line 56
    invoke-direct {p2, p0, p1, p4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    iget-object p1, p3, La/mne;->b:La/dvj;

    .line 64
    .line 65
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p2, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, La/qke0;->M()V

    .line 73
    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 9

    .line 1
    iget-object v0, p0, La/qke0;->t:La/bby;

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
    check-cast v3, La/ike0;

    .line 26
    .line 27
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v3, v3, La/ike0;->c:La/qje0;

    .line 33
    .line 34
    new-instance v4, La/ike0;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-direct {v4, v1, v5, v3}, La/ike0;-><init>(ZZLa/qje0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v0, p0, La/qke0;->p:La/mne;

    .line 51
    .line 52
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 53
    .line 54
    new-instance v4, La/v6d0;

    .line 55
    .line 56
    const/16 v0, 0x1c

    .line 57
    .line 58
    invoke-direct {v4, p0, v0}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 59
    .line 60
    .line 61
    new-instance v7, La/pke0;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-direct {v7, p0, v0, v1}, La/pke0;-><init>(La/qke0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 v8, 0xa

    .line 68
    .line 69
    const/4 v5, 0x0

    .line 70
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/qke0;->t:La/bby;

    .line 75
    .line 76
    return-void
.end method

.method public final N(La/wje0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/uje0;->a:La/uje0;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, La/qke0;->q:La/i1w0;

    .line 16
    .line 17
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, La/c8d;

    .line 22
    .line 23
    sget-object v1, La/y7d;->a:La/v7d;

    .line 24
    .line 25
    sget-object v2, La/p0w0;->a:La/p0w0;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {p1, v0, p0, p1, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    move-object v0, p1

    .line 36
    check-cast v0, La/paw;

    .line 37
    .line 38
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/oe50;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void

    .line 55
    :cond_1
    sget-object v0, La/vje0;->a:La/vje0;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    invoke-virtual {p0}, La/qke0;->M()V

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

.method public final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, La/wje0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/qke0;->N(La/wje0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
