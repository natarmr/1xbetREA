.class public final La/wdi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/uci;


# direct methods
.method public constructor <init>(La/uci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wdi;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 12

    .line 1
    new-instance v0, La/h6g;

    .line 2
    .line 3
    iget-object p0, p0, La/wdi;->a:La/uci;

    .line 4
    .line 5
    iget-object p0, p0, La/uci;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/g45;

    .line 8
    .line 9
    iget-object v1, p0, La/g45;->a:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 13
    .line 14
    new-instance v3, La/fhj;

    .line 15
    .line 16
    new-instance v1, La/z1u;

    .line 17
    .line 18
    iget-object v4, p0, La/g45;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, La/ul9;

    .line 21
    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-direct {v1, v4, v5}, La/z1u;-><init>(La/ul9;B)V

    .line 24
    .line 25
    .line 26
    new-instance v6, La/uyn;

    .line 27
    .line 28
    invoke-direct {v6, v4}, La/uyn;-><init>(La/ul9;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v3, v1, v6}, La/fhj;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v4, La/b3u;

    .line 35
    .line 36
    iget-object v1, p0, La/g45;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/sjl0;

    .line 39
    .line 40
    invoke-direct {v4, v1, v5}, La/b3u;-><init>(La/sjl0;B)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, La/g45;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, La/iip;

    .line 46
    .line 47
    invoke-interface {v1}, La/iip;->V()La/j3c;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v6, La/y1u;

    .line 55
    .line 56
    iget-object v7, p0, La/g45;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, La/ul9;

    .line 59
    .line 60
    invoke-direct {v6, v7, v5}, La/y1u;-><init>(La/ul9;B)V

    .line 61
    .line 62
    .line 63
    move-object v5, v7

    .line 64
    new-instance v7, La/z1u;

    .line 65
    .line 66
    const/4 v8, 0x1

    .line 67
    invoke-direct {v7, v5, v8}, La/z1u;-><init>(La/ul9;B)V

    .line 68
    .line 69
    .line 70
    iget-object v5, p0, La/g45;->e:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v8, v5

    .line 73
    check-cast v8, La/g2v;

    .line 74
    .line 75
    iget-object v5, p0, La/g45;->f:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v5, La/cad;

    .line 78
    .line 79
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, La/psc;

    .line 82
    .line 83
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, p0, La/g45;->g:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v10, v5

    .line 93
    check-cast v10, La/duj;

    .line 94
    .line 95
    iget-object p0, p0, La/g45;->h:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v11, p0

    .line 98
    check-cast v11, La/ctf0;

    .line 99
    .line 100
    move-object v5, v1

    .line 101
    move-object v1, p1

    .line 102
    invoke-direct/range {v0 .. v11}, La/h6g;-><init>(La/vzg0;Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;La/fhj;La/b3u;La/j3c;La/y1u;La/z1u;La/g2v;La/mne;La/duj;La/ctf0;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method
