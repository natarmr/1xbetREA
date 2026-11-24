.class public final La/ffi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/dci;


# direct methods
.method public constructor <init>(La/dci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ffi;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 11

    .line 1
    new-instance v0, La/m8k;

    .line 2
    .line 3
    iget-object p0, p0, La/ffi;->a:La/dci;

    .line 4
    .line 5
    iget-object p0, p0, La/dci;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gbi;

    .line 8
    .line 9
    iget-object v1, p0, La/gbi;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v1, p0, La/gbi;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/n5d0;

    .line 20
    .line 21
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    move-object v3, v1

    .line 26
    check-cast v3, La/toi0;

    .line 27
    .line 28
    iget-object v1, p0, La/gbi;->g:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, La/n5d0;

    .line 31
    .line 32
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v4, v1

    .line 37
    check-cast v4, La/yoi0;

    .line 38
    .line 39
    iget-object v1, p0, La/gbi;->h:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/n5d0;

    .line 42
    .line 43
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    move-object v5, v1

    .line 48
    check-cast v5, La/jvt;

    .line 49
    .line 50
    iget-object v1, p0, La/gbi;->o:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v6, v1

    .line 53
    check-cast v6, La/ctf0;

    .line 54
    .line 55
    iget-object v1, p0, La/gbi;->p:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v7, v1

    .line 58
    check-cast v7, La/i1w0;

    .line 59
    .line 60
    iget-object v1, p0, La/gbi;->q:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v8, v1

    .line 63
    check-cast v8, La/duj;

    .line 64
    .line 65
    iget-object v1, p0, La/gbi;->r:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v9, v1

    .line 68
    check-cast v9, La/mne;

    .line 69
    .line 70
    iget-object p0, p0, La/gbi;->s:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v10, p0

    .line 73
    check-cast v10, La/ocl;

    .line 74
    .line 75
    move-object v1, p1

    .line 76
    invoke-direct/range {v0 .. v10}, La/m8k;-><init>(La/vzg0;ILa/toi0;La/yoi0;La/jvt;La/ctf0;La/i1w0;La/duj;La/mne;La/ocl;)V

    .line 77
    .line 78
    .line 79
    return-object v0
.end method
