.class public final La/gme0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/f4u;

.field public final p:Ljava/lang/String;

.field public final q:La/duj;

.field public final r:La/i1w0;

.field public final s:La/mne;

.field public t:La/bby;


# direct methods
.method public constructor <init>(La/f4u;La/ocl;La/ctf0;La/m1e;Ljava/lang/String;La/duj;La/i1w0;La/mne;)V
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/o6e0;

    .line 8
    .line 9
    const/16 v0, 0x14

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/o6e0;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/gpb0;

    .line 15
    .line 16
    const/4 v6, 0x4

    .line 17
    invoke-direct {v3, p2, p3, v6}, La/gpb0;-><init>(La/ocl;La/ctf0;B)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p8, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object p3, p8, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p2, p3}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    iput-object p1, v0, La/gme0;->o:La/f4u;

    .line 35
    .line 36
    iput-object p5, v0, La/gme0;->p:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p6, v0, La/gme0;->q:La/duj;

    .line 39
    .line 40
    iput-object p7, v0, La/gme0;->r:La/i1w0;

    .line 41
    .line 42
    iput-object p8, v0, La/gme0;->s:La/mne;

    .line 43
    .line 44
    invoke-interface {p4}, La/m1e;->b()La/gmq;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, La/fme0;

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    const/4 p4, 0x0

    .line 52
    invoke-direct {p1, v0, p4, p2}, La/fme0;-><init>(La/gme0;La/yje;B)V

    .line 53
    .line 54
    .line 55
    new-instance p2, La/fnq;

    .line 56
    .line 57
    invoke-direct {p2, p0, p1, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0, p3}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, La/s9c0;

    .line 69
    .line 70
    const/16 p3, 0x1b

    .line 71
    .line 72
    invoke-direct {p1, v0, p4, p3}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p2, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, La/gme0;->M()V

    .line 79
    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final M()V
    .locals 12

    .line 1
    iget-object v0, p0, La/gme0;->t:La/bby;

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
    check-cast v3, La/yle0;

    .line 26
    .line 27
    iget-object v4, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object v3, v3, La/yle0;->d:La/rle0;

    .line 33
    .line 34
    new-instance v4, La/yle0;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-direct {v4, v1, v5, v5, v3}, La/yle0;-><init>(ZZZLa/rle0;)V

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
    move-result-object v6

    .line 50
    iget-object v0, p0, La/gme0;->s:La/mne;

    .line 51
    .line 52
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 53
    .line 54
    new-instance v7, La/eme0;

    .line 55
    .line 56
    invoke-direct {v7, p0, v5}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance v10, La/fme0;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-direct {v10, p0, v0, v1}, La/fme0;-><init>(La/gme0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    const/16 v11, 0xa

    .line 66
    .line 67
    const/4 v8, 0x0

    .line 68
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/gme0;->t:La/bby;

    .line 73
    .line 74
    return-void
.end method

.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/tke0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/rke0;->a:La/rke0;

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
    iget-object p0, p0, La/gme0;->r:La/i1w0;

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
    sget-object v0, La/ske0;->a:La/ske0;

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
    invoke-virtual {p0}, La/gme0;->M()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    return-void
.end method
