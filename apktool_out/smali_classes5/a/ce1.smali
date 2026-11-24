.class public final La/ce1;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/i1w0;

.field public final p:La/peg0;

.field public final q:La/b4j;

.field public final r:La/je;


# direct methods
.method public constructor <init>(La/i1w0;La/ctf0;La/peg0;La/b4j;La/je;Ljava/util/List;La/mne;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, La/c51;

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    invoke-direct {v2, v0}, La/c51;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v3, La/k1;

    .line 11
    .line 12
    const/16 v0, 0x1d

    .line 13
    .line 14
    invoke-direct {v3, p6, p2, v0}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iget-object p2, p7, La/mne;->a:La/rwj;

    .line 18
    .line 19
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    move-object v0, p0

    .line 26
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/ce1;->o:La/i1w0;

    .line 30
    .line 31
    iput-object p3, v0, La/ce1;->p:La/peg0;

    .line 32
    .line 33
    iput-object p4, v0, La/ce1;->q:La/b4j;

    .line 34
    .line 35
    iput-object p5, v0, La/ce1;->r:La/je;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, La/wec0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/tec0;->a:La/tec0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget-object v0, La/vec0;->a:La/vec0;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget-object v1, La/xec0;->a:La/xec0;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, La/ce1;->q:La/b4j;

    .line 29
    .line 30
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 31
    .line 32
    const-string v0, "msg_promocode_presents_call"

    .line 33
    .line 34
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, La/ce1;->r:La/je;

    .line 38
    .line 39
    iget-object p1, p1, La/je;->a:La/s1p;

    .line 40
    .line 41
    const-wide/16 v2, 0xc44

    .line 42
    .line 43
    sget-object v0, La/xun;->a:La/xun;

    .line 44
    .line 45
    invoke-virtual {p1, v0, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 46
    .line 47
    .line 48
    new-instance p1, La/m51;

    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    invoke-direct {p1, p0, v0}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/ce1;->o:La/i1w0;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    sget-object v0, La/uec0;->a:La/uec0;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 76
    .line 77
    .line 78
    return-void
.end method
