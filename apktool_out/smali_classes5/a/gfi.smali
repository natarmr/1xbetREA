.class public final La/gfi;
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
    iput-object p1, p0, La/gfi;->a:La/yei;

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
    new-instance v0, La/pak;

    .line 4
    .line 5
    iget-object p0, p0, La/gfi;->a:La/yei;

    .line 6
    .line 7
    iget-object p0, p0, La/yei;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/rrd;

    .line 10
    .line 11
    new-instance v1, La/ani0;

    .line 12
    .line 13
    new-instance v2, La/pmi;

    .line 14
    .line 15
    new-instance v3, La/wti;

    .line 16
    .line 17
    iget-object v4, p0, La/rrd;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v4, La/gii0;

    .line 20
    .line 21
    const/16 v5, 0xf

    .line 22
    .line 23
    invoke-direct {v3, v4, v5}, La/wti;-><init>(La/gii0;B)V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, La/rrd;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, La/xio;

    .line 29
    .line 30
    iget-object v5, p0, La/rrd;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v5, La/btt0;

    .line 33
    .line 34
    iget-object v6, p0, La/rrd;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v6, La/knf0;

    .line 37
    .line 38
    invoke-direct {v2, v3, v4, v5, v6}, La/pmi;-><init>(La/wti;La/xio;La/btt0;La/knf0;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2}, La/ani0;-><init>(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, La/ljf0;

    .line 45
    .line 46
    new-instance v3, La/pzu;

    .line 47
    .line 48
    new-instance v4, La/abu;

    .line 49
    .line 50
    iget-object v5, p0, La/rrd;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v5, La/gii0;

    .line 53
    .line 54
    const/16 v6, 0x19

    .line 55
    .line 56
    invoke-direct {v4, v5, v6}, La/abu;-><init>(La/gii0;B)V

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, La/rrd;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, La/dzz;

    .line 62
    .line 63
    iget-object v6, p0, La/rrd;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v6, La/xio;

    .line 66
    .line 67
    iget-object v7, p0, La/rrd;->g:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, La/czz;

    .line 70
    .line 71
    iget-object v8, p0, La/rrd;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v8, La/btt0;

    .line 74
    .line 75
    iget-object v9, p0, La/rrd;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, La/knf0;

    .line 78
    .line 79
    invoke-direct/range {v3 .. v9}, La/pzu;-><init>(La/abu;La/dzz;La/xio;La/czz;La/btt0;La/knf0;)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, v3}, La/ljf0;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iget-object p0, p0, La/rrd;->h:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, La/duj;

    .line 88
    .line 89
    invoke-direct {v0, p1, v1, v2, p0}, La/pak;-><init>(La/i1w0;La/ani0;La/ljf0;La/duj;)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method
