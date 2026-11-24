.class public final La/xdi;
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
    iput-object p1, p0, La/xdi;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/j7g;

    .line 2
    .line 3
    iget-object p0, p0, La/xdi;->a:La/uci;

    .line 4
    .line 5
    iget-object p0, p0, La/uci;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/qgd;

    .line 8
    .line 9
    new-instance v2, La/a2u;

    .line 10
    .line 11
    iget-object v1, p0, La/qgd;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/ul9;

    .line 14
    .line 15
    invoke-direct {v2, v1}, La/a2u;-><init>(La/ul9;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, La/a7q;

    .line 19
    .line 20
    invoke-direct {v3, v1}, La/a7q;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, La/a2u;

    .line 24
    .line 25
    invoke-direct {v4, v1}, La/a2u;-><init>(La/ul9;)V

    .line 26
    .line 27
    .line 28
    new-instance v5, La/h3c;

    .line 29
    .line 30
    iget-object v1, p0, La/qgd;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, La/sjl0;

    .line 33
    .line 34
    const/4 v6, 0x1

    .line 35
    invoke-direct {v5, v1, v6}, La/h3c;-><init>(La/sjl0;B)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/qgd;->d:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v6, v1

    .line 41
    check-cast v6, La/g2v;

    .line 42
    .line 43
    iget-object v1, p0, La/qgd;->e:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v7, v1

    .line 46
    check-cast v7, La/mne;

    .line 47
    .line 48
    iget-object v1, p0, La/qgd;->f:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v8, v1

    .line 51
    check-cast v8, La/ctf0;

    .line 52
    .line 53
    iget-object p0, p0, La/qgd;->g:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v9, p0

    .line 56
    check-cast v9, La/duj;

    .line 57
    .line 58
    move-object v1, p1

    .line 59
    invoke-direct/range {v0 .. v9}, La/j7g;-><init>(La/vzg0;La/a2u;La/a7q;La/a2u;La/h3c;La/g2v;La/mne;La/ctf0;La/duj;)V

    .line 60
    .line 61
    .line 62
    return-object v0
.end method
