.class public final La/jn90;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic s:I


# instance fields
.field public final o:La/d1u;

.field public final p:La/ivn;

.field public final q:La/ljf0;

.field public final r:La/o8f;


# direct methods
.method public constructor <init>(La/mne;La/d1u;La/ivn;La/ljf0;La/o8f;)V
    .locals 6

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/wm90;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {v2, v0}, La/wm90;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/ev80;

    .line 11
    .line 12
    const/16 v0, 0x1b

    .line 13
    .line 14
    invoke-direct {v3, v0}, La/ev80;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 18
    .line 19
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 20
    .line 21
    invoke-static {v0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

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
    iput-object p2, v0, La/jn90;->o:La/d1u;

    .line 32
    .line 33
    iput-object p3, v0, La/jn90;->p:La/ivn;

    .line 34
    .line 35
    iput-object p4, v0, La/jn90;->q:La/ljf0;

    .line 36
    .line 37
    iput-object p5, v0, La/jn90;->r:La/o8f;

    .line 38
    .line 39
    new-instance p0, La/hr;

    .line 40
    .line 41
    const/16 p1, 0x17

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    invoke-direct {p0, v0, p2, p1}, La/hr;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x3

    .line 48
    invoke-static {v0, p2, p2, p0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 5

    .line 1
    check-cast p1, La/bn90;

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
    iget-wide v0, p1, La/bn90;->a:J

    .line 10
    .line 11
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, La/gn90;

    .line 16
    .line 17
    iget-object p1, p1, La/gn90;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    move-object v3, v2

    .line 34
    check-cast v3, La/rvm0;

    .line 35
    .line 36
    iget-wide v3, v3, La/rvm0;->a:J

    .line 37
    .line 38
    cmp-long v3, v3, v0

    .line 39
    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    :goto_0
    check-cast v2, La/rvm0;

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget-object p1, p0, La/jn90;->q:La/ljf0;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, La/ljf0;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, La/vdn;

    .line 57
    .line 58
    iget-object p1, p1, La/vdn;->a:La/udn;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p1, p1, La/udn;->b:La/p7m0;

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    move-object v1, v0

    .line 70
    check-cast v1, La/rvm0;

    .line 71
    .line 72
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    sget-object p1, La/fn90;->a:La/fn90;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method
