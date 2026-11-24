.class public final La/qti;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/rti;


# direct methods
.method public constructor <init>(La/rti;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/qti;->a:La/rti;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/i0j0;

    .line 2
    .line 3
    iget-object p0, p0, La/qti;->a:La/rti;

    .line 4
    .line 5
    iget-object p0, p0, La/rti;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/sti;

    .line 8
    .line 9
    new-instance v2, La/gle0;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, La/sti;->a:La/vqc;

    .line 15
    .line 16
    iget-object v3, v1, La/vqc;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/cih;

    .line 19
    .line 20
    invoke-virtual {v3}, La/cih;->c()La/k7u;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v1, v1, La/vqc;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/cih;

    .line 27
    .line 28
    new-instance v4, La/azt;

    .line 29
    .line 30
    invoke-virtual {v1}, La/cih;->a()La/uzc;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const/4 v5, 0x1

    .line 35
    invoke-direct {v4, v1, v5}, La/azt;-><init>(La/uzc;B)V

    .line 36
    .line 37
    .line 38
    new-instance v5, La/yo4;

    .line 39
    .line 40
    iget-object v1, p0, La/sti;->b:La/kt2;

    .line 41
    .line 42
    const/4 v6, 0x7

    .line 43
    invoke-direct {v5, v1, v6}, La/yo4;-><init>(La/kt2;B)V

    .line 44
    .line 45
    .line 46
    iget-object v6, p0, La/sti;->c:La/i1w0;

    .line 47
    .line 48
    iget-object v1, p0, La/sti;->d:La/cad;

    .line 49
    .line 50
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/psc;

    .line 53
    .line 54
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-static {v7}, La/x1x;->x(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object v8, p0, La/sti;->e:La/je;

    .line 62
    .line 63
    iget-object v9, p0, La/sti;->f:La/ctf0;

    .line 64
    .line 65
    move-object v1, p1

    .line 66
    invoke-direct/range {v0 .. v9}, La/i0j0;-><init>(La/vzg0;La/gle0;La/k7u;La/azt;La/yo4;La/i1w0;La/mne;La/je;La/ctf0;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method
