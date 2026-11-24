.class public final La/x8i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x8i;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 10

    .line 1
    new-instance v0, La/q54;

    .line 2
    .line 3
    iget-object p0, p0, La/x8i;->a:La/n8i;

    .line 4
    .line 5
    iget-object p0, p0, La/n8i;->b:Ljava/lang/Object;

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
    check-cast v2, La/i1w0;

    .line 13
    .line 14
    new-instance v3, La/mzt;

    .line 15
    .line 16
    iget-object v1, p0, La/g45;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, La/peg0;

    .line 19
    .line 20
    invoke-direct {v3, v1}, La/mzt;-><init>(La/peg0;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, La/g45;->c:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v4, v1

    .line 26
    check-cast v4, La/s9m0;

    .line 27
    .line 28
    iget-object v1, p0, La/g45;->d:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v5, v1

    .line 31
    check-cast v5, La/dpc;

    .line 32
    .line 33
    iget-object v1, p0, La/g45;->e:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v6, v1

    .line 36
    check-cast v6, La/pru;

    .line 37
    .line 38
    new-instance v7, La/bzt;

    .line 39
    .line 40
    iget-object v1, p0, La/g45;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, La/fsd;

    .line 43
    .line 44
    invoke-direct {v7, v1}, La/bzt;-><init>(La/fsd;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, La/g45;->g:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v8, v1

    .line 50
    check-cast v8, Lorg/xplatform/core/navigation/authorization/model/AuthType;

    .line 51
    .line 52
    iget-object p0, p0, La/g45;->h:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/cad;

    .line 55
    .line 56
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/psc;

    .line 59
    .line 60
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v1, p1

    .line 68
    invoke-direct/range {v0 .. v9}, La/q54;-><init>(La/vzg0;La/i1w0;La/mzt;La/s9m0;La/dpc;La/pru;La/bzt;Lorg/xplatform/core/navigation/authorization/model/AuthType;La/mne;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method
