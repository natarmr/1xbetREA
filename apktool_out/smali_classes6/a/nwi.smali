.class public final La/nwi;
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
    iput-object p1, p0, La/nwi;->a:La/xvi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 12

    .line 1
    new-instance v0, La/ykp0;

    .line 2
    .line 3
    iget-object p0, p0, La/nwi;->a:La/xvi;

    .line 4
    .line 5
    iget-object p0, p0, La/xvi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/o3c;

    .line 8
    .line 9
    new-instance v2, La/svu;

    .line 10
    .line 11
    new-instance v1, La/nvu;

    .line 12
    .line 13
    new-instance v3, La/fuj0;

    .line 14
    .line 15
    iget-object v4, p0, La/o3c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, La/gii0;

    .line 18
    .line 19
    const/4 v5, 0x7

    .line 20
    invoke-direct {v3, v4, v5}, La/fuj0;-><init>(La/gii0;B)V

    .line 21
    .line 22
    .line 23
    iget-object v4, p0, La/o3c;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, La/knf0;

    .line 26
    .line 27
    iget-object v5, p0, La/o3c;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, La/cad;

    .line 30
    .line 31
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, La/psc;

    .line 34
    .line 35
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v3, v4, v5}, La/nvu;-><init>(La/fuj0;La/knf0;La/mne;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v1}, La/svu;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/o3c;->e:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v3, v1

    .line 51
    check-cast v3, La/m1e;

    .line 52
    .line 53
    iget-object v1, p0, La/o3c;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, La/cad;

    .line 56
    .line 57
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, La/psc;

    .line 60
    .line 61
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/o3c;->f:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v5, v1

    .line 71
    check-cast v5, La/i1w0;

    .line 72
    .line 73
    iget-object v1, p0, La/o3c;->g:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v6, v1

    .line 76
    check-cast v6, La/duj;

    .line 77
    .line 78
    iget-object v1, p0, La/o3c;->h:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v7, v1

    .line 81
    check-cast v7, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p0, La/o3c;->i:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v8, v1

    .line 86
    check-cast v8, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v1, p0, La/o3c;->j:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v9, v1

    .line 91
    check-cast v9, La/ocl;

    .line 92
    .line 93
    iget-object p0, p0, La/o3c;->a:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v10, p0

    .line 96
    check-cast v10, La/ctf0;

    .line 97
    .line 98
    new-instance v11, La/rl70;

    .line 99
    .line 100
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    move-object v1, p1

    .line 104
    invoke-direct/range {v0 .. v11}, La/ykp0;-><init>(La/vzg0;La/svu;La/m1e;La/mne;La/i1w0;La/duj;Ljava/lang/String;Ljava/lang/String;La/ocl;La/ctf0;La/rl70;)V

    .line 105
    .line 106
    .line 107
    return-object v0
.end method
