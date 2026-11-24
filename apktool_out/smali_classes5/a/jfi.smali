.class public final La/jfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/yei;


# direct methods
.method public constructor <init>(La/yei;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jfi;->a:La/yei;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 10

    .line 1
    check-cast p1, La/i1w0;

    .line 2
    .line 3
    new-instance v0, La/jbk;

    .line 4
    .line 5
    iget-object p0, p0, La/jfi;->a:La/yei;

    .line 6
    .line 7
    iget-object p0, p0, La/yei;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/g45;

    .line 10
    .line 11
    iget-object v1, p0, La/g45;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/ctf0;

    .line 14
    .line 15
    new-instance v2, La/mpi0;

    .line 16
    .line 17
    new-instance v3, La/pzu;

    .line 18
    .line 19
    new-instance v4, La/abu;

    .line 20
    .line 21
    iget-object v5, p0, La/g45;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v5, La/gii0;

    .line 24
    .line 25
    const/16 v6, 0x19

    .line 26
    .line 27
    invoke-direct {v4, v5, v6}, La/abu;-><init>(La/gii0;B)V

    .line 28
    .line 29
    .line 30
    iget-object v5, p0, La/g45;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, La/dzz;

    .line 33
    .line 34
    iget-object v6, p0, La/g45;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v6, La/xio;

    .line 37
    .line 38
    iget-object v7, p0, La/g45;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, La/czz;

    .line 41
    .line 42
    iget-object v8, p0, La/g45;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v8, La/btt0;

    .line 45
    .line 46
    iget-object v9, p0, La/g45;->g:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v9, La/knf0;

    .line 49
    .line 50
    invoke-direct/range {v3 .. v9}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v2, v3}, La/mpi0;-><init>(La/pzu;)V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/g45;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/duj;

    .line 59
    .line 60
    invoke-direct {v0, p1, v1, v2, p0}, La/jbk;-><init>(La/i1w0;La/ctf0;La/mpi0;La/duj;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
