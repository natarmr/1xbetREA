.class public final La/cdi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/e6e;


# instance fields
.field public final a:La/g45;

.field public final b:La/gst0;

.field public final c:La/rou;

.field public final d:La/nhf0;


# direct methods
.method public constructor <init>(La/rou;La/g45;La/nhf0;La/gst0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/cdi;->a:La/g45;

    .line 5
    .line 6
    iput-object p4, p0, La/cdi;->b:La/gst0;

    .line 7
    .line 8
    iput-object p1, p0, La/cdi;->c:La/rou;

    .line 9
    .line 10
    iput-object p3, p0, La/cdi;->d:La/nhf0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()La/usd;
    .locals 1

    .line 1
    new-instance p0, La/usd;

    .line 2
    .line 3
    new-instance v0, La/nwd;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, La/usd;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b()La/z220;
    .locals 6

    .line 1
    new-instance v0, La/z220;

    .line 2
    .line 3
    new-instance v1, La/jqt;

    .line 4
    .line 5
    iget-object v2, p0, La/cdi;->b:La/gst0;

    .line 6
    .line 7
    invoke-direct {v1, v2}, La/jqt;-><init>(La/gst0;)V

    .line 8
    .line 9
    .line 10
    iget-object v4, p0, La/cdi;->d:La/nhf0;

    .line 11
    .line 12
    const/16 v5, 0x12

    .line 13
    .line 14
    iget-object v2, p0, La/cdi;->c:La/rou;

    .line 15
    .line 16
    iget-object v3, p0, La/cdi;->a:La/g45;

    .line 17
    .line 18
    invoke-direct/range {v0 .. v5}, La/z220;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final c()La/dgu;
    .locals 4

    .line 1
    new-instance v0, La/dgu;

    .line 2
    .line 3
    new-instance v1, La/ort;

    .line 4
    .line 5
    iget-object v2, p0, La/cdi;->b:La/gst0;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    invoke-direct {v1, v2, v3}, La/ort;-><init>(La/gst0;B)V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, La/cdi;->a:La/g45;

    .line 12
    .line 13
    iget-object v3, p0, La/cdi;->d:La/nhf0;

    .line 14
    .line 15
    iget-object p0, p0, La/cdi;->c:La/rou;

    .line 16
    .line 17
    invoke-direct {v0, v1, p0, v2, v3}, La/dgu;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final d()La/jcl;
    .locals 1

    .line 1
    new-instance v0, La/jcl;

    .line 2
    .line 3
    iget-object p0, p0, La/cdi;->a:La/g45;

    .line 4
    .line 5
    invoke-direct {v0, p0}, La/jcl;-><init>(La/g45;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final e()La/f4v;
    .locals 1

    .line 1
    new-instance v0, La/f4v;

    .line 2
    .line 3
    iget-object p0, p0, La/cdi;->a:La/g45;

    .line 4
    .line 5
    invoke-direct {v0, p0}, La/f4v;-><init>(La/g45;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
