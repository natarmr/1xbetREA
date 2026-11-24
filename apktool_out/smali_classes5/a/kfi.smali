.class public final La/kfi;
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
    iput-object p1, p0, La/kfi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/guk;

    .line 2
    .line 3
    iget-object p0, p0, La/kfi;->a:La/yei;

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
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v1, p0, La/o3c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v3, v1

    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, La/o3c;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/cad;

    .line 25
    .line 26
    iget-object v4, v1, La/cad;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, La/psc;

    .line 29
    .line 30
    invoke-virtual {v4}, La/psc;->h()La/mne;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v5, La/p4u;

    .line 38
    .line 39
    new-instance v6, La/z220;

    .line 40
    .line 41
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, La/psc;

    .line 44
    .line 45
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v7, La/g090;

    .line 53
    .line 54
    iget-object v8, p0, La/o3c;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v8, La/gii0;

    .line 57
    .line 58
    const/16 v9, 0x14

    .line 59
    .line 60
    invoke-direct {v7, v8, v9}, La/g090;-><init>(La/gii0;B)V

    .line 61
    .line 62
    .line 63
    iget-object v8, p0, La/o3c;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, La/ygm0;

    .line 66
    .line 67
    iget-object v9, p0, La/o3c;->f:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, La/knf0;

    .line 70
    .line 71
    invoke-direct {v6, v1, v7, v8, v9}, La/z220;-><init>(La/mne;La/g090;La/ygm0;La/knf0;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v5, v6}, La/p4u;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v6, La/dq00;

    .line 78
    .line 79
    iget-object v1, p0, La/o3c;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, La/yo4;

    .line 82
    .line 83
    iget-object v7, p0, La/o3c;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v7, La/d1p;

    .line 86
    .line 87
    invoke-interface {v7}, La/d1p;->W()La/zr1;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    iget-object v8, p0, La/o3c;->i:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v8, Ljava/lang/String;

    .line 94
    .line 95
    invoke-direct {v6, v1, v7, v8}, La/dq00;-><init>(La/yo4;La/zr1;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, La/o3c;->j:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v7, p0

    .line 101
    check-cast v7, La/g2v;

    .line 102
    .line 103
    move-object v1, p1

    .line 104
    invoke-direct/range {v0 .. v7}, La/guk;-><init>(La/vzg0;ILjava/lang/String;La/mne;La/p4u;La/dq00;La/g2v;)V

    .line 105
    .line 106
    .line 107
    return-object v0
.end method
