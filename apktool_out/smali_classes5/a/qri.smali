.class public final La/qri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qri;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 7

    .line 1
    new-instance v0, La/sef0;

    .line 2
    .line 3
    iget-object p0, p0, La/qri;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rri;

    .line 8
    .line 9
    iget-object p1, p0, La/rri;->a:La/pdf0;

    .line 10
    .line 11
    invoke-interface {p1}, La/pdf0;->e()La/xfu;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/rri;->b:La/cad;

    .line 19
    .line 20
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, La/psc;

    .line 23
    .line 24
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/rri;->c:La/ctf0;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v2, La/b4f0;

    .line 37
    .line 38
    const/4 v6, 0x5

    .line 39
    invoke-direct {v2, v6}, La/b4f0;-><init>(B)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/iv80;

    .line 43
    .line 44
    const/16 v4, 0x17

    .line 45
    .line 46
    invoke-direct {v3, p0, v4}, La/iv80;-><init>(La/ctf0;B)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v1, La/mne;->a:La/rwj;

    .line 50
    .line 51
    iget-object v1, v1, La/mne;->c:La/vs10;

    .line 52
    .line 53
    invoke-static {p0, v1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p1, La/xfu;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, La/pv00;

    .line 65
    .line 66
    iget-object p0, p0, La/pv00;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/hdf0;

    .line 69
    .line 70
    iget-object p0, p0, La/hdf0;->a:La/p7m0;

    .line 71
    .line 72
    new-instance p1, La/i89;

    .line 73
    .line 74
    const/16 v1, 0x16

    .line 75
    .line 76
    invoke-direct {p1, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 77
    .line 78
    .line 79
    new-instance p0, La/tye0;

    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-direct {p0, v0, v1, v6}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 83
    .line 84
    .line 85
    new-instance v2, La/fnq;

    .line 86
    .line 87
    const/4 v3, 0x4

    .line 88
    invoke-direct {v2, p1, p0, v3}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    new-instance p1, La/p23;

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    const/16 v4, 0xa

    .line 99
    .line 100
    invoke-direct {p1, v3, v1, v4}, La/p23;-><init>(ILa/yje;B)V

    .line 101
    .line 102
    .line 103
    invoke-static {v2, p0, p1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 104
    .line 105
    .line 106
    return-object v0
.end method
