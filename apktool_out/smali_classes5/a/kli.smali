.class public final La/kli;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rki;


# direct methods
.method public constructor <init>(La/rki;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/kli;->a:La/rki;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/zk30;

    .line 2
    .line 3
    iget-object p0, p0, La/kli;->a:La/rki;

    .line 4
    .line 5
    iget-object p0, p0, La/rki;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/daf;

    .line 8
    .line 9
    iget-object v1, p0, La/daf;->b:Ljava/lang/Object;

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
    new-instance v3, La/reu;

    .line 18
    .line 19
    invoke-virtual {p0}, La/daf;->a0()La/z220;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v4, 0x5

    .line 24
    invoke-direct {v3, v1, v4}, La/reu;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    new-instance v4, La/fxt;

    .line 28
    .line 29
    invoke-virtual {p0}, La/daf;->a0()La/z220;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-direct {v4, v1}, La/fxt;-><init>(La/z220;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/do20;

    .line 37
    .line 38
    invoke-virtual {p0}, La/daf;->a0()La/z220;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v5, v1}, La/do20;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, La/h03;

    .line 46
    .line 47
    invoke-virtual {p0}, La/daf;->a0()La/z220;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/16 v7, 0x1c

    .line 52
    .line 53
    invoke-direct {v6, v1, v7}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/daf;->g:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v7, v1

    .line 59
    check-cast v7, La/m1e;

    .line 60
    .line 61
    iget-object v1, p0, La/daf;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, La/cad;

    .line 64
    .line 65
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, La/psc;

    .line 68
    .line 69
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/daf;->h:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v9, v1

    .line 79
    check-cast v9, La/g2v;

    .line 80
    .line 81
    iget-object v1, p0, La/daf;->i:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v10, v1

    .line 84
    check-cast v10, La/i1w0;

    .line 85
    .line 86
    new-instance v11, La/dq00;

    .line 87
    .line 88
    iget-object v1, p0, La/daf;->j:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, La/yo4;

    .line 91
    .line 92
    iget-object v12, p0, La/daf;->k:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v12, La/d1p;

    .line 95
    .line 96
    invoke-interface {v12}, La/d1p;->W()La/zr1;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    iget-object p0, p0, La/daf;->l:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Ljava/lang/String;

    .line 103
    .line 104
    invoke-direct {v11, v1, v12, p0}, La/dq00;-><init>(La/yo4;La/zr1;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    move-object v1, p1

    .line 108
    invoke-direct/range {v0 .. v11}, La/zk30;-><init>(La/vzg0;ILa/reu;La/fxt;La/do20;La/h03;La/m1e;La/mne;La/g2v;La/i1w0;La/dq00;)V

    .line 109
    .line 110
    .line 111
    return-object v0
.end method
