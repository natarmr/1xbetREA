.class public final La/lji;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/tii;


# direct methods
.method public constructor <init>(La/tii;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lji;->a:La/tii;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 9

    .line 1
    new-instance v0, La/ygc;

    .line 2
    .line 3
    iget-object p0, p0, La/lji;->a:La/tii;

    .line 4
    .line 5
    iget-object p0, p0, La/tii;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/mji;

    .line 8
    .line 9
    iget-object v1, p0, La/mji;->a:La/iw20;

    .line 10
    .line 11
    iget-object v1, v1, La/iw20;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/uii;

    .line 14
    .line 15
    move-object v2, v1

    .line 16
    new-instance v1, La/noc;

    .line 17
    .line 18
    iget-object v2, v2, La/uii;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, La/vff0;

    .line 21
    .line 22
    const/4 v3, 0x3

    .line 23
    invoke-direct {v1, v2, v3}, La/noc;-><init>(La/vff0;B)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, La/mji;->b:La/wgu;

    .line 27
    .line 28
    new-instance v3, La/f4u;

    .line 29
    .line 30
    iget-object v4, p0, La/mji;->a:La/iw20;

    .line 31
    .line 32
    iget-object v4, v4, La/iw20;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, La/uii;

    .line 35
    .line 36
    invoke-virtual {v4}, La/uii;->o()La/u8u;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/16 v5, 0xf

    .line 41
    .line 42
    invoke-direct {v3, v4, v5}, La/f4u;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, La/mji;->c:La/nv20;

    .line 46
    .line 47
    iget-object v5, p0, La/mji;->d:La/cad;

    .line 48
    .line 49
    iget-object v5, v5, La/cad;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, La/psc;

    .line 52
    .line 53
    invoke-virtual {v5}, La/psc;->h()La/mne;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v6, p0, La/mji;->e:La/iqt;

    .line 61
    .line 62
    iget-object v7, p0, La/mji;->f:La/ctf0;

    .line 63
    .line 64
    move-object v8, p1

    .line 65
    invoke-direct/range {v0 .. v8}, La/ygc;-><init>(La/noc;La/wgu;La/f4u;La/nv20;La/mne;La/iqt;La/ctf0;La/vzg0;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method
