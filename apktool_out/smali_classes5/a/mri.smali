.class public final La/mri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/mri;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/b8f0;

    .line 2
    .line 3
    iget-object p0, p0, La/mri;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/nri;

    .line 8
    .line 9
    iget-object v2, p0, La/nri;->a:La/ctf0;

    .line 10
    .line 11
    iget-object v3, p0, La/nri;->b:La/dmt;

    .line 12
    .line 13
    iget-object v1, p0, La/nri;->c:La/nr00;

    .line 14
    .line 15
    iget-object v1, v1, La/nr00;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/vqc;

    .line 18
    .line 19
    invoke-virtual {v1}, La/vqc;->g()La/jru;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iget-object v5, p0, La/nri;->d:La/i1w0;

    .line 24
    .line 25
    new-instance v6, La/ag3;

    .line 26
    .line 27
    iget-object v1, p0, La/nri;->e:La/kt2;

    .line 28
    .line 29
    const/4 v7, 0x6

    .line 30
    invoke-direct {v6, v1, v7}, La/ag3;-><init>(La/kt2;B)V

    .line 31
    .line 32
    .line 33
    iget-object v7, p0, La/nri;->f:La/je;

    .line 34
    .line 35
    iget-object v8, p0, La/nri;->g:La/s64;

    .line 36
    .line 37
    iget-object v9, p0, La/nri;->h:La/rqt;

    .line 38
    .line 39
    iget-object v10, p0, La/nri;->i:La/bzt;

    .line 40
    .line 41
    iget-object v11, p0, La/nri;->j:La/pru;

    .line 42
    .line 43
    iget-object p0, p0, La/nri;->k:La/cad;

    .line 44
    .line 45
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, La/psc;

    .line 48
    .line 49
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    invoke-static {v12}, La/x1x;->x(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v1, p1

    .line 57
    invoke-direct/range {v0 .. v12}, La/b8f0;-><init>(La/vzg0;La/ctf0;La/dmt;La/jru;La/i1w0;La/ag3;La/je;La/s64;La/rqt;La/bzt;La/pru;La/mne;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method
