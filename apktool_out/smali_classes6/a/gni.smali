.class public final La/gni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/eni;


# direct methods
.method public constructor <init>(La/eni;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gni;->a:La/eni;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/cur0;

    .line 2
    .line 3
    iget-object p0, p0, La/gni;->a:La/eni;

    .line 4
    .line 5
    iget-object p0, p0, La/eni;->b:Ljava/lang/Object;

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
    check-cast v1, Ljava/lang/Long;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    new-instance v5, La/xsu;

    .line 26
    .line 27
    new-instance v1, La/g090;

    .line 28
    .line 29
    iget-object v6, p0, La/o3c;->c:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, La/gkr0;

    .line 32
    .line 33
    iget-object v7, p0, La/o3c;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v7, La/sd80;

    .line 36
    .line 37
    invoke-direct {v1, v6, v7}, La/g090;-><init>(La/gkr0;La/sd80;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v5, v1}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v6, La/tqt;

    .line 44
    .line 45
    new-instance v1, La/bst;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v7, La/tqt;

    .line 51
    .line 52
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v8, La/art;

    .line 56
    .line 57
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-direct {v6, v1, v7, v8}, La/tqt;-><init>(La/bst;La/tqt;La/art;)V

    .line 61
    .line 62
    .line 63
    new-instance v7, La/g2v;

    .line 64
    .line 65
    invoke-virtual {p0}, La/o3c;->x()La/vkr0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v7, v1}, La/g2v;-><init>(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance v8, La/rkt0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/o3c;->x()La/vkr0;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/4 v9, 0x2

    .line 79
    invoke-direct {v8, v1, v9}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    iget-object v1, p0, La/o3c;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, La/cad;

    .line 85
    .line 86
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, La/psc;

    .line 89
    .line 90
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 91
    .line 92
    .line 93
    move-result-object v9

    .line 94
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v10, La/ctu;

    .line 98
    .line 99
    invoke-virtual {p0}, La/o3c;->x()La/vkr0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-direct {v10, v1}, La/ctu;-><init>(La/rkr0;)V

    .line 104
    .line 105
    .line 106
    iget-object v1, p0, La/o3c;->i:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v11, v1

    .line 109
    check-cast v11, La/i1w0;

    .line 110
    .line 111
    iget-object p0, p0, La/o3c;->j:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v12, p0

    .line 114
    check-cast v12, La/ctf0;

    .line 115
    .line 116
    move-object v1, p1

    .line 117
    invoke-direct/range {v0 .. v12}, La/cur0;-><init>(La/vzg0;IJLa/xsu;La/tqt;La/g2v;La/rkt0;La/mne;La/ctu;La/i1w0;La/ctf0;)V

    .line 118
    .line 119
    .line 120
    return-object v0
.end method
