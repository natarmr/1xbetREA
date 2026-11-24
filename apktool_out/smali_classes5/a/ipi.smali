.class public final La/ipi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kib0;


# instance fields
.field public final a:La/q7d0;

.field public final b:La/rrc;

.field public final c:La/n5d0;

.field public final d:La/n5d0;

.field public final e:La/n5d0;

.field public final f:La/n5d0;

.field public final g:La/n5d0;

.field public final h:La/n5d0;

.field public final i:La/n5d0;


# direct methods
.method public constructor <init>(La/rrc;La/q7d0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/ipi;->a:La/q7d0;

    .line 5
    .line 6
    iput-object p1, p0, La/ipi;->b:La/rrc;

    .line 7
    .line 8
    new-instance p1, La/omi;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    const/16 v0, 0x12

    .line 12
    .line 13
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/ipi;->c:La/n5d0;

    .line 21
    .line 22
    new-instance p1, La/omi;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/ipi;->d:La/n5d0;

    .line 33
    .line 34
    new-instance p1, La/omi;

    .line 35
    .line 36
    const/4 p2, 0x2

    .line 37
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, La/ipi;->e:La/n5d0;

    .line 45
    .line 46
    new-instance p1, La/omi;

    .line 47
    .line 48
    const/4 p2, 0x3

    .line 49
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, La/ipi;->f:La/n5d0;

    .line 57
    .line 58
    new-instance p1, La/omi;

    .line 59
    .line 60
    const/4 p2, 0x5

    .line 61
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, La/ipi;->g:La/n5d0;

    .line 69
    .line 70
    new-instance p1, La/omi;

    .line 71
    .line 72
    const/4 p2, 0x4

    .line 73
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, La/ipi;->h:La/n5d0;

    .line 81
    .line 82
    new-instance p1, La/omi;

    .line 83
    .line 84
    const/4 p2, 0x6

    .line 85
    invoke-direct {p1, p0, p2, v0}, La/omi;-><init>(Ljava/lang/Object;IB)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, La/ipi;->i:La/n5d0;

    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final a()La/xrt;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->c:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xrt;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()La/qqx;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->g:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qqx;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c()La/hou;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->h:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/hou;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()La/jbx;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->f:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/jbx;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e()La/gmu;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->d:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gmu;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f()La/nrc;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->i:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nrc;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g()La/puu;
    .locals 0

    .line 1
    iget-object p0, p0, La/ipi;->e:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/puu;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h()La/nv20;
    .locals 3

    .line 1
    new-instance v0, La/nv20;

    .line 2
    .line 3
    new-instance v1, La/of6;

    .line 4
    .line 5
    iget-object p0, p0, La/ipi;->a:La/q7d0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, v2}, La/of6;-><init>(La/q7d0;B)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, La/nv20;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
