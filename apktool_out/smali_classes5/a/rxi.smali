.class public final La/rxi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/msi;


# direct methods
.method public constructor <init>(La/msi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rxi;->a:La/msi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 16

    .line 1
    new-instance v0, La/edr0;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, La/rxi;->a:La/msi;

    .line 6
    .line 7
    iget-object v1, v1, La/msi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/txi;

    .line 10
    .line 11
    iget-object v2, v1, La/txi;->a:Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v3, v1, La/txi;->b:La/m1e;

    .line 18
    .line 19
    new-instance v4, La/zpu;

    .line 20
    .line 21
    invoke-virtual {v1}, La/txi;->a()La/dhm0;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    new-instance v6, La/ani0;

    .line 26
    .line 27
    iget-object v7, v1, La/txi;->g:La/k3r0;

    .line 28
    .line 29
    invoke-direct {v6, v7}, La/ani0;-><init>(La/k3r0;)V

    .line 30
    .line 31
    .line 32
    const/4 v7, 0x4

    .line 33
    invoke-direct {v4, v5, v6, v7}, La/zpu;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/tsc;

    .line 37
    .line 38
    invoke-virtual {v1}, La/txi;->a()La/dhm0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, La/tsc;-><init>(La/dhm0;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, La/owp0;

    .line 46
    .line 47
    invoke-virtual {v1}, La/txi;->a()La/dhm0;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    const/16 v8, 0xd

    .line 52
    .line 53
    invoke-direct {v6, v7, v8}, La/owp0;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    iget-object v7, v1, La/txi;->h:La/ugf0;

    .line 57
    .line 58
    iget-object v7, v7, La/ugf0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, La/daf;

    .line 61
    .line 62
    invoke-virtual {v7}, La/daf;->w()La/luu;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object v8, v1, La/txi;->c:La/cad;

    .line 70
    .line 71
    iget-object v8, v8, La/cad;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, La/psc;

    .line 74
    .line 75
    invoke-virtual {v8}, La/psc;->h()La/mne;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v9, v1, La/txi;->i:La/i1w0;

    .line 83
    .line 84
    iget-object v10, v1, La/txi;->j:La/ctf0;

    .line 85
    .line 86
    iget-object v11, v1, La/txi;->k:La/yo4;

    .line 87
    .line 88
    iget-object v12, v1, La/txi;->l:La/d1p;

    .line 89
    .line 90
    invoke-interface {v12}, La/d1p;->W()La/zr1;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    new-instance v13, La/bzt;

    .line 95
    .line 96
    iget-object v14, v1, La/txi;->m:La/fsd;

    .line 97
    .line 98
    invoke-direct {v13, v14}, La/bzt;-><init>(La/fsd;)V

    .line 99
    .line 100
    .line 101
    iget-object v14, v1, La/txi;->n:La/r9u;

    .line 102
    .line 103
    new-instance v15, La/tsc;

    .line 104
    .line 105
    invoke-virtual {v1}, La/txi;->a()La/dhm0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {v15, v1}, La/tsc;-><init>(La/dhm0;)V

    .line 110
    .line 111
    .line 112
    move-object/from16 v1, p1

    .line 113
    .line 114
    invoke-direct/range {v0 .. v15}, La/edr0;-><init>(La/vzg0;ILa/m1e;La/zpu;La/tsc;La/owp0;La/luu;La/mne;La/i1w0;La/ctf0;La/yo4;La/zr1;La/bzt;La/r9u;La/tsc;)V

    .line 115
    .line 116
    .line 117
    return-object v0
.end method
