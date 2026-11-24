.class public final La/aai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/r5i;


# direct methods
.method public constructor <init>(La/r5i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/aai;->a:La/r5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/kf7;

    .line 2
    .line 3
    iget-object p0, p0, La/aai;->a:La/r5i;

    .line 4
    .line 5
    iget-object p0, p0, La/r5i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/h6i;

    .line 8
    .line 9
    iget-object v1, p0, La/h6i;->d:Ljava/lang/Object;

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
    iget-object v1, p0, La/h6i;->n:Ljava/lang/Object;

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
    check-cast v3, La/jni0;

    .line 27
    .line 28
    iget-object v1, p0, La/h6i;->o:Ljava/lang/Object;

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
    check-cast v4, La/jvt;

    .line 38
    .line 39
    iget-object v1, p0, La/h6i;->a:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v5, v1

    .line 42
    check-cast v5, La/ctf0;

    .line 43
    .line 44
    iget-object v1, p0, La/h6i;->j:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v6, v1

    .line 47
    check-cast v6, La/i1w0;

    .line 48
    .line 49
    iget-object v1, p0, La/h6i;->k:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v7, v1

    .line 52
    check-cast v7, La/duj;

    .line 53
    .line 54
    iget-object v1, p0, La/h6i;->b:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v8, v1

    .line 57
    check-cast v8, La/mne;

    .line 58
    .line 59
    iget-object p0, p0, La/h6i;->l:Ljava/lang/Object;

    .line 60
    .line 61
    move-object v9, p0

    .line 62
    check-cast v9, La/ocl;

    .line 63
    .line 64
    move-object v1, p1

    .line 65
    invoke-direct/range {v0 .. v9}, La/kf7;-><init>(La/vzg0;ILa/jni0;La/jvt;La/ctf0;La/i1w0;La/duj;La/mne;La/ocl;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method
