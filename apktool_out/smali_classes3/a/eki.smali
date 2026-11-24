.class public final La/eki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/rii;


# direct methods
.method public constructor <init>(La/rii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eki;->a:La/rii;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/e910;

    .line 5
    .line 6
    iget-object p0, p0, La/eki;->a:La/rii;

    .line 7
    .line 8
    iget-object p0, p0, La/rii;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/fki;

    .line 11
    .line 12
    new-instance v1, La/zx10;

    .line 13
    .line 14
    invoke-virtual {p0}, La/fki;->a()La/dgu;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {v1, p1}, La/zx10;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/x4u;

    .line 22
    .line 23
    invoke-virtual {p0}, La/fki;->a()La/dgu;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v2, p1}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/wsf0;

    .line 31
    .line 32
    iget-object p1, p0, La/fki;->b:La/tnc0;

    .line 33
    .line 34
    invoke-direct {v3, p1}, La/wsf0;-><init>(La/tnc0;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, La/sqt;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/fki;->a:La/g8i;

    .line 43
    .line 44
    invoke-virtual {p0}, La/g8i;->v1()La/mne;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p0}, La/g8i;->d2()La/duj;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    new-instance v8, La/ljf0;

    .line 53
    .line 54
    invoke-direct {v8, p1}, La/ljf0;-><init>(La/tnc0;)V

    .line 55
    .line 56
    .line 57
    new-instance v9, La/tpx;

    .line 58
    .line 59
    const/4 p0, 0x1

    .line 60
    invoke-direct {v9, p1, p0}, La/tpx;-><init>(La/tnc0;B)V

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v0 .. v9}, La/e910;-><init>(La/zx10;La/x4u;La/wsf0;La/sqt;La/mne;La/duj;La/i1w0;La/ljf0;La/tpx;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method
