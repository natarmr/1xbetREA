.class public final La/sxi;
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
    iput-object p1, p0, La/sxi;->a:La/msi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/zeo0;

    .line 2
    .line 3
    iget-object p0, p0, La/sxi;->a:La/msi;

    .line 4
    .line 5
    iget-object p0, p0, La/msi;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/txi;

    .line 8
    .line 9
    iget-object v1, p0, La/txi;->a:Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget-object v1, p0, La/txi;->c:La/cad;

    .line 16
    .line 17
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/psc;

    .line 20
    .line 21
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v3}, La/x1x;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v4, p0, La/txi;->n:La/r9u;

    .line 29
    .line 30
    iget-object v5, p0, La/txi;->i:La/i1w0;

    .line 31
    .line 32
    iget-object v1, p0, La/txi;->o:La/roi0;

    .line 33
    .line 34
    iget-object v1, v1, La/roi0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/daf;

    .line 37
    .line 38
    invoke-virtual {v1}, La/daf;->Z()La/zfm0;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v7, p0, La/txi;->k:La/yo4;

    .line 43
    .line 44
    iget-object v1, p0, La/txi;->l:La/d1p;

    .line 45
    .line 46
    invoke-interface {v1}, La/d1p;->W()La/zr1;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    iget-object v1, p0, La/txi;->h:La/ugf0;

    .line 51
    .line 52
    iget-object v1, v1, La/ugf0;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, La/daf;

    .line 55
    .line 56
    invoke-virtual {v1}, La/daf;->w()La/luu;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v10, La/tsc;

    .line 64
    .line 65
    invoke-virtual {p0}, La/txi;->a()La/dhm0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v10, v1}, La/tsc;-><init>(La/dhm0;)V

    .line 70
    .line 71
    .line 72
    new-instance v11, La/bzt;

    .line 73
    .line 74
    iget-object v1, p0, La/txi;->m:La/fsd;

    .line 75
    .line 76
    invoke-direct {v11, v1}, La/bzt;-><init>(La/fsd;)V

    .line 77
    .line 78
    .line 79
    iget-object v12, p0, La/txi;->j:La/ctf0;

    .line 80
    .line 81
    move-object v1, p1

    .line 82
    invoke-direct/range {v0 .. v12}, La/zeo0;-><init>(La/vzg0;ILa/mne;La/r9u;La/i1w0;La/yfm0;La/yo4;La/zr1;La/luu;La/tsc;La/bzt;La/ctf0;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method
