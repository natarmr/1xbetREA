.class public final La/byi;
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
    iput-object p1, p0, La/byi;->a:La/psi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 6

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/v6j;

    .line 5
    .line 6
    iget-object p0, p0, La/byi;->a:La/psi;

    .line 7
    .line 8
    iget-object p0, p0, La/psi;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/dyi;

    .line 11
    .line 12
    new-instance v1, La/hnu;

    .line 13
    .line 14
    invoke-virtual {p0}, La/dyi;->a()La/ali;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v1, p1}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/dyi;->a:La/g8i;

    .line 22
    .line 23
    invoke-virtual {p0}, La/g8i;->v1()La/mne;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {p0}, La/g8i;->Y6()La/g2v;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {p0}, La/g8i;->q1()La/m1e;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct/range {v0 .. v5}, La/v6j;-><init>(La/hnu;La/i1w0;La/mne;La/g2v;La/m1e;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method
