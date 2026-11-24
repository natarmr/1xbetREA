.class public final La/szi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/cad;

.field public final b:La/pfv0;

.field public final c:La/lbu;

.field public final d:La/ctf0;

.field public final e:La/i1w0;

.field public final f:La/ocl;

.field public final g:La/msi;

.field public final h:La/msi;


# direct methods
.method public constructor <init>(La/cad;La/i1w0;La/lbu;La/ctf0;La/ocl;La/pfv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/szi;->a:La/cad;

    .line 5
    .line 6
    iput-object p6, p0, La/szi;->b:La/pfv0;

    .line 7
    .line 8
    iput-object p3, p0, La/szi;->c:La/lbu;

    .line 9
    .line 10
    iput-object p4, p0, La/szi;->d:La/ctf0;

    .line 11
    .line 12
    iput-object p2, p0, La/szi;->e:La/i1w0;

    .line 13
    .line 14
    iput-object p5, p0, La/szi;->f:La/ocl;

    .line 15
    .line 16
    new-instance p1, La/msi;

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    const/16 p3, 0x12

    .line 20
    .line 21
    invoke-direct {p1, p0, p2, p3}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/szi;->g:La/msi;

    .line 25
    .line 26
    new-instance p1, La/msi;

    .line 27
    .line 28
    const/4 p2, 0x1

    .line 29
    invoke-direct {p1, p0, p2, p3}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/szi;->h:La/msi;

    .line 33
    .line 34
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
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, La/iyk;-><init>(I)V

    .line 7
    .line 8
    .line 9
    const-class v2, La/kfv0;

    .line 10
    .line 11
    iget-object v3, p0, La/szi;->g:La/msi;

    .line 12
    .line 13
    invoke-virtual {v1, v2, v3}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-class v2, La/mgv0;

    .line 17
    .line 18
    iget-object p0, p0, La/szi;->h:La/msi;

    .line 19
    .line 20
    invoke-virtual {v1, v2, p0}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, La/iyk;->a()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-direct {v0, p0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
