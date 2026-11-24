.class public final La/aei;
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
    iput-object p1, p0, La/aei;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 7

    .line 1
    new-instance v0, La/k8g;

    .line 2
    .line 3
    iget-object p0, p0, La/aei;->a:La/uci;

    .line 4
    .line 5
    iget-object p0, p0, La/uci;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/nhf0;

    .line 8
    .line 9
    new-instance v2, La/uoc;

    .line 10
    .line 11
    iget-object v1, p0, La/nhf0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/ul9;

    .line 14
    .line 15
    invoke-direct {v2, v1}, La/uoc;-><init>(La/ul9;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, La/y1u;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-direct {v3, v1, v4}, La/y1u;-><init>(La/ul9;B)V

    .line 22
    .line 23
    .line 24
    new-instance v4, La/z1u;

    .line 25
    .line 26
    iget-object v1, p0, La/nhf0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, La/ul9;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-direct {v4, v1, v5}, La/z1u;-><init>(La/ul9;B)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, La/nhf0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, La/cad;

    .line 37
    .line 38
    iget-object v1, v1, La/cad;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/psc;

    .line 41
    .line 42
    invoke-virtual {v1}, La/psc;->h()La/mne;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, p0, La/nhf0;->c:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v6, p0

    .line 52
    check-cast v6, La/duj;

    .line 53
    .line 54
    move-object v1, p1

    .line 55
    invoke-direct/range {v0 .. v6}, La/k8g;-><init>(La/vzg0;La/uoc;La/y1u;La/z1u;La/mne;La/duj;)V

    .line 56
    .line 57
    .line 58
    return-object v0
.end method
