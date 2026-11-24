.class public final La/cyi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/psi;


# direct methods
.method public constructor <init>(La/psi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cyi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 9

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/o6j;

    .line 5
    .line 6
    iget-object p0, p0, La/cyi;->a:La/psi;

    .line 7
    .line 8
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/dyi;

    .line 11
    .line 12
    new-instance v1, La/v4v;

    .line 13
    .line 14
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v1, p1}, La/v4v;-><init>(La/ali;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/v4v;

    .line 22
    .line 23
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v2, p1}, La/v4v;-><init>(La/ali;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/tru;

    .line 31
    .line 32
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v3, p1}, La/tru;-><init>(La/ali;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/dyi;->a:La/g8i;

    .line 40
    .line 41
    invoke-virtual {p0}, La/g8i;->v1()La/mne;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {p0}, La/g8i;->v4()La/uyn;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {p0}, La/g8i;->q1()La/m1e;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, La/g8i;->d2()La/duj;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-direct/range {v0 .. v8}, La/o6j;-><init>(La/v4v;La/v4v;La/tru;La/i1w0;La/mne;La/uyn;La/m1e;La/duj;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
