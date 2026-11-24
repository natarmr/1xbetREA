.class public final La/xyi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/yxi;


# direct methods
.method public constructor <init>(La/yxi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xyi;->a:La/yxi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 10

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/i9u0;

    .line 5
    .line 6
    iget-object p0, p0, La/xyi;->a:La/yxi;

    .line 7
    .line 8
    iget-object p0, p0, La/yxi;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/yyi;

    .line 11
    .line 12
    iget-object p1, p0, La/yyi;->b:La/x860;

    .line 13
    .line 14
    iget v2, p1, La/x860;->a:I

    .line 15
    .line 16
    new-instance v3, La/u8u;

    .line 17
    .line 18
    new-instance p1, La/jru;

    .line 19
    .line 20
    new-instance v4, La/fht0;

    .line 21
    .line 22
    iget-object v5, p0, La/yyi;->c:La/vby;

    .line 23
    .line 24
    iget-object v6, p0, La/yyi;->d:La/btt0;

    .line 25
    .line 26
    iget-object v7, p0, La/yyi;->e:La/vwb0;

    .line 27
    .line 28
    new-instance v8, La/rkt0;

    .line 29
    .line 30
    iget-object v9, p0, La/yyi;->f:La/gii0;

    .line 31
    .line 32
    invoke-direct {v8, v9}, La/rkt0;-><init>(La/gii0;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v4, v5, v6, v7, v8}, La/fht0;-><init>(La/vby;La/btt0;La/vwb0;La/rkt0;)V

    .line 36
    .line 37
    .line 38
    const/16 v5, 0xc

    .line 39
    .line 40
    invoke-direct {p1, v4, v5}, La/jru;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    iget-object v4, p0, La/yyi;->g:La/pmi;

    .line 44
    .line 45
    const/16 v5, 0x12

    .line 46
    .line 47
    invoke-direct {v3, p1, v4, v5}, La/u8u;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    iget-object v4, p0, La/yyi;->h:La/bbw0;

    .line 51
    .line 52
    iget-object v5, p0, La/yyi;->i:La/ilp0;

    .line 53
    .line 54
    iget-object v6, p0, La/yyi;->j:La/mne;

    .line 55
    .line 56
    iget-object v7, p0, La/yyi;->k:La/sa10;

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, La/i9u0;-><init>(La/i1w0;ILa/u8u;La/bbw0;La/ilp0;La/mne;La/sa10;)V

    .line 59
    .line 60
    .line 61
    return-object v0
.end method
