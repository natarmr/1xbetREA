.class public final La/fdi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


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
    iput-object p1, p0, La/fdi;->a:La/dci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 9

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/c6e;

    .line 5
    .line 6
    iget-object p0, p0, La/fdi;->a:La/dci;

    .line 7
    .line 8
    iget-object p0, p0, La/dci;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/f6i;

    .line 11
    .line 12
    iget-object p1, p0, La/f6i;->q:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, La/peg0;

    .line 15
    .line 16
    iget-object p1, p1, La/peg0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, La/m73;

    .line 19
    .line 20
    invoke-virtual {p1}, La/m73;->b()La/vqc;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, La/kj5;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/f6i;->r:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    check-cast v4, La/aqt;

    .line 33
    .line 34
    iget-object p1, p0, La/f6i;->u:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, La/iw20;

    .line 37
    .line 38
    iget-object p1, p1, La/iw20;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, La/uii;

    .line 41
    .line 42
    invoke-virtual {p1}, La/uii;->r()La/pru;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v6, La/is;

    .line 47
    .line 48
    iget-object p1, p0, La/f6i;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, La/g45;

    .line 51
    .line 52
    invoke-direct {v6, p1}, La/is;-><init>(La/g45;)V

    .line 53
    .line 54
    .line 55
    new-instance v7, La/h03;

    .line 56
    .line 57
    new-instance v8, La/is;

    .line 58
    .line 59
    invoke-direct {v8, p1}, La/is;-><init>(La/g45;)V

    .line 60
    .line 61
    .line 62
    const/16 p1, 0x15

    .line 63
    .line 64
    invoke-direct {v7, v8, p1}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/f6i;->b:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v8, p0

    .line 70
    check-cast v8, La/mne;

    .line 71
    .line 72
    invoke-direct/range {v0 .. v8}, La/c6e;-><init>(La/i1w0;La/vqc;La/kj5;La/aqt;La/pru;La/is;La/h03;La/mne;)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method
