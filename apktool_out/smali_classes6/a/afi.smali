.class public final La/afi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/yei;


# direct methods
.method public constructor <init>(La/yei;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/afi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 11

    .line 1
    new-instance v0, La/lwh;

    .line 2
    .line 3
    iget-object p0, p0, La/afi;->a:La/yei;

    .line 4
    .line 5
    iget-object p0, p0, La/yei;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/o3c;

    .line 8
    .line 9
    iget-object v1, p0, La/o3c;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/i1w0;

    .line 12
    .line 13
    iget-object v2, p0, La/o3c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, p0, La/o3c;->c:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v4, v3

    .line 20
    check-cast v4, La/ctf0;

    .line 21
    .line 22
    iget-object v3, p0, La/o3c;->d:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v5, v3

    .line 25
    check-cast v5, La/ocl;

    .line 26
    .line 27
    iget-object v3, p0, La/o3c;->e:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v6, v3

    .line 30
    check-cast v6, La/duj;

    .line 31
    .line 32
    new-instance v7, La/a7q;

    .line 33
    .line 34
    new-instance v3, La/oif0;

    .line 35
    .line 36
    new-instance v8, La/clc;

    .line 37
    .line 38
    iget-object v9, p0, La/o3c;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v9, La/gii0;

    .line 41
    .line 42
    const/16 v10, 0x13

    .line 43
    .line 44
    invoke-direct {v8, v9, v10}, La/clc;-><init>(La/gii0;B)V

    .line 45
    .line 46
    .line 47
    iget-object v9, p0, La/o3c;->g:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v9, La/knf0;

    .line 50
    .line 51
    iget-object v10, p0, La/o3c;->h:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v10, La/cad;

    .line 54
    .line 55
    iget-object v10, v10, La/cad;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, La/psc;

    .line 58
    .line 59
    invoke-virtual {v10}, La/psc;->h()La/mne;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    invoke-static {v10}, La/x1x;->x(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v3, v8, v9, v10}, La/oif0;-><init>(La/clc;La/knf0;La/mne;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v7, v3}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v3, p0, La/o3c;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, La/cad;

    .line 75
    .line 76
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, La/psc;

    .line 79
    .line 80
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v3, p0, La/o3c;->i:Ljava/lang/Object;

    .line 88
    .line 89
    move-object v9, v3

    .line 90
    check-cast v9, La/wyu;

    .line 91
    .line 92
    iget-object p0, p0, La/o3c;->j:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v10, p0

    .line 95
    check-cast v10, La/m1e;

    .line 96
    .line 97
    move-object v3, p1

    .line 98
    invoke-direct/range {v0 .. v10}, La/lwh;-><init>(La/i1w0;Ljava/lang/String;La/vzg0;La/ctf0;La/ocl;La/duj;La/a7q;La/mne;La/wyu;La/m1e;)V

    .line 99
    .line 100
    .line 101
    return-object v0
.end method
