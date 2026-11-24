.class public final La/ayi;
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
    iput-object p1, p0, La/ayi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 8

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/o7j;

    .line 5
    .line 6
    iget-object p0, p0, La/ayi;->a:La/psi;

    .line 7
    .line 8
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/dyi;

    .line 11
    .line 12
    new-instance v1, La/tru;

    .line 13
    .line 14
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v1, p1}, La/tru;-><init>(La/ali;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/xsu;

    .line 22
    .line 23
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v2, p1}, La/xsu;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, La/dyi;->a:La/g8i;

    .line 31
    .line 32
    invoke-virtual {p0}, La/g8i;->v1()La/mne;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {p0}, La/g8i;->d2()La/duj;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {p0}, La/g8i;->Y6()La/g2v;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {p0}, La/g8i;->q1()La/m1e;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v0 .. v7}, La/o7j;-><init>(La/tru;La/xsu;La/i1w0;La/mne;La/duj;La/g2v;La/m1e;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method
