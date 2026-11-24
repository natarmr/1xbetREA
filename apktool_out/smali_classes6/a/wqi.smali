.class public final La/wqi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/ppi;


# direct methods
.method public constructor <init>(La/ppi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wqi;->a:La/ppi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 13

    .line 1
    new-instance v0, La/esd0;

    .line 2
    .line 3
    iget-object p0, p0, La/wqi;->a:La/ppi;

    .line 4
    .line 5
    iget-object p0, p0, La/ppi;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/doi;

    .line 8
    .line 9
    iget-object v2, p0, La/doi;->a:La/duj;

    .line 10
    .line 11
    iget-object v3, p0, La/doi;->b:La/m1e;

    .line 12
    .line 13
    iget-object v4, p0, La/doi;->c:La/i1w0;

    .line 14
    .line 15
    iget-object v5, p0, La/doi;->d:La/ocl;

    .line 16
    .line 17
    iget-object v6, p0, La/doi;->e:La/ctf0;

    .line 18
    .line 19
    iget-object v7, p0, La/doi;->f:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v1, p0, La/doi;->g:La/cad;

    .line 22
    .line 23
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, La/psc;

    .line 26
    .line 27
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-static {v8}, La/x1x;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v9, La/b8u;

    .line 35
    .line 36
    new-instance v1, La/zn00;

    .line 37
    .line 38
    new-instance v10, La/j910;

    .line 39
    .line 40
    iget-object v11, p0, La/doi;->h:La/gii0;

    .line 41
    .line 42
    const/16 v12, 0x12

    .line 43
    .line 44
    invoke-direct {v10, v11, v12}, La/j910;-><init>(La/gii0;B)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/doi;->i:La/knf0;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v10, v1, La/zn00;->a:Ljava/lang/Object;

    .line 56
    .line 57
    iput-object p0, v1, La/zn00;->b:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-direct {v9, v1}, La/b8u;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v1, p1

    .line 63
    invoke-direct/range {v0 .. v9}, La/esd0;-><init>(La/vzg0;La/duj;La/m1e;La/i1w0;La/ocl;La/ctf0;Ljava/lang/String;La/mne;La/b8u;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method
