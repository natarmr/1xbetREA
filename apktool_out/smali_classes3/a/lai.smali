.class public final La/lai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lai;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/km8;

    .line 2
    .line 3
    iget-object p0, p0, La/lai;->a:La/n8i;

    .line 4
    .line 5
    iget-object p0, p0, La/n8i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/o3c;

    .line 8
    .line 9
    iget-object v1, p0, La/o3c;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/ctf0;

    .line 13
    .line 14
    new-instance v3, La/bwl;

    .line 15
    .line 16
    iget-object v1, p0, La/o3c;->b:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, v1

    .line 19
    check-cast v5, La/oif0;

    .line 20
    .line 21
    invoke-direct {v3, v5}, La/bwl;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v4, La/z220;

    .line 25
    .line 26
    iget-object v1, p0, La/o3c;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/wsf0;

    .line 29
    .line 30
    invoke-virtual {v1}, La/wsf0;->g()La/urt;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/g45;

    .line 37
    .line 38
    invoke-virtual {v1}, La/g45;->Q()La/g2v;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v1}, La/g45;->l()La/f6k;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const/16 v9, 0x10

    .line 47
    .line 48
    invoke-direct/range {v4 .. v9}, La/z220;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, La/o3c;->d:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v5, v1

    .line 54
    check-cast v5, La/m1e;

    .line 55
    .line 56
    iget-object v1, p0, La/o3c;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, La/cad;

    .line 59
    .line 60
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, La/psc;

    .line 63
    .line 64
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-static {v6}, La/x1x;->x(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, La/o3c;->f:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    check-cast v7, La/oeg0;

    .line 75
    .line 76
    iget-object v1, p0, La/o3c;->g:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v8, v1

    .line 79
    check-cast v8, La/duj;

    .line 80
    .line 81
    iget-object v1, p0, La/o3c;->h:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v9, v1

    .line 84
    check-cast v9, La/g2v;

    .line 85
    .line 86
    iget-object v1, p0, La/o3c;->i:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v10, v1

    .line 89
    check-cast v10, La/pru;

    .line 90
    .line 91
    iget-object v1, p0, La/o3c;->j:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v11, v1

    .line 94
    check-cast v11, La/bzt;

    .line 95
    .line 96
    new-instance v12, La/clc;

    .line 97
    .line 98
    iget-object p0, p0, La/o3c;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, La/oif0;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-direct {v12, p0, v1}, La/clc;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    move-object v1, p1

    .line 107
    invoke-direct/range {v0 .. v12}, La/km8;-><init>(La/vzg0;La/ctf0;La/bwl;La/z220;La/m1e;La/mne;La/oeg0;La/duj;La/g2v;La/pru;La/bzt;La/clc;)V

    .line 108
    .line 109
    .line 110
    return-object v0
.end method
