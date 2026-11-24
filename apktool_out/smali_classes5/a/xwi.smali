.class public final La/xwi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:La/gii0;

.field public final d:La/knf0;

.field public final e:La/cad;

.field public final f:La/ctf0;

.field public final g:La/ocl;

.field public final h:La/i1w0;

.field public final i:La/duj;

.field public final j:La/m1e;

.field public final k:La/ii;

.field public final l:La/n5d0;

.field public final m:La/psi;

.field public final n:La/psi;

.field public final o:La/psi;

.field public final p:La/psi;


# direct methods
.method public constructor <init>(La/cad;Ljava/lang/String;Ljava/lang/String;La/i1w0;La/duj;La/gii0;La/m1e;La/ocl;La/ctf0;La/knf0;La/ii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/xwi;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p3, p0, La/xwi;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p6, p0, La/xwi;->c:La/gii0;

    .line 9
    .line 10
    iput-object p10, p0, La/xwi;->d:La/knf0;

    .line 11
    .line 12
    iput-object p1, p0, La/xwi;->e:La/cad;

    .line 13
    .line 14
    iput-object p9, p0, La/xwi;->f:La/ctf0;

    .line 15
    .line 16
    iput-object p8, p0, La/xwi;->g:La/ocl;

    .line 17
    .line 18
    iput-object p4, p0, La/xwi;->h:La/i1w0;

    .line 19
    .line 20
    iput-object p5, p0, La/xwi;->i:La/duj;

    .line 21
    .line 22
    iput-object p7, p0, La/xwi;->j:La/m1e;

    .line 23
    .line 24
    iput-object p11, p0, La/xwi;->k:La/ii;

    .line 25
    .line 26
    new-instance p1, La/psi;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    const/16 p3, 0x15

    .line 30
    .line 31
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/xwi;->l:La/n5d0;

    .line 39
    .line 40
    new-instance p1, La/psi;

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/xwi;->m:La/psi;

    .line 47
    .line 48
    new-instance p1, La/psi;

    .line 49
    .line 50
    const/4 p2, 0x2

    .line 51
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/xwi;->n:La/psi;

    .line 55
    .line 56
    new-instance p1, La/psi;

    .line 57
    .line 58
    const/4 p2, 0x3

    .line 59
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, La/xwi;->o:La/psi;

    .line 63
    .line 64
    new-instance p1, La/psi;

    .line 65
    .line 66
    const/4 p2, 0x4

    .line 67
    invoke-direct {p1, p0, p2, p3}, La/psi;-><init>(Ljava/lang/Object;IB)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, La/xwi;->p:La/psi;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a()La/fiu0;
    .locals 4

    .line 1
    new-instance v0, La/fiu0;

    .line 2
    .line 3
    new-instance v1, La/iyk;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v1, v2}, La/iyk;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const-class v2, La/x0q0;

    .line 10
    .line 11
    iget-object v3, p0, La/xwi;->m:La/psi;

    .line 12
    .line 13
    invoke-virtual {v1, v2, v3}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-class v2, La/y4q;

    .line 17
    .line 18
    iget-object v3, p0, La/xwi;->n:La/psi;

    .line 19
    .line 20
    invoke-virtual {v1, v2, v3}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-class v2, La/rg30;

    .line 24
    .line 25
    iget-object v3, p0, La/xwi;->o:La/psi;

    .line 26
    .line 27
    invoke-virtual {v1, v2, v3}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-class v2, La/mjh0;

    .line 31
    .line 32
    iget-object p0, p0, La/xwi;->p:La/psi;

    .line 33
    .line 34
    invoke-virtual {v1, v2, p0}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, La/iyk;->a()Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 42
    .line 43
    .line 44
    return-object v0
.end method
