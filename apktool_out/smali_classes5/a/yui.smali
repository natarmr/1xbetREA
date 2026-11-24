.class public final La/yui;
.super Ljava/lang/Object;
.source "SourceFile"


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
    iput-object p1, p0, La/yui;->a:La/rti;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/i1w0;)La/kki;
    .locals 6

    .line 1
    new-instance v0, La/kki;

    .line 2
    .line 3
    iget-object p0, p0, La/yui;->a:La/rti;

    .line 4
    .line 5
    iget-object p0, p0, La/rti;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/daf;

    .line 8
    .line 9
    invoke-virtual {p0}, La/daf;->Z()La/zfm0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, La/daf;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v2

    .line 16
    check-cast v3, La/qv2;

    .line 17
    .line 18
    iget-object v2, p0, La/daf;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, La/pmi0;

    .line 21
    .line 22
    iget-object v2, v2, La/pmi0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, La/daf;

    .line 25
    .line 26
    invoke-virtual {v2}, La/daf;->t()La/pv00;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget-object p0, p0, La/daf;->l:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v5, p0

    .line 33
    check-cast v5, La/h3c;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    invoke-direct/range {v0 .. v5}, La/kki;-><init>(La/zfm0;La/i1w0;La/qv2;La/pv00;La/h3c;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method
