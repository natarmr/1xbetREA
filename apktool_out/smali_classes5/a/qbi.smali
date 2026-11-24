.class public final La/qbi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/pai;


# direct methods
.method public constructor <init>(La/pai;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qbi;->a:La/pai;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/nua;

    .line 2
    .line 3
    iget-object p0, p0, La/qbi;->a:La/pai;

    .line 4
    .line 5
    iget-object p0, p0, La/pai;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/esg0;

    .line 8
    .line 9
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/i1w0;

    .line 13
    .line 14
    iget-object v1, p0, La/esg0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/cad;

    .line 17
    .line 18
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/psc;

    .line 21
    .line 22
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v4, v1

    .line 32
    check-cast v4, La/ctf0;

    .line 33
    .line 34
    new-instance v5, La/hwt;

    .line 35
    .line 36
    iget-object v1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/wsf0;

    .line 39
    .line 40
    iget-object v6, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v6, La/gr00;

    .line 43
    .line 44
    invoke-virtual {v6}, La/gr00;->h()La/fua;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-direct {v5, v6}, La/hwt;-><init>(La/fua;)V

    .line 49
    .line 50
    .line 51
    new-instance v6, La/tqt;

    .line 52
    .line 53
    iget-object v7, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v7, La/gr00;

    .line 56
    .line 57
    invoke-virtual {v7}, La/gr00;->h()La/fua;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-direct {v6, v7}, La/tqt;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance v7, La/hwt;

    .line 65
    .line 66
    iget-object v8, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v8, La/gr00;

    .line 69
    .line 70
    invoke-virtual {v8}, La/gr00;->h()La/fua;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-direct {v7, v8}, La/hwt;-><init>(La/fua;)V

    .line 75
    .line 76
    .line 77
    new-instance v8, La/a7q;

    .line 78
    .line 79
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, La/gr00;

    .line 82
    .line 83
    invoke-virtual {v1}, La/gr00;->h()La/fua;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-direct {v8, v1}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v9, p0

    .line 93
    check-cast v9, La/pru;

    .line 94
    .line 95
    move-object v1, p1

    .line 96
    invoke-direct/range {v0 .. v9}, La/nua;-><init>(La/vzg0;La/i1w0;La/mne;La/ctf0;La/hwt;La/tqt;La/hwt;La/a7q;La/pru;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method
