.class public final La/abi;
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
    iput-object p1, p0, La/abi;->a:La/r5i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 14

    .line 1
    new-instance v0, La/at9;

    .line 2
    .line 3
    iget-object p0, p0, La/abi;->a:La/r5i;

    .line 4
    .line 5
    iget-object p0, p0, La/r5i;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/bbi;

    .line 8
    .line 9
    iget-object v1, p0, La/bbi;->l:Ljava/lang/Long;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    iget-object v4, p0, La/bbi;->d:La/ctf0;

    .line 16
    .line 17
    iget-object v3, p0, La/bbi;->b:La/cad;

    .line 18
    .line 19
    iget-object v3, v3, La/cad;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, La/psc;

    .line 22
    .line 23
    invoke-virtual {v3}, La/psc;->h()La/mne;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v6, La/a7q;

    .line 31
    .line 32
    iget-object v3, p0, La/bbi;->n:La/n5d0;

    .line 33
    .line 34
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, La/or9;

    .line 39
    .line 40
    invoke-direct {v6, v3}, La/a7q;-><init>(La/or9;)V

    .line 41
    .line 42
    .line 43
    new-instance v7, La/a1d;

    .line 44
    .line 45
    iget-object v3, p0, La/bbi;->n:La/n5d0;

    .line 46
    .line 47
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, La/or9;

    .line 52
    .line 53
    invoke-direct {v7, v3}, La/a1d;-><init>(La/or9;)V

    .line 54
    .line 55
    .line 56
    iget-object v8, p0, La/bbi;->e:La/m1e;

    .line 57
    .line 58
    iget-object v9, p0, La/bbi;->m:La/ocl;

    .line 59
    .line 60
    iget-object v10, p0, La/bbi;->g:La/duj;

    .line 61
    .line 62
    new-instance v11, La/ehf0;

    .line 63
    .line 64
    new-instance v3, La/ag3;

    .line 65
    .line 66
    iget-object v12, p0, La/bbi;->h:La/kt2;

    .line 67
    .line 68
    const/4 v13, 0x1

    .line 69
    invoke-direct {v3, v12, v13}, La/ag3;-><init>(La/kt2;B)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, La/bbi;->i:La/x20;

    .line 73
    .line 74
    const/16 v12, 0xe

    .line 75
    .line 76
    invoke-direct {v11, v3, p0, v12}, La/ehf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    move-object v3, p1

    .line 80
    invoke-direct/range {v0 .. v11}, La/at9;-><init>(JLa/vzg0;La/ctf0;La/mne;La/a7q;La/a1d;La/m1e;La/ocl;La/duj;La/ehf0;)V

    .line 81
    .line 82
    .line 83
    return-object v0
.end method
