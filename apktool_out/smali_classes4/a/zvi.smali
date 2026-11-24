.class public final La/zvi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/xvi;


# direct methods
.method public constructor <init>(La/xvi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zvi;->a:La/xvi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 15

    .line 1
    new-instance v0, La/m7o0;

    .line 2
    .line 3
    iget-object p0, p0, La/zvi;->a:La/xvi;

    .line 4
    .line 5
    iget-object p0, p0, La/xvi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/qv2;

    .line 8
    .line 9
    iget-object v1, p0, La/qv2;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 13
    .line 14
    iget-object v1, p0, La/qv2;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, v1

    .line 17
    check-cast v3, La/mne;

    .line 18
    .line 19
    iget-object v1, p0, La/qv2;->d:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, v1

    .line 22
    check-cast v4, La/m1e;

    .line 23
    .line 24
    new-instance v5, La/fxu;

    .line 25
    .line 26
    iget-object v1, p0, La/qv2;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/pyg;

    .line 29
    .line 30
    invoke-interface {v1}, La/pyg;->e()La/udg;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v5, v1}, La/fxu;-><init>(La/udg;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, La/qv2;->f:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v6, v1

    .line 43
    check-cast v6, La/pmi;

    .line 44
    .line 45
    new-instance v7, La/reu;

    .line 46
    .line 47
    iget-object v1, p0, La/qv2;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, La/pyg;

    .line 50
    .line 51
    invoke-interface {v1}, La/pyg;->e()La/udg;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/16 v8, 0x12

    .line 59
    .line 60
    invoke-direct {v7, v1, v8}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, La/qv2;->g:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v8, v1

    .line 66
    check-cast v8, La/wgu;

    .line 67
    .line 68
    iget-object v1, p0, La/qv2;->h:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, La/epi0;

    .line 71
    .line 72
    iget-object v1, v1, La/epi0;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, La/xzp;

    .line 75
    .line 76
    invoke-virtual {v1}, La/xzp;->C()La/r9u;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    iget-object v1, p0, La/qv2;->i:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v10, v1

    .line 83
    check-cast v10, La/ctf0;

    .line 84
    .line 85
    iget-object v1, p0, La/qv2;->j:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v11, v1

    .line 88
    check-cast v11, La/g2v;

    .line 89
    .line 90
    iget-object v1, p0, La/qv2;->k:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v12, v1

    .line 93
    check-cast v12, La/pru;

    .line 94
    .line 95
    iget-object v1, p0, La/qv2;->l:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v13, v1

    .line 98
    check-cast v13, La/ih5;

    .line 99
    .line 100
    iget-object p0, p0, La/qv2;->m:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v14, p0

    .line 103
    check-cast v14, La/zr1;

    .line 104
    .line 105
    move-object/from16 v1, p1

    .line 106
    .line 107
    invoke-direct/range {v0 .. v14}, La/m7o0;-><init>(La/vzg0;Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;La/mne;La/m1e;La/fxu;La/pmi;La/reu;La/wgu;La/r9u;La/ctf0;La/g2v;La/pru;La/ih5;La/zr1;)V

    .line 108
    .line 109
    .line 110
    return-object v0
.end method
