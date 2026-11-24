.class public final La/uri;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/fri;


# direct methods
.method public constructor <init>(La/fri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/uri;->a:La/fri;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/gjf0;

    .line 2
    .line 3
    iget-object p0, p0, La/uri;->a:La/fri;

    .line 4
    .line 5
    iget-object p0, p0, La/fri;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/vri;

    .line 8
    .line 9
    iget-object v1, p0, La/vri;->a:La/qgd;

    .line 10
    .line 11
    iget-object v1, v1, La/qgd;->h:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, La/usd;

    .line 15
    .line 16
    iget-object v1, p0, La/vri;->b:La/lef0;

    .line 17
    .line 18
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/gbi;

    .line 21
    .line 22
    new-instance v3, La/zn00;

    .line 23
    .line 24
    new-instance v4, La/nvu;

    .line 25
    .line 26
    new-instance v5, La/ani0;

    .line 27
    .line 28
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v6, La/drm0;

    .line 32
    .line 33
    iget-object v7, v1, La/gbi;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v7, La/gii0;

    .line 36
    .line 37
    const/4 v8, 0x7

    .line 38
    invoke-direct {v6, v7, v8}, La/drm0;-><init>(La/gii0;B)V

    .line 39
    .line 40
    .line 41
    iget-object v7, v1, La/gbi;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, La/btt0;

    .line 44
    .line 45
    invoke-direct {v4, v5, v6, v7}, La/nvu;-><init>(La/ani0;La/drm0;La/btt0;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, La/gbi;->s:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, La/b3c0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v4, v3, La/zn00;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v1, v3, La/zn00;->b:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v1, p0, La/vri;->a:La/qgd;

    .line 63
    .line 64
    iget-object v4, v1, La/qgd;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, La/mne;

    .line 67
    .line 68
    iget-object v5, v1, La/qgd;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v5, La/duj;

    .line 71
    .line 72
    iget-object v6, v1, La/qgd;->g:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v6, La/ctf0;

    .line 75
    .line 76
    invoke-static {v6}, La/x1x;->y(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v7, p0, La/vri;->c:La/i1w0;

    .line 80
    .line 81
    iget-object v1, v1, La/qgd;->d:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v8, v1

    .line 84
    check-cast v8, La/m1e;

    .line 85
    .line 86
    invoke-static {v8}, La/x1x;->y(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, La/vri;->d:Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    move-object v1, p1

    .line 96
    invoke-direct/range {v0 .. v9}, La/gjf0;-><init>(La/vzg0;La/usd;La/zn00;La/mne;La/duj;La/ctf0;La/i1w0;La/m1e;Z)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method
