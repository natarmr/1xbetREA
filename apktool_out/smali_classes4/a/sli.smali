.class public final La/sli;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/i1w0;

.field public final b:Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

.field public final c:La/cad;

.field public final d:La/m1e;

.field public final e:La/gii0;

.field public final f:La/knf0;

.field public final g:La/uzc;

.field public final h:La/gst0;

.field public final i:La/rou;

.field public final j:La/x0u;

.field public final k:La/g2v;

.field public final l:La/ctf0;

.field public final m:La/pyg;

.field public final n:La/qv2;

.field public final o:La/r9u;

.field public final p:La/n5d0;

.field public final q:La/gji;


# direct methods
.method public constructor <init>(La/cad;La/pyg;La/ctf0;La/m1e;La/g2v;La/wdk0;La/rou;La/uzc;La/qv2;La/i1w0;La/gii0;La/knf0;La/x0u;Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;La/r9u;La/gst0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p10, p0, La/sli;->a:La/i1w0;

    .line 5
    .line 6
    iput-object p14, p0, La/sli;->b:Lorg/xplatform/cyber/section/api/meta_heroes/presentation/MetaHeroesParams;

    .line 7
    .line 8
    iput-object p1, p0, La/sli;->c:La/cad;

    .line 9
    .line 10
    iput-object p4, p0, La/sli;->d:La/m1e;

    .line 11
    .line 12
    iput-object p11, p0, La/sli;->e:La/gii0;

    .line 13
    .line 14
    iput-object p12, p0, La/sli;->f:La/knf0;

    .line 15
    .line 16
    iput-object p8, p0, La/sli;->g:La/uzc;

    .line 17
    .line 18
    move-object/from16 p1, p16

    .line 19
    .line 20
    iput-object p1, p0, La/sli;->h:La/gst0;

    .line 21
    .line 22
    iput-object p7, p0, La/sli;->i:La/rou;

    .line 23
    .line 24
    iput-object p13, p0, La/sli;->j:La/x0u;

    .line 25
    .line 26
    iput-object p5, p0, La/sli;->k:La/g2v;

    .line 27
    .line 28
    iput-object p3, p0, La/sli;->l:La/ctf0;

    .line 29
    .line 30
    iput-object p2, p0, La/sli;->m:La/pyg;

    .line 31
    .line 32
    iput-object p9, p0, La/sli;->n:La/qv2;

    .line 33
    .line 34
    iput-object p15, p0, La/sli;->o:La/r9u;

    .line 35
    .line 36
    new-instance p1, La/gji;

    .line 37
    .line 38
    const/4 p2, 0x1

    .line 39
    const/16 p3, 0x8

    .line 40
    .line 41
    invoke-direct {p1, p0, p2, p3}, La/gji;-><init>(Ljava/lang/Object;IB)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, La/sli;->p:La/n5d0;

    .line 49
    .line 50
    new-instance p1, La/gji;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-direct {p1, p0, p2, p3}, La/gji;-><init>(Ljava/lang/Object;IB)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/sli;->q:La/gji;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()La/z220;
    .locals 5

    .line 1
    new-instance v0, La/z220;

    .line 2
    .line 3
    new-instance v1, La/pyu;

    .line 4
    .line 5
    iget-object v2, p0, La/sli;->e:La/gii0;

    .line 6
    .line 7
    const/16 v3, 0x1a

    .line 8
    .line 9
    invoke-direct {v1, v2, v3}, La/pyu;-><init>(La/gii0;B)V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, La/sli;->p:La/n5d0;

    .line 13
    .line 14
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, La/vb40;

    .line 19
    .line 20
    new-instance v3, La/sjh;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v4, La/or30;

    .line 26
    .line 27
    invoke-direct {v4}, La/or30;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v4, v3, La/sjh;->a:La/or30;

    .line 31
    .line 32
    iget-object p0, p0, La/sli;->f:La/knf0;

    .line 33
    .line 34
    invoke-direct {v0, v1, v2, v3, p0}, La/z220;-><init>(La/pyu;La/vb40;La/sjh;La/knf0;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method
