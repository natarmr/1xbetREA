.class public final La/txi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:La/m1e;

.field public final c:La/cad;

.field public final d:La/gii0;

.field public final e:La/knf0;

.field public final f:La/oar0;

.field public final g:La/k3r0;

.field public final h:La/ugf0;

.field public final i:La/i1w0;

.field public final j:La/ctf0;

.field public final k:La/yo4;

.field public final l:La/d1p;

.field public final m:La/fsd;

.field public final n:La/r9u;

.field public final o:La/roi0;

.field public final p:La/n5d0;

.field public final q:La/n5d0;


# direct methods
.method public constructor <init>(La/cad;La/roi0;La/d1p;La/ugf0;La/ctf0;La/fsd;La/r9u;La/i1w0;La/gii0;Ljava/lang/Integer;La/m1e;La/knf0;La/yo4;La/oar0;La/k3r0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p10, p0, La/txi;->a:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p11, p0, La/txi;->b:La/m1e;

    .line 7
    .line 8
    iput-object p1, p0, La/txi;->c:La/cad;

    .line 9
    .line 10
    iput-object p9, p0, La/txi;->d:La/gii0;

    .line 11
    .line 12
    iput-object p12, p0, La/txi;->e:La/knf0;

    .line 13
    .line 14
    iput-object p14, p0, La/txi;->f:La/oar0;

    .line 15
    .line 16
    iput-object p15, p0, La/txi;->g:La/k3r0;

    .line 17
    .line 18
    iput-object p4, p0, La/txi;->h:La/ugf0;

    .line 19
    .line 20
    iput-object p8, p0, La/txi;->i:La/i1w0;

    .line 21
    .line 22
    iput-object p5, p0, La/txi;->j:La/ctf0;

    .line 23
    .line 24
    iput-object p13, p0, La/txi;->k:La/yo4;

    .line 25
    .line 26
    iput-object p3, p0, La/txi;->l:La/d1p;

    .line 27
    .line 28
    iput-object p6, p0, La/txi;->m:La/fsd;

    .line 29
    .line 30
    iput-object p7, p0, La/txi;->n:La/r9u;

    .line 31
    .line 32
    iput-object p2, p0, La/txi;->o:La/roi0;

    .line 33
    .line 34
    new-instance p1, La/msi;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    const/16 p3, 0xb

    .line 38
    .line 39
    invoke-direct {p1, p0, p2, p3}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, La/txi;->p:La/n5d0;

    .line 47
    .line 48
    new-instance p1, La/msi;

    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-direct {p1, p0, p2, p3}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/txi;->q:La/n5d0;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final a()La/dhm0;
    .locals 5

    .line 1
    new-instance v0, La/dhm0;

    .line 2
    .line 3
    iget-object v1, p0, La/txi;->c:La/cad;

    .line 4
    .line 5
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/psc;

    .line 8
    .line 9
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/afm0;

    .line 17
    .line 18
    iget-object v3, p0, La/txi;->d:La/gii0;

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    invoke-direct {v2, v3, v4}, La/afm0;-><init>(La/gii0;B)V

    .line 22
    .line 23
    .line 24
    iget-object v3, p0, La/txi;->e:La/knf0;

    .line 25
    .line 26
    iget-object p0, p0, La/txi;->f:La/oar0;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3, p0}, La/dhm0;-><init>(La/mne;La/afm0;La/knf0;La/oar0;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method
