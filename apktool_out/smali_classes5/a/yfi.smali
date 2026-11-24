.class public final La/yfi;
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
    iput-object p1, p0, La/yfi;->a:La/yei;

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
    new-instance v0, La/qd;

    .line 5
    .line 6
    iget-object p0, p0, La/yfi;->a:La/yei;

    .line 7
    .line 8
    iget-object p0, p0, La/yei;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/rrd;

    .line 11
    .line 12
    iget-object p1, p0, La/rrd;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, La/lef0;

    .line 15
    .line 16
    iget-object p1, p1, La/lef0;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, La/gbi;

    .line 19
    .line 20
    invoke-virtual {p1}, La/gbi;->n()La/joc;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object p1, p0, La/rrd;->c:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v3, p1

    .line 27
    check-cast v3, La/zn00;

    .line 28
    .line 29
    iget-object p1, p0, La/rrd;->d:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    check-cast v4, La/qgd;

    .line 33
    .line 34
    new-instance v5, La/jh70;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/rrd;->e:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v6, p1

    .line 42
    check-cast v6, La/otn;

    .line 43
    .line 44
    iget-object p1, p0, La/rrd;->f:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v7, p1

    .line 47
    check-cast v7, La/ctf0;

    .line 48
    .line 49
    iget-object p1, p0, La/rrd;->g:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v8, p1

    .line 52
    check-cast v8, La/m1e;

    .line 53
    .line 54
    iget-object p0, p0, La/rrd;->h:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, La/cad;

    .line 57
    .line 58
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/psc;

    .line 61
    .line 62
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-direct/range {v0 .. v9}, La/qd;-><init>(La/i1w0;La/joc;La/zn00;La/qgd;La/jh70;La/otn;La/ctf0;La/m1e;La/mne;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method
