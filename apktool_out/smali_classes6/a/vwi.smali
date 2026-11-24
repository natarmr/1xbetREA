.class public final La/vwi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/psi;


# direct methods
.method public constructor <init>(La/psi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vwi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/pyp0;

    .line 2
    .line 3
    iget-object p0, p0, La/vwi;->a:La/psi;

    .line 4
    .line 5
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ru;

    .line 8
    .line 9
    iget-object v1, p0, La/ru;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/cad;

    .line 12
    .line 13
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/psc;

    .line 16
    .line 17
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, La/ru;->b:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, v1

    .line 27
    check-cast v3, La/i1w0;

    .line 28
    .line 29
    iget-object v1, p0, La/ru;->e:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v4, v1

    .line 32
    check-cast v4, La/ctf0;

    .line 33
    .line 34
    new-instance v5, La/x4u;

    .line 35
    .line 36
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/n5d0;

    .line 39
    .line 40
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, La/xyp0;

    .line 45
    .line 46
    invoke-direct {v5, v1}, La/x4u;-><init>(La/xyp0;)V

    .line 47
    .line 48
    .line 49
    new-instance v6, La/psu;

    .line 50
    .line 51
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, La/n5d0;

    .line 54
    .line 55
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/xyp0;

    .line 60
    .line 61
    const/4 v7, 0x2

    .line 62
    invoke-direct {v6, v1, v7}, La/psu;-><init>(La/xyp0;B)V

    .line 63
    .line 64
    .line 65
    new-instance v7, La/psu;

    .line 66
    .line 67
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, La/n5d0;

    .line 70
    .line 71
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, La/xyp0;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    invoke-direct {v7, v1, v8}, La/psu;-><init>(La/xyp0;B)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/osc;

    .line 82
    .line 83
    iget-object v1, p0, La/ru;->i:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, La/n5d0;

    .line 86
    .line 87
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/xyp0;

    .line 92
    .line 93
    const/4 v9, 0x1

    .line 94
    invoke-direct {v8, v1, v9}, La/osc;-><init>(La/xyp0;B)V

    .line 95
    .line 96
    .line 97
    new-instance v9, La/lsn;

    .line 98
    .line 99
    iget-object p0, p0, La/ru;->i:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, La/n5d0;

    .line 102
    .line 103
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    check-cast p0, La/xyp0;

    .line 108
    .line 109
    invoke-direct {v9, p0}, La/lsn;-><init>(La/xyp0;)V

    .line 110
    .line 111
    .line 112
    move-object v1, p1

    .line 113
    invoke-direct/range {v0 .. v9}, La/pyp0;-><init>(La/vzg0;La/mne;La/i1w0;La/ctf0;La/x4u;La/psu;La/psu;La/osc;La/lsn;)V

    .line 114
    .line 115
    .line 116
    return-object v0
.end method
