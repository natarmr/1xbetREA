.class public final La/xai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/pai;


# direct methods
.method public constructor <init>(La/pai;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xai;->a:La/pai;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/g9g;

    .line 2
    .line 3
    iget-object p0, p0, La/xai;->a:La/pai;

    .line 4
    .line 5
    iget-object p0, p0, La/pai;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/qgd;

    .line 8
    .line 9
    iget-object v1, p0, La/qgd;->b:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v2, v1

    .line 12
    check-cast v2, La/yag;

    .line 13
    .line 14
    iget-object v1, p0, La/qgd;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    new-instance v4, La/y1u;

    .line 23
    .line 24
    iget-object v1, p0, La/qgd;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, La/ul9;

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v4, v1, v5}, La/y1u;-><init>(La/ul9;B)V

    .line 30
    .line 31
    .line 32
    new-instance v5, La/z1u;

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-direct {v5, v1, v6}, La/z1u;-><init>(La/ul9;B)V

    .line 36
    .line 37
    .line 38
    new-instance v6, La/a7q;

    .line 39
    .line 40
    invoke-direct {v6, v1}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, La/qgd;->e:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v7, v1

    .line 46
    check-cast v7, La/g2v;

    .line 47
    .line 48
    iget-object v1, p0, La/qgd;->f:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v8, v1

    .line 51
    check-cast v8, La/duj;

    .line 52
    .line 53
    iget-object p0, p0, La/qgd;->g:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, La/cad;

    .line 56
    .line 57
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/psc;

    .line 60
    .line 61
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v1, p1

    .line 69
    invoke-direct/range {v0 .. v9}, La/g9g;-><init>(La/vzg0;La/yag;ZLa/y1u;La/z1u;La/a7q;La/g2v;La/duj;La/mne;)V

    .line 70
    .line 71
    .line 72
    return-object v0
.end method
