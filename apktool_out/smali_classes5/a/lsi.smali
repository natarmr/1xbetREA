.class public final La/lsi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/giu0;


# instance fields
.field public final synthetic a:La/msi;


# direct methods
.method public constructor <init>(La/msi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lsi;->a:La/msi;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)La/diu0;
    .locals 14

    .line 1
    move-object v13, p1

    .line 2
    check-cast v13, La/i1w0;

    .line 3
    .line 4
    new-instance v0, La/mog0;

    .line 5
    .line 6
    iget-object p0, p0, La/lsi;->a:La/msi;

    .line 7
    .line 8
    iget-object p0, p0, La/msi;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/nsi;

    .line 11
    .line 12
    iget-object p1, p0, La/nsi;->a:La/gmg0;

    .line 13
    .line 14
    iget-object v1, p1, La/gmg0;->a:Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 15
    .line 16
    iget-boolean v2, p1, La/gmg0;->b:Z

    .line 17
    .line 18
    iget-object v3, p0, La/nsi;->b:La/nv20;

    .line 19
    .line 20
    iget-object p1, v3, La/nv20;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, La/h6i;

    .line 23
    .line 24
    invoke-virtual {p1}, La/h6i;->e()La/tzi;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v5, p0, La/nsi;->c:La/m1e;

    .line 29
    .line 30
    iget-object v6, p0, La/nsi;->d:La/g2v;

    .line 31
    .line 32
    iget-object v7, p0, La/nsi;->e:La/duj;

    .line 33
    .line 34
    new-instance v8, La/u58;

    .line 35
    .line 36
    iget-object p1, p0, La/nsi;->f:La/kt2;

    .line 37
    .line 38
    const/4 v9, 0x2

    .line 39
    invoke-direct {v8, p1, v9}, La/u58;-><init>(La/kt2;B)V

    .line 40
    .line 41
    .line 42
    new-instance v9, La/ag3;

    .line 43
    .line 44
    const/4 v10, 0x7

    .line 45
    invoke-direct {v9, p1, v10}, La/ag3;-><init>(La/kt2;B)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, La/nsi;->g:La/d1p;

    .line 49
    .line 50
    invoke-interface {p1}, La/d1p;->x()La/gg5;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-interface {p1}, La/d1p;->k0()La/au0;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    iget-object v12, p0, La/nsi;->h:La/mne;

    .line 59
    .line 60
    invoke-direct/range {v0 .. v13}, La/mog0;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;ZLa/nv20;La/tzi;La/m1e;La/g2v;La/duj;La/u58;La/ag3;La/gg5;La/au0;La/mne;La/i1w0;)V

    .line 61
    .line 62
    .line 63
    return-object v0
.end method
