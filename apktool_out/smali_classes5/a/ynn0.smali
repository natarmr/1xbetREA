.class public final La/ynn0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/r7v;

.field public final p:La/ibu;


# direct methods
.method public constructor <init>(La/mne;La/ctf0;JLa/ibu;La/hbu;La/r7v;La/ibu;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/mne;->a:La/rwj;

    .line 5
    .line 6
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 7
    .line 8
    invoke-static {v0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, La/pe1;

    .line 13
    .line 14
    const/4 v5, 0x6

    .line 15
    move-wide v3, p3

    .line 16
    move-object v1, p5

    .line 17
    move-object v2, p6

    .line 18
    invoke-direct/range {v0 .. v5}, La/pe1;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 19
    .line 20
    .line 21
    new-instance p3, La/h0j0;

    .line 22
    .line 23
    const/16 p4, 0x8

    .line 24
    .line 25
    invoke-direct {p3, p2, p4}, La/h0j0;-><init>(La/ctf0;B)V

    .line 26
    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p0, v0, p1, p3, p2}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 30
    .line 31
    .line 32
    iput-object p7, p0, La/ynn0;->o:La/r7v;

    .line 33
    .line 34
    iput-object p8, p0, La/ynn0;->p:La/ibu;

    .line 35
    .line 36
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/vnn0;

    .line 41
    .line 42
    iget-object p1, p1, La/vnn0;->a:La/tdn;

    .line 43
    .line 44
    iget-wide p1, p1, La/tdn;->a:J

    .line 45
    .line 46
    const-wide/16 p3, -0x1

    .line 47
    .line 48
    cmp-long p1, p1, p3

    .line 49
    .line 50
    if-nez p1, :cond_0

    .line 51
    .line 52
    sget-object p1, La/unn0;->a:La/unn0;

    .line 53
    .line 54
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/rnn0;

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
    instance-of v0, p1, La/qnn0;

    .line 10
    .line 11
    sget-object v1, La/unn0;->a:La/unn0;

    .line 12
    .line 13
    iget-object v2, p0, La/ynn0;->p:La/ibu;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/vnn0;

    .line 22
    .line 23
    iget-object p1, p1, La/vnn0;->a:La/tdn;

    .line 24
    .line 25
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/vnn0;

    .line 30
    .line 31
    iget-object v0, v0, La/vnn0;->b:La/wdn;

    .line 32
    .line 33
    invoke-virtual {v2, p1, v0}, La/ibu;->a(La/tdn;La/wdn;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/vnn0;

    .line 41
    .line 42
    iget-object v0, v0, La/vnn0;->b:La/wdn;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const/4 v2, 0x1

    .line 51
    if-ne v0, v2, :cond_0

    .line 52
    .line 53
    sget-object v0, La/wdn;->c:La/wdn;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    sget-object v0, La/wdn;->d:La/wdn;

    .line 61
    .line 62
    :goto_0
    iget-object v2, p0, La/ynn0;->o:La/r7v;

    .line 63
    .line 64
    invoke-virtual {v2, p1, v0}, La/r7v;->h(La/tdn;La/wdn;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_2
    sget-object v0, La/pnn0;->a:La/pnn0;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/vnn0;

    .line 84
    .line 85
    iget-object p1, p1, La/vnn0;->a:La/tdn;

    .line 86
    .line 87
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, La/vnn0;

    .line 92
    .line 93
    iget-object v0, v0, La/vnn0;->b:La/wdn;

    .line 94
    .line 95
    invoke-virtual {v2, p1, v0}, La/ibu;->a(La/tdn;La/wdn;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 103
    .line 104
    .line 105
    return-void
.end method
